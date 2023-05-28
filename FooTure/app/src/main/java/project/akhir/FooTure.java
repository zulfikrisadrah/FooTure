package project.akhir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

abstract class Pesanan{
    abstract void tambahPesanan();
    abstract void kurangPesanan();
}

class ProdukDipesan extends Pesanan{
    Produk produk;
    int kuantitas;

    public Produk getProduk() {
        return produk;
    }
    public void setProduk(Produk produk) {
        this.produk = produk;
    }
    public int getKuantitas() {
        return kuantitas;
    }
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }
    
    @Override
    void tambahPesanan(){
        kuantitas = kuantitas + 1;
    };

    @Override
    void kurangPesanan(){
        kuantitas = kuantitas - 1;
    };

}

class Produk{
    int id;
    String nama;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Diskon{
    int persen;
    String kodePromo;
    public int getPersen() {
        return persen;
    }
    public void setPersen(int persen) {
        this.persen = persen;
    }
    public String getKodePromo() {
        return kodePromo;
    }
    public void setKodePromo(String kodePromo) {
        this.kodePromo = kodePromo;
    }
}

public class FooTure extends Application {
    private Stage primaryStage;

    DropShadow dropShadow = new DropShadow();
    BackgroundFill backgroundFill = new BackgroundFill(Color.BLACK, new CornerRadii(5), null);
    Background background = new Background(backgroundFill);

    BackgroundFill backgroundFill2 = new BackgroundFill(Color.BLACK, null, null);
    Background background2 = new Background(backgroundFill);

    List<Produk> listProduk = new ArrayList<>();   
    List<ProdukDipesan> listProdukDipesan = new ArrayList<>();   
    HashMap<Integer, Integer> hargaProduk = new HashMap<>(); 

    int hasilAkhir = 0;

    void initProduk(){
        Produk produk1 = new Produk();
        produk1.setId(1);
        produk1.setNama("Menu 1");

        Produk produk2 = new Produk();
        produk2.setId(2);
        produk2.setNama("Menu 2");

        Produk produk3 = new Produk();
        produk3.setId(3);
        produk3.setNama("Menu 3");

        Produk produk4 = new Produk();
        produk4.setId(4);
        produk4.setNama("Menu 4");

        listProduk.add(produk1);
        listProduk.add(produk2);
        listProduk.add(produk3);
        listProduk.add(produk4);

        hargaProduk.put(produk1.id, 10000);
        hargaProduk.put(produk2.id, 15000);
        hargaProduk.put(produk3.id, 15000);
        hargaProduk.put(produk4.id, 20000);
    };

    void initPesanan(){
        for (Produk produk: listProduk) {
            ProdukDipesan produkDipesan = new ProdukDipesan();
            produkDipesan.setProduk(produk);
            produkDipesan.setKuantitas(0);
            listProdukDipesan.add(produkDipesan);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        
        if (listProdukDipesan.size() == 0) {
            initProduk();
            initPesanan();
        }

        Label label = new Label("Nama Restaurant");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(50);
        label.setPrefWidth(250);
        label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        Image logoImage = new Image("C:\\Users\\Fikri\\Desktop\\PRAKTIKUM SEMESTER 2\\Praktikum\\Pertemuan 9\\app\\src\\main\\resources\\images-removebg-preview.png");
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(90);
        logoImageView.setFitHeight(100);

        Button startButton = new Button("PESAN SEKARANG");
        startButton.setPrefWidth(200);
        startButton.setPrefHeight(50);
        startButton.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

        startButton.setOnAction(event -> {
            showMenu();
        });

        label.setEffect(dropShadow);
        startButton.setEffect(dropShadow);
        label.setBackground(background);
        startButton.setBackground(background);

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, logoImageView, startButton);

        Scene scene1 = new Scene(root, 600, 500);
        primaryStage.setTitle("FooTure");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private void showMenu() {
        Label label1 = new Label("Daftar Menu");
        label1.setAlignment(Pos.CENTER);
        label1.setPrefHeight(50);
        label1.setPrefWidth(250);
        label1.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        VBox root = new VBox(20);
        root.setAlignment(Pos.TOP_LEFT);
        root.getChildren().add(label1);
        
        Button confirmButton = new Button("CONFIRM");
        confirmButton.setPrefWidth(160);  
        confirmButton.setPrefHeight(40);  
        confirmButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");
        confirmButton.setDisable(true);

        if (listProdukDipesan.size() > 0){
            confirmButton.setOnAction(e -> {
                Stage detailPesananScene = new Stage();
                Scene scene2 = detailPesananScene();
                detailPesananScene.setScene(scene2);
                detailPesananScene.setTitle("FooTure Detail");
                detailPesananScene.show();
            });
        } 

        for (ProdukDipesan produkDipesan : listProdukDipesan) {
            Label menu = new Label("  " + produkDipesan.getProduk().getNama() + "\t\t| " + hargaProduk.get(produkDipesan.getProduk().getId())/1000 + "K");
            menu.setAlignment(Pos.CENTER);
            menu.setPrefHeight(50);
            menu.setPrefWidth(250);
            menu.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
    
            Button kurang = new Button("-");
            kurang.setAlignment(Pos.CENTER);
            kurang.setPrefHeight(50);
            kurang.setPrefWidth(50);
            kurang.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
           
            Label input = new Label("0");
            input.setId(String.valueOf(produkDipesan.getProduk().getId()));
            input.setAlignment(Pos.CENTER);
            input.setPrefWidth(100);
            input.setPrefHeight(50);
            input.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
            
            kurang.setOnAction(e ->{
                int jumlahPesanan = Integer.parseInt(input.getText());
                if (jumlahPesanan > 0){
                    input.setText(String.valueOf(jumlahPesanan-1));
                    produkDipesan.kurangPesanan();              
                }
                
                boolean adaKuantitas = false;
                for (ProdukDipesan produkDipesan1 : listProdukDipesan) {
                    if (produkDipesan1.getKuantitas() > 0) adaKuantitas = true;    
                }
                if (!adaKuantitas) {
                    confirmButton.setDisable(true);
                }
            });
            
            Button tambah = new Button("+");
            tambah.setAlignment(Pos.CENTER);
            tambah.setPrefHeight(50);
            tambah.setPrefWidth(50);
           
            tambah.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
            tambah.setOnAction(e ->{
                int jumlahPesanan = Integer.parseInt(input.getText());
                input.setText(String.valueOf(jumlahPesanan + 1));
                produkDipesan.tambahPesanan();

                boolean adaKuantitas = false;
                for (ProdukDipesan produkDipesan1 : listProdukDipesan) {
                    if (produkDipesan1.getKuantitas() > 0) adaKuantitas = true;
                    if (adaKuantitas) {
                        confirmButton.setDisable(false);
                        break;
                    }
                }
            });
            
            menu.setBackground(background2); kurang.setBackground(background2); input.setBackground(background2); tambah.setBackground(background2);

            HBox baris = new HBox(3);
            baris.getChildren().addAll(menu, kurang, input, tambah);
            root.getChildren().add(baris);
        }

        Button backButton = new Button("BACK");
        backButton.setPrefWidth(100);  
        backButton.setPrefHeight(40);  
        backButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        backButton.setOnAction(e -> {
            start(primaryStage);
        });
        
        Button clearButton = new Button("CLEAR");
        clearButton.setPrefWidth(160);
        clearButton.setPrefHeight(40);
        clearButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");
        clearButton.setOnAction(event -> {
            for (ProdukDipesan produkDipesan : listProdukDipesan) {
                Node node = root.lookup("#" + produkDipesan.getProduk().getId());
                if (node instanceof Label) {
                    Label input = (Label) node;
                    input.setText("0");
                    produkDipesan.setKuantitas(0);
                    confirmButton.setDisable(true);
                }
            }
        });

        label1.setBackground(background2);
        backButton.setBackground(background2);         
        clearButton.setBackground(background2);
        confirmButton.setBackground(background2);

        HBox menuButton = new HBox(20);
        menuButton.getChildren().addAll(backButton, clearButton, confirmButton);
        root.getChildren().add(menuButton);

        Scene scene2 = new Scene(root, 600, 500);

        primaryStage.setScene(scene2);
    }

    private Scene detailPesananScene() {
        Label label = new Label("Detail Pesanan");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(300);
        label.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
        VBox root = new VBox(5);
        root.setAlignment(Pos.TOP_LEFT);
        root.getChildren().add(label);

        int totalHarga = 0;
        for (ProdukDipesan produkDipesan : listProdukDipesan){
            int hargaMenu = hargaProduk.get(produkDipesan.produk.getId());
            int jumlahMenu = produkDipesan.getKuantitas();
            if (jumlahMenu > 0) {
                int totalHargaMenu = hargaMenu * jumlahMenu;
                totalHarga += totalHargaMenu;
                hasilAkhir = totalHarga;

                Label detail = detailLabel(jumlahMenu, produkDipesan.getProduk().getNama(), totalHargaMenu);
                detail.setId("detail_" + produkDipesan.produk.getId());
                detail.setAlignment(Pos.CENTER);
                detail.setPrefHeight(30);
                detail.setPrefWidth(300);
                detail.setBackground(background);
                detail.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
                root.getChildren().add(detail);
            }
        }
               
        Label total = new Label(" Total \t\t| Rp" + String.valueOf(totalHarga));
        total.setAlignment(Pos.CENTER);
        total.setPrefHeight(40);
        total.setPrefWidth(300);
        total.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

        Button closeButton = new Button("Batal");
        closeButton.setPrefWidth(60);
        closeButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
        closeButton.setOnAction(event -> {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        });

        Button promoButton = new Button("Promo");
        promoButton.setPrefWidth(100);
        promoButton.setPrefHeight(30);
        promoButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        int totalHargaAkhir = totalHarga;
        promoButton.setOnAction(event -> {
            Stage promoScene = new Stage();
            Scene scene3 = promoScene(totalHargaAkhir, total);
            promoScene.setScene(scene3);
            promoScene.setTitle("Promo");
            promoScene.show();
        });

        Button bayarButton = new Button("BAYAR");
        bayarButton.setPrefWidth(100);
        bayarButton.setPrefHeight(30);
        bayarButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
        bayarButton.setOnAction(event -> {
            Stage bayarScene = new Stage();
            Scene scene4 = bayarScene(hasilAkhir);
            bayarScene.setScene(scene4);
            bayarScene.setTitle("Pembayaran");
            bayarScene.show();
        });
        
        HBox menu = new HBox (20);
        menu.getChildren().addAll(closeButton, promoButton, bayarButton);

        root.getChildren().add(total);
        root.getChildren().add(menu);
        label.setBackground(background2); closeButton.setBackground(background2); promoButton.setBackground(background2); total.setBackground(background2); bayarButton.setBackground(background2);

        return new Scene(root, 400, 350);
    }

    private Label detailLabel(int jumlahMenu, String namaMenu, int hargaMenu) {
        Label detail = new Label(jumlahMenu + "x\t" + namaMenu +"\t| Rp" + hargaMenu);
        detail.setAlignment(Pos.CENTER);
        detail.setPrefHeight(30);
        detail.setPrefWidth(300);
        detail.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        return detail;
    }

    private Scene promoScene(int jumlah, Label total){
        Diskon diskon = new Diskon();
        diskon.setPersen(10);
        diskon.setKodePromo("PROMO");

        Label label = new Label("Masukkan Kode Promo");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(200);
        label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        TextField inputCode = new TextField();
        inputCode.setAlignment(Pos.CENTER);
        inputCode.setMaxWidth(120);
        inputCode.setMaxHeight(40);
        inputCode.setStyle("-fx-font-size: 15px; -fx-text-fill: black;");
        
        Button okButton = new Button("OK");
        okButton.setAlignment(Pos.CENTER);
        okButton.setPrefHeight(40);
        okButton.setPrefWidth(40);
        okButton.setStyle("-fx-font-size: 10px; -fx-text-fill: white;");
        okButton.setOnAction(event -> {
            String userInput = inputCode.getText();
            if (userInput.equals(diskon.getKodePromo())){
                int hargaDiskon = jumlah * diskon.getPersen();
                hasilAkhir = jumlah - hargaDiskon/100;
                total.setText(" Total \t\t| Rp" + String.valueOf(hasilAkhir));
                Stage stage = (Stage) okButton.getScene().getWindow();
                stage.close();
                Stage promoBerhasilScene = new Stage();
                Scene scene4 = promoBerhasilScene(jumlah, diskon);
                promoBerhasilScene.setScene(scene4);
                promoBerhasilScene.setTitle("Promo");
                promoBerhasilScene.show();
            }     
        });
        
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(inputCode, okButton);

        VBox root = new VBox(20);
        root.getChildren().addAll(label, hbox);
        root.setAlignment(Pos.CENTER);

        label.setBackground(background); okButton.setBackground(background);
        return new Scene(root, 200, 100);
    }

        private Scene bayarScene(int hasilAkhir){
            Label label = new Label("Masukkan Nominal Pembayaran");
            label.setAlignment(Pos.CENTER);
            label.setPrefHeight(30);
            label.setPrefWidth(300);
            label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
    
            TextField inputPembayaran = new TextField();
            inputPembayaran.setAlignment(Pos.CENTER);
            inputPembayaran.setMaxWidth(120);
            inputPembayaran.setMaxHeight(40);
            inputPembayaran.setStyle("-fx-font-size: 15px; -fx-text-fill: black;");
            
            Button okButton = new Button("OK");
            okButton.setAlignment(Pos.CENTER);
            okButton.setPrefHeight(40);
            okButton.setPrefWidth(40);
            okButton.setStyle("-fx-font-size: 10px; -fx-text-fill: white;");
            okButton.setOnAction(event -> {
                int userInput = Integer.parseInt(inputPembayaran.getText());
                if (userInput >= hasilAkhir){
                    Stage stage = (Stage) okButton.getScene().getWindow();
                    stage.close();
                    Stage bayarBerhasilScene = new Stage();
                    Scene scene5 = bayarBerhasilScene();
                    bayarBerhasilScene.setScene(scene5);
                    bayarBerhasilScene.setTitle("Selesai");
                    bayarBerhasilScene.show();

                } else {
                    Stage stage = (Stage) okButton.getScene().getWindow();
                    stage.close();
                    Stage bayarGagalScene = new Stage();
                    Scene scene6 = bayarGagalScene();
                    bayarGagalScene.setScene(scene6);
                    bayarGagalScene.setTitle("Gagal");
                    bayarGagalScene.show();
                }
            });

        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(inputPembayaran, okButton);

        VBox root = new VBox(20);
        root.getChildren().addAll(label, hbox);
        root.setAlignment(Pos.CENTER);

        label.setBackground(background); okButton.setBackground(background);
        return new Scene(root, 350, 100);
    }

    private Scene promoBerhasilScene(int jumlah, Diskon diskon){
        int hargaDiskon = jumlah * diskon.getPersen()/100;
        Label label = new Label("Anda Mendapat Diskon Rp" + hargaDiskon);
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(300);
        label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        VBox root = new VBox(20);
        root.getChildren().addAll(label);
        root.setAlignment(Pos.CENTER);

        label.setBackground(background2);
        return new Scene(root, 400, 50);
    }

    private Scene bayarBerhasilScene(){
        Label label = new Label("Pemesanan Berhasil");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(300);
        label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        VBox root = new VBox(20);
        root.getChildren().addAll(label);
        root.setAlignment(Pos.CENTER);

        label.setBackground(background2);
        return new Scene(root, 400, 50);
    }

    private Scene bayarGagalScene(){
        Label label = new Label("Pembayaran Gagal");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(300);
        label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        VBox root = new VBox(20);
        root.getChildren().addAll(label);
        root.setAlignment(Pos.CENTER);

        label.setBackground(background2);
        return new Scene(root, 400, 50);
    }
}
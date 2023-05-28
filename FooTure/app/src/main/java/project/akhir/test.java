// package project.akhir;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;

// import javafx.application.Application;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.effect.DropShadow;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.CornerRadii;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.scene.paint.Color;
// import javafx.stage.Stage;

// abstract class Pesanan{
//     HashMap<Integer, Integer> listProdukDipesan = new HashMap<>();

//     abstract void tambahPesanan(Integer id);
//     abstract void kurangPesanan(Integer id);

// }

// class ProdukDipesan extends Pesanan{
//     Produk produk;
//     int kuantitas;
//     public Produk getProduk() {
//         return produk;
//     }
//     public void setProduk(Produk produk) {
//         this.produk = produk;
//     }
//     public int getKuantitas() {
//         return kuantitas;
//     }
//     public void setKuantitas(int kuantitas) {
//         this.kuantitas = kuantitas;
//     }
    
//     @Override
//     void tambahPesanan(Integer id){
//         listProdukDipesan.put(id, listProdukDipesan.get(id) +1 );
//     };

//     @Override
//     void kurangPesanan(Integer id){
//         listProdukDipesan.put(id, listProdukDipesan.get(id) - 1 );
//     };

// }

// class Produk{
//     int id;
//     String nama;
//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public String getNama() {
//         return nama;
//     }
//     public void setNama(String nama) {
//         this.nama = nama;
//     }
// }

// class HargaProduk{
//     Produk produk;
//     int harga;
//     public Produk getProduk() {
//         return produk;
//     }
//     public void setProduk(Produk produk) {
//         this.produk = produk;
//     }
//     public int getHarga() {
//         return harga;
//     }
//     public void setHarga(int harga) {
//         this.harga = harga;
//     }
// }

// public class FooTure extends Application {
//     private Stage primaryStage;

//     DropShadow dropShadow = new DropShadow();
//     BackgroundFill backgroundFill = new BackgroundFill(Color.BLACK, new CornerRadii(5), null);
//     Background background = new Background(backgroundFill);

//     BackgroundFill backgroundFill2 = new BackgroundFill(Color.BLACK, null, null);
//     Background background2 = new Background(backgroundFill);

//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {
//         this.primaryStage = primaryStage;

//         Label label = new Label("Nama Restaurant");
//         label.setAlignment(Pos.CENTER);
//         label.setPrefHeight(50);
//         label.setPrefWidth(250);
//         label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

//         Image logoImage = new Image("C:\\Users\\Fikri\\Desktop\\PRAKTIKUM SEMESTER 2\\Praktikum\\Pertemuan 9\\app\\src\\main\\resources\\images-removebg-preview.png");
//         ImageView logoImageView = new ImageView(logoImage);
//         logoImageView.setFitWidth(90);
//         logoImageView.setFitHeight(100);

//         Button startButton = new Button("PESAN SEKARANG");
//         startButton.setPrefWidth(200);
//         startButton.setPrefHeight(50);
//         startButton.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

//         startButton.setOnAction(event -> {
//             showMenu();
//         });

//         label.setEffect(dropShadow);
//         startButton.setEffect(dropShadow);
//         label.setBackground(background);
//         startButton.setBackground(background);

//         VBox root = new VBox(20);
//         root.setAlignment(Pos.CENTER);
//         root.getChildren().addAll(label, logoImageView, startButton);

//         Scene scene1 = new Scene(root, 600, 500);
//         primaryStage.setTitle("FooTure");
//         primaryStage.setScene(scene1);
//         primaryStage.show();
//     }

//     private void showMenu() {
//         Label label = new Label("Daftar Menu");
//         label.setAlignment(Pos.CENTER);
//         label.setPrefHeight(50);
//         label.setPrefWidth(250);
//         label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

//         Label menu1 = new Label("  Menu 1 \t\t| 10K");
//         menu1.setAlignment(Pos.CENTER);
//         menu1.setPrefHeight(50);
//         menu1.setPrefWidth(250);
//         menu1.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

//         Button kurang1 = new Button("-");
//         kurang1.setAlignment(Pos.CENTER);
//         kurang1.setPrefHeight(50);
//         kurang1.setPrefWidth(50);
//         kurang1.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
//         Label input1 = new Label("0");
//         input1.setAlignment(Pos.CENTER);
//         input1.setPrefWidth(100);
//         input1.setPrefHeight(50);
//         input1.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
//         kurang1.setOnAction(e ->{
//             int input = Integer.parseInt(input1.getText());
//             if (input > 0){
//                 input1.setText(String.valueOf(input-1));
//             }
//         });

//         Button tambah1 = new Button("+");
//         tambah1.setAlignment(Pos.CENTER);
//         tambah1.setPrefHeight(50);
//         tambah1.setPrefWidth(50);
       
//         tambah1.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
//         tambah1.setOnAction(e ->{
//             int input = Integer.parseInt(input1.getText());
//             input1.setText(String.valueOf(input+1));
//         });

//         Label menu2 = new Label("  Menu 2 \t\t| 15K");
//         menu2.setAlignment(Pos.CENTER);
//         menu2.setPrefHeight(50);
//         menu2.setPrefWidth(250);
//         menu2.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

//         Label input2 = new Label("0");
//         input2.setAlignment(Pos.CENTER);
//         input2.setPrefWidth(100);
//         input2.setPrefHeight(50);
//         input2.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
//         Button kurang2 = new Button("-");
//         kurang2.setAlignment(Pos.CENTER);
//         kurang2.setPrefHeight(50);
//         kurang2.setPrefWidth(50);
//         kurang2.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
//         kurang2.setOnAction(e ->{
//             int input = Integer.parseInt(input2.getText());
//             if (input > 0){
//                 input2.setText(String.valueOf(input-1));
//             }
//         });

//         Button tambah2 = new Button("+");
//         tambah2.setAlignment(Pos.CENTER);
//         tambah2.setPrefHeight(50);
//         tambah2.setPrefWidth(50);
//         tambah2.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

//         tambah2.setOnAction(e ->{
//             int input = Integer.parseInt(input2.getText());
//             input2.setText(String.valueOf(input+1));
//         });

//         Label menu3 = new Label("  Menu 3 \t\t| 15K");
//         menu3.setAlignment(Pos.CENTER);
//         menu3.setPrefHeight(50);
//         menu3.setPrefWidth(250);
//         menu3.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

//         Label input3 = new Label("0");
//         input3.setAlignment(Pos.CENTER);
//         input3.setPrefWidth(100);
//         input3.setPrefHeight(50);
//         input3.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
//         Button kurang3 = new Button("-");
//         kurang3.setAlignment(Pos.CENTER);
//         kurang3.setPrefHeight(50);
//         kurang3.setPrefWidth(50);
//         kurang3.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
        
//         kurang3.setOnAction(e ->{
//             int input = Integer.parseInt(input3.getText());
//             if (input > 0){
//                 input3.setText(String.valueOf(input-1));
//             }
//         });

//         Button tambah3 = new Button("+");
//         tambah3.setAlignment(Pos.CENTER);
//         tambah3.setPrefHeight(50);
//         tambah3.setPrefWidth(50);
//         tambah3.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

//         tambah3.setOnAction(e ->{
//             int input = Integer.parseInt(input3.getText());
//             input3.setText(String.valueOf(input+1));
//         });

//         Label menu4 = new Label("  Menu 4 \t\t| 20K");
//         menu4.setAlignment(Pos.CENTER);
//         menu4.setPrefHeight(50);
//         menu4.setPrefWidth(250);
//         menu4.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
        
//         Label input4 = new Label("0");
//         input4.setAlignment(Pos.CENTER);
//         input4.setPrefWidth(100);
//         input4.setPrefHeight(50);
//         input4.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
//         Button kurang4 = new Button("-");
//         kurang4.setAlignment(Pos.CENTER);
//         kurang4.setPrefHeight(50);
//         kurang4.setPrefWidth(50);
//         kurang4.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
//         kurang4.setOnAction(e ->{
//             int input = Integer.parseInt(input4.getText());
//             if (input > 0){
//                 input4.setText(String.valueOf(input-1));
//             }
//         });

//         Button tambah4 = new Button("+");
//         tambah4.setAlignment(Pos.CENTER);
//         tambah4.setPrefHeight(50);
//         tambah4.setPrefWidth(50);
//         tambah4.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

//         tambah4.setOnAction(e ->{
//             int input = Integer.parseInt(input4.getText());
//             input4.setText(String.valueOf(input+1));
//         });

//         Button backButton = new Button("BACK");
//         backButton.setPrefWidth(100);  
//         backButton.setPrefHeight(40);  
//         backButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

//         backButton.setOnAction(e -> start(primaryStage));

//         Button confirmButton = new Button("CONFIRM");
//         confirmButton.setPrefWidth(160);  
//         confirmButton.setPrefHeight(40);  
//         confirmButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

//         confirmButton.setOnAction(e -> {
//             int jumlahMenu1 = Integer.parseInt(input1.getText());
//             int jumlahMenu2 = Integer.parseInt(input2.getText());
//             int jumlahMenu3 = Integer.parseInt(input3.getText());
//             int jumlahMenu4 = Integer.parseInt(input4.getText());

//             Stage detailPesananScene = new Stage();
//             Scene scene2 = detailPesananScene(jumlahMenu1, jumlahMenu2, jumlahMenu3, jumlahMenu4);
//             detailPesananScene.setScene(scene2);
//             detailPesananScene.setTitle("FooTure Detail");
//             detailPesananScene.show();
//         });

//         Button clearButton = new Button("CLEAR");
//         clearButton.setPrefWidth(160);
//         clearButton.setPrefHeight(40);
//         clearButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");
//         clearButton.setOnAction(event -> {
//             input1.setText("0");
//             input2.setText("0");
//             input3.setText("0");
//             input4.setText("0");
//         });

//         label.setEffect(dropShadow); 
//         label.setBackground(background); menu1.setBackground(background); menu1.setBackground(background); menu2.setBackground(background); menu3.setBackground(background); menu4.setBackground(background); 
//         kurang1.setBackground(background); tambah1.setBackground(background); kurang2.setBackground(background); tambah2.setBackground(background); kurang3.setBackground(background); tambah3.setBackground(background); kurang4.setBackground(background); tambah4.setBackground(background);
//         backButton.setBackground(background); confirmButton.setBackground(background); clearButton.setBackground(background);
//         input1.setBackground(background2);  input2.setBackground(background2); input3.setBackground(background2); input4.setBackground(background2);

//         HBox baris1 = new HBox(3);
//         baris1.getChildren().addAll(menu1, kurang1, input1, tambah1);

//         HBox baris2 = new HBox(3);
//         baris2.getChildren().addAll(menu2, kurang2, input2, tambah2);

//         HBox baris3 = new HBox(3);
//         baris3.getChildren().addAll(menu3, kurang3, input3, tambah3);

//         HBox baris4 = new HBox(3);
//         baris4.getChildren().addAll(menu4, kurang4, input4, tambah4);

//         HBox menuButton = new HBox(20);
//         menuButton.getChildren().addAll(backButton, clearButton, confirmButton);

//         VBox root = new VBox(20);
//         root.getChildren().addAll(label, baris1, baris2, baris3, baris4, menuButton);

//         Scene scene2 = new Scene(root, 600, 500);

//         primaryStage.setScene(scene2);
//     }

//     private Scene detailPesananScene(int jumlahMenu1, int jumlahMenu2, int jumlahMenu3, int jumlahMenu4) {
//         int hargaMenu1 = 10000;
//         int hargaMenu2 = 15000;
//         int hargaMenu3 = 15000;
//         int hargaMenu4 = 20000;

//         Produk produk1 = new Produk();
//         produk1.setId(1);
//         produk1.setNama("Menu 1");

//         Produk produk2 = new Produk();
//         produk2.setId(2);
//         produk2.setNama("Menu 2");

//         Produk produk3 = new Produk();
//         produk3.setId(3);
//         produk3.setNama("Menu 3");

//         Produk produk4 = new Produk();
//         produk4.setId(4);
//         produk4.setNama("Menu 4");

//         HargaProduk hargaProduk1 = new HargaProduk();
//         hargaProduk1.setProduk(produk1);
//         hargaProduk1.setHarga(10000);

//         HargaProduk hargaProduk2 = new HargaProduk();
//         hargaProduk2.setProduk(produk2);
//         hargaProduk2.setHarga(15000);

//         HargaProduk hargaProduk3 = new HargaProduk();
//         hargaProduk3.setProduk(produk3);
//         hargaProduk3.setHarga(15000);

//         HargaProduk hargaProduk4 = new HargaProduk();
//         hargaProduk4.setProduk(produk4);
//         hargaProduk4.setHarga(20000);

//         Label label = new Label("Detail Pesanan");
//         label.setAlignment(Pos.CENTER);
//         label.setPrefHeight(30);
//         label.setPrefWidth(300);
//         label.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        
//         VBox root = new VBox(5);
//         root.setAlignment(Pos.TOP_LEFT);
//         root.getChildren().add(label);
        
//         int jumlah = (jumlahMenu1 * hargaMenu1) + (jumlahMenu2 * hargaMenu2) + (jumlahMenu3 * hargaMenu3) + (jumlahMenu4 * hargaMenu4);
//         Label total = new Label(" Total \t\t| Rp" + String.valueOf(jumlah));
//         total.setAlignment(Pos.CENTER);
//         total.setPrefHeight(40);
//         total.setPrefWidth(300);
//         total.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

//         if (jumlahMenu1 > 0) {
//             Label detail1 = detailLabel(jumlahMenu1, "Menu 1", jumlahMenu1 * hargaMenu1);
//             detail1.setAlignment(Pos.CENTER);
//             detail1.setPrefHeight(30);
//             detail1.setPrefWidth(300);
//             detail1.setBackground(background);
//             detail1.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
//             root.getChildren().add(detail1);
//         } 
        
//         if (jumlahMenu2 > 0) {
//             Label detail2 = detailLabel(jumlahMenu2, "Menu 2", jumlahMenu2 * hargaMenu2);
//             detail2.setAlignment(Pos.CENTER);
//             detail2.setPrefHeight(30);
//             detail2.setPrefWidth(300);
//             detail2.setBackground(background);
//             detail2.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
//             root.getChildren().add(detail2);
//         } 

//         if (jumlahMenu3 > 0) {
//             Label detail3 = detailLabel(jumlahMenu3, "Menu 3", jumlahMenu3 * hargaMenu3);
//             detail3.setAlignment(Pos.CENTER);
//             detail3.setPrefHeight(30);
//             detail3.setPrefWidth(300);
//             detail3.setBackground(background);
//             detail3.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
//             root.getChildren().add(detail3);
//         } 

//         if (jumlahMenu4 > 0) {
//             Label detail4 = detailLabel(jumlahMenu4, "Menu 4", jumlahMenu4 * hargaMenu4);
//             detail4.setAlignment(Pos.CENTER);
//             detail4.setPrefHeight(30);
//             detail4.setPrefWidth(300);
//             detail4.setBackground(background);
//             detail4.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
//             root.getChildren().add(detail4);
//         } 

//         Button closeButton = new Button("Batal");
//         closeButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
//         closeButton.setOnAction(event -> {
//             Stage stage = (Stage) closeButton.getScene().getWindow();
//             stage.close();
//         });

//         Button promoButton = new Button("Promo");
//         promoButton.setPrefWidth(100);
//         promoButton.setPrefHeight(30);
//         promoButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
//         promoButton.setOnAction(event -> {
//             Stage promoScene = new Stage();
//             Scene scene3 = promoScene(jumlah, total);
//             promoScene.setScene(scene3);
//             promoScene.setTitle("Promo");
//             promoScene.show();
//         });

//         Button bayarButton = new Button("BAYAR");
//         bayarButton.setPrefWidth(100);
//         bayarButton.setPrefHeight(30);
//         bayarButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
//         bayarButton.setOnAction(event -> {
//             // jumlahMenu1.setText("0");
//         });
        
//         HBox menu = new HBox (20);
//         menu.getChildren().addAll(closeButton, promoButton, bayarButton);

//         root.getChildren().add(total);
//         root.getChildren().add(menu);

//         label.setBackground(background2); closeButton.setBackground(background2); promoButton.setBackground(background2); total.setBackground(background2); bayarButton.setBackground(background2);

//         return new Scene(root, 400, 350);
//     }

//     private Label detailLabel(int jumlahMenu, String namaMenu, int hargaMenu) {
//         Label detail = new Label(jumlahMenu + "x\t" + namaMenu +"\t| Rp" + hargaMenu);
//         detail.setAlignment(Pos.CENTER);
//         detail.setPrefHeight(30);
//         detail.setPrefWidth(300);
//         detail.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
//         return detail;
//     }

//     private Scene promoScene(int jumlah, Label total){
//         String kodePromo = "PROMO";
//         int persen = 10;
        
//         Label label = new Label("Masukkan Kode Promo");
//         label.setAlignment(Pos.CENTER);
//         label.setPrefHeight(30);
//         label.setPrefWidth(200);
//         label.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

//         TextField inputCode = new TextField();
//         inputCode.setAlignment(Pos.CENTER);
//         inputCode.setMaxWidth(120);
//         inputCode.setMaxHeight(40);
//         inputCode.setStyle("-fx-font-size: 15px; -fx-text-fill: black;");
        
//         Button okButton = new Button("OK");
//         okButton.setAlignment(Pos.CENTER);
//         okButton.setPrefHeight(40);
//         okButton.setPrefWidth(40);
//         okButton.setStyle("-fx-font-size: 10px; -fx-text-fill: white;");
//         okButton.setOnAction(event -> {
//             String userInput = inputCode.getText();
//             if (userInput.equals(kodePromo)){
//                 int diskon = jumlah * persen;
//                 int hasilAkhir = jumlah - diskon/100;
//                 total.setText(" Total \t\t| Rp" + String.valueOf(hasilAkhir));
//                 Stage stage = (Stage) okButton.getScene().getWindow();
//                 stage.close();
//             } 
//         });

//         HBox hbox = new HBox(20);
//         hbox.setAlignment(Pos.CENTER);
//         hbox.getChildren().addAll(inputCode, okButton);

//         VBox root = new VBox(20);
//         root.getChildren().addAll(label, hbox);
//         root.setAlignment(Pos.CENTER);

//         label.setBackground(background); okButton.setBackground(background);
//         return new Scene(root, 200, 100);
//     }
// }

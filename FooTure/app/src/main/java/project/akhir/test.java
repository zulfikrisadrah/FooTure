package project.akhir;

import javafx.application.Application;
import javafx.geometry.Pos;
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

public class test extends Application {
    private Stage primaryStage;

    DropShadow dropShadow = new DropShadow();
    BackgroundFill backgroundFill = new BackgroundFill(Color.BLACK, new CornerRadii(5), null);
    Background background = new Background(backgroundFill);

    BackgroundFill backgroundFill2 = new BackgroundFill(Color.BLACK, null, null);
    Background background2 = new Background(backgroundFill);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Label label = new Label("Nama Restaurant");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(50);
        label.setPrefWidth(250);
        label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        Image logoImage = new Image(
                "C:\\Users\\Fikri\\Desktop\\PRAKTIKUM SEMESTER 2\\Praktikum\\Pertemuan 9\\app\\src\\main\\resources\\images-removebg-preview.png");
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
        Label label = new Label("Daftar Menu");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(50);
        label.setPrefWidth(250);
        label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        Label menu1 = new Label("  Menu 1 \t\t| 10K");
        menu1.setAlignment(Pos.CENTER);
        menu1.setPrefHeight(50);
        menu1.setPrefWidth(250);
        menu1.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        Button kurang1 = new Button("-");
        kurang1.setAlignment(Pos.CENTER);
        kurang1.setPrefHeight(50);
        kurang1.setPrefWidth(50);
        kurang1.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
        TextField input1 = new TextField("0");
        input1.setAlignment(Pos.CENTER);
        input1.setMaxWidth(60);
        input1.setMaxHeight(50);
        input1.setStyle("-fx-font-size: 20px; -fx-text-fill: black;");
        
        kurang1.setOnAction(e ->{
            int input = Integer.parseInt(input1.getText());
            if (input > 0){
                input1.setText(String.valueOf(input-1));
            }
        });

        Button tambah1 = new Button("+");
        tambah1.setAlignment(Pos.CENTER);
        tambah1.setPrefHeight(50);
        tambah1.setPrefWidth(50);
       
        tambah1.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
        tambah1.setOnAction(e ->{
            int input = Integer.parseInt(input1.getText());
            input1.setText(String.valueOf(input+1));
        });

        Label menu2 = new Label("  Menu 2 \t\t| 15K");
        menu2.setAlignment(Pos.CENTER);
        menu2.setPrefHeight(50);
        menu2.setPrefWidth(250);
        menu2.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        TextField input2 = new TextField("0");
        input2.setAlignment(Pos.CENTER);
        input2.setMaxWidth(60);
        input2.setMaxHeight(50);
        input2.setStyle("-fx-font-size: 20px; -fx-text-fill: black;");
        
        Button kurang2 = new Button("-");
        kurang2.setAlignment(Pos.CENTER);
        kurang2.setPrefHeight(50);
        kurang2.setPrefWidth(50);
        kurang2.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
        kurang2.setOnAction(e ->{
            int input = Integer.parseInt(input2.getText());
            if (input > 0){
                input2.setText(String.valueOf(input-1));
            }
        });

        Button tambah2 = new Button("+");
        tambah2.setAlignment(Pos.CENTER);
        tambah2.setPrefHeight(50);
        tambah2.setPrefWidth(50);
        tambah2.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

        tambah2.setOnAction(e ->{
            int input = Integer.parseInt(input2.getText());
            input2.setText(String.valueOf(input+1));
        });

        Label menu3 = new Label("  Menu 3 \t\t| 15K");
        menu3.setAlignment(Pos.CENTER);
        menu3.setPrefHeight(50);
        menu3.setPrefWidth(250);
        menu3.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");

        TextField input3 = new TextField("0");
        input3.setAlignment(Pos.CENTER);
        input3.setMaxWidth(60);
        input3.setMaxHeight(50);
        input3.setStyle("-fx-font-size: 20px; -fx-text-fill: black;");
        
        Button kurang3 = new Button("-");
        kurang3.setAlignment(Pos.CENTER);
        kurang3.setPrefHeight(50);
        kurang3.setPrefWidth(50);
        kurang3.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
        
        kurang3.setOnAction(e ->{
            int input = Integer.parseInt(input3.getText());
            if (input > 0){
                input3.setText(String.valueOf(input-1));
            }
        });

        Button tambah3 = new Button("+");
        tambah3.setAlignment(Pos.CENTER);
        tambah3.setPrefHeight(50);
        tambah3.setPrefWidth(50);
        tambah3.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

        tambah3.setOnAction(e ->{
            int input = Integer.parseInt(input3.getText());
            input3.setText(String.valueOf(input+1));
        });

        Label menu4 = new Label("  Menu 4 \t\t| 20K");
        menu4.setAlignment(Pos.CENTER);
        menu4.setPrefHeight(50);
        menu4.setPrefWidth(250);
        menu4.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
        
        TextField input4 = new TextField("0");
        input4.setAlignment(Pos.CENTER);
        input4.setMaxWidth(60);
        input4.setMaxHeight(50);
        input4.setStyle("-fx-font-size: 20px; -fx-text-fill: black;");
        
        Button kurang4 = new Button("-");
        kurang4.setAlignment(Pos.CENTER);
        kurang4.setPrefHeight(50);
        kurang4.setPrefWidth(50);
        kurang4.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");
       
        kurang4.setOnAction(e ->{
            int input = Integer.parseInt(input4.getText());
            if (input > 0){
                input4.setText(String.valueOf(input-1));
            }
        });

        Button tambah4 = new Button("+");
        tambah4.setAlignment(Pos.CENTER);
        tambah4.setPrefHeight(50);
        tambah4.setPrefWidth(50);
        tambah4.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

        tambah4.setOnAction(e ->{
            int input = Integer.parseInt(input4.getText());
            input4.setText(String.valueOf(input+1));
        });

        Button backButton = new Button("BACK");
        backButton.setPrefWidth(100);  
        backButton.setPrefHeight(40);  
        backButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        backButton.setOnAction(e -> start(primaryStage));

        Button confirmButton = new Button("CONFIRM");
        confirmButton.setPrefWidth(160);  
        confirmButton.setPrefHeight(40);  
        confirmButton.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        confirmButton.setOnAction(e -> {
            int jumlahMenu1 = Integer.parseInt(input1.getText());
            int jumlahMenu2 = Integer.parseInt(input2.getText());
            int jumlahMenu3 = Integer.parseInt(input3.getText());
            int jumlahMenu4 = Integer.parseInt(input4.getText());

            Stage detailPesananScene = new Stage();
            Scene scene2 = detailPesananScene(jumlahMenu1, jumlahMenu2, jumlahMenu3, jumlahMenu4);
            detailPesananScene.setScene(scene2);
            detailPesananScene.setTitle("FooTure Detail");
            detailPesananScene.show();
        });

        label.setEffect(dropShadow); 
        label.setBackground(background); menu1.setBackground(background); menu1.setBackground(background); menu2.setBackground(background); menu3.setBackground(background); menu4.setBackground(background); 
        kurang1.setBackground(background); tambah1.setBackground(background); kurang2.setBackground(background); tambah2.setBackground(background); kurang3.setBackground(background); tambah3.setBackground(background); kurang4.setBackground(background); tambah4.setBackground(background);
        backButton.setBackground(background); confirmButton.setBackground(background);

        HBox baris1 = new HBox(3);
        baris1.getChildren().addAll(menu1, kurang1, input1, tambah1);

        HBox baris2 = new HBox(3);
        baris2.getChildren().addAll(menu2, kurang2, input2, tambah2);

        HBox baris3 = new HBox(3);
        baris3.getChildren().addAll(menu3, kurang3, input3, tambah3);

        HBox baris4 = new HBox(3);
        baris4.getChildren().addAll(menu4, kurang4, input4, tambah4);

        HBox menuButton = new HBox(20);
        menuButton.getChildren().addAll(backButton, confirmButton);

        VBox root = new VBox(20);
        root.getChildren().addAll(label, baris1, baris2, baris3, baris4, menuButton);

        Scene scene2 = new Scene(root, 600, 500);

        primaryStage.setScene(scene2);
    }

    private Scene detailPesananScene(int jumlahMenu1, int jumlahMenu2, int jumlahMenu3, int jumlahMenu4) {
        Label label = new Label("Detail Pesanan");
        label.setAlignment(Pos.CENTER);
        label.setPrefHeight(30);
        label.setPrefWidth(300);
        label.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

        VBox root = new VBox(5);
        root.setAlignment(Pos.TOP_LEFT);
        root.getChildren().add(label);
    
        int jumlah = (jumlahMenu1 * 15000) + (jumlahMenu2 * 20000) + (jumlahMenu3 * 20000) + (jumlahMenu4 * 25000);
        Label total = new Label("");
        total.setText(" Total \t\t| Rp" + String.valueOf(jumlah));
        total.setAlignment(Pos.CENTER);
        total.setPrefHeight(40);
        total.setPrefWidth(300);
        total.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");

        if (jumlahMenu1 > 0) {
            Label detail1 = detailLabel(jumlahMenu1, "Menu 1", jumlahMenu1 * 15000);
            detail1.setAlignment(Pos.CENTER);
            detail1.setPrefHeight(30);
            detail1.setPrefWidth(300);
            detail1.setBackground(background);
            detail1.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
            root.getChildren().add(detail1);
        } 
        
        if (jumlahMenu2 > 0) {
            Label detail2 = detailLabel(jumlahMenu2, "Menu 2", jumlahMenu2 * 20000);
            detail2.setAlignment(Pos.CENTER);
            detail2.setPrefHeight(30);
            detail2.setPrefWidth(300);
            detail2.setBackground(background);
            detail2.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
            root.getChildren().add(detail2);
        } 

        if (jumlahMenu3 > 0) {
            Label detail3 = detailLabel(jumlahMenu3, "Menu 3", jumlahMenu3 * 20000);
            detail3.setAlignment(Pos.CENTER);
            detail3.setPrefHeight(30);
            detail3.setPrefWidth(300);
            detail3.setBackground(background);
            detail3.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
            root.getChildren().add(detail3);
        } 

        if (jumlahMenu4 > 0) {
            Label detail4 = detailLabel(jumlahMenu4, "Menu 4", jumlahMenu4 * 25000);
            detail4.setAlignment(Pos.CENTER);
            detail4.setPrefHeight(30);
            detail4.setPrefWidth(300);
            detail4.setBackground(background);
            detail4.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
            root.getChildren().add(detail4);
        } 

        Button closeButton = new Button("Batal");
        closeButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
        closeButton.setOnAction(event -> {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        });

        Button codeButton = new Button();
        codeButton.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
        codeButton.setOnAction(event -> {
            
        });

        root.getChildren().add(total);
        root.getChildren().add(closeButton);

        label.setBackground(background2); closeButton.setBackground(background2); total.setBackground(background2);

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


}

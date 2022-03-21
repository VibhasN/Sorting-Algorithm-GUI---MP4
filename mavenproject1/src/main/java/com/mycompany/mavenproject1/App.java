package com.mycompany.mavenproject1;


import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("SORTING ALGORITHMS"); //title of the overall window
        Group grp = new Group();
        Scene scene = new Scene(grp, 1000, 1000, Color.WHITE); //sets the dimensions of the window
        TabPane tabpane = new TabPane();
        BorderPane borderpane = new BorderPane();
        Tab tab = new Tab(); 
        tab.setText("Sorting Intro");         //this is the first tab, where it gives a brief description of the project

        HBox hbox = new HBox();
        hbox.getChildren().add
        (new Label("Sorting Efficiency" + "\n" + "\n" + "The two main criterias to judge which algorithm is better than the other have been:" + "\n" + "\n" + "    1- Time taken to sort the given data." + ""
                + "\n" + "    2- Memory Space required to do so."));
        hbox.setAlignment(Pos.CENTER);
        tab.setContent(hbox);
        tabpane.getTabs().add(tab);  
        //this is the first tab, where it gives a brief description of the project
        
        //The start of the selection sort tab
        //creates the boxes and the textfields that go inside each of the hboxes 
        TextField field1 = new TextField();
        TextField field2 = new TextField();
        TextField field3 = new TextField();
        TextField field4 = new TextField();
        TextField field5 = new TextField();
        TextField field6 = new TextField();
        TextField field7 = new TextField();
        TextField field8 = new TextField();
        TextField field9 = new TextField();
        TextField field10 = new TextField();
        HBox fieldHbox = new HBox();
        fieldHbox.getChildren().addAll(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10);
        
        Label sLabel = new Label();
        Label sSlabel = new Label();
        //button creation
        Button randBtn = new Button("Generate Random Numbers");
        Button startBtn = new Button("Start Selection Sort");
        Button resetBtn = new Button("Reset Numbers");
        HBox buttonHbox = new HBox();
        buttonHbox.setAlignment(Pos.CENTER);
        buttonHbox.getChildren().addAll(randBtn, startBtn, resetBtn);
        
        
        //creates a new tab with a title, creates a description for the type of sort, and positions each of the title, description, and hboxes in a vertical order using vboxes
        Tab sTab = new Tab();
        sTab.setText("Selection Sort");
        HBox hbox1 = new HBox();
        Label dLabel = new Label("Selection Sort Description:     "+ "\n"+ "Selection sort treats the input as two parts, a sorted part and an unsorted part, and repeatedly selects the proper next value to move from the unsorted part to the end of the sorted part.");
        hbox1.getChildren().add(dLabel);
        hbox1.setAlignment(Pos.TOP_CENTER);
        VBox vbox1 = new VBox();
        vbox1.setSpacing(50);
        vbox1.getChildren().addAll(hbox1, fieldHbox, buttonHbox, sLabel, sSlabel);
        sTab.setContent(vbox1);
        tabpane.getTabs().add(sTab); 
        
                SelectionSort SSort = new SelectionSort();
//provides the eventlistener to reset the values in the hboxes 
        resetBtn.setOnAction(event -> {
            field1.clear();
            field2.clear();
            field3.clear();
            field4.clear();
            field5.clear();
            field6.clear();
            field7.clear();
            field8.clear();
            field9.clear();
            field10.clear();
            sLabel.setText("");
            sSlabel.setText("");
        });
        //reads each random or assigned value in each of the hboxes and assigns them to an index of the appropriate array
        startBtn.setOnAction(event -> {
            int sArray[] = new int[10];
            
            sArray[0] = SSort.parseResult(field1.getText());
            sArray[1] = SSort.parseResult(field2.getText());
            sArray[2] = SSort.parseResult(field3.getText());
            sArray[3] = SSort.parseResult(field4.getText());
            sArray[4] = SSort.parseResult(field5.getText());
            sArray[5] = SSort.parseResult(field6.getText());
            sArray[6] = SSort.parseResult(field7.getText());
            sArray[7] = SSort.parseResult(field8.getText());
            sArray[8] = SSort.parseResult(field9.getText());
            sArray[9] = SSort.parseResult(field10.getText());
  
           
            String sVString = "";
            sVString = SSort.selectionSort(sArray, 0, sArray.length -1);
            //prints out each individual iteration of the sort -> each time the input is sorted once, it is printed out 
            //this loop serves as a visual representation of the steps as each time it is sorted, it is printed out until the array is completely sorted
            String sSString = "";
            for (int i = 0; i <10; i++) {
                sSString = sSString + Integer.toString(sArray[i]) + " ";
            }
            sLabel.setPadding(new Insets(0,0,0,400));
            sLabel.setText(sVString);
            sSlabel.setPadding(new Insets(0,0,0,400));
            sSlabel.setText("Sorted array: " + sSString);
            
                 
        });
         //Generates the random values between 0 and 1000 that are displayed in the fields
        randBtn.setOnAction(event -> {
            Random rand = new Random();
                int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(1000); 
                System.out.println(a[i]);
            }
                     //Sets the text of each of the fields to the random value generated by the button
            field1.setText(Integer.toString(a[0]));   
            field2.setText(Integer.toString(a[1]));
            field3.setText(Integer.toString(a[2]));
            field4.setText(Integer.toString(a[3]));
            field5.setText(Integer.toString(a[4]));
            field6.setText(Integer.toString(a[5]));
            field7.setText(Integer.toString(a[6]));
            field8.setText(Integer.toString(a[7]));
            field9.setText(Integer.toString(a[8]));
            field10.setText(Integer.toString(a[9]));
            
                
        });

        //Start of insertion sort tab  
        
        TextField field1a = new TextField();
        TextField field2a = new TextField();
        TextField field3a = new TextField();
        TextField field4a = new TextField();
        TextField field5a = new TextField();
        TextField field6a = new TextField();
        TextField field7a = new TextField();
        TextField field8a = new TextField();
        TextField field9a = new TextField();
        TextField field10a = new TextField();
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(field1a, field2a, field3a, field4a, field5a, field6a, field7a, field8a, field9a, field10a);
        
        Label iVLabel = new Label();
        Label sILabel = new Label();
        //button creation and formatting
        Button randBtna = new Button("Generate Random Numbers");
        Button startBtna = new Button("Start Insertion Sort");
        Button resetBtna = new Button("Reset Numbers");
        HBox buttonHbox1 = new HBox();
        buttonHbox1.setAlignment(Pos.CENTER);
        buttonHbox1.getChildren().addAll(randBtna, startBtna, resetBtna);
        
        Tab tab4 = new Tab();
        tab4.setText("Insertion Sort");
        HBox lhBox1 = new HBox();
        lhBox1.setAlignment(Pos.TOP_CENTER);
        lhBox1.getChildren().add
        (new Label("Insertion Sort Description:  "+ "\n"+ "Insertion Sort splits an array into 2 parts, a sorted and unsorted part, and then repeatedly takes a value from the unsorted part and inserts it into the correct location of the sorted part."));
        VBox vbox2 = new VBox();
        vbox2.setSpacing(50);
        vbox2.getChildren().addAll(lhBox1, hBox1, buttonHbox1, iVLabel, sILabel);
        tab4.setContent(vbox2);
        tabpane.getTabs().add(tab4); 
        InsertionSort iSort = new InsertionSort();
                
        resetBtna.setOnAction(event -> {
            field1a.clear();
            field2a.clear();
            field3a.clear();
            field4a.clear();
            field5a.clear();
            field6a.clear();
            field7a.clear();
            field8a.clear();
            field9a.clear();
            field10a.clear();
            iVLabel.setText("");
            sILabel.setText("");
        });
        
        randBtna.setOnAction(event -> {
            Random rand = new Random();
                int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(1000); 
                System.out.println(arr[i]);
            }
                
            field1a.setText(Integer.toString(arr[0]));   
            field2a.setText(Integer.toString(arr[1]));
            field3a.setText(Integer.toString(arr[2]));
            field4a.setText(Integer.toString(arr[3]));
            field5a.setText(Integer.toString(arr[4]));
            field6a.setText(Integer.toString(arr[5]));
            field7a.setText(Integer.toString(arr[6]));
            field8a.setText(Integer.toString(arr[7]));
            field9a.setText(Integer.toString(arr[8]));
            field10a.setText(Integer.toString(arr[9]));
            
                
        });
        
        startBtna.setOnAction(event -> {
            int iArray[] = new int[10];
            iArray[0] = iSort.parseResult(field1a.getText());
            iArray[1] = iSort.parseResult(field2a.getText());
            iArray[2] = iSort.parseResult(field3a.getText());
            iArray[3] = iSort.parseResult(field4a.getText());
            iArray[4] = iSort.parseResult(field5a.getText());
            iArray[5] = iSort.parseResult(field6a.getText());
            iArray[6] = iSort.parseResult(field7a.getText());
            iArray[7] = iSort.parseResult(field8a.getText());
            iArray[8] = iSort.parseResult(field9a.getText());
            iArray[9] = iSort.parseResult(field10a.getText());

            String iString = "";
            iString = iSort.insertionSort(iArray, 0, iArray.length -1);
  
            String string6 = "";
            for (int i = 0; i <10; i++) {
                string6 = string6 + Integer.toString(iArray[i]) + " ";
            }
            iVLabel.setPadding(new Insets(0,0,0,400));
            iVLabel.setText(iString);
            sILabel.setPadding(new Insets(0,0,0,400));
            sILabel.setText("Sorted array: " + string6);
            
                 
        });
        //start of the mergeSort Tab
        
        TextField field1b = new TextField();
        TextField field2b = new TextField();
        TextField field3b = new TextField();
        TextField field4b = new TextField();
        TextField field5b = new TextField();
        TextField field6b = new TextField();
        TextField field7b = new TextField();
        TextField field8b = new TextField();
        TextField field9b = new TextField();
        TextField field10b = new TextField();
        HBox fieldHbox2 = new HBox();
        fieldHbox2.getChildren().addAll(field1b, field2b, field3b, field4b, field5b, field6b, field7b, field8b, field9b, field10b);
        //button creation

        Button randBtnb = new Button("Generate Random Numbers");
        Button startBtnb = new Button("Start Merge Sort");
        Button resetBtnb = new Button("Reset Numbers");
        HBox buttonHbox2 = new HBox();
        buttonHbox2.setAlignment(Pos.CENTER);
        buttonHbox2.getChildren().addAll(randBtnb, startBtnb, resetBtnb);
        
        Label mVLabel = new Label();
        Label sMLabel = new Label();
            
        Tab tab5 = new Tab();
        tab5.setText("Merge Sort");
     
        HBox lhbox2 = new HBox();
        lhbox2.setAlignment(Pos.TOP_CENTER);
        lhbox2.getChildren().add(new Label("Merge Sort Description:   "+ "\n"+ "Merge Sort divides an input into 2 halves, sorts each half, and then merges them back together and does this for each half that the algorithm will recursively create."));
    
        VBox vbox3 = new VBox();
        vbox3.setSpacing(50);
        vbox3.getChildren().addAll(lhbox2, fieldHbox2, buttonHbox2, mVLabel, sMLabel);
        tab5.setContent(vbox3);
        tabpane.getTabs().add(tab5); 
        
        MergeSort mSort = new MergeSort();
        //button events
        resetBtnb.setOnAction(event -> {
            field1b.clear();
            field2b.clear();
            field3b.clear();
            field4b.clear();
            field5b.clear();
            field6b.clear();
            field7b.clear();
            field8b.clear();
            field9b.clear();
            field10b.clear();   
            mVLabel.setText("");
            sMLabel.setText("");
            
        });
        
        randBtnb.setOnAction(event -> {
            Random rand = new Random();
                int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(1000); 
                System.out.println(a[i]);
            }
                
            field1b.setText(Integer.toString(a[0]));   
            field2b.setText(Integer.toString(a[1]));
            field3b.setText(Integer.toString(a[2]));
            field4b.setText(Integer.toString(a[3]));
            field5b.setText(Integer.toString(a[4]));
            field6b.setText(Integer.toString(a[5]));
            field7b.setText(Integer.toString(a[6]));
            field8b.setText(Integer.toString(a[7]));
            field9b.setText(Integer.toString(a[8]));
            field10b.setText(Integer.toString(a[9]));
            
                
        });
        
        startBtnb.setOnAction(event -> {
            int mArray[] = new int[10];
            mArray[0] = mSort.parseResult(field1b.getText());
            mArray[1] = mSort.parseResult(field2b.getText());
            mArray[2] = mSort.parseResult(field3b.getText());
            mArray[3] = mSort.parseResult(field4b.getText());
            mArray[4] = mSort.parseResult(field5b.getText());
            mArray[5] = mSort.parseResult(field6b.getText());
            mArray[6] = mSort.parseResult(field7b.getText());
            mArray[7] = mSort.parseResult(field8b.getText());
            mArray[8] = mSort.parseResult(field9b.getText());
            mArray[9] = mSort.parseResult(field10b.getText());
            
            String mVString = "";
            
            mVString = mSort.mergeSort(mArray, 0, mArray.length - 1);
            
            String sMString = "";
            for (int i = 0; i <10; i++) {
                sMString = sMString + Integer.toString(mArray[i]) + " ";
            }
            mVLabel.setPadding(new Insets(0,0,0,400));
            mVLabel.setText(mVString);
            sMLabel.setPadding(new Insets(0,0,0,400));
            sMLabel.setText("Sorted array: " + sMString);
            
                 
        });
        //start of the quicksort tab
      
        TextField field1c = new TextField();
        TextField field2c = new TextField();
        TextField field3c = new TextField();
        TextField field4c = new TextField();
        TextField field5c = new TextField();
        TextField field6c = new TextField();
        TextField field7c = new TextField();
        TextField field8c = new TextField();
        TextField field9c = new TextField();
        TextField field10c = new TextField();
        HBox fieldHbox4 = new HBox();
        fieldHbox4.getChildren().addAll(field1c, field2c, field3c, field4c, field5c, field6c, field7c, field8c, field9c, field10c);
        //button creation
        Button randBtnc = new Button("Generate Random Numbers");
        Button startBtnc = new Button("Start Quick Sort");
        Button resetBtnc = new Button("Reset Numbers");
        HBox buttonHbox4 = new HBox();
        buttonHbox4.setAlignment(Pos.CENTER);
        buttonHbox4.getChildren().addAll(randBtnc, startBtnc, resetBtnc);
        
        Label qVLabel = new Label();
        Label sQLabel = new Label();
        //page formatting
        Tab tab6 = new Tab();
        tab6.setText("Quick Sort");
       
        HBox hbox4 = new HBox();
        hbox4.setAlignment(Pos.TOP_CENTER);
        hbox4.getChildren().add(new Label("Quick Sort Description:      "+ "\n"+ "Quick Sort divides the input into high and low parts using a pivot (the pivot is usually the middle value) and then sorts the high and low parts."));
      
        
        VBox vbox4 = new VBox();
        vbox4.setSpacing(50);
        vbox4.getChildren().addAll(hbox4, fieldHbox4, buttonHbox4, qVLabel, sQLabel);
        tab6.setContent(vbox4);
        tabpane.getTabs().add(tab6); 
        
        QuickSort qSort = new QuickSort();
         //button events

        resetBtnc.setOnAction(event -> {
            field1c.clear();
            field2c.clear();
            field3c.clear();
            field4c.clear();
            field5c.clear();
            field6c.clear();
            field7c.clear();
            field8c.clear();
            field9c.clear();
            field10c.clear();
            qVLabel.setText("");
            sQLabel.setText("");
        });
        
        
        randBtnc.setOnAction(event -> {
            Random rand = new Random();
                int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(1000); 
                System.out.println(a[i]);
            }
                
            field1c.setText(Integer.toString(a[0]));   
            field2c.setText(Integer.toString(a[1]));
            field3c.setText(Integer.toString(a[2]));
            field4c.setText(Integer.toString(a[3]));
            field5c.setText(Integer.toString(a[4]));
            field6c.setText(Integer.toString(a[5]));
            field7c.setText(Integer.toString(a[6]));
            field8c.setText(Integer.toString(a[7]));
            field9c.setText(Integer.toString(a[8]));
            field10c.setText(Integer.toString(a[9]));
        });
        
        startBtnc.setOnAction(event -> {
            int qArray[] = new int[10];
            qArray[0] = qSort.parseResult(field1c.getText());
            qArray[1] = qSort.parseResult(field2c.getText());
            qArray[2] = qSort.parseResult(field3c.getText());
            qArray[3] = qSort.parseResult(field4c.getText());
            qArray[4] = qSort.parseResult(field5c.getText());
            qArray[5] = qSort.parseResult(field6c.getText());
            qArray[6] = qSort.parseResult(field7c.getText());
            qArray[7] = qSort.parseResult(field8c.getText());
            qArray[8] = qSort.parseResult(field9c.getText());
            qArray[9] = qSort.parseResult(field10c.getText());
            
            String qVString = "";
            
            qVString = qSort.main(qArray);
            
            
            String sQString = "";
            for (int i = 0; i <10; i++) {
                sQString = sQString + Integer.toString(qArray[i]) + " ";
            }
            qVLabel.setPadding(new Insets(0,0,0,400));
            qVLabel.setText(qVString);
            sQLabel.setPadding(new Insets(0,0,0,400));
            sQLabel.setText("Sorted array: " + sQString);
            
                 
        });
        
        borderpane.setCenter(tabpane);
        borderpane.prefWidthProperty().bind(scene.widthProperty());
        borderpane.prefHeightProperty().bind(scene.heightProperty());
        grp.getChildren().add(borderpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

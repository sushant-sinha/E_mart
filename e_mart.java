import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.geometry.*;
import javafx.event.EventHandler;  
import javafx.scene.Scene; 
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javax.swing.JOptionPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.effect.Light;  
import javafx.scene.effect.Lighting; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;  
import javafx.scene.text.Font;   
import javafx.scene.text.FontWeight;   
import javafx.scene.text.Text;   
import javafx.scene.layout.GridPane;  
import java.sql.*;
public class e_mart extends Application{  
  public static int objp=0;
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub 
        GridPane root1=new GridPane();  
        GridPane root2=new GridPane();
        GridPane sell=new GridPane();
        GridPane stock=new GridPane();
        GridPane bill=new GridPane();
        Scene scene1=new Scene(root1,3000,990);
        Scene scene2=new Scene(root2,3000,990);
        Scene scene3=new Scene(sell,3000,990);
        Scene scene4=new Scene(stock,3000,990);
        Scene scene5=new Scene(bill,3000,990);
        Text t1= new Text();         
        t1.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 35));          
        t1.setTextOrigin(VPos.TOP);  
        t1.setText("WELCOME TO E-MART");          
        t1.setFill(Color.RED); 
        Text t2=new Text();
        t2.setText("FOR SELLING PORTAL:");
        t2.setFill(Color.GREEN);
        t2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,25));
        Text t3=new Text();
        t3.setText("FOR UPDATING STOCKS:");
        t3.setFill(Color.GREEN); 
        t3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,25));
        Text t4=new Text();
        t4.setText("E-MART SELLING COUNTER");
        t4.setFill(Color.RED);
        t4.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,25));
        Text t5=new Text();
        t5.setText("OBJECT NAME");
        t5.setFill(Color.BLACK);
        t5.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        Text t6=new Text();
        t6.setText("OBJECT PRICE");
        t6.setFill(Color.BLACK);
        t6.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        Text t7=new Text();
        t7.setText("QUANTITY");
        t7.setFill(Color.BLACK);
        t7.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        Text t8=new Text();
        t8.setText("E-MART FINAL BILLING");
        t8.setFill(Color.RED);
        t8.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,25));
        Text t9=new Text();
        t9.setText("TOTAL PAYABLE AMOUNT");
        t9.setFill(Color.BLACK);
        t9.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        Text t10= new Text();
        t10.setText("MENU");
        t10.setFill(Color.RED);
        t10.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,35));
        Text t11= new Text();
        t11.setText("STOCKS");
        t11.setFill(Color.RED);
        t11.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,35));
        Text t12=new Text();
        t12.setText("OBJECT NAME");
        t12.setFill(Color.BLACK);
        t12.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        Text t13=new Text();
        t13.setText("ADD QUANTITY");
        t13.setFill(Color.BLACK);
        t13.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,17));
        TextField tf1=new TextField();
        tf1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        TextField tf2=new TextField();
        tf2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        TextField tf3=new TextField();
        tf3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        TextField tf4=new TextField();
        tf4.setEditable(false);
        TextField tf5=new TextField();
        tf5.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        TextField tf6=new TextField();
        tf6.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        tf1.setStyle("-fx-text-fill: green");
        tf2.setStyle("-fx-text-fill: green");
        tf3.setStyle("-fx-text-fill: green");
        tf4.setStyle("-fx-text-fill: red");
        tf5.setStyle("-fx-text-fill: green");
        tf6.setStyle("-fx-text-fill: green");
        TextArea ta1=new TextArea();
        ta1.setEditable(false);
        ta1.setStyle("-fx-text-fill: red");
        ta1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,16));
        TextArea ta2=new TextArea();
        ta2.setEditable(false);
        ta2.setStyle("-fx-text-fill: red");
        ta2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,16));
        Light.Spot light = new Light.Spot();  
        light.setPointsAtX(0);  
        light.setPointsAtY(0);  
        light.setPointsAtZ(-50);  
        light.setSpecularExponent(5);  
        Lighting lighting = new Lighting();   
        t1.setEffect(lighting);t2.setEffect(lighting); t3.setEffect(lighting);t4.setEffect(lighting);
        t8.setEffect(lighting);t10.setEffect(lighting);t11.setEffect(lighting);
        Button btn1=new Button("LOGIN FOR E-MART STAFF ONLY"); 
        Button btn2=new Button("SELLING PORTAL");
        Button btn3=new Button("UPDATING STOCKS");
        Button back1=new Button("BACK");
        Button back2=new Button("BACK");
        Button enter=new Button("ENTER");
        Button close1=new Button("EXIT");
        Button bb=new Button("BILL REVIEW");
        Button paid=new Button("PAID");
        Button print=new Button("PRINT INVOICE");
        Button update=new Button("UPDATE");
        Button add=new Button("ADD NEW OBJECT");
        Button close2=new Button("EXIT");
        btn1.setMaxSize(1000,2);
        close1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px;-fx-background-color: #ff0000");
        close2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px;-fx-background-color: #ff0000");
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {int i=0;
                while(i<3){
                    i++;
                String input = JOptionPane.showInputDialog(null,"ENTER PASSWORD: ","SECURED ENTRY",JOptionPane.INFORMATION_MESSAGE);
                if(input.equals("1605409"))
                {
                    primaryStage.setScene(scene2);
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "WRONG PASSWORD....TRY AGAIN "+(3-i)+" CHANCES LEFT", "OOPS", JOptionPane.ERROR_MESSAGE);
                }
                if(i==3){System.exit(0);}
            }
            
            }  
        }); 
        btn2.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                primaryStage.setScene(scene3);
            }  
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                primaryStage.setScene(scene4);
                try
                {
                    ta2.appendText("CURRENT STOCK\n");
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt = conn.createStatement() ;
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM stocks ;" ) ;
                    while( rs.next())
                    ta2.appendText( "\n"+rs.getString(1)+"\t\t"+rs.getString(2)) ;
                    rs.close() ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                    {
                        System.out.println(e) ;
                    }
            }  
        });
        back1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) { 
                tf1.setText(null);tf2.setText(null);ta1.setText(null);objp=0;
                primaryStage.setScene(scene2);
            }  
        });
        back2.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                primaryStage.setScene(scene2);
            }  
        });
        close1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                System.exit(0);
            }  
        });
        close2.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                System.exit(0);
            }  
        });
        enter.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                String objn=tf1.getText();
                int qt=Integer.parseInt(tf3.getText());
                int temp=Integer.parseInt(tf2.getText());
                objp+=(temp*qt);
                ta1.appendText(objn+"\t\t\t"+temp+"\t\t\t"+qt+"\n");
                tf1.setText(null);tf2.setText(null);tf3.setText(null);
                tf4.setText("\u20B9"+" "+objp);
                try{
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt = conn.createStatement() ;
                    stmt.executeUpdate("update stocks set quant=(quant-"+qt+") where name=\""+objn+"\";" ) ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                {
                    System.out.println(e) ;
                }
            }  
        });
        bb.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                ta1.setText(null);
                primaryStage.setScene(scene5);
            }  
        });
        paid.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                String[] options = {"SELLING COUNTER", "MENU",};
                int x = JOptionPane.showOptionDialog(null, "CHOOSE WHERE TO GO",
                "PAID SUCCESSFULLY!!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){primaryStage.setScene(scene3);}
                if(x==1){primaryStage.setScene(scene2);}
            }  
        });
        print.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null,"NO PRINTER CONNECTED","OOPS!!",JOptionPane.WARNING_MESSAGE); 
            }  
        });
        update.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                String objn=tf5.getText();
                int qt=Integer.parseInt(tf6.getText());
                try{
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt=conn.createStatement() ;
                    stmt.executeUpdate("update stocks set quant=(quant+"+qt+") where name=\""+objn+"\";" ) ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                {
                    System.out.println(e) ;
                }
                try
                {
                    ta2.appendText("CURRENT STOCK\n");
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt = conn.createStatement() ;
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM stocks ;" ) ;
                    while( rs.next())
                    ta2.appendText( "\n"+rs.getString(1)+"\t\t"+rs.getString(2)) ;
                    rs.close() ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                    {
                        System.out.println(e) ;
                    }
                tf5.setText(null);tf6.setText(null);
            }  
        });
        add.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {
                String objn=tf5.getText();
                int qt=Integer.parseInt(tf6.getText());
                try{
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt=conn.createStatement() ;
                    stmt.executeUpdate("insert into stocks values(\""+objn+"\","+qt+");" ) ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                {
                    System.out.println(e) ;
                }
                try
                {
                    ta2.appendText("CURRENT STOCK\n");
                    Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
                    String url="jdbc:mysql://localhost:3306/e_mart?verifyServerCertificate=false&useSSL=true";
                    Connection conn = DriverManager.getConnection(url,"root","1605409") ;
                    Statement stmt = conn.createStatement() ;
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM stocks ;" ) ;
                    while( rs.next())
                    ta2.appendText( "\n"+rs.getString(1)+"\t\t"+rs.getString(2)) ;
                    rs.close() ;
                    stmt.close() ;
                    conn.close() ;
                }
                catch( Exception e )
                    {
                        System.out.println(e) ;
                    }
                tf5.setText(null);tf6.setText(null);
            }  
        });
        root1.setPadding(new Insets(100, 00, 00,0));
        root2.setPadding(new Insets(100, 00, 00,0));
        sell.setPadding(new Insets(100, 00, 00,0));
        bill.setPadding(new Insets(100, 00, 00,0));
        stock.setPadding(new Insets(100, 00, 00,0));
        root1.setHgap(50);
        root1.setVgap(50);
        root2.setHgap(50);
        root2.setVgap(50);
        sell.setHgap(50);
        sell.setVgap(5);
        bill.setHgap(50);
        bill.setVgap(50);
        stock.setHgap(50);
        stock.setVgap(50);
        root1.add(t1,15,0);
        root1.add(btn1,15,7);
        root1.add(close1,25,0);
        root2.add(t2,9,3);
        root2.add(t3,9,6);
        root2.add(btn2,12,3);
        root2.add(btn3,12,6);
        root2.add(t10,12,0);
        root2.add(close2,12,9);
        sell.add(back1,13,0);
        sell.add(t4,8,0);
        sell.add(t5,3,25);
        sell.add(t6,3,26);
        sell.add(t7,3,27);
        sell.add(tf1,5,25);
        sell.add(tf2,5,26);
        sell.add(tf3,5,27);
        sell.add(ta1,8,26);
        sell.add(enter,4,42);
        sell.add(bb,10,42);
        bill.add(t8,8,0);
        bill.add(t9,3,3);
        bill.add(tf4,6,3);
        bill.add(paid,8,8);
        bill.add(print,9,8);
        stock.add(back2,13,0);
        stock.add(t11,10,0);
        stock.add(t12,5,3);
        stock.add(t13,5,4);
        stock.add(tf5,6,3);
        stock.add(tf6,6,4);
        stock.add(update,9,3);
        stock.add(add,9,4);
        stock.add(ta2,10,3);
        primaryStage.setTitle("E-MART SERVER LOGIN");  
        primaryStage.setScene(scene1);  
        primaryStage.show();
    }  
    public static void main (String args[])  
    {  
        launch(args);  
    }  
  
}
package Half;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


public class ProjCalc extends Application 
{
	 public static String value="";
    public static Text output;
    private double number1 = 0.0;
    private String operator = "";
    private boolean start = true;
    ArrayList<String> list=new ArrayList<>();
	ArrayList<String> l1=new ArrayList<>();
	ArrayList<String> l2=new ArrayList<>();
	String x="",n="",m,k;
	char y='0';
	double x1,y1,result=0.0;
 @Override // Override the start method in the Application class
 public void start(Stage primaryStage)
 {
	 Rectangle R= new Rectangle(25,10,60,30);
	 R.setFill(Color.WHITE);
	 R.setWidth(360);
	 R.setHeight(70);
	 R.setStroke(Color.BLUE);

	 Text tf = new Text();
	 tf.setTextAlignment(TextAlignment.CENTER);

	 HBox h1=new HBox();
	 Button b7=new Button("7");
	 b7.setMinSize(50,40);
	 Button b8=new Button("8");
	 b8.setMinSize(50, 40);
	 Button b9=new Button("9");
	 b9.setMinSize(50, 40);
	 Button sum=new Button("+");
	 sum.setMinSize(50, 40);
	 Button sub=new Button("-");
	 sub.setMinSize(50, 40);
	 Button left=new Button("(");
	 left.setMinSize(50, 40);
	 Button right=new Button(")");
	 right.setMinSize(50, 40);
	 h1.setSpacing(1);
	 h1.setAlignment(Pos.CENTER);
	 h1.getChildren().addAll(b7,b8,b9,sum,sub,left,right);
	 
	 HBox h2=new HBox();
	 Button b4=new Button("4");
	 b4.setMinSize(50, 40);
	 Button b5=new Button("5");
	 b5.setMinSize(50, 40);
	 Button b6=new Button("6");
	 b6.setMinSize(50, 40);
	 Button multi=new Button("x");
	 multi.setMinSize(50, 40);
	 Button div=new Button("/");
	 div.setMinSize(50, 40);
	 Button sqrt=new Button("√");
	 sqrt.setMinSize(50, 40);
	 Button square=new Button("x²");
	 square.setMinSize(50, 40);
	 h2.setSpacing(1);
	 h2.setAlignment(Pos.CENTER);
	 h2.getChildren().addAll(b4,b5,b6,multi,div,sqrt,square);
	
	 HBox h3=new HBox();
	 Button b1=new Button("1");
	 b1.setMinSize(50, 40);
	 Button b2=new Button("2");
	 b2.setMinSize(50, 40);
	 Button b3=new Button("3");
	 b3.setMinSize(50, 40);
	 Button arrow=new Button("<--");
	 arrow.setMinSize(50, 40);
	 Button C=new Button("C");
	 C.setMinSize(50, 40);
	 Button mod=new Button("%");
	 mod.setMinSize(50, 40);
	 Button dot=new Button(".");
	 dot.setMinSize(50, 40);
	 h3.setSpacing(1);
	 h3.setAlignment(Pos.CENTER);
	 h3.getChildren().addAll(b1,b2,b3,arrow,C,mod,dot);
	
	 HBox h4=new HBox();
	 Button b0=new Button("0");
	 b0.setMinSize(50, 40);
	 Button equal=new Button("=");
	 equal.setMinSize(308, 40);
	 h4.setSpacing(1);
	 h4.setAlignment(Pos.CENTER);
	 h4.getChildren().addAll(b0,equal);


	 VBox v=new VBox(); 
	 v.setAlignment(Pos.CENTER);
	 v.setSpacing(1);
	 v.setPrefHeight(300);
	 v.setPrefWidth(380);
	v.getChildren().addAll(R,tf,h1,h2,h3,h4);
	
	//---------------------------------------------events-----------------------------------------------------------//

	b0.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b0.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	b1.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b1.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	b2.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b2.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );
	b3.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b3.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );
	b4.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b4.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );
	b5.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b5.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	b6.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b6.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );
	b7.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b7.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	b8.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b8.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	b9.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=b9.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	dot.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
			value=dot.getText();
	         tf.setText(tf.getText() + value);

		}
		 }
		 );

	sum.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	            operator = "+";
	            number1 = Double.parseDouble(tf.getText());
	            tf.setText("");		
		}
		 }
		 );
	sub.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	            operator = "-";
	            number1 = Double.parseDouble(tf.getText());
	            tf.setText("");		
		}
		 }
		 );
	multi.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	            operator = "x";
	            number1 = Double.parseDouble(tf.getText());
	            tf.setText("");		
		}
		 }
		 );
	div.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	            operator = "/";
	            number1 = Double.parseDouble(tf.getText());
	            tf.setText("");		
		}
		 }
		 );

	sqrt.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
            num2=Math.sqrt(num2);
           tf.setText(String.valueOf(num2));
       	return;
        }
	 }
		 );
	square.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

            double num1 = Double.parseDouble(tf.getText());
            num1=num1*num1;
           tf.setText(String.valueOf(num1));
       	return;
		}
		 }
		 );

	mod.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	            operator = "%";
	            number1 = Double.parseDouble(tf.getText());
	            tf.setText("");		
		}
		 }
		 );

	C.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
	    	tf.setText("");
        	return;
    		}
		 }
		 );

	arrow.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			if (start) {
	            tf.setText("");
	            start = false;
	        }
		//	 value = ((Button)e.getSource()).getText();
		/*	int valueArrow=value.length()-1;
			char valueChar;
			String[] arr=new String[100];
			for (int i =0;i<valueArrow;i++)
			{
				
				 valueChar=value.charAt(i);
				// arr[i]=valueChar;
		         tf.setText(tf.getText() + valueChar);

			}
			*/


		}
		 }
		 );

	Scene scene = new Scene(v,390,300);
    primaryStage.setResizable(false);
	 primaryStage.setTitle("Tashenrechner"); // Set the stage title
	 primaryStage.setScene(scene); // Place the scene in the stage
	 primaryStage.show();
 }
 public static void main(String[] args)
 {
     Application.launch(args);
 }
 
 
public String Set_m(String m)
{
	m="s";
	return m;
}
public String Set_k(String k)
{
	k="r";
	return k;
}

}
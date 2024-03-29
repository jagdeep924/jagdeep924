PK  Գ�V              META-INF/MANIFEST.MF��  �M��LK-.�K-*��ϳR0�3���� PK��      PK
    h��V"UI��  �     week6/Tiles.class����   = u  week6/Tiles  java/lang/Object floorLength D 
floorWidth 
tileLength 	tileWidth 	floorArea tileArea report <init> ()V Code
     LineNumberTable LocalVariableTable this Lweek6/Tiles; 
(DDDDDDD)V	    	    	    	   	 	    
 	  "   
Numoftiles getFloorLength ()D setFloorLength (D)V getFloorWidth setFloorWidth getTileLength setTileLength getTileWidth setTileWidth getFloorArea setFloorArea getTileArea setTileArea Input 4 java/util/Scanner	 6 8 7 java/lang/System 9 : in Ljava/io/InputStream;
 3 <  = (Ljava/io/InputStream;)V	 6 ? @ A out Ljava/io/PrintStream; C Enter floorlength
 E G F java/io/PrintStream H I println (Ljava/lang/String;)V
 3 K L % 
nextDouble N Enter floorwidth P Enter tile length R Enter tile width scanner Ljava/util/Scanner; outputReport W java/lang/StringBuilder Y floorlength:
 V [  I
 V ] ^ _ append (D)Ljava/lang/StringBuilder;
 V a b c toString ()Ljava/lang/String;   	 h Area of floor
 j l k java/lang/Math m n ceil (D)D p Area of tile r Total tiles needed: 
SourceFile 
Tiles.java !                      	     
                      3     *� �       
                          �     '*� *'� *)� *� *� *	� *� !�       "        	 !  "  #  $   % & )    R    '       '      '      '      ' 	     ' 
  	   '      ' #    $ %     /     *� �           1              & '     >     *'� �       
    4  5                    ( %     /     *� �           7              ) '     >     *'� �       
    :  ;                    * %     /     *� �           =              + '     >     *'� �       
    @  A                    , %     /     *� �           C              - '     >     *'� �       
    F  G                	    . %     /     *� �           I              / '     >     *'� �       
    L  M                
    0 %     /     *� !�           P              1 '     >     *'� !�       
    S  T                    
 %     4     
*� *� k�           X        
       %     4     
*� *� k�           \        
      2      �     L� 3Y� 5� ;L� >B� D*+� J� � >M� D*+� J� � >O� D*+� J� � >Q� D*+� J� �       * 
   a  b  c  d # e + f 3 g ; h C i K k        L      A S T   U          Ҳ >� VYX� Z*� � \� `� D� >� VYd� Z*� � \� `� D� >� VYe� Z*� � \� `� D� >� VYf� Z*� � \� `� D� >� VYg� Z*� *� k� i� \� `� D� >� VYo� Z*� *� k� i� \� `� D� >� VYq� Z*� *� k*� o*� k� i� \� `� D�       "    q  r 2 s K t d u � v � w � {        �      s    tPK
    g��V���V  V     week6/Tiles.javapackage week6;
import java.util.Scanner;
public class Tiles {
	
	/*
	 * Created by:Jagdeep Kaur
	 * Professor name: Sapinderjit Kaur
	 * Student id:041113379
	 * Created on:16 June,2023
	 * Calculating the Floor Area,Tile area and total required tiles
	 */
	
	
	//declaring variables
	 private double floorLength;
	 private double floorWidth;
	 private double tileLength;
	private double tileWidth;
	private double floorArea;
	private double tileArea;
	private double report;
	
	
	
	
	public Tiles()//no argument
	{
	}
	public Tiles(double floorLength, double floorWidth,double tileLength,double tileWidth,double
			floorArea, double tileArea,double Numoftiles)//passing argument(overloaded constructor)
	{
		this.floorLength=floorLength;
		this.floorWidth=floorWidth;
		this.tileLength=tileLength;
		this.tileWidth=tileWidth;
		this.floorArea=floorArea;
		this.tileArea=tileArea;
		
		
		
	}
	/**
	 * 
	 * @return area of floor, area of tile and total required tiles
	 */
	
	// Generating getter setter for declared variables
	public double getFloorLength() {
		return floorLength;
	}
	public void setFloorLength(double floorLength) {
		this.floorLength = floorLength;
	}
	public double getFloorWidth() {
		return floorWidth;
	}
	public void setFloorWidth(double floorWidth) {
		this.floorWidth = floorWidth;
	}
	public double getTileLength() {
		return tileLength;
	}
	public void setTileLength(double tileLength) {
		this.tileLength = tileLength;
	}
	public double getTileWidth() {
		return tileWidth;
	}
	public void setTileWidth(double tileWidth) {
		this.tileWidth = tileWidth;
	}
	public double getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}
	
	public double getTileArea() {
		return tileArea;
	}
	public void setTileArea(double tileArea) {
		this.tileArea = tileArea;
	}
	
	public double floorArea()
	{
	return floorLength*floorWidth;
	 }
	public double tileArea()
	 {
	return tileLength*tileWidth;
	 }
	
	//Printing input to console
	public void Input()
	{Scanner scanner= new Scanner (System.in);
	System.out.println("Enter floorlength");
	floorLength=scanner.nextDouble();
	System.out.println("Enter floorwidth");
	floorWidth=scanner.nextDouble();
	System.out.println("Enter tile length");
	tileLength=scanner.nextDouble();
	System.out.println("Enter tile width");
	tileWidth=scanner.nextDouble();
	
	}
	

	//Creating outputReport
	public void outputReport()
	{
		System.out.println("floorlength:"+floorLength);
		System.out.println("floorWidth"+floorWidth);
		System.out.println("tileLength"+tileLength);
		System.out.println("tileWidth"+tileWidth);
		System.out.println("Area of floor"+Math.ceil(floorLength*floorWidth));
		System.out.println("Area of tile"+Math.ceil(tileLength*tileWidth));
		System.out.println("Total tiles needed:"+(Math.ceil((floorLength*floorWidth/tileLength*tileWidth))));
					
		
		
	}
	
	
}
PK   Գ�V��                      META-INF/MANIFEST.MF��  PK
 
    h��V"UI��  �               a   week6/Tiles.classPK
 
    g��V���V  V               (  week6/Tiles.javaPK      �   �    
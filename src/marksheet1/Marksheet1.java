package marksheet1;

import java.util.Scanner;

public class Marksheet1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int SNo1,SNo2,SNo3;
		String name1,name2,name3;
		int sub11,sub21,sub31,sub41,sub51;
		int sub12,sub22,sub32,sub42,sub52;
		int sub13,sub23,sub33,sub43,sub53;
		System.out.print("Enter Student Name 1: ");
		name1=input.nextLine();
		System.out.print("Enter Student Name 2: ");
		name2=input.nextLine();
		System.out.print("Enter Student Name 3: ");
		name3=input.nextLine();
		System.out.print("Enter SNo1: ");
		SNo1=input.nextInt();
		System.out.print("Enter SNo2: ");
		SNo2=input.nextInt();
		System.out.print("Enter SNo3: ");
		SNo3=input.nextInt();
		System.out.print("Enter Sub11: ");
		sub11=input.nextInt();
		System.out.print("Enter Sub12: ");
		sub12=input.nextInt();
		System.out.print("Enter Sub13: ");
		sub13=input.nextInt();
		System.out.print("Enter Sub21: ");
		sub21=input.nextInt();
		System.out.print("Enter Sub22: ");
		sub22=input.nextInt();
		System.out.print("Enter Sub23: ");
		sub23=input.nextInt();
		System.out.print("Enter Sub31: ");
		sub31=input.nextInt();
		System.out.print("Enter Sub32: ");
		sub32=input.nextInt();
		System.out.print("Enter Sub33: ");
		sub33=input.nextInt();
		System.out.print("Enter Sub41: ");
		sub41=input.nextInt();
		System.out.print("Enter Sub42: ");
		sub42=input.nextInt();
		System.out.print("Enter Sub43: ");
		sub43=input.nextInt();
		System.out.print("Enter Sub51: ");
		sub51=input.nextInt();
		System.out.print("Enter Sub52: ");
		sub52=input.nextInt();
		System.out.print("Enter Sub53: ");
		sub53=input.nextInt();
		//student totals
		int total1=(sub11+sub21+sub31+sub41+sub51);
		int total2=(sub12+sub22+sub32+sub42+sub52);
		int total3=(sub13+sub23+sub33+sub43+sub53);
		//student avrg
		int avg1=(total1/5);
		int avg2=(total2/5);
		int avg3=(total3/5);
		//unit totals
		int totalsub1=(sub11+sub12+sub13);
		int totalsub2=(sub21+sub22+sub23);
		int totalsub3=(sub31+sub32+sub33);
		int totalsub4=(sub41+sub42+sub43);
		int totalsub5=(sub51+sub52+sub53);
		//unit avrg
		int avgsub1=(totalsub1/3);
		int avgsub2=(totalsub2/3);
		int avgsub3=(totalsub3/3);
		int avgsub4=(totalsub4/3);
		int avgsub5=(totalsub5/3);

		System.out.println("Welcome to Student Mark List Application");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("SNo  Student Name          Sub1     Sub2     Sub3     Sub4     Sub5     Total     Average");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println(SNo1+"    "+name1+"                "+sub11+"       "+sub21+"       "+sub31+"       "+sub41+"       "+sub51+"       "+total1+"       "+avg1);
		System.out.println(SNo2+"    "+name2+"               "+sub12+"       "+sub22+"       "+sub32+"       "+sub42+"       "+sub52+"      "+total2+"       "+avg2);
		System.out.println(SNo3+"    "+name3+"             "+sub13+"       "+sub23+"       "+sub33+"       "+sub43+"       "+sub53+"       "+total3+"       "+avg3);
		System.out.println("                           "+avgsub1+"       "+avgsub2+"       "+avgsub3+"       "+avgsub4+"       "+avgsub5);
		System.out.println("-------------------------------------------------------------------------------------------------");

	}

}

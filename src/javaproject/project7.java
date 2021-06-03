package javaproject;


public class project7 {
	public static void main(String[] args) {
	double[][] student = {{90,80,80},
			{85,85,95},
			{95,70,75},
			{80,80,90},
			{90,75,80}};
	double[] sum = new double[5];
	for(int i=0;i<5;i++) {
		for(int j=0;j<3;j++) {
			sum[i] += student[i][j];
		}
		double av;
		av=sum[i]/3;
		System.out.println("ID="+i+" : "+"ÇÕ°è = "+sum[i]+" Æò±Õ = "+(Math.round(av*100)/100.0));
	}
	}
}

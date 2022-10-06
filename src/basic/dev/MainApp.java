package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten ");
		String ten = sc.nextLine();
		
		System.out.println("nhap vao msv");
		String msv = sc.nextLine();
		
		System.out.println("nhap vao cmnd");
		String cmnd = sc.nextLine();
		
		System.out.println("nhap vao ten lop");
		String tenLop = sc.nextLine();
		
		System.out.println("nhap vao ten truong");
		String tenTruong = sc.nextLine();
		
		System.out.println("nhap vao dtb");
		double dtb = sc.nextDouble();
		
		
		System.out.println("nhap vao ten cn");
		String tenCN =  sc.nextLine();
		
		System.out.println("nhap vao dia chi");
		String diaChi = sc.nextLine();
		
		System.out.println("nhap vao sdt");
		String sdt = sc.nextLine();
		
		System.out.println("nhap vao he so luong");
		String heSoLuong = sc.nextLine();
		
		
		System.out.println("nhap vao ten xe");
		String tenXe = sc.nextLine();
		
		System.out.println("nhap vao hang");
		String hang = sc.nextLine();
		
		System.out.println("nhap vao gia");
		String gia = sc.nextLine();
		
		System.out.println("nhap vao mau son");
		String mauSon = sc.nextLine();
		
		System.out.println("Ten:" + ten + "-Msv:" + msv + "-Cmnd:" + cmnd + "-Ten Lop:" + tenLop + "-Ten Truong:" + tenTruong + "-Dtb:" + dtb);
		System.out.println("Ten CN: " + tenCN + "-Dia Chi:" + "-Sdt:" + sdt + "-He So Luong:" + heSoLuong);
		System.out.println("Ten Xe:" + tenXe + "-Hang:" + hang + "-Gia:" + gia + "-Mau Son:" + mauSon);
        
	}

}

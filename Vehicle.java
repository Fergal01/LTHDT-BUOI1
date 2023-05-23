
package btthuchanh;
import java.util.Scanner;
public class Vehicle {
private String TenChuXe;
private String LoaiXe;
private int DungTich;
private int GiaTri;
public Vehicle(){
    
}
    public Vehicle(String TenChuXe, String LoaiXe, int DungTich, int GiaTri) {
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.DungTich = DungTich;
        this.GiaTri = GiaTri;
    }    


    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setTenChuXe(String TenChuXe) {
        this.TenChuXe = TenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public double getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public double ThuePhaiNop(){
       double ThuePhaiNop = 0;
       if(DungTich < 100){
           ThuePhaiNop = 0.01*GiaTri;
       }
        if(DungTich >= 100 && DungTich < 200){
               ThuePhaiNop = 0.03*GiaTri;
           }
        if(DungTich > 200){
            ThuePhaiNop = 0.05*GiaTri;
        }
    return ThuePhaiNop;    
    }
    public void Nhap(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten Chu Xe: ");
        TenChuXe = sc.nextLine();
        System.out.println("Loai Xe: ");
        LoaiXe = sc.nextLine();
        System.out.println("Gia Tri: ");
        GiaTri = sc.nextInt();
        System.out.println("Dung Tich: ");
        DungTich = sc.nextInt();
}
  public void Xuat(){
       System.out.println("Ten Chu Xe: "+this.TenChuXe);
       System.out.println("Loai Xe: "+this.LoaiXe);
       System.out.println("Gia Tri: "+this.GiaTri);
       System.out.println("Dung Tich: "+this.DungTich);
       System.out.println("ThuePhaiNop: "+ThuePhaiNop());
  }
static void menu(){
    int choice = 0;
    do{
    System.out.println("-----------------Chon Chuc Nang----------------!");
    System.out.println("1.Nhap Xe duoi 50: ");
    System.out.println("2.Nhap Xe tu 100cc-200cc: ");
    System.out.println("3.Nhap xe tren 200cc:");
    System.out.println("4.Thoat");
    System.out.println("-------------------------------------------------");
    switch(choice){
        case 1 -> {
            Vehicle vehicle = new Vehicle();
            vehicle.Nhap();
           break; }
        
        case 2 -> {
            for () {
                Vehicle vehicle = new Vehicle();
                vehicle.ThuePhaiNop();
            break; }
           
            }
        case 3 -> System.out.println("Cam on ban da su dung chuong trinh!!");
                default -> System.out.println("Ban da chon sai chuc nang. Moi chon lai.");
            }
        } while (choice != 3);
    }
            
  

    public static void main(String[] args) {
     Vehicle xe1 = new Vehicle();
     Vehicle xe2 = new Vehicle();
     Vehicle xe3 = new Vehicle();
      xe1.Nhap();
      xe2.Nhap();
      xe3.Nhap();
      xe1.Xuat();
      xe2.Xuat();
      xe3.Xuat();
      
    } 
}

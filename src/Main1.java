public class Main1 {
    public static void main(String[] args){
        HinhChuNhat a=new HinhChuNhat(4,5);
        System.out.println("Dài = " + a.dai);
        System.out.println("Rộng = " + a.rong);
        float chuvi=a.chuvi();
        System.out.println("chu vi = " +chuvi);
        float dientich=a.dientich();
        System.out.println("dien tich = " +dientich);
    }

}

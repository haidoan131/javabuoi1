//import java.util.Scanner;
//
//public class Main {
//    public static void ghichu(){
////        Main main=new Main();
////        main.calculateSum(2,3);
//
////        System.out.println("sum= " + calculateSum(2,3));
//        //dùng sc.nextLine() xóa bộ nhớ đệm nếu ko nhập dc
//
////        System.out.print("Nhập tên của bạn");
////        String name=scanner.nextLine();
////        int age;
////        boolean flag=false;
////        while (!flag)
////        {
////            try{
////
////                    System.out.print("Nhập tuổi của bạn");
////                    age = scanner.nextInt();
////                    System.out.print("tuổi của bạn" + age);
////
////
////            } catch (Exception e) {
////                System.out.print(e.getMessage());
////            }
////            finally {
////
////            }
////        }
//
////        System.out.print("Nhập chiều cao của bạn");
////        double hegiht=scanner.nextDouble();
////
////        System.out.print(" chiều cao của bạn:"+hegiht);
////        System.out.print("tên: "+name);
////        System.out.print("Nhập a ");
////        int a= scanner.nextInt();
////        System.out.print("Nhập b ");
////        int b= scanner.nextInt();
////
////        System.out.println("kết quả tổng : " + (a+b));
////        System.out.println("kết quả hiệu : " + (a-b));
////        System.out.println("kết quả tích : "+a*b);
////        System.out.println("kết quả dư : "+  a%b);
////        System.out.println("kết quả thương : "+  (double)a/b);
////
////        System.out.println("a/b : "+ (float) a/b);
////        System.out.println("a/b : "+  a*1.0 /b);
////        System.out.println("a/b : "+  a/(b*1.0));
//
//    }
//    public static int calculateSum(int a , int b){
//        return a+b;
//    }
//    public static int inputNumber(String name){
//        Scanner sc=new Scanner(System.in);
//        boolean validInput=false;
//        int value=0;
//        while(!validInput){
//            try{
//                float a=0;
//                double b=0;
//                System.out.printf("Nhập %s của bạn " ,name);
//                value=sc.nextInt();
//                sc.nextLine();
//                validInput=true;
//
//            } catch (Exception e) {
//                System.out.println("bạn phải nhập một số nguyên hợp lệ");
//                sc.next();
//            }
//        }
//        return value;
//    }
//    public static void nhapXuat(){
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("nhập tên của bạn ");
//        String name= scanner.nextLine();
//        int age=0;
//        int height=0;
//        age=inputNumber("tuổi");
//        height=inputNumber("chiều cao");
//        System.out.println("tên  " +name);
//        System.out.println("chiều cao  " +height);
//        scanner.close();
//    }
//    public static void tinhCung (){
//        Scanner scanner =new Scanner(System.in);
//        int ngay,thang;
//        ngay=inputNumber("ngày");
//        thang=inputNumber("tháng");
//
//        if(ngay<=0 || ngay >=32 || thang<=0 || thang >=13 ){
//            System.out.println("ngày hoac tháng không hợp lệ");
//        }else{
//            if((thang==3&&ngay>=21)||(thang==4&&ngay<=19)){
//                System.out.println("Bạch Dương (Aries)");
//            }
//            else if((thang==4&&ngay>=20)||(thang==5&&ngay<=20)){
//                System.out.println("Kim Ngưu (Taurus)");
//            }
//            else if((thang==5&&ngay>=21)||(thang==6&&ngay<=20)){
//                System.out.println("Song Tử (Gemini)");
//            }
//            else if((thang==6&&ngay>=21)||(thang==7&&ngay<=22)){
//                System.out.println("Cự Giải (Cancer):");
//            }
//            else if((thang==7&&ngay>=23)||(thang==8&&ngay<=22)){
//                System.out.println("Sư Tử (Leo)::");
//            }
//            else if((thang==8&&ngay>=23)||(thang==9&&ngay<=22)){
//                System.out.println("Xử Nữ (Virgo):");
//            }
//            else if((thang==9&&ngay>=23)||(thang==10&&ngay<=22)){
//                System.out.println("Thiên Bình (Libra):");
//            }
//            else if((thang==10&&ngay>=23)||(thang==11&&ngay<=21)){
//                System.out.println("Bọ Cạp (Scorpio):");
//            }
//            else if((thang==11&&ngay>=22)||(thang==12&&ngay<=21)){
//                System.out.println("Nhân Mã (Sagittarius)");
//            }
//            else if((thang==12&&ngay>=22)||(thang==1&&ngay<=19)){
//                System.out.println("Ma Kết (Capricorn):");
//            }
//            else if((thang==1&&ngay>=20)||(thang==2&&ngay<=18)){
//                System.out.println("Bảo Bình (Aquarius): ");
//            } else if((thang==2&&ngay>=19)||(thang==3&&ngay<=20)){
//                System.out.println("Song Ngư (Pisces) ");
//            }
//        }
//
//
//
//    }
//
//    public static String cachcuathay(int day,int month){
//        if(month==1){
//            return (day<=19) ?"Ma kết" : "bảo bình";
//        }else if(month==2){
//            return (day<=18) ? "bảo bình" :"song ngư";
//        }else if(month==3){
//            return (day<=20) ? "song ngư" : "bạch dương";
//        }else if(month==4){
//            return (day<=19)?"bạch dương":"kim ngưu";
//        }
//        else{
//            return "ngày hoặc tháng không hợp lệ";
//        }
//    }
////    Bài tập 2: Thần số học, tính số đời( số chủ đạo): Nhập ngày tháng năm từ bàn phím
////    Số đời (Life Path Number) được tính từ ngày tháng năm sinh bằng cách cộng tất cả các chữ số trong ngày, tháng và năm sinh, rồi tiếp tục rút gọn kết quả về một chữ số từ 1 đến 9 (hoặc số 11, 22, 33 - các số thầy phong).
////    Ví dụ:
////    Ngày sinh: 15
////    Tháng sinh: 8
////    Năm sinh: 1990
////    Cách tính:
////    Cộng tất cả các chữ số: 1 + 5 + 8 + 1 + 9 + 9 + 0 = 33
////    Rút gọn số 33 thành một chữ số: 3 + 3 = 6
////    Số đời trong ví dụ trên là 6.
//
////    public static void main(String[] args) {
////      //  nhapXuat();
////        tinhCung();
////    }
//}
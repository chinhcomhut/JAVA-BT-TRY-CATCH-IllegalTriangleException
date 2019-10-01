import java.util.Scanner;

public class CheckIllegalTriangleException {
    public static void IllegalTriangleException(int side1, int side2, int side3){
        if((side1+side2<side3)||(side1+side3<side2)||(side2+side3<side1)||(side1<0)||(side2<0)||(side3<0)){
            System.out.println("Không phải là 3 cạnh tam giác");
        }else {
            System.out.println("Đây là 3 cạnh tam giác");
        }
    }

    public static void main(String[] args) {
        Triangle tr = new Triangle(4,-1,3);
        try{
            boolean result = tr.check();
            if (result){
                System.out.println(">>> tam giac nhap vao hop le");
            } else{
                System.out.println(">>> tam giac ko hop le");
            }
        } catch (Exception ex){
            System.out.println(">>> ko xac dinh!");
            ex.printStackTrace();
        }

        if (2>1) return;


        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất:");
        int a = input.nextInt();
        System.out.println("Nhập vào cạnh thứ hai: ");
        int b = input.nextInt();
        System.out.println("Nhập vào cạnh thứ ba:");
        int c = input.nextInt();
        IllegalTriangleException(a,b,c);
//        try {
//            IllegalTriangleException(a,b,c);
//        }
//        catch (IndexOutOfBoundsException e){
//        }

    }


}

class Triangle{
    private int a, b, c;
    public Triangle(int a,int b, int c){
        setEdge(a, b, c);
    }
    public void setEdge(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean check(){
        boolean flag = false;
        if (a<0 || b<0 || c<0){
            throw new IllegalTriangleException("loi: canh cua tam giac <0");
        }
        if (a+b>c || a+c>b || b+c>a) {
            flag = true;
        }
        return flag;
    }

}
class IllegalTriangleException extends RuntimeException{

    public IllegalTriangleException(String msg) {
        super(msg);
    }
}

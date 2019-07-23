class Main {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.m1();
        System.out.println("Main");
 }
}

class Demo1{ 
    public void m1(){
        Demo2 demo2 = new Demo2();
        try{
            System.out.println("TRY");
            demo2.m2();
        }catch(Exception e){
            System.out.println("CATCH");
            System.out.println(e);
        }finally{
            System.out.println("Finally Calledd.");
        }
    }
}         
class Demo2{
    public void m2(){    
        int a =4, b = 2, c;
        c = a / b;
        System.out.println(c);
    }
}   
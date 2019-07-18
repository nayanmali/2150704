class Main{
    public static void main(String args[]){
        Outter.m1();
              
    }
}
class Outter{
    public static void m1(){              
        class InnerClass{
            public void m2(){
                System.out.println("Inner Class M2 Method");
            }
        }          
        InnerClass inner = new InnerClass();
        inner.m2();
    }
}
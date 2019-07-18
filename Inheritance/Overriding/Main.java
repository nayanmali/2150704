class Two{
    public final void toStart(){
        System.out.println("Kick");
    }
}
class Activa extends Two{
    public void toStart(){
        System.out.println("Kick + Self");
    }
}
class Scooty extends Two{

}
class Main{
    public static void main(String args[]){
        Activa activa = new Activa();
        activa.toStart();

        Scooty scooty = new Scooty();
        scooty.toStart();
    }
}



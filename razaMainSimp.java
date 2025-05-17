public class razaMainSimp extends RazaSimpleInherit {
    void display(){
        roll=27;
        marks=90.90;
        name="Razaul karim";
        System.out.println(roll+" "+ marks+" "+name);

    }
    public static void main(String[] args) {
        
    
    razaMainSimp ref=new razaMainSimp();
    ref.show();
    ref.display();
   
    }
}

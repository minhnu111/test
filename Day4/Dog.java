import java.util.Scanner;

public class Dog {
    public void bark(){
        System.out.println("woof");
    }
}
class Fox extends Dog{
    @Override
    public void bark() {
        System.out.println("yack");
    }
}
class Nu{
    public static void main(String[] args){
        Fox a = new Fox();
        a.bark();
        Param b = new Param();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        b.yoi(x);
    }
}
class Param{
    public void yoi()
    {
        System.out.println("yoi yoi");
    }
    public void yoi(int x){
        for(int i = 0; i < x; i ++){
            this.yoi();
        }
    }
}



package Day7;

interface Operation{
    int execute(int a,int b);
}
//class Add implements Operation{
//
//    @Override
//    public int execute(int a, int b) {
//        return a+b;
//    }
//}
//class Sub implements Operation{
//
//    @Override
//    public int execute(int a, int b) {
//        return a-b;
//    }
//}
public class Lambda {
    public static void main(String[] args) {
        Operation add = (a,b) -> a+b;
        System.out.println(add.execute(10,20));

        Operation sub=(a,b)->a-b;
        System.out.println(sub.execute(50,20));

    }
}

public class While {
    public static void main(String[] args) {
        //WhileExample(2);
        DoWhileExample(2);
        DoWhileExample(5);
    }

    //dùng để thực thi nhiều lần 1 đoạn code khi điều kiện vẫn còn đúng
    //dùng khi không xác định được số lần lặp
    public  static void WhileExample(int value){
        System.out.println("** While **");
        while(value < 5){
            System.out.println("Value = " + value);
            value++;
        }
    }

    //tương tự như "while" nhưng nó thực hiện ít nhất 1 lần
    public  static void DoWhileExample(int value){
        System.out.println("** Do While **");
        do{
            System.out.println("Value = " + value);
            value++;
        }while(value < 5);
    }

}

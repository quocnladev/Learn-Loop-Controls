public class Break {
    public static void main(String[] args){
        //BreakExample(5);
        ContinueExample(5);
    }

    //"break" giúp chương trình thoát khỏi vòng lặp khi đạt được điều kiện
    public static void BreakExample(int value){
        System.out.println("** Break **");

        while(value < 10){
            System.out.println("====================");
            System.out.println("Value = " + value);
            if(value == 7) break;
            value++;
            System.out.println("Next Value = " + value);
        }
        System.out.println("** Done **");
    }

    //khi bắt gặp lệnh "continue", ctrình sẽ bỏ qua đoạn code phía dưới nếu điều khiện sai
    public static void ContinueExample(int value){
        System.out.println("** Break **");

        while(value < 10){
            System.out.println("====================");
            System.out.println("Value = " + value);
            value++;
            if(value % 2 == 1) continue;
            System.out.println("Next Value = " + value);
        }
        System.out.println("** Done **");
    }
}

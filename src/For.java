public class For {
    public static void main(String[] args) {
        //ForExample(5);
        //Foreach();
        EnhancedForExample();
    }
    //biết chính xác số lần lặp thì dùng "for" thay vì "while"
    public static void ForExample(int value){
        System.out.println("** For **");
        for(int i = 0; i< value; i++) {
            System.out.println(i);
        }
    }

    //dùng để duyệt qua mảng hoặc tập hợp, di chuyển từ pt đầu tiên -> cuối
    public static void Foreach(){
        System.out.println("** Foreach **");
        String[] arrs = new String[]{"Cuoi", "Ky", "Qua", "Mon"};
        for(String arr : arrs){
            System.out.println(arr);
        }
    }

    //nâng cao trong Java 5
    public static void EnhancedForExample(){
        System.out.println("** Enhanced For **");
        String[] arrs = {"Cuoi", "Ky", "Qua", "Mon"};
        int [] numbers = {10, 20, 30, 40, 50};

        for(int i : numbers) {
            System.out.println(i);
        }
        System.out.println("**====================**");
        for(String str : arrs) {
            System.out.println(str);
        }
    }
}

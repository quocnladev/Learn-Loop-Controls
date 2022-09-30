public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BreakLabel();
        //ContinueLabel();
    }

    public static void BreakLabel() {
        System.out.println("Labelled Loop Break example");
        int i = 0;

        label1: while (i < 5) {
            System.out.println("i = " + i);
            i++;

            label2: for (int j = 0; j < 3; j++) {
                System.out.println("  --> " + j);
                if (j > 2) {
                    // Thoát khỏi vòng lặp có nhãn label1.
                    break label1;
                }
                if(i>2){
                    break label2;
                }
            }
        }
    }
    public static void ContinueLabel () {

        System.out.println("Labelled Loop Continue example");
        int i = 0;

        label1: while (i < 5) {
            System.out.println("outer i= " + i);
            i++;

            label2: for (int j = 0; j < 4; j++) {
                if (j >1) {
                    continue label2;
                }
                if (i > 1) {
                    continue label1;
                }
                System.out.println("inner i= " + i + ", j= " + j);
            }
        }
    }
}
public class breakcontinue {
    public static void main(String[] args) {
        //Break
        for (int i = 0; i < 10; i++) {
            if(i==4) {
                break;
            }
            System.out.println(i);
        }
        
        //Continue
        for (int i = 0; i < 10; i++) {
            if(i==4) {
                continue;
            }
            System.out.println(i);
        }

        int q = 0;
        while (q < 10) {
            System.out.println(q);
            q++;
            if (q == 4) {
                q++;
                continue;
            }
            
        }
    }
}
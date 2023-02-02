public class toplama{

    public static void main(String[] args) {
        // 1 ile 5 (dahil) arasindaki sayilari topla
        int topla = 0;
        for (int i=1; i<=5; i++) {
            topla+=i;
            
        }
        System.out.println("1-5 arasi sayilarin toplami = " + topla);

        // 10 ile 20 arasindaki cift sayilari topla
        int ciftToplam = 0;
        for(int i=10; i<20; i++){
            if(i%2==0){
                ciftToplam+=i;
            }
        }
        System.out.println("10 ile 20 arasi cift sayilar toplami = " + ciftToplam);

        // 1 ile 10 arasi tek sayilari yazdir

        for (int i = 1; i < 10; i++) {
            if(i%2==1){
            System.out.print(i + "-");
            }
            
        }
    }
}
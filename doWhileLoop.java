public class doWhileLoop {
    public static void main(String[] args) {
        
        //10 dan 200 e kadar 8 in kati olan tamsayilari yazdirin

        int baslangic = 10;
        int bitis = 200;

        int sayilar = baslangic;

        //while loop ile yapalim

        while(sayilar<bitis){
            if(sayilar%8==0){
                System.out.print(sayilar + "-");
            }
            
            sayilar++;
        }

        //do while ile yapalim
        System.out.println("");
        sayilar = baslangic;
        do{
            if(sayilar%8==0){
                System.out.print(sayilar + "-");

            }
            sayilar++;
        }while(sayilar<bitis);
    }
}

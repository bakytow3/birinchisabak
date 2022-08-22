public class Main {
    public static void main(String[] args) {
        Hint kvartira=new Kvartira();
        kvartira.KomUslugaKvartira();
        String[]Uybuloo1=new String[1];
        Uybuloo1[0]="Kvartirada 3 kishi";
        System.out.println(Uybuloo1[0]);
        Obshejitiya obshejitiya=new Obshejitiya();
        obshejitiya.Arenda();
        String[]Uybuloo2=new String[1];
        Uybuloo2[0]="Obshejitiyada 4 kishi";
        System.out.println(Uybuloo2[0]);
        Hint gostinisa=new Gostinisa();
        gostinisa.Arenda();
        String[]Uybuloo3=new String[1];
        Uybuloo3[0]="Gostinisada 2 kishi";
        System.out.println(Uybuloo3[0]);
    }
}

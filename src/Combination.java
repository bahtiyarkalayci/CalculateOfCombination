import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {


        /* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

         Kombinasyon formülü
       C(n,r) = n! / (r! * (n-r)!)           */
      int nfactorial=1,rfactorial=1,differanceFactorial=1;

      int n,r,combination;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter  the element number of cluster(n)=");
        n=scanner.nextInt();
        System.out.print("enter the number of combination (r)=");
        r=scanner.nextInt();

        //n! için for döngüsü
        //r! için for döngüsü
        //n-r ! için for döngüsü
        for (int i=1;i<=n;i++){
            nfactorial=nfactorial*i;}
            for (int j=1;j<=r;j++){
                rfactorial=rfactorial*j;
            }

        for (int k=1;k<=(n-r);k++) {
            differanceFactorial = differanceFactorial * k;}

        System.out.println("nfactorial="+nfactorial);
        System.out.println("rfactorial="+rfactorial);
        System.out.println("differancefactorial="+differanceFactorial);
        combination=(nfactorial/(rfactorial*differanceFactorial));
        System.out.print("combination="+combination);
    }
}

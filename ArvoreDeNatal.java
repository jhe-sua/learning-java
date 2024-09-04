import java.util.Scanner;

public class ArvoreDeNatal
{
    public static void main(String[] args)
    {
        String pL = "\n";
        System.out.print("Arvore de natal, escolha a altura: ");
        Scanner leia = new Scanner(System.in);
        int h;
        do
        {
            h = leia.nextInt();
            if (h <= 0)
            {
                System.out.print("ERRO!!!! escreva um valor maior do que 0: ");
            }
        }while(h <= 0);
        int ht = h/8;
        if (ht < 1) {
            ht = 1;
        } else {
            ht = h/8;
        }
        int hF = h - ht;
        int c = 1;
        int s = h;
        int tT = (h-1)/3;
        int sT = (h-1)-tT;
        //espacos de folhas e folhas
        for (int i = 0; i < hF; i++) {
            for (int iS = s; iS > 0; iS--) {
                System.out.print(" ");
            }
            for (int iF = 0; iF < c; iF++) {
                System.out.print("*");
            }
            s-=1;
            c+=2;
            System.out.print(pL);
        }
        //espacos de tronto e tronco
        for (int i = 0; i < ht; i++) {
            for (int iST = 0; iST < (sT+1); iST++) {
                System.out.print(" ");
            }
            for (int iTT = 0; iTT < ((2*tT)+1); iTT++) {
                System.out.print("|");
            }
        }

    }
}

public class Vetores
{
    public static void main(String[] args)
    {
//        sintaxe de vetores inteiros:
//        int n[] = new int[x];
//        onde x é o tamanho do vetor

//        caso voce saiba o tamanho e os valores de prenhimento:
//        int n[] = {x,y,...,z};
        String[] xVec = {Integer.toString(10) ,Integer.toString(91)};
//        for each sintesis
//            for(tipo A : vetor)
        for (String y : xVec)
        {
            System.out.println(y);
        }
    }
}

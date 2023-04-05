public class StudentPoll {
         public static void main(String[] args)
         {// array das respostas dos alunos (mais tipicamente, inserido em tempo de execução)
             int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                    10, 2, 3, 3, 2, 14 };
             int[] frequency = new int[6]; // array de contadores de frequênciaÿ

             // para cada resposta, seleciona elemento de respostas e utiliza esse valorÿ
             // como índice de frequência para determinar elemento a incrementar ÿ
             for (int answer = 0; answer < responses.length; answer++)
             {
                  try
                  {
                     ++frequency[responses[answer]];
                  }
                  catch (ArrayIndexOutOfBoundsException e)
                  {
                      System.out.println(e); // invoca o método toString ÿ
                      System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);


                  }
             }
             System.out.printf("%s%10s%n", "Rating", "Frequency");

             // gera saída do valor de cada elemento do array
             for (int rating = 1; rating < frequency.length; rating++)
                 System.out.printf("%6d%10d%n", rating, frequency[rating]);
         }
}


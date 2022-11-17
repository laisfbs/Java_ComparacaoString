
package comparacaostring;

/**
 *
 * @author 40415873
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Lais";
        String nome2 = "Lais";
        String nome3 = new String("Lais");//instanciado com a classe String
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";//metodo que verifica se um conteudo do objeto é o mesmo que o outro.
        System.out.println(res);
    }
    
}

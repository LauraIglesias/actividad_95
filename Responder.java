import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    ArrayList <String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>();
        respuestas.add("¿Has reiniciado el sistema?");
        respuestas.add("Te ha surgido algun fallo");
        respuestas.add("¿Que error le sale por pantalla?");
        respuestas.add("Actualice la aplicacion");
        respuestas.add("Me puede describir mas concretamente su error");
        respuestas.add("Espere un momento que voy a consultarlo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        Random rmd = new Random();
       // return "That sounds interesting. Tell me more...";
       return respuestas.get(rmd.nextInt(respuestas.size()));
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    HashMap<String,String> palabrasClave;
    Random rmd;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>();
        palabrasClave = new HashMap<>();
        rmd = new Random();

        respuestas.add("¿Has reiniciado el sistema?");
        respuestas.add("Te ha surgido algun fallo");
        respuestas.add("¿Que error le sale por pantalla?");
        respuestas.add("Actualice la aplicacion");
        respuestas.add("Me puede describir mas concretamente su error");
        respuestas.add("Espere un momento que voy a consultarlo");

        palabrasClave.put("apaga","Compruebe que se puede encender");
        palabrasClave.put("abrir","Pruebe a actualizar la aplicacion");
        palabrasClave.put("hola","Me podria decir que problema tiene");
        palabrasClave.put("no","Si no funciona, dejeme que lo compruebe");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> frase)
    {
        String fraseResponder = null;//devuelve la frase a responder
        Iterator <String> iterator = frase.iterator();
        boolean buscando = true;//para que salga del bucle si el String esta lleno 

        while(iterator.hasNext() && buscando){
            fraseResponder = palabrasClave.get(iterator.next());//introduciomos la frase a responder
            if(fraseResponder != null){
                buscando = false;
            }
        }
        if(palabrasClave == null){//si esta vacio elige una respuesta al azar
            fraseResponder = respuestas.get(rmd.nextInt(respuestas.size()));
        }

        return fraseResponder;
    }
}

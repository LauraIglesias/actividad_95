import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>();
        palabrasClave = new HashMap<>();
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
        Random rmd = new Random();
        String palabra = null;
        for(String elemento : frase)
        {
            if(palabrasClave.containsKey(elemento))//Si la palabra del HashSet ya está en el HashMap--- devuelve true o false
            {
                palabra = palabrasClave.get(elemento);//introducimos la palabra que hay en el HashMap en el string
            }
        }
        if(palabrasClave == null){
            palabra = respuestas.get(rmd.nextInt(respuestas.size()));
        }

        return palabra;
    }
}

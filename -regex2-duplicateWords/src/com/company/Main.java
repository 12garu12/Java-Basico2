package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here


        /**************************************************************************************************************
         Expresiones regulares de Java
         Una expresión regular es una secuencia de caracteres que forma un patrón de búsqueda.
         Cuando busca datos en un texto, puede usar este patrón de búsqueda para describir lo que está buscando.

         Una expresión regular puede ser un solo carácter o un patrón más complicado.
         Las expresiones regulares se pueden usar para realizar todo tipo de operaciones de búsqueda y reemplazo de texto.
         Java no tiene una clase de expresión regular incorporada, pero podemos importar el java.util.regex
         paquete para que funcione con expresiones regulares. El paquete incluye las siguientes clases:

         Pattern Clase: define un patrón (para usar en una búsqueda)
         Matcher Clase: se usa para buscar el patrón
         PatternSyntaxException Clase: indica un error de sintaxis en un patrón de expresión regular
         Ejemplo
         */
         /*
        Pattern patron = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE); //Patron, bandera que no distingue entre mayusculas y minusculas
        Matcher coincidencia = patron.matcher("Visit W3Schools!");
        boolean coincidenciaEncontrada = coincidencia.find(); // metodo find avanza por el texto de entrada y devuelve verdadero
        if (coincidenciaEncontrada){ // Entra si la variable es verdadera
            System.out.println("Coincidencia encontrada");
        }else{
            System.out.println("Coincidenecia no encotrada");
        }
        */

        /************************************************************************************************************
         El método find sigue avanzando por el texto de entrada y devuelve verdadero para cada coincidencia,
         por lo que también podemos usarlo para encontrar el recuento de coincidencias:
         */

        /*Pattern pattern = Pattern.compile("BYE", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Goodbye bye bye world WORLD world BYE");
        int matches = 0;
        while (matcher.find()) {
            matches++;
            System.out.println(matcher.group());
        }
        System.out.println(matches);*/

        /************************************************************************************************************
         5. METACARACTERES
         Los metacaracteres afectan la forma en que se empareja un patrón, de manera que se agrega lógica al patrón
         de búsqueda. La API de Java admite varios metacaracteres, el más sencillo es el punto "." que coincide con
         cualquier personaje:
         */


        /*Pattern ptern = Pattern.compile("f.");
        Matcher mtcher = ptern.matcher("foo foco falta afecto");
        int m = 0;
        while (mtcher.find()){
            m++;
        }
        System.out.println(m); // 4 todo lo que tenga f y el punto quiere decir que no importa el caracter que siga */

        /*
        Observe el punto después del foo en la expresión regular. La coincidencia coincide con cada texto precedido
        por foo ya que la última parte de punto significa cualquier carácter posterior. Entonces, después de encontrar
         al primer foo , el resto se ve como cualquier personaje. Es por eso que solo hay una sola coincidencia.
        */

        /***************************************************************************************************************
         CLASES DE CARACTERES.
         Navegando a través de la especificación oficial de la clase Pattern , descubriremos resúmenes de
         construcciones de expresiones regulares compatibles. En las clases de caracteres,
         tenemos alrededor de 6 construcciones.
         */
        /*********** clase O **********
         Construido como [abc] . Cualquiera de los elementos del conjunto coincide:
         Si todos aparecen en el texto, cada uno se compara por separado sin importar el orden:
         */

        /*Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher("cab");
        int cont = 0;
        while (matcher.find()){
            cont++;
        }
        System.out.println(cont);*/

        /*Pattern patron = Pattern.compile("[bcr]at");
        Matcher matcher = patron.matcher("bat cat rat");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);*/

        /*************** Clase NOR **********************
         El conjunto anterior se niega agregando un símbolo de intercalación como primer elemento:
         Encuentra los caracteres que no estan entre los corchetes.

         */

        /*Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("gacdoot");
        int cont = 0;
        while (matcher.find()) cont++;
        System.out.println(cont);*/

        /*Pattern pattern = Pattern.compile("[^bcr]at");
        Matcher matcher = pattern.matcher("bat cat rat");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.println(matches);*/

        /******* Rango de clase ******
         Podemos definir una clase que especifique un rango dentro del cual el texto coincidente debe caer
         usando un guión (-), del mismo modo, también podemos negar un rango.
         Coincidencia de letras mayúsculas:
         */

        /*Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher("Two Uppercase alphabets 34 overall");
        int cont = 0;
        while (matcher.find()){
            cont++;
        }
        System.out.println(cont);*/


        /*Coincidencias minusculas */

        /*Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher("Two Uppercase alphabets 34 overall");
        int cont = 0;
        while (matcher.find()) cont++;
        System.out.println(cont);*/

        /* Coincidencias de letras minusculas y mayusculas */

        /*Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher("Two Uppercase alphabets 34 overall");
        int cont = 0;
        while (matcher.find()) cont++;
        System.out.println(cont);*/

        /* Emparejando un rango dado de numeros */

        /*Pattern pattern = Pattern.compile("[1-5]");
        Matcher matcher = pattern.matcher("Two Uppercase alphabets 34 overall 63 and 239298");
        int cont = 0;
        while (matcher.find()) ++cont;
        System.out.println(cont);*/

        /* Emparejando un rango dado de numeros */

        /*
        Pattern pattern = Pattern.compile("[30-35]");
        Matcher matcher = pattern.matcher("Two Uppercase alphabets 34 overall");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c);

*/
        /********* Clase de union *******
         Una clase de carácter de unión es el resultado de combinar dos o más clases de caracteres:
         */

        /*Pattern pattern = Pattern.compile("[1-3[7-9]]");
        Matcher matcher = pattern.matcher("123456789");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c);*/ // respuesta: 6

        //La prueba anterior solo coincidirá con 6 de los 9 enteros porque el conjunto de unión omite 4, 5 y 6.

        /******** Clase de interseccion *********
         Similar a la clase de unión, esta clase resulta de elegir elementos comunes entre dos o más conjuntos.
         Para aplicar intersección, usamos && :
         */

        /*
        Pattern pattern = Pattern.compile("[1-6&&[3-9]]");
        Matcher matcher = pattern.matcher("123456789");
        int c = 0;
        while(matcher.find())c++;
        System.out.println(c);
        */
        // Obtenemos 4 coincidencias porque la intersección de los dos conjuntos tiene solo 4 elementos que son 3, 4, 5, 6

        /********* Clase de resta ********
         Podemos usar la resta para negar una o más clases de caracteres, por ejemplo, haciendo coincidir un conjunto
         de números decimales impares:
         */

        /*Pattern pattern = Pattern.compile("[0-9&&[^2468]]");
        Matcher matcher = pattern.matcher("123456789");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c); // Solo 1,3,5,7,9 serán igualados.*/

        /**************************************************************************************************************
         7. Clases de caracteres predefinidas
         La API de expresiones regulares de Java también acepta clases de caracteres predefinidas. Algunas de las clases
         de caracteres anteriores se pueden expresar en forma más corta aunque haciendo que el código sea menos
         intuitivo. Un aspecto especial de la versión Java de esta expresión regular es el carácter de escape.
         Como veremos, la mayoría de los personajes comenzarán con una barra invertida, que tiene un significado
         especial en Java. Para que estos sean compilados por la clase Pattern , la barra invertida inicial debe
         escaparse, es decir, \ d se convierte en \\ d .
         Dígitos coincidentes, equivalentes a [0-9] :
         */
        /*
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("123 10 por la clase Pattern 11 12  108");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c); // Cuenta todos los digitos en la entrada.*/

        /* que no sean digitos coincidentes equivalentes a [^0-9]: */
        /*
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher("a6c");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c);
        */

        /* Cuenta los espacios en blanco */
        /*
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher("a c s d");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 3 */

        /* Cuenta lo que no son espacios en la horacion */

        /*Pattern pattern = Pattern.compile("\\S");
        Matcher matcher = pattern.matcher("a c");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c); // 2 */

        /* Hacer coincidir un carácter de palabra, equivalente a [a-zA-Z_0-9]:   */

       /*Pattern pattern = Pattern.compile("\\w");
       Matcher matcher = pattern.matcher("hi!");
       int c = 0;
       while (matcher.find()) c++;
        System.out.println(c); // 2 */

        /*Coincidencia de un caracter no sea palabra*/

        /*Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher("hi!");
        int c = 0;
        while (matcher.find()) ++c;
        System.out.println(c); // 1*/

        /************************************************************************************************************
         8. Cuantificadores
         La API Java regex también nos permite usar cuantificadores. Esto nos permite ajustar aún más el comportamiento
         de la coincidencia al especificar el número de ocurrencias con las que se debe comparar.
         Para hacer coincidir un texto cero o una vez, utilizamos el ? cuantificador:
         */

        /*Pattern pattern = Pattern.compile("\\a?");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 3  */

        /*Alternativamente, podemos usar la sintaxis de llaves, también compatible con la API de expresiones regulares
        de Java:*/

        /*Pattern pattern = Pattern.compile("\\a{0,1}");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 3*/

        /*Este ejemplo introduce el concepto de coincidencias de longitud cero. Sucede que si el umbral de un
        cuantificador para la coincidencia es cero, siempre coincide con todo en el texto, incluida una cadena
        vacía al final de cada entrada. Esto significa que incluso si la entrada está vacía, devolverá una
        coincidencia de longitud cero.
        Esto explica por qué obtenemos 3 coincidencias en el ejemplo anterior a pesar de tener una S tring de
        longitud dos. La tercera coincidencia es una cadena vacía de longitud cero .
        Para hacer coincidir un texto cero o tiempos ilimitados, nosotros * cuantificador, es simplemente similar a?:*/

        /*Pattern pattern = Pattern.compile("\\a*");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 3  */

        /*Alternativa admitida: */

        /*Pattern pattern = Pattern.compile("\\a{0,}");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 3 */

        /*------------------------------------------------------------------------------------------------------------
         El cuantificador con una diferencia es +, tiene un umbral de coincidencia de 1. Si la Cadena requerida
        no se produce, no habrá coincidencia, ni siquiera una Cadena de longitud cero :*/

        /*Pattern pattern = Pattern.compile("\\a+");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); //0  */

        /* Alternativa admitida */
        /*Pattern pattern = Pattern.compile("\\a{1,}");
        Matcher matcher = pattern.matcher("hi");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 0  */

        /*Como está en Perl y otros idiomas, la sintaxis de llaves se puede usar para hacer coincidir un texto
         dado varias veces:*/

        /*Pattern pattern = Pattern.compile("a{3}");
        Matcher matcher = pattern.matcher("aaaaaa");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);  // encuentra las 3 a juntas y cuenta como un patron de 1 respuesta 2*/

        /*En el ejemplo anterior, obtenemos dos partidos desde un partido sólo se produce si una aparece tres veces en
        una fila. Sin embargo, en la próxima prueba no obtendremos una coincidencia ya que el texto solo aparece dos
        veces seguidas:*/

        /*Pattern pattern = Pattern.compile("a{3}");
        Matcher matcher = pattern.matcher("aa");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);  // 0  */

        /*-------------------------------------------------------------------------------------------------------------
        Cuando usamos un rango entre llaves, la coincidencia será codiciosa, coincidiendo
        desde el extremo superior del rango:
        */
        /*Pattern pattern = Pattern.compile("a{2,3}");
        Matcher matcher = pattern.matcher("aaaa");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);  // 1 */
        /*
        Hemos especificado al menos dos ocurrencias, pero no más de tres, por lo que obtenemos una sola coincidencia
         en la que el emparejador ve un solo aaa y un solitario que no puede ser igualado.
        Sin embargo, la API nos permite especificar un enfoque perezoso o renuente, de modo que la coincidencia
        pueda comenzar desde el extremo inferior del rango, en cuyo caso, coincidir dos ocurrencias como aa y aa :
        */

        /*Pattern pattern = Pattern.compile("a{2,3}?");
        Matcher matcher = pattern.matcher("aaaa");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);  // 2  */

        /**************************************************************************************************************
         9. Capturando grupos
         La API también nos permite tratar varios caracteres como una sola unidad mediante la captura de grupos .
         Adjuntará números a los grupos de captura y permitirá hacer referencia a ellos utilizando estos números.
         En esta sección, veremos algunos ejemplos sobre cómo usar grupos de captura en la API de expresiones regulares de Java.
         Usemos un grupo de captura que coincida solo cuando un texto de entrada contiene dos dígitos uno al lado del otro:
         */
        /*Pattern pattern = Pattern.compile("\\d\\d");
        Matcher matcher = pattern.matcher("12");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 1 */
        /*El número adjunto a la coincidencia anterior es 1 , utilizando una referencia inversa para indicarle al
        comparador que queremos hacer coincidir otra aparición de la parte coincidente del texto. De esta manera,
        en lugar de:*/
        /*Pattern pattern = Pattern.compile("\\d\\d");
        Matcher matcher = pattern.matcher("1212");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 2         */

        /*-------------------------------------------------------------------------------------------------------------
        Cuando hay dos coincidencias separadas para la entrada, podemos tener una coincidencia, pero propagando la
        misma coincidencia de expresiones regulares para abarcar toda la longitud de la entrada utilizando la
        referencia inversa:
        */

        /*Pattern pattern = Pattern.compile("(\\d\\d)\\1");
        Matcher matcher = pattern.matcher(" dgjj 545 yui  7979457979");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); //cuenta los digitos repetidos de a dos por ejemplo 7979 tienen que estar juntos. */

        /*
        Donde tendríamos que repetir la expresión regular sin hacer referencia hacia atrás para lograr el mismo resultado:
        */

        /*Pattern pa = Pattern.compile("(\\d\\d)(\\d\\d)\\1");
        Matcher ma = pa.matcher("123712371237 si hay dos numeros juntos 45454545");
        int cont = 0;
        while (ma.find()) cont++;
        System.out.println(cont); // tiene que haber 4 digitos juntos y repetirsen continuamente. */

       /* Del mismo modo, para cualquier otro número de repeticiones, la referencia inversa puede hacer que el
       comparador vea la entrada como una sola coincidencia:  */

        /*Pattern pattern = Pattern.compile("(\\d\\d)\\1\\1\\1");// Son dos digitos que el \\1 indica el numero de veces que se tiene que repetir
        Matcher matcher = pattern.matcher("12121212 mas de dos numeros 56");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);*/

       /* Pero si cambia incluso el último dígito, la coincidencia fallará:
          Es importante no olvidar las barras invertidas de escape, esto es crucial en la sintaxis de Java.
       * */

        /*************************************************************************************************************
         10. Matchers de límites
         La API de expresiones regulares de Java también admite la coincidencia de límites. Si nos importa dónde
         exactamente en el texto de entrada debe ocurrir la coincidencia, entonces esto es lo que estamos buscando.
         Con los ejemplos anteriores, todo lo que nos importaba era si se encontraba una coincidencia o no.
         Para que coincida solo cuando la expresión regular requerida sea verdadera al comienzo del texto, usamos el
         símbolo de intercalación ^.
         Esta prueba fallará ya que el perro de texto se puede encontrar al principio:
         */

        /*Pattern pattern = Pattern.compile("^dog"); // solo cuando la expresion regular requerida sea verdadera al comienzo del texto
        Matcher matcher = pattern.matcher("dogs are friendly");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); */

        /* La siguiente prueba fallara */

        /*Pattern pattern = Pattern.compile("^dog"); // solo al principio del texto esta prueba fallara
        Matcher matcher = pattern.matcher("are dogs are friendly?");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 0 coincidencias  */

        /*
        Para coincidir solo cuando la expresión regular requerida es verdadera al final del texto, usamos el carácter
        de dólar $. Se encontrará una coincidencia en el siguiente caso:  */

        /*Pattern pattern = Pattern.compile("dog$"); // solo cuando la busqueda esta al final del texto
        Matcher matcher = pattern.matcher("dog Man's best dog friend is a dog");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);*/

        /* Y no se encontraran coincidencias aqui */

        /*Pattern p = Pattern.compile("dos$"); // Solo para el final de texto
        Matcher m = p.matcher("is a dog man's best friend?");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 0 coincidencias;*/

        /*Si queremos una coincidencia solo cuando el texto requerido se encuentra en el límite de una palabra,
        usamos \\ b regex al principio y al final de la expresión regular:
        El espacio es un límite de palabras:   */

        /*Pattern p = Pattern.compile("\\bdog\\b"); // Solo busca la palabra original en el texto
        Matcher m = p.matcher("a dog is friendly dogerer");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 1  */

        /* La cadena vacía al comienzo de una línea también es un límite de palabra:  */

        /*Pattern p = Pattern.compile("\\bdog\\b");
        Matcher m = p.matcher("dog is man's dog best friend dog but dogers not");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 3 coincidencias solo la busqueda tal cual */

        /* Estas pruebas pasan porque el comienzo de una Cadena , así como el espacio entre un texto y otro, marca el
        límite de una palabra, sin embargo, la siguiente prueba muestra lo contrario:   */

        /*Pattern p = Pattern.compile("\\bdog\\b");
        Matcher m = p.matcher("snoop dogg is a rapper");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 0 coincidencias */

        /*Los caracteres de dos palabras que aparecen en una fila no marcan el límite de una palabra, pero podemos
        hacer que pase cambiando el final de la expresión regular para buscar un límite que no sea de palabra:    */

        /*Pattern p = Pattern.compile("\\bdog\\B");
        Matcher m = p.matcher("snoop dogg is a rapper dog dogger");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 2 coincidencias solo palabras que comiencen pero no terminen con la expresion regular*/

        /**************************************************************************************************************
         11. Métodos de clase de patrón
         Anteriormente, solo habíamos creado objetos de Patrón de una manera básica. Sin embargo, esta clase tiene otra
         variante del método de compilación que acepta un conjunto de indicadores junto con el argumento
         regex que afecta la forma en que se combina el patrón.

         Estas banderas son simplemente valores enteros abstraídos. Sobrecarguemos el método runTest en la clase de
         prueba para que pueda tomar una bandera como tercer argumento:
         */

        /* Metodo para una clase */
        /*public static int prueba(String regex, String text, int flags){
            Pattern pattern = Pattern.compile(regex, flags);
            Matcher matcher = pattern.matcher(text);
            int matches = 0;
            while (matcher.find()) matches++;
            return matches;
        }*/

        /*En esta sección, veremos los diferentes indicadores admitidos y cómo se usan.
         */

        /*------------------------------------- Pattern.CANON_EQ ------------------------------------------------*/
        /*Esta bandera permite la equivalencia canónica. Cuando se especifique, se considerará que dos caracteres
        coinciden si, y solo si, sus descomposiciones canónicas completas coinciden.
        Considere el carácter Unicode acentuado é . Su punto de código compuesto es u00E9 . Sin embargo, Unicode
        también tiene un punto de código separado para sus caracteres componentes e , u0065 y el acento agudo, u0301 .
        En este caso, el carácter compuesto u00E9es indistinguible de la secuencia de dos caracteres u0065 tu0301.
        Por defecto, la coincidencia no tiene en cuenta la equivalencia canónica: */

        /*Pattern p = Pattern.compile("\u00E9"); // caracter = é
        Matcher m = p.matcher("\u0065\u0301"); // caracteres --> u0065 = e  and u0301 = ´
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 0 coincidences*/

        /* Pero si agregamos la bandera, la prueba pasara */

        /*Pattern p = Pattern.compile("\u00E9", Pattern.CANON_EQ); // caracter = é
        Matcher m = p.matcher("\u0065\u0301"); // caracteres --> u0065 = e  and u0301 = ´
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 1 coincidencia  paor la bandera  */

        /*---------------------------------- Pattern.CASE_INSENSITIVE ------------------------------------------------*/
/*
        Este indicador permite la coincidencia independientemente del caso. Por defecto,
        no distingue entre mayusculas y minusculas.
        Entonces, usando esta bandera, podemos cambiar el comportamiento predeterminado:
*/
        /*Pattern p = Pattern.compile("dog", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("This is a Dog");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 1 coincidencia  */

        /* También podemos usar la expresión de bandera incrustada equivalente para lograr el mismo resultado:   */

        /*Pattern p = Pattern.compile("(?i)dog");
        Matcher m = p.matcher("This is a Dog");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 1 */

        /*Patrón COMENTARIOS
        La API de Java permite incluir comentarios usando # en la expresión regular. Esto puede ayudar a documentar
        expresiones regulares complejas que pueden no ser inmediatamente obvias para otro programador.
        El indicador de comentarios hace que el comparador ignore cualquier espacio en blanco o comentario
        en la expresión regular y solo considere el patrón. En el modo de coincidencia predeterminado, la siguiente
        prueba fallará:        */

        /*Pattern p = Pattern.compile("dog$ #Verifica que la palabra dog este al final del texto");
        Matcher m = p.matcher("This is a dog");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 0*/

        /* Esto se debe a que el comparador buscará la expresión regular completa en el texto de entrada,
        incluidos los espacios y el carácter #. Pero cuando usamos la bandera, ignorará los espacios adicionales
        y cada texto que comience con # se verá como un comentario que se ignorará para cada línea: */

        /*Pattern p = Pattern.compile("dog$ #Verifica que la palabra dog este al final del texto", Pattern.COMMENTS);
        Matcher m = p.matcher("This is a dog");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c); // 1   */

        /*También hay una expresión de bandera incrustada alternativa para esto:  */

        /*Pattern p = Pattern.compile("(?x)dog$ #Revisa que exista la palabra dog al final del texto");
        Matcher m = p.matcher("This is a dog");
        int c = 0;
        while (m.find()) c++;
        System.out.println(c);*/

        /**************************************************************************************************************
         Pattern.DOTALL
         Por defecto, cuando usamos el punto "." expresión en expresiones regulares, estamos haciendo coincidir cada
         carácter en la cadena de entrada hasta que encontremos un nuevo carácter de línea.
         Usando esta bandera, la coincidencia incluirá también el terminador de línea. Lo entenderemos mejor con los
         siguientes ejemplos. Estos ejemplos serán un poco diferentes. Dado que estamos interesados ​​en afirmar
         contra la cadena coincidente , utilizaremos el método de grupo de matcher que devuelve la coincidencia anterior.
         Primero, veremos el comportamiento predeterminado:
         */

        /*Pattern pattern = Pattern.compile("(.*)");
        Matcher matcher = pattern.matcher("this is a text" + System.getProperty("line.separator")
                        + " continued on another line");
        matcher.find();
        System.out.println(matcher.group(1));*/

        /* Como podemos ver, solo la primera parte de la entrada antes de que el terminador de línea coincida.
        Ahora en modo dotall , se emparejará todo el texto, incluido el terminador de línea:  */

        /*Pattern pattern = Pattern.compile("(.*)", Pattern.DOTALL);
        Matcher matcher = pattern.matcher("this is a text" + System.getProperty("line.separator")
                + " continued on another line");
        matcher.find();
        System.out.println(matcher.group(1));*/

        /* ambién podemos usar una expresión de bandera incrustada para habilitar el modo dotall :  */

        /*Pattern pattern = Pattern.compile("(?s)(.*)");
        Matcher matcher = pattern.matcher("this is a text" + System.getProperty("line.separator") // igual a \n separar las lineas
                + " continued on another line");
        matcher.find();
        System.out.println(matcher.group(1)); //  matcher.group(1) = para imprimir los valores encontrados */

        /**************************************************************************************************************
         Pattern.LITERAL
         Cuando está en este modo, matcher no le da un significado especial a los metacaracteres, caracteres de escape
         o sintaxis de expresiones regulares. Sin este indicador, el comparador coincidirá con la siguiente expresión
         regular contra cualquier Cadena de entrada :
         */

        /*Pattern pattern = Pattern.compile("(.*)");
        Matcher matcher = pattern.matcher("text");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 2 */

        /* Este es el comportamiento predeterminado que hemos estado viendo en todos los ejemplos. Sin embargo,
        con este indicador, no se encontrará ninguna coincidencia, ya que el comparador buscará (. *) En lugar
        de interpretarlo:  */

        /*Pattern pattern = Pattern.compile("(.*)",  Pattern.LITERAL);
        Matcher matcher = pattern.matcher("text");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);*/

        /*Ahora si agregamos la cadena requerida, la prueba pasará:
        No hay caracteres de marca incrustados para habilitar el análisis literal.
         */

        /*Pattern pattern = Pattern.compile("(.*)",  Pattern.LITERAL);
        Matcher matcher = pattern.matcher("text(.*)");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c);*/

        /**************************************************************************************************************
         Pattern.MULTILINE
         Por defecto ^ y $ los metacaracteres coinciden absolutamente al principio y al final, respectivamente, de
         toda la cadena de entrada . El comparador no tiene en cuenta los terminadores de línea:
         */

        /*Pattern pattern = Pattern.compile("dog$");
        Matcher matcher = pattern.matcher("This is a dog" + System.getProperty("line.separator")
                + "this is a fox");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 0  */

        /* La coincidencia falla porque el buscador busca una palabra dog al final de la cadena completa pero el perro
        está presente al final de la primera línea de la cadena.

        Sin embargo, con la bandera, pasará la misma prueba ya que el emparejador ahora tiene en cuenta los terminadores
        de línea. Entonces, el perro String se encuentra justo antes de que termine la línea, de ahí el éxito: */

       /* Pattern pattern = Pattern.compile("dog$", Pattern.MULTILINE); // Pattern.MULTILINE tiene en cuenta los terminadores de linea
        Matcher matcher = pattern.matcher("This is a dog" + System.getProperty("line.separator")
                + "this is a fox");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 1 */

        /* Aquí está la versión de bandera incrustada: */

        /* Pattern pattern = Pattern.compile("(?m)dog$"); // Con bandera incrustada
        Matcher matcher = pattern.matcher("This is a dog" + System.getProperty("line.separator")
                + "this is a fox");
        int c = 0;
        while (matcher.find()) c++;
        System.out.println(c); // 1  */

        /***************************************************************************************************************
         12. Métodos de clase de Matcher
         En esta sección, veremos algunos métodos útiles de la clase Matcher . Los agruparemos según la
         funcionalidad para mayor claridad
         */
        /*-------------------------------------------------------------------------------------------------------------
        12.1 Métodos de índice
        Los métodos de índice proporcionan valores de índice útiles que muestran con precisión dónde se encontró la
        coincidencia en la Cadena de entrada . En la siguiente prueba, confirmaremos los índices de inicio y
        finalización del partido para el perro en la Cadena de entrada :
        */

        /*Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher("This dog is mine");
        matcher.find();
        System.out.println("De la posición: " + matcher.start()); // 5
        System.out.println("A la posición: " + matcher.end()); // 8  */

        /*-------------------------------------------------------------------------------------------------------------
        12.2 Métodos de estudio
        Los métodos de estudio pasan por la cadena de entrada y devuelven un valor booleano que indica si se encuentra
        o no el patrón. Comúnmente se utilizan coincidencias y métodos LookingAt .
        Los métodos de coincidencias y lookingAt intentan hacer coincidir una secuencia de entrada con un patrón. La
        diferencia es que las coincidencias requieren que toda la secuencia de entrada coincida , mientras que lookingAt no.
        Ambos métodos comienzan al principio de la cadena de entrada :
        */

        /*Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher("dog are friendly");
        System.out.println(matcher.lookingAt()); // true --> no requiere toda la secuencia de entrada
        System.out.println(matcher.matches()); // false --> requiere que toda la secuencia de entrada coincida */

        /* El método de coincidencias devolverá verdadero en un caso así:  */

        /*Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher("dog");
        boolean igualdad = matcher.matches();
        System.out.println(igualdad); // True --> requiere que toda la secuencia de entrada coincida*/

        /*-------------------------------------------------------------------------------------------------------------
        12.3 Métodos de reemplazo
        Los métodos de reemplazo son útiles para reemplazar texto en una cadena de entrada. Los más comunes son
        replaceFirst y replaceAll .
        Los métodos replaceFirst y replaceAll reemplazan el texto que coincide con una expresión regular dada. Como
        indican sus nombres, replaceFirst reemplaza la primera aparición, y replaceAll reemplaza todas las ocurrencias:
        */

        /*Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher("dogs are domestic animals, dogs are friendly");
        String newStr = matcher.replaceFirst("cat");
        System.out.println(newStr); // cats are domestic animals, dogs are friendly*/

        /* Reemplazar todas las ocurrencias: */

        /*Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher("dogs are domestic animals, dogs are friendly");
        String newStr = matcher.replaceAll("cat");
        System.out.println(newStr); // cats are domestic animals, cats are friendly*/

        /* El método replaceAll nos permite sustituir todas las coincidencias con el mismo reemplazo. Si queremos
        reemplazar las coincidencias caso por caso, necesitaríamos una técnica de reemplazo de fichas .*/


        /**************************************************************************************************************
         *   Cómo usar expresiones regulares para reemplazar tokens en cadenas
         *************************************************************************************************************
         1. Información general
         Cuando necesitamos encontrar o reemplazar valores en una cadena en Java, usualmente usamos expresiones
         regulares . Estos nos permiten determinar si una parte o la totalidad de una cadena coincide con un patrón.
         Podríamos aplicar fácilmente el mismo reemplazo a múltiples tokens en una cadena con el método replaceAll en
         Matcher y String .
         En este tutorial, exploraremos cómo aplicar un reemplazo diferente para cada token encontrado en una cadena.
         Esto nos facilitará satisfacer casos de uso como escapar de ciertos caracteres o reemplazar valores de
         marcador de posición.
         También veremos algunos trucos para ajustar nuestras expresiones regulares para identificar los
         tokens correctamente.

         2. Partidos de procesamiento individual
         Antes de que podamos construir nuestro algoritmo de reemplazo token por token, necesitamos entender la
         API de Java en torno a las expresiones regulares. Solucionemos un complicado problema de coincidencia
         utilizando grupos de captura y no captura.

         2.1. Título Caso Ejemplo
         Imaginemos que queremos construir un algoritmo para procesar todas las palabras del título en una cadena.
         Estas palabras comienzan con un carácter en mayúscula y luego terminan o continúan con solo caracteres
         en minúscula.
         Nuestro aporte podría ser:

         1 "First 3 Capital Words! then 10 TLAs, I Found"

         De la definición de una palabra de título, esto contiene las coincidencias:
         * First
         * Capital
         * Words
         * I
         * Found
         Y una expresión regular para reconocer este patrón sería:

         1"(?<=^|[^A-Za-z])([A-Z][a-z]*)(?=[^A-Za-z]|$)"

         Para entender esto, vamos a dividirlo en sus partes componentes. Comenzaremos en el medio:
         1 [A-Z]  reconocerá una sola letra mayúscula.

         Permitimos palabras de un solo carácter o palabras seguidas de minúsculas, entonces:
         1 [a-z]*  reconoce cero o más letras minúsculas.

         En algunos casos, las dos clases de caracteres anteriores serían suficientes para reconocer nuestros
         tokens. Desafortunadamente, en nuestro texto de ejemplo, hay una palabra que comienza con varias letras
         mayúsculas. Por lo tanto, debemos expresar que la letra mayúscula única que encontramos debe ser la
         primera en aparecer después de las no letras.
         De manera similar, como permitimos una sola palabra en mayúscula, necesitamos expresar que la letra
         mayúscula única que encontramos no debe ser la primera de una palabra con mayúscula múltiple.
         La expresión [^ A-Za-z]  significa "sin letras". Hemos puesto uno de estos al comienzo de la expresión
         en un grupo que no captura

         1  (?<=^|[^A-Za-z])

         El grupo que no captura, comenzando con (? <=, Hace una observación para asegurarse de que la coincidencia
         aparezca en el límite correcto. Su contraparte al final hace el mismo trabajo para los personajes que siguen.
         Sin embargo, si las palabras tocan el comienzo o el final de la cadena, entonces debemos tener en cuenta eso,
         que es donde hemos agregado ^ | al primer grupo para que signifique "el inicio de la cadena o cualquier
         carácter que no sea una letra", y hemos agregado | $ al final del último grupo que no captura, para permitir
         que el final de la cadena sea un límite

         Los caracteres que se encuentran en grupos que no capturan no aparecen en la coincidencia cuando usamos  find .
         Debemos tener en cuenta que incluso un caso de uso simple como este puede tener muchos casos extremos, por lo
         que es importante probar nuestras expresiones regulares . Para esto, podemos escribir pruebas unitarias, usar
         las herramientas integradas de nuestro IDE o usar una herramienta en línea como Regexr .

         2.2. Probar nuestro ejemplo
         Con nuestro texto de ejemplo en una constante llamada EXAMPLE_INPUT y nuestra expresión regular en un
         Patrón llamado  TITLE_CASE_PATTERN , usemos find en la clase Matcher para extraer todas nuestras
         coincidencias en una prueba unitaria:
         */

        Pattern pattern = Pattern.compile("(?<=^|[^A-Za-z])([A-Z][a-z]*)(?=[^A-Za-z]|$)");
        Matcher matcher = pattern.matcher("First 3 Capital Words! then 10 TLAs, I Found");
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group(1));
        }
        System.out.println(matches);


    }


}

package pl.infoshare;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        byte a = 2;
        byte b = 2;
        byte c = 0;
        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a / b );



    }
}
----------------------------------------------------------------------------------
2 wersja 
public class App 
{
    public static void main ( String[] args )
{
    int dodawanie = 2 + 2;
    int odejmowanie = 2 - 2;
    /*int dzielenie = 2 / 0;*/
    System.out.println( dodawanie );
    System.out.println( odejmowanie );
    /*System.out.println( dzielenie ); */
    }
}

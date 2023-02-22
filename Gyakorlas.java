
package gyakorlas;


public class Gyakorlas {

  
    public static void main(String[] args) {
        elso10SzamOsszege();
        String szoveg= "Az első 10 szám összege %d\n\",osszeg";
        kiir(szoveg);
        
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg +=i;
        }
        return osszeg;
        //System.out.println("Az első 10 szám összege: " + osszeg);
    }
    private static int osszead(int  a, int b){
    return a+b;    
    //System.out.printf("%d + %d =%d\n ",a,b,a+b);
    }
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    
}


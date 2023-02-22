
package gyakorlas;


public class Gyakorlas {

  
    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az első 10 szám összege: " +osszeg + "\n";
        kiir(kimenet);
        
        int szam1 =7, szam2 = 4;
        osszeg = osszead(szam1,szam2);
        kiir("%d + %d =%d \n".formatted(szam1, szam2, osszeg));
        
        
        osszeg = osszead(1, osszead(2, osszead(3,4)));
        kiir("1+2+3+4="+osszeg+"\n");
        
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


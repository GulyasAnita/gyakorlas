
package gyakorlas;


public class Gyakorlas {

  
    public static void main(String[] args) {
        feladatok();
       
       
        
    }

    private static void feladatok() {
        Osszege();
        
        int szam1 =7, szam2 = 4;
        osszeg = osszead(szam1,szam2);
        kiir("%d + %d =%d \n".formatted(szam1, szam2, osszeg));
        
        osszeg = osszead(1,2);
        kiir("1+2+3+4="+osszeg+"\n");
        
        osszeg =osszead(1,2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg,4);
        kiir("1+2+3+4="+osszeg+"\n");
        
        gyokvonas();
    }

    private static void Osszege() {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az első 10 szám összege: " +osszeg + "\n";
        kiir(kimenet);
    }

    private static void gyokvonas() {
        int osszeg;
        int a = 3, b = 4, c = 2;
        osszeg = osszead(a,b);
        osszeg = osszead(osszeg, c);
        String s ="%d + %d + %d gyöke".formatted(a, b, c);
        double gyok = Math.sqrt(osszeg);
        String kimenet = String.format("%s %.4f\n",s, gyok );
        kiir(kimenet);
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


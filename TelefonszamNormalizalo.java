/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonszamnormalizalo;

/**
 *
 * @author bodnart
 *
 */
public class TelefonszamNormalizalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String t1 = "06363228101";
        String t2 = "06-32-425810";
        String t3 = "06(1)4332810";
        String t4 = "+3636322810";
        String t5 = "30/322681";
        String t6 = "+36-1-4322810";
        String[] szamok = new String[6];
        szamok[0] = t1.replaceAll("[^0-9]","");
        szamok[1] = t2.replaceAll("[^0-9]","");
        szamok[2] = t3.replaceAll("[^0-9]","");
        szamok[3] = t4.replaceAll("[^0-9]","");
        szamok[4] = t5.replaceAll("[^0-9]","");
        szamok[5] = t6.replaceAll("[^0-9]","");
       
        StringBuilder[] telSzam = new StringBuilder[6];
        for (int i = 0; i < telSzam.length; i++) {
            telSzam[i] = new StringBuilder(szamok[i]);
            if ((telSzam[i].charAt(0) == '3'|| telSzam[i].charAt(0) == '2'||telSzam[i].charAt(0) == '7') && telSzam[i].charAt(1) == '0'){
                telSzam[i].insert(0, "+36");
            }
            if (telSzam[i].charAt(0) != '+') {
                telSzam[i].insert(0, "+");
            }
            if (telSzam[i].charAt(1) == '0') {
                telSzam[i].replace(1, 2, "3");
            }

            telSzam[i].insert(3, "-");
            if (telSzam[i].charAt(4) == '1') {
                telSzam[i].insert(5, "-");
            } else {
                telSzam[i].insert(6, "-");
            }
            if(telSzam[i].length()<=12){
                System.out.print("A(z) "+ telSzam[i]);
                telSzam[i]= new StringBuilder(" helytelen!");
                System.out.println(telSzam[i]);
            }
            if (telSzam[i].length()==13){
                if (((telSzam[i].charAt(4) == '3'|| telSzam[i].charAt(4) == '2'||telSzam[i].charAt(4) == '7') && telSzam[i].charAt(5) == '0')){
                    System.out.print("A(z) "+ telSzam[i]);
                telSzam[i]= new StringBuilder(" helytelen!");
                System.out.println(telSzam[i]);
                }
            }
            if (telSzam[i].length()==14){
                if (!((telSzam[i].charAt(4) == '3'|| telSzam[i].charAt(4) == '2'||telSzam[i].charAt(4) == '7') && telSzam[i].charAt(5) == '0')){
                    System.out.print("A(z) "+ telSzam[i]);
                telSzam[i]= new StringBuilder(" helytelen!");
                System.out.println(telSzam[i]);
                }
            }
            if (telSzam[i].length()>14){
                System.out.print("A(z) "+ telSzam[i]);
                telSzam[i]= new StringBuilder(" helytelen!");
                System.out.println(telSzam[i]);
            }
        }

        for (StringBuilder szam : telSzam) {
            System.out.println(szam);
        }
    }

}

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

        StringBuilder t1 = new StringBuilder("063632281");
        StringBuilder t2 = new StringBuilder("06-32-425810");
        StringBuilder t3 = new StringBuilder("06(1)4332810");
        StringBuilder t4 = new StringBuilder("+3636322810");
        StringBuilder t5 = new StringBuilder("063032268103");
        StringBuilder t6 = new StringBuilder("+36-1-4322810");
        StringBuilder[] telSzam = new StringBuilder[6];
        telSzam[0] = t1;
        telSzam[1] = t2;
        telSzam[2] = t3;
        telSzam[3] = t4;
        telSzam[4] = t5;
        telSzam[5] = t6;

        for (int i = 0; i < telSzam.length; i++) {
            if (telSzam[i].charAt(0) != '+') {
                telSzam[i].insert(0, "+");
            }
            if (telSzam[i].charAt(1) == '0') {
                telSzam[i].replace(1, 2, "3");
            }
            for (int j = telSzam[i].length() - 1; j >= 0; j--) {
                if (telSzam[i].charAt(j) == '(' || telSzam[i].charAt(j) == ')' || telSzam[i].charAt(j) == '-') {
                    telSzam[i].deleteCharAt(j);
                }
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


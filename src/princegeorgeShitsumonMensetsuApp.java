import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//26 Juni 2023, REnshuu java, bikin program "mensetsu kage" (random pertanyaan)
public class princegeorgeShitsumonMensetsuApp { //Kelas Utama
    public static void main(String[] args) {
        mainMenu();
    }

    static void mainMenu(){
        angkaRandom();
    }

    static void angkaRandom(){
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 31) {
            int randomNumber = random.nextInt(31); // Change the range as needed

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
                System.out.println("Press: "); //Pencet angka satu, nanti akan muncul pertanyaan random
                Scanner scanner = new Scanner(System.in); //scanner utk input
                int pilihan = scanner.nextInt();
                int pawa = 1; //tsukawanai
                String[] shitsumon; //array dong
                shitsumon = new String[31]; //jumlah pertanyaan (bisa ditambah)
                shitsumon[0] = "Dono/ dore gurai nihongo o benkyou shimashitaka?";
                shitsumon[1] = "Nihonggo wa dou desuka? Nani ga omoshiroi desuka?";
                shitsumon[2] = "Nannenkan gurai nihon de hatarakitai to omoimasuka?";
                shitsumon[3] = "Dore gurai nihon de hatarakitai to omoimasuka?";
                shitsumon[4] = "Sannenkan de ikura gurai kasei dekimasuka? Sono okane de nani o shitai desuka?";
                shitsumon[5] = "Doushite nihon de hatarakitai desuka?";
                shitsumon[6] = "Nihon e iku mokuteki wa nan desuka";
                shitsumon[7] = "Shigoto igai, nihon de nani o shitai desuka?";
                shitsumon[8] = "Shigoto no keiken ga arimasuka? Kyuuryou wa ikkagetsu/tsukini ikura gurai desuka?";
                shitsumon[9] = "Shokureki o oshiete kudasai/nandesuka? Kyuuryou wa ikkagetsu/tsukini ikura gurai desuka?";
                shitsumon[10] = "Kyuuryou wa ikkagetsu/tsukini ikura gurai desuka?";
                shitsumon[11] = "Nihon wa donna kuni desuka?";
                shitsumon[12] = "Nihon ni taisuru insho wa nandesuka?";
                shitsumon[13] = "Seikaku to chousho to tansho o oshiete kudasai";
                shitsumon[14] = "Goshumi wa nandesuka?";
                shitsumon[15] = "Tokugi wa nandesuka/arimasuka?";
                shitsumon[16] = "Kikakke o oshiete kudasai";
                shitsumon[17] = "x";
                shitsumon[18] = "x";
                shitsumon[19] = "Shinchou wa nan senci desuka?";
                shitsumon[20] = "Taijuu wa nan kiro desuka?";
                shitsumon[21] = "Shuukyou wa nandesuka?";
                shitsumon[22] = "Ketsueki gata wa nan gata desuka";
                shitsumon[23] = "Tabako o suuimasuka?";
                shitsumon[24] = "Osake o nomimasuka?";
                shitsumon[25] = "Shiryoku wa mondai ga arimasuka?";
                shitsumon[26] = "Shikimo ga arimasuka?";
                shitsumon[27] = "Gakureki o oshiete kudasai";
                shitsumon[28] = "Kazoku wa nannin imasuka";
                shitsumon[29] = "Okaa san no shigoto wa nandesuka? otouto? imouto?";
                shitsumon[30] = "Seikaku to chouso to tansho o oshiete kudasai";

                //int angkaRandom = random.nextInt(30); //batasan angka random hny sampai 3, karena ya cuma 3 pertanyaannya

                System.out.println(shitsumon[randomNumber]);//output
            }
        }
        mainMenu(); // pemanggilan method main menu kembali
    }
}

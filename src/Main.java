import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {



        String nama = "Poltek Harber";
        System.out.println(nama.length());
        char karakter_pertama = nama.charAt(0);
        char karakter_terakhir = nama.charAt(12);
        System.out.println("Karakter pertama adalah :" + karakter_pertama);
        System.out.println("Karakter terakhir adalah :" + karakter_terakhir);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan kalimat = ");
        String p = reader.readLine();
        char huruf = 'r';
        int jumlah_huruf = 0;
        for (int counter = 0; counter<p.length(); counter++){
            if (p.charAt(counter)==huruf){
                jumlah_huruf++;
            }
        }
        System.out.println("Jumlah huruf r adalah = "+ jumlah_huruf);
}
}
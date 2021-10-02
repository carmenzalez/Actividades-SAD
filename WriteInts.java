import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author carmeeeen
 */

public class WriteInts {

    public static void main(String[] args) throws IOException {

        DataOutputStream out = new DataOutputStream(System.out);
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (sc.hasNextInt()) {
            i = sc.nextInt();
            out.writeInt(i);
            
        }
        out.close();
    }
}

//READlINE buffer retorna 1
// que retorna read inputstream cuando no hay mas datos que leer -1
//read ints from stdin and write in binary to stdout en C

//int main ()
//{
//    int i = 0;
//    while(scanf("%d", &i)!= EOF){
//        //write to stdout in binary
//        fwrite(&i, sizeof(i) , 1, stdout);
//    }
//    return EXIT_SUCCESS;
//}
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author carmeeeen
 */

/* read binary ints from stdin and write them in textual form to stdout*/
//leera de System.in que es el stdin d c
//el final del archivo EOF lo detecta scanf en c, java readint() con la excepcn


public class ReadInts {

    public static void main(String[] args) throws IOException {

        DataInputStream in = new DataInputStream(System.in);
        int i = 0;

        while (true) {
            try {
                i = in.readInt();
            } catch (EOFException e) {
                break;
            }
            System.out.println(i);
        }
    }
}



// java ReadInts </tmp/intsc.bin
// #include <stdio.h>
// read int binary from stdin write textual to stdout
//int main ()
//{
//    int i = 0;
//    while(fread(&i, sizeof(i), 1, stdin) > 0 ){
//        printf("%d\n",i);
//    }
// 
//    return EXIT_SUCCESS;
//}
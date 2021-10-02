
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carmeeeen
 */
public class ReadColsTerminal {

    int width;

    public ReadColsTerminal() {

    }

    public int getCols() {

        String[] cmd = {"bash", "-c", "tput cols 2> /dev/tty"};
        
        try {

            Process colsProcess = new ProcessBuilder(cmd).start();
            BufferedReader colsReader = new BufferedReader(new InputStreamReader(colsProcess.getInputStream()));
            String cols = colsReader.readLine();
            width = Integer.parseInt(cols);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return width;

    }

    public static void main(String[] args) {

        ReadColsTerminal rd = new ReadColsTerminal();
        System.out.println(rd.getCols());
    }
}


/*
1.
Process 
The Process is an abstract class defined in the java.lang package that encapsulates the runtime 
information of a program in execution. to create an instance of this class, with the 
ProcessBuilder.start() method. The methods defined by the Process class can be used to perform 
input/output operations from the process.

ProcessBuilder(List<String> command)
Empiezas un proceso por el cual le pasas el comando bash, tput cols 2> /dev/tty-> num cols
para saber el numero de columnas

Process.getInputStream() 
By default, the subprocess writes standard output and standard error to pipes. Java code can access
these pipes via the input streams returned by Process.getInputStream() and Process.getErrorStream()

2.
BufferedReader
Reads text from a character-input stream, buffering characters so as to provide for the efficient 
reading of characters, arrays, and lines.
BufferedReader in = new BufferedReader(new FileReader("foo.in")); 
In general, each read request made of a Reader causes a corresponding read request to be made of 
the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around 
any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders.

En nuestro caso le pasamos al BufferedReader un InputStreamReader 

InputStreamReader(InputStream in) extends Reader

in: el input del proceso Process.getInputStream()


3.
Pasar a un string la linea

4.
Pasar a int el numero de columnas del string

 */

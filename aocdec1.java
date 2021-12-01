import java.io.*;
import java.util.*;

public class aocdec1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("feed.txt"));
        int [] item = new int [2000];
        int i=0;
        int count=0;
        while(scanner.hasNextInt())
        {
             item[i++] = scanner.nextInt();
        }
        for(i=0; i<1998;i++){
            if ((item[i]+item[i+1]+item[i+2])<(item[i+1]+item[i+2]+item[i+3])){
                count++;
            }
        }
        StdOut.println(count);
    }
}

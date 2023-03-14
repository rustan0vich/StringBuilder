import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        int[] massiv={1,2,3,4,5,6};
//        StringBuilder stringBuilder=new StringBuilder();
//        for (int i = 0; i < massiv.length; i++) {
//            stringBuilder.append(massiv[i]+" ");
//
//
//        }
//        System.out.println(stringBuilder);

        FileWriter aa=new FileWriter("Just.txt");

//        aa.write("A"+" "+"a\n");
//        aa.write("B"+" "+"b\n");
//        aa.write("C"+" "+"c\n");
//        aa.write("D"+" "+"d\n");
//        aa.write("E"+" "+"e\n");
//        aa.write("F"+" "+"f\n");
//        aa.write("J"+" "+"j\n");
//        aa.write("H"+" "+"h\n");
//        aa.write("I"+" "+"i\n");
//        aa.write("G"+" "+"g\n");
//        aa.write("K"+" "+"k\n");
//        aa.write("L"+" "+"l\n");
//        aa.write("M"+" "+"m\n");
//        aa.write("N"+" "+"n\n");
//        aa.write("O"+" "+"o\n");
//        aa.write("P"+" "+"p\n");
//        aa.write("Q"+" "+"q\n");
//        aa.write("R"+" "+"r\n");
//        aa.write("S"+" "+"s\n");
//        aa.write("T"+" "+"t\n");
//        aa.write("U"+" "+"u\n");
//        aa.write("V"+" "+"v\n");
//        aa.write("W"+" "+"w\n");
//        aa.write("X"+" "+"x\n");
//        aa.write("Y"+" "+"y\n");
//        aa.write("Z"+" "+"z\n");
//        aa.write("1"+" "+"\n");
//        aa.write("2"+" "+"\n");
//        aa.write("3"+" "+"\n");
//        aa.write("4"+" "+"\n");
//        aa.write("5"+" "+"\n");
//        aa.write("6"+" "+"\n");
//        aa.write("7"+" "+"\n");
//        aa.write("8"+" "+"\n");
//        aa.write("9"+" "+"\n");
//        char h = 'a'
        for (char i = 'A',u='a'; i <='Z'&&u<='z' ; i++,u++) {
            aa.write(i+" "+u+"\n");

        }
        for (char i = '0'; i <= '9'; i++) {
            aa.write(i+"\n");

        }
        aa.close();
        FileReader bb=new FileReader("Just.txt");
        Scanner ss=new Scanner(bb);
        int d=0;

        while (ss.hasNextLine()){
            d++;
            System.out.println(d+":"+ss.nextLine());
        }


    }
}
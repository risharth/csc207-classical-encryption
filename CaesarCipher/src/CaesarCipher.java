


import java.util.Scanner;

public class CaesarCipher {

public static void encode(String str){

char [] inputArr=str.toCharArray();

int length=str.length();

char[]outputArr=new char[length] ; 

int base = 97;

for (int n=0;n<26;n++){

for (int i=0; i<length; i++){

int outputCode = ((int)inputArr[i]-base+n)%26;

outputArr[i]=(char)(outputCode+base);

}

System.out.println("n = "+n+":"+new String(outputArr)); 

}

return ;

}

public static void decode(String str){

char [] inputArr=str.toCharArray();

int length=str.length();

char[]outputArr=new char[length] ; 

int base = 97;

for (int n=0;n<26;n++){

for (int i=0; i<length; i++){

int outputCode = ((int)inputArr[i]-base-n)%26;

if (outputCode < 0) {

outputArr[i]=(char)(outputCode+base+26);

}

else{

outputArr[i]=(char)(outputCode+base);

}

}

System.out.println("n = "+n+":"+new String(outputArr)); 

}

return ;

}

public static void main(String[] args) {

System.out.println("This program encrypts and " +

"decrypts messages using the Caeser Cipher.\n" +

                "Would you like to encode or decode a message?\n");

Scanner in = new Scanner(System.in);

String response = in.nextLine();

if (response.equals("encode")){

System.out.println("enter the string to encode:");

String input = in.nextLine();

encode(input);

}

else if (response.equals("decode")) {

System.out.println("enter the string to decode:");

String input = in.nextLine();

decode(input);

}

else {

System.out.println("invalid input");

return;

}

}

}

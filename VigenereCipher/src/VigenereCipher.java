

import java.util.Scanner;

public class VigenereCipher {

public static void encode(String str, String key){

char [] inputArr=str.toCharArray();

int length = str.length();

int keylen = key.length();

char[]keyarr = new char[length];

char[]outputArr = new char[length]; 

int base = 97;

if (keylen >= length) {

for (int c = 0; c < length; c++) {
	
	keyarr[c] = key.charAt(c);
	
}

}

else {
	int kl = 0;
	for (int s = 0; s < length; s++) {
		if (kl == keylen-1) {
			keyarr[s] = key.charAt(kl);
			kl = 0;
		}
		else {
				keyarr[s] = key.charAt(kl);
				kl++;
		}
	}
}


for (int i=0; i<length; i++){

int outputCode = (((int)inputArr[i]-base)+((int)keyarr[i]-base))%26;

outputArr[i] = (char)(outputCode+base);

}

System.out.println(new String(outputArr)); 



return ;

}

public static void decode(String str, String key){

	char [] inputArr=str.toCharArray();

	int length = str.length();

	int keylen = key.length();

	char[]keyarr = new char[length];

	char[]outputArr = new char[length]; 

	int base = 97;

	if (keylen >= length) {

	for (int c = 0; c < length; c++) {
		
		keyarr[c] = key.charAt(c);
		
	}

	}

	else {
		int kl = 0;
		for (int s = 0; s < length; s++) {
			if (kl == keylen-1) {
				keyarr[s] = key.charAt(kl);
				kl = 0;
			}
			else {
					keyarr[s] = key.charAt(kl);
					kl++;
			}
		}
	}


	for (int i=0; i<length; i++){

	int outputCode = (((int)inputArr[i]-base)-((int)keyarr[i]-base))%26;
	
	if (outputCode < 0) {

		outputArr[i]=(char)(outputCode+base+26);

		}

		else{

		outputArr[i]=(char)(outputCode+base);

		}
	
	}

	System.out.println(new String(outputArr)); 

    return ;

}

public static void main(String[] args) {

System.out.println("This program encrypts and " +

"decrypts messages using the Caeser Cipher.\n" +

                "Would you like to encode or decode a message?\n");

Scanner in = new Scanner(System.in);

String response = in.nextLine();

if (response.equals("encode")){

System.out.println("enter the string to encode:\n");

String input = in.nextLine();

System.out.println("enter the key word:\n");

String key = in.nextLine();

encode(input, key);

}

else if (response.equals("decode")) {

System.out.println("enter the string to decode:");

String input = in.nextLine();

System.out.println("enter the key word:\n");

String key = in.nextLine();

decode(input, key);

}

else {

System.out.println("invalid input");

return;

}

}

}




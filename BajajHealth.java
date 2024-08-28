
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import com.google.gson.Gson;



public class BajajHealth {

	public static String getMd5(String input) {
		try {

			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());

			BigInteger no = new BigInteger(1, messageDigest);

			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String getDestinationValue(JSONObject jsonObject) {
		try {

			

			String hashtext ="";
			
			return hashtext;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "12345finalValue5f4dcc3b";
        String prnNumber = args[1];
       // String prnNumber = "12345";
        String filePath = args[2];
        //String filePath = "D:\\example.json";
        
        try {
        	//FileReader fr = new FileReader(filePath);
        	BufferedReader br = new BufferedReader(new FileReader(filePath));
String fr = "";
        	for (String line = br.readLine(); line != null; line = br.readLine()) {
        	  fr+=line;
        	}
        	
        	
        	
			
			System.out.println(fr.toString());
			 
			String[] strArray = fr.split("\"*\"");
			
			for(String st: strArray) {
				System.out.println(st);
			}
			
			
			
			   
			 /* HashMap<String, Object> map = new Gson().fromJson(obj.toString(), HashMap.class);
			   //System.out.println("" + map);
			  for (Entry<String, Object> entry : map.entrySet()) {
				    System.out.println(entry.getKey() + "/" + entry.getValue());
				}
			   */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
	}

}

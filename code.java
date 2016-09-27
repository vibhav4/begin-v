import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class code {
	
	public static void main(String args[])
	{try
	{int a=0;
		String line= null;
		  BufferedReader br=null;
		  br=new BufferedReader(new FileReader("C:\\Users\\vibhavsharma\\Desktop\\new\\abc\\abc.jtl"));
		  br.readLine();
		  Pattern p = Pattern.compile("<httpSample.+? lb=\"(.+?)\" rc=\"(.+?)\" rm=\"(.+?)\"");
		  while((line=br.readLine())!=null)
		  {
		  
		        Matcher m = p.matcher(line);
		        if(m.find()) {

		    a=a+1;
		
		          
		         
		         
}		        }
		  br.close();

	 System.out.println(a);}	
	catch(Exception e)
	{ System.out.println(e);
}
	}
	

}

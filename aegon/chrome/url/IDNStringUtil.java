package aegon.chrome.url.IDNStringUtil;
import java.lang.Object;
import java.lang.String;
import java.net.IDN;

public class IDNStringUtil	// class@0001ed
{

    public void IDNStringUtil(){
       super();
    }
    public static String idnToASCII(String p0){
       int i = 2;
       try{
          return IDN.toASCII(p0, i);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}

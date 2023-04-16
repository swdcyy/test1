package p6.a;
import java.lang.String;
import java.lang.CharSequence;

public class a	// class@0028c1
{

    public static String a(String p0){
       object oobject;
       String[] stringArray = p0.split("=");
       int i = 1;
       if (stringArray.length > i) {
          oobject = stringArray[i];
          if (oobject.contains("\"")) {
             oobject = oobject.replaceAll("\"", "");
          }
       }else {
          stringArray = null;
       }
       return oobject;
    }
}

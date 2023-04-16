package jg0.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public class a	// class@002b8a
{

    public void a(){
       super();
    }
    public static int a(String p0,String p1){
       int i4;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || p1 == null) {
          throw new IllegalArgumentException("argument is null");
       }
       String[] stringArray = p0.split("\\.", -1);
       String[] stringArray1 = p1.split("\\.", -1);
       int i = Math.min(3, stringArray.length);
       int i1 = Math.min(3, stringArray1.length);
       int i2 = Math.min(i, i1);
       int i3 = 0;
       while (true) {
          if (i3 >= i2) {
             return Integer.compare((i - i1), 0);
          }
          String str = "";
          object oobject = (str.equals(stringArray[i3]))? null: a.b(stringArray[i3]);
          str = (str.equals(stringArray1[i3]))? null: a.b(stringArray1[i3]);
          if (oobject < str) {
             break ;
          }else if(oobject > str){
             return 1;
          }else {
             i3 = i3 + 1;
          }
       }
       return -1;
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       try{
          i = Integer.parseInt(p0);
       }catch(java.lang.NumberFormatException e0){
          Matcher matcher = Pattern.compile("^\\d+").matcher(p0);
          if (matcher.find()) {
             return a.b(matcher.group());
          }
       }
       return e0;
    }
}

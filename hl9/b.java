package hl9.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.c0;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zsd.u;

public final class b	// class@0026c4
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final String a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }
       Matcher matcher = c0.a.matcher(p0);
       while (true) {
          String str = p0;
          break ;
       }
       while (true) {
          if (matcher.find()) {
             String str1 = matcher.group(0);
             String str2 = matcher.group(1);
             if (str1 != null && str2 != null) {
                if (str) {
                   p0 = u.g2(str, str1, str2, false, 4, null);
                }else {
                   p0 = null;
                   continue ;
                }
             }
          }else if(str != null){
             obj = str;
             break ;
          }
          break ;
       }
       return obj;
    }
}

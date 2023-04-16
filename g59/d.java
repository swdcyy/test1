package g59.d;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.net.URLDecoder;
import kotlin.text.Regex;

public final class d	// class@0023fa
{
    public static final Pattern a;
    public static final Pattern b;
    public static final d c;

    static {
       d.c = new d();
       d.a = Pattern.compile("\(inline|attachment\)\\s*;\\s*filename\\s*=\\s*\(\"\(\(?:\\\\.|[^\"\\\\]\)*\)\"|[^;]*\)\\s*\(?:;\\s*filename\\*\\s*=\\s*\"*\\s*\(utf-8|iso-8859-1\)\'[^\']*\'\([^;\"\\s]*\)\)?", 2);
       d.b = Pattern.compile("\(inline|attachment\)\\s*;\\s*filename\\*\\s*=\\s*\"*\\s*\(utf-8|iso-8859-1\)\'[^\']*\'\([^;\"\\s]*\)", 2);
    }
    public void d(){
       super();
    }
    public static final String a(String p0){
       String str = null;
       String obj = PatchProxy.applyOneRefs(p0, str, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Matcher matcher = d.a.matcher(p0);
       if (matcher.find()) {
          obj = matcher.group(5);
          str = matcher.group(4);
          if (obj != null && str != null) {
             str = URLDecoder.decode(obj, str);
          }else {
             obj = matcher.group(3);
             if (obj != null) {
                obj = new Regex("\\\\\(.\)").replace(obj, "$1");
                if (obj != null) {
                label_004b :
                   str = URLDecoder.decode(obj);
                }
             }
             obj = matcher.group(2);
             goto label_004b ;
          }
       }
       return str;
    }
}

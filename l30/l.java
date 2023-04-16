package l30.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class l	// class@001d38
{
    public static boolean a;

    public void l(){
       super();
    }
    public static void a(String p0){
       PatchProxy.applyVoidOneRefs(p0, null, l.class, "1");
    }
    public static String b(Throwable p0){
       Throwable obj = PatchProxy.applyOneRefs(p0, null, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0;
       while (true) {
          if (obj != null) {
             if (obj instanceof UnknownHostException) {
                break ;
             }else {
                obj = obj.getCause();
             }
          }else {
             StringWriter stringWriter = new StringWriter();
             p0.printStackTrace(new PrintWriter(stringWriter));
             return stringWriter.toString();
          }
       }
       return "";
    }
    public static void c(String p0){
       PatchProxy.applyVoidOneRefs(p0, null, l.class, "5");
    }
    public static void d(String p0){
       PatchProxy.applyVoidOneRefs(p0, null, l.class, "7");
    }
}

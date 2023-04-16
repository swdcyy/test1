package ix9.e;
import java.lang.Object;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;

public class e	// class@0028b3
{
    public static String a = "comment_wonderful_page_type";
    public static String b = "comment_wonderful_page_show";
    public static String c = "comment_wonderful_page_load_start";
    public static String d = "comment_wonderful_page_load_succeed";
    public static String e = "comment_wonderful_page_load_failed";

    public void e(){
       super();
    }
    public static i3 a(){
       i3 obj = PatchProxy.apply(null, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c(e.a, Integer.valueOf(1));
       return obj;
    }
}

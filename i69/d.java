package i69.d;
import java.lang.Object;
import j69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class d	// class@00263c
{
    public static final String a = "AICutSdk";
    public static boolean b;
    public static a c;
    public static final d d;

    static {
       d.d = new d();
    }
    public void d(){
       super();
    }
    public final a a(){
       a obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.c;
       if (obj == null) {
          a.S("aiCutConfig");
       }
       return obj;
    }
}

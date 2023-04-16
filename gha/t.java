package gha.t;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import gha.t$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import gha.t$a;
import gha.t$b;

public abstract class t	// class@002ae8
{
    public final String a;
    public static final SharedPreferences b;
    public static t$c c;

    static {
       t.b = b.b("DefaultPreferenceHelper");
       t.c = new t$c();
    }
    public void t(String p0){
       super();
       this.a = p0;
    }
    public static t b(String p0){
       t$c obj = PatchProxy.applyOneRefs(p0, null, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.c;
       Objects.requireNonNull(obj);
       t$a uoa = PatchProxy.applyOneRefs(p0, obj, t$c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new t$a(p0);
       }
       return uoa;
    }
    public static t c(String p0){
       t$c obj = PatchProxy.applyOneRefs(p0, null, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.c;
       Objects.requireNonNull(obj);
       t$b uob = PatchProxy.applyOneRefs(p0, obj, t$c.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new t$b(p0);
       }
       return uob;
    }
    public abstract Object a(Object p0);
    public abstract void d(Object p0);
}

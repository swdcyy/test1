package d61.l0;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import d61.l0$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import d61.l0$a;
import d61.l0$b;
import java.lang.reflect.Type;
import d61.l0$d;
import d61.l0$f;
import android.content.SharedPreferences$Editor;
import oe6.g;

public abstract class l0	// class@001f31
{
    public final String a;
    public static final SharedPreferences b;
    public static l0$e c;

    static {
       l0.b = b.b("DefaultPreferenceHelper");
       l0.c = new l0$e();
    }
    public void l0(String p0){
       super();
       this.a = p0;
    }
    public static l0$e c(){
       return l0.c;
    }
    public static l0 d(String p0){
       l0$e obj = PatchProxy.applyOneRefs(p0, null, l0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l0.c;
       Objects.requireNonNull(obj);
       l0$a uoa = PatchProxy.applyOneRefs(p0, obj, l0$e.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new l0$a(p0);
       }
       return uoa;
    }
    public static l0 e(String p0){
       l0$e obj = PatchProxy.applyOneRefs(p0, null, l0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l0.c;
       Objects.requireNonNull(obj);
       l0$b uob = PatchProxy.applyOneRefs(p0, obj, l0$e.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new l0$b(p0);
       }
       return uob;
    }
    public static l0 f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l0.c.a(p0);
    }
    public static l0 g(String p0,Type p1){
       l0$e obj = PatchProxy.applyTwoRefs(p0, p1, null, l0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l0.c;
       Objects.requireNonNull(obj);
       l0$d uod = PatchProxy.applyTwoRefs(p0, p1, obj, l0$e.class, "6");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new l0$d(p0, p1);
       }
       return uod;
    }
    public static l0 h(String p0){
       l0$e obj = PatchProxy.applyOneRefs(p0, null, l0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l0.c;
       Objects.requireNonNull(obj);
       l0$f uof = PatchProxy.applyOneRefs(p0, obj, l0$e.class, "4");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new l0$f(p0);
       }
       return uof;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l0.class, "7")) {
          return;
       }
       g.a(l0.b.edit().remove(this.a));
       return;
    }
    public abstract Object b(Object p0);
    public abstract void i(Object p0);
}

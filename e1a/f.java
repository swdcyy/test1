package e1a.f;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Locale;

public final class f	// class@002047
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void a(Intent p0,NasaSlideParam$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       a.p(p1, "nasaSlideParam");
       Uri data = p0.getData();
       if (data != null) {
          String queryParamet = data.getQueryParameter("backTitle");
          if (queryParamet != null) {
             p1.H(queryParamet);
          }
          queryParamet = data.getQueryParameter("disableSidebar");
          if (queryParamet != null) {
             a.o(queryParamet, "it");
             p1.i(f.a.b(queryParamet));
          }
          queryParamet = data.getQueryParameter("enableShowLikeTab");
          if (queryParamet != null) {
             a.o(queryParamet, "it");
             p1.v(f.a.b(queryParamet));
          }
          String queryParamet1 = data.getQueryParameter("enableShowMarquees");
          if (queryParamet1 != null) {
             a.o(queryParamet1, "it");
             p1.y(f.a.b(queryParamet1));
          }
       }
       return;
    }
    public final boolean b(String p0){
       Locale obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Locale.ROOT;
       a.o(obj, "Locale.ROOT");
       p0 = p0.toLowerCase(obj);
       a.o(p0, "\(this as java.lang.String\).toLowerCase\(locale\)");
       return (a.g("false", p0) ^ 0x01);
    }
}

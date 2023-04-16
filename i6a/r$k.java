package i6a.r$k;
import jta.a;
import i6a.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;

public final class r$k extends a	// class@0027b6
{
    public final r a;

    public void r$k(r p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport2(r$k.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, r$k.class, "1")) {
          return;
       }
       if (!p0) {
          this.a.V8();
       }
       PatchProxy.onMethodExit(r$k.class, "1");
       return;
    }
}

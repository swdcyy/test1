package fia.f$m;
import jta.f;
import fia.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import bia.g;

public final class f$m extends f	// class@002908
{
    public final f a;

    public void f$m(f p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       f$m om = f$m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "1")) {
          return;
       }
       if (p0 - 0x3f800000) {
          this.a.W8().a(true);
       }else {
          this.a.W8().a(false);
       }
       return;
    }
}

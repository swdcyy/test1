package g19.q0$b;
import jta.a;
import g19.q0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public final class q0$b extends a	// class@0023d7
{
    public final q0 a;

    public void q0$b(q0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       q0$b uob = q0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       float f = 0;
       if (!p0 - f) {
          this.a.P8(f);
       }else if(!p0 - 0x3f800000){
          this.a.P8(0x3f800000);
       }
       return;
    }
    public void c(float p0){
       q0$b uob = q0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.P8(p0);
       return;
    }
}

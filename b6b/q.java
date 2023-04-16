package b6b.q;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import g6b.b;
import java.util.Map;
import k6b.b;

public final class q	// class@000379
{
    public static float a = 0.000000;
    public static float b = 15.001000;
    public static float c;
    public static final q d;

    static {
       q.d = new q();
    }
    public void q(){
       super();
    }
    public final float a(float p0){
       if (!p0 - 0x41700000) {
          p0 = 15.00f;
       }
       return p0;
    }
    public final float b(){
       float b = q.b;
       if (!b) {
          b = 15.00f;
       }
       return b;
    }
    public final float c(){
       return q.c;
    }
    public final void d(float p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq, "1")) {
          return;
       }
       Float uFloat = b.b(b.b.b());
       if (uFloat != null) {
          p0 = uFloat.floatValue();
       }
       q.b = this.a(p0);
       return;
    }
    public final void e(float p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq, "3")) {
          return;
       }
       q.c = this.a(p0);
       return;
    }
}

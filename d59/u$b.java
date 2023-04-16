package d59.u$b;
import c59.n;
import d59.u;
import java.lang.Object;
import c59.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public final class u$b implements n	// class@00205e
{
    public final u a;

    public void u$b(u p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       m.a(this, p0);
    }
    public void b(float p0,float p1){
       u$b uob = u$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       u$b ta = this.a;
       boolean b = (p1 - 0x3f800000)? true: false;
       ta.P8(b);
       return;
    }
}

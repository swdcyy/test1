package ls1.c;
import ub.a;
import ls1.d;
import msd.l;
import hc.b;
import msd.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ls1.e;
import dc.a;

public final class c extends a	// class@00300f
{
    public final d b;
    public final l c;
    public final b d;
    public final a e;

    public void c(d p0,l p1,b p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       this.c.invoke(p1);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
       }else if(p1 == null){
          this.c.invoke(null);
       }else if(p2 instanceof a){
          c tb = this.b;
          Objects.requireNonNull(tb);
          e uoe = PatchProxy.applyOneRefs(p2, tb, d.class, "5");
          if (uoe != PatchProxyResult.class) {
          }else {
             uoe = new e(p2, p2.f());
          }
          p2.k(uoe);
          tb = this.d;
          if (tb != null) {
             p2.l(tb);
          }
       }
       this.e.invoke();
       return;
    }
}

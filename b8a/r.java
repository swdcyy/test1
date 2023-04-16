package b8a.r;
import msd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.g;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Float;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class r implements r	// class@0003e2
{
    public final g b;

    public void r(g p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       r tb = this.b;
       p1 = p1.floatValue();
       p2 = p2.floatValue();
       float f = p3.floatValue();
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(g.class)) {
          p1 = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(f), tb, g.class, "12");
          if (p1 != PatchProxyResult.class) {
          label_005e :
             return p1;
          }
       }
       p1 = g.V0;
       p1.setEmpty();
       p1.right = p0.width();
       RectF top = p0.top;
       float f1 = top - (top * f);
       p1.top = f1;
       p1.bottom = f1 + (p0.height() - ((p0.height() - p2) * f));
       goto label_005e ;
    }
}

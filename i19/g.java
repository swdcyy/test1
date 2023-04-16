package i19.g;
import msd.r;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.a;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Float;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yx.j0;

public final class g implements r	// class@00260b
{
    public final a b;

    public void g(a p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       g tb = this.b;
       p1 = p1.floatValue();
       p2 = p2.floatValue();
       float f = p3.floatValue();
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(a.class)) {
          p1 = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(f), tb, a.class, "9");
          if (p1 != PatchProxyResult.class) {
          label_0077 :
             return p1;
          }
       }
       p1 = a.J;
       p1.setEmpty();
       p1.right = p0.width();
       RectF top = p0.top;
       float f1 = top - (top * f);
       p1.top = f1;
       p1.bottom = f1 + (p0.height() - ((p0.height() - p2) * f));
       p2 = new Object[0];
       j0.a("AdVideoSmallWindowPresenter", "frame rect is : "+p1, p2);
       goto label_0077 ;
    }
}

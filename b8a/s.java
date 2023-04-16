package b8a.s;
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
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;

public final class s implements r	// class@0003f3
{
    public final g b;

    public void s(g p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       RectF rectF;
       g g;
       float f1;
       s tb = this.b;
       p1 = p1.floatValue();
       p2 = p2.floatValue();
       float f = p3.floatValue();
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(g.class)) {
          rectF = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(f), tb, g.class, "13");
          if (rectF != PatchProxyResult.class) {
          label_00b1 :
             return rectF;
          }
       }
       g = (tb.v.isVideoType())? tb.G: tb.H;
       p1 = tb.k9(tb.X8(g), p1, p2, 0x3f800000);
       if ((p1.width() / p1.height()) - 0x3f100000 > 0) {
          f1 = (((p1.width() * 16.00f) / 9.00f) - p1.height()) / 2.00f;
          p1.top = p1.top - f1;
          p1.bottom = p1.bottom + f1;
       }
       f1 = p0.top;
       f1 = f1 - ((f1 - p1.top) * f);
       p0 = p0.right;
       p1 = g.V0;
       p1.setEmpty();
       p1.set((p1.left * f), f1, (p0 - ((p0 - p1.right) * f)), ((p0.height() - ((p0.height() - p1.height()) * f)) + f1));
       rectF = p1;
       goto label_00b1 ;
    }
}

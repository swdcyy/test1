package i19.h;
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
import i19.k;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import java.lang.StringBuilder;
import yx.j0;
import im8.f;

public final class h implements r	// class@00260c
{
    public final a b;

    public void h(a p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       RectF rectF;
       float f1;
       h tb = this.b;
       p1 = p1.floatValue();
       p2 = p2.floatValue();
       float f = p3.floatValue();
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(a.class)) {
          rectF = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(f), tb, a.class, "10");
          if (rectF != PatchProxyResult.class) {
          label_00da :
             return rectF;
          }
       }
       a b = (tb.s.isVideoType())? tb.B: tb.C;
       p1 = tb.b9(tb.V8(b), p1, p2, 0x3f800000);
       if ((p1.width() / p1.height()) - 0x3f100000 > 0) {
          f1 = (((p1.width() * 16.00f) / 9.00f) - p1.height()) / 2.00f;
          p1.top = p1.top - f1;
          p1.bottom = p1.bottom + f1;
       }
       f1 = p0.top;
       f1 = f1 - ((f1 - p1.top) * f);
       float f2 = p1.left * f;
       RectF right = p0.right;
       float f3 = right - ((right - p1.right) * f);
       p1 = a.J;
       p1.setEmpty();
       p1.set(f2, f1, f3, ((p0.height() - ((p0.height() - p1.height()) * f)) + f1));
       f = new Object[0];
       j0.a("AdVideoSmallWindowPresenter", "content rect is : "+p1, f);
       tb.z.set(Float.valueOf(((f3 - f2) / p0.width())));
       rectF = p1;
       goto label_00da ;
    }
}

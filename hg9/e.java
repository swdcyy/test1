package hg9.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.utility.n;
import e17.i;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.yxcorp.gifshow.camerasdk.q;

public final class e implements View$OnClickListener	// class@002658
{
    public final e b;

    public void e(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "18")) {
       }else {
          int i = tb.s ^ 0x01;
          tb.s = i;
          int i1 = 0;
          if (i) {
             CameraLogger.a("LIGHT_BOOST_ICON");
             n.Y(tb.p, i1, i1);
          }
          e p = tb.p;
          if (p != null) {
             p.setSelected(tb.s);
          }
          if (tb.r != null && tb.s != null) {
             i.a(R.style.arg_RES_7f110668, 0x7f1017f0);
             tb.r = i1;
          }
          d h = tb.h;
          if (h != null) {
             h.setLowLightStrategyEnabled(tb.e, tb.s);
             tb.h.s0(tb.s);
          }
          tb.p2();
       }
       return;
    }
}

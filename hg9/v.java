package hg9.v;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.i;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import oc9.d0;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.view.View;
import a2.i0;
import hg9.w;
import android.animation.Animator$AnimatorListener;
import pi9.n;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;

public final class v implements g	// class@00267c
{
    public final i b;

    public void v(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "2")) {
       }else if(p0.b != tb.c || (!PanelShowEvent.a(tb.e, p0) || tb.f2())){
          PanelShowEvent c = p0.c;
          if (c == PanelShowEvent$PanelType.PRETTIFY || c == PanelShowEvent$PanelType.MAGIC) {
             if (tb.o == Integer.MIN_VALUE && i0.Y(tb.r)) {
                tb.o = (int)tb.r.getTranslationY();
             }
             n.a(tb.r, (p0.a ^ 0x01), tb.o, new w(tb));
             if (!tb.d.d(p0.j.a()).c() && p0.b == CameraPageType.VIDEO) {
                n.a(tb.p, (p0.a ^ 0x01), tb.o, null);
             }
          }
       }
       return;
    }
}

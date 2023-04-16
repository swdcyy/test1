package lz9.f;
import erd.g;
import lz9.b0;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import wh5.a;
import rf5.u;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import tkd.b;
import tkd.d;
import ap5.a;
import uw9.c;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import qp7.x0;
import qp7.b;
import ks7.h0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import pp7.b;

public final class f implements g	// class@002edc
{
    public final b0 b;

    public void f(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!a.f() && (tb.E.u() && (!NasaSlidePlayExperimentUtil.d() || (!d.a(-2061018968).AT() && (!c.a.getBoolean(b.d("user")+"appearedDanmakuTipBubbleGuide", false) && !tb.p0(tb.A.getActivity())))))) {
          p0 = tb.E();
          Objects.requireNonNull(p0);
          h0 oh0 = h0.class;
          if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, oh0, "19")) {
             p0.l.f(Boolean.TRUE);
          }
       }
    label_0079 :
       return;
    }
}

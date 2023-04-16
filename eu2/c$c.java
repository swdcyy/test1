package eu2.c$c;
import java.lang.Runnable;
import eu2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import d61.l0;
import z12.e;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import android.view.View;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.a;
import crd.a;
import yx2.i;
import eu2.f;
import crd.b;
import crd.c;
import kotlin.jvm.internal.a;
import krd.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.x;
import brd.z;
import io.reactivex.android.schedulers.a;
import eu2.d;
import erd.g;
import com.kuaishou.live.core.voiceparty.d0;

public final class c$c implements Runnable	// class@0027ed
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, tb, uoc, "12")) {
          l0 m = c.m;
          int i = 0;
          Integer integer = m.b(Integer.valueOf(i));
          if (integer.intValue() < 2) {
             m.i(Integer.valueOf((integer.intValue() + 1)));
             String[] stringArray = new String[i];
             e.c("VoicePartyTopicNewPendantService", "showTips", stringArray);
             a$c uoc1 = new a$c(tb.g);
             uoc1.o0(tb.d);
             uoc1.p0(a1.e(8.00f));
             uoc1.F0(tb.g.getString(R.string.arg_RES_7f102de6));
             uoc1.p();
             a uoa = a.b0(R.style.arg_RES_7f11060f, uoc1);
             b uob = c.d(new f(uoa));
             a.o(uob, "Disposables.fromRunnable¡­ismissPopup\(bubble\)\n    }");
             a.b(tb.M(), uob);
             a.o(uoa, "bubble");
             if (!PatchProxy.applyVoidOneRefs(uoa, tb, uoc, "13")) {
                t.timer(5, TimeUnit.SECONDS).compose(tb.L()).observeOn(a.c()).subscribe(new d(uoa), d0.s("VoicePartyTopicNewPendantService", "showTips"));
             }
          }
       }
       return;
    }
}

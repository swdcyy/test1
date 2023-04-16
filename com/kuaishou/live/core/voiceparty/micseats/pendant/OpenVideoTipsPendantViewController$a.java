package com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import android.content.Context;
import android.content.res.Resources;
import java.lang.CharSequence;
import java.util.concurrent.TimeUnit;
import com.kwai.library.widget.popup.common.c$b;
import it2.v0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import com.kwai.library.widget.popup.common.c;

public final class OpenVideoTipsPendantViewController$a implements Observer	// class@00172d
{
    public final OpenVideoTipsPendantViewController b;

    public void OpenVideoTipsPendantViewController$a(OpenVideoTipsPendantViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OpenVideoTipsPendantViewController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             View view = p0.A2(R.id.avatar_view);
             if (!PatchProxy.applyVoidOneRefs(view, p0, OpenVideoTipsPendantViewController.class, "3") && p0.k == null) {
                a uoa = new a(p0.B2());
                uoa.K0(KwaiBubbleOption.e);
                uoa.o0(view);
                uoa.u0(17);
                uoa.v0(0);
                uoa.F0(p0.D2().getResources().getString(R.string.arg_RES_7f105118));
                uoa.T(TimeUnit.MINUTES.toMillis(1));
                uoa.P(true);
                uoa.M(new v0(p0));
                a.o(uoa, "KwaiBubbleBuilder\(activi¡­ll\n          }\n        }\)");
                p0.k = p.o(uoa);
             }
          }else {
             p0 = this.b.k;
             if (p0 != null) {
                p0.o();
             }
          }
       }
       return;
    }
}

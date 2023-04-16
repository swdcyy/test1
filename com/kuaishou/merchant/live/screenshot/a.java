package com.kuaishou.merchant.live.screenshot.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.screenshot.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle$Event;
import j74.a;
import java.util.Objects;
import j74.b;
import z1.a;
import com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager;
import ks3.t;

public class a extends PresenterV2	// class@001ad2
{
    public t p;
    public b q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q = new b();
       if (this.getActivity() != null && this.getActivity() instanceof GifshowActivity) {
          a tq = this.q;
          Activity uActivity = this.getActivity();
          Lifecycle$Event oN_START = Lifecycle$Event.ON_START;
          a uoa = new a(this);
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidThreeRefsWithListener(uActivity, oN_START, uoa, tq, b.class, "1")) {
             tq.b = uoa;
             tq.a.b(uActivity, oN_START, new b(tq));
             PatchProxy.onMethodExit(b.class, "1");
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.e();
          this.q = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       return;
    }
}

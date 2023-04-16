package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a;
import java.lang.Runnable;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import java.util.Objects;
import java.lang.Long;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import lnc.y0;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a implements Runnable	// class@000963
{
    public final LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1 b;
    public final long c;
    public final boolean d;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a(LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1 p0,long p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a.class, "1")) {
          return;
       }
       LiveAdNeoMerchantPendantView liveAdNeoMer = this.b.this$0.P8();
       LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a tc = this.c;
       LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1$a td = this.d;
       Objects.requireNonNull(liveAdNeoMer);
       if (!PatchProxy.isSupport(LiveAdNeoMerchantPendantView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(tc), Boolean.valueOf(td), liveAdNeoMer, LiveAdNeoMerchantPendantView.class, "4")) {
          String str = "mCountDownTextView";
          if (td != null) {
             LiveAdNeoMerchantPendantView b = liveAdNeoMer.b;
             if (b == null) {
                a.S(str);
             }
             b.setText(y0.h(tc, false, 2, objArray));
             liveAdNeoMer.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg_lock.6952d3409f3b2d3e.webp");
          }else {
             LiveAdNeoMerchantPendantView b1 = liveAdNeoMer.b;
             if (b1 == null) {
                a.S(str);
             }
             b1.setText(tc+'s');
             liveAdNeoMer.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg.0ead9a8e4e1e40fe.webp");
          }
       }
       return;
    }
}

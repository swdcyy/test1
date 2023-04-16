package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1$a;
import java.lang.Runnable;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import android.widget.FrameLayout;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1$a implements Runnable	// class@00095e
{
    public final LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1 b;
    public final int c;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1$a(LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1 p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1$a.class, "1")) {
          return;
       }
       this.b.this$0.P8().setVisibility(this.c);
       return;
    }
}

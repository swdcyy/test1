package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1;
import java.lang.Runnable;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.y0;
import lnc.a1;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1$1;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1 implements Runnable	// class@000973
{
    public final LiveAudienceAdNeoPendantPresenter b;

    public void LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1(LiveAudienceAdNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1.class, "1")) {
          return;
       }
       if (y0.o(this.b.getActivity())) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f102844);
       LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1 tb = this.b;
       int i = (tb.B != null)? 2: 0;
       tb.X8().k(str, false);
       this.b.X8().setOnClickListener(new LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1$1(this, i));
       return;
    }
}

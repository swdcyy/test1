package com.yxcorp.gifshow.widget.banner.KwaiBannerView$a;
import android.os.Handler;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;

public final class KwaiBannerView$a extends Handler	// class@00193d
{
    public final KwaiBannerView a;

    public void KwaiBannerView$a(KwaiBannerView p0){
       this.a = p0;
       super(Looper.getMainLooper());
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBannerView$a.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       super.handleMessage(p0);
       int b = KwaiBannerView.B;
       this.a.q.removeMessages(b);
       if (p0.what == b) {
          KwaiBannerView$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, KwaiBannerView.class, "15")) {
             int currentItem = ta.getMViewPager().getCurrentItem();
             if (currentItem < (ta.getCount() - 1)) {
                ta.g((currentItem + 1), 1);
             }
          }
       }
       this.a.l();
       return;
    }
}

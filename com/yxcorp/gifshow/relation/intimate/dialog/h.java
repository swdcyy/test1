package com.yxcorp.gifshow.relation.intimate.dialog.h;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import java.lang.Object;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.o5;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig$BannerConfig;
import java.lang.CharSequence;
import android.widget.TextView;

public class h implements LoopBannerView$a	// class@0018f1
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public void Q5(KwaiBannerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       int i = o5.b(p0.e, -1);
       h tb = this.b;
       if (tb.x != null) {
          i y = tb.y;
          if (y != null && (!q.f(y.mBannerConfigs) && this.b.y.mBannerConfigs.get(i) != null)) {
             tb = this.b;
             tb.A.setText(tb.y.mBannerConfigs.get(i).mDesc);
          }
       }
       return;
    }
    public void e3(KwaiBannerView$b p0){
    }
}

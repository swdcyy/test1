package com.yxcorp.gifshow.relation.intimate.dialog.f;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import abc.i;
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

public class f implements LoopBannerView$a	// class@0018ef
{
    public final i b;

    public void f(i p0){
       this.b = p0;
       super();
    }
    public void Q5(KwaiBannerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       int i = o5.b(p0.e, -1);
       i m = this.b.m;
       if (m != null && (!q.f(m.mBannerConfigs) && this.b.m.mBannerConfigs.get(i) != null)) {
          f tb = this.b;
          tb.q.setText(tb.m.mBannerConfigs.get(i).mDesc);
       }
    label_003f :
       return;
    }
    public void e3(KwaiBannerView$b p0){
    }
}

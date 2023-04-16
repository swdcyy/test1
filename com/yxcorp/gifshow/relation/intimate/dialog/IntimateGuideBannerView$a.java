package com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView$a;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
import java.lang.Object;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class IntimateGuideBannerView$a implements LoopBannerView$a	// class@0018df
{
    public final LoopBannerView$a b;
    public final IntimateGuideBannerView c;

    public void IntimateGuideBannerView$a(IntimateGuideBannerView p0,LoopBannerView$a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void Q5(KwaiBannerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateGuideBannerView$a.class, "1")) {
          return;
       }
       IntimateGuideBannerView$a tb = this.b;
       if (tb != null) {
          tb.Q5(p0);
       }
       return;
    }
    public void e3(KwaiBannerView$b p0){
    }
}

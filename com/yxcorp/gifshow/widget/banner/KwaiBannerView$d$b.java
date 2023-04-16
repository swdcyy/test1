package com.yxcorp.gifshow.widget.banner.KwaiBannerView$d$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$d;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;

public final class KwaiBannerView$d$b extends m	// class@001941
{
    public final KwaiBannerView$d c;
    public final int d;
    public final KwaiBannerView$b e;

    public void KwaiBannerView$d$b(KwaiBannerView$d p0,int p1,KwaiBannerView$b p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBannerView$d$b.class, "1")) {
          return;
       }
       this.c.e.f(this.d, this.e);
       return;
    }
}

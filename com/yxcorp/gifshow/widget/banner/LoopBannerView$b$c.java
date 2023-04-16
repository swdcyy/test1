package com.yxcorp.gifshow.widget.banner.LoopBannerView$b$c;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.viewpager.widget.ViewPager$i;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LoopBannerView$b$c extends RecyclerView$r	// class@001949
{
    public final ViewPager$i a;

    public void LoopBannerView$b$c(ViewPager$i p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       LoopBannerView$b$c uob$c = LoopBannerView$b$c.class;
       if (PatchProxy.isSupport(uob$c) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob$c, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.a.onPageScrollStateChanged(p1);
       return;
    }
}

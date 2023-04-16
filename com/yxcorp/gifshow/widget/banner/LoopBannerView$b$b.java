package com.yxcorp.gifshow.widget.banner.LoopBannerView$b$b;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$b;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import yyc.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LoopBannerView$b$b implements RecyclerViewPager$c	// class@001948
{
    public final LoopBannerView$b a;
    public final ViewPager$i b;

    public void LoopBannerView$b$b(LoopBannerView$b p0,ViewPager$i p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,int p1){
       LoopBannerView$b$b uob$b = LoopBannerView$b$b.class;
       if (PatchProxy.isSupport(uob$b) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob$b, "1")) {
          return;
       }
       this.b.onPageSelected(this.a.f(p0));
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(LoopBannerView$b$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LoopBannerView$b$b.class, "2")) {
          return;
       }
       LoopBannerView$b$b ta = this.a;
       d uod = new d(p0, p1, p2);
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(uod, ta, LoopBannerView$b.class, "4");
       if (obj != PatchProxyResult.class) {
          uod = obj;
       }else {
          a.p(uod, "data");
       }
       this.b.onPageScrolled(this.a.f(uod.a), uod.b, uod.c);
       return;
    }
}

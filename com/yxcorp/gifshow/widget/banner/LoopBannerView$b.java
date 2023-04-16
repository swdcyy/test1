package com.yxcorp.gifshow.widget.banner.LoopBannerView$b;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$c;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import androidx.viewpager.widget.ViewPager$i;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$b$b;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$b$c;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$b$a;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.Integer;
import java.lang.Boolean;

public final class LoopBannerView$b implements DotsIndicator$c	// class@00194a
{
    public RecyclerViewPager$c a;
    public final LoopBannerView b;

    public void LoopBannerView$b(LoopBannerView p0){
       this.b = p0;
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f(this.b.getMViewPager().getCurrentItem());
    }
    public int b(){
       LoopBannerView$b obj = PatchProxy.apply(null, this, LoopBannerView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj.j != null) {
          return 2;
       }
       return obj.getMBannerCount();
    }
    public void c(int p0){
    }
    public void d(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoopBannerView$b.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       if (this.a != null) {
          this.b.getMViewPager().y(this.a);
       }
       this.a = new LoopBannerView$b$b(this, p0);
       this.b.getMViewPager().addOnScrollListener(new LoopBannerView$b$c(p0));
       LoopBannerView$b ta = this.a;
       a.m(ta);
       this.b.getMViewPager().x(ta);
       return;
    }
    public void e(DotsIndicator$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoopBannerView$b.class, "5")) {
          return;
       }
       RecyclerView$Adapter adapter = this.b.getMViewPager().getAdapter();
       if (adapter != null) {
          adapter.F0(new LoopBannerView$b$a(p0));
       }
       return;
    }
    public final int f(int p0){
       LoopBannerView$b uob = LoopBannerView$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.b() > 0) {
          return (p0 % this.b());
       }else {
          return -1;
       }
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.getMViewPager().getAdapter() != null)? true: false;
       return b;
    }
}

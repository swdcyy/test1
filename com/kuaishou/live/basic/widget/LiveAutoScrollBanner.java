package com.kuaishou.live.basic.widget.LiveAutoScrollBanner;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.basic.widget.LiveAutoScrollBanner$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.viewpager2.widget.ViewPager2;
import com.kuaishou.live.basic.widget.a;
import androidx.viewpager2.widget.ViewPager2$h;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.basic.widget.LiveAutoScrollBanner$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.widget.ViewPager2$j;

public class LiveAutoScrollBanner extends RelativeLayout	// class@000d30
{
    public int b;
    public boolean c;
    public boolean d;
    public LiveAutoScrollBanner$b e;
    public final LiveAutoScrollBanner$a f;
    public ViewPager2 g;

    public void LiveAutoScrollBanner(Context p0){
       super(p0, null);
    }
    public void LiveAutoScrollBanner(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAutoScrollBanner(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 3000;
       boolean b = true;
       this.c = b;
       this.f = new LiveAutoScrollBanner$a(this);
       if (PatchProxy.applyVoid(null, this, LiveAutoScrollBanner.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a6b, this);
          ViewPager2 viewPager2 = this.findViewById(R.id.live_auto_scroll_banner);
          this.g = viewPager2;
          viewPager2.setOffscreenPageLimit(b);
          this.g.j(new a(this));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAutoScrollBanner.class, "12")) {
          return;
       }
       k1.r(this.f, (long)this.b);
       return;
    }
    public int getCurrentItem(){
       Object obj = PatchProxy.apply(null, this, LiveAutoScrollBanner.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.getCurrentItem();
    }
    public void setAutoScrollIntervalMs(int p0){
       this.b = p0;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAutoScrollBanner.class, "8")) {
          return;
       }
       if (!PatchProxy.isSupport(LiveAutoScrollBanner.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.FALSE, this, LiveAutoScrollBanner.class, "9")) {
          this.g.m(p0, false);
       }
       return;
    }
    public void setEnableAutoScroll(boolean p0){
       this.c = p0;
    }
    public void setLiveAutoScrollBannerListener(LiveAutoScrollBanner$b p0){
       this.e = p0;
    }
    public void setOffscreenPageLimit(int p0){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAutoScrollBanner.class, "2")) {
          return;
       }
       this.g.setOffscreenPageLimit(p0);
       return;
    }
    public void setPageAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoScrollBanner.class, "4")) {
          return;
       }
       this.g.setAdapter(p0);
       return;
    }
    public void setPageTransformer(ViewPager2$j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoScrollBanner.class, "3")) {
          return;
       }
       this.g.setPageTransformer(p0);
       return;
    }
}

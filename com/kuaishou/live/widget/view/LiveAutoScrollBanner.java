package com.kuaishou.live.widget.view.LiveAutoScrollBanner;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.widget.page2.ViewPager2;
import com.kuaishou.live.widget.view.a;
import java.util.Objects;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import com.kuaishou.live.widget.page2.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import ekd.k1;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner$b;
import java.lang.Float;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.widget.page2.ViewPager2$i;

public class LiveAutoScrollBanner extends RelativeLayout	// class@001041
{
    public int b;
    public boolean c;
    public boolean d;
    public LiveAutoScrollBanner$b e;
    public LiveAutoScrollBanner$a f;
    public ViewPager2 g;
    public RecyclerView h;
    public ValueAnimator i;
    public float j;
    public static final String k;

    static {
       LiveAutoScrollBanner.k = "LiveAutoScrollBanner";
    }
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
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a6a, this);
          ViewPager2 viewPager2 = this.findViewById(R.id.live_auto_fling_banner);
          this.g = viewPager2;
          viewPager2.setOffscreenPageLimit(b);
          LiveAutoScrollBanner tg = this.g;
          a uoa = new a(this);
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoidOneRefs(uoa, tg, ViewPager2.class, "34")) {
             tg.d.d(uoa);
          }
          this.h = this.g.getChildAt(0);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAutoScrollBanner.class, "21")) {
          return;
       }
       k1.r(this.f, (long)this.b);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAutoScrollBanner.class, "13")) {
          return;
       }
       if (this.c == null) {
          throw new IllegalStateException("can\'t auto scroll because mEnableAutoScroll = false");
       }
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.a();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAutoScrollBanner.class, "14")) {
          return;
       }
       this.d = false;
       k1.m(this.f);
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
          this.g.f(p0, false);
       }
       return;
    }
    public void setEnableAutoScroll(boolean p0){
       this.c = p0;
    }
    public void setLiveAutoScrollBannerListener(LiveAutoScrollBanner$b p0){
       this.e = p0;
    }
    public void setMillisecondPerInch(float p0){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveAutoScrollBanner.class, "22")) {
          return;
       }
       this.g.setMillisecondPerInch(p0);
       return;
    }
    public void setOffscreenPageLimit(int p0){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAutoScrollBanner.class, "2")) {
          return;
       }
       this.g.setOffscreenPageLimit(p0);
       return;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAutoScrollBanner.class, "4")) {
          return;
       }
       this.h.setPadding(p0, p1, p2, p3);
       this.h.setClipToPadding(false);
       return;
    }
    public void setPageAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoScrollBanner.class, "6")) {
          return;
       }
       this.g.setAdapter(p0);
       return;
    }
    public void setPageMargin(int p0){
       if (PatchProxy.isSupport(LiveAutoScrollBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAutoScrollBanner.class, "3")) {
          return;
       }
       this.h.addItemDecoration(new e(0, p0, 0));
       return;
    }
    public void setPageTransformer(ViewPager2$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoScrollBanner.class, "5")) {
          return;
       }
       this.g.setPageTransformer(p0);
       return;
    }
}

package com.yxcorp.gifshow.widget.banner.LoopBannerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mUiHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mContainer$2;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mViewPager$2;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mIndicator$2;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mBanners$2;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$mPagerAdapter$2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import yyc.a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import yyc.b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.banner.FixedHeightAspectRatioRelativeLayout;
import com.yxcorp.gifshow.widget.banner.DotsIndicator;
import android.os.Handler;
import android.view.MotionEvent;
import java.util.List;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$c;
import java.lang.Runnable;
import java.lang.Float;

public abstract class LoopBannerView extends FrameLayout	// class@001952
{
    public int b;
    public int c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final int h;
    public boolean i;
    public boolean j;
    public LoopBannerView$a k;
    public final p l;
    public final p m;
    public final String n;

    public void LoopBannerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LoopBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LoopBannerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = n.c(p0, 33.00f);
       this.c = n.c(p0, 12.50f);
       this.d = s.c(LoopBannerView$mUiHandler$2.INSTANCE);
       this.e = s.c(new LoopBannerView$mContainer$2(this));
       this.f = s.c(new LoopBannerView$mViewPager$2(this));
       this.g = s.c(new LoopBannerView$mIndicator$2(this));
       this.h = 1000;
       this.l = s.c(LoopBannerView$mBanners$2.INSTANCE);
       this.m = s.c(new LoopBannerView$mPagerAdapter$2(this));
       this.n = "LoopBannerView";
       a.c(LayoutInflater.from(p0), this.getLayoutResId(), this, true);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LoopBannerView.class, "8")) {
       }else {
          this.getMViewPager().setAdapter(this.getMPagerAdapter());
          this.getMViewPager().setItemAnimator(objArray);
          this.getMViewPager().x(new a(this));
          this.getMViewPager().addOnScrollListener(new b(this));
          this.getMViewPager().setNestedScrollingEnabled(false);
       }
       return;
    }
    public void LoopBannerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void h(LoopBannerView p0,int p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.g(p1, p2);
       return;
    }
    public abstract RecyclerView$Adapter c();
    public final int d(int p0){
       LoopBannerView th = this.h;
       int i = th / 2;
       return (i - ((th / 2) % p0));
    }
    public void e(boolean p0){
    }
    public void f(int p0,KwaiBannerView$b p1){
       if (PatchProxy.isSupport(LoopBannerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LoopBannerView.class, "15")) {
          return;
       }
       a.p(p1, "bannerModel");
       LoopBannerView tk = this.k;
       if (tk != null) {
          tk.e3(p1);
       }
       return;
    }
    public void g(int p0,boolean p1){
       if (PatchProxy.isSupport(LoopBannerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LoopBannerView.class, "16")) {
          return;
       }
       this.getMViewPager().z(p0, p1);
       return;
    }
    public final int getCount(){
       int mBannerCount;
       LoopBannerView obj = PatchProxy.apply(null, this, LoopBannerView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (this.getMBannerCount() > 1)? this.h: this.getMBannerCount();
       return obj;
    }
    public final int getCurrentItem(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getMViewPager().getCurrentItem();
    }
    public int getLayoutResId(){
       return 0x7f0d0213;
    }
    public final LoopBannerView$a getListener(){
       return this.k;
    }
    public final int getMBannerCount(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getMBanners().size();
    }
    public final ArrayList getMBanners(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final FixedHeightAspectRatioRelativeLayout getMContainer(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final DotsIndicator getMIndicator(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final RecyclerView$Adapter getMPagerAdapter(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public final Handler getMUiHandler(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final RecyclerViewPager getMViewPager(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final int getRealCount(){
       Object obj = PatchProxy.apply(null, this, LoopBannerView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getMBannerCount();
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoopBannerView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action == 3) {
                this.setHasFocus(false);
             }
          }else {
             this.setHasFocus(false);
          }
       }else {
          this.setHasFocus(b);
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void setBanner(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoopBannerView.class, "14")) {
          return;
       }
       a.p(p0, "banners");
       this.getMUiHandler().post(new LoopBannerView$c(this, p0));
       return;
    }
    public final void setDotSpace(float p0){
       if (PatchProxy.isSupport(LoopBannerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LoopBannerView.class, "9")) {
          return;
       }
       this.getMIndicator().setDotsSpacing(p0);
       return;
    }
    public final void setHasFocus(boolean p0){
       if (PatchProxy.isSupport(LoopBannerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LoopBannerView.class, "17")) {
          return;
       }
       if (this.i != p0) {
          this.i = p0;
          this.e(p0);
       }
       return;
    }
    public final void setIndicatorMarginBottomOrigin(int p0){
       this.c = p0;
    }
    public final void setIndicatorMarginEnd(int p0){
       this.b = p0;
    }
    public final void setListener(LoopBannerView$a p0){
       this.k = p0;
    }
    public final void setTwoPageMode(boolean p0){
       this.j = p0;
    }
}

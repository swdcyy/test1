package com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerView;
import androidx.viewpager.widget.ViewPager$i;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerViewPager;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import ta2.a;
import h3.a;
import android.os.Handler;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerView$b;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Float;
import java.util.Iterator;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerView$a;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;

public class LiveAggregateBannerView extends RelativeLayout implements ViewPager$i, View$OnClickListener	// class@000c6e
{
    public int b;
    public double c;
    public boolean d;
    public LiveAggregateBannerViewPager e;
    public LinearLayout f;
    public LiveAggregateBannerView$b g;
    public ViewPager$i h;
    public boolean i;
    public boolean j;
    public Handler k;
    public List l;
    public List m;

    public void LiveAggregateBannerView(Context p0){
       super(p0, null);
    }
    public void LiveAggregateBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAggregateBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 5000;
       this.c = 0x3fd1f3cadc7454bc;
       boolean b = true;
       this.d = b;
       this.i = false;
       this.l = new ArrayList();
       if (PatchProxy.applyVoid(null, this, LiveAggregateBannerView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d09cc, this);
          LiveAggregateBannerViewPager liveAggregat = this.findViewById(R.id.banner_view_pager);
          this.e = liveAggregat;
          liveAggregat.setOffscreenPageLimit(b);
          this.f = this.findViewById(0x7f0a03bf);
          this.e.addOnPageChangeListener(this);
          if (!PatchProxy.applyVoid(null, this, LiveAggregateBannerView.class, "2")) {
             this.k = new a(this);
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAggregateBannerView.class, "12")) {
          return;
       }
       if (this.d != null) {
          boolean b = true;
          if (!this.getVisibility()) {
             LiveAggregateBannerView te = this.e;
             if (te != null && (te.getAdapter() != null && this.e.getAdapter().j() > b)) {
             label_0030 :
                this.i = b;
                te = this.k;
                if (te != null) {
                   te.removeMessages(0);
                   if (this.i != null) {
                      this.k.sendEmptyMessageDelayed(0, (long)this.b);
                   }
                }
             }
          }
          b = false;
          goto label_0030 ;
       }
    label_0045 :
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAggregateBannerView.class, "13")) {
          return;
       }
       this.i = false;
       LiveAggregateBannerView tk = this.k;
       if (tk != null) {
          tk.removeMessages(false);
       }
       return;
    }
    public List getBannersList(){
       return this.m;
    }
    public int getCurrentItem(){
       Object obj = PatchProxy.apply(null, this, LiveAggregateBannerView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getCurrentItem();
    }
    public int getCurrentRealItem(){
       LiveAggregateBannerView obj = PatchProxy.apply(null, this, LiveAggregateBannerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e != null) {
          obj = this.m;
          if (obj != null && obj.size() > 0) {
             return (this.e.getCurrentItem() % this.m.size());
          }
       }
       return 0;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAggregateBannerView.class, "16")) {
          return;
       }
       LiveAggregateBannerView tm = this.m;
       if (tm != null && tm.size()) {
          int i = this.e.getCurrentItem() % this.m.size();
          LiveAggregateBannerView tg = this.g;
          if (tg != null) {
             tg.a(i);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveAggregateBannerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveAggregateBannerView.class, "15")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)((double)View$MeasureSpec.getSize(p0) * this.c), 0x40000000));
       return;
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(LiveAggregateBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAggregateBannerView.class, "17")) {
          return;
       }
       LiveAggregateBannerView th = this.h;
       if (th != null) {
          th.onPageScrollStateChanged(p0);
       }
       if (p0 != 1) {
          if (this.i == null) {
             this.a();
          }
       }else {
          this.b();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(LiveAggregateBannerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LiveAggregateBannerView.class, "18")) {
          return;
       }
       LiveAggregateBannerView th = this.h;
       if (th != null) {
          th.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(LiveAggregateBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAggregateBannerView.class, "19")) {
          return;
       }
       if (!this.l.isEmpty()) {
          int i = p0 % this.l.size();
          Iterator iterator = this.l.iterator();
          while (iterator.hasNext()) {
             iterator.next().setBackgroundResource(R.drawable.arg_RES_7f08032c);
          }
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
          uob.s(DrawableCreator$Shape.Oval);
          this.l.get(i).setBackground(uob.a());
       }
       LiveAggregateBannerView th = this.h;
       if (th != null) {
          th.onPageSelected(p0);
       }
       return;
    }
    public void setAutoScroll(boolean p0){
       this.d = p0;
    }
    public void setBannerList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAggregateBannerView.class, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(LiveAggregateBannerView.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, this, LiveAggregateBannerView.class, "6")) {
          this.j = true;
          this.m = p0;
          int i = (p0 == null)? 0: p0.size();
          this.e.setAdapter(new LiveAggregateBannerView$a(this));
          if (i > 0) {
             this.setVisibility(0);
             this.e.setCurrentItem(((i + 100) - (100 % i)));
             if (!PatchProxy.isSupport(LiveAggregateBannerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, LiveAggregateBannerView.class, "3")) {
                if (!this.l.isEmpty()) {
                   this.l.clear();
                   this.f.removeAllViews();
                }
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   View view = new View(this.getContext());
                   int i2 = a1.e(4.00f);
                   LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(6.00f), a1.e(6.00f));
                   layoutParams.leftMargin = i2;
                   layoutParams.rightMargin = i2;
                   view.setLayoutParams(layoutParams);
                   if (!i1) {
                      b uob = new b();
                      uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
                      uob.s(DrawableCreator$Shape.Oval);
                      view.setBackground(uob.a());
                   }else {
                      view.setBackgroundResource(R.drawable.arg_RES_7f08032c);
                   }
                   this.f.addView(view);
                   this.l.add(view);
                }
                if (i == 1) {
                   this.f.setVisibility(8);
                }else {
                   this.f.setVisibility(0);
                }
             }
             this.a();
          }else {
             this.b();
             this.setVisibility(8);
          }
       }
       return;
    }
    public void setBannerRatio(float p0){
       if (PatchProxy.isSupport(LiveAggregateBannerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveAggregateBannerView.class, "11")) {
          return;
       }
       this.c = (double)p0;
       this.requestLayout();
       return;
    }
    public void setIntervalMs(int p0){
       this.b = p0;
    }
    public void setOnItemClickListener(LiveAggregateBannerView$b p0){
       this.g = p0;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.h = p0;
    }
    public void setViewParent(ViewParent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAggregateBannerView.class, "4")) {
          return;
       }
       this.e.setViewParent(p0);
       return;
    }
}

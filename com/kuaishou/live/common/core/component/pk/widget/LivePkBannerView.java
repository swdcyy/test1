package com.kuaishou.live.common.core.component.pk.widget.LivePkBannerView;
import androidx.viewpager.widget.ViewPager$i;
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
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import lw1.b;
import h3.a;
import java.lang.Integer;
import java.util.List;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Handler;
import java.lang.Number;
import java.lang.Float;
import java.util.Iterator;

public class LivePkBannerView extends RelativeLayout implements ViewPager$i	// class@001742
{
    public long b;
    public boolean c;
    public ViewPager d;
    public LinearLayout e;
    public ViewPager$i f;
    public boolean g;
    public Handler h;
    public final List i;
    public int j;

    public void LivePkBannerView(Context p0){
       super(p0, null);
    }
    public void LivePkBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 5000;
       boolean b = true;
       this.c = b;
       this.g = false;
       this.i = new ArrayList();
       if (PatchProxy.applyVoid(null, this, LivePkBannerView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0cf4, this);
          ViewPager viewPager = this.findViewById(R.id.banner_view_pager);
          this.d = viewPager;
          viewPager.setOffscreenPageLimit(b);
          this.e = this.findViewById(0x7f0a03bf);
          this.d.addOnPageChangeListener(this);
          if (!PatchProxy.applyVoid(null, this, LivePkBannerView.class, "2")) {
             this.h = new b(this);
          }
       }
       return;
    }
    public void a(a p0,int p1){
       if (PatchProxy.isSupport(LivePkBannerView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LivePkBannerView.class, "4")) {
          return;
       }
       this.d.setAdapter(p0);
       this.j = p1;
       int i = 8;
       if (p1 > 0) {
          this.setVisibility(0);
          if (!PatchProxy.isSupport(LivePkBannerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, LivePkBannerView.class, "3")) {
             if (!this.i.isEmpty()) {
                this.i.clear();
                this.e.removeAllViews();
             }
             for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
                View view = new View(this.getContext());
                int i2 = a1.e(2.00f);
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(4.00f), a1.e(4.00f));
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
                this.e.addView(view);
                this.i.add(view);
             }
             if (p1 == 1) {
                this.e.setVisibility(i);
             }else {
                this.e.setVisibility(0);
             }
          }
          this.b();
       }else {
          this.c();
          this.setVisibility(i);
       }
       return;
    }
    public void b(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePkBannerView.class, "8")) {
          return;
       }
       if (this.c != null) {
          LivePkBannerView obj = PatchProxy.apply(objArray, this, LivePkBannerView.class, "10");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!this.getVisibility()){
             obj = this.d;
             if (obj != null && (obj.getAdapter() != null && this.d.getAdapter().j() > 1)) {
                b = true;
             }
          }
          b = false;
          this.g = b;
          obj = this.h;
          if (obj != null) {
             obj.removeMessages(0);
             if (this.g != null) {
                this.h.sendEmptyMessageDelayed(0, this.b);
             }
          }
       }
    label_0058 :
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LivePkBannerView.class, "9")) {
          return;
       }
       this.g = false;
       LivePkBannerView th = this.h;
       if (th != null) {
          th.removeMessages(false);
       }
       return;
    }
    public int getCurrentItem(){
       Object obj = PatchProxy.apply(null, this, LivePkBannerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.getCurrentItem();
    }
    public final int getCurrentRealPosition(){
       LivePkBannerView obj = PatchProxy.apply(null, this, LivePkBannerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj != null && this.j > null) {
          return (obj.getCurrentItem() % this.j);
       }
       return 0;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkBannerView.class, "15")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c();
       return;
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(LivePkBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkBannerView.class, "11")) {
          return;
       }
       LivePkBannerView tf = this.f;
       if (tf != null) {
          tf.onPageScrollStateChanged(p0);
       }
       if (p0 == 1) {
          this.c();
       }else if(this.g == null){
          this.b();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(LivePkBannerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LivePkBannerView.class, "12")) {
          return;
       }
       LivePkBannerView tf = this.f;
       if (tf != null) {
          tf.onPageScrolled(this.getCurrentRealPosition(), p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(LivePkBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkBannerView.class, "13")) {
          return;
       }
       if (!this.i.isEmpty()) {
          p0 = p0 % this.i.size();
          Iterator iterator = this.i.iterator();
          while (iterator.hasNext()) {
             iterator.next().setBackgroundResource(R.drawable.arg_RES_7f08032c);
          }
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
          uob.s(DrawableCreator$Shape.Oval);
          this.i.get(p0).setBackground(uob.a());
       }
       LivePkBannerView tf = this.f;
       if (tf != null) {
          tf.onPageSelected(this.getCurrentRealPosition());
       }
       return;
    }
    public void setAutoScroll(boolean p0){
       this.c = p0;
    }
    public void setIntervalMs(long p0){
       this.b = p0;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.f = p0;
    }
}

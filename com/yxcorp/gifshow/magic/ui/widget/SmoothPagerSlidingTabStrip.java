package com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import t46.a0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.ui.widget.PostGroupWithIndicatorExt;
import android.view.View;
import java.lang.Number;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import o1.f;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$b;
import th0.e;
import android.view.animation.Interpolator;
import ukd.a;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$a;
import androidx.viewpager.widget.ViewPager$i;

public class SmoothPagerSlidingTabStrip extends SmoothSlidingTabStrip	// class@001c52
{
    public ViewPager s;
    public int t;
    public int u;
    public ColorStateList v;
    public int w;
    public int x;

    public void SmoothPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SmoothPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 1;
       this.w = i;
       this.x = i;
       if (!PatchProxy.isSupport(SmoothPagerSlidingTabStrip.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SmoothPagerSlidingTabStrip.class, "13")) {
          this.setTextColor(R.color.arg_RES_7f0617f5);
          this.x(0, i);
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.l5, p2, 0);
          this.t = typedArray.getDimensionPixelSize(0, n.c0(p0, 16.00f));
          typedArray.recycle();
       }
       return;
    }
    public a0 a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PostGroupWithIndicatorExt(p0);
    }
    public View d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2a48);
    }
    public View e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2a49);
    }
    public int getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, SmoothPagerSlidingTabStrip.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.getCurrentItem();
    }
    public String getTabName(){
       Object[] objArray = null;
       PagerSlidingTabStrip$d obj = PatchProxy.apply(objArray, this, SmoothPagerSlidingTabStrip.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.s.getAdapter() instanceof PagerSlidingTabStrip$d$b) {
          return objArray;
       }
       obj = this.s.getAdapter().b(this.getCurrentPosition());
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public ViewPager getViewPager(){
       return this.s;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, SmoothPagerSlidingTabStrip.class, "4")) {
          return;
       }
       if (this.s.getAdapter() == null) {
          return;
       }
       int i = this.s.getAdapter().j();
       int i1 = 0;
       while (i1 < i) {
          if (this.s.getAdapter() instanceof PagerSlidingTabStrip$d$b && this.s.getAdapter().b(i1) instanceof SmoothPagerSlidingTabStrip$c) {
             SmoothPagerSlidingTabStrip$c uoc = this.s.getAdapter().b(i1);
             if (!PatchProxy.isSupport(SmoothPagerSlidingTabStrip.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), uoc, this, SmoothPagerSlidingTabStrip.class, "12")) {
                LinearLayout tabsContaine = this.getTabsContainer();
                tabsContaine.addView(uoc.l(this.getContext(), i1, this.s, this, tabsContaine), i1);
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "10")) {
          return;
       }
       if (p0 instanceof TextView) {
          SmoothPagerSlidingTabStrip tu = this.u;
          int i = 0;
          if (tu == null) {
             p0.setTextSize(i, (float)this.t);
          }else {
             p0.setTextSize(i, (float)tu);
          }
          tu = this.x;
          if (tu == true) {
             p0.setTypeface(null);
             p0.getPaint().setFakeBoldText(true);
          }else {
             p0.setTypeface(null, tu);
          }
          p0.setSelected(true);
          tu = this.v;
          if (tu != null) {
             p0.setTextColor(tu);
          }
       }
       return;
    }
    public void setSelectedTextSize(int p0){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SmoothPagerSlidingTabStrip.class, "3")) {
          return;
       }
       this.u = p0;
       this.v();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SmoothPagerSlidingTabStrip.class, "1")) {
          return;
       }
       this.v = f.b(this.getResources(), p0, null);
       this.v();
       return;
    }
    public void setViewPager(ViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "7")) {
          return;
       }
       a.o(p0, "mScroller", new SmoothPagerSlidingTabStrip$b(this.getContext(), new e()));
       this.s = p0;
       p0.addOnPageChangeListener(new SmoothPagerSlidingTabStrip$a(this));
       this.g();
       return;
    }
    public void w(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothPagerSlidingTabStrip.class, "11")) {
          return;
       }
       if (p0 instanceof TextView) {
          p0.setTextSize(0, (float)this.t);
          SmoothPagerSlidingTabStrip tw = this.w;
          if (tw == true) {
             p0.setTypeface(null);
             p0.getPaint().setFakeBoldText(true);
          }else {
             p0.setTypeface(null, tw);
          }
          p0.setSelected(0);
          tw = this.v;
          if (tw != null) {
             p0.setTextColor(tw);
          }
       }
       return;
    }
    public void x(int p0,int p1){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SmoothPagerSlidingTabStrip.class, "2")) {
          return;
       }
       this.w = p0;
       this.x = p1;
       this.v();
       return;
    }
}

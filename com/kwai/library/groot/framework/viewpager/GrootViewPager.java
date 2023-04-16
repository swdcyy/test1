package com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import rw6.a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import h3.a;
import cw6.b;
import android.graphics.Canvas;
import android.view.View;
import cw6.c;
import cw6.d;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import cw6.d$e;
import cw6.d$c;
import cw6.d$d;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import tw6.a;
import sw6.b;
import android.os.SystemClock;
import java.lang.StringBuilder;
import java.lang.String;
import lw6.a;

public class GrootViewPager extends GrootTouchViewPager	// class@000838
{
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public List J1;
    public List K1;
    public List L1;
    public b M1;
    public boolean N1;
    public int O1;
    public long P1;
    public long Q1;

    public void GrootViewPager(Context p0){
       super(p0, null);
    }
    public void GrootViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.J1 = new ArrayList();
       this.K1 = new ArrayList();
       this.L1 = new ArrayList();
       this.N1 = false;
       this.O1 = -1;
       this.P1 = -1;
       this.Q1 = -1;
       this.b(new a(this));
    }
    public final void I(int p0,boolean p1){
       if (this.getAdapter() instanceof b) {
          super.I(this.getAdapter().U(p0), p1);
       }
       return;
    }
    public void K(int p0,boolean p1,boolean p2){
       super.K(p0, p1, p2);
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       int i;
       a adapter = this.getAdapter();
       if (!adapter instanceof c) {
       }else {
          d uod = adapter.B();
          if (uod.b() && !uod.f.isEmpty()) {
             Iterator iterator = uod.f.iterator();
             while (true) {
                i = null;
                while (iterator.hasNext()) {
                   d$e uoe = iterator.next();
                   if (uoe instanceof d$c || (uoe instanceof d$d && uoe.c().getView() != null)) {
                      if (i || uoe.c().getView() == p1) {
                         i = 1;
                      }else {
                         continue ;
                      }
                   }
                }
                if (i != null) {
                   return false;
                }else {
                   return super.drawChild(p0, p1, p2);
                }
             }
          }
       }
       i = 0;
       goto label_0054 ;
    }
    public boolean g0(){
       return this.I1;
    }
    public int getFirstValidItemPosition(){
       if (this.getAdapter() instanceof b) {
          return this.getAdapter().d0();
       }
       return super.getFirstValidItemPosition();
    }
    public int getLastValidItemPosition(){
       if (this.getAdapter() instanceof b) {
          return this.getAdapter().g0();
       }
       return super.getLastValidItemPosition();
    }
    public long getUserActionUpToScrollEndDuration(){
       GrootViewPager tP1 = this.P1;
       if (tP1 > 0) {
          GrootViewPager tQ1 = this.Q1;
          if (tQ1 > 0) {
             return (tQ1 - tP1);
          }
       }
       return -1;
    }
    public void h0(int p0){
    }
    public void i0(ViewPager$i p0){
       if (!this.K1.contains(p0)) {
          this.K1.add(p0);
       }
       return;
    }
    public void j0(a p0){
       if (!this.J1.contains(p0)) {
          this.J1.add(p0);
       }
       return;
    }
    public void k0(ViewPager$i p0){
       if (!this.L1.contains(p0) && !this.K1.contains(p0)) {
          this.L1.add(p0);
       }
       return;
    }
    public final void l0(int p0,boolean p1){
       super.I(p0, p1);
    }
    public void m0(ViewPager$i p0){
       this.K1.remove(p0);
    }
    public void n0(a p0){
       this.J1.remove(p0);
    }
    public void o0(ViewPager$i p0){
       this.L1.remove(p0);
    }
    public final void setCurrentItem(int p0){
       if (this.getAdapter() instanceof b) {
          super.setCurrentItem(this.getAdapter().U(p0));
       }
       return;
    }
    public final void setCurrentItemWithViewPagerPosition(int p0){
       super.setCurrentItem(p0);
    }
    public void setPageScrolledInterceptor(b p0){
       this.M1 = p0;
    }
    public void w(){
       if (this.N1 != null) {
          this.Q1 = (this.P1 - null > 0)? SystemClock.elapsedRealtime(): -1;
       }
    label_0017 :
       super.w();
       int currentItem = this.getCurrentItem();
       this.O1 = currentItem;
       a.b("GrootViewPager", "onScrollEnd: position = "+currentItem+" scrollX = "+this.getScrollX()+" scrollY = "+this.getScrollY());
       if (this.getAdapter() instanceof b) {
          b adapter = this.getAdapter();
          if (adapter.B != currentItem) {
             adapter.u0(currentItem, true);
             adapter.B = currentItem;
          }
       }
       Iterator iterator = this.J1.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(currentItem);
       }
       return;
    }
}

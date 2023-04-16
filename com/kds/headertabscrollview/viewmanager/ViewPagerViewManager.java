package com.kds.headertabscrollview.viewmanager.ViewPagerViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.kds.headertabscrollview.viewmanager.ViewPagerViewManager$a;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import com.kds.headertabscrollview.layout.FlingViewPager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hn.a;
import java.util.ArrayList;
import ze.n0;
import android.content.Context;
import com.kds.headertabscrollview.viewmanager.ViewPagerViewManager$b;
import java.lang.Runnable;
import java.lang.Integer;
import com.kds.headertabscrollview.viewmanager.ViewPagerViewManager$c;

public final class ViewPagerViewManager extends ViewGroupManager	// class@00073f
{
    public static final ViewPagerViewManager$a Companion;

    static {
       ViewPagerViewManager.Companion = new ViewPagerViewManager$a(null);
    }
    public void ViewPagerViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(FlingViewPager p0,View p1,int p2){
       a.q(p0, "host");
       if (p1 == null) {
          return;
       }
       ViewPager2 viewPager = p0.getViewPager();
       a adapter = viewPager.getAdapter();
       if (adapter != null) {
          a.q(p1, "child");
          adapter.e.add(p2, p1);
          adapter.n0(p2);
       }
       if (viewPager.getCurrentItem() == p2) {
          this.refreshViewChildrenLayout(viewPager);
       }
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public FlingViewPager createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new FlingViewPager(p0);
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(FlingViewPager p0,int p1){
       a.q(p0, "parent");
       a adapter = p0.getViewPager().getAdapter();
       if (adapter == null) {
          a.L();
       }
       return adapter.J0(p1);
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(FlingViewPager p0){
       a.q(p0, "parent");
       RecyclerView$Adapter adapter = p0.getViewPager().getAdapter();
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       return itemCount;
    }
    public String getName(){
       return "ViewPager";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public final void refreshViewChildrenLayout(View p0){
       p0.post(new ViewPagerViewManager$b(p0));
    }
    public void removeAllViews(ViewGroup p0){
       this.removeAllViews(p0);
    }
    public void removeAllViews(FlingViewPager p0){
       a.q(p0, "parent");
       ViewPager2 viewPager = p0.getViewPager();
       viewPager.setUserInputEnabled(false);
       a adapter = viewPager.getAdapter();
       if (adapter != null) {
          adapter.e.clear();
          adapter.s0(false, adapter.e.size());
       }
       return;
    }
    public void removeView(ViewGroup p0,View p1){
       this.removeView(p0, p1);
    }
    public void removeView(FlingViewPager p0,View p1){
       a.q(p0, "parent");
       a.q(p1, "view");
       ViewPager2 viewPager = p0.getViewPager();
       a adapter = viewPager.getAdapter();
       if (adapter != null) {
          a.q(p1, "child");
          adapter.K0(adapter.e.indexOf(p1));
       }
       this.refreshViewChildrenLayout(viewPager);
       return;
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(FlingViewPager p0,int p1){
       a.q(p0, "parent");
       ViewPager2 viewPager = p0.getViewPager();
       a adapter = viewPager.getAdapter();
       if (adapter != null) {
          adapter.K0(p1);
       }
       this.refreshViewChildrenLayout(viewPager);
       return;
    }
    public final void set(FlingViewPager p0,int p1){
       a.q(p0, "host");
       p0.getViewPager().setOffscreenPageLimit(p1);
    }
    public final void setCurrentItem(ViewPager2 p0,int p1,boolean p2){
       this.refreshViewChildrenLayout(p0);
       p0.m(p1, p2);
    }
    public final void setInitialPage(FlingViewPager p0,int p1){
       a.q(p0, "host");
       if (p0.getInitialIndex() == null) {
          p0.getViewPager().post(new ViewPagerViewManager$c(this, p0, p1));
       }
       return;
    }
}

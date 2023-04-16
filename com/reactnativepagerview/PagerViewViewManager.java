package com.reactnativepagerview.PagerViewViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.reactnativepagerview.PagerViewViewManager$a;
import nsd.u;
import df.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import com.reactnativepagerview.NestedScrollableHost;
import java.lang.Object;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qk8.b;
import java.util.ArrayList;
import ze.n0;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.reactnativepagerview.PagerViewViewManager$b;
import java.lang.Runnable;
import java.util.Map;
import java.lang.Integer;
import vd.d;
import kotlin.TypeCastException;
import java.lang.ClassNotFoundException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManager;
import od.a;
import nsd.r0;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import rk8.c;
import df.b;
import com.reactnativepagerview.PagerViewViewManager$c;
import com.reactnativepagerview.PagerViewViewManager$d;
import ze.p;
import com.reactnativepagerview.PagerViewViewManager$e;
import androidx.viewpager2.widget.ViewPager2$j;

public final class PagerViewViewManager extends ViewGroupManager	// class@000b73
{
    public c eventDispatcher;
    public static final PagerViewViewManager$a Companion;

    static {
       PagerViewViewManager.Companion = new PagerViewViewManager$a(null);
    }
    public void PagerViewViewManager(){
       super();
    }
    public static final c access$getEventDispatcher$p(PagerViewViewManager p0){
       p0 = p0.eventDispatcher;
       if (p0 == null) {
          a.S("eventDispatcher");
       }
       return p0;
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(NestedScrollableHost p0,View p1,int p2){
       a.q(p0, "host");
       if (p1 == null) {
          return;
       }
       ViewPager2 viewPager = this.getViewPager(p0);
       b adapter = viewPager.getAdapter();
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
    public NestedScrollableHost createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       NestedScrollableHost nestedScroll = new NestedScrollableHost(p0);
       nestedScroll.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       nestedScroll.setSaveEnabled(false);
       ViewPager2 viewPager2 = new ViewPager2(p0);
       viewPager2.setAdapter(new b());
       viewPager2.setSaveEnabled(false);
       NativeModule nativeModule = p0.getNativeModule(UIManagerModule.class);
       if (nativeModule == null) {
          a.L();
       }
       c eventDispatc = nativeModule.getEventDispatcher();
       a.h(eventDispatc, "reactContext.getNativeMo¡­s.java\)!!.eventDispatcher");
       this.eventDispatcher = eventDispatc;
       viewPager2.post(new PagerViewViewManager$b(this, viewPager2, nestedScroll));
       nestedScroll.addView(viewPager2);
       return nestedScroll;
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(NestedScrollableHost p0,int p1){
       a.q(p0, "parent");
       b adapter = this.getViewPager(p0).getAdapter();
       if (adapter == null) {
          a.L();
       }
       return adapter.J0(p1);
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(NestedScrollableHost p0){
       a.q(p0, "parent");
       RecyclerView$Adapter adapter = this.getViewPager(p0).getAdapter();
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       return itemCount;
    }
    public Map getCommandsMap(){
       return d.f("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2), "setScrollEnabled", Integer.valueOf(3));
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Map map = d.f("topPageScroll", d.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", d.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", d.d("registrationName", "onPageSelected"));
       a.h(map, "MapBuilder.of\(\n      Pag¡­Name\", \"onPageSelected\"\)\)");
       return map;
    }
    public String getName(){
       return "RNCViewPager";
    }
    public final ViewPager2 getViewPager(NestedScrollableHost p0){
       int i = 0;
       if (!p0.getChildAt(i) instanceof ViewPager2) {
          throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
       }
       View childAt = p0.getChildAt(i);
       if (childAt != null) {
          return childAt;
       }
       throw new TypeCastException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(NestedScrollableHost p0,int p1,ReadableArray p2){
       a.q(p0, "root");
       super.receiveCommand(p0, p1, p2);
       ViewPager2 viewPager = this.getViewPager(p0);
       a.c(viewPager);
       a.c(p2);
       RecyclerView$Adapter adapter = viewPager.getAdapter();
       Integer integer = (adapter != null)? Integer.valueOf(adapter.getItemCount()): null;
       int i = 0;
       if (p1 != 1) {
          int i1 = 2;
          if (p1 != i1) {
             if (p1 == 3) {
                viewPager.setUserInputEnabled(p2.getBoolean(i));
             }else {
                Object[] objArray = new Object[i1];
                objArray[i] = Integer.valueOf(p1);
                objArray[1] = "PagerViewViewManager";
                String str = String.format("Unsupported command %d received by %s.", Arrays.copyOf(objArray, i1));
                a.h(str, "java.lang.String.format\(format, *args\)");
                throw new IllegalArgumentException(str);
             }
          }else {
          label_0057 :
             int intx = p2.getInt(i);
             integer = (integer != null && (integer.intValue() > 0 && (intx >= 0 && a.t(intx, integer.intValue()) < 0)))? 1: 0;
             if (integer) {
                if (p1 == 1) {
                   i = true;
                }
                this.setCurrentItem(viewPager, intx, i);
                PagerViewViewManager teventDispat = this.eventDispatcher;
                if (teventDispat == null) {
                   a.S("eventDispatcher");
                }
                teventDispat.c(new c(p0.getId(), intx));
             }
          }
       }else {
          goto label_0057 ;
       }
       return;
    }
    public final void refreshViewChildrenLayout(View p0){
       p0.post(new PagerViewViewManager$c(p0));
    }
    public void removeAllViews(ViewGroup p0){
       this.removeAllViews(p0);
    }
    public void removeAllViews(NestedScrollableHost p0){
       a.q(p0, "parent");
       ViewPager2 viewPager = this.getViewPager(p0);
       viewPager.setUserInputEnabled(false);
       b adapter = viewPager.getAdapter();
       if (adapter != null) {
          adapter.e.clear();
          adapter.s0(false, adapter.e.size());
       }
       return;
    }
    public void removeView(ViewGroup p0,View p1){
       this.removeView(p0, p1);
    }
    public void removeView(NestedScrollableHost p0,View p1){
       a.q(p0, "parent");
       a.q(p1, "view");
       ViewPager2 viewPager = this.getViewPager(p0);
       b adapter = viewPager.getAdapter();
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
    public void removeViewAt(NestedScrollableHost p0,int p1){
       a.q(p0, "parent");
       ViewPager2 viewPager = this.getViewPager(p0);
       b adapter = viewPager.getAdapter();
       if (adapter != null) {
          adapter.K0(p1);
       }
       this.refreshViewChildrenLayout(viewPager);
       return;
    }
    public final void set(NestedScrollableHost p0,int p1){
       a.q(p0, "host");
       this.getViewPager(p0).setOffscreenPageLimit(p1);
    }
    public final void setCurrentItem(ViewPager2 p0,int p1,boolean p2){
       this.refreshViewChildrenLayout(p0);
       p0.m(p1, p2);
    }
    public final void setInitialPage(NestedScrollableHost p0,int p1){
       a.q(p0, "host");
       ViewPager2 viewPager = this.getViewPager(p0);
       if (p0.getInitialIndex() == null) {
          viewPager.post(new PagerViewViewManager$d(this, viewPager, p1, p0));
       }
       return;
    }
    public final void setLayoutDirection(NestedScrollableHost p0,String p1){
       a.q(p0, "host");
       a.q(p1, "value");
       ViewPager2 viewPager = this.getViewPager(p0);
       if (p1.hashCode() != 0x1ba6a) {
       }else if(p1.equals("rtl")){
          viewPager.setLayoutDirection(1);
       label_0029 :
          return;
       }
       viewPager.setLayoutDirection(0);
       goto label_0029 ;
    }
    public final void setOrientation(NestedScrollableHost p0,String p1){
       a.q(p0, "host");
       a.q(p1, "value");
       this.getViewPager(p0).setOrientation(a.g(p1, "vertical"));
    }
    public final void setOverScrollMode(NestedScrollableHost p0,String p1){
       a.q(p0, "host");
       a.q(p1, "value");
       int i = 0;
       View childAt = this.getViewPager(p0).getChildAt(i);
       int i1 = p1.hashCode();
       if (i1 != -1414557169) {
          if (i1 == 0x63dca8c && p1.equals("never")) {
             a.h(childAt, "child");
             childAt.setOverScrollMode(2);
          }else {
          label_0043 :
             a.h(childAt, "child");
             childAt.setOverScrollMode(1);
          }
       }else if(p1.equals("always")){
          a.h(childAt, "child");
          childAt.setOverScrollMode(i);
       }else {
          goto label_0043 ;
       }
       return;
    }
    public final void setPageMargin(NestedScrollableHost p0,float p1){
       a.q(p0, "host");
       ViewPager2 viewPager = this.getViewPager(p0);
       viewPager.setPageTransformer(new PagerViewViewManager$e((int)p.c(p1), viewPager));
    }
    public final void setScrollEnabled(NestedScrollableHost p0,boolean p1){
       a.q(p0, "host");
       this.getViewPager(p0).setUserInputEnabled(p1);
    }
}

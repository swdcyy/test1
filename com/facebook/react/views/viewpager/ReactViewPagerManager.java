package com.facebook.react.views.viewpager.ReactViewPagerManager;
import jf.o;
import com.facebook.react.uimanager.ViewGroupManager;
import jf.n;
import ze.b;
import android.view.ViewGroup;
import android.view.View;
import com.facebook.react.views.viewpager.ReactViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.facebook.react.views.viewpager.ReactViewPager$b;
import java.util.List;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import ze.n0;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import java.lang.Number;
import java.util.Map;
import vd.d;
import ze.c1;
import com.facebook.react.bridge.ReadableArray;
import od.a;
import java.lang.IllegalArgumentException;
import ze.p;
import java.lang.Boolean;

public class ReactViewPagerManager extends ViewGroupManager implements o	// class@001444
{
    public final c1 mDelegate;

    public void ReactViewPagerManager(){
       super();
       this.mDelegate = new n(this);
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ReactViewPager p0,View p1,int p2){
       if (PatchProxy.isSupport(ReactViewPagerManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ReactViewPagerManager.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactViewPager.class) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), p0, ReactViewPager.class, "6")) {
          ReactViewPager$b adapter = p0.getAdapter();
          Objects.requireNonNull(adapter);
          ReactViewPager$b uob = ReactViewPager$b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), adapter, uob, "1")) {
             adapter.d.add(p2, p1);
             adapter.q();
             adapter.f.setOffscreenPageLimit(adapter.d.size());
          }
       }
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactViewPager createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewPagerManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactViewPager(p0);
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(ReactViewPager p0,int p1){
       ReactViewPager$b obj;
       View view;
       ReactViewPagerManager reactViewPag = ReactViewPagerManager.class;
       String str = "9";
       if (PatchProxy.isSupport(reactViewPag)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, reactViewPag, str);
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(ReactViewPager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), p0, ReactViewPager.class, str);
          if (obj != PatchProxyResult.class) {
          }else {
          label_0033 :
             ReactViewPager$b adapter = p0.getAdapter();
             Objects.requireNonNull(adapter);
             obj = ReactViewPager$b.class;
             if (PatchProxy.isSupport(obj)) {
                view = PatchProxy.applyOneRefs(Integer.valueOf(p1), adapter, obj, "5");
                if (view != PatchProxyResult.class) {
                }
             }
             view = adapter.d.get(p1);
          }
       }else {
          goto label_0033 ;
       }
       return obj;
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(ReactViewPager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewPagerManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getViewCountInAdapter();
    }
    public Map getCommandsMap(){
       Object obj = PatchProxy.apply(null, this, ReactViewPagerManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2));
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactViewPagerManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.f("topPageScroll", d.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", d.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", d.d("registrationName", "onPageSelected"));
    }
    public String getName(){
       return "AndroidViewPager";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactViewPager p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactViewPagerManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewPagerManager.class, "5")) {
          return;
       }
       a.c(p0);
       a.c(p2);
       if (p1 != 1) {
          if (p1 == 2) {
             p0.i(p2.getInt(0), 0);
             return;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(p1),this.getClass().getSimpleName()};
             throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", objArray));
          }
       }else {
          p0.i(p2.getInt(0), 1);
          return;
       }
    }
    public void receiveCommand(ReactViewPager p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactViewPagerManager.class, "6")) {
          return;
       }
       a.c(p0);
       a.c(p2);
       Objects.requireNonNull(p1);
       if (!p1.equals("setPageWithoutAnimation")) {
          if (p1.equals("setPage")) {
             p0.i(p2.getInt(0), true);
             return;
          }else {
             Object[] objArray = new Object[]{p1,this.getClass().getSimpleName()};
             throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", objArray));
          }
       }else {
          p0.i(p2.getInt(0), 0);
          return;
       }
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(ReactViewPager p0,int p1){
       ReactViewPagerManager reactViewPag = ReactViewPagerManager.class;
       if (PatchProxy.isSupport(reactViewPag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewPag, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactViewPager.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), p0, ReactViewPager.class, "7")) {
          ReactViewPager$b adapter = p0.getAdapter();
          Objects.requireNonNull(adapter);
          ReactViewPager$b uob = ReactViewPager$b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), adapter, uob, "2")) {
             adapter.d.remove(p1);
             adapter.q();
             adapter.f.setOffscreenPageLimit(adapter.d.size());
          }
       }
       return;
    }
    public void setInitialPage(View p0,int p1){
       this.setInitialPage(p0, p1);
    }
    public void setInitialPage(ReactViewPager p0,int p1){
    }
    public void setKeyboardDismissMode(View p0,String p1){
       this.setKeyboardDismissMode(p0, p1);
    }
    public void setKeyboardDismissMode(ReactViewPager p0,String p1){
    }
    public void setPage(View p0,int p1){
       this.setPage(p0, p1);
    }
    public void setPage(ReactViewPager p0,int p1){
    }
    public void setPageMargin(View p0,int p1){
       this.setPageMargin(p0, p1);
    }
    public void setPageMargin(ReactViewPager p0,int p1){
       ReactViewPagerManager reactViewPag = ReactViewPagerManager.class;
       if (PatchProxy.isSupport(reactViewPag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewPag, "11")) {
          return;
       }
       p0.setPageMargin((int)p.c((float)p1));
       return;
    }
    public void setPageWithoutAnimation(View p0,int p1){
       this.setPageWithoutAnimation(p0, p1);
    }
    public void setPageWithoutAnimation(ReactViewPager p0,int p1){
    }
    public void setPeekEnabled(View p0,boolean p1){
       this.setPeekEnabled(p0, p1);
    }
    public void setPeekEnabled(ReactViewPager p0,boolean p1){
       ReactViewPagerManager reactViewPag = ReactViewPagerManager.class;
       if (PatchProxy.isSupport(reactViewPag) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewPag, "12")) {
          return;
       }
       p0.setClipToPadding((p1 ^ 0x01));
       return;
    }
    public void setScrollEnabled(View p0,boolean p1){
       this.setScrollEnabled(p0, p1);
    }
    public void setScrollEnabled(ReactViewPager p0,boolean p1){
       ReactViewPagerManager reactViewPag = ReactViewPagerManager.class;
       if (PatchProxy.isSupport(reactViewPag) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewPag, "2")) {
          return;
       }
       p0.setScrollEnabled(p1);
       return;
    }
}

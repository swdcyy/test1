package com.facebook.react.views.viewpager.ReactViewPager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import com.facebook.react.views.viewpager.ReactViewPager$a;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import com.facebook.react.views.viewpager.ReactViewPager$c;
import androidx.viewpager.widget.ViewPager$i;
import com.facebook.react.views.viewpager.ReactViewPager$b;
import h3.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Runnable;
import android.view.MotionEvent;
import android.view.View;
import df.g;
import java.lang.Throwable;
import cb.a;
import java.util.List;
import java.util.Objects;
import java.util.Collection;

public class ReactViewPager extends ViewPager	// class@001442
{
    public final c b;
    public boolean c;
    public boolean d;
    public final Runnable e;

    public void ReactViewPager(ReactContext p0){
       super(p0);
       this.d = true;
       this.e = new ReactViewPager$a(this);
       this.b = p0.getNativeModule(UIManagerModule.class).getEventDispatcher();
       this.c = false;
       this.setOnPageChangeListener(new ReactViewPager$c(this));
       this.setAdapter(new ReactViewPager$b(this));
    }
    public ReactViewPager$b getAdapter(){
       Object obj = PatchProxy.apply(null, this, ReactViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getAdapter();
    }
    public a getAdapter(){
       return this.getAdapter();
    }
    public int getViewCountInAdapter(){
       Object obj = PatchProxy.apply(null, this, ReactViewPager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getAdapter().j();
    }
    public void i(int p0,boolean p1){
       if (PatchProxy.isSupport(ReactViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ReactViewPager.class, "4")) {
          return;
       }
       this.c = true;
       this.setCurrentItem(p0, p1);
       this.c = false;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactViewPager.class, "5")) {
          return;
       }
       super.onAttachedToWindow();
       this.requestLayout();
       this.post(this.e);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       try{
          if (super.onInterceptTouchEvent(p0)) {
             g.a(this, p0);
             return true;
          }
       }catch(java.lang.IllegalArgumentException e4){
          a.y("ReactNative", "Error intercepting touch event.", e4);
       }
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewPager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e4){
          a.y("ReactNative", "Error handling touch event.", e4);
          return v1;
       }
    }
    public void setScrollEnabled(boolean p0){
       this.d = p0;
    }
    public void setViews(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewPager.class, "10")) {
          return;
       }
       ReactViewPager$b adapter = this.getAdapter();
       Objects.requireNonNull(adapter);
       if (!PatchProxy.applyVoidOneRefs(p0, adapter, ReactViewPager$b.class, "3")) {
          adapter.d.clear();
          adapter.d.addAll(p0);
          adapter.q();
          adapter.e = false;
       }
       return;
    }
}

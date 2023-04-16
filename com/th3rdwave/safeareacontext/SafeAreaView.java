package com.th3rdwave.safeareacontext.SafeAreaView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import android.content.ContextWrapper;
import ar8.a;
import ar8.e;
import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import java.lang.Class;
import java.util.EnumSet;
import ar8.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.System;
import ar8.f;
import java.lang.Runnable;
import java.lang.InterruptedException;
import android.view.ViewParent;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import android.view.ViewTreeObserver;

public class SafeAreaView extends ReactViewGroup implements ViewTreeObserver$OnPreDrawListener	// class@000f96
{
    public SafeAreaViewMode b;
    public a c;
    public EnumSet d;
    public View e;

    public void SafeAreaView(Context p0){
       super(p0);
       this.b = SafeAreaViewMode.PADDING;
    }
    public static ReactContext h(View p0){
       Context context = p0.getContext();
       if (!context instanceof ReactContext && context instanceof ContextWrapper) {
          context = context.getBaseContext();
       }
       return context;
    }
    public final boolean i(){
       SafeAreaView te = this.e;
       if (te == null) {
          return false;
       }
       a uoa = e.c(te);
       if (uoa != null) {
          SafeAreaView tc = this.c;
          if (tc == null || !tc.a(uoa)) {
             this.c = uoa;
             this.j();
             return true;
          }
       }
       return false;
    }
    public final void j(){
       if (this.c != null) {
          SafeAreaView td = this.d;
          if (td == null) {
             td = EnumSet.allOf(SafeAreaViewEdges.class);
          }
          g og = new g(this.c, this.b, td);
          UIManagerModule nativeModule = SafeAreaView.h(this).getNativeModule(UIManagerModule.class);
          if (nativeModule != null) {
             nativeModule.setViewLocalData(this.getId(), og);
             AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
             long l = System.nanoTime();
             SafeAreaView.h(this).runOnNativeModulesQueueThread(new f(this, uAtomicBoole));
             _monitor_enter(uAtomicBoole);
             int i = 0;
             while (!uAtomicBoole.get() && i - 0x12a05f200 < 0) {
                long l1 = 5000;
                try{
                   uAtomicBoole.wait(l1);
                }catch(java.lang.InterruptedException e3){
                   e3.printStackTrace();
                }
                l1 = System.nanoTime() - l;
             }
             _monitor_exit(uAtomicBoole);
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ViewParent parent = this.getParent();
       while (true) {
          if (parent != null) {
             if (parent instanceof SafeAreaProvider) {
                break ;
             }else {
                parent = parent.getParent();
             }
          }else {
             parent = this;
             break ;
          }
       }
       this.e = parent;
       parent.getViewTreeObserver().addOnPreDrawListener(this);
       this.i();
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       SafeAreaView te = this.e;
       if (te != null) {
          te.getViewTreeObserver().removeOnPreDrawListener(this);
       }
       this.e = null;
       return;
    }
    public boolean onPreDraw(){
       boolean b = this.i();
       if (b) {
          this.requestLayout();
       }
       return (b ^ 0x01);
    }
    public void setEdges(EnumSet p0){
       this.d = p0;
       this.j();
    }
    public void setMode(SafeAreaViewMode p0){
       this.b = p0;
       this.j();
    }
}

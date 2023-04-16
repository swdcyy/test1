package com.kds.headertabscrollview.layout.TabsView;
import com.google.android.material.tabs.TabLayout;
import com.kds.headertabscrollview.layout.TabsView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.HorizontalScrollView;
import java.lang.Class;
import java.lang.reflect.Field;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.lang.Throwable;
import cb.a;
import com.kds.headertabscrollview.event.TabEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import kotlin.TypeCastException;
import android.view.View;
import com.google.android.material.tabs.CustomTabView;
import android.widget.TextView;
import java.lang.Float;
import android.text.TextPaint;
import com.kds.headertabscrollview.layout.TabsView$b;
import com.google.android.material.tabs.TabLayout$c;
import java.lang.CharSequence;

public final class TabsView extends TabLayout	// class@00072f
{
    public final ArrayList b;
    public Float c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public boolean h;
    public TabLayout$d i;
    public static final TabsView$a j;

    static {
       TabsView.j = new TabsView$a(null);
    }
    public void TabsView(Context p0){
       a.q(p0, "context");
       super(p0);
       this.b = new ArrayList();
       this.d = -10066330;
       this.e = -14540254;
       this.f = 0xbf800000;
       this.setLayoutParams(new AppBarLayout$LayoutParams(-1, -2));
       this.H(this.d, this.e);
       Class superclass = TabsView.class.getSuperclass();
       if (superclass != null) {
          Field declaredFiel = superclass.getDeclaredField("tabRippleColorStateList");
          if (declaredFiel != null) {
             declaredFiel.setAccessible(true);
             declaredFiel.set(this, null);
          }
       }
       return;
    }
    public final void N(ReadableArray p0){
       if (p0 == null) {
          return;
       }
       TabLayout$f uof = this.v(p0.getInt(0));
       Class superclass = TabsView.class.getSuperclass();
       if (superclass != null) {
          Class[] uClassArray = new Class[]{TabLayout$f.class};
          Method declaredMeth = superclass.getDeclaredMethod("selectTab", uClassArray);
          if (declaredMeth != null) {
             declaredMeth.setAccessible(1);
             Object[] objArray = new Object[]{uof};
             declaredMeth.invoke(this, objArray);
          }
       }
       return;
    }
    public final void O(TabEvent p0,int p1){
       Context context = this.getContext();
       if (context == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
       }
       if (!context.hasActiveCatalystInstance()) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("position", p1);
       context.getJSModule(RCTEventEmitter.class).receiveEvent(this.getId(), p0.toString(), writableMap);
       return;
    }
    public final void P(TabLayout$f p0,boolean p1){
       View view = p0.a();
       if (view instanceof CustomTabView) {
          TextView textView = view.getTextView();
          a.h(textView, "tabContent.textView");
          TabsView tf = this.f;
          int i = 0;
          if (tf - (float)i > 0) {
             if (!p1) {
                tf = this.c;
                if (tf == null) {
                   a.L();
                }
                tf = tf.floatValue();
             }
             textView.setTextSize(i, tf);
          }
          if (this.g != null) {
             TextPaint paint = textView.getPaint();
             a.h(paint, "text.paint");
             paint.setFakeBoldText(p1);
          }
          TabsView te = (p1)? this.e: this.d;
          textView.setTextColor(te);
       }
       return;
    }
    public final ArrayList getTabTexts(){
       return this.b;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.h == null) {
          this.onFinishInflate();
          this.h = true;
       }
       if (this.i == null) {
          this.i = new TabsView$b(this);
       }
       TabsView ti = this.i;
       if (ti == null) {
          a.L();
       }
       this.a(ti);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       TabsView ti = this.i;
       if (ti != null) {
          this.A(ti);
       }
       return;
    }
    public void onFinishInflate(){
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          TabLayout$f uof = this.w();
          uof.o(this.b.get(i1));
          this.b(uof);
       }
       super.onFinishInflate();
       return;
    }
    public final void setBoldWhenSelected(boolean p0){
       this.g = p0;
    }
    public final void setNormalTextColor(int p0){
       if (this.d == p0) {
          return;
       }
       this.d = p0;
       return;
    }
    public final void setSelectedTabTextSize(float p0){
       this.f = p0;
    }
    public final void setSelectedTextColor(int p0){
       if (this.e == p0) {
          return;
       }
       this.e = p0;
       return;
    }
    public final void setTabTextSize(float p0){
       if (a.e(this.c, p0)) {
          return;
       }
       this.c = Float.valueOf(p0);
       return;
    }
}

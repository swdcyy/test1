package com.kuaishou.webkit.WebView$PrivateAccess;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Float;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;
import java.lang.Integer;
import java.lang.reflect.Field;
import android.view.KeyEvent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.os.Bundle;
import android.graphics.Rect;
import android.view.View;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.content.Intent;

public class WebView$PrivateAccess	// class@001289
{
    public final WebView this$0;

    public void WebView$PrivateAccess(WebView p0){
       this.this$0 = p0;
       super();
    }
    public void awakenScrollBars(int p0){
       WebView.access$1700(this.this$0, p0);
    }
    public void awakenScrollBars(int p0,boolean p1){
       WebView.access$1800(this.this$0, p0, p1);
    }
    public float getHorizontalScrollFactor(){
       try{
          Class[] uClassArray = new Class[0];
          Method declaredMeth = Class.forName("android.view.View").getDeclaredMethod("getHorizontalScrollFactor", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[0];
          return declaredMeth.invoke(this.this$0, objArray).floatValue();
       }catch(java.lang.Exception e0){
          Logger.w("WebView", "Method getHorizontalScrollFactor\(\) catch Exception: "+e0);
          return 0x3f800000;
       }
    }
    public int getHorizontalScrollbarHeight(){
       return WebView.access$2000(this.this$0);
    }
    public float getVerticalScrollFactor(){
       try{
          Class[] uClassArray = new Class[0];
          Method declaredMeth = Class.forName("android.view.View").getDeclaredMethod("getVerticalScrollFactor", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[0];
          return declaredMeth.invoke(this.this$0, objArray).floatValue();
       }catch(java.lang.Exception e0){
          Logger.w("WebView", "Method getVerticalScrollFactor\(\) catch Exception: "+e0);
          return 0x3f800000;
       }
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       this.this$0.onOverScrolled(p0, p1, p2, p3);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       this.this$0.onScrollChanged(p0, p1, p2, p3);
    }
    public void overScrollBy(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       this.this$0.overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public void setMeasuredDimension(int p0,int p1){
       WebView.access$1900(this.this$0, p0, p1);
    }
    public void setScrollXRaw(int p0){
       WebView$PrivateAccess tthis$0 = this.this$0;
       tthis$0.mFieldScrollX.set(tthis$0, Integer.valueOf(p0));
    }
    public void setScrollYRaw(int p0){
       WebView$PrivateAccess tthis$0 = this.this$0;
       tthis$0.mFieldScrollY.set(tthis$0, Integer.valueOf(p0));
    }
    public void super_computeScroll(){
       WebView.access$901(this.this$0);
    }
    public boolean super_dispatchKeyEvent(KeyEvent p0){
       return WebView.access$1301(this.this$0, p0);
    }
    public int super_getScrollBarStyle(){
       return WebView.access$201(this.this$0);
    }
    public int super_getScrollX(){
       return WebView.access$701(this.this$0);
    }
    public int super_getScrollY(){
       return WebView.access$801(this.this$0);
    }
    public void super_onDrawVerticalScrollBar(Canvas p0,Drawable p1,int p2,int p3,int p4,int p5){
    }
    public boolean super_onGenericMotionEvent(MotionEvent p0){
       return WebView.access$1401(this.this$0, p0);
    }
    public boolean super_onHoverEvent(MotionEvent p0){
       return WebView.access$1001(this.this$0, p0);
    }
    public void super_onScrollChanged(int p0,int p1,int p2,int p3){
       WebView.access$301(this.this$0, p0, p1, p2, p3);
    }
    public boolean super_overScrollBy(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       return WebView.access$401(this.this$0, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public boolean super_performAccessibilityAction(int p0,Bundle p1){
       return WebView.access$1101(this.this$0, p0, p1);
    }
    public boolean super_performLongClick(){
       return WebView.access$1201(this.this$0);
    }
    public boolean super_requestFocus(int p0,Rect p1){
       return WebView.access$1501(this.this$0, p0, p1);
    }
    public void super_scrollBy(int p0,int p1){
       WebView.access$601(this.this$0, p0, p1);
    }
    public void super_scrollTo(int p0,int p1){
       WebView.access$501(this.this$0, p0, p1);
    }
    public boolean super_setFrame(int p0,int p1,int p2,int p3){
       Class tYPE;
       int i = 0;
       try{
          Class[] uClassArray = new Class[]{tYPE,tYPE,tYPE,tYPE};
          tYPE = Integer.TYPE;
          Method declaredMeth = View.class.getDeclaredMethod("setFrame", uClassArray);
          declaredMeth.setAccessible(1);
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3)};
          return declaredMeth.invoke(this.this$0, objArray).booleanValue();
       }catch(java.lang.Exception e10){
          Logger.w("WebView", "Method super_setFrame\(\) catch Exception: "+e10);
          return i;
       }
    }
    public void super_setLayoutParams(ViewGroup$LayoutParams p0){
       WebView.access$1601(this.this$0, p0);
    }
    public void super_startActivityForResult(Intent p0,int p1){
       try{
          Class[] uClassArray = new Class[]{Intent.class,Integer.TYPE};
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
          View.class.getMethod("startActivityForResult", uClassArray).invoke(this.this$0, objArray);
       }catch(java.lang.Exception e8){
          Logger.w("WebView", "Method super_startActivityForResult\(\) catch Exception: "+e8);
       }
       return;
    }
}

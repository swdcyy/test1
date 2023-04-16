package com.yxcorp.gifshow.widget.MultiFingeredAndDoubleClickInterceptFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import faa.a;
import q87.c;
import android.view.ViewGroup;
import android.view.View;

public class MultiFingeredAndDoubleClickInterceptFrameLayout extends FrameLayout	// class@001880
{
    public long b;

    public void MultiFingeredAndDoubleClickInterceptFrameLayout(Context p0){
       super(p0, null);
    }
    public void MultiFingeredAndDoubleClickInterceptFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MultiFingeredAndDoubleClickInterceptFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredAndDoubleClickInterceptFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!p0.getAction()) {
          if ((SystemClock.elapsedRealtime() - this.b) - 300 < 0) {
             obj = new Object[i];
             a.D().w("MultiFingeredAndDoubleClickInterceptFrameLayout", "onInterceptTouchEvent double click", obj);
             return true;
          }else {
             this.b = SystemClock.elapsedRealtime();
          }
       }
       if (p0.getPointerCount() > 1 || super.onInterceptTouchEvent(p0)) {
          i = true;
       }
       return i;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredAndDoubleClickInterceptFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.onTouchEvent(p0);
       return true;
    }
}

package com.yxcorp.gifshow.corona.common.monitor.FloatLayoutNew$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.corona.common.monitor.FloatLayoutNew;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.view.ViewTreeObserver;

public final class FloatLayoutNew$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00125c
{
    public final FloatLayoutNew b;

    public void FloatLayoutNew$a(FloatLayoutNew p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, FloatLayoutNew$a.class, "1")) {
          return;
       }
       int measuredWidt = this.b.getMeasuredWidth();
       int measuredHeig = this.b.getMeasuredHeight();
       if (measuredWidt > 0 && measuredHeig > 0) {
          FloatLayoutNew$a tb = this.b;
          tb.h = measuredWidt;
          tb.i = measuredHeig;
          tb.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       return;
    }
}

package com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import com.facebook.react.ReactRootView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import gn8.g;
import android.view.ViewGroup;
import com.facebook.react.a;
import java.lang.String;
import android.os.Bundle;

public class RNGestureHandlerEnabledRootView extends ReactRootView	// class@000c82
{
    public a I;
    public g J;

    public void RNGestureHandlerEnabledRootView(Context p0){
       super(p0);
    }
    public void RNGestureHandlerEnabledRootView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       RNGestureHandlerEnabledRootView tJ = this.J;
       if (tJ != null && tJ.a(p0)) {
          return true;
       }
       return super.dispatchTouchEvent(p0);
    }
    public void l(a p0,String p1,Bundle p2){
       super.l(p0, p1, p2);
       this.I = p0;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       RNGestureHandlerEnabledRootView tJ = this.J;
       if (tJ != null) {
          tJ.c(p0);
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
}

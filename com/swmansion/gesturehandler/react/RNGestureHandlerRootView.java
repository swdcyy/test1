package com.swmansion.gesturehandler.react.RNGestureHandlerRootView;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import android.view.MotionEvent;
import java.lang.Object;
import od.a;
import gn8.g;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import android.view.ViewParent;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import com.facebook.react.bridge.ReactContext;

public class RNGestureHandlerRootView extends ReactViewGroup	// class@000c8e
{
    public boolean b;
    public g c;
    public boolean d;

    public void RNGestureHandlerRootView(Context p0){
       super(p0);
       this.d = false;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       if (this.b != null) {
          RNGestureHandlerRootView tc = this.c;
          a.c(tc);
          if (tc.a(p0)) {
             return true;
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onAttachedToWindow(){
       int i1;
       super.onAttachedToWindow();
       UiThreadUtil.assertOnUiThread();
       ViewParent parent = this.getParent();
       while (true) {
          int i = 1;
          if (parent != null) {
             if (parent instanceof RNGestureHandlerEnabledRootView || parent instanceof RNGestureHandlerRootView) {
                i1 = 1;
             label_001e :
                this.b = i1 ^ i;
                if (this.b != null && this.c == null) {
                   g og = new g(this.getContext(), this);
                   this.c = og;
                   og.d(this.d);
                   break ;
                }
                break ;
             }else {
                parent = parent.getParent();
             }
          }else {
             i1 = 0;
             goto label_001e ;
          }
       }
       return;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (this.b != null) {
          RNGestureHandlerRootView tc = this.c;
          a.c(tc);
          tc.c(p0);
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void setForbiddenMultiFinger(boolean p0){
       this.d = p0;
       RNGestureHandlerRootView tc = this.c;
       if (tc != null) {
          tc.d(p0);
       }
       return;
    }
}

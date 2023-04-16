package com.swmansion.gesturehandler.react.RNGestureHandlerModule$b;
import ze.q0;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.lang.Object;
import ze.m;
import android.view.View;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import gn8.g;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import java.util.List;

public class RNGestureHandlerModule$b implements q0	// class@000c84
{
    public final int a;
    public final RNGestureHandlerModule b;

    public void RNGestureHandlerModule$b(RNGestureHandlerModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(m p0){
       View view = p0.p(this.a);
       if (view instanceof RNGestureHandlerEnabledRootView) {
          if (view.J == null) {
             view.J = new g(view.I.n(), view);
          }else {
             throw new IllegalStateException("GestureHandler already initialized for root view "+view);
          }
       }
       RNGestureHandlerModule mEnqueuedRoo = this.b.mEnqueuedRootViewInit;
       _monitor_enter(mEnqueuedRoo);
       this.b.mEnqueuedRootViewInit.remove(new Integer(this.a));
       _monitor_exit(mEnqueuedRoo);
       return;
    }
}

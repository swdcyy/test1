package com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Math;
import android.view.View;
import df.g;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.Float;
import ze.p;

public class ReactSwipeRefreshLayout extends SwipeRefreshLayout	// class@0013f8
{
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public float V;
    public boolean W;

    public void ReactSwipeRefreshLayout(ReactContext p0){
       super(p0);
       this.R = false;
       this.S = false;
       this.T = 0;
       this.U = ViewConfiguration.get(p0).getScaledTouchSlop();
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactSwipeRefreshLayout.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, this, ReactSwipeRefreshLayout.class, "6");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = p0.getAction();
          if (b) {
             if (b == 2) {
                float f = Math.abs((p0.getX() - this.V));
                if (this.W != null || f - (float)this.U > 0) {
                   this.W = true;
                   b = false;
                }
             }
          }else {
             this.V = p0.getX();
             this.W = false;
          }
          b = true;
       }
       if (b && super.onInterceptTouchEvent(p0)) {
          g.a(this, p0);
          if (this.getParent() != null) {
             this.getParent().requestDisallowInterceptTouchEvent(true);
          }
          return true;
       }else {
          return false;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactSwipeRefreshLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactSwipeRefreshLayout.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.R == null) {
          this.R = true;
          this.setProgressViewOffset(this.T);
          this.setRefreshing(this.S);
       }
       return;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(ReactSwipeRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactSwipeRefreshLayout.class, "4")) {
          return;
       }
       if (this.getParent() != null) {
          this.getParent().requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public void setProgressViewOffset(float p0){
       if (PatchProxy.isSupport(ReactSwipeRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactSwipeRefreshLayout.class, "2")) {
          return;
       }
       this.T = p0;
       if (this.R != null) {
          int progressCirc = this.getProgressCircleDiameter();
          int i = Math.round(p.c(p0)) - progressCirc;
          this.l(false, i, Math.round((p.c((p0 + 64.00f)) - (float)progressCirc)));
       }
       return;
    }
    public void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(ReactSwipeRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactSwipeRefreshLayout.class, "1")) {
          return;
       }
       this.S = p0;
       if (this.R != null) {
          super.setRefreshing(p0);
       }
       return;
    }
}

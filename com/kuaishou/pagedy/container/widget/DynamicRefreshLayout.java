package com.kuaishou.pagedy.container.widget.DynamicRefreshLayout;
import com.kwai.library.widget.refresh.KwaiRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Math;

public final class DynamicRefreshLayout extends KwaiRefreshLayout	// class@000a6e
{
    public float h1;
    public float i1;
    public float j1;
    public int k1;
    public boolean l1;

    public void DynamicRefreshLayout(Context p0){
       super(p0, null);
    }
    public void DynamicRefreshLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.h1 = (float)viewConfigur.getScaledTouchSlop();
    }
    public final float M(MotionEvent p0,int p1){
       if (PatchProxy.isSupport(DynamicRefreshLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, DynamicRefreshLayout.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p1 = p0.findPointerIndex(p1);
       float f = (p1 < 0)? (float)-1: p0.getX(p1);
       return f;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       DynamicRefreshLayout obj = PatchProxy.applyOneRefs(p0, this, DynamicRefreshLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       int action = p0.getAction();
       int i = -1;
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else if(this.l1 != null){
                return b;
             }else {
                obj = this.k1;
                if (obj == i) {
                   return super.onInterceptTouchEvent(p0);
                }else {
                   float f = this.M(p0, obj);
                   float f1 = this.r(p0, this.k1);
                   int i1 = 0xbf800000;
                   if (!f - i1 || !f1 - i1) {
                      return super.onInterceptTouchEvent(p0);
                   }else {
                      f = Math.abs((f - this.i1));
                      f1 = Math.abs((f1 - this.j1));
                      if (f - this.h1 > 0 && f - f1 > 0) {
                         return b;
                      }
                   }
                }
             }
          }else {
          }
       }else {
          this.l1 = b;
          action = p0.getPointerId(b);
          this.k1 = action;
          if (action == i) {
             return super.onInterceptTouchEvent(p0);
          }else {
             this.i1 = this.M(p0, action);
             this.j1 = this.r(p0, this.k1);
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(DynamicRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicRefreshLayout.class, "3")) {
          return;
       }
       this.l1 = p0;
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
}

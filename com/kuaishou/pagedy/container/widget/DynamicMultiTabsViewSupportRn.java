package com.kuaishou.pagedy.container.widget.DynamicMultiTabsViewSupportRn;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewParent;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import do4.n;
import java.lang.Float;
import com.kuaishou.bowl.core.component.a;
import java.util.Iterator;
import java.lang.Iterable;
import android.graphics.RectF;
import do4.d;
import android.view.ViewGroup;

public final class DynamicMultiTabsViewSupportRn extends DynamicMultiTabsView	// class@000a68
{
    public View l;
    public float m;
    public float n;

    public void DynamicMultiTabsViewSupportRn(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicMultiTabsViewSupportRn(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicMultiTabsViewSupportRn(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void DynamicMultiTabsViewSupportRn(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       View view1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicMultiTabsViewSupportRn obj = PatchProxy.applyOneRefs(p0, this, DynamicMultiTabsViewSupportRn.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       float rawX = p0.getRawX();
       float rawY = p0.getRawY();
       int action = p0.getAction();
       View view = null;
       if (action) {
          DynamicMultiTabsViewSupportRn uDynamicMult = 1;
          if (action != uDynamicMult) {
             if (action == 2) {
                DynamicMultiTabsViewSupportRn tl = this.l;
                if (tl != null) {
                   rawX = rawX - this.m;
                   rawY = rawY - this.n;
                   if (Math.abs(rawX) - Math.abs(rawY) > 0 && rawX - (float)0 > 0) {
                      uDynamicMult = this.l;
                      if (uDynamicMult != null) {
                         ViewParent parent = uDynamicMult.getParent();
                         if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(tl.canScrollHorizontally(-1));
                         }
                      }
                   }else if(Math.abs(rawX) - Math.abs(rawY) > 0 && rawX - (float)0 < 0){
                      obj = this.l;
                      if (obj != null) {
                         ViewParent parent1 = obj.getParent();
                         if (parent1 != null) {
                            parent1.requestDisallowInterceptTouchEvent(tl.canScrollHorizontally(uDynamicMult));
                         }
                      }
                   }
                }
             }
          }else {
             this.l = view;
          }
       }else {
          this.m = rawX;
          this.n = rawY;
          n on = this.a(this.getViewPager2().getCurrentItem());
          if (on != null) {
             if (PatchProxy.isSupport(DynamicMultiTabsViewSupportRn.class)) {
                view1 = PatchProxy.applyThreeRefs(on, Float.valueOf(rawX), Float.valueOf(rawY), this, DynamicMultiTabsViewSupportRn.class, "2");
                if (view1 != patchProxyRe) {
                label_0126 :
                   this.l = view1;
                }
             }
             n on1 = n.class;
             if (PatchProxy.isSupport(on1)) {
                a obj1 = PatchProxy.applyTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), on, on1, "17");
                if (obj1 != patchProxyRe) {
                   view = obj1;
                }else {
                label_00d5 :
                   n f = on.f;
                   if (f != null) {
                      a children = f.children;
                      if (children != null) {
                         Iterator iterator = children.iterator();
                         while (iterator.hasNext()) {
                            a uoa = iterator.next();
                            obj1 = uoa.rootView;
                            if (obj1 != null) {
                               RectF rectF = d.a(obj1);
                               Boolean uBoolean = (rectF != null)? Boolean.valueOf(rectF.contains(rawX, rawY)): view;
                               if (a.g(uBoolean, Boolean.TRUE)) {
                                  a.o(uoa, "it");
                                  if ((uoa.getComponentType()).equals("TK")) {
                                     children = uoa.rootView;
                                     a.o(children, "it.rootView");
                                     view = d.b(children);
                                     break ;
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }else {
                goto label_00d5 ;
             }
             view1 = view;
             goto label_0126 ;
          }
       }
    label_0128 :
       return super.dispatchTouchEvent(p0);
    }
}

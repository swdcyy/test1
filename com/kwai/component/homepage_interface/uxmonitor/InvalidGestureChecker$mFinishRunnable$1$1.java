package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$mFinishRunnable$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$mFinishRunnable$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb5.c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ub5.b;
import android.graphics.Point;
import java.lang.Enum;
import lnc.a1;
import java.util.List;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import android.graphics.Rect;
import trd.j;
import com.kwai.component.homepage_interface.uxmonitor.model.ViewInfo;
import java.util.Collection;
import android.view.ViewGroup;
import com.kwai.component.homepage_interface.uxmonitor.model.TargetViewInfo;
import java.lang.ref.WeakReference;
import android.view.ViewParent;

public final class InvalidGestureChecker$mFinishRunnable$1$1 extends Lambda implements l	// class@00097a
{
    public final c $gesture;
    public final Ref$ObjectRef $invalidGestureInfo;
    public final InvalidGestureChecker$mFinishRunnable$1 this$0;

    public void InvalidGestureChecker$mFinishRunnable$1$1(InvalidGestureChecker$mFinishRunnable$1 p0,Ref$ObjectRef p1,c p2){
       this.this$0 = p0;
       this.$invalidGestureInfo = p1;
       this.$gesture = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       InvalidGestureChecker$mFinishRunnable$1$1 omFinishRunn;
       int i3;
       int i4;
       View obj2;
       Object[] objArray1;
       j obj3;
       Object[] objArray2;
       TargetViewInfo targetViewIn;
       ViewInfo a;
       int i7;
       int i8;
       Object[] obj = this;
       InvalidGestureChecker$mFinishRunnable$1$1 obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, InvalidGestureChecker$mFinishRunnable$1$1.class, "1")) {
          return;
       }
       a.p(obj1, "it");
       obj1 = obj.$invalidGestureInfo;
       InvalidGestureChecker$mFinishRunnable$1$1 $gesture = obj.$gesture;
       InvalidGestureChecker f = obj.this$0.b.f;
       Objects.requireNonNull($gesture);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       b uob = PatchProxy.applyOneRefs(f, $gesture, uoc, "12");
       if (uob != patchProxyRe) {
          omFinishRunn = obj1;
       }else {
          String str = "activity";
          a.p(f, str);
          Point point = new Point((int)$gesture.a, (int)$gesture.b);
          Point point1 = new Point((int)$gesture.c, (int)$gesture.d);
          String str1 = $gesture.e.name();
          ArrayList uArrayList = ($gesture.g != null)? 2: 1;
          int i = a1.h();
          int i1 = a1.g();
          int i2 = 0;
          if ($gesture.g == null) {
             ArrayList uArrayList1 = PatchProxy.applyOneRefs(f, $gesture, uoc, "8");
             if (uArrayList1 != patchProxyRe) {
                omFinishRunn = obj1;
                i3 = uArrayList;
                obj = null;
                i4 = 0;
             }else {
                a.p(f, str);
                Window window = f.getWindow();
                a.o(window, "activity.window");
                View decorView = window.getDecorView();
                a.o(decorView, "activity.window.decorView");
                ArrayList uArrayList2 = new ArrayList();
                i4 = 0;
                obj3 = new j();
                obj3.addLast($gesture.a(decorView, 0, new Rect(i2, i2, decorView.getWidth(), decorView.getHeight()), 0, 1));
                int i5 = obj3.isEmpty() ^ 1;
                while (i5) {
                   Object obj4 = obj3.removeLast();
                   a = obj4.a;
                   Rect rect = obj4.a();
                   if (rect != null) {
                      if (rect.contains((int)$gesture.a, (int)$gesture.b) != true) {
                      }else if(a instanceof ViewGroup){
                         ViewInfo viewInfo = a;
                         int childCount = viewInfo.getChildCount();
                         int i6 = 0;
                         while (i6 < childCount) {
                            rect = new Rect();
                            i5 = obj4.a().left - viewInfo.getScrollX();
                            View childAt = viewInfo.getChildAt(i6);
                            a.o(childAt, "view.getChildAt\(i\)");
                            i5 = i5 + childAt.getLeft();
                            float f1 = (float)i5;
                            View childAt1 = viewInfo.getChildAt(i6);
                            a.o(childAt1, "view.getChildAt\(i\)");
                            f1 = f1 + childAt1.getTranslationX();
                            i7 = (int)f1;
                            i5 = obj4.a().top - viewInfo.getScrollY();
                            obj2 = viewInfo.getChildAt(i6);
                            a.o(obj2, "view.getChildAt\(i\)");
                            i5 = i5 + obj2.getTop();
                            float f2 = (float)i5;
                            childAt1 = viewInfo.getChildAt(i6);
                            a.o(childAt1, "view.getChildAt\(i\)");
                            f2 = f2 + childAt1.getTranslationY();
                            i8 = (int)f2;
                            childAt1 = viewInfo.getChildAt(i6);
                            a.o(childAt1, "view.getChildAt\(i\)");
                            i5 = childAt1.getWidth() + i7;
                            View childAt2 = viewInfo.getChildAt(i6);
                            a.o(childAt2, "view.getChildAt\(i\)");
                            int i9 = childAt2.getHeight() + i8;
                            rect.set(i7, i8, i5, i9);
                            childAt = viewInfo.getChildAt(i6);
                            a.o(childAt, "view.getChildAt\(i\)");
                            i8 = obj4.level + 1;
                            Rect rect1 = rect;
                            decorView = childAt;
                            i7 = i6;
                            i6 = i8;
                            obj3.addLast($gesture.a(decorView, i6, rect1, i7, 1));
                            i6 = i7 + 1;
                            childCount = childCount;
                            obj4 = obj4;
                            obj1 = obj1;
                            uArrayList = uArrayList;
                         }
                      }
                      Object obj5 = obj4;
                      obj5.b(null);
                      uArrayList2.add(obj5);
                      obj1 = obj1;
                      uArrayList = uArrayList;
                   }else {
                      i7 = this;
                   }
                }
                omFinishRunn = obj1;
                i3 = uArrayList;
                targetViewIn = null;
                uArrayList1 = uArrayList2;
             }
             obj2 = uArrayList1;
          }else {
             omFinishRunn = obj1;
             i3 = uArrayList;
             targetViewIn = null;
             i4 = 0;
             i8 = targetViewIn;
          }
          if ($gesture.g != null) {
             Object[] objArray = PatchProxy.apply(obj, $gesture, uoc, "9");
             if (objArray != patchProxyRe) {
             }else {
                c h = $gesture.h;
                if (h != null) {
                   obj3 = h.get();
                   if (obj3 != null) {
                      a.o(obj3, "mConsumerViewWeak?.get\(\) ?: return null");
                      uArrayList = new ArrayList();
                      ViewParent parent = obj3.getParent();
                      if (!parent instanceof View) {
                         parent = obj;
                      }
                      ViewParent viewParent = parent;
                      while (viewParent != null) {
                         uArrayList.add(c.b($gesture, viewParent, 0, null, 0, false, 16, null));
                         parent = viewParent.getParent();
                         if (!parent instanceof View) {
                            objArray2 = obj;
                         }
                         viewParent = objArray2;
                         i4 = i4 + 1;
                      }
                      targetViewIn = new TargetViewInfo(c.b($gesture, obj3, i4, null, 0, false, 16, null), uArrayList);
                   }
                }
                objArray = targetViewIn;
             }
             objArray1 = objArray;
          }else {
             objArray1 = obj;
          }
          b uob1 = new b(point, point1, str1, i3, i, i1, 0, obj2, objArray1);
          uob = v22;
       }
       omFinishRunn.element = uob;
       return;
    }
}

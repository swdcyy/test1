package gn8.g;
import com.facebook.react.bridge.ReactContext;
import android.view.ViewGroup;
import java.lang.Object;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import gn8.e;
import com.facebook.react.ReactRootView;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;
import android.view.ViewParent;
import java.lang.String;
import fn8.d;
import gn8.j;
import fn8.e;
import fn8.o;
import gn8.g$a;
import fn8.b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.view.MotionEvent;
import cb.a;
import android.view.View;
import java.lang.System;
import java.util.Comparator;
import java.util.Arrays;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent$PointerCoords;
import fn8.f;
import fn8.i;

public class g	// class@00249e
{
    public final ReactContext a;
    public final d b;
    public final b c;
    public final ViewGroup d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public void g(ReactContext p0,ViewGroup p1){
       super();
       this.e = false;
       this.f = false;
       this.g = -1;
       this.h = false;
       UiThreadUtil.assertOnUiThread();
       int id = p1.getId();
       if (id < 1) {
          throw new IllegalStateException("Expect view tag to be set for "+p1);
       }
       RNGestureHandlerModule nativeModule = p0.getNativeModule(RNGestureHandlerModule.class);
       e registry = nativeModule.getRegistry();
       UiThreadUtil.assertOnUiThread();
       for (ViewParent viewParent = p1; viewParent != null && (!viewParent instanceof ReactRootView && !viewParent instanceof ReactModalHostView$DialogRootViewGroup); viewParent = viewParent.getParent()) {
       }
       if (viewParent == null) {
          throw new IllegalStateException("View "+p1+" has not been mounted under ReactRootView");
       }
       this.d = viewParent;
       viewParent.toString();
       this.a = p0;
       d uod = new d(p1, registry, new j());
       this.b = uod;
       uod.n = 0.10f;
       g$a uoa = new g$a(this);
       this.c = uoa;
       uoa.w((- id));
       registry.e(uoa);
       registry.b(uoa.l(), id);
       nativeModule.registerRootHelper(this);
       return;
    }
    public boolean a(MotionEvent p0){
       int actionMasked;
       int actionIndex;
       d h;
       b s;
       float f1;
       MotionEvent motionEvent2;
       g og = this;
       MotionEvent motionEvent = p0;
       int b = true;
       og.f = b;
       int i = 3;
       int i1 = 6;
       float f = 0.00f;
       b uob = 5;
       int i2 = -1;
       int i3 = 0;
       if (og.h != null) {
          MotionEvent motionEvent1 = MotionEvent.obtain(p0);
          actionMasked = p0.getActionMasked();
          actionIndex = p0.getActionIndex();
          if (actionMasked) {
             if (actionMasked != b) {
                if (actionMasked != f) {
                   if (actionMasked != i) {
                      if (actionMasked == uob || actionMasked == i1) {
                         motionEvent = null;
                      label_008e :
                         if (motionEvent == null) {
                            return og.e;
                         }
                      }
                   }
                }else if(og.g == i2){
                   og.g = motionEvent.getPointerId(actionIndex);
                }
                actionMasked = motionEvent.findPointerIndex(og.g);
                float y2 = motionEvent.getY(actionMasked);
                motionEvent1.offsetLocation((motionEvent.getX(actionMasked) - motionEvent1.getX()), (y2 - motionEvent1.getY()));
             }
             StringBuilder str = "wrapMotionEvent: ";
             String str1 = (actionMasked == i)? "CANCELLED": "FINISHED";
             a.x("ReactNative", str+str1);
             og.g = i2;
          }else {
             og.g = motionEvent.getPointerId(i3);
             motionEvent1.offsetLocation((motionEvent.getX(i3) - motionEvent1.getX()), (motionEvent.getY(i3) - motionEvent1.getY()));
          }
          motionEvent = motionEvent1;
          goto label_008e ;
       }
       g b1 = og.b;
       b1.j = b;
       actionMasked = motionEvent.getActionMasked();
       if (!actionMasked || actionMasked == uob) {
          actionMasked = motionEvent.getActionIndex();
          actionIndex = motionEvent.getPointerId(actionMasked);
          float[] r = d.r;
          r[i3] = motionEvent.getX(actionMasked);
          r[b] = motionEvent.getY(actionMasked);
          b1.l(b1.a, r, actionIndex);
          b1.d(b1.a, r, actionIndex);
       }else if(actionMasked == i){
          for (actionMasked = b1.i + i2; actionMasked >= 0; actionMasked = actionMasked - 1) {
             b1.e[actionMasked].c();
          }
          h = b1.h;
          for (actionIndex = 0; actionIndex < h; actionIndex = actionIndex + 1) {
             b1.f[actionIndex] = b1.d[actionIndex];
          }
          for (actionMasked = h + i2; actionMasked >= 0; actionMasked = actionMasked - 1) {
             b1.f[actionMasked].c();
          }
       }
       h = b1.h;
       System.arraycopy(b1.d, i3, b1.f, i3, h);
       Arrays.sort(b1.f, i3, h, d.s);
       actionIndex = 0;
       while (actionIndex < h) {
          object oobject = b1.f[actionIndex];
          View view = oobject.m();
          if (view != null) {
             if (view != b1.a) {
                for (ViewParent parent = view.getParent(); parent != null && parent != b1.a; parent = parent.getParent()) {
                }
                if (parent != b1.a) {
                label_0126 :
                   view = null;
                label_0127 :
                   if (!view) {
                      oobject.c();
                   }else if(oobject.i != null){
                      b e = oobject.e;
                      if (e != b && (e != i && (e != uob && oobject.b > null))) {
                         view = 1;
                      label_0140 :
                         if (view) {
                            int actionMasked1 = motionEvent.getActionMasked();
                            if (oobject.w == null || actionMasked1 != f) {
                               float[] r1 = d.r;
                               b1.c(oobject.m(), motionEvent, r1);
                               float x = motionEvent.getX();
                               f = motionEvent.getY();
                               motionEvent.setLocation(r1[i3], r1[b]);
                               if (oobject.i != null) {
                                  b e1 = oobject.e;
                                  if (e1 != i && (e1 != b && (e1 == uob || oobject.b < b))) {
                                  label_02f3 :
                                     i = 2;
                                  }else if(motionEvent.getPointerCount() != oobject.b){
                                     i1 = 0;
                                     while (true) {
                                        b b2 = oobject.a;
                                        if (i1 < b2.length) {
                                           if (b2[i1] == i2 || b2[i1] == i1) {
                                              i1 = i1 + 1;
                                              i = 3;
                                           }
                                        }else {
                                           f1 = 0;
                                        label_0199 :
                                           if (!f1) {
                                              motionEvent2 = motionEvent;
                                           }else {
                                              i = motionEvent.getActionMasked();
                                              if (!i || i == uob) {
                                                 i = motionEvent.getActionIndex();
                                                 if (oobject.a[motionEvent.getPointerId(i)] != i2) {
                                                    if (oobject.b == b) {
                                                       i1 = i;
                                                       f1 = 0;
                                                    }else {
                                                       i1 = i;
                                                       f1 = 5;
                                                    }
                                                 }else {
                                                 label_01df :
                                                    i1 = i;
                                                    f1 = 2;
                                                 }
                                              }else if(i == b || i == 6){
                                                 i = motionEvent.getActionIndex();
                                                 if (oobject.a[motionEvent.getPointerId(i)] != i2) {
                                                    if (oobject.b == b) {
                                                       i1 = i;
                                                       f1 = 1;
                                                    }else {
                                                       i1 = i;
                                                       f1 = 6;
                                                    }
                                                 }else {
                                                    goto label_01df ;
                                                 }
                                              }else {
                                                 e1 = -1;
                                              }
                                              b2 = oobject.b;
                                              if (b.y == null) {
                                                 int x1 = b.x;
                                                 MotionEvent$PointerProperties[] pointerPrope = new MotionEvent$PointerProperties[x1];
                                                 b.y = pointerPrope;
                                                 MotionEvent$PointerCoords[] pointerCoord = new MotionEvent$PointerCoords[x1];
                                                 b.z = pointerCoord;
                                              }
                                              while (b2 > 0) {
                                                 MotionEvent$PointerProperties[] y = b.y;
                                                 b2 = b2 - 1;
                                                 if (y[b2] == null) {
                                                    y[b2] = new MotionEvent$PointerProperties();
                                                    b.z[b2] = new MotionEvent$PointerCoords();
                                                 }else {
                                                 }
                                              }
                                              float x2 = motionEvent.getX();
                                              float y1 = motionEvent.getY();
                                              motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                                              b = motionEvent.getPointerCount();
                                              int i4 = f1;
                                              i = 0;
                                              int i5 = 0;
                                              while (i < b) {
                                                 int pointerId1 = motionEvent.getPointerId(i);
                                                 int i6 = b;
                                                 if (oobject.a[pointerId1] != i2) {
                                                    motionEvent.getPointerProperties(i, b.y[i5]);
                                                    b.y[i5].id = oobject.a[pointerId1];
                                                    motionEvent.getPointerCoords(i, b.z[i5]);
                                                    if (i == i1) {
                                                       b = i5 << 8;
                                                       i4 = i4 | b;
                                                    }
                                                    i5 = i5 + 1;
                                                 }
                                                 i = i + 1;
                                                 b = i6;
                                                 i2 = -1;
                                              }
                                              motionEvent2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i4, i5, b.y, b.z, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                                              motionEvent.setLocation(x2, y1);
                                              motionEvent2.setLocation(x2, y1);
                                           }
                                           oobject.f = motionEvent2.getX();
                                           oobject.g = motionEvent2.getY();
                                           oobject.q = motionEvent2.getPointerCount();
                                           i = oobject.o(oobject.d, oobject.f, oobject.g);
                                           oobject.h = i;
                                           if (oobject.p != null && !i) {
                                              s = oobject.e;
                                              if (s == 4) {
                                                 oobject.c();
                                                 goto label_02f3 ;
                                              }else if(s == 2){
                                                 oobject.f();
                                              }
                                           }else {
                                              oobject.l = f.a(motionEvent2, true);
                                              oobject.m = f.b(motionEvent2, true);
                                              float f2 = motionEvent2.getRawX() - motionEvent2.getX();
                                              oobject.n = f2;
                                              f2 = motionEvent2.getRawY() - motionEvent2.getY();
                                              oobject.o = f2;
                                              oobject.r(motionEvent2);
                                              if (motionEvent2 != motionEvent) {
                                                 motionEvent2.recycle();
                                              }
                                           }
                                        }
                                     }
                                  }
                                  f1 = Float.MIN_VALUE;
                                  goto label_0199 ;
                               }else {
                                  goto label_02f3 ;
                               }
                               if (oobject.v != null) {
                                  s = oobject.s;
                                  if (s != null) {
                                     s.onTouchEvent(oobject, motionEvent);
                                  }
                               }
                               motionEvent.setLocation(x, f);
                               b = true;
                               i1 = 6;
                               if (actionMasked1 == b || actionMasked1 == i1) {
                                  int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                                  uob = oobject.a;
                                  i3 = -1;
                                  if (uob[pointerId] != i3) {
                                     uob[pointerId] = i3;
                                     pointerId = oobject.b + i3;
                                     oobject.b = pointerId;
                                  label_031e :
                                     actionIndex = actionIndex + 1;
                                     i = 0.00f;
                                     f = 0.00f;
                                     uob = 5;
                                     i2 = -1;
                                     i3 = 0;
                                  }
                               }else {
                               label_014e :
                                  i3 = -1;
                                  goto label_031e ;
                               }
                            }
                         }
                      }
                   }
                   view = null;
                   goto label_0140 ;
                   i = 2;
                   goto label_014e ;
                }
             }
             view = 1;
             goto label_0127 ;
          }
       }
       b1.j = false;
       if (b1.l != null && b1.k == null) {
          b1.b();
       }
       og.f = false;
       return og.e;
    }
    public ViewGroup b(){
       return this.d;
    }
    public void c(boolean p0){
       if (this.b != null && this.f == null) {
          this.f();
       }
       return;
    }
    public void d(boolean p0){
       this.h = p0;
    }
    public void e(){
       StringBuilder str = "[GESTURE HANDLER] Tearing down gesture handler registered for root view "+this.d;
       RNGestureHandlerModule nativeModule = this.a.getNativeModule(RNGestureHandlerModule.class);
       nativeModule.getRegistry().d(this.c.l());
       nativeModule.unregisterRootHelper(this);
    }
    public void f(){
       g tc = this.c;
       if (tc != null && tc.k() == 2) {
          this.c.a();
          this.c.e();
       }
       return;
    }
}

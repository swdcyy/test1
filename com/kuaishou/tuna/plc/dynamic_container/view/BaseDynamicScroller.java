package com.kuaishou.tuna.plc.dynamic_container.view.BaseDynamicScroller;
import ny4.b;
import com.kuaishou.tuna.plc.dynamic_container.view.BaseDynamicScroller$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import java.lang.Object;
import com.kuaishou.tuna.plc.dynamic_container.view.BaseDynamicScroller$mTouchSlop$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import iy4.b;
import android.view.View;
import java.util.concurrent.LinkedBlockingQueue;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import java.lang.Math;
import hy4.a;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.lang.Throwable;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import android.view.VelocityTracker;
import js6.a;
import java.lang.Number;

public abstract class BaseDynamicScroller implements b	// class@001002
{
    public PlcDynamicContainerLayout a;
    public a b;
    public View c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public int i;
    public float j;
    public int k;
    public int l;
    public int m;
    public VelocityTracker n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final p r;
    public final PlcDynamicContainerConfig s;
    public static final BaseDynamicScroller$a t;

    static {
       BaseDynamicScroller.t = new BaseDynamicScroller$a(null);
    }
    public void BaseDynamicScroller(PlcDynamicContainerConfig p0){
       super();
       this.s = p0;
       this.d = true;
       this.e = 0xbf800000;
       this.f = 0xbf800000;
       this.i = -1;
       this.j = 0xbf800000;
       this.k = 4;
       this.l = 3;
       this.m = -1;
       this.r = s.c(BaseDynamicScroller$mTouchSlop$2.INSTANCE);
    }
    public boolean a(MotionEvent p0){
       BaseDynamicScroller obj1;
       int b1;
       BaseDynamicScroller ta;
       b uob;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseDynamicScroller uBaseDynamic = BaseDynamicScroller.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, uBaseDynamic, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getActionMasked()) {
          this.p = this.q;
       }
       boolean b = false;
       if (this.p != null) {
          return b;
       }else {
          obj = null;
          int i = -1;
          if (!PatchProxy.applyVoid(obj, this, uBaseDynamic, "11")) {
             obj1 = this.a;
             if (obj1 != null) {
                String str = (obj1.getChildCount() <= 0 || (this.c == null || this.d != null))? 1: null;
                if (!str) {
                   Object[] objArray = obj;
                }
                if (obj1 != null) {
                   ViewGroup viewGroup = this.f(obj1);
                   if (!PatchProxy.applyVoidOneRefs(viewGroup, this, uBaseDynamic, "12") && this.c == null) {
                      b uob2 = this.g();
                      View view = (uob2 != null)? uob2.d(): obj;
                      this.c = view;
                      if (view != null) {
                         this.d = b;
                      }else {
                         LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
                         linkedBlocki.offer(this.f(viewGroup));
                         while (!linkedBlocki.isEmpty()) {
                            View view1 = linkedBlocki.poll();
                            Object obj2 = PatchProxy.applyOneRefs(view1, this, uBaseDynamic, "14");
                            if (obj2 != patchProxyRe) {
                               b2 = obj2.booleanValue();
                            }else {
                               obj2 = PatchProxy.applyOneRefs(view1, this, uBaseDynamic, "15");
                               if (obj2 != patchProxyRe) {
                                  b2 = obj2.booleanValue();
                               }else if(view1 != null){
                                  b2 = view1.canScrollVertically(i);
                               }else {
                                  b2 = false;
                               }
                               if (!b2) {
                                  obj2 = PatchProxy.applyOneRefs(view1, this, uBaseDynamic, "16");
                                  if (obj2 != patchProxyRe) {
                                     b2 = obj2.booleanValue();
                                  }else if(view1 != null){
                                     b2 = view1.canScrollVertically(true);
                                  }else {
                                     b2 = false;
                                  }
                                  if (!b2) {
                                     b2 = false;
                                  }
                               }
                               b2 = true;
                            }
                            if (b2) {
                               this.c = view1;
                               break ;
                            }else if(view1 instanceof ViewGroup){
                               b2 = view1.getChildCount();
                               for (int i6 = 0; i6 < b2; i6 = i6 + 1) {
                                  linkedBlocki.offer(view1.getChildAt(i6));
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          obj1 = PatchProxy.applyOneRefs(p0, this, uBaseDynamic, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             ta = this.s;
             PlcDynamicContainerStyle containerSty = (ta != null)? ta.getContainerStyle(): obj;
             if (containerSty == null || this.b == null) {
                this.j(b);
             }else {
                containerSty = this.s.getContainerStyle();
                a.m(containerSty);
                obj1 = this.b;
                a.m(obj1);
                int i1 = p0.getAction() & 0x00ff;
                if (i1) {
                   boolean i2 = 3;
                   if (i1 != 1) {
                      int i3 = 2;
                      if (i1 != i3) {
                         if (i1 == i2) {
                         label_01e7 :
                            this.l = i2;
                         }
                      }else if(p0.getPointerId(b) != this.m){
                         this.l = i3;
                         float f = p0.getX() - this.e;
                         float f1 = p0.getY() - this.f;
                         float f2 = Math.abs(f);
                         float f3 = Math.abs(f1);
                         int i4 = (f2 - f3 > 0 && f2 - (float)this.h() > 0)? 1: 0;
                         f2 = (f2 - f3 < 0 && f3 - (float)this.h() > 0)? 1: 0;
                         int i5 = obj1.r7();
                         if (f2) {
                            uBaseDynamic = this.b;
                            if (uBaseDynamic != null && uBaseDynamic.fe() == true) {
                               PlcDynamicLogger.a("收起键盘，不处理onTouch事件");
                               this.o = true;
                               b1 = true;
                            }else if(f1 - (float)b < 0){
                               i = 1;
                            }
                            try{
                               uob = this.g();
                               if (uob != null) {
                                  MotionEvent motionEvent = MotionEvent.obtain(p0);
                                  a.o(motionEvent, "MotionEvent.obtain\(event\)");
                                  i2 = uob.g(i5, i, f3, motionEvent);
                               label_01b1 :
                                  if (!i2) {
                                     b1 = this.l(f1, p0, containerSty);
                                     this.j(b1);
                                  }
                               }
                            }catch(java.lang.Exception e1){
                               PlcDynamicLogger.j("request biz container handle touch crash!", e1);
                            }
                            i2 = false;
                            goto label_01b1 ;
                         }else if(i4){
                            if (f - (float)b < 0) {
                               i3 = -2;
                            }
                            try{
                               uob = this.g();
                               if (uob != null) {
                                  MotionEvent motionEvent1 = MotionEvent.obtain(p0);
                                  a.o(motionEvent1, "MotionEvent.obtain\(event\)");
                                  i2 = uob.g(i5, i3, f3, motionEvent1);
                               label_01db :
                                  if (!i2) {
                                     b1 = this.k(f1, p0, containerSty);
                                     this.j(b1);
                                  }
                               }
                            }catch(java.lang.Exception e1){
                               PlcDynamicLogger.j("request biz container handle touch crash!", e1);
                            }
                            i2 = false;
                            goto label_01db ;
                         }
                      }
                   }else {
                      goto label_01e7 ;
                   }
                }else {
                   this.h = b;
                   this.o = b;
                   this.e = p0.getX();
                   this.f = p0.getY();
                   ta = this.a;
                   float translationY = (ta != null)? ta.getTranslationY(): 0xbf800000;
                   this.j = translationY;
                   ta = this.a;
                   b1 = (ta != null)? ta.getFixedDragStatus(): 4;
                   this.k = b1;
                   b uob1 = this.g();
                   if (uob1 != null) {
                      i = uob1.b(this.c);
                   }
                   this.i = i;
                   this.l = 1;
                   this.m = p0.getPointerId(b);
                   if (!PatchProxy.applyVoid(obj, this, uBaseDynamic, "8") && this.n == null) {
                      this.n = VelocityTracker.obtain();
                      PlcDynamicLogger.a("velocityTracker createVelocityTrackerIfNeed");
                   }
                   this.e(p0);
                }
             }
          label_01e5 :
             b1 = false;
          }
          if (b1) {
             PlcDynamicLogger.a("intercept touchEvent");
             b = true;
          }else {
             PlcDynamicLogger.a("not intercept touchEvent");
             ta = this.a;
             if (ta != null) {
                b = ta.h(p0);
             }
          }
          return b;
       }
    }
    public void b(PlcDynamicContainerLayout p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseDynamicScroller.class, "2")) {
          return;
       }
       a.p(p0, "target");
       a.p(p1, "container");
       this.a = p0;
       this.b = p1;
       return;
    }
    public void c(boolean p0){
       if (p0) {
          this.p = true;
       }
       this.q = p0;
       return;
    }
    public void d(){
       this.d = true;
       this.c = null;
    }
    public void dispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDynamicScroller.class, "5")) {
          return;
       }
       a.p(p0, "event");
       b uob = this.g();
       if (uob != null) {
          uob.dispatchTouchEvent(p0);
       }
       return;
    }
    public final void e(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDynamicScroller.class, "6")) {
          return;
       }
       if (this.n != null) {
          p0 = MotionEvent.obtain(p0);
          BaseDynamicScroller ta = this.a;
          float translationY = (ta != null)? ta.getTranslationY(): 0;
          p0.offsetLocation(0, translationY);
          ta = this.n;
          if (ta != null) {
             ta.addMovement(p0);
          }
       }
       return;
    }
    public final ViewGroup f(ViewGroup p0){
       View view;
       LinkedBlockingQueue obj = PatchProxy.applyOneRefs(p0, this, BaseDynamicScroller.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedBlockingQueue();
       obj.offer(p0);
       while (true) {
          if (obj.isEmpty()) {
             return p0;
          }
          view = obj.poll();
          if (view instanceof ViewGroup) {
             BaseDynamicScroller ts = this.s;
             int i = 0;
             boolean type = (ts != null)? ts.getType(): 0;
             type = (type != 2)? 1: a.b.XD(view);
             if (type) {
                break ;
             }else {
                type = view.getChildCount();
                for (; i < type; i = i + 1) {
                   obj.offer(view.getChildAt(i));
                }
             }
          }
       }
       return view;
    }
    public final b g(){
       Object[] objArray = null;
       BaseDynamicScroller obj = PatchProxy.apply(objArray, this, BaseDynamicScroller.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.Ge();
       }
       return objArray;
    }
    public final int h(){
       Object obj = PatchProxy.apply(null, this, BaseDynamicScroller.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.r.getValue();
       }
       return obj.intValue();
    }
    public abstract boolean i(MotionEvent p0);
    public final void j(boolean p0){
       if (this.h == null) {
          this.h = true;
          this.g = p0;
       }
       return;
    }
    public abstract boolean k(float p0,MotionEvent p1,PlcDynamicContainerStyle p2);
    public abstract boolean l(float p0,MotionEvent p1,PlcDynamicContainerStyle p2);
    public boolean onTouchEvent(MotionEvent p0){
       BaseDynamicScroller obj = PatchProxy.applyOneRefs(p0, this, BaseDynamicScroller.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       boolean b = false;
       if (this.p != null) {
          obj = this.a;
          if (obj != null) {
             b = obj.i(p0);
          }
          return b;
       }else {
          int i = 0xbf800000;
          obj = (this.e - i && (!this.f - i || this.g == null))? 1: null;
          if (obj || this.l == 3) {
             return b;
          }else if(p0.getPointerId(b) != this.m){
             PlcDynamicLogger.a("不是按下的手指， 不处理手势");
             return b;
          }else if(this.o != null){
             BaseDynamicScroller tb = this.b;
             if (tb != null && tb.fe() == true) {
                tb = this.b;
                if (tb != null) {
                   tb.p2();
                }
             }
             return true;
          }else {
             this.e(p0);
             int i1 = p0.getAction() & 0x00ff;
             if (i1 == 1 || i1 == 3) {
                this.l = 3;
             }
             this.i(p0);
             return true;
          }
       }
    }
}

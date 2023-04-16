package com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import ml8.d;
import lf0.c;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kf0.e;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.MotionEvent;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import je0.a$a;
import je0.a;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import com.yxcorp.utility.TextUtils;
import kf0.t;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import android.widget.FrameLayout;
import rkd.b;
import gf0.a;
import java.lang.Float;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import k2b.u1;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant$onInterceptTouchEvent$1;
import android.view.ViewParent;
import java.lang.Math;
import msd.l;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant$onTouchEvent$1;
import kf0.s;
import java.lang.Number;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.n;
import android.app.Activity;
import e3a.a;
import lnc.a1;
import ekd.i;
import ekd.p1;
import je0.c;
import android.widget.Scroller;
import java.lang.Runnable;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;

public abstract class KemTaskPendant extends KwaiFixedScreenWidthFrameLayout implements d, c	// class@0006e1
{
    public TaskCommonParams c;
    public TaskPendantConfig d;
    public TaskUIConfig e;
    public e f;
    public static final KemTaskPendant$a g;

    static {
       KemTaskPendant.g = new KemTaskPendant$a(null);
    }
    public void KemTaskPendant(Context p0){
       a.p(p0, "context");
       super(p0, true);
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "7")) {
       }else {
          this.f = new e(p0, this);
          a.d(p0, this.getLayoutResourceId(), this, true);
          this.doBindView(this);
       }
       return;
    }
    public static final boolean n(KemTaskPendant p0,MotionEvent p1){
       return super.onInterceptTouchEvent(p1);
    }
    public static final boolean o(KemTaskPendant p0,MotionEvent p1){
       return super.onTouchEvent(p1);
    }
    public void a(){
       t a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KemTaskPendant.class, "15")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "KemTaskPendant", "onMoveDone", false, 4, null);
       KemTaskPendant tf = this.f;
       if (tf == null) {
          a.S("mPendantTouchHandler");
       }
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, e.class, "8")) {
          Iterator iterator = tf.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(tf.j);
          }
       }
       tf = this.c;
       String str = "mParams";
       if (tf == null) {
          a.S(str);
       }
       String mActivityId = tf.getMActivityId();
       KemTaskPendant tc = this.c;
       if (tc == null) {
          a.S(str);
       }
       mActivityId = TextUtils.i(mActivityId, tc.getMTaskToken());
       a = t.a;
       TaskPendantCommonParams taskPendantC = a.a(mActivityId);
       taskPendantC.setMPendantX((int)this.getX());
       taskPendantC.setMPendantY((int)this.getY());
       if (b.g()) {
          taskPendantC.updatePendantYRatio();
       }
       a.c(mActivityId, taskPendantC);
       if (!PatchProxy.applyVoid(objArray, this, KemTaskPendant.class, "16")) {
          TaskCommonParams params = this.getParams();
          a a1 = a.a;
          float x = this.getX();
          float y = this.getY();
          Objects.requireNonNull(a1);
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(params, Float.valueOf(x), Float.valueOf(y), a1, a.class, "4")) {
             a.p(params, "taskParams");
             ClickMetaData uClickMetaDa = new ClickMetaData();
             uClickMetaDa.setType(1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OP_ACTIVITY_DRAG_NEW_TASK_PENDANT";
             uElementPack.params = a1.a(params, x, y).e();
             uClickMetaDa.setElementPackage(uElementPack);
             u1.B(uClickMetaDa);
          }
       }
       return;
    }
    public void b(float p0){
    }
    public void c(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "22")) {
          return;
       }
       a.p(p0, "response");
       return;
    }
    public boolean d(){
       KemTaskPendant obj = PatchProxy.apply(null, this, KemTaskPendant.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj == null) {
          a.S("mPendantTouchHandler");
       }
       return obj.h;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "11")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public void e(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "20")) {
          return;
       }
       String str = "moveCallback";
       a.p(p0, str);
       KemTaskPendant tf = this.f;
       if (tf == null) {
          a.S("mPendantTouchHandler");
       }
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, e.class, "10")) {
          a.p(p0, str);
          tf.a.remove(p0);
       }
       return;
    }
    public abstract int getLayoutResourceId();
    public final TaskCommonParams getMParams(){
       KemTaskPendant obj = PatchProxy.apply(null, this, KemTaskPendant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mParams");
       }
       return obj;
    }
    public final TaskPendantConfig getMPendantConfig(){
       KemTaskPendant obj = PatchProxy.apply(null, this, KemTaskPendant.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mPendantConfig");
       }
       return obj;
    }
    public final TaskUIConfig getMUiConfig(){
       KemTaskPendant obj = PatchProxy.apply(null, this, KemTaskPendant.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mUiConfig");
       }
       return obj;
    }
    public final TaskCommonParams getParams(){
       KemTaskPendant obj = PatchProxy.apply(null, this, KemTaskPendant.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mParams");
       }
       return obj;
    }
    public View getView(){
       return this;
    }
    public void h(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KemTaskPendant.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KemTaskPendant.class, "14")) {
          return;
       }
       KemTaskPendant tf = this.f;
       if (tf == null) {
          a.S("mPendantTouchHandler");
       }
       tf.b((p2 - p0), (p3 - p1));
       return;
    }
    public boolean l(){
       ViewGroup$LayoutParams obj = PatchProxy.apply(null, this, KemTaskPendant.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getLayoutParams();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       boolean b = (obj.gravity == 3)? true: false;
       return b;
    }
    public void m(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "19")) {
          return;
       }
       String str = "moveCallback";
       a.p(p0, str);
       KemTaskPendant tf = this.f;
       if (tf == null) {
          a.S("mPendantTouchHandler");
       }
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, e.class, "9")) {
          a.p(p0, str);
          if (!tf.a.contains(p0)) {
             tf.a.add(p0);
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, KemTaskPendant.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "event";
       a.p(p0, obj);
       KemTaskPendant tf = this.f;
       if (tf == null) {
          a.S("mPendantTouchHandler");
       }
       KemTaskPendant$onInterceptTouchEvent$1 oonIntercept = new KemTaskPendant$onInterceptTouchEvent$1(this);
       Objects.requireNonNull(tf);
       Object obj1 = PatchProxy.applyTwoRefs(p0, oonIntercept, tf, e.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          a.p(oonIntercept, "superFunc");
          ViewParent parent = tf.j.getParent();
          boolean b1 = true;
          if (parent != null) {
             parent.requestDisallowInterceptTouchEvent(b1);
          }
          int action = p0.getAction();
          int i = (int)p0.getRawX();
          int i1 = (int)p0.getRawY();
          if (action) {
             if (action == 2) {
                int i2 = i1 - tf.e;
                if (Math.abs((i - tf.d)) > tf.c || Math.abs(i2) > tf.c) {
                   b = true;
                }else {
                   tf.f = i;
                   tf.g = i1;
                }
             }
          }else if(tf.a(p0.getX(), p0.getY())){
             tf.d = i;
             tf.e = i1;
             tf.f = i;
             tf.g = i1;
          }
          b = oonIntercept.invoke(p0).booleanValue();
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b;
       int i2;
       int i3;
       Object obj = this;
       Object[] obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, KemTaskPendant.class, "13");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = "event";
       a.p(obj1, obj2);
       KemTaskPendant f = obj.f;
       if (f == null) {
          a.S("mPendantTouchHandler");
       }
       KemTaskPendant$onTouchEvent$1 oonTouchEven = new KemTaskPendant$onTouchEvent$1(obj);
       Objects.requireNonNull(f);
       e uoe = e.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, oonTouchEven, f, uoe, "2");
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          a.p(obj1, obj2);
          a.p(oonTouchEven, "superFunc");
          boolean b1 = true;
          f.j.requestDisallowInterceptTouchEvent(b1);
          int action = p0.getAction();
          int i = (int)p0.getRawX();
          int i1 = (int)p0.getRawY();
          if (action) {
             if (action != b1) {
                if (action != 2) {
                   if (action == 3) {
                   label_0093 :
                      if (f.h != null) {
                         obj1 = null;
                         if (!PatchProxy.applyVoid(obj1, f, uoe, "11")) {
                            s d = s.d;
                            Objects.requireNonNull(d);
                            e obj4 = PatchProxy.apply(obj1, d, s.class, "1");
                            if (obj4 != patchProxyRe) {
                               i2 = obj4.intValue();
                            }else if(!s.a || b.g()){
                               s.a = n.y(a.b());
                            }
                            i2 = s.a;
                            i2 = (f.j.getX() - (float)((i2 - f.j.getWidth()) / 2) < 0)? 0: i2 - f.j.getWidth();
                            if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), f, uoe, "6")) {
                               Object obj5 = PatchProxy.apply(obj1, f, uoe, "5");
                               if (obj5 != patchProxyRe) {
                                  b = obj5.intValue();
                               }else {
                                  b = d.c();
                                  Activity uActivity = a.b(f.i);
                                  action = n.q(uActivity);
                                  int i4 = a1.d(R.dimen.arg_RES_7f070c44);
                                  if (uActivity != null && i.e(uActivity)) {
                                     i4 = i4 + p1.f(f.i);
                                  }
                                  i3 = a1.d(0x7f070c43) + i4;
                                  b = (b - action) - f.j.getHeight();
                                  action = (int)f.j.getY();
                                  if (action <= b) {
                                     if (action < i3) {
                                        b = i3;
                                     }else {
                                        b = action;
                                     }
                                  }
                               }
                               b = (int)((float)b - f.j.getY());
                               i3 = (int)((float)i2 - f.j.getX());
                               action = (int)((float)250 * (((float)Math.abs(i3) * 0x3f800000) / (float)800));
                               obj4 = f.b;
                               Objects.requireNonNull(obj4);
                               if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i3), Integer.valueOf(b), Integer.valueOf(action), obj4, c.class, "2")) {
                                  if (PatchProxy.isSupport(c.class)) {
                                     Object[] objArray = new Object[]{Integer.valueOf(false),Integer.valueOf(false),Integer.valueOf(i3),Integer.valueOf(b),Integer.valueOf(action)};
                                     if (!PatchProxy.applyVoid(objArray, obj4, c.class, "4")) {
                                     }
                                  }else {
                                  }
                               }
                            }
                         }
                      }else {
                         b1 = oonTouchEven.invoke(obj1).booleanValue();
                      }
                   label_0201 :
                      f.h = false;
                      b = b1;
                   }
                }else {
                   i3 = i1 - f.e;
                   action = i - f.f;
                   i2 = i1 - f.g;
                   if (Math.abs((i - f.d)) > f.c || Math.abs(i3) > f.c) {
                      f.h = b1;
                      f.b(action, i2);
                   }
                   f.f = i;
                   f.g = i1;
                }
             }else {
                goto label_0093 ;
             }
          }else {
             f.h = false;
             if (f.a(p0.getX(), p0.getY())) {
                f.d = i;
                f.e = i1;
                f.f = i;
                f.g = i1;
                b = oonTouchEven.invoke(obj1).booleanValue();
             }
          }
          b = false;
       }
       return b;
    }
    public void p(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "8")) {
          return;
       }
       a.p(p0, "params");
       this.c = p0;
       TaskPendantConfig mPendantConf = p0.getMPendantConfig();
       a.m(mPendantConf);
       this.d = mPendantConf;
       if (mPendantConf == null) {
          a.S("mPendantConfig");
       }
       TaskUIConfig mUiConfig = mPendantConf.getMUiConfig();
       a.m(mUiConfig);
       this.e = mUiConfig;
       if (!PatchProxy.applyVoid(null, this, KemTaskPendant.class, "9") && TaskCenterDTHelper.d.a().c()) {
          KemTaskPendant tc = this.c;
          if (tc == null) {
             a.S("mParams");
          }
          if (tc.getMIsFallback()) {
             this.setBackgroundColor(-7829368);
          }
       }
    label_0058 :
       return;
    }
    public void setHorizontallyEdgeLocation(boolean p0){
       t a;
       if (PatchProxy.isSupport(KemTaskPendant.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KemTaskPendant.class, "18")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       int i = (p0)? 3: 5;
       layoutParams.gravity = i;
       this.setLayoutParams(layoutParams);
       KemTaskPendant tc = this.c;
       String str = "mParams";
       if (tc == null) {
          a.S(str);
       }
       String mActivityId = tc.getMActivityId();
       KemTaskPendant tc1 = this.c;
       if (tc1 == null) {
          a.S(str);
       }
       mActivityId = TextUtils.i(mActivityId, tc1.getMTaskToken());
       a = t.a;
       TaskPendantCommonParams taskPendantC = a.a(mActivityId);
       taskPendantC.setMPendantX(Integer.MAX_VALUE);
       a.c(mActivityId, taskPendantC);
       return;
    }
    public final void setMParams(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setMPendantConfig(TaskPendantConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void setMUiConfig(TaskUIConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemTaskPendant.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
}

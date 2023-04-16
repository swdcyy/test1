package ef0.a;
import je0.a$a;
import cg0.a;
import ef0.a$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import je0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Float;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import gf0.a;
import java.util.Set;
import java.util.Map$Entry;
import android.app.Activity;
import android.view.ViewGroup;
import ef0.a$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.rx.RxBus;
import zt5.c;
import ig0.c;
import java.lang.CharSequence;
import zsd.u;
import e17.i;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import hg0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import hg0.b;
import kf0.r;
import tkd.b;
import tkd.d;
import pt5.a;
import lf0.d;
import android.text.TextUtils;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import ge0.c;
import rx4.i;
import sx4.f;
import ce0.b;
import q87.c;
import ge0.b;
import tx4.f;
import com.kuaishou.tk.api.a;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import android.content.Context;
import com.kuaishou.growth.pendant.task.widget.ActivityTaskPendant;
import brd.t;
import ef0.b;
import ef0.c;
import erd.g;
import crd.b;
import com.yxcorp.utility.TextUtils;
import kf0.t;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import java.lang.Number;
import rkd.b;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.n;
import lnc.a1;
import kf0.s;
import os5.l;
import ekd.i;
import ekd.p1;
import android.view.ViewGroup$LayoutParams;
import vt5.a;
import au5.b;
import wkd.b;
import hf0.a;
import tjc.c;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import df0.b;
import java.lang.ref.WeakReference;
import mrd.a;
import zt5.d;
import ef0.a$c;

public final class a implements a$a, a	// class@00213e
{
    public final Map a;
    public boolean b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(){
       super();
       this.a = new HashMap();
    }
    public void a(a p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       a.p(p0, "view");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantDelegateImpl", "onPendantMoveDone "+p0, false, 4, null);
       Iterator iterator = new ArrayList(this.a.values()).iterator();
       while (iterator.hasNext()) {
          KemTaskPendant kemTaskPenda = iterator.next();
          if (kemTaskPenda != null && kemTaskPenda != p0) {
             view = p0.getView();
             a.o(view, "view.view");
             kemTaskPenda.setX(view.getX());
             view = p0.getView();
             a.o(view, "view.view");
             kemTaskPenda.setY(view.getY());
          }
       }
       return;
    }
    public void b(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(TaskReportResponse p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       a.p(p0, "response");
       KemTaskPendant kemTaskPenda = null;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          KemTaskPendant kemTaskPenda1 = iterator.next();
          kemTaskPenda1.c(p0);
          if (kemTaskPenda == null) {
             kemTaskPenda = kemTaskPenda1;
          }
       }
       if (!p0.getMTaskCompleted() || (kemTaskPenda != null && !PatchProxy.applyVoidOneRefs(kemTaskPenda, this, uoa, "3"))) {
          a.a.d(kemTaskPenda.getParams(), kemTaskPenda.getX(), kemTaskPenda.getY());
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Activity key = uEntry.getKey();
          KemTaskPendant value = uEntry.getValue();
          ViewGroup viewGroup = this.j(key);
          if (viewGroup != null) {
             viewGroup.post(new a$b(viewGroup, value));
          }
       }
       a ta = this.a;
       RxBus rxBus = (ta == null || ta.isEmpty())? 1: null;
       if (!rxBus) {
          RxBus.f.b(new c(c.a.c()));
       }
       this.a.clear();
       return;
    }
    public void e(TaskReportResponse p0,TaskCommonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "17")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "params");
       String mToast = p0.getMToast();
       mToast = (mToast == null || u.S1(mToast))? 1: 0;
       if (!mToast) {
          String mToast1 = p0.getMToast();
          a.m(mToast1);
          i.d(R.style.arg_RES_7f11066a, mToast1);
       }
       return;
    }
    public boolean f(RxFragmentActivity p0,a p1,TaskCommonParams p2,int p3,String p4,String p5,boolean p6){
       String obj;
       String str2;
       String str3;
       int b2;
       TaskPendantConfig obj1;
       Object obj2;
       TaskUIConfig taskUIConfig;
       t a;
       TaskUIConfig this;
       boolean i4;
       TaskPendantDTHelper c;
       boolean i6;
       TaskPendantCommonParams taskPendantC2;
       boolean b = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       boolean b1 = p6;
       int i = 5;
       int i1 = 3;
       boolean i2 = 0;
       int i3 = 1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),oobject3,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, b, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = "activity";
       a.p(oobject, str);
       a.p(oobject1, "pendantTask");
       a.p(oobject2, "param");
       String str1 = "6";
       if (p5 == null) {
          Objects.requireNonNull(p1);
          obj = PatchProxy.applyOneRefs(oobject, oobject1, b.class, str1);
          if (obj != PatchProxyResult.class) {
          }else if(oobject == null){
             obj = null;
          }else {
             obj = oobject1.b.get(Integer.valueOf(p0.hashCode()));
          }
       }else {
          obj = p5;
       }
       if (p2.isTaskComplete() || !r.a(oobject, oobject2, p3, oobject3, obj)) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantDelegateImpl", "task: "+p2.getMTaskTypeId()+" did not show pendant", null, 4, 0);
          if (!this.h(p0)) {
             RxBus.f.b(new c(c.a.c()));
          }
          return false;
       }else {
          d.a(0x60b9226c).nA(oobject, "TaskPendantDelegate showPendantIfNeed");
          if (PatchProxy.isSupport(a.class)) {
             str2 = str;
             str3 = str1;
             i = 0;
             if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p6), this, a.class, "5")) {
             label_00c9 :
                this.h(p0);
                if (PatchProxy.isSupport(a.class)) {
                   obj1 = PatchProxy.applyThreeRefs(p0, p2, Boolean.valueOf(p6), this, a.class, "8");
                   if (obj1 != PatchProxyResult.class) {
                      obj2 = obj1;
                      taskUIConfig = null;
                   label_0248 :
                      if (obj2 != null) {
                         b.a.put(oobject, obj2);
                         if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(p2, Boolean.valueOf(p6), obj2, this, a.class, "9")) {
                            oobject2.setMIsFromTkError(b1);
                            oobject2.setMIsTK(obj2 instanceof TkActivityTaskPendant);
                         }
                         if (!PatchProxy.applyVoidOneRefs(oobject, b, a.class, "13")) {
                            p0.m().subscribe(new b(b, oobject), c.b);
                         }
                         a = t.a;
                         TaskPendantCommonParams taskPendantC = a.a(TextUtils.i(p2.getMActivityId(), p2.getMTaskToken()));
                         FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                         obj1 = p2.getMPendantConfig();
                         this = (obj1 != null)? obj1.getMUiConfig(): taskUIConfig;
                         String obj3 = PatchProxy.applyTwoRefs(taskPendantC, this, b, a.class, "10");
                         TaskPendantCommonParams obj4 = Integer.MIN_VALUE;
                         if (obj3 != PatchProxyResult.class) {
                            i4 = obj3.intValue();
                         }else if(taskPendantC.getMPendantX() == obj4){
                            if (this != null && this.getMInitSide() == 1) {
                            label_02d3 :
                               i4 = 5;
                            }
                         }else if(taskPendantC.getMPendantX() > 0){
                            goto label_02d3 ;
                         }
                         i4 = 3;
                         layoutParams.gravity = i4;
                         obj1 = p2.getMPendantConfig();
                         if (obj1 != null) {
                            taskUIConfig = obj1.getMUiConfig();
                         }
                         FrameLayout$LayoutParams layoutParams1 = layoutParams;
                         TaskPendantCommonParams taskPendantC1 = taskPendantC;
                         obj3 = PatchProxy.applyThreeRefs(p0, taskPendantC, taskUIConfig, this, a.class, "11");
                         if (obj3 != PatchProxyResult.class) {
                            i4 = obj3.intValue();
                         }else if(taskPendantC1.getMPendantY() != Integer.MIN_VALUE){
                            if (b.g() && taskPendantC1.getMPendantYRatio() - (float)0 > 0) {
                               i4 = n.u(a.b());
                               b2 = (int)(taskPendantC1.getMPendantYRatio() * (float)i4);
                               i6 = 0x7f070c3f;
                               if (b2 > (i4 - a1.d(i6))) {
                                  b2 = i4 - a1.d(i6);
                               }
                               taskPendantC2 = taskPendantC1;
                               taskPendantC2.setMPendantY(b2);
                            }else {
                               taskPendantC2 = taskPendantC1;
                            }
                            i4 = taskPendantC2.getMPendantY();
                         }else if(taskUIConfig != null && taskUIConfig.getMInitY() > 0){
                            i4 = s.d.a((float)taskUIConfig.getMInitY());
                         }else if(d.a(-1492894991).Ur(oobject)){
                            i4 = a1.d(R.dimen.arg_RES_7f070c40);
                         }else {
                            i4 = a1.d(R.dimen.arg_RES_7f070c44);
                         }
                         i4 = i4 + a1.d(0x7f070c43);
                         if (i.e(p0)) {
                            i4 = i4 + p1.f(p0);
                         }
                         FrameLayout$LayoutParams layoutParams2 = layoutParams1;
                         layoutParams2.topMargin = i4;
                         if (b.g()) {
                            obj3 = TextUtils.i(p2.getMActivityId(), p2.getMTaskToken());
                            obj4 = a.a(obj3);
                            obj4.setMPendantY(layoutParams2.topMargin);
                            a.c(obj3, obj4);
                         }
                         ViewGroup viewGroup = this.j(p0);
                         if (viewGroup != null) {
                            viewGroup.addView(obj2, layoutParams2);
                         }
                         if (!PatchProxy.applyVoidTwoRefs(oobject, obj2, b, a.class, str3) && b.b == null) {
                            b.b = true;
                            if (!PatchProxy.applyVoidOneRefs(obj2, b, a.class, "7")) {
                               i4 = b.a().m2();
                               b2 = obj2.l();
                               TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantDelegateImpl", "handleActivePendantPos, isActivePendantLeft = "+i4+", pendantAtLeft = "+b2, false, 4, null);
                               View view = obj2.getView();
                               a.o(view, "pendant.view");
                               if (view.getLayoutParams() != null && b2 == i4) {
                                  obj2.setHorizontallyEdgeLocation((b2 ^ 1));
                               }
                            }
                         }
                         int i5 = (b.a(0x7fa4717b).E3(oobject) || b.a(-1608526086).S())? 1: 0;
                         b.g((i5 ^ 0x01));
                         b.b(p1.h());
                         c = TaskPendantDTHelper.c;
                         Objects.requireNonNull(c);
                         if (!PatchProxy.applyVoidOneRefs(obj2, c, TaskPendantDTHelper.class, "4")) {
                            a.p(obj2, "pendant");
                            if (!c.c()) {
                               c.a().a = new WeakReference(obj2);
                               c.b().onNext(Integer.valueOf(1));
                            label_0484 :
                               return b2;
                            }
                         }
                      }
                   }
                }
                d TkActivityTaskPendant this1 = d.a;
                Objects.requireNonNull(this1);
                if (PatchProxy.isSupport(d.class)) {
                   Object obj5 = PatchProxy.applyThreeRefs(p0, p2, Boolean.valueOf(p6), this1, d.class, "1");
                   if (obj5 != PatchProxyResult.class) {
                      this1 = obj5;
                      taskUIConfig = null;
                   }else {
                   label_0111 :
                      a.p(oobject, str2);
                      a.p(oobject2, "data");
                      if (TextUtils.isEmpty(p2.getMTaskTypeId()) || !p2.getMActivityTask()) {
                         taskUIConfig = null;
                      }else if(!b1){
                         obj1 = p2.getMPendantConfig();
                         String this11 = (obj1 != null)? obj1.getMTkBundleId(): null;
                         if (c.c(this11)) {
                            i2 = true;
                         label_0144 :
                            obj1 = p2.getMPendantConfig();
                            i4 = (obj1 != null)? obj1.getMOnlyTk(): false;
                            i4 = c.b(i4);
                            if (!i2) {
                               TaskPendantConfig mPendantConf = p2.getMPendantConfig();
                               this11 = (mPendantConf != null)? mPendantConf.getMTkBundleId(): null;
                               mPendantConf = (this11 == null || u.S1(this11))? 1: null;
                               if (!mPendantConf) {
                                  mPendantConf = p2.getMPendantConfig();
                                  this11 = (mPendantConf != null)? mPendantConf.getMTkBundleId(): null;
                                  c uoc = c.class;
                                  Object[] obj6 = null;
                                  if (PatchProxy.applyVoidOneRefs(this11, obj6, uoc, "3")) {
                                     taskUIConfig = obj6;
                                  label_01df :
                                     TaskCenterLogUtil b3 = TaskCenterLogUtil.b;
                                     obj = "createTaskPendant, fromTkError = "+b1+", tkAvailable = "+i2+", onlyTk = "+i4+", tk bundle id = ";
                                     TaskPendantConfig mPendantConf1 = p2.getMPendantConfig();
                                     this11 = (mPendantConf1 != null)? mPendantConf1.getMTkBundleId(): taskUIConfig;
                                     TaskCenterLogUtil.d(b3, "TaskPendantFactory", obj+this11, false, 4, null);
                                     if (i2) {
                                        this1 = new TkActivityTaskPendant(oobject);
                                     }else if(!i4){
                                        this1 = new ActivityTaskPendant(oobject);
                                     }
                                  }else {
                                     Object obj7 = PatchProxy.applyOneRefs(this11, obj6, uoc, "4");
                                     i6 = (obj7 != PatchProxyResult.class)? obj7.booleanValue(): d.a(0x256720e1).S(this11);
                                     if (!i6 && (!PatchProxy.applyVoidTwoRefs(this11, null, null, uoc, "5") && !TextUtils.isEmpty(this11))) {
                                        obj6 = new Object[i];
                                        b.C().s("TkUtils", "asyncCompileBundle bundleId:"+this11, obj6);
                                        taskUIConfig = null;
                                        a.a(this11, -1, true, new b(this11, taskUIConfig));
                                        goto label_01df ;
                                     }
                                  }
                               }
                            }
                         label_01de :
                            taskUIConfig = null;
                            goto label_01df ;
                         }
                      }
                      i2 = false;
                      goto label_0144 ;
                      this1 = taskUIConfig;
                   }
                }else {
                   goto label_0111 ;
                }
                if (this1 != null) {
                   this1.setId(R.id.kem_activity_task_pendant);
                   this1.setTag(p2.getMTaskToken());
                   this1.p(oobject2);
                   this1.m(b);
                }
                obj2 = this1;
                goto label_0248 ;
             }
          }else {
             str3 = str1;
             str2 = str;
             i = 0;
             goto label_00c9 ;
          }
          b2 = true;
          goto label_0484 ;
       }
    }
    public void g(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "16")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          KemTaskPendant kemTaskPenda = iterator.next();
          int i = (p0)? 0: 8;
          kemTaskPenda.setVisibility(i);
       }
       String str = c.a.c();
       RxBus f = RxBus.f;
       d uod = (p0)? new d(str): new c(str);
       f.b(uod);
       return;
    }
    public boolean h(RxFragmentActivity p0){
       KemTaskPendant obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       obj = this.a.remove(p0);
       if (obj == null) {
          return false;
       }
       obj.setVisibility(8);
       ViewGroup viewGroup = this.j(p0);
       if (viewGroup != null) {
          viewGroup.post(new a$c(viewGroup, obj));
       }
       RxBus.f.b(new c(c.a.c()));
       return true;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       a.p(p0, "pendantView");
       return;
    }
    public final ViewGroup j(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x1020002);
    }
}

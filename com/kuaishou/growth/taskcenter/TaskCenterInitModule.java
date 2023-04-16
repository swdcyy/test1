package com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;
import wkd.b;
import fg0.l;
import hg0.b;
import gg0.a;
import android.app.Activity;
import crd.b;
import lnc.b9;
import b76.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.yxcorp.gifshow.util.rx.RxBus;
import sx4.g;
import brd.t;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$b;
import erd.g;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$c;
import eda.l;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$d;
import tkd.b;
import tkd.d;
import yt5.j;
import fg0.d;
import lnc.u1;
import zt5.d;
import t45.d;
import brd.z;
import fg0.b;
import zt5.c;
import fg0.c;
import com.kwai.framework.activitycontext.ActivityContext;
import fg0.g;
import java.util.Objects;
import zt5.b;
import fg0.e;
import zt5.a;
import fg0.f;
import android.os.Bundle;
import zca.r;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$e;
import zh5.b;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$f;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$g;
import java.util.concurrent.Callable;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule$h;
import io.reactivex.internal.functions.Functions;
import fg0.k;

public final class TaskCenterInitModule extends HomeCreateInitModule	// class@00072f
{
    public b q;
    public b r;
    public static final TaskCenterInitModule$a s;

    static {
       TaskCenterInitModule.s = new TaskCenterInitModule$a(null);
    }
    public void TaskCenterInitModule(){
       super();
    }
    public static void p0(TaskCenterInitModule p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.o0(p1, p2);
       return;
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, TaskCenterInitModule.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(CoreInitModule::class.java\)");
       return uArrayList;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, TaskCenterInitModule.class, "8")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob instanceof a) {
          uob.u();
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, TaskCenterInitModule.class, "7")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob instanceof a) {
          uob.w();
       }
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       b9.a(this.q);
       this.q = null;
       b9.a(this.r);
       this.r = null;
       return;
    }
    public void k0(a p0){
       g a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule.class, str)) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterInitModule", "onLaunchFinish", false, 4, null);
       this.n0();
       RxBus f = RxBus.f;
       f.f(g.class).subscribe(TaskCenterInitModule$b.b);
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new TaskCenterInitModule$c(this));
       t ot = f.g(l.class, mAIN);
       ot.subscribe(new TaskCenterInitModule$d(this));
       d.a(-1573231572).W1();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, str)) {
          u1.a(d.c);
          z a2 = d.a;
          f.f(d.class).observeOn(a2).subscribe(b.b);
          ot = f.f(c.class).observeOn(a2);
          ot.subscribe(c.b);
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          d.a = uActivityCon.h();
       }
       a = g.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, g.class, str)) {
          z a1 = d.a;
          f.f(b.class).observeOn(a1).subscribe(e.b);
          f.f(a.class).observeOn(a1).subscribe(f.b);
       }
       this.o0(true, true);
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TaskCenterInitModule.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       this.n0();
       return;
    }
    public void n(){
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, TaskCenterInitModule.class, "5")) {
          return;
       }
       if (this.q == null) {
          this.q = RxBus.f.g(r.class, RxBus$ThreadMode.MAIN).subscribe(new TaskCenterInitModule$e(this));
       }
       if (this.r == null) {
          this.r = RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new TaskCenterInitModule$f(this));
       }
       return;
    }
    public final void o0(boolean p0,boolean p1){
       if (PatchProxy.isSupport(TaskCenterInitModule.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, TaskCenterInitModule.class, "11")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (!qCurrentUser.isLogined()) {
          return;
       }
       t.fromCallable(new TaskCenterInitModule$g(p0)).subscribeOn(d.c).observeOn(d.a).subscribe(new TaskCenterInitModule$h(this, p1), Functions.d());
       return;
    }
    public final void onSafeLockEvent(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule.class, "9")) {
          return;
       }
       if (p0.a()) {
          b.a(-1524711258).f2();
          b.a(0x5832311c).a();
       }else {
          TaskCenterInitModule.p0(this, false, false, 2, null);
       }
       return;
    }
    public final void onVisitorModeEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule.class, "10")) {
          return;
       }
       if (p0.a()) {
          b.a(-1524711258).f2();
          b.a(0x5832311c).a();
       }else {
          TaskCenterInitModule.p0(this, false, false, 2, null);
       }
       return;
    }
}

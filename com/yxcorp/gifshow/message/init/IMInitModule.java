package com.yxcorp.gifshow.message.init.IMInitModule;
import com.kwai.framework.init.a;
import bc5.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import b76.a;
import hdb.h;
import java.lang.Runnable;
import ekd.k1;
import hdb.i;
import android.os.Handler;
import com.kwai.feature.api.social.message.dva.init.IMInitTaskDelay;
import ekd.e0;
import ca7.t;
import xv5.a;
import android.os.SystemClock;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import android.app.Application;
import hdb.o;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.message.init.s;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import o56.d;
import a75.a;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager;
import t45.d;
import hdb.j;
import crd.b;
import brd.z;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import eda.a;
import com.yxcorp.gifshow.message.init.RecordMessageUsage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.message.init.KLinkInitManager;
import hdb.e0;
import ekd.s1;
import java.lang.Integer;
import java.lang.reflect.Type;
import v4d.a;
import java.util.Iterator;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import hdb.e;
import erd.g;
import eda.n;
import hdb.f;
import eda.l;
import com.yxcorp.gifshow.message.init.a;
import zca.p;
import hdb.g;
import com.yxcorp.gifshow.message.init.IMInitModule$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.imsdk.m;
import java.util.Objects;
import com.kwai.imsdk.internal.client.t;
import l85.b;
import up6.f;
import com.kwai.chat.sdk.signal.f;
import com.kwai.imsdk.internal.util.c;
import java.util.concurrent.Future;
import f97.a;
import com.kwai.imsdk.c;
import org.greenrobot.eventbus.a;
import pp6.n;
import ih0.a$a;
import java.util.Set;
import nq6.s;
import pq6.a;
import java.lang.Iterable;
import com.kwai.imsdk.internal.client.r;
import java.util.concurrent.Callable;
import xp6.m;
import com.kwai.imsdk.internal.client.s;
import com.kwai.imsdk.internal.client.k;

public class IMInitModule extends a	// class@001220
{
    public boolean q;
    public Runnable r;
    public Handler s;
    public b t;
    public boolean u;
    public static boolean v;

    static {
       a.a().c(1);
    }
    public void IMInitModule(){
       super();
       this.q = true;
       this.r = null;
       this.s = null;
       this.u = true;
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, IMInitModule.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, IMInitModule.class, "12")) {
          return;
       }
       this.u = false;
       this.r0(false);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, IMInitModule.class, "11")) {
          return;
       }
       this.u = true;
       if (!SystemUtil.L(a.B) || this.g0()) {
          this.r0(this.u);
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMInitModule.class, "3")) {
          return;
       }
       if (SystemUtil.L(a.B)) {
          k1.o(new h(this));
          this.r0(this.u);
       }
       return;
    }
    public synchronized void l0(){
       if (PatchProxy.applyVoid(null, this, IMInitModule.class, "5")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       this.r = new i(this);
       this.s = new Handler();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, IMInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, IMInitTaskDelay.class, "4") && (!IMInitTaskDelay.b && t.f(e0.b))) {
          a.c("IM-INIT TASK DELAY recordLaunchTime");
          IMInitTaskDelay.b = SystemClock.elapsedRealtime();
       }
    label_0034 :
       if (IMConfigUtil.i() && !this.o0(a.B)) {
          this.q0(a.b());
       }
       if (!SystemUtil.L(a.B)) {
          this.p0();
       }
       return;
    }
    public void n0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMInitModule.class, "6")) {
          return;
       }
       int i = 0;
       if (IMInitModule.v) {
          Object[] objArray = new Object[i];
          o.D().s("AJian", "imsdk已经初始化，忽略", objArray);
          return;
       }else {
          IMInitModule.v = true;
          Object[] objArray1 = new Object[i];
          o.D().s("AJian", "imsdk开始初始化", objArray1);
          if (this.o0(p0)) {
             b.a(0xb6e40b8).e(RequestTiming.COLD_START, i);
          }else if(d.i){
             if (IMConfigUtil.i()) {
                a.b(a.b());
             }
             IMInitTaskManager.b("onIMInit");
             d.c.d(new j(this));
          }
          return;
       }
    }
    public final boolean o0(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMInitModule.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(p0.getPackageName()+":messagesdk", SystemUtil.r(p0));
    }
    public void onAnonymousTokenUpdateEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMInitModule.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!d.i) {
          return;
       }
       o.e("anonymous token update, try login anonymous");
       b.a(0xb6e40b8).t();
       return;
    }
    public final void p0(){
       RecordMessageUsage recordMessag = RecordMessageUsage.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, IMInitModule.class, str)) {
          return;
       }
       if (TextUtils.m(SystemUtil.r(a.b()), ":messagesdk")) {
          KLinkInitManager.a().b();
          return;
       }else {
          a.b(a.b());
          if (!IMConfigUtil.i()) {
             this.q0(a.b());
          }
          str = "AJian";
          int i = 0;
          if (!PatchProxy.applyVoid(objArray, objArray, recordMessag, str) && SystemUtil.L(e0.b)) {
             Object[] objArray3 = new Object[i];
             o.D().s(str, "recordAtLaunch", objArray3);
             s1.e(new e0(), 5000);
          }
          RxBus obj = PatchProxy.apply(objArray, objArray, recordMessag, "6");
          boolean b = true;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!SystemUtil.L(e0.b)){
             Integer integer = Integer.valueOf(b);
             List list = a.a(List.class);
             if (list != null && list.size() >= 10) {
                Iterator iterator = list.iterator();
                int i2 = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().booleanValue()) {
                      i2 = i2 + 1;
                   }
                }
                Object[] objArray2 = new Object[i];
                o.D().s(str, "用户最近 10 次启动时使用私信次数:"+i2, objArray2);
                if (i2 >= integer.intValue()) {
                }
             }
          }
          int i1 = (b)? 1000: 0;
          if (t.f(e0.b) && i1 > 0) {
             Object[] objArray1 = new Object[i];
             o.D().s(str, "SystemUtils.isInMainProcess delay:"+i1, objArray1);
             this.l0();
             this.s.postDelayed(this.r, (long)i1);
          }else {
             objArray = new Object[i];
             o.D().s(str, "!SystemUtils.isInMainProcess delay:"+i1, objArray);
             this.n0(a.b());
          }
          obj = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          obj.g(a.class, mAIN).subscribe(new e(this));
          obj.g(n.class, mAIN).subscribe(new f(this));
          t ot = obj.g(l.class, mAIN);
          ot.subscribe(new a(this));
          if (this.t == null) {
             this.t = obj.f(p.class).observeOn(d.a).subscribe(new g(this));
          }
          IMInitTaskManager.b("onIMModuleCreate");
          return;
       }
    }
    public final void q0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMInitModule.class, "1")) {
          return;
       }
       p0.registerActivityLifecycleCallbacks(new IMInitModule$a(this));
       return;
    }
    public final void r0(boolean p0){
       c uoc;
       if (PatchProxy.isSupport(IMInitModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, IMInitModule.class, "13")) {
          return;
       }
       if (this.q == null && QCurrentUser.me().isLogined()) {
          o.e("set foreground status from IMSDK");
          Objects.requireNonNull(m.F());
          b.a("MessageSDKClient setAppForegroundStatus:"+p0);
          Objects.requireNonNull(f.e());
          f.e().s(p0);
          if (f.e().i()) {
             a.f(c.b);
          }
          Objects.requireNonNull(c.b());
          if (p0) {
             uoc = c.b();
             _monitor_enter(uoc);
             if (!a.d().i(uoc)) {
                a.d().p(uoc);
             }
             _monitor_exit(uoc);
             a.d().k(new n(true));
             c.b().c();
          }else {
             uoc = c.b();
             _monitor_enter(uoc);
             if (a.d().i(uoc)) {
                a.d().t(uoc);
             }
             _monitor_exit(uoc);
             a.d().k(new n(false));
             c.b().a();
          }
          if (p0 && t.o(null).l().p == null) {
             Iterator iterator = t.h.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (s.t(str).r() == null) {
                   s.t(str).V("BackToFront");
                   s.t(str).W(a.b());
                }
             }
             t.r(t.fromIterable(t.h));
          }
          if (!p0) {
             t.fromCallable(r.b).subscribeOn(m.h).subscribe(s.b, k.b);
          }
       }else {
          o.e("set foreground status from KLink");
          f.e().s(p0);
       }
       return;
    }
}

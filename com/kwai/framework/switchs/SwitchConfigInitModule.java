package com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.init.a;
import java.lang.Math;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import db6.e;
import c76.b;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Application;
import o56.a;
import android.content.Context;
import qj7.h;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule;
import uf6.i;
import java.lang.Runnable;
import ekd.s1;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import com.kwai.sdk.switchconfig.v2.a;
import po7.g;
import com.kwai.sdk.switchconfig.v2.internal.a;
import com.kwai.sdk.switchconfig.v2.logger.a;
import java.util.HashMap;
import java.util.Map;
import com.kwai.sdk.switchconfig.v1.a;
import com.kwai.sdk.switchconfig.v1.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.internal.b;
import com.kwai.sdk.switchconfig.v1.loggerII.b;
import crd.b;
import c97.d;
import q97.c;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import no7.d;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import po7.f;
import com.kwai.sdk.switchconfig.v2.logger.HoldInfo;
import f97.a;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import qo7.b;
import erd.g;
import mo7.g;
import mo7.f;
import com.kwai.sdk.switchconfig.v1.loggerII.HoldInfo;
import no7.c;
import com.kwai.sdk.switchconfig.v1.loggerII.a;
import b76.a;
import e66.a;
import io7.o;
import java.lang.reflect.Method;
import java.lang.Long;
import oo7.f;
import po7.d;
import am8.d;
import lo7.f;
import mo7.d;
import uf6.j;
import java.lang.Number;
import lnc.t0;
import o56.d;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Integer;
import uf6.d;
import io7.n;
import java.util.Arrays;
import java.util.Collection;
import uf6.e;
import io7.q;
import io7.s;
import io7.t;
import com.yxcorp.utility.SystemUtil;
import io7.u;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.switchs.g;
import com.kwai.framework.switchs.SwitchConfigInitModule$a;
import oe6.c;
import io7.v;
import io7.w;
import io7.e;
import io7.l;
import oo7.e;
import qo7.a;
import io7.m;
import io7.i;
import lo7.e;
import no7.a;
import com.kwai.sdk.switchconfig.ConfigPriority;
import zb6.d;
import pkd.a;
import java.lang.reflect.Type;
import el.a;
import zb6.c;
import io7.a;
import com.kwai.framework.network.util.d;
import com.kwai.framework.network.util.e;
import zb6.b;
import com.kwai.framework.network.util.a;
import com.kwai.framework.network.util.b;
import com.kwai.framework.network.util.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.UUID;
import com.kwai.framework.switchs.f;
import ob6.p$b;
import ob6.o;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import uf6.g;
import eda.l;
import uf6.f;

public class SwitchConfigInitModule extends a	// class@000cdf
{
    public boolean q;
    public final SharedPreferences r;
    public static final boolean s;

    static {
       boolean b = (Math.random() - 0x3f50624dd2f1a9fc <= 0)? true: false;
       SwitchConfigInitModule.s = b;
    }
    public void SwitchConfigInitModule(){
       super();
       this.q = false;
       this.r = b.b("SwitchConfigv3");
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, SwitchConfigInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (e.f()) {
          return false;
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, SwitchConfigInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.f()) {
          return Lists.b();
       }
       if (!h.b(a.b())) {
          return Lists.b();
       }
       obj = new Class[]{KeyConfigInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, SwitchConfigInitModule.class, "9")) {
          return;
       }
       s1.d(new i(this));
       Objects.requireNonNull(a.t());
       if (a.t().v()) {
          g og = a.x().a.f("SOURCE_DEFAULT");
          og.k.j();
          og.k.g(new HashMap(og.a));
       }else {
          Iterator iterator = a.z().a.f.entrySet().iterator();
          while (iterator.hasNext()) {
             b value = iterator.next().getValue();
             b k = value.k;
             b m = k.m;
             if (m != null && !m.isDisposed()) {
                d.a().f().d("SwitchConfig", "stopHoldNormalLog");
                k.m.dispose();
             }
             m = k.l;
             if (m != null && !m.isDisposed()) {
                d.a().f().d("SwitchConfig", "stopChangeNormalLog");
                k.l.dispose();
             }
             value.b.readLock().lock();
             value.b.readLock().unlock();
             value.k.b(new HashMap(value.a));
             value = value.k;
             value.h.submit(new d(value));
          }
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, SwitchConfigInitModule.class, "10")) {
          return;
       }
       Objects.requireNonNull(a.t());
       z oz = null;
       if (a.t().v()) {
          g og = a.x().a.f("SOURCE_DEFAULT");
          g k = og.k;
          f uof = new f(og);
          k.j();
          long l = (long)k.c().mHoldInterval;
          if (l - oz) {
             if (k.h == null) {
                k.h = b.b(a.c());
             }
             k.g = t.interval(l, l, TimeUnit.MILLISECONDS).subscribeOn(b.a()).observeOn(k.h).subscribe(uof, new b(l));
          }
       }else {
          Iterator iterator = a.z().a.f.entrySet().iterator();
          while (iterator.hasNext()) {
             b value = iterator.next().getValue();
             b k1 = value.k;
             g og1 = new g(value);
             f uof1 = new f(value);
             long l1 = (long)k1.o.mHoldInterval;
             if (l1 - oz) {
                k1.m = t.interval(l1, l1, TimeUnit.MILLISECONDS).subscribeOn(b.a()).observeOn(k1.k).subscribe(og1, new c(l1));
             }
             k1.l = t.interval(0x2710, 0x2710, TimeUnit.MILLISECONDS).subscribeOn(b.a()).observeOn(k1.j).subscribe(uof1, a.b);
          }
       }
       return;
    }
    public void k0(a p0){
       d uod;
       if (PatchProxy.applyVoidOneRefs(p0, this, SwitchConfigInitModule.class, "7")) {
          return;
       }
       p0 = a.t();
       long l = a.a.getLong("delayMsSplitSwitchConfig", 0) * 1000;
       Objects.requireNonNull(p0);
       int i = 1;
       if (a.u) {
          o oo = new o(p0);
          Object[] objArray = new Object[i];
          objArray[0] = Long.valueOf(l);
          a.y(o.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          p0 = a.x().a;
          if (!p0.c() || (!p0.a() || (f.b() && p0.e == null))) {
             p0.e = i;
             uod = new d(p0);
             if (l <= 0) {
                uod.run();
             }else {
                d.a(uod, "switch-onLaunchFinish", 3, l);
             }
          }
       }else {
          p0 = a.z().a;
          if (!p0.c() || (!p0.a() || (f.b() && p0.e == null))) {
             p0.e = i;
             uod = new d(p0);
             if (l <= 0) {
                uod.run();
             }else {
                d.a(uod, "switch-onLaunchFinish", 3, l);
             }
          }
       }
       s1.d(new j(this));
       return;
    }
    public final double l0(){
       Object obj = PatchProxy.apply(null, this, SwitchConfigInitModule.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return ((double)t0.a(a.a, 0x2710) / 10000.00f);
    }
    public void n(){
       Object[] objArray1;
       a uoa;
       g a;
       double d;
       RxBus f;
       Object[] objArray4;
       String[] stringArray;
       boolean b = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, SwitchConfigInitModule.class, "1")) {
          return;
       }
       if (b.q != null) {
          return;
       }
       boolean b1 = true;
       b.q = b1;
       String str = "KEY_SCV3_CURRENT_VERSION";
       int i = 0;
       int intx = b.r.getInt(str, i);
       int intx1 = b.r.getInt("KEY_SCV3_TARGET_VERSION", i);
       String str1 = "beforeMigrateVersion";
       int intx2 = b.r.getInt(str1, i);
       if (d.i) {
          if (intx2 && intx2 != intx) {
             g.b(b.r.edit().putInt(str1, intx));
          }
       }else if(intx2){
          intx = intx2;
       }
       if (!intx) {
          g.b(b.r.edit().putInt(str, b1));
          intx = 1;
       }
       a.t().r = i;
       intx2 = 3;
       str1 = "SOURCE_DEFAULT";
       if (PatchProxy.isSupport(SwitchConfigInitModule.class) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(intx), Integer.valueOf(intx1), b, SwitchConfigInitModule.class, "8") && (d.i && (intx && (intx1 && intx != intx1))))) {
          str = "SOURCE_LIVE";
          if (intx == b1 && intx1 == intx2) {
             uoa = a.t();
             d uod1 = new d(b);
             Objects.requireNonNull(uoa);
             if (a.u) {
                n on = new n(uoa);
                objArray4 = new Object[b1];
                objArray4[i] = uod1;
                a.y(n.class.getEnclosingMethod(), objArray4);
             }
             uoa.c = uod1;
             uoa.d = b1;
             stringArray = new String[]{str1,str};
             uoa.b.addAll(Arrays.asList(stringArray));
          }else if(intx == intx2 && intx1 == b1){
             uoa = a.t();
             e uoe = new e(b);
             Objects.requireNonNull(uoa);
             if (a.u) {
                q oq = new q(uoa);
                objArray4 = new Object[b1];
                objArray4[i] = uoe;
                a.y(q.class.getEnclosingMethod(), objArray4);
             }
             uoa.c = uoe;
             uoa.e = b1;
             stringArray = new String[]{str1,str};
             uoa.b.addAll(Arrays.asList(stringArray));
          }
       }
    label_00f8 :
       if (d.i) {
          if (a.u) {
             objArray1 = new Object[i];
             a.y(s.class.getEnclosingMethod(), objArray1);
          }
          if (a.t().v()) {
             f.d = b1;
          }else {
             f.d = b1;
          }
       }else {
          a.v = b1;
          if (a.u) {
             objArray1 = new Object[i];
             a.y(t.class.getEnclosingMethod(), objArray1);
          }
          if (a.t().v()) {
             f.c = b1;
          }else {
             f.c = b1;
          }
       }
       a.a.getBoolean("enableSplitSwitchConfig", b1);
       f.f = (a.t().v())? f.f: f.f;
       f.e = (a.t().v())? i: i;
       Objects.requireNonNull(a.t());
       if (a.t().v()) {
          Objects.requireNonNull(a.x());
          f.a = i;
       }else {
          Objects.requireNonNull(a.z());
          f.a = i;
       }
       uoa = a.t();
       boolean b2 = SystemUtil.P();
       Objects.requireNonNull(uoa);
       if (a.u) {
          u ou = new u(uoa);
          Object[] objArray2 = new Object[b1];
          objArray2[i] = Boolean.valueOf(b2);
          a.y(u.class.getEnclosingMethod(), objArray2);
       }
       if (!a.t().v()) {
          Objects.requireNonNull(a.z());
          f.b = b2;
       }
       uoa = a.t();
       Application uApplication = a.b();
       String id = QCurrentUser.ME.getId();
       a = g.a;
       d = this.l0();
       SwitchConfigInitModule$a uoa1 = new SwitchConfigInitModule$a(b);
       boolean b3 = (!c.a())? true: false;
       Objects.requireNonNull(uoa);
       int i1 = 2;
       if (a.u) {
          v ov = new v(uoa);
          Object[] objArray3 = new Object[intx2];
          objArray3[i] = uApplication;
          objArray3[b1] = id;
          objArray3[i1] = a;
          a.y(v.class.getEnclosingMethod(), objArray3);
       }
       uoa.h = uApplication;
       uoa.i = id;
       uoa.j = a;
       uoa.k = d;
       uoa.l = uoa1;
       uoa.m = b3;
       if (a.t().v()) {
          intx1 = 2;
          a.x().l(uApplication, id, new w(uoa, a), d, new l(uoa));
       }else {
          intx1 = 2;
          a.z().k(uApplication, id, new m(uoa, a), d, new i(uoa), uoa.m);
       }
       String.valueOf(this.l0());
       ConfigPriority[] uConfigPrior = new ConfigPriority[intx1];
       uConfigPrior[i] = ConfigPriority.MIDDLE;
       uConfigPrior[b1] = ConfigPriority.LOW;
       a.t().q(str1, uConfigPrior);
       d uod = d.class;
       str = String.class;
       if (!PatchProxy.applyVoid(objArray, objArray, uod, "6")) {
          Type[] typeArray = new Type[intx1];
          typeArray[i] = str;
          typeArray[b1] = Boolean.class;
          Type type = a.getParameterized(Map.class, typeArray).getType();
          a.t().p("configSeSDK_Android_Kuaishou", new c(type));
          a.t().p("disableSig3OBF_Android_kuaishou_gt8120", d.b);
          a.t().p("disableSig3OBF_Android_nebula_gt8120", e.b);
          Type[] typeArray1 = new Type[intx1];
          typeArray1[i] = str;
          typeArray1[b1] = str;
          a.getParameterized(Map.class, typeArray1).getType();
          a.t().p("config_kste_Android_kuaishou", new b(type));
          a.t().p("enable_kste_Android_kuaishou", a.b);
          a.t().p("disable_kste_android_kuaishou_gt10440", b.b);
          a.t().p("disable_kste_android_nebula_gt10440", c.b);
          g.a(d.b.edit().putString("security_last_launch_app_version", a.e));
          if (!PatchProxy.applyVoid(objArray, objArray, uod, "5")) {
             d.a = UUID.randomUUID().toString();
          }
       }
       o.a(f.a);
       f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new g(b));
       f.g(l.class, mAIN).subscribe(new f(b));
       return;
    }
    public int priority(){
       Object obj = PatchProxy.apply(null, this, SwitchConfigInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.f()) {
          return Integer.MAX_VALUE;
       }
       return 0;
    }
}

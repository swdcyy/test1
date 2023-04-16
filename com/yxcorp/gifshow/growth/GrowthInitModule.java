package com.yxcorp.gifshow.growth.GrowthInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import cra.g;
import java.lang.System;
import wkd.b;
import qn.c;
import goa.d;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import com.yxcorp.gifshow.util.DateUtils;
import lnc.i9;
import lnc.i3;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import k2b.u1;
import cra.f;
import vma.a;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import cra.b;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.growth.util.a;
import wpa.d;
import b76.a;
import lqa.d;
import android.os.SystemClock;
import lqa.b;
import java.lang.Runnable;
import ekd.k1;
import ona.f;
import ona.d;
import t45.c;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import c66.o;
import brd.t;
import t45.d;
import brd.z;
import ona.e;
import erd.g;
import crd.b;
import mqa.b;
import mqa.a;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager;
import io7.a;
import com.yxcorp.gifshow.growth.predownload.model.GrowthPreDownloadResConfig;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import lpa.a;
import com.yxcorp.gifshow.growth.c;
import com.kwai.framework.init.c;
import tkd.b;
import tkd.d;
import ayb.l;
import com.yxcorp.gifshow.growth.widget.virtual.e;
import android.view.View;
import i2b.a;
import mra.d;
import android.view.View$OnClickListener;
import ekd.m1;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;
import hna.a;
import m6c.a;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import yma.a;
import yma.c;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.growth.b;
import eda.l;
import zca.p;
import oqa.a;
import kqa.d;
import nf6.d;
import nf6.f;
import kra.c;
import ena.g;
import ena.i;
import android.content.ComponentCallbacks;
import o56.e;
import com.kwai.framework.activitycontext.ActivityContext$b;
import vpa.b;
import ada.a;
import vpa.a;
import wpa.e;
import vqa.k;
import pna.k;
import com.yxcorp.gifshow.growth.deviceinfo.DeviceInfoHelper;
import com.yxcorp.gifshow.growth.deviceinfo.DeviceInfoHelper$a;
import com.yxcorp.gifshow.growth.deviceinfo.a;
import com.kwai.framework.init.e;
import npa.d;
import qe6.b;
import npa.a;
import ayb.d;
import ayb.i;
import io.reactivex.android.schedulers.a;
import lrd.b;
import com.yxcorp.gifshow.growth.a;
import xoa.a;
import yoa.e;
import com.yxcorp.gifshow.log.h;
import yoa.f;
import k2b.s1;
import yoa.a;
import soa.a;
import yoa.b;
import yoa.c;
import yoa.d;
import java.lang.Integer;
import una.b;
import java.lang.reflect.Method;
import zsd.u;
import una.a;
import java.io.File;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import loa.b;
import loa.a;
import el.a;
import km8.b;
import y76.b;
import java.util.Collection;
import trd.y;
import jsa.e;
import com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketManager$init$1;
import loa.g;
import msd.l;
import upa.a;
import cn5.a;
import com.yxcorp.gifshow.growth.newreflux.LocalNewRefluxUser$logUserType$json$1;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public class GrowthInitModule extends a	// class@0012d9
{
    public static final int q;

    public void GrowthInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, GrowthInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, GrowthInitModule.class, "6")) {
          return;
       }
       g og = g.class;
       _monitor_enter(og);
       if (PatchProxy.applyVoid(null, null, og, "7")) {
          _monitor_exit(og);
       }else {
          g.a = g.a + (System.currentTimeMillis() - g.b);
          _monitor_exit(og);
       }
       b.a(-1442571954).onBackground();
       b.a(0x56d4a121).d(RequestTiming.ON_BACKGROUND);
       return;
    }
    public void i0(){
       b b;
       SharedPreferences a;
       String str;
       SharedPreferences a1;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthInitModule.class, "5")) {
          return;
       }
       _monitor_enter(og);
       if (PatchProxy.applyVoid(objArray, objArray, og, "6")) {
          _monitor_exit(og);
       }else {
          g.b = System.currentTimeMillis();
          _monitor_exit(og);
       }
       b.a(-1382356358).f();
       long l = 0;
       if (!PatchProxy.applyVoid(objArray, objArray, og, "10")) {
          a1 = b.c(a.b(), a.w, false);
          String str2 = "float_window_permission_show_time";
          long longx = a1.getLong(str2, l);
          if (longx - l <= 0 || !DateUtils.H(longx)) {
             i3 oi31 = i3.f();
             String str3 = "floatWindow";
             if (i9.a(a.b())) {
                oi31.d(str3, "1");
             }else {
                oi31.d(str3, "0");
             }
             str = oi31.toString();
             if (!TextUtils.isEmpty(str)) {
                g.a(a1.edit().putLong(str2, System.currentTimeMillis()));
                u1.R("FLOATING_WINDOW_PERMISSION", str, 9);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, objArray, f.class, "1")) {
          a1 = a.a;
          str = "lastTimeForCalenderPermission";
          if (!DateUtils.J(a1.getLong(str, l))) {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             if (uActivity != null) {
                String str1 = (PermissionUtils.a(uActivity, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(uActivity, "android.permission.READ_CALENDAR"))? 1: null;
                h$b uob = h$b.e(true, "CALENDAR_SWITCH");
                uob.k(new ClientEvent$ElementPackage());
                uob.b().action2 = "CALENDAR_SWITCH";
                ClientEvent$ElementPackage uElementPack = uob.b();
                i3 oi3 = i3.f();
                str1 = (str1)? "on": "off";
                oi3.d("switch_state", str1);
                uElementPack.params = oi3.e();
                u1.r0(uob);
             }
             SharedPreferences$Editor uEditor1 = a1.edit();
             uEditor1.putLong(str, System.currentTimeMillis());
             g.a(uEditor1);
          }
       }
       b = b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, b.class, "2")) {
          a = a.a;
          str = "lastUploadTime";
          long l1 = System.currentTimeMillis();
          if (!DateUtils.I(a.getLong(str, l), l1)) {
             a.y(false);
             a.A(l);
          }
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putLong(str, l1);
          g.a(uEditor);
          if (a.k() - a.t().b("applistReportCount", 1) >= 0) {
             a.y(true);
          }
          if (!a.getBoolean("timesReached", false)) {
             a.A((a.k() + 1));
             b.b(true);
          }
       }
       b.a(-1442571954).onForeground();
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInitModule.class, "4")) {
          return;
       }
       Objects.requireNonNull(b.a(-1166008586));
       d uod = b.a(0x55022c7a);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(null, uod, d.class, "4") && uod.h == null) {
          uod.c = false;
          uod.b();
       }
       b.a(-1442571954).release();
       return;
    }
    public void k0(a p0){
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "7";
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInitModule.class, str)) {
          return;
       }
       d uod = b.a(-1197629247);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(null, uod, d.class, "14") && uod.b()) {
          uod.c();
          uod.l = SystemClock.elapsedRealtime();
          k1.o(new b(uod));
       }
       f uof = b.a(0x356691ee);
       Objects.requireNonNull(uof);
       String str1 = "1";
       if (!PatchProxy.applyVoid(null, uof, f.class, str1)) {
          c.a(new d(uof));
          u1.a(uof);
          RxBus.f.f(o.class).observeOn(d.c).subscribe(new e(uof));
       }
       b uob = b.a(0x564e470d);
       Objects.requireNonNull(uob);
       int i = 0;
       if (!PatchProxy.applyVoid(null, uob, b.class, str1)) {
          boolean booleanx = a.a.getBoolean("growth_forbid_gesture_guide", i);
          uob.a = booleanx;
          if (!booleanx) {
             c.a(new a(uob));
          }
          objArray = new Object[i];
          w.C().w("ReduceGestureGuide", "init: "+uob.a, objArray);
       }
       RxBus$ThreadMode threadMode = 1;
       if (!PatchProxy.applyVoid(null, null, GrowthResourcePreDownloadManager.class, "3") && !GrowthResourcePreDownloadManager.f) {
          GrowthResourcePreDownloadManager.f = threadMode;
          objArray = new Object[i];
          String str2 = "GrowthResourcePreDownloadManager";
          w.C().w(str2, "init", objArray);
          a g = GrowthResourcePreDownloadManager.g;
          String str3 = "growthPreDownloadResource";
          if (!a.t().o(str3, g)) {
             Object[] objArray1 = new Object[i];
             w.C().w(str2, "addObserver", objArray1);
             a.t().p(str3, g);
          }
          GrowthResourcePreDownloadManager.c = a.t().getValue(str3, GrowthPreDownloadResConfig.class, null);
          GrowthResourcePreDownloadManager.i.b();
       }
       KgiCloudRpManager.f();
       boolean i1 = 0x76955bf0;
       if (b.a(i1).a()) {
          i1 = b.a(i1);
          Objects.requireNonNull(i1);
          if (!PatchProxy.applyVoid(null, i1, a.class, str1)) {
             u1.a(i1);
          }
       }
       c.c(c.b);
       i1 = 0x38955e85;
       if (d.a(i1).CO()) {
          e uoe = e.class;
          if (!PatchProxy.applyVoid(null, null, uoe, str1)) {
             e uoe1 = new e();
             e.n = uoe1;
             if (!PatchProxy.applyVoid(null, uoe1, uoe, str)) {
                View view = PatchProxy.apply(null, uoe1, uoe, "8");
                if (view != patchProxyRe) {
                }else {
                   view = a.a(a.B, R.layout.arg_RES_7f0d168e);
                   m1.a(view, new d(uoe1), R.id.exit_virtual_root);
                   view.setVisibility(8);
                }
                uoe1.c = view;
                Handler j = e.j;
                j.removeMessages(i, uoe1);
                j.sendMessage(j.obtainMessage(i, uoe1));
             }
             e.k = a.t().a("simQuery", 30);
             e.k = 8;
             e.l = new AtomicInteger((e.k + threadMode));
             d.a(i1).dD();
             e.n.h();
          }
       }
       b.a(0x56d4a121).d(RequestTiming.COLD_START);
       a.a();
       i1 = PatchProxy.apply(null, null, a.class, "2");
       if (i1 != patchProxyRe) {
          i1 = i1.booleanValue();
       }else {
          i1 = a.a;
          if (i1.d()) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined() && i1.i()) {
                i = 1;
             }
          }
          i1 = i;
       }
       if (i1) {
          b.a(-1257347683).a().d().subscribe();
       }
       RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(b.b);
       return;
    }
    public void n(){
       g b;
       int i;
       a c;
       int b3;
       b a;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, GrowthInitModule.class, str)) {
          return;
       }
       l ol = l.class;
       p op = p.class;
       String str1 = "2";
       if (!PatchProxy.applyVoid(objArray, this, GrowthInitModule.class, str1)) {
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
             g og = 0xda2a5cb;
             if (!PatchProxy.applyVoid(objArray, objArray, d.class, str)) {
                b.a(og).d(new d());
             }
             if (!PatchProxy.applyVoid(objArray, objArray, c.class, str1)) {
                b.a(og).d(new c());
             }
          }
          b.a(0x445bdc46);
          b.a(0x45159313);
          b.a(-912023742);
          b = g.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, g.class, str) && i.a(4)) {
             e c1 = a.C;
             if (c1 != null) {
                c1.registerComponentCallbacks(b);
             }
             ActivityContext.i(b);
          }
          b uob = b.a(0x3df2d9ac);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
             RxBus.f.f(a.class).observeOn(d.a).subscribe(new a(uob));
          }
          d uod = b.a(0x55022c7a);
          Objects.requireNonNull(uod);
          d uod1 = d.class;
          if (!PatchProxy.applyVoid(objArray, uod, uod1, str) && uod.e()) {
             ActivityContext.i(new e(uod));
             if (DateUtils.H(a.a.getLong("lastColdStartTimeForNps", 0))) {
                if (!PatchProxy.applyVoid(objArray, uod, uod1, str1)) {
                   uod.a = (k.b.b("KEY_NPS_DIALOG_TIME_LIMIT_TEST", Boolean.FALSE).booleanValue())? 0x3a98: 0x493e0;
                }
             label_0109 :
                uod.f();
             }
             a.s(System.currentTimeMillis());
          }
          DeviceInfoHelper$a b1 = DeviceInfoHelper.b;
          Objects.requireNonNull(b1);
          i = 1;
          if (!PatchProxy.applyVoid(objArray, b1, DeviceInfoHelper$a.class, str)) {
             e.j(a.b, "UgDeviceInfoTest", i);
          }
          uod = b.a(0x392b9841);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(objArray, uod, d.class, str)) {
             if (!b.a()) {
                uod.a = RxBus.f.f(op).observeOn(d.a).subscribe(new a(uod));
             }
             u1.a(uod);
          }
          d.a(-1479517326).init();
          if (!b.a()) {
             d.a(0x4f878389).zH(i);
          }
          RxBus f = RxBus.f;
          f.f(op).observeOn(a.c()).subscribeOn(b.c()).subscribe(a.b);
          boolean b2 = false;
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
             e uoe = new e();
             String str4 = "init";
             if (!PatchProxy.applyVoid(objArray, uoe, e.class, str)) {
                Object[] objArray5 = new Object[b2];
                w.C().w("KPopPageChangeListener", str4, objArray5);
                b.a(0x4b316083).T0(new f(uoe));
             }
             a uoa1 = new a();
             a uoa2 = a.class;
             if (!PatchProxy.applyVoid(objArray, uoa1, uoa2, str)) {
                Object[] objArray3 = new Object[b2];
                String str5 = "KPopCommonTimingListener";
                w.C().w(str5, str4, objArray3);
                u1.a(uoa1);
                RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
                f.g(a.class, mAIN).subscribe(new b(uoa1));
                f.g(ol, mAIN).subscribe(new c(uoa1));
                f.g(n.class, mAIN).subscribe(new d(uoa1));
                if (!PatchProxy.applyVoid(objArray, uoa1, uoa2, str1)) {
                   b3 = 400;
                   if (!uoa1.c(b3)) {
                      Object[] objArray4 = new Object[b2];
                      w.C().w(str5, "onColdStart pending", objArray4);
                      uoa1.b = Integer.valueOf(b3);
                   }
                }
             }
          }
       label_0236 :
          b uob1 = b.class;
          int i1 = 2;
          if (!PatchProxy.applyVoid(objArray, objArray, uob1, str)) {
             uob = b.a;
             Objects.requireNonNull(uob);
             String obj = PatchProxy.apply(objArray, uob, uob1, "5");
             if (obj != PatchProxyResult.class) {
                b3 = obj.booleanValue();
             }else {
                Class uClass = Class.forName("com.huawei.system.BuildEx");
                Class[] uClassArray = new Class[b2];
                Object[] objArray2 = new Object[b2];
                b3 = u.I1("harmony", uClass.getMethod("getOsBrand", uClassArray).invoke(uClass, objArray2).toString(), i);
             }
             if (b3) {
                RxBus.f.g(ol, RxBus$ThreadMode.BACKGROUND).subscribe(a.b);
                a = b.a;
                a.b();
                if (!PatchProxy.applyVoid(objArray, a, uob1, "3")) {
                   Application uApplication = a.b();
                   a.o(uApplication, "AppEnv.getAppContext\(\)");
                   Uri uriForFile = FileProvider.getUriForFile(a.b(), uApplication.getPackageName()+".fileprovider", a.a());
                   a.o(uriForFile, "FileProvider.getUriForFi¡­  getProviderFile\(\)\n    \)");
                   obj = "com.kuaishou.hmos.card";
                   a.b().grantUriPermission(obj, uriForFile, i);
                   a.b().grantUriPermission(obj, uriForFile, i1);
                }
             }
          }
       label_02d3 :
          PrivacyDialogHelper.r();
          String str2 = "KgiRPS#init: mVideoWatchList size = ";
          if (!PatchProxy.applyVoid(objArray, objArray, b.class, str)) {
             Type type = new a().getType();
             StringBuilder str3 = a.a.getString("kgiRedPacketVideoTimeList", "null");
             Object[] objArray1 = (str3 == null || str3 == "")? objArray: b.a(str3, type);
             str3 = "KgiRPS#init: saved list size = ";
             Integer integer = (objArray1 != null)? Integer.valueOf(objArray1.size()): objArray;
             b.e(str3+integer, b2, i1, objArray);
             ArrayList f1 = b.f;
             f1.addAll(objArray1);
             b.e(str2+f1.size(), b2, i1, objArray);
             ArrayList f2 = b.f;
             while (f2.size() > 0x2710) {
                y.M0(f2);
             }
             b.e(str2+f2.size(), b2, i1, objArray);
             a.t().p("KgiRedPacketConfig", b.h);
             RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new g(new KgiRedPacketManager$init$1(b.i)));
          }
          a uoa = a.class;
          if (!PatchProxy.applyVoid(objArray, objArray, uoa, "4") && a.f()) {
             RxBus.f.c(new a());
             c = a.c;
             str = c.e();
             if (!PatchProxy.applyVoidOneRefs(str, c, uoa, "12")) {
                i3 oi3 = i3.f();
                oi3.d("userType", str);
                oi3.d("activateDate", c.a(c.b()));
                oi3.d("launchDates", CollectionsKt___CollectionsKt.V2(c.c(), null, null, null, 0, null, LocalNewRefluxUser$logUserType$json$1.INSTANCE, 31, null));
                u1.R("LOCAL_NEW_REFLUX_TYPE", oi3.e(), 9);
             }
          }
       }
    label_0403 :
       return;
    }
    public int priority(){
       return 100;
    }
}

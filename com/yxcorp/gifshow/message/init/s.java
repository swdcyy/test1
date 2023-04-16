package com.yxcorp.gifshow.message.init.s;
import java.lang.Object;
import hdb.m;
import hdb.c;
import com.yxcorp.gifshow.message.init.i;
import com.yxcorp.gifshow.message.init.s$a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import ob6.p$b;
import ob6.o;
import com.yxcorp.gifshow.message.init.s$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qo6.p;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import android.app.Application;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import ob6.p;
import ob6.h;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.framework.network.keyconfig.TimeRange;
import yb6.d;
import java.util.List;
import java.util.Collection;
import ekd.q;
import hdb.o;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import com.kwai.social.startup.reminder.model.OnlineStatusCacheConfig;
import qo6.p$b;
import qo6.p$a;
import java.util.HashSet;
import com.kwai.chat.sdk.signal.BizDispatcher;
import qrd.p;
import java.lang.Number;
import xf6.i;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.d1;
import com.kwai.social.startup.reminder.model.GroupOnlineFetchConfig;
import com.kwai.chat.kwailink.log.KLog;
import dc5.c;
import zo6.a;
import rt7.a;
import com.kwai.social.startup.reminder.model.MessageSearchConfig;
import dc5.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.lang.Integer;
import java.util.Iterator;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.KLinkConfig;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import android.content.Context;
import java.lang.RuntimeException;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import qt7.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import hdb.z;
import erd.g;
import hdb.w;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import brd.a0;
import hdb.s;
import hdb.t;
import com.kwai.imsdk.m;
import t45.d;
import com.yxcorp.gifshow.message.init.n;
import brd.z;
import com.yxcorp.gifshow.message.init.q;
import xp6.r;
import bp6.g2;
import xv5.c;
import tkd.b;
import tkd.d;
import hw5.a;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.ClientUserInfo;
import hdb.b0;
import hdb.c0;
import l85.b;
import ca7.u;
import bq6.y2;
import xp6.m;
import com.kwai.imsdk.l;
import java.util.concurrent.TimeUnit;
import zb5.l;
import up6.f;
import i85.f;
import pu7.d0;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.TextUtils;
import pu7.o;
import j9c.d;
import com.kwai.component.menudot.b;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.message.init.c;
import ok.h;
import java.lang.Long;
import cc5.a;
import bc5.a;
import java.lang.System;
import hdb.x;
import erd.a;
import hdb.u;
import com.gifshow.tuna.player.poi.e;
import c97.d;
import ca7.t;
import h97.g;
import com.kwai.imsdk.internal.v;
import xp6.k;
import bp6.b2;
import com.kwai.imsdk.internal.client.t;
import java.util.concurrent.CopyOnWriteArraySet;
import dp6.h0;
import qo6.i1;
import com.kwai.chat.kwailink.client.c0;
import nq6.a;
import o75.b0;
import java.lang.Exception;
import su7.c;
import su7.b;
import zwa.b;
import zwa.a;
import hdb.k;
import mfb.l;
import hdb.a0;
import io.reactivex.internal.functions.Functions;
import pu7.n;
import com.yxcorp.gifshow.message.init.r;
import io.reactivex.g;
import com.kwai.imsdk.internal.t;
import java.util.concurrent.Future;
import f97.a;
import kotlin.jvm.internal.a;
import hdb.l;
import erd.r;
import kotlin.NoWhenBranchMatchedException;
import hdb.n;
import java.util.ArrayList;
import hdb.r;
import qe6.b;
import com.yxcorp.gifshow.message.init.e;
import com.yxcorp.gifshow.message.init.g;
import com.yxcorp.gifshow.message.init.l;
import erd.o;
import zb5.i;
import zb5.d;
import io.reactivex.i;
import com.yxcorp.gifshow.message.init.d;
import com.yxcorp.gifshow.message.init.f;
import hdb.y;

public class s	// class@001d6c
{
    public boolean a;
    public m b;
    public int c;
    public boolean d;
    public c e;
    public p$b f;
    public final f g;
    public b h;
    public Set i;
    public static String j;

    public void s(){
       super();
       this.a = false;
       this.b = new m();
       this.c = 1;
       this.d = false;
       this.e = new c();
       this.f = new i(this);
       this.g = new s$a(this);
       this.i = Collections.newSetFromMap(new ConcurrentHashMap());
    }
    public static void a(s p0){
       p0.h();
    }
    private void h(){
       o.a(this.f);
    }
    public void b(s$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "24")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public final p c(){
       h oh;
       h mBaseConfig;
       DegradeConfig uDegradeConf;
       List obj2;
       int b;
       String str2;
       IMConfigInfo iMConfigInfo1;
       boolean b1;
       int i;
       OnlineStatusCacheConfig mCacheLimit;
       Object[] objArray1;
       long l;
       boolean b2;
       String str3;
       int i1;
       int i2;
       long l1;
       p$b uob;
       IMConfigInfo iMConfigInfo2;
       int i3;
       int i4;
       int i5;
       int i6;
       IMConfigInfo iMConfigInfo3;
       int i7;
       p$b uob1;
       String[] stringArray;
       int len;
       int i8;
       int i9;
       IMConfigUtil obj3;
       String str4;
       a obj4;
       int i10;
       HashSet hashSet;
       HashSet hashSet1;
       int b3;
       List obj5;
       KwaiLinkDefaultServerInfo kwaiLinkDefa;
       int i11;
       int[] ointArray;
       IMConfigInfo iMConfigInfo4;
       IMConfigInfo mSessionTagE;
       Iterator iterator;
       String str5;
       Iterator iterator1;
       GroupOnlineFetchConfig groupOnlineF;
       HashSet hashSet2;
       boolean b4;
       Object obj = this;
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       s os = s.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "9";
       String obj1 = PatchProxy.apply(objArray, obj, os, str);
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "8";
       String str1 = PatchProxy.apply(objArray, obj, os, obj1);
       IMConfigInfo iMConfigInfo = -1504323719;
       if (str1 != patchProxyRe) {
       }else {
          String str6 = "kwailink";
          str1 = (a.a().c() || SystemUtil.I())? b.a(iMConfigInfo).h(str6).getAbsolutePath(): new File(a.b().getFilesDir(), str6).getAbsolutePath();
       }
    }
    public final int d(h p0){
       if (p0 != null) {
          p0 = p0.mFeatureConfig;
          if (p0 != null) {
             FeatureConfig mKLinkConfig = p0.mKLinkConfig;
             if (mKLinkConfig != null) {
                return mKLinkConfig.mTryConnectNumber;
             }
          }
       }
       return 0;
    }
    public void e(RequestTiming p0,boolean p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os, "1")) {
          return;
       }
       if (!SystemUtil.I() || (SystemUtil.L(a.b()) && SystemUtil.O())) {
          throw new RuntimeException("init should be on main thread");
       }
       this.f();
       if (this.h == null || this.h.isDisposed()) {
          this.h = RxBus.f.g(b.class, RxBus$ThreadMode.POSTING).subscribe(new z(this));
       }
       if (SystemUtil.O()) {
          e.d(new w(this), "MessageManager");
       }
       if (!p1) {
          o.e("login by app start");
          this.j(p0);
          o.e("not from login, try login anonymous");
          this.t();
       }else {
          this.u().R(new s(this, p0), new t(this, p0));
       }
       return;
    }
    public final void f(){
       q a;
       if (PatchProxy.applyVoid(null, this, s.class, "12")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       p op = this.c();
       m.F().X(a.b(), op);
       if (SystemUtil.K() && op.x != null) {
          d.c.d(n.b);
          m.F().X(a.b(), op);
       }
       this.b.b(true);
       a = q.a;
       Objects.requireNonNull(m.F());
       r.b(a, "可选的初始化过程.");
       g2.c = a;
       if (c.d()) {
          d.a(-141700944).Dp();
       }else if(PatchProxy.applyVoidOneRefs("onIMSDKInit", null, IMInitTaskManager.class, "7")){
          IMInitTaskManager.d("onIMSDKInit", null, true);
       }
       return;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, s.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, s.class, "6")) {
          return;
       }
       o.e("login\(\)");
       if (!SystemUtil.L(a.b())) {
          o.e("login\(\) is not in main process, return");
          return;
       }else {
          String id = QCurrentUser.me().getId();
          o.e("login\(\) current userId "+id);
          String str = f.e().c().e();
          o.e("login\(\) current signalClientUserId "+str);
          if (QCurrentUser.me().isValidUser() && !id.equals(str)) {
             if (!m.F().J()) {
                o.e("logout anonymous and login");
                this.u().R(new b0(this), new c0(this));
             }else {
                o.e("IMSDK loginState is not LOGOFF "+m.F().J());
             }
          }
          return;
       }
    }
    public final void j(RequestTiming p0){
       long l;
       a c;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "13")) {
          return;
       }
       o.e("loginIMSdk, requestTiming="+p0);
       if (!SystemUtil.L(a.b())) {
          return;
       }
       if (QCurrentUser.me().isLogined() && QCurrentUser.me().isValidUser()) {
          if (this.a != null) {
             return;
          }else {
             o.e("loginIMSdk set userId "+QCurrentUser.me().getId());
             String id = QCurrentUser.me().getId();
             b.i("KwaiIMManager#userId", " userId: "+id);
             m.f = id;
             if (u.c(id)) {
                m.f = y2.a();
                b.c("IMSDK connect userId is invalid");
             }
             f.e().c().k(m.f);
             m.a.e(l.b, 30, TimeUnit.SECONDS);
             int i = -2031148417;
             l ol = b.a(i);
             Objects.requireNonNull(ol);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, ol, l.class, "1")) {
                f.e().o(ol.b);
             }
             b.a(i).a(this.g);
             IMInitTaskManager.b("onIMSDKLogin");
             d0 uod0 = d0.f();
             Objects.requireNonNull(uod0);
             l = 0;
             if (!PatchProxy.applyVoid(objArray, uod0, d0.class, "1")) {
                long l2 = a.t().b("USER_SIMPLE_INFO_INIT_DELAY", l);
                if (QCurrentUser.me() != null && !TextUtils.x(QCurrentUser.me().getId())) {
                   d.c.e(new o(uod0), l2, TimeUnit.MILLISECONDS);
                }
             }
             if (SystemUtil.L(a.b()) && QCurrentUser.me().isLogined()) {
                d uod = b.a(0x2c71dec4);
                String id1 = (QCurrentUser.me().isValidUser())? QCurrentUser.me().getId(): "";
                uod.b(id1);
                b uob = b.a(0x34c80eb4);
                id1 = (QCurrentUser.me().isValidUser())? QCurrentUser.me().getId(): "";
                uob.b(id1);
                long l1 = Optional.fromNullable(a.b()).transform(c.b).or(Long.valueOf(-1)).longValue();
                c = a.c;
                Objects.requireNonNull(c);
                if (l1 - l <= 0) {
                   l1 = 0x240c8400;
                }
                a.a = l1;
                this.a = true;
                a uoa = a.a();
                Objects.requireNonNull(uoa);
                if (!PatchProxy.applyVoid(objArray, uoa, a.class, "2")) {
                   a g = uoa.g;
                   _monitor_enter(g);
                   if (!uoa.d - l) {
                      uoa.d = System.currentTimeMillis();
                   }
                   _monitor_exit(g);
                }
                c.d(false, p0).n(new x(this)).G(d.c).R(new u(this, p0), e.b);
             }
          }
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, s.class, "7")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       this.f();
       o.e("login by app startUp respoonse");
       a.a().c(2);
       this.j(RequestTiming.LOGIN);
       return;
    }
    public void l(String p0,String p1,RequestTiming p2){
       c uoc;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "14")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       o.e("loginImFinal, requstTiming="+p2);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       d uod = b.a(0x2c71dec4);
       String id = (QCurrentUser.me().isValidUser())? QCurrentUser.me().getId(): "";
       uod.b(id);
       b uob = b.a(0x34c80eb4);
       id = (QCurrentUser.me().isValidUser())? QCurrentUser.me().getId(): "";
       uob.b(id);
       a uoa = a.a();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, a.class, "4")) {
          a g = uoa.g;
          _monitor_enter(g);
          if (!uoa.f - null) {
             uoa.f = System.currentTimeMillis();
          }
          _monitor_exit(g);
       }
       String str = "kuaishou.sixin.login";
       s te = this.e;
       b.i("KwaiIMManager#userId", "IMSDK connect start");
       if (!t.f(d.a().d())) {
          b.c("IMSDK connect not in main process");
       }else {
          m.F().m0();
          if (u.c(p0)) {
             p0 = d.a().b().P();
             b.c("IMSDK connect token is invalid");
          }
          if (u.c(str)) {
             str = d.a().b().b0();
             b.c("IMSDK connect sid is invalid");
          }
          if (u.c(p1)) {
             p1 = d.a().b().W();
             b.c("IMSDK connect security is invalid");
          }
          v ov = v.l();
          String f = m.f;
          Objects.requireNonNull(ov);
          k.a("connect: uid="+f);
          v.t = te;
          t.y(new b2(ov));
          ov = ov.a;
          t.c.add(te);
          f.f(ov).a(ov, new h0());
          c0 uoc0 = f.e().g();
          a uoa1 = new a();
          try{
             uoc0.z(uoa1);
             t.j(f, str, p0, p1);
          }catch(java.lang.Exception e9){
             k.a(e9.getMessage());
             e9.printStackTrace();
          }
       }
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       b.a(-2031148417).b(this.g);
       this.n().subscribe(new a0(this), Functions.d());
       return;
    }
    public final t n(){
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!SystemUtil.L(a.b())) {
          return t.just(Boolean.TRUE);
       }
       o.e("logout by user or token invalid");
       this.d = true;
       obj = b.a(-2031148417);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(objArray, obj, l.class, "2")) {
          f.e().b(obj.b);
       }
       d0 uod0 = d0.f();
       Objects.requireNonNull(uod0);
       if (!PatchProxy.applyVoid(objArray, uod0, d0.class, "2")) {
          d.c.d(new n(uod0));
       }
       a.c();
       c uoc = c.d();
       uoc.b = objArray;
       uoc.a = objArray;
       b.a(0x2c71dec4).b("");
       b.a(0x34c80eb4).b("");
       a.c.a();
       if (!PatchProxy.applyVoid(objArray, objArray, k.class, "2")) {
          l.d();
       }
       a.a().onLogout();
       IMInitTaskManager.c("onIMLogout", "onIMLogin");
       this.b.b(false);
       return t.create(new r(this)).subscribeOn(d.c);
    }
    public final void o(int p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "22")) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          s$b uob = iterator.next();
          boolean b = (!p0)? true: false;
          uob.a(b);
       }
       a.a().onConnectStateChange(p0);
       return;
    }
    public void onMessageStartUpEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "28")) {
          return;
       }
       IMConfigInfo iMConfigInfo = a.b();
       String str = (iMConfigInfo == null)? null: iMConfigInfo.mKtraceConfig;
       v ov = v.m(m.F().c);
       Objects.requireNonNull(ov);
       a.f(new t(ov, str));
       if (!this.b.a()) {
          return;
       }else {
          IMInitTaskManager.b("notifySubbizChange");
          return;
       }
    }
    public t p(){
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       s obj = PatchProxy.apply(objArray, this, s.class, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, m.class, "2");
       if (ot != patchProxyRe) {
       }else {
          m a = obj.a;
          if (a == 1) {
             ot1 = t.just(Boolean.TRUE);
             a.o(ot1, "Observable.just\(true\)");
          }else if(a == null){
             ot1 = obj.b.hide().filter(l.b).take(1);
             a.o(ot1, "imsdkInitPublisher.hide\(\).filter { it }.take\(1\)");
          }else {
             throw new NoWhenBranchMatchedException();
          }
          ot = ot1;
       }
       return ot;
    }
    public void q(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "4")) {
          return;
       }
       s te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, c.class, "6")) {
          if (te.a == null) {
             te.a = new ArrayList();
          }
          if (!te.a.contains(p0)) {
             te.a.add(p0);
          }
       }
       return;
    }
    public void r(s$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "25")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, s.class, "17")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       if (m.F().Q() == null || !TextUtils.equals(m.F().Q(), QCurrentUser.me().getId())) {
          o.e("userId has\'nt set, waiting for loginIMSdk, return");
          return;
       }else {
          a.c.d(true, RequestTiming.DEFAULT).G(d.c).R(new r(this), e.b);
          return;
       }
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, s.class, "30")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          o.e("tryLoginAnonymous: "+SystemUtil.r(a.b()));
          return;
       }else if(QCurrentUser.me().isLogined()){
          o.e("is not anonymous user");
          return;
       }else if(!b.a()){
          o.e("privacy protocol not agreed");
          return;
       }else {
          this.u().G(d.c).r(e.b).p(g.b).J(Boolean.FALSE).d0().flatMap(new l(this)).subscribe(Functions.d(), Functions.d());
          return;
       }
    }
    public final a0 u(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj = PatchProxy.apply(null, this, s.class, "29");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!SystemUtil.L(a.b())) {
          o.e("logout anonymous: not in main process, ignore");
          return a0.B(Boolean.FALSE);
       }else {
          this.d = true;
          obj = b.a(-1989170423);
          Objects.requireNonNull(obj);
          a0 uoa0 = PatchProxy.apply(null, obj, i.class, "11");
          if (uoa0 != patchProxyRe) {
          }else {
             uoa0 = a0.k(new d(f.e()));
          }
          return uoa0.r(d.b).p(f.b).n(new y(this)).G(d.a);
       }
    }
    public void v(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "16")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       if (b.a(-1989170423).d()) {
          return;
       }
       a c = a.c;
       Objects.requireNonNull(c);
       String obj = PatchProxy.apply(objArray, c, a.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!a.b){
          obj = c.c();
          obj = (obj == null || !obj.length())? 1: 0;
          if (!obj) {
             String str = c.b();
             str = (str == null || !str.length())? 1: 0;
             if (!str) {
                b = false;
             }
          }
       }
    label_006c :
       b = true;
       if (b) {
          o.e("IMLogin token getRequest tryNeedLoginIM");
          this.s();
       }
       return;
    }
    public void w(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "5")) {
          return;
       }
       s te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, c.class, "7")) {
          c a = te.a;
          if (a != null && a.contains(p0)) {
             te.a.remove(p0);
          }
       }
       return;
    }
}

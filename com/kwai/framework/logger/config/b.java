package com.kwai.framework.logger.config.b;
import k2b.o0;
import java.util.concurrent.TimeUnit;
import com.google.common.collect.ImmutableMap;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import jb6.b;
import android.content.Context;
import java.lang.Object;
import com.kwai.framework.logger.config.b$a;
import com.google.common.collect.ImmutableList;
import com.yxcorp.utility.SystemUtil;
import er.m;
import com.kwai.framework.logger.uploader.c;
import com.kuaishou.android.vader.Channel;
import com.kwai.framework.logger.uploader.d;
import com.kwai.framework.logger.uploader.f;
import com.kwai.framework.logger.uploader.h;
import aa6.b;
import y96.m;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import q2b.c;
import android.app.Application;
import o56.a;
import android.telephony.CellLocation;
import com.yxcorp.utility.c;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.cdma.CdmaCellLocation;
import ekd.m;
import java.util.HashMap;
import y96.c;
import java.lang.Number;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;
import er.i;
import er.j;
import er.h;
import java.util.Map;
import k2b.x1;
import y96.k;
import ok.x;
import tq.h;
import tq.d;
import w96.b;
import android.content.SharedPreferences;
import xf6.l;
import b3b.a;
import rkd.b;
import ta6.q;
import java.lang.StringBuilder;
import km8.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ekd.e;
import y96.h;
import y96.g;
import qe6.b;
import aa6.c;
import crd.b;
import y96.b;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import y96.a;
import com.kwai.framework.logger.config.a;
import erd.g;
import oe6.a;
import q2b.g;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import h30.a;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import ob6.h;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.util.Objects;
import com.kwai.framework.network.keyconfig.TimeRange;
import yb6.d;
import wu8.p;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.List;
import com.kwai.framework.activitycontext.ActivityContext;
import com.google.gson.JsonObject;
import com.kwai.robust.Robust;
import o56.d;
import com.google.gson.JsonArray;
import com.kwai.robust2.patchmanager.c;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import com.google.protobuf.nano.MessageNano;
import y96.l;
import java.util.Queue;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.reflect.Field;
import com.kwai.framework.network.sntp.a;
import o56.c;
import com.kuaishou.aegon.Aegon;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.aegon.k;
import io.b$a;
import io.b;
import k2b.z;

public class b implements o0	// class@000b8f
{
    public final String A;
    public final String B;
    public final ImmutableList C;
    public String D;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public Map f;
    public Map g;
    public Map h;
    public Map i;
    public final c j;
    public final c k;
    public final c l;
    public final d m;
    public final f n;
    public final f o;
    public final h p;
    public final b q;
    public final d r;
    public b s;
    public String t;
    public m u;
    public int v;
    public boolean w;
    public boolean x;
    public final String y;
    public final String z;
    public static final long E;
    public static final long F;
    public static final long G;
    public static final long H;
    public static final long I;
    public static final long J;
    public static final long K;
    public static final long L;
    public static final long M;
    public static final long N;
    public static final ImmutableMap O;
    public static final String P;
    public static final String Q;
    public static final String R;

    static {
       TimeUnit sECONDS = TimeUnit.SECONDS;
       b.E = sECONDS.toMillis(10);
       b.F = sECONDS.toMillis(10);
       b.G = sECONDS.toMillis(120);
       b.H = sECONDS.toMillis(15);
       b.I = sECONDS.toMillis(120);
       b.J = sECONDS.toMillis(4);
       b.K = sECONDS.toMillis(4);
       b.L = sECONDS.toMillis(1);
       b.M = sECONDS.toMillis(15);
       b.N = sECONDS.toMillis(120);
       b.O = ImmutableMap.of();
       RouteType aPI = RouteType.API;
       b.P = b.d("n/clc/show", aPI);
       b.Q = b.d("n/clc/click2", aPI);
       b.R = b.d("n/log/client/usertrack/collect", RouteType.ULOG);
    }
    public void b(Context p0){
       b uob = this;
       Context uContext = p0;
       super();
       uob.f = null;
       uob.g = null;
       uob.h = null;
       uob.i = null;
       uob.r = new b$a(uob);
       uob.v = -1;
       RouteType uLOG = RouteType.ULOG;
       String str = b.d("n/log/client/collect", uLOG);
       uob.y = str;
       String str1 = b.d("n/log/client/realtime/collect", uLOG);
       uob.z = str1;
       String str2 = b.d("n/log/client/hp/collect", uLOG);
       uob.A = str2;
       String str3 = b.d("mina/log/collect", uLOG);
       uob.B = str3;
       String[] stringArray = new String[]{"NEARBY","CORONA_PAGE","THANOS_FIND","MENU","OP_ACTIVITY_PAGE","TOP_CHANNEL_XIAODIAN","LIVE_NAVIGATION","NEARBY_SCHOOL","CENTER_TASK","EXPLORE","EXPLORE_SIMPLE_LIVE","SEARCH_HOME_PAGE","USER_TAG_SEARCH","SEARCH_HOME_GENERAL","SEARCH_RESULT_GENERAL","TV_STATION","FIND_JOB_TAB_KRN","DISCOVER_LIFE","SCHOOL_MAP"};
       uob.C = ImmutableList.of("MY_PROFILE", "MESSAGE", "NOTIFICATIONS", "INTERACTIONS", "NEWS", "FEATURED_PAGE", "FEATURED_LIVE", "FRIENDS", "HOT", "THANOS_HOT", "FOLLOW", "FIND", stringArray);
       uob.D = "";
       uob.a = SystemUtil.r(p0);
       uob.b = uob.c(uContext, m.a);
       uob.c = uob.c(uContext, "mini_program_log");
       uob.d = uob.c(uContext, "rt_clc_log");
       uob.e = uob.c(uContext, "user_track_log");
       uob.j = new c(uContext, str2, Channel.REAL_TIME);
       Channel hIGH_FREQ = Channel.HIGH_FREQ;
       uob.k = new c(uContext, str1, hIGH_FREQ);
       Channel nORMAL = Channel.NORMAL;
       uob.l = new c(uContext, str, nORMAL);
       uob.m = new d(uContext, str3, nORMAL);
       uob.n = new f(uContext, b.P, Channel.REAL_SHOW);
       uob.o = new f(uContext, b.Q, Channel.CLICK2);
       str = b.R;
       uob.p = new h(uContext, str, Channel.USER_TRACK);
       b uob1 = new b(hIGH_FREQ);
       uob.q = uob1;
       uob1.k = str1;
       uob1.l = str;
       uob.u = new m();
    }
    public boolean A1(ClientLog$ReportEvent p0){
       ClientLog$ReportEvent obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.eventPackage;
       if (obj != null) {
          if (obj.launchEvent != null || obj.firstLaunchEvent != null) {
             return (a.t().d("disableABExperimentInLaunchEvent", false) ^ 0x01);
          }
       }else {
          p0 = p0.statPackage;
          if (p0 != null && p0.appUsageStatEvent != null) {
             return (a.t().d("disableABExperimentInAppUsageEvent", false) ^ 0x01);
          }
       }
       return false;
    }
    public c B1(){
       int cid;
       c obj = PatchProxy.apply(null, this, b.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       CellLocation uCellLocatio = c.b(a.b());
       if (uCellLocatio instanceof GsmCellLocation) {
          cid = uCellLocatio.getCid();
       }else if(uCellLocatio instanceof CdmaCellLocation){
          cid = uCellLocatio.getBaseStationId();
       }else {
          cid = -1;
       }
       obj.b = cid;
       obj.a = m.a(a.b());
       return obj;
    }
    public m C1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, b.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.i == null) {
          obj = new HashMap(2);
          this.i = obj;
          Channel uSER_TRACK = Channel.USER_TRACK;
          Object obj1 = PatchProxy.apply(objArray, objArray, c.class, "2");
          long l = (obj1 != patchProxyRe)? obj1.longValue(): b.a(0x36463d96).i().f(ApiFeature.REAL_LOG);
          obj.put(uSER_TRACK, h.b(uSER_TRACK, i.a(l, b.L, b.M, b.N), this.p));
       }
       return m.b(this.e, this.i, h.a(this.I1().N(), k.b.get().booleanValue(), this.I1().D()), this.r);
    }
    public boolean D1(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!b.a.getBoolean("diable_log", b) || l.c("enable_proto_debug_log", b)) {
          b = true;
       }
       return b;
    }
    public a E1(){
       return this.q;
    }
    public m F1(){
       HashMap obj = PatchProxy.apply(null, this, b.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          obj = new HashMap();
          this.g = obj;
          Channel nORMAL = Channel.NORMAL;
          obj.put(nORMAL, h.b(nORMAL, i.a(c.d(), b.G, b.H, b.I), this.m));
       }
       return m.b(this.c, this.g, h.a(this.I1().N(), k.b.get().booleanValue(), this.I1().D()), this.r);
    }
    public boolean G1(){
       Object obj = PatchProxy.apply(null, this, b.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.e();
    }
    public String H1(){
       String str = "";
       Object obj = PatchProxy.apply(null, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return q.a.getString(b.d("user")+"UserFlag", str);
       }catch(java.lang.Exception e1){
          ExceptionHandler.handleCaughtException(e1);
          return str;
       }
    }
    public int I(){
       Object obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.v == -1) {
          this.v = (e.a() == 1)? 1: 0;
       }
    label_0026 :
       return this.v;
    }
    public x1 I1(){
       g obj = PatchProxy.apply(null, this, b.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new g();
       }
       return obj;
    }
    public int J1(){
       return -1;
    }
    public String a(){
       return a.m;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, b.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a();
    }
    public final String c(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!SystemUtil.L(p0)) {
          p1 = p1+SystemUtil.r(p0);
       }
       return p1;
    }
    public void d(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c mHost = p0.mHost;
       b ts = this.s;
       if (ts != null) {
          ts.dispose();
       }
       this.s = t.fromCallable(new b(mHost)).subscribeOn(d.c).subscribe(new a(this, mHost, p0, p1), a.b);
       return;
    }
    public int e(){
       return a.q;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       c.b();
       this.u.mBrowseType = p0;
       this.k();
       return;
    }
    public void g(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       c.b();
       this.u.mIsDarkMode = p0;
       this.k();
       return;
    }
    public boolean g1(){
       Object obj = PatchProxy.apply(null, this, b.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.f();
    }
    public String getAppName(){
       return a.w;
    }
    public String getChannel(){
       return a.k;
    }
    public String getDeviceId(){
       return a.a;
    }
    public String getGlobalId(){
       Object obj = PatchProxy.apply(null, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.j();
    }
    public g getLocation(){
       g obj = PatchProxy.apply(null, this, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g();
       LocationCityInfo locationCity = u.d();
       if (locationCity != null) {
          obj.a = locationCity.mAddress;
          obj.g = locationCity.mLatitude;
          obj.h = locationCity.mLongitude;
          obj.d = locationCity.mCityName;
          obj.e = locationCity.mCounty;
          obj.b = locationCity.mCountry;
          obj.c = locationCity.mProvince;
          obj.f = locationCity.mStreet;
       }
       return obj;
    }
    public String getOAID(){
       Object obj = PatchProxy.apply(null, this, b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(a.d());
    }
    public String getPackageName(){
       return a.v;
    }
    public int getPlatform(){
       return 1;
    }
    public String getStyleType(){
       Object obj = PatchProxy.apply(null, this, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SystemUtil.L(a.B)) {
          return TextUtils.k(this.t);
       }
       return b.b();
    }
    public Long getUserId(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME != null && !TextUtils.x(QCurrentUser.ME.getId())) {
          objArray = Long.valueOf(QCurrentUser.ME.getId());
       }
       return objArray;
    }
    public String h(){
       return a.o;
    }
    public int h1(){
       return a.s;
    }
    public void i(int[] p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "13")) {
          return;
       }
       c.b();
       this.u.mTopRecoTabIds = p0;
       p0.mBottomRecoTabIds = p1;
       this.k();
       return;
    }
    public Map i1(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.w == null) {
          obj = b.a(0x36463d96).f();
          if (obj != null) {
             b = true;
             this.w = b;
             obj = obj.mBaseConfig;
             if (obj != null) {
                DegradeConfig uDegradeConf = obj.c();
                Objects.requireNonNull(uDegradeConf);
                Object obj1 = PatchProxy.apply(null, uDegradeConf, DegradeConfig.class, "12");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(uDegradeConf.a().a(d.a())){
                   b1 = uDegradeConf.mDisableClientLogAbConfig;
                }else {
                   b1 = null;
                }
                if (b1 != null) {
                label_0059 :
                   this.x = b;
                }
             }
             b = false;
             goto label_0059 ;
          }
       }
       if (this.x != null) {
          return b.O;
       }else {
          try{
             Map map = p.d().b();
             HashMap hashMap = new HashMap(map.size());
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                hashMap.put(key, a.a.x(uEntry.getValue()).toString());
             }
             return hashMap;
          }catch(java.lang.IllegalStateException e0){
             return null;
          }
       }
    }
    public String j(){
       return a.l;
    }
    public int j1(){
       Object obj = PatchProxy.apply(null, this, b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(b.a() >> 20);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       this.t = a.a.q(this.u);
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("StyleTypeInfo", this.t);
       g.a(uEditor);
       return;
    }
    public m k1(){
       long h;
       Map map = this;
       HashMap obj = PatchProxy.apply(null, map, b.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (map.f == null) {
          obj = new HashMap();
          map.f = obj;
          Channel rEAL_TIME = Channel.REAL_TIME;
          h = b.H;
          long i = b.I;
          obj.put(rEAL_TIME, h.b(rEAL_TIME, i.a(c.d(), b.E, h, i), map.j));
          rEAL_TIME = Channel.HIGH_FREQ;
          long l = h;
          long l1 = i;
          map.f.put(rEAL_TIME, h.b(rEAL_TIME, i.a(c.d(), b.F, l, l1), map.k));
          rEAL_TIME = Channel.NORMAL;
          map.f.put(rEAL_TIME, h.b(rEAL_TIME, i.a(c.d(), b.G, l, l1), map.l));
       }
       return m.b(map.b, map.f, h.a(this.I1().N(), k.b.get().booleanValue(), this.I1().D()), map.r);
    }
    public String l1(){
       return a.b;
    }
    public List m1(){
       return this.C;
    }
    public boolean n1(){
       Object obj = PatchProxy.apply(null, this, b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (ActivityContext.g().h() ^ 0x01);
    }
    public String o1(){
       String e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, uob, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = new JsonObject();
          e = a.E;
          uob = PatchProxy.apply(objArray, this, uob, "19");
          if (uob != patchProxyRe) {
          }else if(TextUtils.x(this.D)){
             this.D = Robust.get().getRobustId(a.b());
          }
          uob = this.D;
       }catch(java.lang.Exception e0){
       }
          obj.c0(e, uob);
          obj.c0(d.l, d.k);
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = c.a().b().iterator();
          while (iterator.hasNext()) {
             jsonArray.a0(iterator.next());
          }
          obj.G(d.m, jsonArray);
          return obj.toString();
    }
    public String p1(){
       Object obj = PatchProxy.apply(null, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(a.c);
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(a.g);
    }
    public String q1(ClientLog$ReportEvent p0){
       l b;
       object oobject;
       MessageNano messageNano;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, b.class, "41");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       try{
          LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
          linkedBlocki.add(l.a(p0, "reportEvent"));
          while (true) {
             if (linkedBlocki.isEmpty()) {
                return obj;
             }
             l ol = linkedBlocki.remove();
             b = ol.b;
             String str = "SF2020";
             if (b instanceof ClientEvent$TaskEvent) {
                ol = PatchProxy.applyOneRefs(b, obj, uoc, "7");
                if (ol != patchProxyRe) {
                   obj = ol;
                }else {
                   ClientEvent$TaskEvent urlPackage = b.urlPackage;
                   if (urlPackage == null || !c.c(urlPackage)) {
                      urlPackage = b.elementPackage;
                      if (urlPackage == null || !c.a(urlPackage)) {
                         urlPackage = b.action2;
                         if (urlPackage == null || !urlPackage.contains(str)) {
                         label_0066 :
                            return obj;
                         }
                      }
                   }
                   obj = str;
                   goto label_0066 ;
                }
             }else if(b instanceof ClientStat$VideoStatEvent){
                ol = PatchProxy.applyOneRefs(b, obj, uoc, "8");
                if (ol != patchProxyRe) {
                   obj = ol;
                   break ;
                }else {
                   ClientStat$VideoStatEvent urlPackage1 = b.urlPackage;
                   if (urlPackage1 == null || urlPackage1.page != 0x75d8) {
                      if (urlPackage1 == null || !(urlPackage1.page2).contains(str)) {
                         urlPackage1 = b.referUrlPackage;
                         if (urlPackage1 == null || !(urlPackage1.page2).contains(str)) {
                            break ;
                         }
                      }
                      obj = str;
                      break ;
                   }
                }
             }else {
                String str1 = "refer";
                if (b instanceof ClientEvent$UrlPackage && (!(ol.a).contains(str1) && c.c(ol.b))) {
                   return str;
                }
                if (ol.b instanceof ClientEvent$ElementPackage && (!(ol.a).contains(str1) && c.a(ol.b))) {
                   return str;
                }
                Field[] declaredFiel = ol.b.getClass().getDeclaredFields();
                int len = declaredFiel.length;
                int i = 0;
                while (i < len) {
                   try{
                      oobject = declaredFiel[i];
                      if (oobject != null) {
                         boolean b1 = true;
                         oobject.setAccessible(b1);
                         messageNano = oobject.get(ol.b);
                      }
                   label_0103 :
                      i = i + 1;
                   }catch(java.lang.IllegalAccessException e0){
                      messageNano = obj;
                   }catch(java.lang.NullPointerException e0){
                   }
                   if (!messageNano instanceof MessageNano) {
                      goto label_0103 ;
                   }else {
                      linkedBlocki.add(l.a(messageNano, oobject.getName()));
                      goto label_0103 ;
                   }
                }
             }
          }
          return obj;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public int r1(){
       return 1;
    }
    public m s1(){
       long m;
       HashMap obj = PatchProxy.apply(null, this, b.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          obj = new HashMap();
          this.h = obj;
          Channel rEAL_SHOW = Channel.REAL_SHOW;
          m = b.M;
          long n = b.N;
          obj.put(rEAL_SHOW, h.b(rEAL_SHOW, i.a(c.e(), b.J, m, n), this.n));
          rEAL_SHOW = Channel.CLICK2;
          this.h.put(rEAL_SHOW, h.b(rEAL_SHOW, i.a(c.e(), b.K, m, n), this.o));
       }
       return m.b(this.d, this.h, h.a(this.I1().N(), k.b.get().booleanValue(), this.I1().D()), this.r);
    }
    public Long t1(){
       Object obj = PatchProxy.apply(null, this, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3b1f7b44).b();
    }
    public boolean u1(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (a.a().c() && l.c("enable_log_visible", b)) {
          b = true;
       }
       return b;
    }
    public String v1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, b.class, "42");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, Aegon.class, "30");
       if (obj != patchProxyRe) {
       }else if(!Aegon.f.get()){
          obj = "";
       }else {
          obj = b.b(k.a);
       }
       return obj;
    }
    public String w(){
       return a.f;
    }
    public boolean w1(){
       return true;
    }
    public z x1(){
       Object obj = PatchProxy.apply(null, this, b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0xe0ff4fb);
    }
    public String y1(){
       return a.u;
    }
    public String z1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.me() != null && !TextUtils.x(QCurrentUser.me().getPreUserId())) {
          objArray = QCurrentUser.me().getPreUserId();
       }
       return objArray;
    }
}

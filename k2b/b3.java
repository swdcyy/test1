package k2b.b3;
import android.content.Context;
import k2b.o0;
import k2b.c;
import java.lang.Object;
import com.yxcorp.gifshow.log.NetworkChangeReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import zk.d;
import com.google.gson.Gson;
import com.google.protobuf.nano.MessageNano;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import xj8.c;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowPage;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import bw.a$b;
import yj8.e;
import java.lang.reflect.Field;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.packages.nano.ClientCommon$AppPackage;
import com.yxcorp.utility.TextUtils;
import java.util.Locale;
import com.yxcorp.utility.AbiUtil;
import com.google.common.collect.ImmutableList;
import y2b.b;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import java.lang.Boolean;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$DevicePackage;
import com.kuaishou.client.log.packages.nano.ClientBase$NetworkPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$LocationPackage;
import java.util.Map;
import com.kuaishou.client.log.packages.nano.ClientBase$Experiment;
import com.kuaishou.client.log.packages.nano.ClientBase$TimePackage;
import com.google.common.base.Optional;
import com.yxcorp.utility.SystemUtil;
import com.google.gson.JsonElement;
import k2b.k3;
import java.util.AbstractCollection;
import n2b.g;
import f3b.h;
import k2b.x;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import k2b.r;
import q2b.g;
import java.lang.Number;
import f3b.k;
import java.util.Objects;
import com.yxcorp.gifshow.log.w;
import ekd.p0;
import java.lang.CharSequence;
import com.kuaishou.client.log.packages.nano.ClientBase$LteMobileCellInfo;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import q2b.c;
import vk7.g0;
import java.util.TimeZone;
import com.google.common.collect.ImmutableMap$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import f3b.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.UUID;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.o;
import org.json.JSONObject;
import f3b.u;
import java.lang.System;
import com.google.common.collect.ImmutableMap;
import java.lang.Exception;
import k2b.b;
import java.util.List;
import com.yxcorp.gifshow.log.b;
import k2b.k2;
import java.util.Collection;
import f3b.v;
import qk.t0;
import ok.n;
import android.content.ComponentName;

public class b3	// class@001b8c
{
    public final o0 a;
    public final Context b;
    public String c;
    public String d;
    public w e;
    public NetworkChangeReceiver f;
    public c g;
    public final Gson h;

    public void b3(Context p0,o0 p1,c p2){
       super();
       this.d = "";
       this.a = p1;
       this.b = p0;
       NetworkChangeReceiver networkChang = new NetworkChangeReceiver();
       try{
          this.f = networkChang;
          UniversalReceiver.e(p0, this.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       }catch(java.lang.Exception e2){
          Log.h("ReportEvents", "Error while registering receiver", e2);
       }
       this.g = p2;
       d uod = new d();
       uod.c();
       this.h = uod.b();
       return;
    }
    public static String k(MessageNano p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b3.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof ClientLog$ReportEvent) {
          return b3.l(p0);
       }
       if (p0 instanceof c) {
          return b3.m(p0);
       }
       if (p0 instanceof ClickLogs$ClickLog) {
          return "Click2";
       }
       if (p0 instanceof RealShowLogs$RealShowPage) {
          return "RealShow";
       }
       if (p0 instanceof ClientCommentShowLogs$ClientCommentShowPage) {
          return "CommentShow";
       }
       if (p0 instanceof CoverShowLogs$CoverShowPage) {
          return "CoverShow";
       }
       if (p0 instanceof a$b) {
          return "UserTrackLog";
       }
       return "unknown";
    }
    public static String l(ClientLog$ReportEvent p0){
       ClientLog$ReportEvent obj = PatchProxy.applyOneRefs(p0, null, b3.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.eventPackage;
       if (obj != null) {
          return b3.n(obj);
       }
       p0 = p0.statPackage;
       if (p0 != null) {
          return b3.n(p0);
       }
       return "unknown";
    }
    public static String m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b3.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.f;
       if (p0 != null) {
          return String.valueOf(p0.a);
       }
       return "unknown";
    }
    public static String n(MessageNano p0){
       object oobject;
       Field[] obj = PatchProxy.applyOneRefs(p0, null, b3.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass().getFields();
       if (obj == null) {
          return "";
       }
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "";
          }
          oobject = obj[i];
          boolean b = true;
          try{
             oobject.setAccessible(b);
             if (oobject.get(p0) instanceof MessageNano) {
                break ;
             }else {
                i = i + 1;
             }
          }catch(java.lang.IllegalAccessException e0){
          }
       }
       return oobject.getName();
    }
    public ClientCommon$AppPackage a(CommonParams p0){
       ClientCommon$AppPackage obj = PatchProxy.applyOneRefs(p0, this, b3.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientCommon$AppPackage();
       obj.versionName = this.a.a();
       obj.versionCode = this.a.e();
       obj.hotfixPatchVersion = TextUtils.k(this.a.h());
       obj.channel = this.a.getChannel();
       obj.newOc = this.a.j();
       obj.language = Locale.getDefault().getLanguage();
       obj.platform = this.a.getPlatform();
       obj.androidOs = this.a.I();
       obj.product = this.a.r1();
       obj.packageName = TextUtils.k(this.a.getPackageName());
       obj.buildType = this.a.h1();
       if (p0 != null) {
          obj.container = TextUtils.k(p0.mContainer);
       }
       int i = (AbiUtil.b())? 2: 1;
       obj.abi = i;
       obj.robustInfo = TextUtils.k(this.a.o1());
       return obj;
    }
    public ClientCommon$CommonPackage b(boolean p0,CommonParams p1,ImmutableList p2,b p3,boolean p4){
       ClientCommon$CommonPackage obj1;
       CommonParams uCommonParam;
       String str2;
       String str5;
       Object obj = this;
       object oobject = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b3 uob3 = b3.class;
       int i = 5;
       if (PatchProxy.isSupport(uob3)) {
          Object[] objArray = new Object[i];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Boolean.valueOf(p4);
          obj1 = PatchProxy.apply(objArray, obj, uob3, "12");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = new ClientCommon$CommonPackage();
       obj1.identityPackage = this.f();
       obj1.appPackage = obj.a(oobject);
       obj1.devicePackage = this.d();
       obj1.networkPackage = this.h();
       obj1.locationPackage = this.g();
       Map map = (p0)? obj.a.i1(): null;
       obj1.experiment = obj.e(map);
       obj1.timePackage = this.i();
       String str = "";
       obj1.styleType = Optional.fromNullable(obj.a.getStyleType()).or(str);
       String str1 = (obj.a.w1())? SystemUtil.r(obj.b): null;
       if (oobject != null) {
          obj1.serviceName = TextUtils.k(oobject.mServiceName);
          obj1.subBiz = TextUtils.k(oobject.mSubBiz);
          obj1.needEncrypt = oobject.mNeedEncrypt;
          obj1.h5ExtraAttr = TextUtils.k(oobject.mH5ExtraAttr);
          uCommonParam = oobject.mCsLogCorrelateInfo;
          str2 = TextUtils.k(oobject.mActivityTag);
       }else {
          uCommonParam = null;
          str2 = str;
       }
       if (p4) {
          obj1.globalAttr = obj.o(null, null, null, null);
       }else {
          try{
             int b = obj.a.n1();
             if (PatchProxy.isSupport(uob3)) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = str2;
                objArray1[1] = p2;
                objArray1[2] = str1;
                objArray1[3] = Boolean.valueOf(b);
                objArray1[4] = uCommonParam;
                k3 obj2 = PatchProxy.apply(objArray1, obj, uob3, "30");
                if (obj2 != patchProxyRe) {
                   str = obj2;
                }else {
                label_00f4 :
                   obj2 = this.r();
                   obj2 = (p2 == null || p2.isEmpty())? obj2.b: p2;
                   String str3 = "1";
                   String str4 = (obj.a.g1())? str3: null;
                   if (obj.a.g1()) {
                      if (!obj.a.G1()) {
                         str3 = "0";
                      }
                      str5 = str3;
                   }else {
                      str5 = null;
                   }
                   String str6 = (g.b())? null: obj2;
                   b3 h = obj.h;
                   String str7 = obj.a.v1();
                   boolean b1 = (!h.b(1))? true: false;
                   str = h.q(x.b(str6, str2, str1, str7, b1, uCommonParam, str4, str5));
                }
             }else {
                goto label_00f4 ;
             }
          }catch(java.lang.Exception e0){
             Log.h("ReportEvents", "get global_attr error is : ", e0);
          }
          obj1.globalAttr = str;
       }
       if (p3 != null) {
          obj1.commonStid = p3.i();
       }
       return obj1;
    }
    public ClientCommon$CommonPackage c(boolean p0,CommonParams p1,b p2,boolean p3){
       if (PatchProxy.isSupport(b3.class)) {
          Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, b3.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b(p0, p1, null, p2, p3);
    }
    public ClientBase$DevicePackage d(){
       ClientBase$DevicePackage obj = PatchProxy.apply(null, this, b3.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientBase$DevicePackage();
       obj.osVersion = String.valueOf(Build$VERSION.SDK_INT);
       obj.model = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       return obj;
    }
    public ClientBase$Experiment[] e(Map p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ClientBase$Experiment uExperiment = new ClientBase$Experiment();
             uExperiment.name = uEntry.getKey();
             uExperiment.value = uEntry.getValue();
             obj.add(uExperiment);
          }
       }
       ClientBase$Experiment[] uExperimentA = new ClientBase$Experiment[0];
       return obj.toArray(uExperimentA);
    }
    public ClientBase$IdentityPackage f(){
       ClientBase$IdentityPackage obj = PatchProxy.apply(null, this, b3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientBase$IdentityPackage();
       obj.userId = Optional.fromNullable(this.a.getUserId()).or(Long.valueOf(0)).longValue();
       r.c(obj);
       obj.deviceIdTag = this.a.q();
       obj.randomDeviceId = this.a.w();
       obj.userFlag = TextUtils.k(this.a.H1());
       obj.globalId = TextUtils.k(this.a.getGlobalId());
       obj.oldDeviceId = TextUtils.k(this.a.l1());
       obj.pUserId = TextUtils.k(this.a.z1());
       return obj;
    }
    public ClientBase$LocationPackage g(){
       ClientBase$LocationPackage obj = PatchProxy.apply(null, this, b3.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientBase$LocationPackage();
       g location = this.a.getLocation();
       if (location != null) {
          obj.city = TextUtils.k(location.d);
          obj.county = TextUtils.k(location.e);
          obj.country = TextUtils.k(location.b);
          obj.latitude = location.g;
          obj.longitude = location.h;
          obj.province = TextUtils.k(location.c);
          obj.street = TextUtils.k(location.f);
          obj.unnormalized = TextUtils.k(location.a);
       }
       return obj;
    }
    public ClientBase$NetworkPackage h(){
       int i;
       c uoc;
       int i1;
       int i2;
       b3 uob3 = b3.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ClientBase$NetworkPackage obj = PatchProxy.apply(objArray, this, uob3, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientBase$NetworkPackage();
       obj.ip = "";
       String str = "8";
       b3 obj1 = PatchProxy.apply(objArray, this, uob3, str);
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          i = this.f.a();
          if (!i) {
             i = k.b(this.b);
          }else if(i == 6){
             i = k.b(this.b);
          }
       }
       obj.type = i;
       if (this.e != null) {
          obj1 = this.e;
          Objects.requireNonNull(obj1);
          String str1 = PatchProxy.apply(objArray, obj1, w.class, "5");
          if (str1 != patchProxyRe) {
          }else if(obj1.l == null){
             str1 = p0.p(obj1.k);
          }else if(TextUtils.x(obj1.b)){
             obj1.b = p0.p(obj1.k);
          }
          str1 = obj1.b;
          obj.isp = str1;
       }else {
          obj.isp = p0.p(this.b);
       }
       ClientBase$NetworkPackage type = obj.type;
       if (type != 3 && (type != 8 && (type == 9 || type == 7))) {
          ClientBase$LteMobileCellInfo lteMobileCel = PatchProxy.apply(objArray, this, uob3, "10");
          if (lteMobileCel != patchProxyRe) {
          }else {
             lteMobileCel = new ClientBase$LteMobileCellInfo();
             if (this.e != null) {
                if (n.A1().B()) {
                   o0 l = n.L;
                   if (l != null) {
                      uoc = l.B1();
                   }else {
                   label_00bb :
                      obj1 = this.e;
                      Objects.requireNonNull(obj1);
                      w obj4 = PatchProxy.apply(objArray, obj1, w.class, "6");
                      if (obj4 != patchProxyRe) {
                         uoc = obj4;
                      }else if(obj1.l == null){
                         uoc = n.L.B1();
                      }else {
                         obj4 = obj1.f;
                         if (obj4.a == -1 || obj4.b == -1) {
                            o0 l1 = n.L;
                            if (l1 != null) {
                               obj1.f = l1.B1();
                            }
                         }
                         uoc = obj1.f;
                      }
                   }
                }else {
                   goto label_00bb ;
                }
                lteMobileCel.cid = uoc.b;
                lteMobileCel.lac = uoc.a;
                lteMobileCel.rssi = this.e.a();
                obj1 = this.e;
                Objects.requireNonNull(obj1);
                b3 obj2 = PatchProxy.apply(objArray, obj1, w.class, str);
                if (obj2 != patchProxyRe) {
                   i1 = obj2.intValue();
                }else if(obj1.l == null){
                   i1 = p0.q(obj1.k);
                }else if(obj1.e == -1){
                   obj1.e = p0.q(obj1.k);
                }
                i1 = obj1.e;
                lteMobileCel.mcc = i1;
                obj2 = this.e;
                Objects.requireNonNull(obj2);
                Object obj3 = PatchProxy.apply(objArray, obj2, w.class, "7");
                if (obj3 != patchProxyRe) {
                   i2 = obj3.intValue();
                }else if(obj2.l == null){
                   i2 = p0.r(obj2.k);
                }else if(obj2.d == -1){
                   obj2.d = p0.r(obj2.k);
                }
                i2 = obj2.d;
                lteMobileCel.mnc = i2;
                b3 uob31 = (!g0.a(this.b, "android.permission.READ_PHONE_STATE"))? 1: null;
                if (uob31 && this.a.b()) {
                   lteMobileCel.imei = Optional.fromNullable(SystemUtil.m(this.b)).or("");
                   lteMobileCel.imsi = Optional.fromNullable(SystemUtil.n(this.b)).or("");
                }
                lteMobileCel.rsrq = this.e.h;
                lteMobileCel.rsrp = this.e.g;
                lteMobileCel.cqi = this.e.i;
                lteMobileCel.rssnr = this.e.j;
             }
          }
          obj.lteCellInfo = lteMobileCel;
       }
       return obj;
    }
    public ClientBase$TimePackage i(){
       ClientBase$TimePackage obj = PatchProxy.apply(null, this, b3.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientBase$TimePackage();
       Long longx = this.a.t1();
       if (longx != null) {
          obj.syncStatus = 1;
          obj.clientTimeDifference = longx.longValue();
       }
       if (TextUtils.x(this.c)) {
          TimeZone default = TimeZone.getDefault();
          this.c = default.getDisplayName(false, false)+" "+default.getID();
       }
       obj.timeZone = this.c;
       return obj;
    }
    public a$b j(ClientLog$ReportEvent p0,ImmutableMap$b p1){
       String str3;
       String str4;
       String str5;
       ClientEvent$EventPackage taskEvent1;
       ClientEvent$TaskEvent interStidCon;
       ClientEvent$TaskEvent interStExPar;
       ClientEvent$ClickEvent urlPackage1;
       ClientEvent$EventPackage showEvent;
       a$b obj = PatchProxy.applyTwoRefs(p0, p1, this, b3.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$b();
       obj.e = TextUtils.k(p0.commonPackage.identityPackage.deviceId);
       ClientLog$ReportEvent commonPackag = p0.commonPackage;
       obj.f = commonPackag.identityPackage.userId;
       obj.g = TextUtils.k(commonPackag.devicePackage.osVersion);
       obj.h = TextUtils.k(p0.commonPackage.devicePackage.model);
       ClientCommon$CommonPackage networkPacka = p0.commonPackage.networkPackage;
       obj.i = networkPacka.type;
       obj.j = TextUtils.k(networkPacka.isp);
       obj.k = TextUtils.k(p0.commonPackage.locationPackage.unnormalized);
       commonPackag = p0.commonPackage;
       ClientCommon$CommonPackage locationPack = commonPackag.locationPackage;
       obj.l = locationPack.latitude;
       obj.m = locationPack.longitude;
       networkPacka = commonPackag.appPackage;
       obj.n = networkPacka.product;
       obj.o = networkPacka.platform;
       obj.p = TextUtils.k(networkPacka.versionName);
       commonPackag = p0.commonPackage;
       obj.q = commonPackag.appPackage.buildType;
       networkPacka = commonPackag.commonStid;
       String str = "";
       StidContainerProto$StidPackage stidMerge = (networkPacka != null)? networkPacka.stidMerge: str;
       obj.t = TextUtils.k(stidMerge);
       String str1 = b3.l(p0);
       Objects.requireNonNull(str1);
       String str2 = -1;
       int i = str1.hashCode();
       ClientEvent$TaskEvent taskEvent = 2;
       ClientLog$ReportEvent reportEvent = 1;
       if (i != -1927283299) {
          if (i != -800853518) {
             if (i == 0x95af815 && str1.equals("taskEvent")) {
                str2 = 2;
             }
          }else if(!str1.equals("clickEvent")){
             str2 = 1;
          }
       }else if(!str1.equals("showEvent")){
          str2 = null;
       }
       ClientEvent$UrlPackage urlPackage = null;
       if (str2) {
          if (str2 != reportEvent) {
             if (str2 != taskEvent) {
                obj.r = str;
                obj.A = str;
                str2 = str;
                str3 = str2;
                str4 = str3;
                StidContainerProto$StidContainer stidContaine = urlPackage;
             label_013a :
                urlPackage = (urlPackage != null)? urlPackage.userRouteTrace: str;
                obj.u = TextUtils.k(urlPackage);
                obj.v = str1;
                obj.w = str4;
                obj.x = str2;
                str1 = UUID.randomUUID().toString();
                try{
                   obj.y = str1;
                   networkPacka = p0.commonPackage.commonStid;
                   if (networkPacka != null) {
                      str1 = o.k(networkPacka.stidContainer);
                   label_0164 :
                      obj.s = TextUtils.k(str1);
                      networkPacka = p0.commonPackage.commonStid;
                      if (networkPacka != null) {
                         str = networkPacka.stExParams;
                      }
                      obj.B = TextUtils.k(str);
                      obj.r = TextUtils.k(u.j(stidContaine).toString());
                      obj.A = TextUtils.k(str3);
                      obj.a = System.currentTimeMillis();
                      obj.z = this.h.q(p1.a());
                      ClientCommon$CommonPackage commonStid = p0.commonPackage.commonStid;
                      if (commonStid != null) {
                         obj.C = commonStid.stMergeArray;
                      }
                   }else {
                      str1 = str;
                      goto label_0164 ;
                   }
                }catch(java.lang.Exception e10){
                   Log.h("ReportEvents", "userTrackLog params to string exception", e10);
                   e10.printStackTrace();
                }
                return obj;
             }else {
                taskEvent1 = p0.eventPackage.taskEvent;
                interStidCon = taskEvent1.interStidContainer;
                interStExPar = taskEvent1.interStExParams;
                taskEvent = taskEvent1.urlPackage;
                str2 = f.c(taskEvent1);
                str4 = f.e(p0.eventPackage.taskEvent);
             }
          }else {
             taskEvent1 = p0.eventPackage.clickEvent;
             interStidCon = taskEvent1.interStidContainer;
             interStExPar = taskEvent1.interStExParams;
             urlPackage1 = taskEvent1.urlPackage;
             str2 = f.c(taskEvent1);
             str4 = f.e(p0.eventPackage.clickEvent);
          }
       }else {
          showEvent = p0.eventPackage.showEvent;
          ClientEvent$ShowEvent interStidCon1 = showEvent.interStidContainer;
          interStExPar = showEvent.interStExParams;
          str1 = (f.g(showEvent.action))? "pageShowEvent": "elementShowEvent";
          ClientEvent$EventPackage showEvent1 = p0.eventPackage.showEvent;
          urlPackage1 = showEvent1.urlPackage;
          str4 = f.e(p0.eventPackage.showEvent);
          interStidCon = interStidCon1;
          str2 = f.c(showEvent1);
       }
       interStExPar = interStidCon;
       interStidCon = taskEvent;
       str3 = interStExPar;
       goto label_013a ;
    }
    public final String o(String p0,ImmutableList p1,String p2,JsonElement p3){
       String str2;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b3.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          String str = "1";
          String str1 = (this.a.g1())? str: null;
          if (this.a.g1()) {
             if (!this.a.G1()) {
                str = "0";
             }
             str2 = str;
          }else {
             str2 = null;
          }
          ImmutableList immutableLis = (g.b())? null: p1;
          b3 th = this.h;
          String str3 = this.a.v1();
          boolean b = (!h.b(true))? true: false;
          return th.q(x.b(immutableLis, p0, p2, str3, b, p3, str1, str2));
       }catch(java.lang.Exception e12){
          Log.h("ReportEvents", "get global_attr error is : ", e12);
          return "";
       }
    }
    public Gson p(){
       return this.h;
    }
    public final int q(){
       Object obj = PatchProxy.apply(null, this, b3.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e == null) {
          return Integer.MAX_VALUE;
       }
       if (this.f.a() == 2) {
          if (!this.a.b()) {
             return Integer.MAX_VALUE;
          }
          if (((Build.BRAND).toLowerCase()).contains("vivo") && Build$VERSION.SDK_INT <= 23) {
             return Integer.MAX_VALUE;
          }
          return p0.y(this.b);
       }else if(this.e.b()){
          return this.e.a();
       }else {
          return Integer.MAX_VALUE;
       }
    }
    public k3 r(){
       ImmutableList immutableLis;
       v ov;
       t0 ot0;
       v ov1;
       ImmutableList immutableLis1;
       k2 ok21;
       Object obj = this;
       Object[] obj1 = PatchProxy.apply(null, obj, b3.class, "23");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       if (obj.g.l0() == null) {
          return new k3(uArrayList, uArrayList1, null, uArrayList2);
       }
       Iterator iterator = obj.g.l0().e().iterator();
       obj1 = null;
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          k2 ok2 = obj2.D();
          if (!PatchProxy.applyVoidThreeRefs(obj2, ok2, uArrayList, this, b3.class, "24")) {
             if (ok2.i().isPresent()) {
                uArrayList.addAll(ok2.i().get());
             }else {
                immutableLis = obj2.L();
                if (immutableLis.isEmpty() && obj.s(obj2)) {
                   ov = obj2.G();
                   if (ov != null && ov.d()) {
                      uArrayList.add(ov.g());
                   }
                }else {
                   ot0 = immutableLis.iterator();
                   while (ot0.hasNext()) {
                      ok21 = ot0.next();
                      v ov2 = ok21.q();
                      if (!ok21.i().isPresent() && (ov2 != null && ov2.d())) {
                         uArrayList.add(ov2.g());
                      }
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidThreeRefs(obj2, ok2, uArrayList1, this, b3.class, "25")) {
             if (ok2.h().isPresent() && ok2.h().get().size()) {
                uArrayList1.addAll(ok2.h().get());
             }else {
                immutableLis = obj2.L();
                if (immutableLis.isEmpty() && obj.s(obj2)) {
                   ov = obj2.G();
                   if (ov != null && ov.c()) {
                      immutableLis = ov.b();
                      n.j(immutableLis);
                      uArrayList1.addAll(immutableLis);
                   }
                }else {
                   ot0 = immutableLis.iterator();
                   while (ot0.hasNext()) {
                      ok21 = ot0.next();
                      if (ok21.h().isPresent() && ok21.h().get().size()) {
                         uArrayList1.addAll(ok21.h().get());
                      }else {
                         ov1 = ok21.q();
                         if (ov1 != null && ov1.c()) {
                            immutableLis1 = ov1.b();
                            n.j(immutableLis1);
                            uArrayList1.addAll(immutableLis1);
                         }
                      }
                   }
                }
             }
          }
          b uob = PatchProxy.applyTwoRefs(obj2, ok2, obj, b3.class, "26");
          if (uob != PatchProxyResult.class) {
          }else if(obj2.L().isEmpty() && obj.s(obj2)){
             ov = obj2.G();
             if (ov != null && ov.e()) {
                uob = ov.i();
             }
          }else {
             ov = ok2.q();
             if (ov != null && ov.e()) {
                uob = ov.i();
             }
          }
          uob = null;
          Object obj3 = uob;
          if (!PatchProxy.applyVoidThreeRefs(obj2, ok2, uArrayList2, this, b3.class, "27")) {
             immutableLis = obj2.L();
             if (immutableLis.isEmpty() && obj.s(obj2)) {
                ov = obj2.G();
                if (ov != null && ov.f()) {
                   immutableLis = ov.j();
                   n.j(immutableLis);
                   uArrayList2.addAll(immutableLis);
                }
             }else {
                ot0 = immutableLis.iterator();
                while (ot0.hasNext()) {
                   ov1 = ot0.next().q();
                   if (ov1 != null && ov1.f()) {
                      immutableLis1 = ov1.j();
                      n.j(immutableLis1);
                      uArrayList2.addAll(immutableLis1);
                   }
                }
             }
          }
          obj1 = obj3;
       }
       int i = 10;
       if (uArrayList.size() > i) {
          uArrayList = uArrayList.subList((uArrayList.size() - i), uArrayList.size());
       }
       if (uArrayList1.size() > i) {
          uArrayList1 = uArrayList1.subList((uArrayList1.size() - i), uArrayList1.size());
       }
       if (uArrayList2.size() > i) {
          ArrayList uArrayList3 = new ArrayList();
          uArrayList3.addAll(uArrayList2.subList(0, 5));
          uArrayList3.addAll(uArrayList2.subList((uArrayList2.size() - 5), uArrayList2.size()));
          uArrayList2 = uArrayList3;
       }
       return new k3(uArrayList, uArrayList1, obj1, uArrayList2);
    }
    public final boolean s(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b3.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ComponentName uComponentNa = p0.H();
       boolean b = false;
       if (uComponentNa == null) {
          return b;
       }
       String shortClassNa = uComponentNa.getShortClassName();
       if (shortClassNa != null && shortClassNa.contains("WebViewActivity")) {
          b = true;
       }
       return b;
    }
}

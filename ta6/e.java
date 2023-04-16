package ta6.e;
import com.yxcorp.retrofit.f;
import com.kwai.framework.network.c;
import javax.inject.Provider;
import tpd.a;
import upd.a;
import com.google.common.base.a;
import okhttp3.Request;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ta6.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import f3b.t;
import java.util.Map;
import xf6.l;
import java.util.HashMap;
import xf6.h;
import com.yxcorp.gifshow.util.PermissionUtils;
import oe6.b;
import ta6.b;
import java.util.Iterator;
import java.util.List;
import ta6.j;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import com.yxcorp.retrofit.c$b;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.google.common.base.Optional;
import java.lang.Enum;
import okhttp3.RequestBody;
import okhttp3.MultipartBody;
import okhttp3.FormBody;
import ojd.c;
import okio.b;
import okio.c;
import ta6.r;
import java.lang.RuntimeException;
import java.lang.Throwable;
import wkd.b;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import oe6.a;
import h30.a;
import pb6.o;
import android.graphics.Point;
import com.yxcorp.utility.n;
import o56.d;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.powermode.PowerModeHelper;
import f3b.h;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.retrofit.model.Region;
import java.lang.reflect.Type;
import wb6.c;
import com.kuaishou.weapon.i.WeaponHI;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;
import ta6.e$a;
import ekd.e;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Integer;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import com.yxcorp.gifshow.log.h;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Iterable;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import ekd.a0;
import java.util.Set;
import java.util.Map$Entry;
import android.util.Pair;

public class e extends f	// class@00248e
{
    public final a b;
    public static String c;
    public static String d;
    public static Point e;
    public static String f;
    public static String g;
    public static Long h;
    public static Integer i;
    public static Integer j;
    public static final a k;

    static {
       e.k = a.a(c.a);
    }
    public void e(){
       super();
       this.b = a.f(',');
    }
    private boolean h(Request p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Boolean.parseBoolean(p0.header("useSig3")))? true: false;
       PatchProxy.onMethodExit(e.class, "9");
       return b;
    }
    public static String t(){
       String obj = PatchProxy.applyWithListener(null, null, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(e.c)) {
          obj = a.g();
          e.c = obj;
          if (TextUtils.isEmpty(obj)) {
             obj = t.a(a.a().a());
             e.c = obj;
             a.o(obj);
          }
       }
       PatchProxy.onMethodExit(e.class, "12");
       return e.c;
    }
    public Map a(){
       Map obj = PatchProxy.applyWithListener(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       if (a.a().c()) {
          String str = "trace-context";
          String str1 = l.g(str, "");
          if (!TextUtils.isEmpty(str1)) {
             obj.put(str, str1);
          }
          str = (h.w())? "1": "0";
          obj.put("X-KTrace-Id-Enabled", str);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return obj;
    }
    public void b(Map p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "4")) {
          return;
       }
       super.b(p0);
       if (!(this.q()).isEmpty()) {
          this.e(p0, "tfcOpOrderList", this.q());
       }
       this.e(p0, "cs", String.valueOf(PermissionUtils.a(a.a().a(), "android.permission.READ_CONTACTS")));
       this.e(p0, "uQaTag", a.i());
       this.e(p0, "videoModelCrowdTag", b.K());
       Iterator iterator = b.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       PatchProxy.onMethodExit(e.class, "4");
       return;
    }
    public void c(Request p0,Map p1,Map p2,String p3,String p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport2(e.class, "8")) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, e.class, "8")) {
             return;
          }
       }
       c$b uob = e.h().g().createRetrofitConfigSignature();
       if (uob == null) {
          PatchProxy.onMethodExit(e.class, "8");
          return;
       }else {
          RequestTiming dEFAULT = RequestTiming.DEFAULT;
          RequestTiming requestTimin = Optional.fromNullable(oobject.tag(RequestTiming.class)).or(dEFAULT);
          if (requestTimin != dEFAULT) {
             obj.e(oobject1, "apiInvokeTiming", requestTimin.toString());
          }
          try{
             RequestBody requestBody = p0.body();
             boolean b = this.h(p0);
             if (("GET").equalsIgnoreCase(p0.method()) || (requestBody instanceof MultipartBody || (requestBody instanceof FormBody || (requestBody == null || (!requestBody.contentLength() || (requestBody instanceof c || b)))))) {
                i = 0;
             }
             if (i) {
                RequestBody requestBody1 = p0.body();
                b uob1 = new b();
                if (requestBody1 != null) {
                   requestBody1.writeTo(uob1);
                }
                this.u(uob, p0, p1, uob1.readByteArray(), p4);
                PatchProxy.onMethodExit(e.class, "8");
                return;
             }else if(this.h(p0)){
                obj.b(oobject1);
             }
             super.c(p0, p1, p2, p3, p4);
             if (TextUtils.isEmpty(p4)) {
                if (this.h(p0)) {
                   r.a(p0, p1);
                }
                r.a(oobject, oobject2);
             }else {
                r.a(p0, p1);
             }
             PatchProxy.onMethodExit(e.class, "8");
             return;
          }catch(java.io.IOException e0){
             PatchProxy.onMethodExit(e.class, "8");
             throw new RuntimeException(e0);
          }
       }
    }
    public void d(Map p0){
       String str;
       String str1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "3")) {
          return;
       }
       super.d(p0);
       if (a.d()) {
          str = "ks_ipv6_wlan";
          int i = -1554820802;
          if (!p0.containsKey(str)) {
             str1 = b.a(i).b();
             if (!TextUtils.isEmpty(str1)) {
                this.e(p0, str, str1);
             }
          }
          str = "ks_ipv6_cellular";
          if (!p0.containsKey(str)) {
             str1 = b.a(i).a();
             if (!TextUtils.isEmpty(str1)) {
                this.e(p0, str, str1);
             }
          }
       }
    label_004d :
       if (TextUtils.isEmpty(p0.get("egid"))) {
          str = a.u();
          if (TextUtils.isEmpty(str)) {
             str = a.a();
          }
          this.e(p0, "device_info", str);
       }
       if (a.a().c() && l.c("enable_live_post_test", false)) {
          this.e(p0, "isPrivate", "true");
       }
       int i1 = 0x3d855db5;
       int version = b.a(i1).getVersion();
       if (version > 0) {
          this.e(p0, "kcv", String.valueOf(version));
       }
       Point point = this.s();
       if (point != null) {
          this.e(p0, "sw", String.valueOf(point.x));
          this.e(p0, "sh", String.valueOf(point.y));
       }
       str1 = e.c;
       if (str1 == null) {
          str1 = e.t();
       }
       if (str1 != null) {
          this.e(p0, "socName", str1);
       }
       str1 = this.m();
       if (str1 != null) {
          this.e(p0, "boardPlatform", str1);
       }
       this.e(p0, "newOc", a.l);
       Application uApplication = a.a().a();
       if (uApplication != null) {
          this.e(p0, "sbh", String.valueOf(n.A(uApplication)));
          this.e(p0, "nbh", String.valueOf(this.r(uApplication)));
          this.e(p0, "ddpi", String.valueOf(this.n(uApplication)));
          this.e(p0, "totalMemory", e.k.get());
       }
       String str2 = "1";
       if (d.i) {
          str = (b.a(i1).g())? "2": str2;
          this.e(p0, "keyconfig_state", str);
          this.e(p0, "cold_launch_time_ms", String.valueOf(d.h));
       }
       this.e(p0, "abi", this.k());
       if (Build$VERSION.SDK_INT >= 29) {
          this.e(p0, "thermal", PowerModeHelper.b().c());
       }
       Iterator iterator = b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       String str3 = "0";
       str = (h.b(true))? str3: str2;
       this.e(p0, "is_background", str);
       if (b.d) {
          str = (b.b())? str2: str3;
          this.e(p0, "is_app_prelaunch", str);
          if (b.c() == HuaweiSuperAppPrelaunchStage.USER_LAUNCH) {
             str2 = str3;
          }
          this.e(p0, "is_app_prelaunching", str2);
       }
       this.e(p0, "oDid", a.b);
       this.e(p0, "android_os", this.l());
       this.e(p0, "device_abi", this.o());
       if (SystemUtil.P() && uApplication != null) {
          this.e(p0, "package_name", uApplication.getPackageName());
       }
       this.e(p0, "earphoneMode", String.valueOf(this.p()));
       PatchProxy.onMethodExit(e.class, "3");
       return;
    }
    public void j(Map p0){
       String str = "__NSWJ";
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "2")) {
          return;
       }
       super.j(p0);
       String str1 = "11";
       String str2 = PatchProxy.applyWithListener(null, this, e.class, str1);
       if (str2 != PatchProxyResult.class) {
       }else {
          Region region = c.b(Region.class);
          str2 = (region == null)? "": region.b();
          PatchProxy.onMethodExit(e.class, str1);
       }
       if (!str2.isEmpty()) {
          p0.put("region_ticket", str2);
       }
       str2 = e.h().g().G();
       if (!TextUtils.isEmpty(str2)) {
          p0.put("kuaishou.api_st", str2);
       }
       try{
          str2 = WeaponHI.getT();
          if (str2 != null) {
             p0.put(str, str2);
          }
       }catch(java.lang.Exception e0){
          p0.put(e0, "");
       }
       Iterator iterator = b.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public final String k(){
       e uoe = e.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoe, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = e$a.a[AbiUtil.a().ordinal()];
       if (i != 1) {
          if (i != 2) {
             PatchProxy.onMethodExit(uoe, "5");
             return "";
          }else {
             PatchProxy.onMethodExit(uoe, "5");
             return "arm64";
          }
       }else {
          PatchProxy.onMethodExit(uoe, "5");
          return "arm32";
       }
    }
    public final String l(){
       String obj = PatchProxy.applyWithListener(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.g;
       if (obj == null || obj.isEmpty()) {
          obj = a.a();
          e.g = obj;
          if (obj == null || obj.isEmpty()) {
             obj = String.valueOf(e.a());
             e.g = obj;
             a.j(obj);
          }
       }
       PatchProxy.onMethodExit(e.class, "6");
       return e.g;
    }
    public String m(){
       String obj = PatchProxy.applyWithListener(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.d;
       if (obj == null || obj.isEmpty()) {
          obj = a.c();
          e.d = obj;
          if (obj == null || obj.isEmpty()) {
             obj = SystemUtil.g();
             e.d = obj;
             a.l(obj);
          }
       }
       PatchProxy.onMethodExit(e.class, "13");
       return e.d;
    }
    public final int n(Context p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.i == null) {
          e.i = Integer.valueOf(c.c(p0.getResources()).densityDpi);
       }
       PatchProxy.onMethodExit(e.class, "16");
       return e.i.intValue();
    }
    public final String o(){
       String[] obj = PatchProxy.applyWithListener(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(e.f)) {
          PatchProxy.onMethodExit(e.class, "17");
          return e.f;
       }else if(AbiUtil.c()){
          e.f = "arm64";
          PatchProxy.onMethodExit(e.class, "17");
          return "arm64";
       }else {
          obj = AbiUtil.d();
          if (obj == null || obj.length <= 0) {
             e.f = "";
             PatchProxy.onMethodExit(e.class, "17");
             return "";
          }else {
             int len = obj.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject = obj[i];
                   if (("armeabi-v7a").equals(oobject) || ("armeabi").equals(oobject)) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   PatchProxy.onMethodExit(e.class, "17");
                   return "";
                }
             }
             e.f = "arm32";
             PatchProxy.onMethodExit(e.class, "17");
             return "arm32";
          }
       }
    }
    public final int p(){
       e uoe = e.class;
       Boolean obj = PatchProxy.applyWithListener(null, this, uoe, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = HeadsetPlugMonitor.e();
       if (obj == null) {
          PatchProxy.onMethodExit(uoe, "18");
          return 0;
       }else if(obj.booleanValue()){
          PatchProxy.onMethodExit(uoe, "18");
          return 2;
       }else {
          PatchProxy.onMethodExit(uoe, "18");
          return 1;
       }
    }
    public final String q(){
       e uoe = e.class;
       List obj = PatchProxy.applyWithListener(null, this, uoe, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4b316083).x();
       if (obj.isEmpty()) {
          PatchProxy.onMethodExit(uoe, "7");
          return "";
       }else {
          ArrayList uArrayList = new ArrayList(obj);
          for (int i = 0; i < uArrayList.size(); i = i + 1) {
             uArrayList.set(i, "\""+uArrayList.get(i)+"\"");
          }
          PatchProxy.onMethodExit(uoe, "7");
          return "["+this.b.c(uArrayList)+"]";
       }
    }
    public final int r(Context p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.j == null) {
          e.j = Integer.valueOf(n.q(p0));
       }
       PatchProxy.onMethodExit(e.class, "15");
       return e.j.intValue();
    }
    public final Point s(){
       Point obj = PatchProxy.applyWithListener(null, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.e == null) {
          obj = a.f(Point.class);
          e.e = obj;
          if (obj == null && (a.a().a() != null && ActivityContext.g().e() != null)) {
             obj = n.s(a.a().a());
             e.e = (!n.I(ActivityContext.g().e()))? obj: new Point(obj.y, obj.x);
             a.n(e.e);
          }
       }
       PatchProxy.onMethodExit(e.class, "14");
       return e.e;
    }
    public final void u(c$b p0,Request p1,Map p2,byte[] p3,String p4){
       if (PatchProxy.isSupport2(e.class, "10")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, e.class, "10")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       d uod = e.h().g();
       this.e(p2, "os", "android");
       this.e(p2, "client_key", uod.n());
       this.d(p2);
       hashMap.put("bodyMd5", a0.d(p3));
       String str = uod.F();
       boolean b = uod.f();
       this.j(hashMap);
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          hashMap.put(key, uEntry.getValue());
       }
       Pair second = p0.a(p1, hashMap, new HashMap(), p4).second;
       this.e(p2, "sig2", second);
       if (b && !TextUtils.isEmpty(str)) {
          this.e(p2, "__NStokensig", p0.b(second, str).second);
       }
       PatchProxy.onMethodExit(e.class, "10");
       return;
    }
}

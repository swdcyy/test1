package com.kuaishou.android.security.internal.common.ExceptionProxy;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Vector;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kuaishou.android.security.features.performance.a;
import java.util.concurrent.locks.Lock;
import com.kuaishou.android.security.base.util.j;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.CharSequence;
import java.util.ArrayList;
import java.lang.StringBuffer;
import java.util.Iterator;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.features.drm.utils.b;
import com.kuaishou.android.security.features.drm.DrmClientSdk;
import com.kuaishou.android.security.features.drm.AppDrmInfoService;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import org.json.JSONException;
import android.util.Base64;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.Throwable;
import android.util.Pair;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Number;
import com.kuaishou.android.security.base.util.c;
import android.text.TextUtils;
import java.util.Map;
import java.lang.Thread;
import java.util.Set;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kuaishou.android.security.base.util.h;
import java.util.Locale;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;
import com.kuaishou.android.security.base.util.i;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;

public class ExceptionProxy	// class@0006c6
{
    public static final float a;
    public static final Lock c;
    public static ConcurrentSkipListSet d;
    public static final int[] e;
    public static final int[] f;
    public static final Vector g;
    public static final Vector h;
    public static boolean i;
    public static final Vector j;

    static {
       ExceptionProxy.a = new Random().nextFloat();
       ExceptionProxy.c = new ReentrantLock();
       ExceptionProxy.d = new ConcurrentSkipListSet();
       ExceptionProxy.e = new int[2]{0x1b669,0x1117b};
       ExceptionProxy.f = new int[8]{0xa7d1b8,0xa7d1b9,0xa7d1ba,0xa7d1bb,0xa7d1bc,0xa7d1bd,0xa7d1be,0xa7d1bf};
       ExceptionProxy.g = new Vector();
       ExceptionProxy.h = new Vector();
       ExceptionProxy.i = false;
       ExceptionProxy.j = new Vector();
    }
    public void ExceptionProxy(){
       super();
    }
    public static String add70130InfoToRebuildJSON(int p0,String p1){
       String obj;
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uExceptionPr, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "rt_cost";
       try{
          JSONObject jSONObject = new JSONObject(p1);
          JSONObject jSONObject1 = jSONObject.getJSONObject(obj);
          jSONObject1.put("ksecurityInitMethodBeCalledTime", a.o());
          jSONObject1.put("ksecurityRealInitInTime", a.p());
          try{
             String str = "matrixInitMethodCalledTime";
             jSONObject1.put(str, a.r());
             jSONObject1.put("initTaskRunTime", a.f());
             jSONObject1.put("whoCallDoCommandFuncInTime", a.k());
             try{
                str = "javaInvokeNativeInitCommandMethodCalledTime";
                jSONObject1.put(str, a.l());
                jSONObject1.put("ksecurityInitLockOpenTime", a.n());
                jSONObject1.put("atlasSignFirstBeCalledTime", a.c());
                try{
                   str = "atlasSignFirstBeCalledAndEndTime";
                   jSONObject1.put(str, a.b());
                   jSONObject1.put("prepareCostInJavaCost", (a.n() - a.p()));
                   jSONObject1.put("javaDoCommandCost", a.g());
                   try{
                      str = "javaDoCommandBeforeCost";
                      jSONObject1.put(str, a.d());
                      jSONObject1.put("javaDoCommandBeforeEvent1Cost", a.h());
                      jSONObject1.put("javaDoCommandBeforeEvent2Cost", a.i());
                      try{
                         str = "javaDoCommandBeforeEvent3Cost";
                         jSONObject1.put(str, a.j());
                         jSONObject1.put("loadPluginAndRouterForKS", (a.t() - a.s()));
                         jSONObject1.put("onPluginLoadedCost", (a.u() - a.v()));
                         try{
                            str = "loadLibrary";
                            jSONObject1.put(str, (a.w() - a.s()));
                            jSONObject1.put("matrixInitBeforeCost", a.q());
                            jSONObject1.put("ksecurityCallMatrixBeforeCost", a.m());
                            jSONObject.put(obj, jSONObject1);
                            jSONObject1 = new JSONObject();
                            jSONObject1.put("errno", p0);
                            jSONObject1.put("msg", jSONObject.toString());
                            return jSONObject1.toString();
                         }catch(java.lang.Exception e0){
                         label_0108 :
                            return "";
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int canRun(int p0){
       return 1;
    }
    public static void cleanSP(){
       if (PatchProxy.applyVoid(null, null, ExceptionProxy.class, "8")) {
          return;
       }
       Lock c = ExceptionProxy.c;
       c.lock();
       Object[] objArray = new Object[]{j.d().f(),j.d().b()};
       Object[] objArray1 = new Object[]{j.d().f(),j.d().b()};
       g.b(j.a(b.i().j().c()).e().edit().remove(String.format("%s_%s_failure", objArray)));
       g.b(j.a(b.i().j().c()).e().edit().remove(String.format("%s_%s_record", objArray1)));
       c.unlock();
       return;
    }
    public static void clearTrace(){
       if (PatchProxy.applyVoid(null, null, ExceptionProxy.class, "7")) {
          return;
       }
       ExceptionProxy.c.lock();
       String[] stringArray = (j.a(b.i().j().c()).b("sdkversion_5.1.1.372.8d68fa37_tracemethods")).split("[,]");
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          Object[] objArray = new Object[]{"5.1.1.372.8d68fa37",stringArray[i]};
          g.b(j.a(b.i().j().c()).e().edit().remove(String.format("ntsdkver_%s_%s", objArray)));
       }
       ExceptionProxy.c.unlock();
       return;
    }
    public static void clearTraceByMethodid(int p0){
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uExceptionPr, "10")) {
          return;
       }
       Lock c = ExceptionProxy.c;
       c.lock();
       Object[] objArray = new Object[]{"5.1.1.372.8d68fa37"};
       int i = 0;
       String str = String.format("ntsdkver_%s", objArray);
       String str1 = j.a(b.i().j().c()).b(str);
       Object[] objArray1 = new Object[]{Integer.valueOf(p0)};
       StringBuffer str2 = String.format("$%d=", objArray1);
       if (!str1.contains(str2)) {
          c.unlock();
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          String[] stringArray = str1.split("[|]");
          int len = stringArray.length;
          while (i < len) {
             object oobject = stringArray[i];
             if (!oobject.contains(str2)) {
                uArrayList.add(oobject);
             }
             i = i + 1;
          }
          str2 = "";
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             str2 = str2+iterator.next()+"|";
          }
          j.a(b.i().j().c()).b(str, str2);
          ExceptionProxy.c.unlock();
          return;
       }
    }
    public static void dltr(){
       if (PatchProxy.applyVoid(null, null, ExceptionProxy.class, "16")) {
          return;
       }
       d.c("asdfsdf");
       b.a().b();
       return;
    }
    public static void drecno(String p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, null, ExceptionProxy.class, "15")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          String currentUserI = DrmClientSdk.get().getAppInfoService().getCurrentUserId();
          String deviceId = DrmClientSdk.get().getAppInfoService().getDeviceId();
          jSONObject.put("-1", b.i().h().getKgSessionId());
          if ((jSONObject.optString(str)).isEmpty()) {
             jSONObject.put(str, currentUserI);
          }
          if ((jSONObject.optString("3")).isEmpty()) {
             jSONObject.put("3", deviceId);
          }
          p0 = jSONObject.toString();
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       b.c(p0);
       return;
    }
    public static void drud(String p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, null, ExceptionProxy.class, "14")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          String currentUserI = DrmClientSdk.get().getAppInfoService().getCurrentUserId();
          String deviceId = DrmClientSdk.get().getAppInfoService().getDeviceId();
          jSONObject.put("-1", b.i().h().getKgSessionId());
          if ((jSONObject.optString(str)).isEmpty()) {
             jSONObject.put(str, currentUserI);
          }
          if ((jSONObject.optString("3")).isEmpty()) {
             jSONObject.put("3", deviceId);
          }
          p0 = jSONObject.toString();
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       b.a(p0);
       return;
    }
    public static void exchangeKey(String p0,int p1){
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uExceptionPr, "17")) {
          return;
       }
       DrmClientSdk.exchangeMainKey(3, p0, p1, "", 9999, "");
       return;
    }
    public static byte[] getData(){
       ByteArrayOutputStream obj = PatchProxy.apply(null, null, ExceptionProxy.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       InputStream inputStream = SplitAssetHelper.open(b.i().j().c().getAssets(), new String(Base64.decode("dmlkZW9feWhfbG9hZGluZ19pY29uLnBuZw==", 0)));
       obj = new ByteArrayOutputStream();
       int i = inputStream.available();
       byte[] uobyteArray = new byte[i];
       int i1 = inputStream.read(uobyteArray, 0, i);
       while (i1 > 0) {
          obj.write(uobyteArray, 0, i1);
       }
       byte[] uobyteArray1 = obj.toByteArray();
       try{
          inputStream.close();
       }catch(java.io.IOException e1){
          e1.printStackTrace();
       }
       return uobyteArray1;
    }
    public static String getJniPerparePerJson(){
       Pair pair;
       Iterator obj = PatchProxy.apply(null, null, ExceptionProxy.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ExceptionProxy.j.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "";
          }
          pair = obj.next();
          if (0x111f3 == pair.first.intValue()) {
             break ;
          }
       }
       return pair.second;
    }
    public static String getProcessName(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ExceptionProxy.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = Process.myPid();
       List runningAppPr = p0.getSystemService("activity").getRunningAppProcesses();
       if (runningAppPr != null) {
          Iterator iterator = runningAppPr.iterator();
          while (iterator.hasNext()) {
             ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
             if (runningAppPr1.pid == i) {
                return runningAppPr1.processName;
             }
          }
       }
       return "";
    }
    public static int getSecEnvValue(){
       Object obj = PatchProxy.apply(null, null, ExceptionProxy.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return new c(b.i().j().c()).k();
    }
    public static String getThreadByName(String p0){
       object oobject = null;
       Set obj = PatchProxy.applyOneRefs(p0, oobject, ExceptionProxy.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return oobject;
       }
       obj = Thread.getAllStackTraces().keySet();
       Thread[] threadArray = new Thread[obj.size()];
       Thread[] threadArray1 = obj.toArray(threadArray);
       int len = threadArray1.length;
       int i = 0;
       while (i < len) {
          object oobject1 = threadArray1[i];
          if ((oobject1.getName()).equals(p0)) {
             oobject = oobject1;
          }
          i = i + 1;
       }
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       len = stackTrace.length;
       String str = "";
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject2 = stackTrace[i1];
          Object[] objArray = new Object[]{"",oobject2.getClassName(),oobject2.getMethodName()};
          d.a(String.format("testssssss[%s] %s-%s", objArray));
          Object[] objArray1 = new Object[]{oobject2.getClassName(),oobject2.getMethodName()};
          str = str+String.format("%s-%s", objArray1);
       }
       d.a("threadName: "+p0+", thread: "+oobject);
       return str;
    }
    public static boolean judgePassErrNo(int p0){
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uExceptionPr, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 0xc3568) {
          return false;
       }else {
          return ExceptionProxy.judgeSgmainExceptionUploadErrNo();
       }
    }
    public static boolean judgeSgmainExceptionUploadErrNo(){
       boolean b;
       h obj = PatchProxy.apply(null, null, ExceptionProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new h(b.i().j().c());
       b = (!obj.a() || ExceptionProxy.a - obj.b() >= 0)? true: false;
       return b;
    }
    public static void nativeReport(int p0,String p1){
       String str;
       Iterator iterator;
       Pair pair;
       Object[] objArray1;
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uExceptionPr, "1")) {
          return;
       }
       int i = 2;
       int i1 = 0;
       if (ExceptionProxy.judgePassErrNo(p0)) {
          Object[] objArray = new Object[i];
          objArray[i1] = Integer.valueOf(p0);
          objArray[1] = p1;
          d.a(String.format(Locale.getDefault(), "judgePassErrNo ignore error code[%d] %s", objArray));
          return;
       }else if(ExceptionProxy.d.contains(Integer.valueOf(p0))){
          d.a("ignore error code"+p0);
          return;
       }else {
          ExceptionProxy.d.add(Integer.valueOf(p0));
          if (p0 >= 0x11940) {
             b.i().j().e().onSeucrityError(new KSException(p1, p0));
          }
          if (0x111f2 == p0) {
             if (!new i(b.i().j().c()).c()) {
                return;
             }else {
                str = ExceptionProxy.add70130InfoToRebuildJSON(p0, p1);
             }
          }else if(0x111f3 == p0){
             ExceptionProxy.j.add(new Pair(Integer.valueOf(p0), p1));
             return;
          }else {
             Object[] objArray2 = new Object[i];
             objArray2[i1] = Integer.valueOf(p0);
             objArray2[1] = p1;
             str = String.format(Locale.getDefault(), "[native] errno[%d] msg[%s]", objArray2);
          }
          int[] e = ExceptionProxy.e;
          int len = e.length;
          int i2 = 0;
          while (true) {
             if (i2 < len) {
                if (e[i2] == p0) {
                   d.a(d$b.d, str, b.n);
                   return;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                e = ExceptionProxy.f;
                len = e.length;
                i2 = 0;
                while (true) {
                   if (i2 < len) {
                      int i3 = e[i2];
                      if (i3 == p0) {
                         ExceptionProxy.g.add(new Pair(Integer.valueOf(i3), p1));
                         return;
                      }else {
                         i2 = i2 + 1;
                      }
                   }else if(p0 >= 0x42e05c8 && p0 <= 0x42e062c){
                      ExceptionProxy.h.add(new Pair(Integer.valueOf(p0), p1));
                      return;
                   }else {
                      StringBuilder str1 = "";
                      if (p0 == 0x111e6) {
                         str1 = str1+"preSig[";
                         iterator = ExceptionProxy.g.iterator();
                         while (iterator.hasNext()) {
                            pair = iterator.next();
                            objArray1 = new Object[i];
                            objArray1[i1] = pair.first;
                            objArray1[1] = pair.second;
                            str1 = str1+String.format("en[%s] em[%s]", objArray1)+',';
                         }
                         str = (str1+']').concat(str);
                      }else if(p0 == 0x111ed || p0 == 0x111ee){
                         if (ExceptionProxy.i) {
                            return;
                         }else {
                            str1 = "wbaes table desconstructor";
                            iterator = ExceptionProxy.h.iterator();
                            while (iterator.hasNext()) {
                               pair = iterator.next();
                               objArray1 = new Object[i];
                               objArray1[i1] = pair.first;
                               objArray1[1] = pair.second;
                               str1 = str1+String.format("en[%s] em[%s]", objArray1)+',';
                            }
                            str = (str1+"]").concat(str);
                            ExceptionProxy.i = true;
                         }
                      }
                      break ;
                   }
                }
                d.a("nativeReport begin===============>"+p0+p1+str);
                d.a(d$b.a, str, b.n);
                d.a("nativeReport end=================>");
                return;
             }
          }
       }
    }
    public static byte[] pullData(){
       Object obj = PatchProxy.apply(null, null, ExceptionProxy.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(new String(Base64.decode("aHR0cDovL3N0YXRpYy55eGltZ3MuY29tL3VkYXRhL3BrZy9rd2FpLWNsaWVudC1pbWFnZS92aWRlb195aF9sb2FkaW5nX2ljb24ucG5n", 0)), "rxfsyyeovhrhnm");
    }
    public static void showSP(){
       if (PatchProxy.applyVoid(null, null, ExceptionProxy.class, "9")) {
          return;
       }
       Lock c = ExceptionProxy.c;
       c.lock();
       Object[] objArray = new Object[]{j.d().f(),j.d().b()};
       String.format("%s_%s_failure", objArray);
       Object[] objArray1 = new Object[]{j.d().f(),j.d().b()};
       String.format("%s_%s_record", objArray1);
       c.unlock();
       return;
    }
    public static void tMethod(int p0,int p1){
       String str5;
       StringBuilder str = "unknown";
       ExceptionProxy uExceptionPr = ExceptionProxy.class;
       if (PatchProxy.isSupport(uExceptionPr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uExceptionPr, "6")) {
          return;
       }
       Lock c = ExceptionProxy.c;
       c.lock();
       d.c("trace method "+p0+" flow"+p1);
       Object[] objArray = new Object[]{"5.1.1.372.8d68fa37",Integer.valueOf(p0)};
       String str1 = String.format("ntsdkver_%s_%d", objArray);
       if (j.a(b.i().j().c()) == null) {
          c.unlock();
          return;
       }else {
          String str2 = j.a(b.i().j().c()).b(str1);
          StringBuffer str3 = "";
          if (str2.equals(str) || !str2.length()) {
             String str4 = j.a(b.i().j().c()).b("sdkversion_5.1.1.372.8d68fa37_tracemethods");
             str = (str4.equals(str) || !str4.length())? "": ",";
             str = str+p0;
             j.a(b.i().j().c()).b("sdkversion_5.1.1.372.8d68fa37_tracemethods", str);
             str5 = "\("+p1+"\)";
          }else if(str2.contains("\("+p1+"\)")){
             str5 = "\("+p1+"\)";
          }else {
             str5 = str2+",\("+p1+"\)";
          }
          str5 = str5;
          j.a(b.i().j().c()).b(str1, str3+str5);
          c.unlock();
          return;
       }
    }
}

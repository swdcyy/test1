package com.kwai.framework.exceptionhandler.safemode.e;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import r66.d;
import com.kwai.framework.exceptionhandler.safemode.b;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.framework.exceptionhandler.safemode.c;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import okhttp3.MediaType;
import com.google.gson.Gson;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import q66.a;
import java.lang.StringBuffer;
import java.io.File;
import okhttp3.MultipartBody$Part;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.MimeTypeMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Integer;
import ojd.b;
import ojd.f;
import okhttp3.RequestBody;
import java.lang.System;
import ekd.k1;
import java.util.Random;
import com.kwai.framework.exceptionhandler.safemode.e$a;
import okhttp3.Request$Builder;
import com.kwai.framework.exceptionhandler.safemode.e$c;
import r66.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.Map;
import o56.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.HttpUrl;
import android.net.Uri;
import r66.e;
import okhttp3.HttpUrl$Builder;
import java.util.ArrayList;
import java.net.URLEncoder;
import java.lang.Iterable;
import r66.c;
import okhttp3.Request;
import java.util.HashMap;
import android.util.Pair;
import com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog;
import com.kuaishou.client.log.packages.nano.ClientBase$DevicePackage;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import qkd.b;
import android.content.Context;
import com.kwai.framework.exceptionhandler.safemode.a;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.framework.exceptionhandler.safemode.a$f;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import com.kwai.performance.stability.crash.monitor.message.AnrExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import com.kwai.framework.exceptionhandler.safemode.d;
import msd.l;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import com.kwai.performance.stability.app.exit.monitor.ApplicationExitInfoMirror;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Thread;
import q66.d;
import java.lang.Runnable;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import pkd.a;
import java.util.HashSet;
import com.kwai.framework.exceptionhandler.safemode.ExtraMessage;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import q66.c;
import okhttp3.FormBody$Builder;
import okhttp3.FormBody;
import q66.b;
import com.kwai.robust2.patchmanager.c;
import com.kwai.framework.exceptionhandler.safemode.e$b;
import pm7.c;
import pm7.e;
import okhttp3.Response;
import com.yxcorp.utility.SystemUtil;
import ekd.e0;
import km8.b;
import okhttp3.MultipartBody;
import okhttp3.Headers;
import okio.b;
import okio.c;
import iud.a;
import java.nio.charset.Charset;
import r66.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import java.util.UUID;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import java.lang.Long;
import java.lang.Exception;
import com.google.common.base.Optional;
import com.kuaishou.client.log.packages.nano.ClientCommon$AppPackage;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.Reader;
import java.lang.Number;
import ekd.n0;
import com.yxcorp.utility.AbiUtil;
import com.kuaishou.client.log.packages.nano.ClientBase$LocationPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$TimePackage;
import oe6.a;
import com.google.protobuf.nano.MessageNano;
import ekd.s;
import ekd.a0;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import com.kwai.framework.exceptionhandler.safemode.deps.SwitchHostOnRetryFailedInterceptor;
import okhttp3.Interceptor;
import com.google.gson.JsonObject;

public class e	// class@000b55
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final StringBuffer E;
    public final long F;
    public final long G;
    public Response H;
    public a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final x L;
    public static final String M;
    public static final x N;
    public static final DecimalFormat O;
    public static final MediaType P;
    public static final MediaType Q;
    public static String R;
    public static int S;
    public static int T;
    public static String U;
    public static String V;
    public static String W;
    public static String X;
    public static String Y;
    public static String Z;
    public static String a0;
    public static int b0;
    public static int c0;
    public static SharedPreferences d0;
    public static final Gson e0;
    public static CountDownLatch f0;
    public static final long g0;
    public static OkHttpClient h0;
    public static long i0;
    public static long j0;
    public static String k0;
    public static boolean l0;
    public static boolean m0;

    static {
       RouteType uLOG = RouteType.ULOG;
       e.I = d.a("n/log/client/realtime/collect", uLOG);
       e.J = d.a("n/upload/common/getToken", uLOG);
       e.K = d.a("system/keyconfig", RouteType.API);
       e.L = Suppliers.a(b.b);
       e.M = d.a("n/upload/common/file", uLOG);
       e.N = Suppliers.a(c.b);
       e.O = new DecimalFormat("00000", new DecimalFormatSymbols(Locale.US));
       e.P = MediaType.parse("multipart/form-data");
       e.Q = MediaType.parse("application/octet-stream");
       e.T = 2;
       e.U = "START_UP_COUNT";
       e.V = "SAFE_MODE_ENTER_COUNT";
       e.W = "MAX_FAIL_COUNT";
       e.X = "LAST_UPLOAD_FILE_TIME";
       e.Y = "maxCountToEnterSafemode";
       e.Z = "safemode_time_cost";
       e.a0 = "safe_mode";
       e.b0 = 2;
       e.c0 = 2;
       e.e0 = new Gson();
       e.f0 = new CountDownLatch(4);
       e.g0 = TimeUnit.DAYS.toMillis(1);
       e.i0 = 0;
       e.j0 = 0;
       e.k0 = "";
       e.l0 = false;
       e.m0 = false;
    }
    public void e(){
       super();
       this.a = new a();
       this.b = false;
       this.c = false;
       this.d = false;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = false;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.v = false;
       this.w = false;
       this.x = false;
       this.y = false;
       this.z = false;
       this.A = false;
       this.B = false;
       this.C = false;
       this.D = false;
       this.E = "";
       this.F = 0x100000;
       this.G = 0x300000;
       this.H = null;
    }
    public static MultipartBody$Part f(String p0,File p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       StringBuilder obj = null;
       MimeTypeMap obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uoe, "40");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = MimeTypeMap.getSingleton();
       String name = p1.getName();
       String str = PatchProxy.applyOneRefs(name, obj, uoe, "41");
       int i = 1;
       if (str != patchProxyRe) {
       }else {
          int i3 = name.lastIndexOf(46);
          str = (i3 >= 0)? name.substring((i3 + i)): "";
       }
       String mimeTypeFrom = obj1.getMimeTypeFromExtension(str);
       MediaType mediaType = (!TextUtils.isEmpty(mimeTypeFrom))? MediaType.parse(mimeTypeFrom): obj;
       if (mediaType == null) {
          mediaType = e.P;
       }
       MediaType mediaType1 = mediaType;
       mimeTypeFrom = p1.getName();
       String str1 = PatchProxy.applyOneRefs(mimeTypeFrom, obj, uoe, "42");
       if (str1 != patchProxyRe) {
       }else {
          int i1 = 0;
          b uob1 = (TextUtils.isEmpty(mimeTypeFrom))? null: mimeTypeFrom.length();
          obj = "";
          int i2 = 0;
          while (i2 < uob1) {
             char c = mimeTypeFrom.charAt(i2);
             if (c <= 31 || c >= 127) {
                Object[] objArray = new Object[i];
                objArray[i1] = Integer.valueOf(c);
                obj = obj+String.format("\\u%04x", objArray);
             }else {
                obj = obj+c;
             }
             i2 = i2 + 1;
          }
          str1 = obj;
       }
       b uob = new b(null, p1, 0, p1.length(), mediaType1);
       return MultipartBody$Part.createFormData(p0, str1, patchProxyRe);
    }
    public static String n(){
       Object obj = PatchProxy.apply(null, null, e.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return System.currentTimeMillis()+e.O.format((long)k1.b.nextInt(0x186a0));
    }
    public static e p(){
       return e$a.a;
    }
    public final Request$Builder a(){
       StringBuilder key;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       e$c obj = PatchProxy.apply(objArray, this, uoe, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new e$c();
       a a = a.a;
       e$c a1 = obj.a;
       e ta = this.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(a1, ta, a, a.class, "3")) {
          a.p(a1, "requestParams");
          a.p(ta, "config");
          a.a(a1, ta);
          String p = a.p;
          a.o(p, "AppEnv.RELEASE");
          a1.put("sys", p);
          p = ta.a();
          a.o(p, "config.apiServiceToken");
          a1.put("kuaishou.api_st", p);
          a1.put("apiInvokeTiming", "SAFE_MODE");
       }
       Iterator iterator = obj.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          key = uEntry.getKey();
          obj.b.put(key, uEntry.getValue());
       }
       Request$Builder uBuilder = new Request$Builder().addHeader("Connection", "keep-alive").addHeader("User-Agent", "kwai-android").addHeader("X-REQUESTID", e.n());
       HttpUrl httpUrl = PatchProxy.apply(objArray, this, uoe, "28");
       if (httpUrl != patchProxyRe) {
       }else {
          HttpUrl$Builder uBuilder1 = new HttpUrl$Builder();
          uBuilder1.scheme("https").host(e.L.get()).encodedPath(e.a(e.K).getEncodedPath());
          httpUrl = uBuilder1.build();
       }
       String str = httpUrl.toString();
       uBuilder.url(str);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator1 = obj.a.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          key = uEntry1.getKey()+"=";
          String str1 = (uEntry1.getValue() == null)? "": URLEncoder.encode(uEntry1.getValue(), "utf-8");
          uArrayList.add(key+str1);
       }
       String str2 = TextUtils.join("&", uArrayList)+"&sig="+new c().c(uBuilder.build(), obj.b, new HashMap(), objArray).second;
       uBuilder.url(str+"?"+str2);
       SafeModeDebugLog.f("SafeMode", "cleanup config url: "+str+"?"+str2);
       return uBuilder;
    }
    public ClientBase$DevicePackage b(){
       ClientBase$DevicePackage obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientBase$DevicePackage();
       obj.osVersion = String.valueOf(Build$VERSION.SDK_INT);
       obj.model = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       return obj;
    }
    public final HttpUrl c(){
       Object obj = PatchProxy.apply(null, this, e.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       uBuilder.scheme("https").host(e.N.get()).encodedPath(e.a(e.J).getEncodedPath());
       return uBuilder.build();
    }
    public final HttpUrl d(){
       Object obj = PatchProxy.apply(null, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       uBuilder.scheme("https").host(e.N.get()).encodedPath(e.a(e.I).getEncodedPath());
       return uBuilder.build();
    }
    public final HttpUrl e(){
       Object obj = PatchProxy.apply(null, this, e.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       uBuilder.scheme("https").host(e.N.get()).encodedPath(e.a(e.M).getEncodedPath());
       return uBuilder.build();
    }
    public void g(File p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "23")) {
          return;
       }
       File uFile = new File(p0, p1);
       if (uFile.exists() && (uFile.isDirectory() && uFile.canRead())) {
          Pattern pattern = Pattern.compile(p2, 2);
          File[] uFileArray = uFile.listFiles();
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             String name = oobject.getName();
             if (pattern.matcher(name).matches()) {
                b.q(oobject);
                SafeModeDebugLog.f("SafeMode", "cleanup File For Name :"+name);
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void h(Context p0,int p1){
       String str3;
       String str4;
       int b;
       Iterator obj2;
       boolean b1;
       List appExitInfoI;
       int i2;
       int b2;
       String str5;
       Context this;
       int i3;
       a uoa2;
       boolean i5;
       int i7;
       PatchProxyResult patchProxyRe1;
       String str8;
       String str10;
       String str11;
       HashSet hashSet1;
       a uoa3;
       a uoa4;
       e a;
       e$c uoc2;
       String str13;
       File[] key;
       String str14;
       int i8;
       HttpUrl httpUrl;
       a uoa5;
       int i9;
       ExceptionMessage[] uExceptionMe2;
       File uFile2;
       int i = this;
       ArrayList obj = p0;
       boolean i1 = p1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String str = "5";
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), i, uoe, str)) {
          return;
       }
       a uoa1 = a.d();
       Objects.requireNonNull(uoa1);
       ArrayList obj1 = PatchProxy.applyOneRefs(obj, uoa1, uoa, "1");
       String str1 = "Unknown";
       String str2 = "3";
       if (obj1 != patchProxyRe) {
          obj = obj1;
          str3 = str;
          str4 = str2;
       }else {
          obj1 = new ArrayList();
          a a1 = uoa1.a;
          int len = a1.length;
          i3 = 0;
          while (i3 < len) {
             object oobject = a1[i3];
             File obj4 = PatchProxy.applyTwoRefs(oobject, obj, uoa1, uoa, str2);
             if (obj4 != patchProxyRe) {
                uoa5 = a1;
                i9 = len;
                uExceptionMe2 = obj4;
                str3 = str;
                str4 = str2;
             }else {
                obj4 = oobject.a(obj);
                if (obj4 != null && obj4.exists()) {
                   File[] uFileArray = obj4.listFiles();
                   if (uFileArray != null) {
                      uoa5 = a1;
                      uExceptionMe2 = new ExceptionMessage[5];
                      i9 = len;
                      len = uFileArray.length;
                      str4 = str2;
                      b = 0;
                      i5 = false;
                      i7 = 0;
                      while (true) {
                         if (b < len) {
                            int i10 = len;
                            object oobject2 = uFileArray[b];
                            oobject2.getName();
                            key = uFileArray;
                            str3 = str;
                            if ((oobject2.getName()).startsWith("main")) {
                               File uFile1 = new File(oobject2, "dump");
                               int i11 = i7 + 1;
                               uExceptionMe2[i7] = oobject.c(uFile1, new File(oobject2, "message"), oobject2);
                               oobject2 = uExceptionMe2[i11];
                               if (!PatchProxy.applyVoidOneRefs(oobject2, uoa1, uoa, "6") && (a.b != null && str1.equals(oobject2.mVersionCode))) {
                                  oobject2.mVersionCode = a.b.mVersionCode;
                               }
                            label_00cd :
                               if (i11 >= 4) {
                                  uFile2 = uFile1;
                               label_00e4 :
                                  if (uFile2 == null) {
                                  label_00ef :
                                     uExceptionMe2 = null;
                                  }
                               }else {
                                  i7 = i11;
                                  uFile2 = uFile1;
                               }
                            }
                            b = b + 1;
                            len = i10;
                            uFileArray = key;
                            str = str3;
                         }else {
                            str3 = str;
                            goto label_00e4 ;
                         }
                      }
                   }
                }
                uoa5 = a1;
                i9 = len;
                str3 = str;
                str4 = str2;
                goto label_00ef ;
             }
             if (uExceptionMe2 != null) {
                len = uExceptionMe2.length;
                b2 = 0;
                while (b2 < len) {
                   object oobject1 = uExceptionMe2[b2];
                   if (oobject1 != null) {
                      obj1.add(oobject1);
                   }
                   b2 = b2 + 1;
                }
             }
             i3 = i3 + 1;
             obj = p0;
             a1 = uoa5;
             len = i9;
             str2 = str4;
             str = str3;
          }
          str3 = str;
          str4 = str2;
          obj = obj1;
       }
       b = true;
       if (PatchProxy.isSupport(uoe)) {
          obj2 = PatchProxy.applyThreeRefs(p0, obj, Integer.valueOf(p1), this, e.class, "4");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(obj.isEmpty()){
             b1 = true;
          }else {
             obj2 = obj.iterator();
             i8 = 0;
             i2 = 0;
             b2 = 0;
             while (obj2.hasNext()) {
                ExceptionMessage uExceptionMe1 = obj2.next();
                if (!TextUtils.x(uExceptionMe1.mProcessName) && (!TextUtils.n(uExceptionMe1.mProcessName, str1) && !TextUtils.n(uExceptionMe1.mProcessName, p0.getPackageName()))) {
                   SafeModeDebugLog.f("SafeMode", "subprocess exception message ignored");
                }else if(uExceptionMe1 instanceof AnrExceptionMessage || (uExceptionMe1.getTypeCommon()).startsWith("ANR_")){
                   b2 = b2 + 1;
                }else if(uExceptionMe1 instanceof JavaExceptionMessage || (uExceptionMe1.getTypeCommon()).startsWith("COMMON")){
                   i8 = i8 + 1;
                }else if(uExceptionMe1 instanceof NativeExceptionMessage || (uExceptionMe1.getTypeCommon()).startsWith("NATIVE_")){
                   i2 = i2 + 1;
                }
                str13 = null;
             }
             SafeModeDebugLog.f("SafeMode", "anrCount:"+b2+"javaCrashCount:"+i8+"nativeCrashCount:"+i2);
             str5 = (!i8 && (!i2 && b2 < i1))? 1: 0;
             b1 = str5;
          }
       }else {
          boolean b4 = false;
          goto label_013a ;
       }
       obj1 = new ArrayList();
       if (b1) {
          appExitInfoI = AppExitMonitor.getAppExitInfoInSafeMode(d.b, b);
          obj2 = appExitInfoI.iterator();
          while (obj2.hasNext()) {
             ApplicationExitInfoMirror uApplication = obj2.next();
             if (uApplication.getReason() == 10) {
                i2 = i.n + b;
                i.n = i2;
             }else if(uApplication.getReason() == 13 && (uApplication.getDescription() != null && ((uApplication.getDescription()).toLowerCase()).contains("install"))){
                i2 = i.p + b;
                i.p = i2;
             }else if(uApplication.getReason() == 2 && (uApplication.getDescription() != null && ((uApplication.getDescription()).toLowerCase()).contains("prelaunch"))){
                i2 = i.o + b;
                i.o = i2;
             }
          }
          b2 = ((i.n + i.p) == appExitInfoI.size())? true: false;
          i.l = b2;
          b1 = (appExitInfoI.size() - i.n) - i.p;
          i.m = b1;
          str5 = (b1 >= i1)? 1: null;
          if (!str5) {
             SafeModeDebugLog.f("SafeMode", "message is empty, and abort normal exits is empty, mIsAllIgnoredExitEnterSafemode:"+i.l+" mHappenedUserRequestExitTimes:"+i.n+" mHappenedPackageInstallTimes:"+i.p+" mHappenedPreLaunchExitCnt:"+i.o+", return from safemode");
             return;
          }
       }else {
          str5 = null;
       }
       SafeModeDebugLog.f("SafeMode", "enter really safemode");
       i.q = b;
       i1 = e.d0.getInt(e.V, 0) + b;
       g.b(e.d0.edit().putInt(e.V, i1));
       if (PatchProxy.isSupport(uoe)) {
          this = p0;
          if (PatchProxy.applyVoidTwoRefs(this, Integer.valueOf(i1), i, uoe, "22")) {
          label_0315 :
             i1 = (obj.size() + appExitInfoI.size()) + b;
             ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[i1];
             Iterator iterator = obj.iterator();
             i3 = 0;
             int i4 = 0;
             str2 = " == : == ";
             while (iterator.hasNext()) {
                ExceptionMessage uExceptionMe = iterator.next();
                Iterator iterator1 = iterator;
                uoa2 = uoa;
                if ((uExceptionMe.getTypeCommon()).equals("ANR_COMMON")) {
                   i3 = i3 + 1;
                }
                if (TextUtils.x(uExceptionMe.mTaskId) && a.a) {
                   uExceptionMe.mTaskId = "ed3d6580-9bb0-4bce-a8e9-7a16bbb4eee8";
                }
                i2 = i4 + 1;
                ClientLog$ReportEvent reportEvent = PatchProxy.applyTwoRefs(uExceptionMe, this, i, uoe, "7");
                if (reportEvent != patchProxyRe) {
                   i5 = i3;
                }else {
                   i5 = i3;
                   reportEvent = i.l(e.e0.q(uExceptionMe), i.s(uExceptionMe), this);
                }
                reportEventA[i4] = reportEvent;
                SafeModeDebugLog.f("SafeMode", "exception message "+i2+str2+uExceptionMe.mCrashDetail);
                i4 = i2;
                uoa = uoa2;
                i3 = i5;
                iterator = iterator1;
             }
             uoa2 = uoa;
             HashSet hashSet = new HashSet();
             Iterator iterator2 = appExitInfoI.iterator();
             p1 = str5;
             str5 = "";
             while (iterator2.hasNext()) {
                ApplicationExitInfoMirror uApplication1 = iterator2.next();
                Iterator iterator3 = iterator2;
                int i6 = i4 + 1;
                i7 = i1;
                ClientLog$ReportEvent reportEvent1 = PatchProxy.applyTwoRefs(uApplication1, this, i, uoe, "8");
                if (reportEvent1 != patchProxyRe) {
                   patchProxyRe1 = patchProxyRe;
                }else {
                   patchProxyRe1 = patchProxyRe;
                   reportEvent1 = i.l(e.e0.q(uApplication1), 15, this);
                }
                reportEventA[i4] = reportEvent1;
                hashSet.add(uApplication1.getTimestamp()+str5);
                Gson e0 = e.e0;
                e0.q(uApplication1);
                SafeModeDebugLog.f("SafeMode", "app exit info "+i6+str2+e0.q(uApplication1));
                str5 = p1;
                i4 = i6;
                iterator2 = iterator3;
                i1 = i7;
                patchProxyRe = patchProxyRe1;
                uoe = uoe;
             }
             i7 = i1;
             patchProxyRe1 = patchProxyRe;
             e uoe1 = uoe;
             ExtraMessage uExtraMessag = new ExtraMessage();
             uExtraMessag.crashCount = obj.size() - i3;
             uExtraMessag.anrCount = i3;
             uExtraMessag.continuousAbnormalExitCount = appExitInfoI.size();
             uExtraMessag.userRequestExitCount = i.n;
             uExtraMessag.reallyForegroundAbnormalExitCnt = i.m;
             SharedPreferences d0 = e.d0;
             if (d0 != null) {
                uExtraMessag.continuousCrashCount = d0.getInt(e.U, 0);
             }else {
                httpUrl = null;
             }
             Gson e01 = e.e0;
             e01.q(uExtraMessag);
             SafeModeDebugLog.f("SafeMode", "extra info:  "+e01.q(uExtraMessag));
             e uoe2 = uoe1;
             ClientLog$ReportEvent reportEvent2 = PatchProxy.applyTwoRefs(uExtraMessag, this, i, uoe2, "9");
             PatchProxyResult patchProxyRe2 = patchProxyRe1;
             if (reportEvent2 != patchProxyRe2) {
             }else {
                reportEvent2 = i.l(e.e0.q(uExtraMessag), i.s(uExtraMessag), this);
             }
             reportEventA[i4] = reportEvent2;
             ClientLog$BatchReportEvent uBatchReport = PatchProxy.applyOneRefs(reportEventA, i, uoe2, "33");
             if (uBatchReport != patchProxyRe2) {
             }else {
                uBatchReport = new ClientLog$BatchReportEvent();
                i8 = i7;
                ClientLog$ReportEvent[] reportEventA1 = new ClientLog$ReportEvent[i8];
                uBatchReport.event = reportEventA1;
                i4 = 0;
                while (i4 < i8) {
                   ClientLog$BatchReportEvent event = uBatchReport.event;
                   event[i4] = reportEventA[i4];
                   event[i4].clientIncrementId = System.currentTimeMillis();
                   uBatchReport.event[i4].clientTimestamp = System.currentTimeMillis();
                   ClientCommon$AdditionalSeqIdPackage uAdditionalS = new ClientCommon$AdditionalSeqIdPackage();
                   uAdditionalS.channel = 3;
                   uAdditionalS.channelSeqId = 0;
                   uAdditionalS.customType = "exceptionEvent";
                   uAdditionalS.customSeqId = 0;
                   uBatchReport.event[i4].commonPackage.additionalSeqIdPackage = uAdditionalS;
                   i4 = i4 + 1;
                   patchProxyRe2 = patchProxyRe2;
                   httpUrl = null;
                }
             }
             patchProxyRe1 = patchProxyRe2;
             String str6 = "?";
             if (!PatchProxy.applyVoidTwoRefs(uBatchReport, this, i, uoe2, "17") && uBatchReport.event.length) {
                i.r = true;
                uoc2 = i.o(uBatchReport);
                Request$Builder uBuilder1 = i.m(uoc2);
                str8 = this.d().toString();
                uBuilder1.url(str8);
                uBuilder1.url(str8+str6+i.k(uoc2, uBuilder1));
                if (!PatchProxy.applyVoidOneRefs(uBuilder1, i, uoe2, "18")) {
                   new Thread(new c(i, uBuilder1), e.a0).start();
                }
             }
             i1 = ((System.currentTimeMillis() - e.d0.getLong(e.X, 0)) - e.g0 > 0 && !p1)? true: false;
             StringBuffer str7 = "zip";
             str8 = "fileExtend";
             String str9 = "bizType";
             if (PatchProxy.isSupport(uoe2) && PatchProxy.applyVoidTwoRefs(this, Boolean.valueOf(i1), i, uoe2, "25")) {
             label_056e :
                str10 = str5;
                str11 = str3;
                hashSet1 = hashSet;
             }else if(!i1){
                e.f0.countDown();
                i.C = true;
                goto label_056e ;
             }else {
                i.v = true;
                uoc2 = new e$c();
                a.a.a(uoc2.a, i.a);
                Iterator iterator4 = uoc2.a.entrySet().iterator();
                while (iterator4.hasNext()) {
                   Map$Entry uEntry = iterator4.next();
                   str2 = uEntry.getKey();
                   uoc2.b.put(str2, uEntry.getValue());
                }
                e$c b3 = uoc2.b;
                str11 = str3;
                try{
                   b3.put(str9, str11);
                   uoc2.b.put(str8, str7);
                   Request$Builder uBuilder = new Request$Builder().addHeader("Connection", "keep-alive").addHeader("User-Agent", "kwai-android").addHeader("X-REQUESTID", e.n());
                   str1 = this.c().toString();
                   uBuilder.url(str1);
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator5 = uoc2.a.entrySet().iterator();
                   while (iterator5.hasNext()) {
                      Map$Entry uEntry1 = iterator5.next();
                      Iterator iterator6 = iterator5;
                      str13 = "";
                      key = uEntry1.getKey();
                      try{
                         hashSet1 = hashSet;
                         str13 = str13+key+"=";
                         if (uEntry1.getValue() == null) {
                            str14 = str5;
                            str10 = str14;
                         }else {
                            str14 = uEntry1.getValue();
                            str10 = str5;
                            str14 = URLEncoder.encode(str14, "utf-8");
                         }
                         uArrayList.add(str13+str14);
                         str5 = str10;
                         iterator5 = iterator6;
                         hashSet = hashSet1;
                      }catch(java.lang.Exception e0){
                      }
                      str10 = str5;
                   }
                   hashSet1 = hashSet;
                   str10 = str5;
                   uBuilder.post(new FormBody$Builder().add(str9, str11).add(str8, str7).build());
                   uBuilder.url(str1+str6+TextUtils.join("&", uArrayList)+"&sig="+new c().c(uBuilder.build(), uoc2.b, new HashMap(), null).second);
                   if (!PatchProxy.applyVoidTwoRefs(this, uBuilder, i, uoe2, "26")) {
                      new Thread(new b(i, uBuilder, this), "safe_mode_upload_file").start();
                   }
                }catch(java.lang.Exception e0){
                   hashSet1 = hashSet;
                   goto label_06ce ;
                }
             }
             i.i = System.currentTimeMillis();
             SafeModeDebugLog.f("SafeMode", "try load patch");
             StringBuilder str12 = "2";
             if (PatchProxy.applyVoidOneRefs(this, i, uoe2, str12)) {
                b1 = true;
             }else {
                i.x = true;
                HashMap hashMap = new HashMap();
                uoa4 = a.a;
                a = i.a;
                Objects.requireNonNull(uoa4);
                if (!PatchProxy.applyVoidTwoRefs(hashMap, a, uoa4, a.class, str12)) {
                   a.p(hashMap, "requestParams");
                   a.p(a, "config");
                   uoa4.a(hashMap, a);
                   Objects.requireNonNull(a);
                   String obj3 = PatchProxy.apply(null, a, a.class, "12");
                   if (obj3 != patchProxyRe1) {
                      str5 = obj3;
                   }else if(a.b == null){
                      a.b = a.d();
                   }
                   uoa3 = a.b;
                   if (uoa3 != null) {
                      str5 = uoa3.getString("gifshow_token", str10);
                   }else {
                      str5 = str10;
                   }
                   a.o(str5, "config.token");
                   hashMap.put("token", str5);
                   obj3 = a.a();
                   a.o(obj3, "config.apiServiceToken");
                   hashMap.put("kuaishou.api_st", obj3);
                }
                c uoc = c.a();
                c uoc1 = null;
                uoc.e(this, new e$b(uoc1), uoc1);
                uoc.d.putAll(hashMap);
                b1 = true;
                uoc.e = b1;
                c.a().g();
                i.y = b1;
             }
             i.b = b1;
             i.j = System.currentTimeMillis();
             if (!PatchProxy.applyVoidOneRefs(this, i, uoe2, str4)) {
                i.z = b1;
                c.a().j(null);
             }
             try{
                i1 = e.f0.await((long)(e.c0 + e.b0), TimeUnit.SECONDS);
                if (!i1) {
                   i.A = true;
                }
                SafeModeDebugLog.f("SafeMode", "await success:"+i1);
             }catch(java.lang.InterruptedException e0){
             }
             e h = i.H;
             if (h == null) {
                return;
             }else if(h.isSuccessful()){
                str12 = "upload success: "+i.H;
                SafeModeDebugLog.f("SafeMode", "upload success: "+i.H);
                uoa3 = a.d();
                Objects.requireNonNull(uoa3);
                uoa4 = uoa2;
                if (!PatchProxy.applyVoidOneRefs(this, uoa3, uoa4, "4")) {
                   uoa3 = uoa3.a;
                   b1 = uoa3.length;
                   b2 = 0;
                   while (b2 < b1) {
                      try{
                         File uFile = uoa3[b2].a(this);
                         if (uFile == null || (uFile.exists() && !PatchProxy.applyVoidOneRefs(uFile, null, uoa4, str11))) {
                            b.b(uFile);
                         }
                      label_0841 :
                         b2 = b2 + 1;
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
                if (p1) {
                   AppExitMonitor.addAppExitTimeStampInSafeMode(hashSet1);
                }
             }
             i.H = null;
             if (!e.i0) {
                e.i0 = System.currentTimeMillis();
             }
             if (!e.j0) {
                e.j0 = System.currentTimeMillis();
             }
             return;
          }
       }else {
          this = p0;
       }
       new Thread(new d(i, this.a(), i1, this), "safe_mode_cleanup_config").start();
       goto label_0315 ;
    }
    public void i(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e.class, "1")) {
          return;
       }
       if (!SystemUtil.L(p0)) {
          return;
       }
       this.f = System.currentTimeMillis();
       e.R = p1;
       e.S = p2;
       e0.b = p0;
       p2 = 0;
       if (e.d0 == null) {
          e.d0 = b.c("safe_mode", p2);
       }
       int i = e.d0.getInt(e.U, p2) + 1;
       g.b(e.d0.edit().putInt(e.U, i));
       p2 = e.d0.getInt(e.W, e.T);
       if (p2 <= 0) {
          this.k = System.currentTimeMillis();
          return;
       }else if(i > p2){
          this.d = true;
          this.h(p0, p2);
       }
       this.k = System.currentTimeMillis();
       return;
    }
    public final Map j(MultipartBody p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          MultipartBody$Part part = p0.part(i1);
          if (part.headers() != null) {
             String str = part.headers().get("Content-Disposition");
             if (!TextUtils.x(str) && !str.contains("; filename=")) {
                int i2 = str.indexOf("form-data; name=\"");
                if (i2 >= 0) {
                   i2 = i2 + 17;
                   int i3 = str.length() - 1;
                   str = str.substring(i2, i3);
                   b uob = new b();
                   byte[] uobyteArray = new byte[(int)part.body().contentLength()];
                   part.body().writeTo(uob);
                   uob.readFully(uobyteArray);
                   obj.put(str, new String(uobyteArray, a.f));
                   boolean b = PatchProxy.applyVoidOneRefs(uob, null, b.class, "1");
                }
             }
          }
          i1 = i1 + 1;
       }
       return obj;
    }
    public final String k(e$c p0,Request$Builder p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          StringBuilder str = uEntry.getKey()+"=";
          String str1 = (uEntry.getValue() == null)? "": URLEncoder.encode(uEntry.getValue(), "utf-8");
          obj.add(str+str1);
       }
       return TextUtils.join("&", obj)+"&sig2="+new c().c(p1.build(), p0.b, new HashMap(), null).second;
    }
    public final ClientLog$ReportEvent l(String p0,int p1,Context p2){
       ClientEvent$ExceptionEvent obj;
       int this;
       String str = "";
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ExceptionEvent();
       obj.message = p0;
       obj.type = p1;
       obj.flag = "safe_mode";
       obj.androidPatchBaseVersion = TextUtils.k(a.r);
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.exceptionEvent = obj;
       ClientLog$ReportEvent reportEvent = new ClientLog$ReportEvent();
       reportEvent.clientTimestamp = System.currentTimeMillis();
       SafeModeDebugLog.f("SafeMode", "client timestamp "+reportEvent.clientTimestamp);
       reportEvent.eventId = "safemode_event_id";
       reportEvent.eventPackage = uEventPackag;
       reportEvent.sessionId = UUID.randomUUID().toString();
       a uoa = a.class;
       ClientCommon$CommonPackage uCommonPacka = PatchProxy.applyOneRefs(p2, this, e.class, "11");
       if (uCommonPacka != PatchProxyResult.class) {
       }else {
          uCommonPacka = new ClientCommon$CommonPackage();
          ClientBase$IdentityPackage identityPack = PatchProxy.applyOneRefs(p2, this, e.class, "12");
          if (identityPack != PatchProxyResult.class) {
          }else {
             identityPack = new ClientBase$IdentityPackage();
             e ta2 = this.a;
             Objects.requireNonNull(ta2);
             Long longx = PatchProxy.apply(null, ta2, uoa, "5");
             long l = 0;
             if (longx != PatchProxyResult.class) {
             }else {
                try{
                   longx = Long.valueOf(Long.parseLong(ta2.c()));
                }catch(java.lang.Exception e6){
                   e6.printStackTrace();
                   longx = Long.valueOf(l);
                }
             }
          }
          uCommonPacka.identityPackage = identityPack;
          ClientCommon$AppPackage uAppPackage = PatchProxy.applyOneRefs(p2, this, e.class, "14");
          if (uAppPackage != PatchProxyResult.class) {
          }else {
             uAppPackage = new ClientCommon$AppPackage();
             uAppPackage.versionName = e.R;
             uAppPackage.versionCode = e.S;
             Objects.requireNonNull(this.a);
             uAppPackage.hotfixPatchVersion = TextUtils.k(str);
             e ta = this.a;
             Objects.requireNonNull(ta);
             a uoa1 = PatchProxy.applyOneRefs(p2, ta, uoa, "2");
             if (uoa1 != PatchProxyResult.class) {
             }else if(ta.a == null){
                String str1 = PatchProxy.applyOneRefs(p2, null, uoa, "6");
                if (str1 != PatchProxyResult.class) {
                }else {
                   AssetManager assets = p2.getAssets();
                   try{
                      super(new InputStreamReader(SplitAssetHelper.open(assets, "channel.mf")));
                      str1 = this.readLine();
                      if (TextUtils.isEmpty(str1)) {
                         this.close();
                         str1 = "UNKNOWN";
                      }else {
                         this.close();
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }
             uoa1 = ta.a;
             uAppPackage.channel = uoa1;
             Objects.requireNonNull(this.a);
             uAppPackage.newOc = a.l;
             uAppPackage.language = Locale.getDefault().getLanguage();
             Objects.requireNonNull(this.a);
             int i = 1;
             uAppPackage.platform = i;
             Objects.requireNonNull(this.a);
             uAppPackage.product = i;
             uAppPackage.packageName = TextUtils.k(p2.getPackageName());
             e ta1 = this.a;
             Objects.requireNonNull(ta1);
             uoa = PatchProxy.apply(null, ta1, uoa, "1");
             int i1 = 0;
             if (uoa != PatchProxyResult.class) {
                i1 = uoa.intValue();
             }else {
                uoa = n0.d(a.b);
                Objects.requireNonNull(uoa);
                this = -1;
                switch (uoa.hashCode()){
                    case 0x5b09653:
                      if (uoa.equals("debug")) {
                         this = 0;
                      }
                      break;
                    case 0x5f0528d:
                      if (uoa.equals("huidu")) {
                         this = 1;
                      }
                      break;
                    case 0x41012807:
                      if (uoa.equals("release")) {
                         this = 2;
                      }
                      break;
                    default:
                }
                switch (this){
                    case 0:
                      i1 = 1;
                      break;
                    case 1:
                      i1 = 2;
                      break;
                    case 2:
                      i1 = 3;
                      break;
                    default:
                }
             }
             uAppPackage.buildType = i1;
             if (AbiUtil.b()) {
                i = 2;
             }
             uAppPackage.abi = i;
          }
          uCommonPacka.appPackage = uAppPackage;
          uCommonPacka.devicePackage = this.b();
          ClientBase$LocationPackage locationPack = PatchProxy.apply(null, this, e.class, "15");
          if (locationPack != PatchProxyResult.class) {
          }else {
             locationPack = new ClientBase$LocationPackage();
             Objects.requireNonNull(this.a);
          }
          uCommonPacka.locationPackage = locationPack;
          ClientBase$TimePackage timePackage = PatchProxy.apply(null, this, e.class, "16");
          if (timePackage != PatchProxyResult.class) {
          }else {
             timePackage = new ClientBase$TimePackage();
             Objects.requireNonNull(this.a);
          }
          uCommonPacka.timePackage = timePackage;
       }
       reportEvent.commonPackage = uCommonPacka;
       return reportEvent;
    }
    public final Request$Builder m(e$c p0){
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, e.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Request$Builder().addHeader("Connection", "keep-alive").addHeader("User-Agent", "kwai-android").addHeader("X-REQUESTID", e.n());
       obj.post(RequestBody.create(e.Q, p0.c));
       return obj;
    }
    public final e$c o(ClientLog$BatchReportEvent p0){
       e$c a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e$c obj = PatchProxy.applyOneRefs(p0, this, e.class, "32");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new e$c();
       a.a.a(obj.a, this.a);
       obj.a.put("priorityType", "1");
       a = obj.a;
       e ta = this.a;
       Objects.requireNonNull(ta);
       String str = PatchProxy.apply(null, ta, a.class, "11");
       if (str != patchProxyRe) {
       }else {
          str = a.j();
       }
       a.put("egid", str);
       byte[] uobyteArray = MessageNano.toByteArray(p0);
       obj.c = uobyteArray;
       obj.c = s.b(uobyteArray);
       obj.a.put("encoding", "gzip");
       obj.a.put("bodyMd5", a0.d(obj.c));
       Iterator iterator = obj.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = uEntry.getKey();
          obj.b.put(str, uEntry.getValue());
       }
       return obj;
    }
    public OkHttpClient q(){
       OkHttpClient$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = PatchProxy.apply(null, this, uoe, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (e.h0 == null) {
          int i = 3;
          if (PatchProxy.isSupport(uoe)) {
             uBuilder = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoe, "19");
             if (uBuilder != patchProxyRe) {
             label_004c :
                e.h0 = uBuilder.build();
             }
          }
          long l = (long)i;
          TimeUnit sECONDS = TimeUnit.SECONDS;
          OkHttpClient$Builder uBuilder1 = new OkHttpClient$Builder().connectTimeout(l, sECONDS).readTimeout(l, sECONDS).writeTimeout(l, sECONDS).callTimeout(l, sECONDS);
          uBuilder = uBuilder1.addInterceptor(new SwitchHostOnRetryFailedInterceptor(0));
          goto label_004c ;
       }
       return e.h0;
    }
    public JsonObject r(){
       JsonObject obj = PatchProxy.apply(null, this, e.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       if (this.d != null) {
          obj.a0("startTime", Long.valueOf(this.f));
          obj.a0("finishTime", Long.valueOf(this.k));
          obj.a0("uploadTime", Long.valueOf(this.g));
          obj.a0("patchLoadTime", Long.valueOf(this.j));
          obj.a0("startHotfixTime", Long.valueOf(this.i));
          obj.a0("hotfixTime", Long.valueOf(e.i0));
          obj.a0("userRequestExitCnt", Integer.valueOf(this.n));
          obj.a0("happenedPackageInstallCnt", Integer.valueOf(this.p));
          obj.H("isAllIgnoredExitEnterSafemode", Boolean.valueOf(this.l));
          obj.a0("happenedPreLaunchExitCnt", Integer.valueOf(this.o));
          obj.a0("reallyForegroundAbnormalExitCnt", Integer.valueOf(this.m));
          obj.H("stageEnteredReallySafeMode", Boolean.valueOf(this.q));
          obj.H("stageCleanConfigStart", Boolean.valueOf(this.t));
          obj.H("stageCleanConfigEnded", Boolean.valueOf(this.u));
          obj.H("stageExceptionEventUploadStart", Boolean.valueOf(this.r));
          obj.H("stageExceptionEventUploaded", Boolean.valueOf(this.s));
          obj.H("stageUploadFileStarted", Boolean.valueOf(this.v));
          obj.H("stageUploadFileEnded", Boolean.valueOf(this.w));
          obj.H("stageLoadPatchStarted", Boolean.valueOf(this.x));
          obj.H("stageLoadPatchEnded", Boolean.valueOf(this.y));
          obj.H("stageRequestPatchStarted", Boolean.valueOf(this.z));
          obj.H("stageRequestPatchEnded", Boolean.valueOf(e.l0));
          obj.H("stageSafeModeTimeout", Boolean.valueOf(this.A));
          obj.H("stageUploadEventCountdown", Boolean.valueOf(this.B));
          obj.H("stagePatchCountdown", Boolean.valueOf(e.m0));
          obj.H("stageCleanCountdown", Boolean.valueOf(this.D));
          obj.H("stageFileCountdown", Boolean.valueOf(this.C));
          obj.c0("stageResponseExcetpion", this.E);
       }
       return obj;
    }
    public final int s(ExceptionMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if ((p0.getTypeCommon()).startsWith("COMMON")) {
          return 1;
       }
       if ((p0.getTypeCommon()).startsWith("NATIVE_")) {
          return 4;
       }
       if ((p0.getTypeCommon()).startsWith("ANR_")) {
          return 3;
       }
       if ((p0.getTypeCommon()).startsWith("FLUTTER_")) {
          return 6;
       }
       if ((p0.getTypeCommon()).startsWith("EXTRA_")) {
          return 21;
       }
       return 0;
    }
    public boolean t(){
       return this.d;
    }
    public boolean u(){
       return this.b;
    }
}

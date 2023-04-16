package com.kwai.android.common.config.PushConfigManager;
import java.util.LinkedHashMap;
import android.os.SystemClock;
import java.lang.String;
import java.lang.CharSequence;
import zsd.u;
import com.kwai.android.common.utils.PushLogcat;
import kotlin.Result;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.StringBuilder;
import com.kwai.android.common.config.PushConfigManager$coroutineDispatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.common.config.PushConfigManager$notificationDataSubClass$2;
import com.kwai.android.common.config.PushConfigManager$commandDataSubClass$2;
import com.kwai.android.common.config.PushConfigManager$startSuicideProcessToProcess$2;
import com.kwai.android.common.config.PushConfigManager$apiBuilder$2;
import com.kwai.android.common.config.PushConfigManager$notificationSmallIcon$2;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalArgumentException;
import kotlin.Pair;
import java.util.Map;
import com.kwai.android.common.bean.NotificationSmallIcon;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import gv6.c;
import java.lang.Class;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Number;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import kotlin.io.TextStreamsKt;

public final class PushConfigManager	// class@000987
{
    public static final PushConfigManager INSTANCE;
    public static final p apiBuilder$delegate;
    public static final String clickUrlPath;
    public static final long combineBarrierMills;
    public static final int combineShowNum;
    public static final p commandDataSubClass$delegate;
    public static final JsonObject configJson;
    public static final p coroutineDispatcher$delegate;
    public static long delayInitMs;
    public static final Map dynamicConfig;
    public static final long flatUploadTokenDelayMs;
    public static final String initiativePullUrlPath;
    public static final boolean isSupportFirebase;
    public static final float loggerReportRatio;
    public static final p notificationDataSubClass$delegate;
    public static final p notificationSmallIcon$delegate;
    public static final String receiveUrlPath;
    public static final String registerUrlPath;
    public static final String reportStateUrlPath;
    public static final p startSuicideProcessToProcess$delegate;
    public static final long stayBackgroundThreshold;

    static {
       JsonElement jsonElement;
       JsonObject jsonObject;
       String str3;
       PushConfigManager pushConfigMa = new PushConfigManager();
       PushConfigManager.INSTANCE = pushConfigMa;
       PushConfigManager.dynamicConfig = new LinkedHashMap();
       long l = SystemClock.elapsedRealtime();
       String str = pushConfigMa.readJsonFromClass();
       PushLogcat pushLogcat = 1;
       boolean b = false;
       String str1 = (str == null || u.S1(str))? 1: null;
       if (str1) {
          PushLogcat.INSTANCE.i("KwaiPushSDK", "push config read from file");
          str = pushConfigMa.readJsonFromLocal();
       }else {
          PushLogcat.INSTANCE.i("KwaiPushSDK", "push config read from class");
       }
       if (str != null && !u.S1(str)) {
          pushLogcat = null;
       }
       if (!pushLogcat) {
          jsonElement = c.d(str);
          a.o(jsonElement, "JsonParser.parseString\(jsonStr\)");
          jsonObject = Result.constructor-impl(jsonElement.r());
          Throwable throwable = Result.exceptionOrNull-impl(jsonObject);
          if (throwable != null) {
             PushLogcat.INSTANCE.e("KwaiPushSDK", "push config parse error", throwable);
          }
          JsonObject jsonObject1 = new JsonObject();
          if (Result.isFailure-impl(jsonObject)) {
             jsonObject = jsonObject1;
          }
          a.o(jsonObject, "runCatching {\n        Js…etOrDefault\(JsonObject\(\)\)");
       }else if(!AzerothCodeAdapter.b.isDebugMode()){
          PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", "push config is empty!!! should never happened", null, 4, null);
          jsonObject = new JsonObject();
       }else {
          throw new IllegalArgumentException("需要在assets目录下,放置push_config.json文件, 文件应该从服务器获取详情咨询xuhao03");
       }
       PushConfigManager.configJson = jsonObject;
       PushLogcat.INSTANCE.i("KwaiPushSDK", "push config load cost: "+(SystemClock.elapsedRealtime() - l)+" ms");
       PushConfigManager.coroutineDispatcher$delegate = s.c(PushConfigManager$coroutineDispatcher$2.INSTANCE);
       PushConfigManager.notificationDataSubClass$delegate = s.c(PushConfigManager$notificationDataSubClass$2.INSTANCE);
       PushConfigManager.commandDataSubClass$delegate = s.c(PushConfigManager$commandDataSubClass$2.INSTANCE);
       PushConfigManager.startSuicideProcessToProcess$delegate = s.c(PushConfigManager$startSuicideProcessToProcess$2.INSTANCE);
       PushConfigManager.apiBuilder$delegate = s.c(PushConfigManager$apiBuilder$2.INSTANCE);
       PushConfigManager.notificationSmallIcon$delegate = s.c(PushConfigManager$notificationSmallIcon$2.INSTANCE);
       JsonElement jsonElement1 = jsonObject.e0("initiativePullUrlPath");
       String str2 = "";
       if (jsonElement1 != null) {
          str3 = jsonElement1.w();
          if (str3 != null) {
          label_0104 :
             PushConfigManager.initiativePullUrlPath = str3;
             jsonElement1 = jsonObject.e0("receiveUrlPath");
             if (jsonElement1 != null) {
                str3 = jsonElement1.w();
                if (str3 != null) {
                label_0116 :
                   PushConfigManager.receiveUrlPath = str3;
                   jsonElement1 = jsonObject.e0("clickUrlPath");
                   if (jsonElement1 != null) {
                      str3 = jsonElement1.w();
                      if (str3 != null) {
                      label_0128 :
                         PushConfigManager.clickUrlPath = str3;
                         jsonElement1 = jsonObject.e0("registerUrlPath");
                         if (jsonElement1 != null) {
                            str3 = jsonElement1.w();
                            if (str3 != null) {
                            label_013a :
                               PushConfigManager.registerUrlPath = str3;
                               jsonElement1 = jsonObject.e0("reportStateUrlPath");
                               if (jsonElement1 != null) {
                                  str3 = jsonElement1.w();
                                  if (str3 != null) {
                                     str2 = str3;
                                  }
                               }
                               PushConfigManager.reportStateUrlPath = str2;
                               jsonElement1 = jsonObject.e0("stayBackgroundThreshold");
                               l = (jsonElement1 != null)? jsonElement1.t(): TimeUnit.SECONDS.toMillis(30);
                               PushConfigManager.stayBackgroundThreshold = l;
                               jsonElement1 = jsonObject.e0("delayInitMs");
                               l = (jsonElement1 != null)? jsonElement1.t(): 100;
                               PushConfigManager.delayInitMs = l;
                               jsonElement1 = jsonObject.e0("flatUploadTokenDelayMs");
                               l = (jsonElement1 != null)? jsonElement1.t(): 500;
                               PushConfigManager.flatUploadTokenDelayMs = l;
                               jsonElement1 = jsonObject.e0("isSupportFirebase");
                               if (jsonElement1 != null) {
                                  b = jsonElement1.d();
                               }
                               PushConfigManager.isSupportFirebase = b;
                               jsonElement1 = jsonObject.e0("combine_barrier_mills");
                               l = (jsonElement1 != null)? jsonElement1.t(): 0;
                               PushConfigManager.combineBarrierMills = l;
                               jsonElement1 = jsonObject.e0("combine_show_num");
                               int i = (jsonElement1 != null)? jsonElement1.p(): 3;
                               PushConfigManager.combineShowNum = i;
                               jsonElement = jsonObject.e0("logger_report_ratio");
                               float f = (jsonElement != null)? jsonElement.n(): 0x3f800000;
                               PushConfigManager.loggerReportRatio = f;
                            }
                         }
                         str3 = str2;
                         goto label_013a ;
                      }
                   }
                   str3 = str2;
                   goto label_0128 ;
                }
             }
             str3 = str2;
             goto label_0116 ;
          }
       }
       str3 = str2;
       goto label_0104 ;
    }
    public void PushConfigManager(){
       super();
    }
    public final Pair dynamicConfigIsGoodToGo(){
       Map dynamicConfi = PushConfigManager.dynamicConfig;
       int i = 1;
       if (dynamicConfi.isEmpty() ^ i) {
          String str = "notificationSmallIcon";
          if (dynamicConfi.get(str) instanceof NotificationSmallIcon) {
             Object obj = dynamicConfi.get(str);
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.android.common.bean.NotificationSmallIcon");
             if (obj.getNotificationSmallIcon()) {
             label_002a :
                return new Pair(Boolean.valueOf(i), Integer.valueOf(0));
             }
          }
       }
       i = false;
       goto label_002a ;
    }
    public final c getApiBuilder(){
       return PushConfigManager.apiBuilder$delegate.getValue();
    }
    public final String getClickUrlPath(){
       return PushConfigManager.clickUrlPath;
    }
    public final long getCombineBarrierMills(){
       return PushConfigManager.combineBarrierMills;
    }
    public final int getCombineShowNum(){
       return PushConfigManager.combineShowNum;
    }
    public final Class getCommandDataSubClass(){
       return PushConfigManager.commandDataSubClass$delegate.getValue();
    }
    public final CoroutineDispatcher getCoroutineDispatcher(){
       return PushConfigManager.coroutineDispatcher$delegate.getValue();
    }
    public final long getDelayInitMs(){
       return PushConfigManager.delayInitMs;
    }
    public final Map getDynamicConfig(){
       return PushConfigManager.dynamicConfig;
    }
    public final long getFlatUploadTokenDelayMs(){
       return PushConfigManager.flatUploadTokenDelayMs;
    }
    public final String getInitiativePullUrlPath(){
       return PushConfigManager.initiativePullUrlPath;
    }
    public final float getLoggerReportRatio(){
       return PushConfigManager.loggerReportRatio;
    }
    public final Class getNotificationDataSubClass(){
       return PushConfigManager.notificationDataSubClass$delegate.getValue();
    }
    public final int getNotificationSmallIcon(){
       return PushConfigManager.notificationSmallIcon$delegate.getValue().intValue();
    }
    public final String getReceiveUrlPath(){
       return PushConfigManager.receiveUrlPath;
    }
    public final String getRegisterUrlPath(){
       return PushConfigManager.registerUrlPath;
    }
    public final String getReportStateUrlPath(){
       return PushConfigManager.reportStateUrlPath;
    }
    public final boolean getStartSuicideProcessToProcess(){
       return PushConfigManager.startSuicideProcessToProcess$delegate.getValue().booleanValue();
    }
    public final long getStayBackgroundThreshold(){
       return PushConfigManager.stayBackgroundThreshold;
    }
    public final boolean isSupportFirebase(){
       return PushConfigManager.isSupportFirebase;
    }
    public final String readJsonFromClass(){
       String str = "{\"receiveUrlPath\":\"/rest/infra/push/ack/ks/arrive\",\"clickUrlPath\":\"/rest/infra/push/ack/ks/click\",\"registerUrlPath\":\"/rest/infra/push/token/ks/bind/android\",\"reportStateUrlPath\":\"/rest/infra/push/status/ks/set\",\"initiativePullUrlPath\":\"/rest/infra/push/pull\",\"isSupportFirebase\":false,\"stayBackgroundThreshold\":30000,\"delayInitMs\":100,\"flatUploadTokenDelayMs\":1000,\"maxDistinctId\":15,\"logger_report_ratio\":1,\"combine_barrier_mills\":0,\"combine_show_num\":3,\"config_version\":\"1\"}";
       return str;
    }
    public final String readJsonFromLocal(){
       String str = null;
       Context context = ContextProvider.getContext();
       a.o(context, "ContextProvider.getContext\(\)");
       AssetManager assets = context.getAssets();
       if (assets != null) {
          InputStream inputStream = SplitAssetHelper.open(assets, "push_config.json");
          if (inputStream != null) {
             Charset uCharset = Charset.defaultCharset();
             a.o(uCharset, "Charset.defaultCharset\(\)");
             InputStreamReader inputStreamR = new InputStreamReader(inputStream, uCharset);
             if (inputStreamR instanceof BufferedReader) {
             }else {
                inputStreamR = new BufferedReader(inputStreamR, 8192);
             }
             str = TextStreamsKt.k(inputStreamR);
          }
       }
       return str;
    }
    public final void setDelayInitMs(long p0){
       PushConfigManager.delayInitMs = p0;
    }
    public final boolean staticConfigIsGoodToGo(){
       JsonElement jsonElement = PushConfigManager.configJson.e0("config_version");
       Integer integer = (jsonElement != null)? Integer.valueOf(jsonElement.p()): null;
       a.m(integer);
       boolean b = true;
       if (integer.intValue() < b) {
          b = false;
       }
       Boolean uBoolean = Result.constructor-impl(Boolean.valueOf(b));
       Boolean fALSE = Boolean.FALSE;
       if (Result.isFailure-impl(uBoolean)) {
          uBoolean = fALSE;
       }
       return uBoolean.booleanValue();
    }
}

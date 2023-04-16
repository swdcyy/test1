package com.kwai.android.api.PushApi;
import com.kwai.android.api.PushApi$pushApiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.api.PushApi$sdkVersionMap$2;
import java.lang.Object;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import java.util.Map;
import asd.c;
import com.kwai.android.api.PushApi$fetchInitiativePush$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.android.api.PushApi$fetchInitiativePush$2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.r0;
import com.kwai.android.api.PushApiScopeKt;
import kotlin.Result;
import y35.b;
import java.lang.Throwable;
import com.kwai.android.api.IPushApiService;
import com.android.kwai.foundation.network.IRpcService$Callback;
import kotlin.jvm.internal.a;
import com.kwai.android.common.config.PushConfigManager;
import p45.b;
import p45.b$a;
import com.android.kwai.foundation.network.core.ICancelFeature;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Exception;
import kotlin.Pair;
import java.lang.Enum;
import qrd.r0;
import com.kwai.android.common.bean.PushData;
import java.lang.StringBuilder;

public final class PushApi	// class@000975
{
    public static final PushApi INSTANCE;
    public static final p pushApiService$delegate;
    public static final p sdkVersionMap$delegate;

    static {
       PushApi.INSTANCE = new PushApi();
       PushApi.pushApiService$delegate = s.c(PushApi$pushApiService$2.INSTANCE);
       PushApi.sdkVersionMap$delegate = s.c(PushApi$sdkVersionMap$2.INSTANCE);
    }
    public void PushApi(){
       super();
    }
    public static void reportPushReceive$default(PushApi p0,String p1,String p2,int p3,int p4,int p5,Object p6){
       if (p5 & 0x04) {
          p3 = 0;
       }
       if (p5 & 0x08) {
          p4 = -1;
       }
       p0.reportPushReceive(p1, p2, p3, p4);
       return;
    }
    public final Object fetchInitiativePush(String p0,Channel p1,Map p2,c p3){
       PushApi$fetchInitiativePush$1 uofetchIniti;
       if (p3 instanceof PushApi$fetchInitiativePush$1) {
          uofetchIniti = p3;
          PushApi$fetchInitiativePush$1 label = uofetchIniti.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofetchIniti.label = label - i;
          label_0018 :
             PushApi$fetchInitiativePush$1 result = uofetchIniti.result;
             Object obj = b.h();
             PushApi$fetchInitiativePush$1 label1 = uofetchIniti.label;
             Object obj1 = null;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uofetchIniti.label = 1;
                result = PushApiScopeKt.async$default(obj1, obj1, new PushApi$fetchInitiativePush$2(p0, p1, p2, obj1), 3, obj1).C(uofetchIniti);
                if (result == obj) {
                   return obj;
                }
             }
             p0 = Result.constructor-impl(result);
             if (!Result.isFailure-impl(p0)) {
                obj1 = p0;
             }
             return obj1;
          }
       }
       uofetchIniti = new PushApi$fetchInitiativePush$1(this, p3);
       goto label_0018 ;
    }
    public final IPushApiService getPushApiService(){
       return PushApi.pushApiService$delegate.getValue();
    }
    public final Map getSdkVersionMap(){
       return PushApi.sdkVersionMap$delegate.getValue();
    }
    public final void registerPushToken(Channel p0,String p1,IRpcService$Callback p2){
       a.p(p0, "channel");
       a.p(p1, "token");
       String str = "callback";
       try{
          a.p(p2, str);
          this.getPushApiService().registerPushToken(PushConfigManager.INSTANCE.getRegisterUrlPath(), this.getSdkVersionMap(), String.valueOf(p0.type), p1, b.c.a(), p2);
       }catch(java.lang.Exception e11){
          Pair[] pairArray = new Pair[]{r0.a("channel", p0.name())};
          PushLogger.c().f("tag_error_api", String.valueOf(e11.getMessage()), e11, pairArray);
          p2.onFailure(e11, null);
       }
       return;
    }
    public final void reportPushClick(PushData p0){
       String str = "data";
       try{
          a.p(p0, str);
          IPushApiService pushApiServi = this.getPushApiService();
          String clickUrlPath = PushConfigManager.INSTANCE.getClickUrlPath();
          Map sdkVersionMa = this.getSdkVersionMap();
          PushData pushBack = p0.pushBack;
          String str1 = "none";
          if (pushBack == null) {
             pushBack = str1;
          }
          p0 = p0.pushId;
          PushData pushData = (p0 != null)? p0: str1;
          pushApiServi.reportPushClick(clickUrlPath, sdkVersionMa, pushBack, pushData, b.c.a());
       }catch(java.lang.Exception e8){
          Pair[] pairArray = new Pair[0];
          PushLogger.c().f("tag_error_api", ' '+e8.getMessage(), e8, pairArray);
       }
       return;
    }
    public final void reportPushReceive(String p0,String p1,int p2,int p3){
       a.p(p0, "pushBack");
       String str = "msgid";
       try{
          a.p(p1, str);
          this.getPushApiService().reportPushReceive(PushConfigManager.INSTANCE.getReceiveUrlPath(), this.getSdkVersionMap(), p0, p1, p2, p3, b.c.a());
       }catch(java.lang.Exception e10){
          Pair[] pairArray = new Pair[0];
          PushLogger.c().f("reportPushReceive", String.valueOf(e10.getMessage()), e10, pairArray);
       }
       return;
    }
    public final void reportSystemNotifyState(String p0,boolean p1,boolean p2,long p3,String p4,boolean p5,IRpcService$Callback p6){
       Object obj = p6;
       a.p(p0, "did");
       a.p(p4, "commandConfig");
       String str = "callback";
       try{
          a.p(obj, str);
          this.getPushApiService().reportSystemNotifyState(PushConfigManager.INSTANCE.getReportStateUrlPath(), this.getSdkVersionMap(), p0, String.valueOf(p1), String.valueOf(p3), String.valueOf(p2), String.valueOf(this.getSdkVersionMap().get("LIB_DISPATCHER")), p4, String.valueOf(p5), p6);
       }catch(java.lang.Exception e0){
          Pair[] pairArray = new Pair[0];
          PushLogger.c().f("tag_error_api", ' '+e0.getMessage(), e0, pairArray);
          obj.onFailure(e0, null);
       }
       return;
    }
}

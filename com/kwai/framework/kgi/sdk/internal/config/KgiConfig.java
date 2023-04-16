package com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig$a;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig$mFirstStartUpConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig$samplingRate$2;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig$featureMaxLength$2;
import java.lang.Object;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import com.kwai.sdk.switchconfig.a;
import io7.a;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import n76.a;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItemHolder;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItemHolder$a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import y76.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Objects;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import io7.f;
import com.google.gson.JsonElement;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig$a;

public final class KgiConfig	// class@00158a
{
    public static KgiSwitchConfig a;
    public static final a b;
    public static final p c;
    public static KgiConfigItem d;
    public static final p e;
    public static final p f;
    public static final KgiConfig g;

    static {
       KgiConfig kgiConfig = new KgiConfig();
       KgiConfig.g = kgiConfig;
       KgiConfig.a = kgiConfig.i();
       KgiConfig.b = KgiConfig$a.b;
       KgiConfig.c = s.c(KgiConfig$mFirstStartUpConfig$2.INSTANCE);
       KgiConfig.e = s.c(KgiConfig$samplingRate$2.INSTANCE);
       KgiConfig.f = s.c(KgiConfig$featureMaxLength$2.INSTANCE);
    }
    public void KgiConfig(){
       super();
    }
    public static final KgiChannelConfigItem a(int p0){
       KgiConfig kgiConfig = KgiConfig.class;
       if (PatchProxy.isSupport(kgiConfig)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, kgiConfig, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       kgiConfig = KgiConfig.g;
       return kgiConfig.g(kgiConfig.d(), p0);
    }
    public static final void j(){
       if (PatchProxy.applyVoid(null, null, KgiConfig.class, "14")) {
          return;
       }
       a.t().p("kgiSwitch", KgiConfig.b);
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, KgiConfig.class, "13");
       if (obj == PatchProxyResult.class) {
          obj = KgiConfig.f.getValue();
       }
       return obj.intValue();
    }
    public final KgiConfigItem c(){
       Object obj = PatchProxy.apply(null, this, KgiConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KgiConfig.c.getValue();
    }
    public final KgiConfigItem d(){
       KgiConfigItemHolder obj = PatchProxy.apply(null, this, KgiConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SystemUtil.K() && a.b()) {
          obj = KgiConfigItemHolder.Companion.a().kgiConfig;
       }else {
          KgiConfigItem d = KgiConfig.d;
          if (d == null) {
             d = this.c();
          }
       }
       return obj;
    }
    public final boolean e(){
       KgiSwitchConfig obj = PatchProxy.apply(null, this, KgiConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KgiConfig.a;
       StringBuilder str = 1;
       boolean b = (obj != null && obj.enable == str)? true: false;
       b.e("KgiConfig#switchEnable : = "+b, false, 2, null);
       if (!b) {
          b.e("KgiConfig#mEnable : = "+b, false, 2, null);
          return b;
       }else {
          boolean b1 = a.a();
          b.e("KgiConfig#startUpEnable : = "+b1, false, 2, null);
          if (!b || !b1) {
             str = false;
          }
          b.e("KgiConfig#mEnable : = "+str, false, 2, null);
          return str;
       }
    }
    public final boolean f(int p0){
       KgiSwitchConfig obj;
       KgiConfig kgiConfig = KgiConfig.class;
       if (PatchProxy.isSupport(kgiConfig)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kgiConfig, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = KgiConfig.a;
       boolean b = true;
       if (obj != null) {
          obj = obj.channels;
          if (obj != null && obj.contains(Integer.valueOf(p0)) == b) {
          label_0033 :
             b.e("KgiConfig#isEnable : ["+p0+"] isSwitchEnable = "+b, false, 2, null);
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
    public final KgiChannelConfigItem g(KgiConfigItem p0,int p1){
       KgiChannelConfigItem obj;
       KgiConfig kgiConfig = KgiConfig.class;
       if (PatchProxy.isSupport(kgiConfig)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kgiConfig, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          p0 = p0.channelConfigs;
          if (p0 != null) {
             Iterator iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj = iterator.next();
                   Object obj1 = obj;
                   obj1 = (obj1 != null && obj1.channelId == p1)? 1: null;
                   if (!obj1) {
                      continue ;
                   }
                }else {
                   int i = 0;
                }
                if (obj != null) {
                   p1 = 5;
                   if (obj.intervalSecondRequestAsync < p1) {
                      obj.intervalSecondRequestAsync = p1;
                   }
                   if (obj.intervalSecondCallEngineComplete < p1) {
                      obj.intervalSecondCallEngineComplete = p1;
                   }
                   KgiChannelConfigItem intervalSeco = obj.intervalSecondCallEngineComplete;
                   if (obj.intervalSecondCallEngine < intervalSeco) {
                      obj.intervalSecondCallEngine = intervalSeco;
                   }
                   if (obj.intervalSecondCallEngineFeedbackConsume < 30) {
                      obj.intervalSecondCallEngineFeedbackConsume = 30;
                   }
                   if (obj.triggerMaxCountEveryLaunch < 1) {
                      obj.triggerMaxCountEveryLaunch = 1;
                      break ;
                   }else {
                      break ;
                   }
                }
             }
             return obj;
          }
       }
       Objects.requireNonNull(KgiChannelConfigItem.Companion);
       obj = KgiChannelConfigItem.DEFAULT;
       goto label_006d ;
    }
    public final KgiConfigItem h(){
       Object[] objArray = null;
       KgiConfigItem obj = PatchProxy.apply(objArray, this, KgiConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KgiConfigItem.class;
       String str = a.a.getString("kgiConfig", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public final KgiSwitchConfig i(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KgiConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 2;
       f uof = a.t().f("kgiSwitch");
       JsonElement jsonElement = (uof != null)? uof.c(): objArray;
       String str = String.valueOf(jsonElement);
       b.e("KgiConfig#mSwitchConfig : configStr = "+str, false, i, objArray);
       KgiSwitchConfig kgiSwitchCon = a.a.h(str, KgiSwitchConfig.class);
       b.e("KgiConfig#mSwitchConfig : = "+kgiSwitchCon, false, i, objArray);
       KgiSwitchConfig kgiSwitchCon1 = (SystemUtil.K() && a.b())? KgiSwitchConfig.Companion.a(): kgiSwitchCon;
    label_0085 :
       return kgiSwitchCon1;
    }
}

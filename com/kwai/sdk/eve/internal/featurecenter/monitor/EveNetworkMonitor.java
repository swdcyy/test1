package com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import android.telephony.TelephonyManager;
import android.telephony.ServiceState;
import java.lang.reflect.Method;
import java.lang.NullPointerException;
import com.yxcorp.utility.RomUtils;
import ukd.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$createFeatureProvider$1;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import trd.t;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.Objects;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2$1;
import android.telephony.SubscriptionManager;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$init$1;
import java.lang.Runnable;
import ekd.p0;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveNetworkMonitor extends FeatureMonitor	// class@00152b
{
    public int networkType;
    public final p receiver$delegate;
    public static final EveNetworkMonitor$Companion Companion;

    static {
       EveNetworkMonitor.Companion = new EveNetworkMonitor$Companion(null);
    }
    public void EveNetworkMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.receiver$delegate = s.c(new EveNetworkMonitor$receiver$2(this));
    }
    public final int adjustNetworkType(Context p0,int p1){
       Object obj;
       ServiceState serviceState;
       EveNetworkMonitor uEveNetworkM = EveNetworkMonitor.class;
       if (PatchProxy.isSupport(uEveNetworkM)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uEveNetworkM, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          if (Build$VERSION.SDK_INT >= 26 && !p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
             p0 = p0.getSystemService("phone");
             if (p0 != null) {
                int subId = this.getSubId();
                int i = 1;
                if (subId == -1) {
                   serviceState = p0.getServiceState();
                }else {
                   Class[] uClassArray = new Class[i];
                   uClassArray[0] = Integer.TYPE;
                   Method declaredMeth = TelephonyManager.class.getDeclaredMethod("getServiceStateForSubscriber", uClassArray);
                   a.o(declaredMeth, "method");
                   declaredMeth.setAccessible(i);
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = Integer.valueOf(subId);
                   obj = declaredMeth.invoke(p0, objArray1);
                   if (obj != null) {
                      serviceState = obj;
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type android.telephony.ServiceState");
                   }
                }
                if (serviceState == null) {
                   return p1;
                }else if(RomUtils.n()){
                   Object[] objArray = new Object[i];
                   objArray[0] = serviceState;
                   Integer integer = a.b("com.huawei.android.telephony.ServiceStateEx", "getConfigRadioTechnology", objArray);
                   if (integer != null) {
                      p1 = integer.intValue();
                   }
                }else {
                   String str = serviceState.toString();
                   a.o(str, "serviceState.toString\(\)");
                   if (StringsKt__StringsKt.O2(str, "nrState=NOT_RESTRICTED", 0, 2, null) || StringsKt__StringsKt.O2(str, "nrState=CONNECTED", 0, 2, null)) {
                      p1 = 20;
                   }
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
             }
          }
       label_00bd :
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
    public final int convertToEveNetworkType(int p0){
       switch (p0){
           case 1:
           case 4:
           case 7:
           case 11:
           case 16:
           case 2:
             p0 = 2;
             break;
           case 3:
           case 6:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 17:
           case 5:
             p0 = 3;
             break;
           case 13:
           case 19:
           case 18:
             p0 = 4;
             break;
           case 20:
             p0 = 5;
             break;
           default:
             p0 = 0;
       }
       return p0;
    }
    public IFeatureProvider createFeatureProvider(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, EveNetworkMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       if (p0.hashCode() == 0x4e139514) {
          obj = "netstate";
          if (p0.equals(obj)) {
             return new AppCachedFeatureProvider(obj, new EveNetworkMonitor$createFeatureProvider$1(this));
          }
       }
       throw new RuntimeException("EveNetworkMonitor not expect feature:"+p0);
    }
    public List features(){
       Object obj = PatchProxy.apply(null, this, EveNetworkMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k("netstate");
    }
    public final NetworkInfo getActiveNetworkInfo(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveNetworkMonitor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.m(p0);
       ConnectivityManager connectivity = this.getConnectivityManager(p0);
       NetworkInfo activeNetwor = (connectivity != null)? connectivity.getActiveNetworkInfo(): null;
       return activeNetwor;
    }
    public final int getCellularGeneration(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveNetworkMonitor.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 29 && p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
          return this.getCellularGenerationV2(p0);
       }
       obj = p0.getSystemService("phone");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.telephony.TelephonyManager");
       int networkType = obj.getNetworkType();
       return this.convertToEveNetworkType(this.adjustNetworkType(p0, networkType));
    }
    public final int getCellularGenerationV2(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveNetworkMonitor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ConnectivityManager connectivity = this.getConnectivityManager(p0);
       int i = 0;
       NetworkInfo networkInfo = (connectivity != null)? connectivity.getNetworkInfo(i): null;
       if (networkInfo != null && networkInfo.isConnected()) {
          i = this.convertToEveNetworkType(networkInfo.getSubtype());
       }
       return i;
    }
    public final ConnectivityManager getConnectivityManager(Context p0){
       ConnectivityManager systemServic;
       Context obj = PatchProxy.applyOneRefs(p0, this, EveNetworkMonitor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getApplicationContext();
       if (obj != null) {
          p0 = obj;
       }
       try{
          systemServic = p0.getSystemService("connectivity");
          if (systemServic != null) {
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
          }
       }catch(java.lang.Exception e0){
          systemServic = null;
       }
       return systemServic;
    }
    public final EveNetworkMonitor$receiver$2$1 getReceiver(){
       Object obj = PatchProxy.apply(null, this, EveNetworkMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.receiver$delegate.getValue();
    }
    public final int getSubId(){
       Object obj = PatchProxy.apply(null, this, EveNetworkMonitor.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (Build$VERSION.SDK_INT >= 24) {
          i = SubscriptionManager.getDefaultDataSubscriptionId();
       }
       return i;
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveNetworkMonitor.class, "2")) {
          return;
       }
       a.p(p0, "handler");
       p0.post(new EveNetworkMonitor$init$1(this, p0));
       return;
    }
    public final void updateNetState(){
       if (PatchProxy.applyVoid(null, this, EveNetworkMonitor.class, "5")) {
          return;
       }
       NetworkInfo activeNetwor = this.getActiveNetworkInfo(this.getContext());
       if (activeNetwor != null) {
          int type = activeNetwor.getType();
          int i = 1;
          if (type) {
             if (type == i) {
             label_008b :
                this.networkType = i;
                EveLog.i$default("EveNetworkMonitor updateNetState, networkType:"+this.networkType, false, 2, null);
                this.notifyFeatureChange("netstate");
                return;
             }
          }else {
             String str = p0.h(this.getContext());
             if (str != null) {
                i = str.hashCode();
                if (i != -1512778493) {
                   if (i != 1653) {
                      if (i != 1684) {
                         if (i != 1715) {
                            if (i != 1746) {
                               if (i != 0x60303845 || !str.equals("5g\(sa\)")) {
                               label_008a :
                                  i = 0;
                                  goto label_008b ;
                               }
                            }else if(str.equals("5g")){
                            }
                         }else if(str.equals("4g")){
                            i = 4;
                            goto label_008b ;
                         }else {
                            goto label_008a ;
                         }
                      }else if(str.equals("3g")){
                         i = 3;
                         goto label_008b ;
                      }else {
                         goto label_008a ;
                      }
                   }else if(str.equals("2g")){
                      i = 2;
                      goto label_008b ;
                   }else {
                      goto label_008a ;
                   }
                }else if(str.equals("5g\(nsa\)")){
                }
                i = 5;
                goto label_008b ;
             }
          }
       }else {
          goto label_008a ;
       }
    }
}

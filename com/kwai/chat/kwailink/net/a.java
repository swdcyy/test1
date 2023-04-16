package com.kwai.chat.kwailink.net.a;
import com.kwai.link.model.NetworkInfo$NetworkType;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.link.model.NetworkInfo;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import android.telephony.ServiceState;
import com.kwai.chat.kwailink.net.b;
import ca7.o;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.kwai.chat.kwailink.utils.Utils;
import java.lang.StringBuilder;
import android.os.SystemClock;
import java.util.Map;
import android.util.Pair;
import java.lang.Long;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import android.telephony.SubscriptionManager;
import java.lang.Boolean;

public class a	// class@000a66
{
    public static final NetworkInfo$NetworkType[] a;
    public static final Map b;
    public static NetworkInfo c;

    static {
       a.a = NetworkInfo$NetworkType.values();
       a.b = new ConcurrentHashMap();
       a.c = a.d();
    }
    public void a(){
       super();
    }
    public static int a(TelephonyManager p0,int p1){
       ServiceState serviceState;
       Class[] uClassArray;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return p1;
       }else if(Build$VERSION.SDK_INT >= 26 && !b.b().checkSelfPermission("android.permission.READ_PHONE_STATE")){
          int i = a.e();
          int i1 = 1;
          if (i == -1) {
             serviceState = p0.getServiceState();
          }else {
             uClassArray = new Class[i1];
             uClassArray[0] = Integer.TYPE;
             Object[] objArray1 = new Object[i1];
             objArray1[0] = Integer.valueOf(i);
             serviceState = b.b(p0, "getServiceStateForSubscriber", uClassArray, objArray1);
          }
          if (serviceState == null) {
             return p1;
          }else if(o.a()){
             uClassArray = new Class[i1];
             uClassArray[0] = ServiceState.class;
             Object[] objArray = new Object[i1];
             objArray[0] = serviceState;
             Integer integer = b.c(Class.forName("com.huawei.android.telephony.ServiceStateEx"), "getConfigRadioTechnology", uClassArray, objArray);
             if (integer != null) {
                p1 = integer.intValue();
             }
          }else if(a.g(serviceState.toString())){
             p1 = 20;
          }
       }
    label_0092 :
       return p1;
    }
    public static String b(int p0){
       switch (p0){
           case 1:
           case 4:
           case 7:
           case 11:
           case 16:
           case 2:
             return "2g";
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
             return "3g";
           case 13:
           case 19:
           case 18:
             return "4g";
           case 20:
             return "5g";
           default:
             return "";
       }
    }
    public static String c(TelephonyManager p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30 && b.b().checkSelfPermission("android.permission.READ_PHONE_STATE")) {
          return obj;
       }
       int i = (sDK_INT >= 26 && o.a())? b.b(p0.getServiceState(), "getHwNetworkType", null, null).intValue(): a.h(p0);
    label_004c :
       return a.b(a.a(p0, i));
    }
    public static NetworkInfo d(){
       boolean b;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       NetworkInfo obj = PatchProxy.apply(objArray, objArray, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new NetworkInfo();
       NetworkInfo activeNetwor = b.b().getSystemService("connectivity").getActiveNetworkInfo();
       if (activeNetwor != null && activeNetwor.isConnected()) {
          b = true;
          obj.is_available = b;
          String str = PatchProxy.applyOneRefs(activeNetwor, objArray, uoa, "10");
          if (str != patchProxyRe) {
          }else {
             int type1 = activeNetwor.getType();
             if (!type1) {
                String str2 = Utils.getStringNotNull(activeNetwor.getSubtypeName())+"_"+Utils.getStringNotNull(activeNetwor.getExtraInfo());
                str = (str2.equals("_"))? "MOBILE": str2;
             }else if(type1 == b){
                str = "WIFI";
             }else {
                str = "OTHER";
             }
          }
          long l = SystemClock.elapsedRealtime();
          Pair pair = a.b.get(str);
          if (pair != null && (l - pair.second.longValue()) - 0x927c0 < 0) {
             obj.network_type = pair.first.intValue();
          }else {
             TelephonyManager obj1 = PatchProxy.applyOneRefs(activeNetwor, objArray, uoa, "2");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                int type = activeNetwor.getType();
                if (type == b) {
                   i = NetworkInfo$NetworkType.kWifi.ordinal();
                }else {
                   int i1 = -1;
                   if (!type) {
                      obj1 = b.b().getSystemService("phone");
                      String str1 = PatchProxy.applyTwoRefs(obj1, activeNetwor, objArray, uoa, "3");
                      if (str1 != patchProxyRe) {
                      }else {
                         str1 = a.c(obj1);
                         if (TextUtils.isEmpty(str1)) {
                            Object obj2 = PatchProxy.applyTwoRefs(obj1, activeNetwor, objArray, uoa, "5");
                            str1 = (obj2 != patchProxyRe)? obj2: a.b(a.a(obj1, activeNetwor.getSubtype()));
                         }
                      }
                      Objects.requireNonNull(str1);
                      i = str1.hashCode();
                      Pair pair1 = 3;
                      Integer integer = 2;
                      if (i != 1653) {
                         if (i != 1684) {
                            if (i != 1715) {
                               if (i == 1746 && str1.equals("5g")) {
                                  i1 = 3;
                               }
                            }else if(!str1.equals("4g")){
                               i1 = 2;
                            }
                         }else if(!str1.equals("3g")){
                            i1 = 1;
                         }
                      }else if(!str1.equals("2g")){
                         i1 = 0;
                      }
                      if (i1) {
                         if (i1 != b) {
                            if (i1 != integer) {
                               if (i1 != pair1) {
                                  i = NetworkInfo$NetworkType.kCellular.ordinal();
                               }else {
                                  i = NetworkInfo$NetworkType.k5G.ordinal();
                               }
                            }else {
                               i = NetworkInfo$NetworkType.k4G.ordinal();
                            }
                         }else {
                            i = NetworkInfo$NetworkType.k3G.ordinal();
                         }
                      }else {
                         i = NetworkInfo$NetworkType.k2G.ordinal();
                      }
                   }else if(type == i1){
                      i = NetworkInfo$NetworkType.kNone.ordinal();
                   }else {
                      i = NetworkInfo$NetworkType.kOther.ordinal();
                   }
                }
             }
             a.b.put(str, new Pair(Integer.valueOf(i), Long.valueOf(l)));
             obj.network_type = i;
          }
          obj.apn_name = str;
       }
       a.c = obj;
       return obj;
    }
    public static int e(){
       Object obj = PatchProxy.apply(null, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (Build$VERSION.SDK_INT >= 24) {
          i = SubscriptionManager.getDefaultDataSubscriptionId();
       }
       return i;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.c.network_type >= NetworkInfo$NetworkType.kCellular.ordinal() && a.c.network_type <= NetworkInfo$NetworkType.k5G.ordinal())? true: false;
       return b;
    }
    public static boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.contains("nrState=NOT_RESTRICTED") || p0.contains("nrState=CONNECTED"))? true: false;
       return b;
    }
    public static int h(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getNetworkType();
    }
}

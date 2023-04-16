package com.yxcorp.gifshow.growth.deviceinfo.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.deviceinfo.DeviceInfoHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import qrd.p;
import v25.b;
import android.content.Context;
import com.kwai.sdk.switchconfig.a;
import qe6.b;
import y25.a;
import x25.a;
import android.os.Build;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Objects;
import u25.a;
import com.kuaishou.webkit.WebSettings;
import zsd.u;
import java.lang.Exception;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import java.lang.Number;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Long;
import y25.b;
import com.kuaishou.ug.deviceinfo.utils.CommonUtilsKt$getInetAddress$1;
import java.net.InetAddress;
import z25.a;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.lang.StringBuilder;
import z25.c;

public final class a implements Runnable	// class@001368
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       DeviceInfoManager uDeviceInfoM;
       String str5;
       String str6;
       String str7;
       String str8;
       String str9;
       boolean b;
       Context uContext;
       String str11;
       String str12;
       long l;
       String fINGERPRINT;
       DeviceInfoHelper uDeviceInfoH = DeviceInfoHelper.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       Application uApplication = a.b();
       if (uApplication != null) {
          DeviceInfoHelper uDeviceInfoH1 = new DeviceInfoHelper();
          String str1 = "2";
          if (!PatchProxy.applyVoidOneRefs(uApplication, uDeviceInfoH1, uDeviceInfoH, str1)) {
             uDeviceInfoM = DeviceInfoManager.d;
             b uob = PatchProxy.apply(null, uDeviceInfoH1, uDeviceInfoH, str);
             if (uob == PatchProxyResult.class) {
                uob = uDeviceInfoH1.a.getValue();
             }
             uDeviceInfoM.j(uApplication, uob);
          }
          String str2 = "3";
          if (!PatchProxy.applyVoid(null, uDeviceInfoH1, uDeviceInfoH, str2)) {
             uDeviceInfoM = DeviceInfoManager.d;
             uDeviceInfoM.f();
             uDeviceInfoM.k();
          }
          if (!a.t().d("userGrowthDeviceInfoEnable", false) || (b.a() && !PatchProxy.applyVoid(null, uDeviceInfoH1, uDeviceInfoH, "4"))) {
             a uoa = a.class;
             uDeviceInfoM = DeviceInfoManager.class;
             if (!PatchProxy.applyVoid(null, null, a.class, str1)) {
                DeviceInfoManager d = DeviceInfoManager.d;
                d.e();
                String str3 = "5";
                String str4 = "it";
                if (PatchProxy.apply(null, d, uDeviceInfoM, str3) != PatchProxyResult.class) {
                   str5 = str4;
                }else {
                   String bRAND = Build.BRAND;
                   a.o(bRAND, str4);
                   String str14 = bRAND;
                   fINGERPRINT = bRAND;
                   str5 = str4;
                   DeviceInfoManager.l(d, "brand", str14, 0, 4, 0);
                   a.o(fINGERPRINT, "Build.BRAND.also {\n     ¡­NAME_BRAND, it\)\n        }");
                }
                d.g();
                if (PatchProxy.apply(null, d, uDeviceInfoM, "7") != PatchProxyResult.class) {
                   str6 = str5;
                }else {
                   fINGERPRINT = Build.HARDWARE;
                   str4 = str5;
                   a.o(fINGERPRINT, str4);
                   str6 = str4;
                   DeviceInfoManager.l(d, "hardware", fINGERPRINT, null, 4, null);
                   a.o(fINGERPRINT, "Build.HARDWARE.also {\n  ¡­E_HARDWARE, it\)\n        }");
                }
                if (PatchProxy.apply(null, d, uDeviceInfoM, "8") != PatchProxyResult.class) {
                   str7 = str6;
                }else {
                   fINGERPRINT = Build.PRODUCT;
                   str4 = str6;
                   a.o(fINGERPRINT, str4);
                   str7 = str4;
                   DeviceInfoManager.l(d, "product", fINGERPRINT, null, 4, null);
                   a.o(fINGERPRINT, "Build.PRODUCT.also {\n   ¡­ME_PRODUCT, it\)\n        }");
                }
                if (PatchProxy.apply(null, d, uDeviceInfoM, "9") != PatchProxyResult.class) {
                   str8 = str7;
                }else {
                   fINGERPRINT = Build.DEVICE;
                   str4 = str7;
                   a.o(fINGERPRINT, str4);
                   str8 = str4;
                   DeviceInfoManager.l(d, "device", fINGERPRINT, null, 4, null);
                   a.o(fINGERPRINT, "Build.DEVICE.also {\n    ¡­AME_DEVICE, it\)\n        }");
                }
                if (PatchProxy.apply(null, d, uDeviceInfoM, "10") != PatchProxyResult.class) {
                   str9 = str8;
                }else {
                   fINGERPRINT = Build.BOARD;
                   str4 = str8;
                   a.o(fINGERPRINT, str4);
                   str9 = str4;
                   DeviceInfoManager.l(d, "board", fINGERPRINT, null, 4, null);
                   a.o(fINGERPRINT, "Build.BOARD.also {\n     ¡­NAME_BOARD, it\)\n        }");
                }
                if (PatchProxy.apply(null, d, uDeviceInfoM, "11") != PatchProxyResult.class) {
                }else {
                   fINGERPRINT = Build.FINGERPRINT;
                   a.o(fINGERPRINT, str9);
                   DeviceInfoManager.l(d, "fingerprint", fINGERPRINT, null, 4, null);
                   a.o(fINGERPRINT, "Build.FINGERPRINT.also {¡­INGERPRINT, it\)\n        }");
                }
                d.a();
                b = false;
                d.c(null, b);
                if (PatchProxy.isSupport(uDeviceInfoM) && PatchProxy.applyTwoRefs(null, Boolean.FALSE, d, uDeviceInfoM, "14") != PatchProxyResult.class) {
                }else {
                   str4 = CollectionsKt___CollectionsKt.V2(TelephonyUitlsKt.d(null), null, null, null, 0, null, null, 63, null);
                   DeviceInfoManager.l(DeviceInfoManager.d, "imsi", str4, null, 4, null);
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.isSupport(uDeviceInfoM) && PatchProxy.applyTwoRefs(null, Boolean.FALSE, d, uDeviceInfoM, "15") != PatchProxyResult.class) {
                }else {
                   str4 = CollectionsKt___CollectionsKt.V2(TelephonyUitlsKt.b(null), null, null, null, 0, null, null, 63, null);
                   DeviceInfoManager.l(DeviceInfoManager.d, "iccid", str4, null, 4, null);
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.isSupport(uDeviceInfoM) && PatchProxy.applyTwoRefs(null, Boolean.FALSE, d, uDeviceInfoM, "16") != PatchProxyResult.class) {
                }else {
                   str4 = CollectionsKt___CollectionsKt.V2(TelephonyUitlsKt.e(null), null, null, null, 0, null, null, 63, null);
                   DeviceInfoManager.l(DeviceInfoManager.d, "phone_number", str4, null, 4, null);
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.isSupport(uDeviceInfoM) && PatchProxy.applyTwoRefs(null, Boolean.FALSE, d, uDeviceInfoM, "17") != PatchProxyResult.class) {
                }else {
                   str4 = CollectionsKt___CollectionsKt.V2(TelephonyUitlsKt.a(null), null, null, null, 0, null, null, 63, null);
                   DeviceInfoManager.l(DeviceInfoManager.d, "carrier_name", str4, null, 4, null);
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.apply(null, d, uDeviceInfoM, "18") != PatchProxyResult.class) {
                }else {
                   DeviceInfoManager.l(d, "cpu_info", new a().toString(), null, 4, null);
                }
                int i = 1;
                DeviceInfoManager.i(d, null, i, null);
                DeviceInfoManager.h(d, null, i, null);
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "21") != PatchProxyResult.class) {
                }else {
                   uContext = d.b();
                   if (uContext != null) {
                      str1 = PatchProxy.applyOneRefs(uContext, null, uoa, str1);
                      if (str1 != PatchProxyResult.class) {
                      }else {
                         try{
                            a.p(uContext, "context");
                            str1 = WebSettings.getDefaultUserAgent(uContext);
                            if (str1 == null || u.S1(str1)) {
                               b = true;
                            }
                            if (b) {
                               str1 = a.g("http.agent");
                            }
                         }catch(java.lang.Exception e0){
                            str1 = null;
                         }catch(java.lang.Exception e0){
                         }
                         e0.printStackTrace();
                      }
                      if (str1 != null) {
                         str12 = str1;
                      label_02ea :
                         DeviceInfoManager.l(DeviceInfoManager.d, "user_agent", str12, null, 4, null);
                      }
                   }
                   str12 = "UG_GET_FIELD_EMPTY";
                   goto label_02ea ;
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "22") != PatchProxyResult.class) {
                }else {
                   uContext = d.b();
                   if (uContext != null) {
                      str2 = PatchProxy.applyOneRefs(uContext, null, uoa, str2);
                      if (str2 != PatchProxyResult.class) {
                      }else {
                         a.p(uContext, "context");
                         str2 = a.g(uContext.getContentResolver(), "android_id");
                      }
                      if (str2 != null) {
                         str12 = str2;
                      label_032c :
                         DeviceInfoManager.l(DeviceInfoManager.d, "android_id", str12, null, 4, null);
                      }
                   }
                   str12 = "UG_GET_FIELD_EMPTY";
                   goto label_032c ;
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "23") != PatchProxyResult.class) {
                }else {
                   uContext = d.b();
                   if (uContext != null) {
                      String str13 = a.f(uContext);
                      if (str13 != null) {
                         str12 = str13;
                      label_035c :
                         DeviceInfoManager.l(DeviceInfoManager.d, "device_serial_number", str12, null, 4, null);
                      }
                   }
                   str12 = "UG_GET_FIELD_EMPTY";
                   goto label_035c ;
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                Number number = PatchProxy.apply(null, d, uDeviceInfoM, "24");
                if (number == PatchProxyResult.class) {
                   number = DeviceInfoManager.c.getValue();
                }
                String.valueOf(number.longValue());
                Context obj = PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "25");
                if (obj != PatchProxyResult.class) {
                   obj.longValue();
                }else {
                   obj = d.b();
                   if (obj != null) {
                      ActivityManager$MemoryInfo obj1 = PatchProxy.applyOneRefs(obj, null, uoa, str3);
                      if (obj1 != PatchProxyResult.class) {
                         l = obj1.longValue();
                      }else {
                         a.p(obj, "context");
                         Object systemServic1 = obj.getSystemService("activity");
                         if (systemServic1 != null) {
                            obj1 = new ActivityManager$MemoryInfo();
                            systemServic1.getMemoryInfo(obj1);
                            l = obj1.totalMem;
                         }else {
                            l = (long)-1;
                         }
                      }
                   }else {
                      l = 0;
                   }
                   DeviceInfoManager.l(d, "total_memory_space", Long.valueOf(l), null, 4, null);
                }
                str1 = "UG_AUTH_FAILED";
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "26") != PatchProxyResult.class) {
                }else {
                   uContext = d.b();
                   if (uContext != null) {
                      str2 = PatchProxy.applyOneRefs(uContext, null, uoa, "6");
                      if (str2 != PatchProxyResult.class) {
                      }else {
                         a.p(uContext, "context");
                         String[] stringArray1 = new String[]{"android.permission.INTERNET"};
                         if (b.a(uContext, stringArray1)) {
                            try{
                               InetAddress inetAddress = a.d(CommonUtilsKt$getInetAddress$1.INSTANCE);
                               if (inetAddress != null) {
                                  str2 = inetAddress.getHostAddress();
                                  a.o(str2, "inetAddress.hostAddress");
                               }else {
                                  str2 = "UG_GET_FIELD_EMPTY";
                               }
                            }catch(java.lang.Exception e0){
                               e0.printStackTrace();
                               str2 = "UG_EXCEPTION_HAPPEN";
                            }
                         }else {
                            str2 = str1;
                         }
                      }
                   }
                   str12 = "UG_GET_FIELD_EMPTY";
                label_0424 :
                   DeviceInfoManager.l(DeviceInfoManager.d, "ip_address", str12, null, 4, null);
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "27") != PatchProxyResult.class) {
                }else {
                   obj = d.b();
                   if (obj != null) {
                      str2 = a.a(obj);
                      if (str2 != null) {
                         str9 = str2;
                      label_0452 :
                         DeviceInfoManager.l(d, "bluetooth_mac_address", str9, null, 4, null);
                      }
                   }
                   str9 = "UG_GET_FIELD_EMPTY";
                   goto label_0452 ;
                }
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "28") != PatchProxyResult.class) {
                }else {
                   obj = d.b();
                   if (obj != null) {
                      try{
                         str = PatchProxy.applyOneRefs(obj, null, a.class, str);
                         if (str != PatchProxyResult.class) {
                         }else {
                            a.p(obj, "context");
                            str = a.a();
                            if (a.h(str)) {
                               String[] stringArray = new String[]{"android.permission.ACCESS_WIFI_STATE"};
                               if (b.a(obj, stringArray)) {
                                  WifiInfo systemServic = obj.getApplicationContext().getSystemService("wifi");
                                  if (systemServic != null) {
                                     systemServic = systemServic.getConnectionInfo();
                                     str1 = (systemServic != null)? MacAddressInterceptor.getMacAddress(systemServic): null;
                                     d.d().info("WifiMac", "WifiManager: "+str1);
                                  }else {
                                  label_04cb :
                                     Object[] objArray = str;
                                  }
                               }
                            }else {
                               goto label_04cb ;
                            }
                            if (a.h(str1)) {
                               str = "UG_GET_FIELD_EMPTY";
                            }else {
                               a.m(str1);
                               str = str1;
                            }
                         }
                      }catch(java.lang.Exception e0){
                         str = "UG_EXCEPTION_HAPPEN";
                      }
                      if (str != null) {
                         str12 = str;
                      label_04e1 :
                         DeviceInfoManager.l(DeviceInfoManager.d, "wifi_mac_address", str12, null, 4, null);
                      }
                   }
                   str12 = "UG_GET_FIELD_EMPTY";
                   goto label_04e1 ;
                }
                d = DeviceInfoManager.d;
                Objects.requireNonNull(d);
                if (PatchProxy.applyOneRefs(null, d, uDeviceInfoM, "29") != PatchProxyResult.class) {
                }else {
                   uContext = d.b();
                   if (uContext != null) {
                      String str10 = c.a(uContext);
                      if (str10 != null) {
                         str11 = str10;
                      label_050f :
                         DeviceInfoManager.l(DeviceInfoManager.d, "wifi_info", str11, null, 4, null);
                      }
                   }
                   str11 = "UG_GET_FIELD_EMPTY";
                   goto label_050f ;
                }
                d = DeviceInfoManager.d;
                d.f();
                d.k();
             }
          }
       }
    label_0521 :
       return;
    }
}

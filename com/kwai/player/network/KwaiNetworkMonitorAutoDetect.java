package com.kwai.player.network.KwaiNetworkMonitorAutoDetect;
import android.content.BroadcastReceiver;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$e;
import android.content.Context;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$a;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$d;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$ConnectionType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Network;
import java.lang.Number;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$c;
import android.net.LinkProperties;
import android.net.ConnectivityManager;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$b;
import java.util.Iterator;
import android.net.LinkAddress;
import java.net.InetAddress;
import java.util.Collection;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate;
import java.util.Collections;
import android.net.NetworkInfo;
import java.lang.Boolean;
import android.net.NetworkCapabilities;
import java.lang.RuntimeException;
import android.content.Intent;

public class KwaiNetworkMonitorAutoDetect extends BroadcastReceiver	// class@0012f7
{
    public final KwaiNetworkMonitorAutoDetect$e a;
    public final Context b;
    public KwaiNetworkMonitorAutoDetect$a c;
    public KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate d;
    public boolean e;

    public void KwaiNetworkMonitorAutoDetect(KwaiNetworkMonitorAutoDetect$e p0,Context p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new KwaiNetworkMonitorAutoDetect$a(p1);
    }
    public static KwaiNetworkMonitorAutoDetect$ConnectionType b(KwaiNetworkMonitorAutoDetect$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiNetworkMonitorAutoDetect.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiNetworkMonitorAutoDetect.c(p0.c(), p0.b(), p0.a());
    }
    public static KwaiNetworkMonitorAutoDetect$ConnectionType c(boolean p0,int p1,int p2){
       if (!p0) {
          return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
       }
       if (p1) {
          if (p1 == 1) {
             return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI;
          }
          if (p1 == 6) {
             return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
          }
          if (p1 == 7) {
             return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_BLUETOOTH;
          }
          if (p1 == 9) {
             return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_ETHERNET;
          }
          if (p1 != 17) {
             return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN;
          }
          return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_VPN;
       }else {
          switch (p2){
              case 1:
              case 4:
              case 7:
              case 11:
              case 2:
                return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_2G;
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 5:
                return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_3G;
              case 13:
                return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
              default:
                return KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
          }
       }
    }
    public static long e(Network p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiNetworkMonitorAutoDetect.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getNetworkHandle();
       }
       return (long)Integer.parseInt(p0.toString());
    }
    public List a(){
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KwaiNetworkMonitorAutoDetect obj1 = PatchProxy.apply(objArray, obj, KwaiNetworkMonitorAutoDetect.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.c;
       Objects.requireNonNull(obj1);
       KwaiNetworkMonitorAutoDetect$a uoa = KwaiNetworkMonitorAutoDetect$a.class;
       Object[] objArray1 = PatchProxy.apply(objArray, obj1, uoa, "5");
       if (objArray1 != patchProxyRe) {
       }else if(!obj1.d()){
          objArray1 = objArray;
       }else {
          objArray1 = new ArrayList();
          Network[] networkArray = obj1.a();
          int len = networkArray.length;
          int i = 0;
          while (i < len) {
             object oobject = networkArray[i];
             String str = "7";
             Object[] objArray3 = PatchProxy.applyOneRefs(oobject, obj1, uoa, str);
             if (objArray3 != patchProxyRe) {
             }else if(oobject != null){
                KwaiNetworkMonitorAutoDetect$a a = obj1.a;
                if (a != null) {
                   LinkProperties linkProperti = a.getLinkProperties(oobject);
                   if (linkProperti != null && linkProperti.getInterfaceName() != null) {
                      KwaiNetworkMonitorAutoDetect$d uod = obj1.b(oobject);
                      KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT = KwaiNetworkMonitorAutoDetect.b(uod);
                      KwaiNetworkMonitorAutoDetect$ConnectionType cONNECTION_N = KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
                      if (uConnectionT != cONNECTION_N) {
                         if (uConnectionT == KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN || uConnectionT == KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                            oobject.toString();
                            Objects.toString(uConnectionT);
                            uod.b();
                         }
                         KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT1 = PatchProxy.applyOneRefs(uod, objArray, KwaiNetworkMonitorAutoDetect.class, str);
                         if (uConnectionT1 != patchProxyRe) {
                         }else if(uod.b() != 17){
                            uConnectionT2 = cONNECTION_N;
                         label_00a3 :
                            str = linkProperti.getInterfaceName();
                            long l = KwaiNetworkMonitorAutoDetect.e(oobject);
                            KwaiNetworkMonitorAutoDetect$b[] uobArray = PatchProxy.applyOneRefs(linkProperti, obj1, uoa, "11");
                            if (uobArray != patchProxyRe) {
                            }else {
                               uobArray = new KwaiNetworkMonitorAutoDetect$b[linkProperti.getLinkAddresses().size()];
                               Iterator iterator = linkProperti.getLinkAddresses().iterator();
                               int i1 = 0;
                               while (iterator.hasNext()) {
                                  uobArray[i1] = new KwaiNetworkMonitorAutoDetect$b(iterator.next().getAddress());
                                  i1 = i1 + 1;
                                  KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT3 = null;
                               }
                            }
                            Object obj2 = uobArray;
                            KwaiNetworkMonitorAutoDetect$c uoc = new KwaiNetworkMonitorAutoDetect$c(str, uConnectionT, uConnectionT2, l, obj2);
                            objArray3 = uConnectionT1;
                         }else {
                            uConnectionT1 = KwaiNetworkMonitorAutoDetect.c(uod.c(), uod.d, uod.e);
                         }
                         uConnectionT2 = uConnectionT1;
                         goto label_00a3 ;
                      }
                   }
                   objArray3 = objArray;
                }
             }
             objArray3 = null;
             if (objArray3 != null) {
                objArray1.add(objArray3);
             }
             i = i + 1;
             objArray = null;
          }
       }
       if (objArray1 == null) {
          return null;
       }else {
          Object[] objArray2 = null;
          ArrayList uArrayList = new ArrayList(objArray1);
          KwaiNetworkMonitorAutoDetect d = obj.d;
          if (d != null) {
             Objects.requireNonNull(d);
             List list = PatchProxy.apply(objArray2, d, KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class, "3");
             if (list != patchProxyRe) {
             }else {
                KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate c = d.c;
                list = (c != null)? Collections.singletonList(c): Collections.emptyList();
             }
             uArrayList.addAll(list);
          }
          return uArrayList;
       }
    }
    public long d(){
       long l;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KwaiNetworkMonitorAutoDetect obj = PatchProxy.apply(objArray, this, KwaiNetworkMonitorAutoDetect.class, "5");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       NetworkInfo obj1 = PatchProxy.apply(objArray, obj, KwaiNetworkMonitorAutoDetect$a.class, "6");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else if(!obj.d()){
          obj1 = obj.a.getActiveNetworkInfo();
          if (obj1 != null) {
             Network[] networkArray = obj.a();
             int len = networkArray.length;
             int i = -1;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject = networkArray[i1];
                   NetworkInfo obj2 = PatchProxy.applyOneRefs(oobject, obj, KwaiNetworkMonitorAutoDetect$a.class, "8");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else {
                      KwaiNetworkMonitorAutoDetect$a a = obj.a;
                      if (a != null) {
                         NetworkCapabilities networkCapab = a.getNetworkCapabilities(oobject);
                         if (networkCapab != null && networkCapab.hasCapability(12)) {
                            b = true;
                         }
                      }
                      b = false;
                   }
                   if (b) {
                      obj2 = obj.a.getNetworkInfo(oobject);
                      if (obj2 != null && obj2.getType() == obj1.getType()) {
                         if (!i - -1) {
                            i = KwaiNetworkMonitorAutoDetect.e(oobject);
                         }else {
                            throw new RuntimeException("Multiple connected networks of same type are not supported.");
                         }
                      }
                   }
                   i1 = i1 + 1;
                }else {
                   l = i;
                   break ;
                }
             }
          }
       }
       l = -1;
       return l;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiNetworkMonitorAutoDetect.class, "8")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KwaiNetworkMonitorAutoDetect obj = PatchProxy.apply(objArray, this, KwaiNetworkMonitorAutoDetect.class, "4");
       if (obj != patchProxyRe) {
       }else {
          obj = this.c;
          Objects.requireNonNull(obj);
          KwaiNetworkMonitorAutoDetect$d obj1 = PatchProxy.apply(objArray, obj, KwaiNetworkMonitorAutoDetect$a.class, "1");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             KwaiNetworkMonitorAutoDetect$a a = obj.a;
             if (a == null) {
                obj1 = new KwaiNetworkMonitorAutoDetect$d(false, -1, -1, -1, -1);
             }else {
                KwaiNetworkMonitorAutoDetect$d uod = obj.c(a.getActiveNetworkInfo());
             }
             obj = a;
          }
       }
       if (("android.net.conn.CONNECTIVITY_CHANGE").equals(p1.getAction()) && !PatchProxy.applyVoidOneRefs(obj, this, KwaiNetworkMonitorAutoDetect.class, "9")) {
          this.a.a(KwaiNetworkMonitorAutoDetect.b(obj));
       }
       return;
    }
}

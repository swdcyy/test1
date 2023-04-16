package com.kwai.player.network.KwaiNetworkMonitorAutoDetect$a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.Network;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$d;
import android.net.NetworkInfo;
import android.net.NetworkCapabilities;
import android.os.Build$VERSION;

public class KwaiNetworkMonitorAutoDetect$a	// class@0012f2
{
    public final ConnectivityManager a;

    public void KwaiNetworkMonitorAutoDetect$a(){
       super();
       this.a = null;
    }
    public void KwaiNetworkMonitorAutoDetect$a(Context p0){
       ConnectivityManager systemServic;
       try{
          super();
          systemServic = p0.getSystemService("connectivity");
       }catch(java.lang.Exception e0){
          systemServic = null;
       }
       this.a = systemServic;
       return;
    }
    public Network[] a(){
       KwaiNetworkMonitorAutoDetect$a obj = PatchProxy.apply(null, this, KwaiNetworkMonitorAutoDetect$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.getAllNetworks();
       }
       Network[] networkArray = new Network[0];
       return networkArray;
    }
    public KwaiNetworkMonitorAutoDetect$d b(Network p0){
       KwaiNetworkMonitorAutoDetect$d uod;
       NetworkInfo activeNetwor;
       Object obj = this;
       NetworkCapabilities obj1 = p0;
       KwaiNetworkMonitorAutoDetect$a obj2 = PatchProxy.applyOneRefs(obj1, obj, KwaiNetworkMonitorAutoDetect$a.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = obj.a;
       if (obj2 == null) {
          uod = new KwaiNetworkMonitorAutoDetect$d(false, -1, -1, -1, -1);
          return obj1;
       }else {
          NetworkInfo networkInfo = obj2.getNetworkInfo(obj1);
          if (networkInfo == null) {
             uod = new KwaiNetworkMonitorAutoDetect$d(false, -1, -1, -1, -1);
             return obj1;
          }else {
             boolean b = 17;
             if (networkInfo.getType() != b) {
                obj1 = obj.a.getNetworkCapabilities(obj1);
                if (obj1 == null || !obj1.hasTransport(4)) {
                   return obj.c(networkInfo);
                }else {
                   uod = new KwaiNetworkMonitorAutoDetect$d(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                   return obj1;
                }
             }else if(networkInfo.getType() == b){
                if (Build$VERSION.SDK_INT >= 23 && obj1.equals(obj.a.getActiveNetwork())) {
                   activeNetwor = obj.a.getActiveNetworkInfo();
                   if (activeNetwor != null && activeNetwor.getType() != b) {
                      KwaiNetworkMonitorAutoDetect$d uod1 = new KwaiNetworkMonitorAutoDetect$d(networkInfo.isConnected(), 17, -1, activeNetwor.getType(), activeNetwor.getSubtype());
                      return v3;
                   }
                }
                KwaiNetworkMonitorAutoDetect$d uod2 = new KwaiNetworkMonitorAutoDetect$d(networkInfo.isConnected(), 17, -1, -1, -1);
                return activeNetwor;
             }else {
                return obj.c(networkInfo);
             }
          }
       }
    }
    public final KwaiNetworkMonitorAutoDetect$d c(NetworkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiNetworkMonitorAutoDetect$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.isConnected()) {
          KwaiNetworkMonitorAutoDetect$d uod = new KwaiNetworkMonitorAutoDetect$d(false, -1, -1, -1, -1);
          return p0;
       }else {
          KwaiNetworkMonitorAutoDetect$d uod1 = new KwaiNetworkMonitorAutoDetect$d(true, p0.getType(), p0.getSubtype(), -1, -1);
          return obj;
       }
    }
    public boolean d(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
}

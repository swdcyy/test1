package com.kwai.video.krtc.Arya$3;
import android.content.BroadcastReceiver;
import com.kwai.video.krtc.Arya;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.NetworkUtils;

public class Arya$3 extends BroadcastReceiver	// class@000652
{
    public final Arya this$0;

    public void Arya$3(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$3.class, "1")) {
          return;
       }
       String action = p1.getAction();
       if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
          NetworkInfo activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
          String str = Arya.a(this.this$0, activeNetwor);
          int i = 1;
          String str1 = "Arya";
          long l = 2;
          if (activeNetwor != null && activeNetwor.isAvailable()) {
             int type = activeNetwor.getType();
             Log.i(str1, "NetworkInfo network changed type:"+type);
             if (!type) {
                i1 = 1;
             }else if(type == i){
                i1 = 2;
             }else if(type == 9){
                i1 = 3;
             }else {
             label_005f :
                i1 = 0;
             }
          }else {
             goto label_005f ;
          }
          String wifiRouterIp = (!str.equals(Arya.m(this.this$0)) || (str.equals("none;;") && i1 == l))? NetworkUtils.getWifiRouterIpV4Address(p0): "";
          String str2 = wifiRouterIp;
          Log.i(str1, "network changed: voip_network_type"+Arya.n(this.this$0)+" networktype:"+i1);
          if (Arya.n(this.this$0) != i1 || Arya.m(this.this$0) != str) {
             Arya.b(this.this$0, i1);
             Arya.e(this.this$0, str);
             Arya$3 tthis$0 = this.this$0;
             Arya.a(tthis$0, Arya.c(tthis$0), i1, str, str2);
          }
       }
    label_00c3 :
       return;
    }
}

package com.kuaishou.aegon.NetworkActivationHelper$a;
import android.net.ConnectivityManager$NetworkCallback;
import java.lang.String;
import android.net.ConnectivityManager;
import com.kuaishou.aegon.NetworkSwitchCallback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import com.kuaishou.aegon.NetworkActivationHelper;
import java.lang.StringBuilder;
import bo.t;
import android.net.Network;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request$Builder;
import okhttp3.Request;
import java.lang.System;
import okhttp3.Call;
import okhttp3.Response;
import java.lang.Throwable;
import java.io.IOException;
import com.kuaishou.aegon.NetworkSwitchCallback$Status;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.aegon.Aegon;
import android.os.Build$VERSION;
import java.lang.IllegalStateException;
import android.net.NetworkCapabilities;
import java.lang.Integer;

public class NetworkActivationHelper$a extends ConnectivityManager$NetworkCallback	// class@000799
{
    public NetworkSwitchCallback a;
    public boolean b;
    public String c;
    public int d;
    public ConnectivityManager e;
    public int f;

    public void NetworkActivationHelper$a(int p0,boolean p1,String p2,ConnectivityManager p3,NetworkSwitchCallback p4){
       super();
       this.a = null;
       this.b = true;
       this.c = "";
       this.d = 0;
       this.f = -1;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.a = p4;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, NetworkActivationHelper$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = NetworkQualityEstimator.b();
       if (this.d != null || (i <= NetworkActivationHelper.d && (NetworkActivationHelper.b || i != -1))) {
          return true;
       }
       t.c("NetworkActivationHelper", "Nqe score is not poor to switch network: nqeScore="+i);
       return false;
    }
    public final boolean b(Network p0){
       int i;
       OkHttpClient$Builder obj = PatchProxy.applyOneRefs(p0, this, NetworkActivationHelper$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       obj = new OkHttpClient$Builder().connectTimeout(500, mILLISECONDS).readTimeout(500, mILLISECONDS).writeTimeout(500, mILLISECONDS);
       OkHttpClient okHttpClient = obj.socketFactory(p0.getSocketFactory()).build();
       Request request = new Request$Builder().url(this.c).get().build();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          Response response = okHttpClient.newCall(request).execute();
          long l1 = System.currentTimeMillis() - l;
          if (response.code() != 200 || l1 - NetworkActivationHelper.e > 0) {
             t.c("NetworkActivationHelper", "Speed request failed: code="+response.code()+", totalCost="+l1);
             response.close();
             return i;
          }else {
             t.c("NetworkActivationHelper", "Speed request success: network="+p0.toString()+", totalCost="+l1);
             response.close();
             return true;
          }
       }catch(java.io.IOException e10){
          t.b("NetworkActivationHelper", "Speed request error: "+e10.getMessage());
          return i;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, NetworkActivationHelper$a.class, "1")) {
          return;
       }
       NetworkActivationHelper.c(this.d, this.e);
       this.f = -1;
       this.a.a(NetworkSwitchCallback$Status.NETWORK_SWITCH_RESET);
       if (!NetworkActivationHelper.c) {
          NetworkActivationHelper.i = false;
       }
       return;
    }
    public void onAvailable(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkActivationHelper$a.class, "4")) {
          return;
       }
       boolean b = false;
       NetworkActivationHelper.k = b;
       if (this.f == this.d) {
          t.c("NetworkActivationHelper", "Already switch network to: "+this.f);
          return;
       }else {
          try{
             t.c("NetworkActivationHelper", "Network onAvailable: "+p0.toString());
             String str = "Network should not be switched to ";
             if (this.b != null) {
                t.c("NetworkActivationHelper", str+this.d+" because of activate only.");
                this.a.a(NetworkSwitchCallback$Status.NETWORK_ACTIVATE_ONLY);
                return;
             }else if(!TextUtils.isEmpty(this.c) && !this.b(p0)){
                t.c("NetworkActivationHelper", str+this.d+" because of speed failed.");
                this.a.a(NetworkSwitchCallback$Status.NETWORK_SPEED_FAILED);
                return;
             }else if(!this.a()){
                t.c("NetworkActivationHelper", str+this.d+" because nqe is not poor.");
                this.a.a(NetworkSwitchCallback$Status.NETWORK_NQE_NOT_POOR);
                return;
             }else if(this.d != null){
                b = true;
             }
             Aegon.b(b);
             boolean b1 = (Build$VERSION.SDK_INT < 23)? ConnectivityManager.setProcessDefaultNetwork(p0): this.e.bindProcessToNetwork(p0);
             if (b1) {
                t.c("NetworkActivationHelper", "Switch network success.");
                this.f = this.d;
                NetworkActivationHelper.j = true;
                NetworkActivationHelper.d(this.d);
                this.a.a(NetworkSwitchCallback$Status.NETWORK_SWITCH_SUCCESS);
             }else {
                t.c("NetworkActivationHelper", "Switch network failed.");
                this.a.a(NetworkSwitchCallback$Status.NETWORK_BIND_FAILED);
             }
          }catch(java.lang.IllegalStateException e5){
             t.b("NetworkActivationHelper", "Network onAvailable failed: "+e5.toString());
             NetworkActivationHelper$a ta = this.a;
             if (ta != null) {
                ta.a(NetworkSwitchCallback$Status.NETWORK_SWITCH_ERROR);
                this.a.onError("Network onAvailable failed: "+e5.toString());
             }
          }
             return;
       }
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkActivationHelper$a.class, "8")) {
          return;
       }
       t.c("NetworkActivationHelper", "Network onCapabilitiesChanged.");
       return;
    }
    public void onLosing(Network p0,int p1){
       if (PatchProxy.isSupport(NetworkActivationHelper$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NetworkActivationHelper$a.class, "5")) {
          return;
       }
       t.c("NetworkActivationHelper", "Network onLosing: "+p0.toString());
       if (NetworkActivationHelper.f) {
          this.c();
       }
       return;
    }
    public void onLost(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkActivationHelper$a.class, "6")) {
          return;
       }
       t.c("NetworkActivationHelper", "Network onLost: "+p0.toString());
       this.c();
       return;
    }
    public void onUnavailable(){
       if (PatchProxy.applyVoid(null, this, NetworkActivationHelper$a.class, "7")) {
          return;
       }
       NetworkActivationHelper.k = false;
       t.c("NetworkActivationHelper", "Network onUnavailable.");
       this.c();
       return;
    }
}

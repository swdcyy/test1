package com.kuaishou.aegon.NetworkActivationHelper;
import java.util.HashMap;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import bo.t;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import org.json.JSONArray;
import com.kuaishou.aegon.m;
import java.lang.Runnable;
import io.b;
import java.lang.Exception;
import com.kuaishou.aegon.NetworkSwitchCallback;
import java.lang.Integer;
import android.net.ConnectivityManager;
import android.os.Process;
import a0.a;
import com.kuaishou.aegon.NetworkSwitchCallback$Status;
import com.kuaishou.aegon.NetworkActivationHelper$a;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import java.util.Map;
import android.net.ConnectivityManager$NetworkCallback;
import java.lang.SecurityException;
import com.kuaishou.aegon.Aegon;
import android.os.Build$VERSION;
import android.net.Network;
import bo.u;

public class NetworkActivationHelper	// class@00079a
{
    public static Context a;
    public static boolean b;
    public static boolean c;
    public static int d;
    public static long e;
    public static boolean f;
    public static boolean g;
    public static int[] h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static int m;
    public static ConnectivityManager n;
    public static Map o;
    public static final Object p;

    static {
       NetworkActivationHelper.o = new HashMap();
       NetworkActivationHelper.p = new Object();
    }
    public void NetworkActivationHelper(){
       super();
    }
    public static void a(Context p0,boolean p1,String p2){
       boolean b = p1;
       String str = p2;
       if (PatchProxy.isSupport(NetworkActivationHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, NetworkActivationHelper.class, "1")) {
          return;
       }
       t.c("NetworkActivationHelper", "Initializing, enableNetworkSwitch="+b+", networkActivationJsonConfig="+str);
       NetworkActivationHelper.a = p0;
       NetworkActivationHelper.i = b;
       NetworkActivationHelper.l = true;
       if (TextUtils.isEmpty(p2)) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(str);
          if (jSONObject.has("max_nqe_score_allow_network_switch")) {
             NetworkActivationHelper.d = jSONObject.getInt("max_nqe_score_allow_network_switch");
          label_006a :
             if (jSONObject.has("allow_network_switch_without_nqe_score")) {
                NetworkActivationHelper.b = jSONObject.getBoolean("allow_network_switch_without_nqe_score");
             }
             if (jSONObject.has("allow_network_switch_if_reset")) {
                NetworkActivationHelper.c = jSONObject.getBoolean("allow_network_switch_if_reset");
             }
             if (jSONObject.has("reset_network_for_on_losing")) {
                NetworkActivationHelper.f = jSONObject.getBoolean("reset_network_for_on_losing");
             }
             if (jSONObject.has("monitor_error_code_to_reset_network")) {
                NetworkActivationHelper.g = jSONObject.getBoolean("monitor_error_code_to_reset_network");
             }
             if (jSONObject.has("error_code_list_to_reset_network")) {
                JSONArray jSONArray = jSONObject.getJSONArray("error_code_list_to_reset_network");
                int[] ointArray = new int[jSONArray.length()];
                NetworkActivationHelper.h = ointArray;
                for (int i = 0; i < jSONArray.length(); i = i + 1) {
                   NetworkActivationHelper.h[i] = jSONArray.getInt(i);
                }
             }
             if (jSONObject.has("speed_request_cost")) {
                NetworkActivationHelper.e = jSONObject.getLong("speed_request_cost");
             }
             if (NetworkActivationHelper.g) {
                b.c(m.b);
             }
          }else {
             goto label_006a ;
          }
       }catch(java.lang.Exception e0){
          t.b("NetworkActivationHelper", "Parse network activation config error: "+e0.getMessage());
       }
       return;
    }
    public static void b(int p0,boolean p1,String p2,NetworkSwitchCallback p3){
       NetworkActivationHelper networkActiv = NetworkActivationHelper.class;
       if (PatchProxy.isSupport(networkActiv) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, NetworkActivationHelper.class, "6")) {
          return;
       }
       if (!NetworkActivationHelper.l || !NetworkActivationHelper.i) {
          p3.a(NetworkSwitchCallback$Status.NETWORK_SWITCH_CLOSE);
          return;
       }else {
          ConnectivityManager systemServic = NetworkActivationHelper.a.getSystemService("connectivity");
          if (systemServic == null) {
             return;
          }
          NetworkActivationHelper.n = systemServic;
          if (a.a(NetworkActivationHelper.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid())) {
             t.c("NetworkActivationHelper", "No permission");
             p3.a(NetworkSwitchCallback$Status.NETWORK_NO_PERMISSION);
             return;
          }else {
             ConnectivityManager n = NetworkActivationHelper.n;
             NetworkActivationHelper$a uoa = v7;
             int i = p0;
             boolean b = p1;
             String str = p2;
             NetworkSwitchCallback networkSwitc = p3;
             try{
                uoa = new NetworkActivationHelper$a(i, b, str, n, networkSwitc);
                t.c("NetworkActivationHelper", "RequestNetwork: "+p0);
                NetworkRequest networkReque = new NetworkRequest$Builder().addTransportType(p0).addCapability(12).build();
                if (!NetworkActivationHelper.k) {
                   p2 = NetworkActivationHelper.p;
                   _monitor_enter(p2);
                   if (NetworkActivationHelper.o.containsKey(Integer.valueOf(p0))) {
                      systemServic = NetworkActivationHelper.n;
                      ConnectivityManager$NetworkCallback networkCallb = NetworkActivationHelper.o.get(Integer.valueOf(p0));
                      if (!PatchProxy.applyVoidTwoRefs(systemServic, networkCallb, null, networkActiv, "4")) {
                         try{
                            systemServic.unregisterNetworkCallback(networkCallb);
                         }catch(java.lang.Exception e0){
                            t.b("NetworkActivationHelper", "Unregister NetworkCallback failed: "+e0.toString());
                         }
                      }
                   }
                }
             }catch(java.lang.SecurityException e9){
                NetworkActivationHelper.k = false;
                t.b("NetworkActivationHelper", "RequestNetwork failed: "+e9.toString());
                p3.a(NetworkSwitchCallback$Status.NETWORK_SWITCH_ERROR);
                p3.onError("RequestNetwork failed: "+e9.toString());
             }
             return;
          }
       }
    }
    public static void c(int p0,ConnectivityManager p1){
       NetworkActivationHelper networkActiv = NetworkActivationHelper.class;
       if (PatchProxy.isSupport(networkActiv) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, networkActiv, "5")) {
          return;
       }
       try{
          t.c("NetworkActivationHelper", "ResetNetwork: "+p0);
          boolean b = (p0)? true: false;
          Aegon.b(b);
          if (Build$VERSION.SDK_INT < 23) {
             ConnectivityManager.setProcessDefaultNetwork(null);
          }else {
             p1.bindProcessToNetwork(null);
          }
          NetworkActivationHelper.j = false;
          NetworkActivationHelper.d(-1);
       }catch(java.lang.Exception e5){
          t.b("NetworkActivationHelper", "ResetNetwork failed: "+e5.toString());
       }
       return;
    }
    public static void d(int p0){
       NetworkActivationHelper networkActiv = NetworkActivationHelper.class;
       if (PatchProxy.isSupport(networkActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, networkActiv, "3")) {
          return;
       }
       b.c(new u(p0));
       return;
    }
    public static native void nativeSetResetNetworkWithErrorCodeMethod(int[] p0);
    public static native void nativeUpdateProcessNetwork(int p0);
}

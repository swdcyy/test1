package com.oplus.ocs.base.common.api.CapabilityApiClient;
import java.util.HashMap;
import java.lang.Object;
import android.content.Context;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.AuthResult;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.CapabilityListener;
import java.util.Map;
import java.lang.StringBuilder;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.common.api.l;
import com.oplus.ocs.base.internal.ClientSettings;
import com.oplus.ocs.base.common.api.CapabilityApiClient$1;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.common.api.Api$ClientKey;
import com.oplus.ocs.base.common.api.m;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import com.oplus.ocs.base.common.api.l$3;
import com.oplus.ocs.base.common.api.j;
import com.oplus.ocs.base.common.api.OplusApiClient;
import com.oplus.ocs.base.common.api.i;

public class CapabilityApiClient	// class@000acc
{
    public static final String TAG = "CapabilityApiClient";
    public static Map sApis;

    static {
       CapabilityApiClient.sApis = new HashMap();
    }
    public void CapabilityApiClient(){
       super();
    }
    public static CapabilityInfo buildCapabilityInfo(Context p0,int p1){
       byte[] uobyteArray = new byte[4];
       AuthResult uAuthResult = new AuthResult(p0.getPackageName(), 0, 0, p1, uobyteArray);
       return new CapabilityInfo(new ArrayList(), 0x186ab, v6);
    }
    public static synchronized void callback(Api[] p0,int[] p1,CapabilityListener p2){
       _monitor_enter(CapabilityApiClient.class);
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (!p1[i]) {
                _monitor_exit(CapabilityApiClient.class);
                return;
             }else {
                i = i + 1;
             }
          }else if(p2 != null){
             p2.onResult(p0, p1);
             break ;
          }
          break ;
       }
       _monitor_exit(CapabilityApiClient.class);
       return;
    }
    public static boolean checkCapability(Api p0){
       if (CapabilityApiClient.sApis.containsKey(p0)) {
          CapabilityInfo uCapabilityI = CapabilityApiClient.sApis.get(p0);
          if (uCapabilityI != null && (uCapabilityI.getAuthResult() != null && uCapabilityI.getAuthResult().getErrrorCode() == 1001)) {
             return true;
          }
       }
       return false;
    }
    public static void checkSelfCapabilities(Context p0,Api[] p1,CapabilityListener p2){
       int i = 0;
       if (p1 == null || !p1.length) {
          if (p2 != null) {
             Api[] uApiArray = new Api[i];
             int[] ointArray = new int[i];
             p2.onResult(uApiArray, ointArray);
          }
          a.a(CapabilityApiClient.TAG, "capa apis is empty");
          return;
       }else {
          int[] ointArray1 = new int[p1.length];
          while (i < p1.length) {
             object oobject = p1[i];
             if (CapabilityApiClient.sApis.containsKey(oobject)) {
                CapabilityInfo uCapabilityI = CapabilityApiClient.sApis.get(oobject);
                if (uCapabilityI != null && uCapabilityI.getAuthResult() != null) {
                   ointArray1[i] = uCapabilityI.getAuthResult().getErrrorCode();
                }else {
                   a.a(CapabilityApiClient.TAG, oobject.getName()+"sapis none");
                   ointArray1[i] = 7;
                }
                CapabilityApiClient.callback(p1, ointArray1, p2);
             }else if(oobject.isAuth()){
                l ol = l.a(p0);
                ClientSettings uClientSetti = new ClientSettings(p0.getPackageName());
                CapabilityApiClient$1 u1 = new CapabilityApiClient$1(ointArray1, i, oobject, p0, p1, p2);
                d.a(oobject, "api not be null");
                d.a(uClientSetti, "clientsettings not be null");
                if (!l.c.containsKey(oobject.getClientKey())) {
                   m om = new m(ol.a, oobject, null, uClientSetti);
                   om.setOnClearListener(new l$3(ol, oobject));
                   om.setOnCapabilityAuthListener(v12);
                   l.c.put(oobject.getClientKey(), om);
                   ol.a(oobject);
                }
             }else {
                a.a(CapabilityApiClient.TAG, "current capa doesn\'t need to authenticate.");
                ointArray1[i] = 1001;
                CapabilityApiClient.sApis.put(oobject, CapabilityApiClient.buildCapabilityInfo(p0, 1001));
                CapabilityApiClient.callback(p1, ointArray1, p2);
             }
             i = i + 1;
          }
          return;
       }
    }
    public static CapabilityInfo getCapabilityInfo(Api p0){
       return CapabilityApiClient.sApis.get(p0);
    }
}

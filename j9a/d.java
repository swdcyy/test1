package j9a.d;
import java.lang.StringBuilder;
import java.lang.String;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import j9a.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.os.Build;
import android.os.Build$VERSION;
import uw9.c;
import android.content.SharedPreferences;
import com.kuaishou.aegon.NetworkActivationHelper;
import java.lang.Integer;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Process;
import a0.a;
import bo.t;

public class d	// class@00298c
{
    public long a;
    public boolean b;
    public static a c;
    public static Boolean d;
    public static int e;
    public static String f;
    public static long g;
    public static boolean h;
    public static boolean i;
    public static List j;

    static {
       d.f = "https://"+d.a().c("api").mHost+"/rest/n/system/wifi/speed";
       d.g = 0;
       d.h = false;
       d.i = false;
       d.j = new ArrayList();
    }
    public void d(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (d.d == null) {
          d.d = Boolean.valueOf(a.t().d("enableSwitchNetWork", b));
       }
       if (d.d.booleanValue() && (!d.i && !d.h)) {
          b = true;
       }
    label_003a :
       return b;
    }
    public static a b(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (d.c == null) {
          obj = a.t().c("switchNetWorkConfig", "");
          try{
             if (!TextUtils.x(obj)) {
                a uoa = a.a.h(obj, a.class);
                d.c = uoa;
                Object obj1 = PatchProxy.applyOneRefs(uoa, objArray, uod, "3");
                boolean b = true;
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(uoa == null){
                   uoa = uoa.mBanDeviceNameList;
                   if (!q.f(uoa)) {
                      Iterator iterator1 = uoa.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            if ((iterator1.next()).equals(Build.MODEL)) {
                               b1 = true;
                               break ;
                            }
                         }
                      }
                   }
                }
                b1 = false;
                d.h = b1;
                uoa = d.c;
                Object obj2 = PatchProxy.applyOneRefs(uoa, objArray, uod, "4");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(uoa == null){
                   a mBanOsVersio = uoa.mBanOsVersionList;
                   if (!q.f(mBanOsVersio)) {
                      Iterator iterator = mBanOsVersio.iterator();
                      do {
                         if (iterator.hasNext()) {
                         }
                      } while ((iterator.next()).equals(Build$VERSION.RELEASE));
                   }
                }
                b = false;
                d.i = b;
             }else {
                d.c = new a();
             }
          }catch(java.lang.Exception e0){
             d.c = new a();
          }
       }
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.a.getBoolean("closeSwitchNetSetting", false);
    }
    public static void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, d.class, "18")) {
          return;
       }
       if (d.e == 2) {
          int i = 0;
          NetworkActivationHelper networkActiv = NetworkActivationHelper.class;
          if (!PatchProxy.isSupport(networkActiv) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), objArray, networkActiv, "7") && (!NetworkActivationHelper.l || (NetworkActivationHelper.i && NetworkActivationHelper.j)))) {
             ConnectivityManager systemServic = NetworkActivationHelper.a.getSystemService("connectivity");
             if (systemServic != null) {
                if (a.a(NetworkActivationHelper.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid())) {
                   t.c("NetworkActivationHelper", "No permission");
                }else {
                   NetworkActivationHelper.c(i, systemServic);
                }
             }
          }
          d.e = 1;
       }
       return;
    }
}

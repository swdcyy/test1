package lk0.a;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.ComponentName;

public class a	// class@002f83
{
    public static final HashMap a;

    static {
       HashMap hashMap = new HashMap();
       a.a = hashMap;
       String[] stringArray = new String[]{"com.huawei.appmarket"};
       hashMap.put("HUAWEI", stringArray);
       String[] stringArray1 = new String[]{"com.oppo.market","com.heytap.market"};
       hashMap.put("OPPO", stringArray1);
       stringArray1 = new String[]{"com.bbk.appstore"};
       hashMap.put("vivo", stringArray1);
       String[] stringArray2 = new String[]{"com.xiaomi.market"};
       hashMap.put("xiaomi", stringArray2);
       stringArray1 = new String[]{"com.xiaomi.market"};
       hashMap.put("Redmi", stringArray1);
       stringArray1 = new String[]{"com.oppo.market","com.heytap.market"};
       hashMap.put("OnePlus", stringArray1);
       stringArray1 = new String[]{"com.meizu.mstore"};
       hashMap.put("Meizu", stringArray1);
       stringArray1 = new String[]{"com.smartisanos.appstore"};
       hashMap.put("SMARTISAN", stringArray1);
       stringArray = new String[]{"com.oppo.market","com.heytap.market"};
       hashMap.put("Realme", stringArray);
       String[] stringArray3 = new String[]{"com.huawei.appmarket"};
       hashMap.put("HONOR", stringArray3);
       stringArray3 = new String[]{"com.sec.android.app.samsungapps"};
       hashMap.put("samsung", stringArray3);
    }
    public void a(){
       super();
    }
    public static boolean a(Activity p0,String p1,boolean p2){
       Object[] obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = null;
       Iterator obj1 = PatchProxy.apply(obj, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          String bRAND = Build.BRAND;
          if (!TextUtils.isEmpty(bRAND)) {
             obj1 = a.a.entrySet().iterator();
             while (obj1.hasNext()) {
                Map$Entry uEntry = obj1.next();
                if ((uEntry.getKey()).equalsIgnoreCase(bRAND)) {
                   obj = uEntry.getValue();
                   break ;
                }
             }
          }
       }
       if (obj != null && obj.length >= 1) {
          try{
             Intent intent = Intent.parseUri(p1, 1);
             intent.addFlags(0x10000000);
             obj1 = p0.getPackageManager().queryIntentActivities(intent, false).iterator();
             while (true) {
                if (obj1.hasNext()) {
                   ResolveInfo resolveInfo = obj1.next();
                   ResolveInfo activityInfo = resolveInfo.activityInfo;
                   if (activityInfo == null || TextUtils.isEmpty(activityInfo.packageName)) {
                   }else {
                      int len = obj.length;
                      int i = 0;
                      while (true) {
                         if (i < len) {
                            object oobject = obj[i];
                            if (oobject.equals(resolveInfo.activityInfo.packageName)) {
                               intent.setComponent(new ComponentName(oobject, resolveInfo.activityInfo.name));
                               p0.startActivity(intent);
                               if (!p2) {
                                  p0.overridePendingTransition(false, false);
                               }
                            }else {
                               i = i + 1;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
             return 1;
          }catch(java.lang.Exception e0){
          }
       }
       return false;
    }
}

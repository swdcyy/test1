package akd.v;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import java.io.File;
import zjd.d;
import akd.p;
import android.os.Build$VERSION;
import android.content.Context;
import androidx.core.content.FileProvider;

public class v	// class@000061
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"com.dianxinos.cms","com.aspire.mm","com.taobao.appcenter","com.baidu.androidstore","com.xiaomi.market","com.eoemobile.netmarket","com.tencent.android.qqdownloader","com.oppo.market","com.qihoo.appstore","com.huawei.appmarket","com.wandoujia.phoenix2","com.meizu.mstore","cn.goapk.market","com.yingyonghui.market","com.sogou.appmall","com.lenovo.leos.appstore","com.hiapk.marketpho","com.dragon.android.pandaspace","com.bbk.appstore","com.smartisanos.appstore","com.sec.android.app.samsungapps"};
       v.a = stringArray;
    }
    public void v(){
       super();
    }
    public static boolean a(Activity p0,String p1){
       ResolveInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List list = p0.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id="+p1)), 0x10000);
       if (list == null) {
          return false;
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          obj = iterator.next();
          String[] a = v.a;
          int len = a.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = a[i];
                if (obj != null) {
                   ResolveInfo activityInfo = obj.activityInfo;
                   if (activityInfo != null) {
                      ActivityInfo packageName = activityInfo.packageName;
                      if (packageName != null && packageName.equalsIgnoreCase(oobject)) {
                         break ;
                      }
                   }
                }
                i = i + 1;
             }else {
                continue ;
             }
          }
          return true;
       }
    }
    public static void b(String p0){
       Intent intent;
       if (PatchProxy.applyVoidOneRefs(p0, null, v.class, "3")) {
          return;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return;
       }
       Activity uActivity = p.c().c();
       if (uActivity == null) {
          return;
       }
       int i = 0x10000000;
       if (Build$VERSION.SDK_INT >= 24) {
          try{
             intent = new Intent("android.intent.action.VIEW", FileProvider.getUriForFile(uActivity, uActivity.getPackageName()+".fileprovider", uFile));
             intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
             intent.addFlags(i);
             intent.addFlags(true);
             uActivity.startActivity(intent);
          }catch(java.lang.IllegalArgumentException e0){
          }
       }else {
          intent = new Intent("android.intent.action.VIEW");
          intent.addFlags(i);
          intent.setDataAndType(Uri.parse("file://"+uFile.toString()), "application/vnd.android.package-archive");
          uActivity.startActivity(intent);
       }
       return;
    }
}

package lk0.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import java.io.File;
import com.kuaishou.krn.c;
import android.content.Context;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ekd.w0;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import java.lang.Throwable;
import ek0.d;

public class b	// class@002f84
{

    public void b(){
       super();
    }
    public static void a(Activity p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.finish();
       if (!p1) {
          p0.overridePendingTransition(0, 0);
       }
       return;
    }
    public static boolean b(String p0){
       Uri uriForFile;
       Intent obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Intent("android.intent.action.VIEW");
       obj.addFlags(0x10000000);
       obj.addFlags(3);
       File uFile = new File(p0);
       Context uContext = c.b().d();
       if (Build$VERSION.SDK_INT >= 24) {
          uriForFile = FileProvider.getUriForFile(uContext, uContext.getPackageName()+".fileprovider", uFile);
          obj.addFlags(1);
       }else {
          uriForFile = w0.c(uFile);
       }
       obj.setDataAndType(uriForFile, "application/vnd.android.package-archive");
       Iterator iterator = uContext.getPackageManager().queryIntentActivities(obj, 0x10000).iterator();
       while (iterator.hasNext()) {
          uContext.grantUriPermission(iterator.next().activityInfo.packageName, uriForFile, 3);
       }
       uContext.startActivity(obj);
       return 1;
    }
}

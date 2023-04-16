package com.kwai.sharelib.KsShareApi$appName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class KsShareApi$appName$2 extends Lambda implements a	// class@00168e
{
    public static final KsShareApi$appName$2 INSTANCE;

    static {
       KsShareApi$appName$2.INSTANCE = new KsShareApi$appName$2();
    }
    public void KsShareApi$appName$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String str;
       KsShareApi obj = PatchProxy.apply(null, this, KsShareApi$appName$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = KsShareApi.s;
          PackageManager packageManag = obj.k().getPackageManager();
          ApplicationInfo applicationI = packageManag.getApplicationInfo(obj.k().getPackageName(), 0);
          a.o(applicationI, "packageManager.getApplic¡­o\(context.packageName, 0\)");
          str = packageManag.getApplicationLabel(applicationI).toString();
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          str = "";
       }
       return str;
    }
}

package com.kwai.sharelib.KsShareApi$appVersion$2;
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
import android.content.pm.PackageInfo;

public final class KsShareApi$appVersion$2 extends Lambda implements a	// class@00168f
{
    public static final KsShareApi$appVersion$2 INSTANCE;

    static {
       KsShareApi$appVersion$2.INSTANCE = new KsShareApi$appVersion$2();
    }
    public void KsShareApi$appVersion$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       KsShareApi obj = PatchProxy.apply(null, this, KsShareApi$appVersion$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.s;
       PackageManager packageManag = obj.k().getPackageManager();
       if (packageManag != null) {
          PackageInfo packageInfo = packageManag.getPackageInfo(obj.k().getPackageName(), 0);
          if (packageInfo != null) {
             packageInfo = packageInfo.versionName;
             if (packageInfo != null) {
             label_0032 :
                return packageInfo;
             }
          }
       }
       String str = "";
       goto label_0032 ;
    }
}

package com.kwai.privacykit.interceptor.PackageManagerInterceptor;
import java.lang.Object;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import wk7.j;
import java.util.Collections;

public class PackageManagerInterceptor	// class@0013c9
{

    public void PackageManagerInterceptor(){
       super();
    }
    public static List getInstalledApplications(PackageManager p0,int p1){
       if (PatchProxy.isSupport(PackageManagerInterceptor.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, PackageManagerInterceptor.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       j.d("appList", "getInstalledApplications");
       return Collections.emptyList();
    }
    public static List getInstalledPackages(PackageManager p0,int p1){
       if (PatchProxy.isSupport(PackageManagerInterceptor.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, PackageManagerInterceptor.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       j.d("appList", "getInstalledPackages");
       return Collections.emptyList();
    }
}

package g59.g;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.String;
import g59.g$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.pm.PackageInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yx.j0;
import android.content.pm.ApplicationInfo;
import java.io.File;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.ad.util.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;

public final class g	// class@002401
{

    public void g(){
       super();
    }
    public static g$a a(APKDownloadTask p0,String p1){
       Object[] objArray;
       g$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = null;
       Application obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, og, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = a.b();
       PackageInfo packageInfo = PatchProxy.applyTwoRefs(obj1, p1, obj, og, "1");
       if (packageInfo != patchProxyRe) {
       }else if(TextUtils.x(p1)){
          packageInfo = obj1.getPackageManager().getPackageInfo(p1, 128);
       }
       if (!TextUtils.x(p1) && packageInfo != null) {
          PackageInfo applicationI = packageInfo.applicationInfo;
          if (applicationI != null && !TextUtils.x(applicationI.publicSourceDir)) {
             File uFile = new File(packageInfo.applicationInfo.publicSourceDir);
             if (!uFile.exists()) {
                objArray = new Object[0];
                j0.l("AdPackageUtils", "cannot judge package, installed apk is not exists.", objArray);
                return new g$a(0, "cannot judge package, installed apk is not exists.");
             }else {
                Object[] obj2 = PatchProxy.applyTwoRefs(p0, uFile, obj, og, "4");
                if (obj2 != patchProxyRe) {
                   obj = obj2;
                }else {
                   File downloadAPKF = p0.getDownloadAPKFile();
                   if (downloadAPKF != null && (downloadAPKF.exists() && downloadAPKF.length() - uFile.length())) {
                      obj = new g$a(1, "");
                   }else if(TextUtils.x(p0.mTaskInfo.mPackageMd5)){
                      if (downloadAPKF == null || !downloadAPKF.exists()) {
                         obj = new g$a(0, "cannot judge package, has no download apk info.");
                      }else {
                         String str = a.a(downloadAPKF);
                         if (TextUtils.x(str)) {
                            str = "cannot judge package, cannot calculate md5 of download file.";
                            obj2 = new Object[0];
                            j0.l("AdPackageUtils", str, obj2);
                            obj = new g$a(0, str);
                         }else {
                            p0.mTaskInfo.mPackageMd5 = str;
                         }
                      }
                   }
                }
                if (obj != null) {
                   return obj;
                }else {
                   uFile = a.a(uFile);
                   if (TextUtils.x(uFile)) {
                      objArray = new Object[0];
                      j0.l("AdPackageUtils", "cannot judge package, cannot calculate md5 of installed file.", objArray);
                      return new g$a(0, "cannot judge package, cannot calculate md5 of installed file.");
                   }else if(uFile.equalsIgnoreCase(p0.mTaskInfo.mPackageMd5)){
                      uoa = new g$a(2, "");
                   }else {
                      uoa = new g$a(1, "");
                   }
                   return uoa;
                }
             }
          }
       }
       objArray = new Object[0];
       j0.l("AdPackageUtils", "cannot judge package, cannot get installed apk info.", objArray);
       return new g$a(0, "cannot judge package, cannot get installed apk info.");
    }
    public static boolean b(PhotoAdvertisement p0){
       PhotoAdvertisement photoAdverti = null;
       Object obj = PatchProxy.applyOneRefs(p0, photoAdverti, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          photoAdverti = p0.mUrl;
       }
       boolean b = (h.n().k(photoAdverti) == APKDownloadTask$DownloadStatus.COMPLETED)? true: false;
       return b;
    }
}

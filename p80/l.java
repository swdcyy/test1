package p80.l;
import java.lang.Runnable;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import o56.a;
import android.content.pm.ApplicationInfo;
import android.app.Application;
import zsd.u;
import com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import p80.l$a;
import com.kuaishou.webkit.extension.KwSdk$InstallCallback;

public final class l implements Runnable	// class@0028d5
{
    public final KsWebViewInstaller2 b;
    public final String c;

    public void l(KsWebViewInstaller2 p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String versionFromD;
       Object[] objArray1;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "1")) {
          return;
       }
       try{
          versionFromD = KwSdk.getVersionFromDir(this.c);
          objArray1 = objArray;
       }catch(java.lang.Exception e0){
          objArray1 = e0;
          versionFromD = "";
       }
       String installedVer = KwSdk.getInstalledVersion();
       Log.g("KsWebView", "new version "+versionFromD+", installed version "+installedVer);
       KsWebViewInstaller2 ksWebViewIns = (versionFromD == null || !versionFromD.length())? 1: null;
       if (ksWebViewIns) {
          if (!TextUtils.isEmpty(KwSdk.getBuildinVersion())) {
             l tb = this.b;
             l tc = this.c;
             a.m(tc);
             Objects.requireNonNull(tb);
             Object obj = PatchProxy.applyOneRefs(tc, tb, KsWebViewInstaller2.class, "7");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                Application b1 = a.B;
                a.o(b1, "AppEnv.APP");
                versionFromD = new File(b1.getApplicationInfo().nativeLibraryDir).getCanonicalPath();
                installedVer = new File(tc).getCanonicalPath();
                a.o(installedVer, "targetDir");
                a.o(versionFromD, "nativeLibDir");
                b = u.q2(installedVer, versionFromD, false, 2, objArray);
             }
             if (b) {
                Log.g("KsWebView", "Builtin kernel does not need installing");
                this.b.c(true, objArray);
             }
          }
          versionFromD = "Failed to read version from "+this.c+", "+objArray1;
          Log.d("KsWebView", versionFromD);
          this.b.d(false, new KsWebViewInstallException(0x30daa, versionFromD));
       }else if(TextUtils.equals(versionFromD, installedVer)){
          this.b.c(true, objArray);
          Log.g("KsWebView", "remove old version kernels");
          KwSdk.clearOldVersion();
       }else {
          KwSdk.install(this.c, new l$a(this), 0x1d4c0);
       }
       return;
    }
}

package com.kwai.component.saber.executor.c;
import java.lang.Object;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import sg5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rg5.a;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;
import android.telephony.TelephonyManager;
import java.io.File;
import android.os.Environment;
import android.os.StatFs;
import android.content.Context;
import android.text.format.Formatter;
import java.io.FileFilter;
import java.util.Objects;
import java.lang.Runtime;
import rg5.b;
import o56.a;
import com.kwai.component.saber.executor.e;
import com.kwai.component.saber.executor.c$a;
import pg5.e;

public class c	// class@000b2d
{

    public void c(){
       super();
    }
    public static void a(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "2")) {
          return;
       }
       a uoa1 = new a();
       String mODEL = Build.MODEL;
       uoa1.mName = Build.MANUFACTURER+"\("+mODEL+"\)";
       uoa1.mModel = Build.BRAND;
       uoa1.mPlatform = mODEL;
       uoa1.mSystem = "Android";
       uoa1.mSysVersion = Build$VERSION.RELEASE;
       uoa1.mAppID = a.a;
       if (p0 != null) {
          uoa1.mScreenScale = a.b(p0)+" x "+a.a(p0);
          uoa1.mScreenWidthPoint = a.b(p0);
          uoa1.mScreenHeightPoint = a.a(p0);
          String str = PatchProxy.applyOneRefs(p0, obj, uoa, "3");
          if (str != patchProxyRe) {
          }else {
             str = p0.getSystemService("phone").getNetworkOperatorName();
          }
          uoa1.mCarrierName = str;
          str = PatchProxy.applyOneRefs(p0, obj, uoa, "6");
          if (str != patchProxyRe) {
          }else {
             StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
             str = Formatter.formatFileSize(p0, ((long)statFs.getBlockCount() * (long)statFs.getBlockSize()));
          }
          uoa1.mTotalDiskSpace = str;
       }
       String str1 = PatchProxy.apply(obj, obj, uoa, "4");
       if (str1 != patchProxyRe) {
       }else {
          File[] uFileArray = new File("/sys/devices/system/cpu/").listFiles(a.b);
          Objects.requireNonNull(uFileArray);
          str1 = String.valueOf(uFileArray.length);
       }
       uoa1.mCpuCoresCount = str1;
       str1 = PatchProxy.apply(obj, obj, uoa, "5");
       if (str1 != patchProxyRe) {
       }else {
          str1 = (Runtime.getRuntime().totalMemory() / 0x100000)+"MB";
       }
       uoa1.mTotalMemory = str1;
       b uob = new b();
       uob.mAid = "root";
       uob.mType = "kst.msg.device-info";
       uob.mDid = a.a;
       uob.mMsg = uoa1;
       e.a().c(uob, new c$a());
       return;
    }
}

package com.kwai.plugin.dva.split.CommonNativeLibraryInstaller;
import pj7.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.split.CommonNativeLibraryInstaller$mCommonSoDir$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.lang.CharSequence;
import android.content.pm.ApplicationInfo;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import qj7.d;
import lj7.i;
import qrd.l1;
import java.lang.Boolean;
import android.system.Os;
import java.io.IOException;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.lang.Throwable;

public final class CommonNativeLibraryInstaller extends b	// class@001380
{
    public final Context b;
    public boolean c;
    public final p d;

    public void CommonNativeLibraryInstaller(Context p0){
       a.p(p0, "context");
       super();
       this.b = p0;
       this.d = s.c(new CommonNativeLibraryInstaller$mCommonSoDir$2(this));
    }
    public void a(ClassLoader p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonNativeLibraryInstaller.class, "3")) {
          return;
       }
       a.p(p0, "classLoader");
       a.p(p1, "dir");
       this.d(this.b, p0, p1);
       return;
    }
    public void b(String p0){
       CommonNativeLibraryInstaller uCommonNativ = CommonNativeLibraryInstaller.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCommonNativ, "2")) {
          return;
       }
       a.p(p0, "pluginName");
       Plugin plugin = Dva.instance().getPlugin(p0);
       if (plugin == null) {
          return;
       }
       PluginInfo soDir = plugin.getPluginInfo().soDir;
       CommonNativeLibraryInstaller uCommonNativ1 = (soDir == null || !soDir.length())? 1: null;
       if (!uCommonNativ1 && !a.g(soDir, this.b.getApplicationInfo().nativeLibraryDir)) {
          ClassLoader classLoader = uCommonNativ.getClassLoader();
          a.o(classLoader, "this.javaClass.classLoader");
          a.o(soDir, "soDir");
          this.d(this.b, classLoader, soDir);
       }
       return;
    }
    public final File c(){
       Object obj = PatchProxy.apply(null, this, CommonNativeLibraryInstaller.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void d(Context p0,ClassLoader p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CommonNativeLibraryInstaller.class, "4")) {
          return;
       }
       if (!this.c().exists()) {
          d.c("mkdir, path: "+this.c().getAbsolutePath()+", result: "+this.c().mkdirs());
       }
       File[] uFileArray = new File(p2).listFiles();
       a.o(uFileArray, "soFiles");
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          i = i + 1;
          a.o(oobject, "soFile");
          this.e(oobject, new File(this.c(), oobject.getName()), false);
       }
       if (this.c == null) {
          _monitor_enter(this);
          if (this.c == null) {
             i.a(p1, this.c());
             this.c = true;
          }
          _monitor_exit(this);
       }
       return;
    }
    public final void e(File p0,File p1,boolean p2){
       String str = " to ";
       if (PatchProxy.isSupport(CommonNativeLibraryInstaller.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, CommonNativeLibraryInstaller.class, "5")) {
          return;
       }
       if (!p0.exists()) {
          throw new IOException("source file "+p0.getAbsolutePath()+" not exist, isRetry: "+p2);
       }
       if (p1.exists()) {
          String str1 = Os.readlink(p1.getAbsolutePath());
          if (!a.g(p0.getAbsolutePath(), str1)) {
             if (p1.delete()) {
                d.c("try update symlink, old: "+str1+", new: "+p0.getAbsolutePath()+", isRetry: "+p2);
             }else {
                d.c("try update symlink, old: "+str1+", new: "+p0.getAbsolutePath()+", delete failed, isRetry: "+p2);
                throw new IOException("delete "+p1.getAbsolutePath()+" failed");
             }
          }else {
             return;
          }
       }
       Os.symlink(p0.getAbsolutePath(), p1.getAbsolutePath());
       d.c("create symlink, "+p0.getAbsolutePath()+str+p1.getAbsolutePath()+", isRetry: "+p2);
       return;
    }
}

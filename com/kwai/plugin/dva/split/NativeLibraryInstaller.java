package com.kwai.plugin.dva.split.NativeLibraryInstaller;
import pj7.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.split.NativeLibraryInstaller$mInstaller$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runtime;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import com.kwai.plugin.dva.util.CpuAbiUtils;

public final class NativeLibraryInstaller extends b	// class@001382
{
    public final Context b;
    public final p c;

    public void NativeLibraryInstaller(Context p0){
       a.p(p0, "context");
       super();
       this.b = p0;
       this.c = s.c(new NativeLibraryInstaller$mInstaller$2(this));
    }
    public void a(ClassLoader p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NativeLibraryInstaller.class, "3")) {
          return;
       }
       a.p(p0, "classLoader");
       a.p(p1, "dir");
       Runtime runtime = Runtime.getRuntime();
       a.o(runtime, "getRuntime\(\)");
       _monitor_enter(runtime);
       this.c().a(p0, p1);
       _monitor_exit(runtime);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NativeLibraryInstaller.class, "2")) {
          return;
       }
       a.p(p0, "pluginName");
       Runtime runtime = Runtime.getRuntime();
       a.o(runtime, "getRuntime\(\)");
       _monitor_enter(runtime);
       this.c().b(p0);
       _monitor_exit(runtime);
       return;
    }
    public final b c(){
       Object obj = PatchProxy.apply(null, this, NativeLibraryInstaller.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NativeLibraryInstaller.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT < 23 && CpuAbiUtils.b(p0))? true: false;
       return b;
    }
}

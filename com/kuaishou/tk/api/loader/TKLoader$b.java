package com.kuaishou.tk.api.loader.TKLoader$b;
import com.tkruntime.v8.NativeLibraryLoader;
import com.kuaishou.tk.api.loader.TKLoader;
import ux4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ux4.a;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.io.FileNotFoundException;

public final class TKLoader$b implements NativeLibraryLoader	// class@000f91
{
    public final TKLoader a;
    public final b b;

    public void TKLoader$b(TKLoader p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void loadLibraries(){
       String str = "Tachikoma";
       if (PatchProxy.applyVoidWithListener(null, this, TKLoader$b.class, "1")) {
          return;
       }
       if (this.a.b().c()) {
          this.a.b().i(9);
          PatchProxy.onMethodExit(TKLoader$b.class, "1");
          return;
       }else {
          boolean b = false;
          int i = 1;
          boolean b1 = (!this.a.b().d() && Build$VERSION.SDK_INT == 22)? false: true;
          this.a.b().i(i);
          this.a.i(b1);
          if (!this.a.d() && !this.a.b().c()) {
             Log.g(str, "full v8 load failed£¬fallback to load lite");
             this.a.b().i(2);
             this.a.i(b);
          }
          a uoa = this.a.b();
          int i1 = this.a.g();
          if (i1) {
             if (i1 != i) {
                Log.g(str, "full v8 load success£¬start load full tkRuntime");
                this.a.b().i(3);
                TKLoader$b ta = this.a;
                ta.f("libtk_runtime_v0_0_136.so", ta.c());
                i = 2;
             }else {
                Log.g(str, "lite v8 load success£¬start load lite tkRuntime");
                this.a.b().i(4);
                TKLoader$b ta1 = this.a;
                ta1.f("libtk_runtime_lite_v0_0_136.so", ta1.c());
             }
             uoa.j(i);
             PatchProxy.onMethodExit(TKLoader$b.class, "1");
             return;
          }else {
             PatchProxy.onMethodExit(TKLoader$b.class, "1");
             throw new FileNotFoundException("Not found V8 library anywhere");
          }
       }
    }
}

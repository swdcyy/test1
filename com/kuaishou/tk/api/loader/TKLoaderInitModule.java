package com.kuaishou.tk.api.loader.TKLoaderInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.kuaishou.tk.api.loader.TKLoaderInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import com.yxcorp.utility.Log;
import ux4.f;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import qrd.l1;
import java.lang.Throwable;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import java.util.Objects;
import ux4.g;
import com.kuaishou.tk.api.loader.TKLoader;
import ux4.a;
import java.lang.StringBuilder;
import ux4.d;
import t45.c;
import java.lang.Exception;

public final class TKLoaderInitModule extends TTIInitModule	// class@000f95
{
    public int q;
    public static final TKLoaderInitModule$a r;

    static {
       TKLoaderInitModule.r = new TKLoaderInitModule$a(null);
    }
    public void TKLoaderInitModule(){
       super();
    }
    public int f0(){
       return 20;
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKLoaderInitModule.class, "1")) {
          return;
       }
       if (!d.i) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, TKLoaderInitModule.class, "2")) {
          _monitor_enter(this);
          int i = 1;
          if (this.q != i && this.q != 2) {
             Log.b("Tachikoma", "Start downloading libraries");
             this.q = i;
             e.g(new f(this), "TKLoaderInitModule");
          }
          _monitor_exit(this);
       }
       return;
    }
    public final void n0(boolean p0,String p1,Throwable p2){
       if (PatchProxy.isSupport(TKLoaderInitModule.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, TKLoaderInitModule.class, "3")) {
          return;
       }
       b uob = d.a(-1291470198);
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.kuaishou.tk.api.loader.TKLoaderPlugin");
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, uob, g.class, "2")) {
          g c = uob.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.isSupport(TKLoader.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, c, TKLoader.class, "13")) {
             TKLoader a = c.a;
             _monitor_enter(a);
             TKLoader a1 = c.a;
             boolean b = true;
             a1.g = b;
             if (a1.c()) {
                Log.g("Tachikoma", "so download finish, already loaded, result: "+p0);
                _monitor_exit(a);
             }else if(p0){
                Log.g("Tachikoma", "so download success, start load");
                if (p1 != null) {
                   c.b = p1;
                }
                c.a.h(null);
                c.a.g(0);
                c.a.i(0);
                c.a(new d(c, p0, p1, p2));
             }else {
                Log.g("Tachikoma", "so download failed, loadExistComplete: "+c.a.f());
                if (c.a.f()) {
                   TKLoader a2 = c.a;
                   if (p2 == null) {
                      Exception uException = new Exception("Failed to download JS Engine");
                   }
                   a2.h(p2);
                   c.a.g(b);
                   c.a.i(8);
                   c.k();
                }
             }
             _monitor_exit(a);
          }
       }
       return;
    }
}

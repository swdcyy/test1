package com.yxcorp.plugin.tk.TKPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import com.kuaishou.tk.api.b;
import com.kuaishou.tk.TKPluginImpl;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import tkd.b;
import tkd.d;
import rx4.i;
import java.util.Iterator;
import java.util.List;
import rx4.j;
import nl9.y;
import nz.e;
import tkd.a;

public class TKPluginApplication extends Application	// class@000952
{
    public static Application sApplication;

    public void TKPluginApplication(){
       super();
    }
    public static void doRegister(){
       boolean b;
       if (PatchProxy.applyVoid(null, null, TKPluginApplication.class, "2")) {
          return;
       }
       if (d.i) {
          TKPluginApplication.doRegisterMainProcess();
       }
       TKPluginApplication.initTKPlugin();
       b uob = b.b();
       b = true;
       TKPluginImpl tKPluginImpl = new TKPluginImpl(b);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidTwoRefs(tKPluginImpl, TKPluginApplication.sApplication, uob, b.class, "7")) {
          Log.g("TKPluginManager", "onRealPluginLoaded: "+uob.c);
          if (uob.c == null) {
             d.a(0x256720e1).setImpl(tKPluginImpl);
             uob.c = b;
             b a = uob.a;
             _monitor_enter(a);
             Iterator iterator = uob.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
             uob.a.clear();
             _monitor_exit(a);
          }
       }
       return;
    }
    public static void doRegisterMainProcess(){
    }
    public static void initTKPlugin(){
       if (PatchProxy.applyVoid(null, null, TKPluginApplication.class, "3")) {
          return;
       }
       d.a(-304540290).setImpl(new e());
       d.a(-304540290).run();
       return;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, TKPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       TKPluginApplication.sApplication = this;
       TKPluginApplication.doRegister();
       return;
    }
}

package com.kuaishou.tk.api.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rx4.j;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.List;
import com.kuaishou.tk.api.b$a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Boolean;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.Integer;
import rx4.k;
import java.lang.Runnable;
import t45.c;

public class b	// class@000f8e
{
    public final List a;
    public boolean b;
    public boolean c;
    public final boolean d;
    public boolean e;
    public long f;
    public long g;
    public int h;
    public long i;
    public static b j;

    public void b(){
       super();
       this.b = false;
       this.c = false;
       this.h = 0;
       this.a = new ArrayList();
       this.d = false;
    }
    public static b b(){
       b uob = b.class;
       Object obj = PatchProxy.apply(null, null, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.j == null) {
          _monitor_enter(uob);
          if (b.j == null) {
             b.j = new b();
          }
          _monitor_exit(uob);
       }
       return b.j;
    }
    public void a(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       Log.g("TKPluginManager", "addTKPluginInitListener: "+p0);
       if (this.c != null) {
          p0.a();
       }else {
          b ta = this.a;
          _monitor_enter(ta);
          this.a.add(p0);
          _monitor_exit(ta);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       Log.g("TKPluginManager", "installPlugin");
       Dva.instance().getPluginInstallManager().j("tk").a(new b$a(this));
       return;
    }
    public boolean d(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (this.d != null && !Dva.instance().getPluginInstallManager().g("tk")) {
          Log.g("TKPluginManager", "use DownloadPriority.IMMEDIATE");
          PluginDownloadExtension.k.s("tk", 40);
          this.c();
          return b;
       }else if(this.d != null && this.b != null){
          Log.g("TKPluginManager", "reload tk plugin");
          this.h = this.h + 1;
          this.b = b;
          PluginDownloadExtension.k.s("tk", 40);
          this.c();
          return b;
       }else if(this.d == null || this.c != null){
          b = true;
       }
       return b;
    }
    public boolean e(){
       return this.d;
    }
    public void f(String p0,String p1,int p2,int p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "9")) {
             return;
          }
       }
       k ok = new k(this, p2, p3, p4, p1, p0);
       c.a(uob);
       return;
    }
}

package c.t.m.g.es;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.eo;
import c.t.m.g.eq;
import c.t.m.g.ep;
import java.lang.ClassLoader;
import c.t.m.g.fh;
import java.lang.String;
import java.lang.System;
import c.t.m.g.ex;
import java.util.List;
import c.t.m.g.en;
import java.lang.StringBuilder;
import dalvik.system.DexClassLoader;
import java.lang.Runtime;
import java.lang.Throwable;

public class es	// class@000c79
{
    public ClassLoader a;
    public Context b;
    public eo c;
    public eq d;
    public ep e;

    public void es(Context p0){
       super();
       this.b = p0;
       this.c = new eo(p0);
       this.d = new eq(p0);
       this.e = new ep(p0);
    }
    public synchronized ClassLoader a(){
       boolean b = true;
       es ta = this.a;
       if (ta != null) {
          return ta;
       }
       fh.a(this.b).a("load");
       long l = System.currentTimeMillis();
       if (ex.a) {
          ex.a("ModuleSDKPluginsImpl", "dex load task is start");
       }
       List list = this.c.a();
       en.a().a("MCTC", (System.currentTimeMillis() - l));
       l = System.currentTimeMillis();
       if (list != null) {
          this.a = this.d.a(list);
       }
       en.a().a("MLTC", (System.currentTimeMillis() - l));
       if (this.a == null) {
          en.a().a("MLS", "use base");
          this.a = this.b.getClassLoader();
       }
       this.e.a(b);
       fh.a(this.b).b("load");
       if (ex.a) {
          l = Runtime.getRuntime().freeMemory();
          long l1 = Runtime.getRuntime().maxMemory();
          ex.a("ModuleSDKPluginsImpl", "b maxMemory:"+l1);
          ex.a("ModuleSDKPluginsImpl", "b totalMemory:"+Runtime.getRuntime().totalMemory());
          ex.a("ModuleSDKPluginsImpl", "b freeMemory:"+l);
          ex.a("ModuleSDKPluginsImpl", "b rate:"+(((double)l * 0x3ff0000000000000) / (double)l1));
       }
       return this.a;
    }
}

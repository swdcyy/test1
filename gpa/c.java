package gpa.c;
import eyb.d;
import gpa.c$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import tkd.b;
import tkd.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig$Config;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$a;

public class c implements d	// class@002b54
{
    public GrowthUserLoginPlugin b;
    public int c;
    public static int d;
    public static ArrayList e;
    public static final c$a f;

    static {
       c.f = new c$a(null);
       c.e = new ArrayList();
    }
    public void c(){
       super();
       b uob = d.a(-2043427941);
       a.o(uob, "PluginManager.get\(Growth¡­rLoginPlugin::class.java\)");
       this.b = uob;
       int i = 5;
       this.c = i;
       GrowthUserLoginPlugin$UserGrowthLoginConfig userGrowthLo = this.F().uT();
       if (userGrowthLo != null) {
          GrowthUserLoginPlugin$UserGrowthLoginConfig$Config config = userGrowthLo.getConfig();
          if (config != null) {
             i = config.getSingleFeedVideoCountThreshold();
          }
       }
       this.c = i;
       if (!PatchProxy.applyVoid(null, this, c.class, "3")) {
          this.F().pG(this);
       }
       return;
    }
    public GrowthUserLoginPlugin F(){
       return this.b;
    }
    public void S(GrowthUserLoginPlugin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public void c10(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (p0 != null && !c.e.contains(p0)) {
          c.e.add(p0);
          c.d = c.d + 1;
       }
       return;
    }
    public boolean g0(){
       boolean b = (c.d >= this.c)? true: false;
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
    public String n(){
       return "label_growth_single_feed_strategy";
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.F().pG(this);
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c.d = 0;
       c.e.clear();
       return;
    }
}

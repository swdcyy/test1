package gpa.b;
import eyb.b;
import gpa.b$a;
import nsd.u;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b implements b	// class@002b52
{
    public GrowthUserLoginPlugin b;
    public int c;
    public int d;
    public boolean e;
    public static int f;
    public static final b$a g;

    static {
       b.g = new b$a(null);
    }
    public void b(){
       super();
       b uob = d.a(-2043427941);
       a.o(uob, "PluginManager.get\(Growth¡­rLoginPlugin::class.java\)");
       this.b = uob;
       int i = 3;
       this.c = i;
       int i1 = 6;
       this.d = i1;
       GrowthUserLoginPlugin$UserGrowthLoginConfig userGrowthLo = this.F().uT();
       if (userGrowthLo != null) {
          GrowthUserLoginPlugin$UserGrowthLoginConfig$Config config = userGrowthLo.getConfig();
          if (config != null) {
             i = config.getDoubleFeedVideoCountThreshold();
          }
       }
       this.c = i;
       GrowthUserLoginPlugin$UserGrowthLoginConfig userGrowthLo1 = this.F().uT();
       if (userGrowthLo1 != null) {
          GrowthUserLoginPlugin$UserGrowthLoginConfig$Config config1 = userGrowthLo1.getConfig();
          if (config1 != null) {
             i1 = config1.getDoubleFeedVideoPlaySeconds();
          }
       }
       this.d = i1;
       if (!PatchProxy.applyVoid(null, this, b.class, "3")) {
          this.F().pG(this);
       }
       return;
    }
    public void Av(){
       b.f = b.f + 1;
    }
    public GrowthUserLoginPlugin F(){
       return this.b;
    }
    public int QG(){
       return this.c;
    }
    public void S(GrowthUserLoginPlugin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public void d10(int p0){
       this.c = p0;
    }
    public boolean g0(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.f >= this.QG() && this.e != null)? true: false;
       return b;
    }
    public long g7(){
       return ((long)this.d * 1000);
    }
    public int iA(){
       return b.f;
    }
    public boolean isAvailable(){
       return true;
    }
    public String n(){
       return "label_growth_double_profile_strategy";
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.F().pG(this);
       return;
    }
    public void reset(){
       b.f = 0;
    }
    public void zN(boolean p0){
       this.e = p0;
    }
    public boolean zR(){
       return this.e;
    }
}

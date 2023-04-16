package gpa.a;
import eyb.a;
import gpa.a$a;
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
import java.lang.Integer;
import java.lang.Number;

public class a implements a	// class@002b50
{
    public int b;
    public int c;
    public GrowthUserLoginPlugin d;
    public int e;
    public static final a$a f;

    static {
       a.f = new a$a(null);
    }
    public void a(){
       super();
       b uob = d.a(-2043427941);
       a.o(uob, "PluginManager.get\(Growth¡­rLoginPlugin::class.java\)");
       this.d = uob;
       int i = 20;
       this.e = i;
       GrowthUserLoginPlugin$UserGrowthLoginConfig userGrowthLo = this.F().uT();
       if (userGrowthLo != null) {
          GrowthUserLoginPlugin$UserGrowthLoginConfig$Config config = userGrowthLo.getConfig();
          if (config != null) {
             i = config.getDoubleFeedSlideCountThreshold();
          }
       }
       this.e = i;
       if (!PatchProxy.applyVoid(null, this, a.class, "3")) {
          this.F().pG(this);
       }
       return;
    }
    public GrowthUserLoginPlugin F(){
       return this.d;
    }
    public void S(GrowthUserLoginPlugin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public void ZE(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Integer integer = Integer.valueOf((p1 - p0));
       p0 = (integer.intValue() > 0 && p0 >= this.c)? 1: 0;
       if (!p0) {
          integer = null;
       }
       if (integer != null) {
          this.c = p1;
          this.b = this.b + integer.intValue();
       }
       return;
    }
    public boolean g0(){
       boolean b = (this.b >= this.e)? true: false;
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
    public String n(){
       return "label_growth_double_feed_strategy";
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.F().pG(this);
       return;
    }
    public void reset(){
       this.b = 0;
    }
}

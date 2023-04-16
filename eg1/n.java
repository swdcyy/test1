package eg1.n;
import va1.g$a;
import eg1.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;

public class n implements g$a	// class@002158
{
    public final j a;

    public void n(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.a.j1(2048);
       return;
    }
    public void deactivate(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.a.S0(2048);
       j k = this.a.k;
       if (k != null) {
          k.c();
          this.a.k = null;
       }
       return;
    }
    public String getName(){
       return "effect_no_ban";
    }
}

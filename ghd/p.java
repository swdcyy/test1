package ghd.p;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;

public class p implements SlipSwitchButton$b	// class@000f37
{
    public j a;
    public final g b;
    public final g c;
    public final GifshowActivity d;

    public void p(g p0,g p1,GifshowActivity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, op, "1")) {
          return;
       }
       op = this.a;
       p tb = (p1)? this.b: this.c;
       op.l(p0, "enable_knock", p1, tb);
       b.k(this.d, "BEAT", y.a(p0.getSwitch()));
       return;
    }
}

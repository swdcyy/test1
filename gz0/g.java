package gz0.g;
import qm1.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import qm1.d;

public class g implements a	// class@0025c9
{
    public final i a;

    public void g(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(){
       i g;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g ta = this.a;
       ta.j = false;
       g = ta.g;
       if (g != null) {
          g.j(ta.a());
       }
       i n = this.a.n;
       if (n != null) {
          n.k(false);
       }
       return;
    }
    public void onAnimationStart(){
       i g;
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g ta = this.a;
       ta.j = true;
       g = ta.g;
       if (g != null) {
          g.j(false);
       }
       g = this.a.n;
       if (g != null) {
          g.i();
          this.a.n.k(true);
       }
       return;
    }
}

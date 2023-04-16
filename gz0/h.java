package gz0.h;
import qm1.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;

public class h implements a	// class@0025ca
{
    public final i a;

    public void h(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       h ta = this.a;
       ta.i = false;
       i g = ta.g;
       if (g != null) {
          g.j(ta.a());
       }
       return;
    }
    public void onAnimationStart(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       h ta = this.a;
       ta.i = true;
       i g = ta.g;
       if (g != null) {
          g.j(ta.a());
       }
       return;
    }
}

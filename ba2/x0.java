package ba2.x0;
import ekd.f$i;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka2.a$a;

public class x0 extends f$i	// class@0003b4
{
    public final LiveNormalRankNoticeViewV2 b;

    public void x0(LiveNormalRankNoticeViewV2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "1")) {
          return;
       }
       LiveNormalRankNoticeViewV2 c = this.b.c;
       if (c != null) {
          c.onDismiss();
       }
       return;
    }
}

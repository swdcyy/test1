package l09.d$d;
import com.kwai.framework.player.core.b$b;
import l09.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;

public final class d$d implements b$b	// class@002c66
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       d$d uod = d$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0 == 6) {
          d q = this.b.q;
          if (q != null) {
             q.dh("PLAYER_STATE_COMPLETED");
          }
       }
       return;
    }
}

package dm2.o;
import erd.g;
import com.kuaishou.live.core.show.vote.presenter.c$f;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.presenter.c;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import z12.e;
import android.os.Message;
import hoc.c;

public final class o implements g	// class@00254d
{
    public final c$f b;

    public void o(c$f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       if (tb.a.M.R().t0() != null && (tb.a.M.R().t0().isVisible() && !tb.a.M.E.isStop())) {
          tb.a.l9(p0);
       }
    label_0035 :
       c u = tb.a.U;
       if (u != null) {
          LiveVoterResponse mResultDispl = p0.mResultDisplayMillis;
          p0 = e.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mResultDispl), u, p0, "11")) {
             String[] stringArray = new String[0];
             e.c("LiveVoteAudienceManager", "delay dismiss "+mResultDispl, stringArray);
             p0 = u.a;
             p0.l(p0.f(7, Long.valueOf(mResultDispl)));
          }
       }
       return;
    }
}

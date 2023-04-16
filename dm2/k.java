package dm2.k;
import erd.g;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm2.e;

public final class k implements g	// class@002549
{
    public final c b;

    public void k(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mVote.isViteStop()) {
          tb.W0 = true;
          tb.l9(p0);
       }else if(PatchProxy.applyVoidOneRefs(p0, tb, c.class, "15")){
          tb.m9();
          c v = tb.V;
          if (v != null) {
             v.d0(p0);
          }
       }
       return;
    }
}

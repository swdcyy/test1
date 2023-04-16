package dm2.l;
import erd.g;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.response.VoteSubmitResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import java.util.Objects;
import cm2.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm2.a;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.util.List;
import brd.y;

public final class l implements g	// class@00254a
{
    public final c b;
    public final int c;

    public void l(c p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       if (tb.V != null) {
          boolean b = true;
          tb.W0 = b;
          LiveVoteOption liveVoteOpti = new LiveVoteOption();
          liveVoteOpti.mOptionId = tc;
          liveVoteOpti.mCount = p0.mOptionCount;
          liveVoteOpti.mDisplayCount = p0.mDisplayOptionCount;
          liveVoteOpti.isHighLight = b;
          p0 = tb.V;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(liveVoteOpti, p0, e.class, "7")) {
             a a = p0.t.a;
             if (a != null) {
                LiveVoterResponse mVote = a.mVote;
                if (mVote != null) {
                   LiveVoteContext mOptions = mVote.mOptions;
                   if (mOptions != null) {
                      int i = 0;
                      while (i < mOptions.size()) {
                         if (mOptions.get(i).mOptionId == liveVoteOpti.mOptionId) {
                            liveVoteOpti.mContent = mOptions.get(i).mContent;
                            mOptions.set(i, liveVoteOpti);
                            p0.v.onNext(p0.t);
                            break ;
                         }
                         i = i + 1;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}

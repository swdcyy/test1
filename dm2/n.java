package dm2.n;
import erd.g;
import com.kuaishou.live.core.show.vote.presenter.c$e;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.presenter.c;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import z12.e;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.y;

public final class n implements g	// class@00254c
{
    public final c$e b;

    public void n(c$e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c u = this.b.a.U;
       if (u != null && !PatchProxy.applyVoidOneRefs(p0, u, e.class, "8")) {
          String[] stringArray = new String[0];
          e.c("LiveVoteAudienceManager", "update vote info from panel "+p0, stringArray);
          e h = u.h;
          if (h == null || !TextUtils.n(h.mVote.mVoteId, p0.mVote.mVoteId)) {
             if (u.l != null) {
                u.b(p0);
                u.l = false;
             }
          }else {
             u.h = p0;
             u.m.onNext(p0);
             if (u.h.mVote.isViteStop()) {
                u.e(0);
             }else {
                u.e(u.h.mVote.mLeftMillis);
             }
          }
       }
       return;
    }
}

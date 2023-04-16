package dm2.f;
import lf3.g;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteClosed;
import java.lang.String;
import z12.e;
import java.util.Objects;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import crd.b;
import lnc.b9;
import java.lang.Long;
import android.os.Message;
import hoc.c;
import lf3.f;

public final class f implements g	// class@002544
{
    public final c b;

    public void f(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f tb = this.b;
       if (tb.U != null) {
          int i = 0;
          String[] stringArray = new String[i];
          e.c("LiveAudienceVotePresenter", "close vote from SCMessage", stringArray);
          c u = tb.U;
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoidOneRefs(p0, u, e.class, "2")) {
             String[] stringArray1 = new String[i];
             e.c("LiveVoteAudienceManager", "receive SCMessage close voteId:"+p0.voteId+"delay"+p0.displayMaxDelayMillis, stringArray1);
             u.j = i;
             b9.a(u.f);
             e a = u.a;
             a.l(a.f(2, Long.valueOf(u.a(p0.displayMaxDelayMillis))));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}

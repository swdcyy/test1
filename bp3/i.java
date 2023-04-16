package bp3.i;
import erd.g;
import com.kuaishou.live.rerank.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.rerank.d;

public final class i implements g	// class@000413
{
    public final f b;

    public void i(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onSelectChanged, selected ="+p0);
       if (p0.booleanValue()) {
          if (tb.S8()) {
             tb.s.d();
          }
       }else {
          tb.s.c();
       }
       return;
    }
}

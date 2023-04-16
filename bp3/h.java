package bp3.h;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.rerank.f;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.util.Objects;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.rerank.d;

public final class h implements LifecycleEventObserver	// class@000412
{
    public final f b;

    public void h(f p0){
       this.b = p0;
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == Lifecycle$Event.ON_RESUME) {
          b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onResume");
          if (tb.S8()) {
             tb.s.d();
          }
       }else if(p1 == Lifecycle$Event.ON_PAUSE){
          b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onPause");
          tb.s.c();
       }
       return;
    }
}

package bp3.e;
import erd.g;
import com.kuaishou.live.rerank.d;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@00040f
{
    public final d b;
    public final List c;

    public void e(d p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.d = 0;
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          x.z(iterator.next().mEntity, 5);
       }
       b.y(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankManager"), "requestRerankService failed", p0);
       return;
    }
}

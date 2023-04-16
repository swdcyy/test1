package bk2.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.statistics.a$a;
import java.lang.Object;
import com.kuaishou.live.core.show.statistics.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public final class a implements Runnable	// class@0003fb
{
    public final a$a b;

    public void a(a$a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       a$a b = tb.b;
       b.R8(b.q.mPhoto, b.v);
       c.a(15, tb.b.q.mPhoto);
    }
}

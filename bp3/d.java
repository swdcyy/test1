package bp3.d;
import ok.o;
import com.kuaishou.live.rerank.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import bp3.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;

public final class d implements o	// class@00040e
{
    public final d b;

    public void d(d p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b;
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !tb.a.f0(p0)) {
          p0 = p0.mEntity;
          if (p0 instanceof LiveStreamFeed) {
             p0 = p0.mLiveStreamModel;
             if (p0 != null && p0.mEnableLiveFeedRerank != null) {
                b = true;
             label_0024 :
                return b;
             }
          }
       }
       b = false;
       goto label_0024 ;
    }
}

package fx8.e0;
import erd.o;
import com.yxcorp.gifshow.activity.share.topic.i;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.topic.TopicHistoryResponse;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;

public final class e0 implements o	// class@002379
{
    public final i b;

    public void e0(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       return tb.h2(p0.getItems(), null);
    }
}

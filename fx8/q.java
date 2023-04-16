package fx8.q;
import fx8.m0;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicHistoryV3Fragment;
import java.lang.Object;
import com.kuaishou.android.post.topic.model.TopicItem;
import k2b.e0;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.lang.String;
import vw8.a;

public final class q implements m0	// class@002392
{
    public final ShareTopicHistoryV3Fragment a;

    public void q(ShareTopicHistoryV3Fragment p0){
       this.a = p0;
    }
    public final boolean a(TopicItem p0){
       q ta = this.a;
       a.w(ta.c(), "CLICK_TOPIC", ta.q().getItems().indexOf(p0), p0);
       ShareTopicHistoryV3Fragment l = ta.L;
       boolean b = (l != null)? l.a(p0): false;
       return b;
    }
}

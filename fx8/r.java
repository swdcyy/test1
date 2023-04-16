package fx8.r;
import com.yxcorp.gifshow.activity.share.topic.l$a;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicSearchV3Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import java.lang.String;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import k2b.e0;
import vw8.a;
import fx8.c;

public final class r implements l$a	// class@002393
{
    public final ShareTopicSearchV3Fragment a;

    public void r(ShareTopicSearchV3Fragment p0){
       this.a = p0;
    }
    public final void a(RecommendItem p0){
       r ta = this.a;
       if (ta.G != null) {
          TopicItem topicItem = new TopicItem(p0.getTag().getName(), p0.getTag().getId(), TopicItemType.SEARCH_RESULT, p0.getTag().getKsOrderId(), p0.getTag().getSpecialId(), p0.getTag().getType());
          Iterator iterator = ta.q().getItems().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             HistoryItem historyItem = iterator.next();
             Object[] objArray = new Object[0];
             a.b().w("ShareTopicSearchFragment", "item: "+historyItem.hashCode(), objArray);
             if (historyItem == p0) {
                break ;
             }
             i = i + 1;
          }
          a.w(ta.c(), "CLICK_TAG_SEARCH", i, v1);
          ta.G.a(v1);
       }
       return;
    }
}

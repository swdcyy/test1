package fx8.o0;
import erd.o;
import com.yxcorp.gifshow.activity.share.topic.k;
import java.lang.Object;
import retrofit2.p;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.topic.TopicSearchResponse;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import java.lang.String;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import java.util.Collection;
import com.yxcorp.gifshow.model.topic.TopicSearchResultPlaceHolderItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.yxcorp.gifshow.activity.share.topic.TopicHistoryV2Response;
import brd.t;

public final class o0 implements o	// class@00238e
{
    public final k b;

    public void o0(k p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       p0 = p0.a();
       List items = p0.getItems();
       if (items == null || !items.size()) {
          TopicSearchResultPlaceHolderItem topicSearchR = new TopicSearchResultPlaceHolderItem();
          RecommendItem$Tag tag = new RecommendItem$Tag();
          tag.setName(tb.p);
          topicSearchR.setTag(tag);
          uArrayList.add(topicSearchR);
       }else {
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             iterator.next().setKeyWord(tb.p);
          }
          uArrayList.addAll(items);
       }
       TopicHistoryV2Response topicHistory = new TopicHistoryV2Response();
       topicHistory.setHistoryItemList(uArrayList);
       topicHistory.setSearchedKey(tb.p);
       topicHistory.setCursor(p0.getCursor());
       topicHistory.setSessionId(p0.getSsid());
       return t.just(topicHistory);
    }
}

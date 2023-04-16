package fx8.f0;
import erd.o;
import com.yxcorp.gifshow.activity.share.topic.i;
import java.lang.Object;
import java.util.List;
import qvb.n0;
import com.yxcorp.gifshow.activity.share.topic.TopicHistoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.utility.m$a;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.String;

public final class f0 implements o	// class@00237b
{
    public final i b;

    public void f0(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       this.b.d1().clear();
       TopicHistoryResponse topicHistory = new TopicHistoryResponse();
       topicHistory.mCursor = "no_more";
       topicHistory.mTagList = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          m$a uoa = p0.next();
          TagItem tagItem = new TagItem();
          tagItem.mTag = uoa.b();
          tagItem.mName = uoa.b();
          topicHistory.mTagList.add(tagItem);
       }
       return topicHistory;
    }
}

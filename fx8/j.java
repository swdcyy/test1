package fx8.j;
import erd.g;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$c;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class j implements g	// class@002384
{
    public final ShareTopicGuideFragment b;

    public void j(ShareTopicGuideFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       ShareTopicGuideFragment y = this.b.y;
       if (y != null) {
          y.onError(p0);
       }
       PostUtils.D("ShareTopicGuideFragment", "TopicGuidePageList.onCreateRequest", p0);
       return;
    }
}

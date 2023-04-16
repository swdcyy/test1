package fx8.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fx8.p;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;

public class n extends Accessor	// class@00238d
{
    public final ShareTopicGuideFragment c;
    public final p d;

    public void n(p p0,ShareTopicGuideFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}

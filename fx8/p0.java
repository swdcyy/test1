package fx8.p0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.topic.l$b;
import com.yxcorp.gifshow.model.topic.TopicSearchResultItem;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.activity.share.topic.l;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.yxcorp.gifshow.activity.share.topic.l$a;

public final class p0 implements View$OnClickListener	// class@002390
{
    public final l$b b;
    public final TopicSearchResultItem c;

    public void p0(l$b p0,TopicSearchResultItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       p0 tc = this.c;
       l w = this.b.i.w;
       if (w != null) {
          w.a(tc);
       }
       return;
    }
}

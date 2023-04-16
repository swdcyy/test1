package fx8.i0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.topic.j$a;
import com.kuaishou.android.post.topic.model.TopicItem;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.activity.share.topic.j;
import fx8.m0;

public final class i0 implements View$OnClickListener	// class@002381
{
    public final j$a b;
    public final TopicItem c;

    public void i0(j$a p0,TopicItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       i0 tc = this.c;
       j w = this.b.i.w;
       if (w != null) {
          w.a(tc);
       }
       return;
    }
}

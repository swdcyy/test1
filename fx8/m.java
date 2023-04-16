package fx8.m;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import fx8.b;
import com.kuaishou.android.post.topic.model.TopicItem;
import java.util.ArrayList;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public class m implements ViewTreeObserver$OnGlobalLayoutListener	// class@00238a
{
    public final ShareTopicGuideFragment b;

    public void m(ShareTopicGuideFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.b.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       RecyclerView$LayoutManager layoutManage = this.b.s.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          return;
       }
       int i = layoutManage.c();
       int i1 = layoutManage.i0();
       while (i1 <= i) {
          TopicItem topicItem = this.b.r.N0(i1);
          if (topicItem != null && !this.b.w.contains(topicItem)) {
             Object[] objArray = new Object[0];
             a.b().s("ShareTopicGuideFragment", "collectRecyclerViewInitShowedItem name: "+topicItem.getKeyWorld(), objArray);
             this.b.w.add(topicItem);
          }
          i1 = i1 + 1;
       }
       return;
    }
}

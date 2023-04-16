package com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import fx8.b;
import com.kuaishou.android.post.topic.model.TopicItem;
import java.util.ArrayList;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public class ShareTopicGuideFragment$a extends RecyclerView$r	// class@00146e
{
    public final ShareTopicGuideFragment a;

    public void ShareTopicGuideFragment$a(ShareTopicGuideFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       ShareTopicGuideFragment$a uoa = ShareTopicGuideFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          return;
       }
       p1 = layoutManage.c();
       int i = layoutManage.i0();
       while (i <= p1) {
          TopicItem topicItem = this.a.r.N0(i);
          if (topicItem != null && !this.a.w.contains(topicItem)) {
             Object[] objArray = new Object[0];
             a.b().s("ShareTopicGuideFragment", "onScrollStateChanged add name: "+topicItem.getKeyWorld(), objArray);
             this.a.w.add(topicItem);
          }
          i++;
       }
       return;
    }
}

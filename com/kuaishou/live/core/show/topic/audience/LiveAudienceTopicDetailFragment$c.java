package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;
import lnc.a1;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class LiveAudienceTopicDetailFragment$c extends RecyclerView$n	// class@0011ef
{
    public int a;
    public final LiveAudienceTopicDetailFragment b;

    public void LiveAudienceTopicDetailFragment$c(LiveAudienceTopicDetailFragment p0){
       this.b = p0;
       super();
       this.a = a1.e(4.00f);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveAudienceTopicDetailFragment$c.class, "1")) {
          return;
       }
       if (!this.b.ia().g1(p2.getChildAdapterPosition(p1))) {
          LiveAudienceTopicDetailFragment$c ta = this.a;
          p0.left = ta / 2;
          p0.right = ta / 2;
          p0.bottom = ta;
          p0.top = 0;
       }
       return;
    }
}

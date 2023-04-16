package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ql2.w;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class LiveAudienceTopicDetailRecommendView extends LinearLayout	// class@0011f4
{
    public RecyclerView b;
    public TextView c;
    public LiveAudienceTopicDetailRecommendView$a d;
    public LiveAudienceTopicDetailRecommendView$b e;

    public void LiveAudienceTopicDetailRecommendView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceTopicDetailRecommendView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceTopicDetailRecommendView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailRecommendView.class, "3")) {
       }else {
          this.setOrientation(1);
          a.k(this, R.layout.arg_RES_7f0d0a60, 1);
          this.c = this.findViewById(0x7f0a1a37);
          RecyclerView recyclerView = this.findViewById(R.id.live_audience_topic_detail_recommend_recycler_view);
          this.b = recyclerView;
          recyclerView.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 0, 0));
          this.b.addItemDecoration(new w(this));
       }
       return;
    }
    public void setOnRecommendUserClickListener(LiveAudienceTopicDetailRecommendView$b p0){
       this.e = p0;
    }
}

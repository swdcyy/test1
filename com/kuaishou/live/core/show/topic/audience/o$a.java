package com.kuaishou.live.core.show.topic.audience.o$a;
import com.kuaishou.live.core.show.topic.audience.o$b;
import com.kuaishou.live.core.show.topic.audience.o;
import java.lang.Object;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import com.kuaishou.live.core.show.topic.api.LiveAudienceTopicRecommendUserListInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.topic.audience.p;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$a;
import ql2.w;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.List;
import g9c.a;

public class o$a implements o$b	// class@00120e
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(LiveAudienceTopicDetailHeaderView p0,LiveAudienceTopicRecommendUserListInfo p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, str)) {
          return;
       }
       o$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, o.class, "3")) {
          p op = new p(ta);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidTwoRefs(p1, op, p0, LiveAudienceTopicDetailHeaderView.class, "4")) {
             View[] viewArray = new View[]{p0.H};
             n.Z(0, viewArray);
             View[] viewArray1 = new View[]{p0.I,p0.J};
             n.Z(8, viewArray1);
             p0.H.setOnRecommendUserClickListener(op);
             p0 = p0.H;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(p1, p0, LiveAudienceTopicDetailRecommendView.class, str)) {
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, p0, LiveAudienceTopicDetailRecommendView.class, "4") && p0.d == null) {
                   LiveAudienceTopicDetailRecommendView$a uoa = new LiveAudienceTopicDetailRecommendView$a(objArray);
                   p0.d = uoa;
                   LiveAudienceTopicDetailRecommendView e = p0.e;
                   if (e != null) {
                      uoa.n1("KEY_RECOMMEND_CLICK_LISTENER", e);
                   }
                   p0.b.setAdapter(p0.d);
                }
                p0.c.setText(p1.mRecommendTitle);
                p0.d.W0(p1.mRecommendUserList);
                p0.d.k0();
             }
          }
       }
       return;
    }
}

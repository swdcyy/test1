package com.kuaishou.live.core.show.topic.audience.k$a;
import com.kuaishou.live.core.show.topic.audience.k$b;
import com.kuaishou.live.core.show.topic.audience.k;
import java.lang.Object;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailDescriptionView;
import lnc.a1;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import android.view.View;
import com.yxcorp.utility.n;

public class k$a implements k$b	// class@001207
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(LiveAudienceTopicDetailHeaderView p0,String p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, str)) {
          return;
       }
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, k.class, str)) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(p1, p0, LiveAudienceTopicDetailHeaderView.class, "5")) {
             LiveAudienceTopicDetailHeaderView j = p0.J;
             Objects.requireNonNull(j);
             int i = 2;
             if (!PatchProxy.applyVoidOneRefs(p1, j, LiveAudienceTopicDetailDescriptionView.class, str)) {
                j.b.setLabelTextColor(a1.a(R.color.arg_RES_7f060869));
                j.b.setSpanPrefix("¡¡");
                j.b.setSpanTextBold(0);
                j.b.v(p1, i);
             }
             View[] viewArray = new View[]{p0.J};
             n.Z(0, viewArray);
             View[] viewArray1 = new View[i];
             viewArray1[0] = p0.I;
             viewArray1[1] = p0.H;
             n.Z(8, viewArray1);
          }
       }
       return;
    }
}

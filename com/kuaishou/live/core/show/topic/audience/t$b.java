package com.kuaishou.live.core.show.topic.audience.t$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.d;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class t$b extends m	// class@00121a
{
    public final t c;

    public void t$b(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
          return;
       }
       t$b tc = this.c;
       t s = tc.s;
       if (s != null) {
          s.a(tc.r, (tc.t.get() + 1));
       }
       return;
    }
}

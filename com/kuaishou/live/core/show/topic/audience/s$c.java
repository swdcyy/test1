package com.kuaishou.live.core.show.topic.audience.s$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.s;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.d;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class s$c extends m	// class@001217
{
    public final s c;

    public void s$c(s p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "1")) {
          return;
       }
       s$c tc = this.c;
       s s = tc.s;
       if (s != null) {
          s.a(tc.t, (tc.u.get() + 1));
       }
       return;
    }
}

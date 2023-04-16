package com.kuaishou.live.core.show.topic.audience.t$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.live.core.show.topic.audience.t;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import y8c.d;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class t$a implements View$OnAttachStateChangeListener	// class@001219
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
          return;
       }
       t$a tb = this.b;
       t r = tb.r;
       if (r.mShowed == null) {
          t s = tb.s;
          if (s != null) {
             s.b(r, (tb.t.get() + 1));
             tb.mShowed = true;
          }
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}

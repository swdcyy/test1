package com.kuaishou.live.core.show.topic.audience.s$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.live.core.show.topic.audience.s;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import y8c.d;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class s$a implements View$OnAttachStateChangeListener	// class@001215
{
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       s$a tb = this.b;
       s t = tb.t;
       if (t.mShowed == null) {
          s s = tb.s;
          if (s != null) {
             s.b(t, (tb.u.get() + 1));
             tb.mShowed = true;
          }
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}

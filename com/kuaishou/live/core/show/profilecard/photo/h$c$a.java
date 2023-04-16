package com.kuaishou.live.core.show.profilecard.photo.h$c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.profilecard.photo.h$c;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.profilecard.photo.h;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import com.kuaishou.live.core.show.profilecard.photo.h$b;
import lf2.a;

public class h$c$a extends m	// class@000de5
{
    public final BaseFeed c;
    public final h$c d;

    public void h$c$a(h$c p0,BaseFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c$a.class, str)) {
          return;
       }
       h$c r = this.d.r;
       h$c$a tc = this.c;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, r, h.class, str)) {
          h e = r.E;
          if (e == null) {
             b.P(LiveLogTag.LIVE_PROFILE.appendTag("RevenueInterceptReport"), "[LiveProfilePhotoListAdapter][openPhoto]: mOnOpenPhotoListener == null");
          }else if(e.b(tc, r.y.indexOf(tc))){
             b.P(LiveLogTag.LIVE_PROFILE.appendTag("RevenueInterceptReport"), "[LiveProfilePhotoListAdapter][openPhoto]: mOnOpenPhotoListener.onOpenPhoto return true");
          }else {
             r.A.f(tc, p0, r.y.indexOf(tc));
          }
       }
       return;
    }
}

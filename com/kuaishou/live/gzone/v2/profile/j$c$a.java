package com.kuaishou.live.gzone.v2.profile.j$c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.gzone.v2.profile.j$c;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.gzone.v2.profile.j;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import com.kuaishou.live.gzone.v2.profile.j$b;
import lf2.a;

public class j$c$a extends m	// class@001cef
{
    public final BaseFeed c;
    public final j$c d;

    public void j$c$a(j$c p0,BaseFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c$a.class, "1")) {
          return;
       }
       j$c r = this.d.r;
       j$c$a tc = this.c;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, r, j.class, "3")) {
          j w = r.w;
          if (w == null) {
             b.P(LiveLogTag.LIVE_PROFILE.appendTag("RevenueInterceptReport"), "[LiveProfilePhotoListAdapter][openPhoto]: mOnOpenPhotoListener == null");
          }else if(w.b(tc, r.A.indexOf(tc))){
             b.P(LiveLogTag.LIVE_PROFILE.appendTag("RevenueInterceptReport"), "[LiveProfilePhotoListAdapter][openPhoto]: mOnOpenPhotoListener.onOpenPhoto return true");
          }else {
             r.E.f(tc, p0, r.A.indexOf(tc));
          }
       }
       return;
    }
}

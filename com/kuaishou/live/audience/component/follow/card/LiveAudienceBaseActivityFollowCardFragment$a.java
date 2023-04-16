package com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment$a;
import y8c.g;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class LiveAudienceBaseActivityFollowCardFragment$a extends g	// class@000ac6
{
    public final LiveAudienceBaseActivityFollowCardFragment w;

    public void LiveAudienceBaseActivityFollowCardFragment$a(LiveAudienceBaseActivityFollowCardFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveAudienceBaseActivityFollowCardFragment$a uoa = LiveAudienceBaseActivityFollowCardFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.n1("follow_card_user", this.w.F);
       return this.w.Gh(p0, p1);
    }
}

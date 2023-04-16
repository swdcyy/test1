package com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment$b;
import qvb.f;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceActivityFollowCardResponse;
import java.util.ArrayList;
import java.util.List;
import qy0.c;

public class LiveAudienceBaseActivityFollowCardFragment$b extends f	// class@000ac7
{
    public final LiveAudienceBaseActivityFollowCardFragment p;

    public void LiveAudienceBaseActivityFollowCardFragment$b(LiveAudienceBaseActivityFollowCardFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceBaseActivityFollowCardFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveAudienceBaseActivityFollowCardFragment f = this.p.F;
       ArrayList uArrayList = (f == null)? new ArrayList(): f.a();
       return t.just(new LiveAudienceActivityFollowCardResponse(uArrayList));
    }
}

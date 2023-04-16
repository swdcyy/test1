package com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.g;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment$a;
import qvb.i;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment$b;

public abstract class LiveAudienceBaseActivityFollowCardFragment extends RecyclerFragment	// class@000ac8
{
    public c F;

    public void LiveAudienceBaseActivityFollowCardFragment(){
       super();
    }
    public abstract f Gh(ViewGroup p0,int p1);
    public boolean S1(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceBaseActivityFollowCardFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceBaseActivityFollowCardFragment.class, null);
       return objectsByTag;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceBaseActivityFollowCardFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceBaseActivityFollowCardFragment$a(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceBaseActivityFollowCardFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceBaseActivityFollowCardFragment$b(this);
    }
}

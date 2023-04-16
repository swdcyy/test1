package com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribeAnchorListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.g;
import dl2.a;
import qvb.i;
import com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribeAnchorListFragment$a;

public class LiveSubscribeAnchorListFragment extends RecyclerFragment	// class@001166
{

    public void LiveSubscribeAnchorListFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribeAnchorListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveSubscribeAnchorListFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "LIVE_APPOINTMENT_SETTINGS";
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribeAnchorListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribeAnchorListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveSubscribeAnchorListFragment$a(this);
    }
}

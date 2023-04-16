package com.yxcorp.gifshow.reminder.friend.feeds.FriendTabFeedsFragment;
import com.yxcorp.gifshow.reminder.friend.milano.FriendMilanoSlidePlayFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fdc.a;

public class FriendTabFeedsFragment extends FriendMilanoSlidePlayFragment	// class@001a90
{

    public void FriendTabFeedsFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendTabFeedsFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FriendTabFeedsFragment.class, null);
       return objectsByTag;
    }
    public void mh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FriendTabFeedsFragment.class, "1")) {
          return;
       }
       super.mh(p0);
       p0.U7(new a(this));
       PatchProxy.onMethodExit(FriendTabFeedsFragment.class, "1");
       return;
    }
}

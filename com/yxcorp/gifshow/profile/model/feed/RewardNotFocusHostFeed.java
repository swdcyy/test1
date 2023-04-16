package com.yxcorp.gifshow.profile.model.feed.RewardNotFocusHostFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.profile.model.feed.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.profile.model.feed.HostInfoModel;
import w3c.g;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class RewardNotFocusHostFeed extends BaseFeed	// class@0013db
{
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public HostInfoModel mHostInfoModel;
    public User mUser;
    public static final long serialVersionUID = 0xb298d63589469d49;

    public void RewardNotFocusHostFeed(){
       super();
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, RewardNotFocusHostFeed.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.REWARD_NOT_FOCUS_HOST, a.a);
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, RewardNotFocusHostFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHostInfoModel.mUserId+this.mHostInfoModel.mLiveStreamId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RewardNotFocusHostFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RewardNotFocusHostFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RewardNotFocusHostFeed.class, new g());
       }else {
          obj.put(RewardNotFocusHostFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardNotFocusHostFeed.class, "3")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

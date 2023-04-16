package com.yxcorp.gifshow.follow.common.model.RecommendUserFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zga.g0;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class RecommendUserFeed extends BaseFeed	// class@00106f
{
    public CommonMeta mCommonMeta;
    public RecoUser mRecommendUser;
    public static final long serialVersionUID = 0xcb8541aee417d2b1;

    public void RecommendUserFeed(){
       super();
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecommendUserFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RecommendUserFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RecommendUserFeed.class, new g0());
       }else {
          obj.put(RecommendUserFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendUserFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

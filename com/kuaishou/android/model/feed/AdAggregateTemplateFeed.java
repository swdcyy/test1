package com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.AdTemplateFeedMeta;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import com.kwai.robust.PatchProxyResult;
import yp.b;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class AdAggregateTemplateFeed extends BaseFeed	// class@000ad1
{
    public PhotoAdvertisementPlaceHolder mAd;
    public AdTemplateFeedMeta mAdTemplateFeedModel;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public TemplateFeedMeta mTemplateFeedModel;
    public static final long serialVersionUID = 0xdecc269eb9a7377c;

    public void AdAggregateTemplateFeed(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, AdAggregateTemplateFeed.class, "1")) {
          return;
       }
       super.afterDeserialize();
       AdAggregateTemplateFeed tmTemplateFe = this.mTemplateFeedModel;
       AdAggregateTemplateFeed tmAdTemplate = this.mAdTemplateFeedModel;
       tmTemplateFe.mTemplateId = tmAdTemplate.mFeedId;
       tmTemplateFe.mShowCount = tmAdTemplate.mLikeCount;
       return;
    }
    public String getId(){
       return this.mAdTemplateFeedModel.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdAggregateTemplateFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, AdAggregateTemplateFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(AdAggregateTemplateFeed.class, new b());
       }else {
          obj.put(AdAggregateTemplateFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAggregateTemplateFeed.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

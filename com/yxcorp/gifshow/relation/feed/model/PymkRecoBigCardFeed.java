package com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oac.i;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class PymkRecoBigCardFeed extends BaseFeed	// class@001893
{
    public List mAllShowedUser;
    public List mCacheUserList;
    public CommonMeta mCommonMeta;
    public String mCustomPageLogName;
    public boolean mHideCardCloseButton;
    public b mPymkPageList;
    public PymkBigCardUserMeta mRecommendUserMeta;

    public void PymkRecoBigCardFeed(){
       super();
    }
    public String getId(){
       PymkBigCardUserMeta mPhotoId = this.mRecommendUserMeta.mPhotoId;
       if (mPhotoId == null) {
          mPhotoId = "";
       }
       return mPhotoId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkRecoBigCardFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PymkRecoBigCardFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PymkRecoBigCardFeed.class, new i());
       }else {
          obj.put(PymkRecoBigCardFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkRecoBigCardFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

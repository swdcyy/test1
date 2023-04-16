package com.kuaishou.android.model.feed.MerchantRecommendUserFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.m0;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class MerchantRecommendUserFeed extends BaseFeed	// class@000b1f
{
    public CommonMeta mCommonMeta;
    public MerchantRecommendUserMeta mRecommendUserMeta;
    public static final long serialVersionUID = 0x7164932e54a49ed3;

    public void MerchantRecommendUserFeed(){
       super();
    }
    public String getId(){
       MerchantRecommendUserMeta mPrsid = this.mRecommendUserMeta.mPrsid;
       if (mPrsid == null) {
          mPrsid = "";
       }
       return mPrsid;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantRecommendUserFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MerchantRecommendUserFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MerchantRecommendUserFeed.class, new m0());
       }else {
          obj.put(MerchantRecommendUserFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecommendUserFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

package com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.model.meta.f;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.detail.model.meta.e;
import ok.h;
import kp.w1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import z1a.m;
import java.util.Map;

public class InterestManagementV3Feed extends BaseFeed	// class@0015a3
{
    public CommonMeta mCommonMeta;
    public InterestManagementV3Meta mInterestManagementV3Meta;
    public static final long serialVersionUID = 0xe6a14b47ae59efbc;

    public void InterestManagementV3Feed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.INTEREST_MANAGEMENT_V3_FEED;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, InterestManagementV3Feed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.INTEREST_MANAGEMENT_V3_FEED, f.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, InterestManagementV3Feed.class, "1")) {
          return;
       }
       q.d(InterestManagementV3Feed.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, InterestManagementV3Feed.class, "3")) {
          return;
       }
       w1.u(InterestManagementV3Feed.class, e.b);
       return;
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestManagementV3Feed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, InterestManagementV3Feed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(InterestManagementV3Feed.class, new m());
       }else {
          obj.put(InterestManagementV3Feed.class, null);
       }
       return obj;
    }
}

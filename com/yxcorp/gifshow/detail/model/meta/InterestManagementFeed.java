package com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.model.meta.d;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.detail.model.meta.c;
import ok.h;
import kp.w1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import z1a.i;
import java.util.Map;

public class InterestManagementFeed extends BaseFeed	// class@00159e
{
    public CommonMeta mCommonMeta;
    public InterestManagementMeta mInterestManagementMeta;
    public static final long serialVersionUID = 0x829422bd26e6adaa;

    public void InterestManagementFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.INTEREST_MANAGEMENT_FEED;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, InterestManagementFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.INTEREST_MANAGEMENT_FEED, d.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, InterestManagementFeed.class, "1")) {
          return;
       }
       q.d(InterestManagementFeed.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, InterestManagementFeed.class, "3")) {
          return;
       }
       w1.u(InterestManagementFeed.class, c.b);
       return;
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestManagementFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, InterestManagementFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(InterestManagementFeed.class, new i());
       }else {
          obj.put(InterestManagementFeed.class, null);
       }
       return obj;
    }
}

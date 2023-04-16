package com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.model.meta.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.detail.model.meta.a;
import ok.h;
import kp.w1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import z1a.e;
import java.util.Map;

public class InterestLabelsFeed extends BaseFeed	// class@001599
{
    public CommonMeta mCommonMeta;
    public InterestLabelsMeta mInterestLabelsMeta;
    public static final long serialVersionUID = 0xf256dbdf18ef8f37;

    public void InterestLabelsFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.INTEREST_LABELS_FEED;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, InterestLabelsFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.INTEREST_LABELS_FEED, b.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, InterestLabelsFeed.class, "1")) {
          return;
       }
       q.d(InterestLabelsFeed.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, InterestLabelsFeed.class, "3")) {
          return;
       }
       w1.u(InterestLabelsFeed.class, a.b);
       return;
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestLabelsFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, InterestLabelsFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(InterestLabelsFeed.class, new e());
       }else {
          obj.put(InterestLabelsFeed.class, null);
       }
       return obj;
    }
}

package com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.commoninsertcard.entity.c;
import com.yxcorp.gifshow.entity.QPhoto$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.commoninsertcard.entity.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.commoninsertcard.entity.a;
import ok.h;
import kp.w1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.kwai.robust.PatchProxyResult;
import vm9.d;
import java.util.Map;

public class CommonInsertCardFeed extends BaseFeed	// class@00119a
{
    public CommonInsertCardFeedMeta mCommonInsertCardFeedMeta;
    public CommonMeta mCommonMeta;
    public static final int b = 0;
    public static final long serialVersionUID = 0x261b7bcde81d4ef7;

    public void CommonInsertCardFeed(){
       super();
    }
    public static void addInvalidFeedChecker(){
       if (PatchProxy.applyVoid(null, null, CommonInsertCardFeed.class, "4")) {
          return;
       }
       QPhoto.addInvalidFeedChecker(c.a);
       return;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, CommonInsertCardFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.COMMON_INSERT_CARD, b.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, CommonInsertCardFeed.class, "1")) {
          return;
       }
       q.d(CommonInsertCardFeed.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, CommonInsertCardFeed.class, "3")) {
          return;
       }
       w1.u(CommonInsertCardFeed.class, a.b);
       return;
    }
    public String getId(){
       CommonMeta mFeedId = this.mCommonMeta.mFeedId;
       if (mFeedId != null) {
          return mFeedId;
       }
       CommonInsertCardFeedMeta mFeedId1 = this.mCommonInsertCardFeedMeta.mFeedId;
       if (mFeedId1 != null) {
          return mFeedId1;
       }
       return "CommonInsertCardFeed";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonInsertCardFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CommonInsertCardFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CommonInsertCardFeed.class, new d());
       }else {
          obj.put(CommonInsertCardFeed.class, null);
       }
       return obj;
    }
}

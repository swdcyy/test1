package com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.growth.model.invite.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.kwai.feature.api.feed.growth.model.invite.a;
import ok.h;
import kp.w1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta;
import fn5.d;
import java.util.Map;

public class InviteSlidePageFeedModel extends BaseFeed	// class@000edd
{
    public CommonMeta mCommonMeta;
    public InviteCardMeta mInviteCardMeta;
    public static final long serialVersionUID = 0x829422bd26e6adaa;

    public void InviteSlidePageFeedModel(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.INVITE_PAGE_FEED;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, InviteSlidePageFeedModel.class, "3")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.INVITE_PAGE_FEED, b.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, InviteSlidePageFeedModel.class, "2")) {
          return;
       }
       q.d(InviteSlidePageFeedModel.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, InviteSlidePageFeedModel.class, "4")) {
          return;
       }
       w1.u(InviteSlidePageFeedModel.class, a.b);
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, InviteSlidePageFeedModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mInviteCardMeta.getId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InviteSlidePageFeedModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, InviteSlidePageFeedModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(InviteSlidePageFeedModel.class, new d());
       }else {
          obj.put(InviteSlidePageFeedModel.class, null);
       }
       return obj;
    }
}

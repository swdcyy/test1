package c24.m;
import com.kuaishou.merchant.container.base.a;
import c24.p0;
import java.util.Map;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.f0;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.t;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.merchant.api.live.basic.model.RnAnchorInfo;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.api.live.basic.model.RnMerchantExtra;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;

public class m extends a	// class@00048b
{
    public final p0 a;

    public void m(p0 p0){
       super();
       this.a = p0;
    }
    public void d(Map p0,RouterRequest p1){
       RnAnchorInfo rnAnchorInfo;
       m om = m.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, om, "1")) {
          return;
       }
       p0 b = this.a.b;
       if (b != null) {
          String str = b.J4();
          p0.put("liveId", str);
          p0.put("tsPageId", str);
          p0.put("pageId", this.a.b.I4());
       }
       b = this.a.c;
       if (b != null) {
          p0.put("routerToken", b.a().getMerchantSessionId());
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, om, "2")) {
          b = this.a.c;
          String str1 = null;
          LiveMerchantBaseContext liveMerchant = (b != null)? b.a(): str1;
          if (liveMerchant == null) {
             a.s(MerchantCommonLogBiz.ROUTER, "LiveHalfRnRouterHandler", "liveMerchantBaseContext is null");
          }else if(liveMerchant.getLiveAuthorUser() != null){
             rnAnchorInfo = new RnAnchorInfo(liveMerchant.getLiveAuthorId(), liveMerchant.getLiveAuthorUser().mName, liveMerchant.getLiveAuthorUser().mAvatars, Boolean.valueOf(liveMerchant.getLiveAuthorUser().isFollowingOrFollowRequesting()));
          }else {
             rnAnchorInfo = str1;
          }
          String liveStreamId = liveMerchant.getLiveStreamId();
          int liveType = liveMerchant.getLiveType();
          boolean b1 = (liveType == 2 || liveType == 3)? true: false;
          RnMerchantExtra rnMerchantEx = new RnMerchantExtra(QCurrentUser.ME.getId(), liveStreamId, rnAnchorInfo, Integer.valueOf(liveType), Integer.valueOf(this.a.d), Boolean.valueOf(b1));
          p0.put("merchantExtra", a.a.q(v1));
       }
       return;
    }
}

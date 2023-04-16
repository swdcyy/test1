package c24.a;
import com.kuaishou.merchant.container.base.a;
import c24.c;
import java.util.Map;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import or5.d;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.api.live.basic.model.RnAnchorInfo;
import java.lang.Boolean;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.merchant.api.live.basic.model.RnMerchantExtra;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;

public class a extends a	// class@00046c
{
    public final c a;

    public void a(c p0){
       super();
       this.a = p0;
    }
    public void d(Map p0,RouterRequest p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a ta = this.a;
       if (ta == null) {
          a.s(MerchantCommonLogBiz.ROUTER, "LiteHalfRnRouterHandler", "mLiteRouterParams is null");
          return;
       }else {
          p0.put("liveId", ta.b());
          p0.put("tsPageId", this.a.b());
          p0.put("pageId", this.a.a);
          p0.put("routerToken", this.a.c);
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "2") && this.a.a() != null) {
             User user = this.a.a().I();
             String str = this.a.a().d();
             String str1 = (user == null)? "": user.mName;
             CDNUrl[] uCDNUrlArray = (user == null)? null: user.getAvatars();
             int i = 0;
             boolean b = (user == null)? false: user.isFollowingOrFollowRequesting();
             RnAnchorInfo rnAnchorInfo = new RnAnchorInfo(str, str1, uCDNUrlArray, Boolean.valueOf(b));
             String liveStreamId = this.a.a().getLiveStreamId();
             QLivePlayConfig qLivePlayCon = this.a.a().C0();
             String id = QCurrentUser.ME.getId();
             Integer integer = Integer.valueOf(this.a.a().V0());
             if (qLivePlayCon != null) {
                i = qLivePlayCon.mPatternType;
             }
             RnMerchantExtra rnMerchantEx = new RnMerchantExtra(id, liveStreamId, rnAnchorInfo, integer, Integer.valueOf(i), Boolean.FALSE);
             p0.put("merchantExtra", a.a.q(str1));
          }
          return;
       }
    }
}

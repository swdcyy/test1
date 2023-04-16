package f01.a;
import k51.c;
import f01.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ug1.a1;
import ik1.i0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import p91.m;
import f92.b;
import lm1.i;
import lm1.h;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import ik1.b0;
import com.yxcorp.gifshow.models.Gift;
import n81.a;
import java.lang.Integer;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import lp3.i;
import pm1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.c;

public class a extends c	// class@002262
{
    public a0 p;
    public i q;
    public a r;
    public a1 s;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxSendSuccessPresenter";

    public void a(){
       super();
       this.s = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.p.V1.Nk(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.p.V1.J8(this.s);
       return;
    }
    public ClientContent$LiveStreamPackage P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.Z2.a();
    }
    public void R8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       Object obj = p0.a("key_send_gift_context");
       h oh = new h(obj, p0.b, 2);
       if (!TextUtils.equals(p0.a, this.p.c.getLiveStreamId())) {
          this.S8(obj, "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveAudienceGiftBoxSendSuccessPresenter][insertMockedLiveGiftMessage]event:"+p0.a+",photo:"+this.p.c.getLiveStreamId(), 507);
          return;
       }else {
          b b = p0.b;
          b.mLiveAssistantType = this.p.b2.d(QCurrentUser.me().getId()).ordinal();
          this.p.c2.l(oh);
          a0 x = this.p.X;
          if (x != null) {
             b = p0.d;
             if (b != null && b.mDisableMockFeed != null) {
                return;
             }else {
                x.R0(p0.b);
             }
          }
          return;
       }
    }
    public void S8(i p0,String p1,String p2,String p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             return;
          }
       }
       if (p0 == null) {
          b.P(b.a, "[LiveAudienceGiftBoxSendSuccessPresenter][logTraceInfo]context is null");
          return;
       }else if(this.q.b()){
          b.P(b.a, "[LiveAudienceGiftBoxSendSuccessPresenter][logTraceInfo]service manager cleared");
          return;
       }else {
          b uob = new b(p0.e(), p1, p2);
          uob.h(p4, p3);
          this.r.k8(uob);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.q = oi;
       this.r = oi.a(a.class);
       return;
    }
}

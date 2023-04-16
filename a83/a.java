package a83.a;
import t73.b;
import a83.a$a;
import nsd.u;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import lj1.c;
import nj1.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import xa3.a;
import a83.a$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import a83.a$c;
import w73.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.Gift;
import t73.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lj1.b;
import a83.b;
import jj1.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import kg1.f;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;

public final class a implements b	// class@000080
{
    public boolean a;
    public final Runnable b;
    public final String c;
    public final int d;
    public final int e;
    public final k f;
    public final k g;
    public final LiveGiftSendModel h;
    public final c i;
    public final a j;
    public final LiveSendGiftBaseTraceInfo k;
    public final a l;
    public final a$b m;
    public static final a$a n;

    static {
       a.n = new a$a(null);
    }
    public void a(k p0,k p1,LiveGiftSendModel p2,c p3,a p4,LiveSendGiftBaseTraceInfo p5,a p6,a$b p7){
       a.p(p0, "liveStreamFeed");
       a.p(p1, "isFollowingAnchor");
       a.p(p2, "giftSendModel");
       a.p(p3, "liveGiftReceiver");
       a.p(p4, "loginDependency");
       a.p(p6, "liveLiteFansGroupService");
       a.p(p7, "popularityTicketDelegate");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       this.m = p7;
       this.b = new a$c(this);
       this.c = "LITE_ROOM_FANS_GIFT_BUTTON";
       this.d = 35;
       this.e = 74;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "liveLiteGiftGuideData");
       this.c(p0, p0.a.mCanCombo, "onPopularityTicketAnimationViewClick", false);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "liveLiteGiftGuideData");
       this.c(p0, false, "onPopularityTicketButtonClick", (a.b.b() ^ 0x01));
       return;
    }
    public final void c(a p0,boolean p1,String p2,boolean p3){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, a.class, "3")) {
          return;
       }
       b.Z(LiveGiftTag.LIVE_POPULARITY, p2);
       if (this.d()) {
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, a.class, "8")) {
             this.h.h(a.b.a(p0, this.c, this.d, this.e, p1, p3, this.i, this.k), new b(this, p2, p0));
          }
       }else if(PatchProxy.isSupport(uoa)){
          p2 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), this, uoa, "9");
          if (p2 != PatchProxyResult.class) {
             p1 = p2.booleanValue();
          }else {
          label_0081 :
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             b = qCurrentUser.isLogined();
             String str = (p1)? "combo_send_gift": "normal_send_gift";
             b.c0(LiveGiftTag.GIFT_SEND, "[LiveSendGiftLoginCheckProcessor] not login", "isLogin", Boolean.valueOf(b));
             if (!b) {
                b = a.B.getString(R.string.arg_RES_7f103081);
                a.o(b, "AppEnv.APP.getString\(R.s¡­g.login_prompt_send_gift\)");
                this.j.a(str, 44, b);
                str = false;
             }else {
                str = true;
             }
          }
       }else {
          goto label_0081 ;
       }
       if (!p1) {
          return;
       }else if(PatchProxy.applyVoid(null, this, uoa, "10")){
          this.l.A1();
       }
       a c = p0.c;
       if (c == true) {
          this.m.d();
          return;
       }else if(c == 2){
          LiveGiftGuideConfig mLitePopular = p0.b.mLitePopularityTicketSenseFansGroupStatusTimeMillis;
          if (mLitePopular - 1 < 0) {
             mLitePopular = 5000;
          }
          if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(mLitePopular), this, uoa, "4") && this.a == null)) {
             k1.s(this.b, this, mLitePopular);
             this.a = true;
          }
       }
    label_0106 :
       return;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = this.g.get();
          a.o(obj, "isFollowingAnchor.get\(\)");
       }
       return obj.booleanValue();
    }
}

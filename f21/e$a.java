package f21.e$a;
import a71.a;
import f21.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.x;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import kotlin.jvm.internal.a;
import f21.f;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import lm1.f;
import hj1.d;
import hj1.c;
import hj1.d$a;
import java.util.Map;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig$AttachGiftConfig;
import gj1.b;
import ekd.k1;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import f21.h;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h92.f;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.gift.p;
import gq5.f;
import f21.b;
import brd.y;
import wkd.b;
import ad5.a;

public final class e$a implements a	// class@0022a2
{
    public final e a;
    public final String b;

    public void e$a(e p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean a(int p0){
       LiveGiftGuideConfig obj1;
       Gift gift;
       LiveGiftGuideConfig liveGiftGuid;
       Gift mId;
       LiveGiftGuideConfig$AttachGiftConfig uAttachGiftC;
       i oi1;
       Object obj5;
       f f;
       boolean b;
       LiveAudienceSendExplicitGiftConfirmDialog liveAudience;
       x ox;
       LivePlayFragment livePlayFrag;
       a0 z2;
       x ox1;
       LivePlayFragment livePlayFrag1;
       Object[] objArray1;
       Object obj = this;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       obj1 = obj.a.h.get();
       Object[] objArray = null;
       obj1 = (obj1 != null)? obj1.mGiftToken: objArray;
       if (a.g(obj1, obj.b) ^ 1) {
          obj1 = obj.a.h.get();
          if (obj1 != null) {
             obj1.mGiftToken = obj.b;
          }
       }
       e c = obj.a.c;
       if (c != null) {
          f uof = f.class;
          if (!PatchProxy.applyVoid(objArray, c, uof, "4") && (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, c, uof, "5"))) {
             int i = 38;
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, Integer.valueOf(i), c, uof, "6")) {
                LiveGiftGuideConfig obj2 = c.l.get();
                Object obj3 = c.m.get();
                int i1 = 6;
                i oi = c.a(obj3, i1);
                c.d(oi, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]normal guide send gift", 1);
                String str = ",giftGuideGift:";
                if (oi != null && (obj2 == null || obj3 == null)) {
                   c.d(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]context:"+oi+",guideInfo:"+obj2+str+obj3, 0x1871b);
                }else {
                   QCurrentUser qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, "QCurrentUser.me\(\)");
                   if (!qCurrentUser.isLogined()) {
                      c uoc = a.a();
                      a.o(uoc, "AppEnv.get\(\)");
                      String str1 = uoc.a().getString(R.string.arg_RES_7f103081);
                      a.o(str1, "AppEnv.get\(\).appContext.¡­g.login_prompt_send_gift\)");
                      f j = c.j;
                      Objects.requireNonNull(j, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                      String url = j.getUrl();
                      y.a(c.i, url, "live_Live_LINE_GIFT_BATTLE_recharge", 44, str1, c.k.c.mEntity, null, null, null);
                      c.d(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick] not login", 0x18705);
                   }else {
                      obj2 = obj2.mGiftToken;
                      f uof1 = oi.b();
                      uof1.n(c.c());
                      int i2 = 2;
                      uof1.r(i2);
                      uof1.o(obj2);
                      Object[] obj4 = c.l.get();
                      a.o(obj4, "giftGuideInfoSupplier.get\(\)");
                      c uoc1 = d.a.b(obj4, obj3.mId);
                      c.a.put(Integer.valueOf(obj3.mId), uoc1);
                      if (uoc1.a()) {
                         gift = c.m.get();
                         int i3 = 0;
                         if (PatchProxy.isSupport(uof)) {
                            obj4 = new Object[i1];
                            obj4[i3] = gift;
                            obj4[1] = obj2;
                            obj4[i2] = Integer.valueOf(i);
                            obj4[3] = Integer.valueOf(i1);
                            obj4[4] = Integer.valueOf(4);
                            obj4[5] = objArray;
                            if (!PatchProxy.applyVoid(obj4, c, uof, "7")) {
                            }
                         }else {
                         }
                      }else if(p.m(obj3)){
                         c.k.g2.t();
                         c.s.d(1);
                         c.s.c();
                         a.o(obj2, "giftToken");
                         c.f(oi, obj3, 1, obj2, 2, 6, 4);
                         c.b.onNext(Boolean.TRUE);
                      }else {
                         e obj6 = b.a(0x4c90014d);
                         a.o(obj6, "Singleton.get\(PaymentManager::class.java\)");
                         obj6 = c;
                         i oi2 = oi;
                         obj6.d(oi2, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]kCoin:"+obj6.q()+",need:"+p.g(obj3), 0x1870a);
                         obj6.e(oi2, obj3, 1, c.d, obj2, c.c(), 6, 38, 0x1870a);
                         c.g(p.h(obj3));
                      }
                   }
                }
             }
          }
       }
       return 1;
    }
}

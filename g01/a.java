package g01.a;
import il1.a;
import g01.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ik1.h0;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.robust.PatchProxyResult;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import mk1.b;
import mk1.h;
import com.yxcorp.gifshow.models.Gift;
import mk1.w;
import cl1.c;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import oy1.a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import lm1.e;
import g01.b$a;
import java.lang.Enum;
import tk1.b;
import qk1.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mk1.f;
import i01.n;
import h01.i;
import java.lang.Boolean;
import z12.e;
import k2b.u1;
import h01.x;
import bl1.a;
import com.kwai.framework.abtest.f;
import vk1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ik1.a0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;

public final class a implements a	// class@0023f0
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(){
       h0 oh01;
       int i1;
       h0 oh02;
       Gift gift;
       String str2;
       UserInfo userInfo;
       int b;
       f uof1;
       Gift gift2;
       Gift gift3;
       int b1;
       int i4;
       Object obj1;
       int i5;
       a a = this.a;
       Objects.requireNonNull(a);
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, a, uob, "6")) {
       }else {
          h0 oh0 = new h0(a.q.c);
          i oi = PatchProxy.apply(objArray, a, uob, "7");
          b uob1 = 4;
          String str = 2;
          int i = 1;
          if (oi != PatchProxyResult.class) {
          }else {
             oi = new i(a.p.o6());
             gift2 = w.h(a.x, a.r);
             i5 = w.m(a.x, a.r);
             i4 = w.i(a.x, a.r, gift2);
             b = a.r.t.g();
             LiveSendGiftTraceInfo liveSendGift = oi.e();
             liveSendGift.j(gift2);
             liveSendGift.D(a.x);
             b1 = (a.x.l())? 1: 2;
             liveSendGift.z(b1);
             liveSendGift.p(b);
             liveSendGift.x(a.c(a.x, i5, i4));
             liveSendGift.t(uob1);
             oi.h(a.x.d());
          }
          Object obj = oi;
          a.V8(obj, "PRE_SEND_GIFT", "CLIENT_GIFT_BOX_MULTI_GIFT_SEND_CLICK", "[LiveAudienceGiftBoxComboSendHandlerPresenter][performSendGift]combo send", 1);
          a.S8(obj, "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceGiftBoxComboSendHandlerPresenter][performSendGift]combo send", i);
          if (!PatchProxy.applyVoidTwoRefs(obj, oh0, a, uob, "8")) {
             f uof = new f(a.x.e(), oh0.d, "", true, false, true, a.x.i(), 4, false, a.s.t.g(), a.r.O(obj.c()), w.k(a.x, a.r, oh0.d));
             obj.g(oi);
             int i2 = b$a.a[a.x.d().ordinal()];
             if (i2 != i) {
                int i3 = 0x1870f;
                String str1 = "CLIENT_SEND_PRE_CHECK";
                h0 oh03 = 3;
                if (i2 != str) {
                   if (i2 != oh03) {
                      if (i2 == uob1) {
                         gift = a.s.D.b();
                         i1 = 3;
                         str2 = str1;
                         if (!PatchProxy.applyVoidThreeRefs(obj, gift, oh0, a, b.class, "9")) {
                            userInfo = a.x.d.a();
                            if (userInfo == null) {
                               ExceptionHandler.handleCaughtException(new IllegalArgumentException("onComboSendFansGroupGift currentReceiver == null"));
                               a.S8(obj, str2, "[LiveAudienceGiftBoxComboSendHandlerPresenter][onComboSendFansGroupGift]currentReceiver is null", i3);
                            }else {
                               b = a.R8(userInfo, a.x.b());
                               uof1 = obj.b();
                               uof1.l(gift);
                               uof1.q(userInfo);
                               uof1.j(b);
                               uof1.o(a.r.c.s(i1));
                               if (a.w.b(obj, gift, i)) {
                                  a.P8(obj, 3, userInfo, b, gift, oh0);
                               }
                            }
                         }
                      }
                   }else {
                      str2 = str1;
                      gift = a.s.C.b();
                      if (!PatchProxy.applyVoidThreeRefs(obj, gift, oh0, a, b.class, "10")) {
                         userInfo = a.z.a();
                         if (userInfo == null) {
                            ExceptionHandler.handleCaughtException(new IllegalArgumentException("onComboSendPrivilegeGift currentReceiver == null"));
                            a.S8(obj, str2, "[LiveAudienceGiftBoxComboSendHandlerPresenter][onComboSendPrivilegeGift]currentReceiver is null", i3);
                         }else {
                            b = a.R8(userInfo, a.x.b());
                            uof1 = obj.b();
                            uof1.l(gift);
                            uof1.q(userInfo);
                            uof1.j(b);
                            uof1.o(a.r.c.s(str));
                            if (a.v.c(obj, gift, i)) {
                               a.P8(obj, 2, userInfo, b, gift, oh0);
                            }
                         }
                      }
                   }
                }else {
                   Gift gift1 = a.s.B.b();
                   gift2 = gift1;
                   gift3 = gift1;
                   String str3 = str1;
                   if (!PatchProxy.applyVoidThreeRefs(obj, gift2, oh0, a, b.class, "13")) {
                      UserInfo userInfo1 = a.y.a();
                      if (userInfo1 == null) {
                         ExceptionHandler.handleCaughtException(new IllegalArgumentException("onComboSendPacketGift currentReceiver == null"));
                         a.S8(obj, str3, "[LiveAudienceGiftBoxComboSendHandlerPresenter][onComboSendPacketGift]currentReceiver is null", i3);
                      }else {
                         b1 = a.R8(userInfo1, a.x.b());
                         i4 = 0;
                         if (PatchProxy.isSupport(uob)) {
                            Object[] objArray1 = new Object[]{obj,userInfo1,Boolean.valueOf(b1),gift3,oh0};
                            if (!PatchProxy.applyVoid(objArray1, a, uob, "14")) {
                            }
                         }else if(gift3 == null){
                            String[] stringArray = new String[i4];
                            e.b("LiveAudienceGiftBox", " handlePacketGiftComboSend gift == null", stringArray);
                            u1.R("gift_send_error", "handlePacketGiftComboSend gift == null", 3);
                            a.S8(obj, str3, "[LiveAudienceGiftBoxComboSendHandlerPresenter][handlePacketGiftComboSend]gift is null", 0x18707);
                         }else {
                            oh0.d = gift3;
                            oh0.f = a.s.B.B2(gift3);
                            Gift gift4 = gift3;
                            h0 oh04 = oh0;
                            obj1 = obj;
                            i1 = true;
                            oh01 = oh0;
                            oh04.a(a.s.t.g(), false, GiftTab.PacketGift, b1, userInfo1, true);
                            f uof2 = obj1.b();
                            uof2.l(gift4);
                            uof2.q(userInfo1);
                            uof2.j(b1);
                            uof2.p(i1);
                            a.u.a(obj1, gift4, userInfo1, i1);
                         label_029a :
                            oh02 = oh01;
                         label_02e9 :
                            if (!f.a("disableComboSendAutoDismissPanel")) {
                               a.s.z.dismiss();
                            }
                            ClientContent$LiveStreamPackage liveStreamPa = a.q.Z2.a();
                            if (!PatchProxy.applyVoidTwoRefs(oh02, liveStreamPa, null, a0.class, "5")) {
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.type = 18;
                               uElementPack.name = "multisend_gift";
                               uElementPack.action = 1001;
                               ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                               uContentPack.giftPackage = a0.b(oh02.d, oh02.m, oh02.f, oh02.e, oh02.k, oh02.n, oh02.o, 0);
                               uContentPack.liveStreamPackage = liveStreamPa;
                               u1.u(i1, uElementPack, uContentPack);
                            }
                         }
                      }
                   }
                }
             }else {
                obj1 = obj;
                oh01 = oh0;
                i1 = 1;
                gift3 = a.s.o.M2();
                h0 oh05 = oh01;
                oh02 = oh01;
                if (PatchProxy.applyVoidThreeRefs(obj1, gift3, oh05, a, b.class, "11")) {
                   goto label_02e9 ;
                }else {
                   userInfo = a.x.e();
                   b = a.R8(userInfo, a.x.b());
                   i5 = b ^ 0x01;
                   uof1 = obj1.b();
                   uof1.l(gift3);
                   uof1.j(b);
                   uof1.q(userInfo);
                   uof1.o(a.r.c.s(i5));
                   a.P8(obj1, i5, userInfo, b, gift3, oh02);
                   goto label_02e9 ;
                }
             }
          }
          oh01 = oh0;
          i1 = 1;
          goto label_029a ;
       }
       return;
    }
}

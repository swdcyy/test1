package h01.t$a;
import h01.x;
import h01.t;
import java.lang.Object;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import mk1.h;
import java.lang.Integer;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mk1.w;
import cl1.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import l33.d;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.StringBuilder;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import f92.b;
import p91.m;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import lm1.f;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;
import j01.e0$c;
import wk1.b;
import hg2.e;
import xk1.a;
import wo1.a;

public class t$a implements x	// class@0025fa
{
    public final t a;

    public void t$a(t p0){
       this.a = p0;
       super();
    }
    public void a(i p0,Gift p1,UserInfo p2,boolean p3){
       t t;
       object obj;
       boolean b;
       t$a uoa1;
       object oobject1;
       object oobject2;
       int i4;
       boolean b1;
       t$a uoa = this;
       i oi = p0;
       object oobject = p1;
       if (PatchProxy.isSupport(t$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, t$a.class, "1")) {
          return;
       }
       t$a a = uoa.a;
       Objects.requireNonNull(a);
       t ot = t.class;
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), a, t.class, "2")) {
          String str = (p3)? "combo_send_packet_gift": "normal_send_packet_gift";
          int i = 1;
          int i1 = 0;
          if (!p3) {
             t = a.t;
             int i2 = t.H + i;
             t.H = i2;
             t.I.put(i2, Integer.valueOf(i1));
          }
          p0.e().n(a.t.H);
          String str1 = "CLIENT_SEND_PRE_CHECK";
          if (w.p(a.p.R().getActivity(), str, a.p.c.mEntity)) {
             a.P8(oi, str1, "[PacketGiftSendPresenter][sendPacketGift] not login", 0x18705);
          }else {
             int i3 = a.t.t.g();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (PatchProxy.isSupport(ot)) {
                Object[] objArray = new Object[]{oi,oobject,p2,Integer.valueOf(i3),Boolean.valueOf(p3)};
                obj = PatchProxy.apply(objArray, a, ot, "3");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                   uoa1 = a;
                   oobject1 = oobject;
                label_019a :
                   oobject2 = oobject1;
                   i4 = i3;
                   b1 = false;
                label_01b1 :
                   str1 = "[PacketGiftSendPresenter][sendPacketGift]";
                   if (!p3 && oobject2 instanceof PacketGift) {
                      if (oobject2.mCanCombo != null && (oobject2.hasEnoughCountToComboSend() && b)) {
                         uoa1.t.A.e(i4, str1, b1);
                      }
                   label_01cf :
                      if (b) {
                         uoa1.p.z2.Nh(0);
                      }
                   }
                label_01da :
                   if (!b) {
                      uoa1.t.A.d(str1);
                   }
                   uoa1.t.p.g(true);
                }
             }
             obj = oobject;
             PacketGift mCount = obj.mCount;
             Object obj1 = PatchProxy.applyOneRefs(obj, a, ot, "5");
             b = (obj1 != patchProxyRe)? obj1.booleanValue(): d.a(obj.mItemType);
             if (!b && i3 > mCount) {
                if (!PatchProxy.applyVoid(null, a, ot, "4")) {
                   i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f101c44));
                }
                a.P8(oi, str1, "[PacketGiftSendPresenter][internalSendPacketGiftForAnchor]gift count:"+i3+",need:"+mCount, 0x1870b);
                HashMap hashMap = new HashMap();
                hashMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
                uoa1 = a;
                oobject1 = oobject;
                b uob = new b(a.p.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(oobject, i3), p1, i3, null, 1, 4);
                c uoc = new c("", 0, hashMap, uoa1.p.b().t5().a(a.class).d6(), null);
                f uof = p0.b();
                str1.c(new d(uof, uob, uof.g(), g.a(0x1870b, "")));
                uoa1.p.V1.G4(str1);
                b = false;
                goto label_019a ;
             }else {
                uoa1 = a;
                oobject2 = oobject;
                i4 = i3;
                b1 = false;
                uoa1.u.a(p0, p1, p2, i3, p3);
                b = true;
                goto label_01b1 ;
             }
          }
       }
       a0 w2 = uoa.a.p.W2;
       if (w2 != null) {
          w2.a();
       }
       return;
    }
}

package i01.j$a;
import i01.n;
import i01.j;
import java.lang.Object;
import lm1.i;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import h01.j;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.FansGroupGift;
import java.lang.StringBuilder;
import mk1.h;
import cl1.c;
import mk1.f;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import kg1.i;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import f82.c;
import com.kwai.framework.model.user.User;
import x52.a;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import i01.b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.basic.activity.x;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Integer;
import lm1.f;
import mk1.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import u07.t$a;
import lnc.a1;
import i01.d;
import u07.u;
import u07.t;
import u07.j;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem$LiveFansGroupInfo;
import wkd.b;
import ad5.a;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import e82.f;
import wk1.b;
import w91.a;
import lp3.c;
import lp3.e;
import java.util.Map;
import jk1.f;

public class j$a implements n	// class@0027e2
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void a(i p0,UserInfo p1,boolean p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j$a.class, "3")) {
          return;
       }
       this.a.t.b(p0, 3, true, p1, false);
       return;
    }
    public boolean b(i p0,Gift p1,boolean p2){
       j obj1;
       int b;
       String str3;
       GiftPanelItem$LiveFansGroupInfo mMinFansGrou;
       Object obj3;
       i oi = p0;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(j$a.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, j$a.class, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       j$a a = this.a;
       Objects.requireNonNull(a);
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), a, j.class, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0053 :
             String str = "CLIENT_SEND_PRE_CHECK";
             if (!obj instanceof FansGroupGift) {
                a.Z8(oi, str, "[LiveFansGroupGiftSendPresenter][canSendGiftForAnchor]not fans group gift:"+obj, 0x18715);
             }else {
                obj1 = a.s;
                h e = obj1.e;
                int i = obj1.t.g();
                int i1 = 3;
                String str1 = a.s.c.s(i1);
                String str2 = a.s.O(p0.c());
                LiveFansGroupIntimacyInfo mStatus = a.p.r1.Qi().mStatus;
                Object obj2 = obj;
                if (mStatus == i1) {
                   if (!PatchProxy.applyVoid(null, a, oj, "7")) {
                      i.i(a.p.Z2.a(), a.p.Z2.d(), "GIFT_PANEL");
                      LiveAudienceJoinFansGroupDialog liveAudience = LiveAudienceJoinFansGroupDialog.xh(a.B, a.p.Z2.I(), c.c(a.w, a.S8()), "GIFT_PANEL");
                      a.u = liveAudience;
                      liveAudience.k0(new b(a));
                      a.u.Cb(a.p.R().getChildFragmentManager(), "LiveAudienceJoinFansGroupDialog");
                   }
                   String notJoinTip = obj2.getNotJoinTip();
                   if (!PatchProxy.applyVoidOneRefs(notJoinTip, a, oj, "5") && !TextUtils.x(notJoinTip)) {
                      i.f(R.style.arg_RES_7f11066a, notJoinTip, true);
                   }
                   a.Z8(oi, str, "[LiveFansGroupGiftSendPresenter][canSendGiftForAnchor]fans group status:"+mStatus, 0x18716);
                   new HashMap().put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
                   a.a9(e, p1, i, p2, str1, str2, 0x18716, p0.b());
                }else {
                   int i2 = a.p.r1.w8();
                   FansGroupGift mLiveFansGro = obj2.mLiveFansGroupInfo;
                   if (!obj2.canSendGift(i2)) {
                      b = obj2.getGiftFansGroupLevel();
                      if (!PatchProxy.isSupport(oj) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(b), a, oj, "8") && !g.h(a.getActivity()))) {
                         t$a uoa = new t$a(a.getActivity());
                         uoa.X0(a1.r(R.string.arg_RES_7f10223e, String.valueOf(b)));
                         uoa.R0(a1.p(R.string.cancel));
                         uoa.T0(a1.p(R.string.arg_RES_7f10214c));
                         uoa.u0(new d(a));
                         j.d(uoa);
                      }
                      str3 = "[LiveFansGroupGiftSendPresenter][canSendGiftForAnchor]current level:"+i2+"need level:";
                      i2 = (mLiveFansGro == null)? 0: mLiveFansGro.mMinFansGroupLevel;
                      a.Z8(oi, str, str3+i2, 0x18710);
                      a.a9(e, p1, i, p2, str1, str2, 0x18710, p0.b());
                   }else {
                      long l = b.a(0x4c90014d).q();
                      str3 = str;
                      if (l - (long)(obj2.mPrice * i) < 0) {
                         if (a.b(a.p, "gift_box_bottom_entry")) {
                            obj3 = obj2;
                            if (!a.d(a.p.R.b(), ((long)(obj2.mPrice * i) - l))) {
                            }
                         }else {
                            obj3 = obj2;
                         }
                      }
                      b = true;
                   }
                }
             }
             b = false;
          }
       }else {
          goto label_0053 ;
       }
       return b;
    }
    public void c(i p0,Gift p1,UserInfo p2,boolean p3,boolean p4){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (this.b(p0, p1, p4)) {
          this.a.t.d(p0, 3, p1, p2, p3, p4);
       }
       return;
    }
}

package com.kuaishou.live.core.show.wishlist.sendgift.b;
import on2.e$b;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import android.view.View;
import android.widget.GridView;
import java.util.List;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailStat;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import lm1.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import com.kuaishou.live.core.show.wishlist.sendgift.d;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.core.show.wishlist.sendgift.LiveWishListSendGiftConfirmDialog;
import zn2.a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import nn2.r1;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import java.lang.StringBuilder;

public final class b implements e$b	// class@0012f5
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void a(int p0){
       boolean b;
       b ta = this.a;
       Objects.requireNonNull(ta);
       LiveLogTag wISH_LIST = LiveLogTag.WISH_LIST;
       b.Z(wISH_LIST, "on audience panel send click");
       if (ta.p != null) {
          ta.X8();
          ta.W8();
       }
       ta.q = p0;
       ta.p = ta.v.getChildAt(p0);
       Gift gift = a.a(ta.z.get(p0).mGiftId);
       ta.r = gift;
       i oi = ta.R8(gift);
       b uob = ta;
       i oi1 = oi;
       uob.S8(oi1, "PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_BUTTON_CLICK", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter]: click button", 1);
       uob.S8(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter]: click button", 1);
       if (ta.r == null) {
          ta.S8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter]gift is null", 0x18707);
          b.Z(wISH_LIST, "on audience panel send click gift is null");
       }else {
          ta.s = ta.z.get(p0).mGiftToken;
          p0 = 1;
          ta.x = p0;
          c obj = PatchProxy.apply(null, ta, c.class, "21");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean("liveIsAudienceWishListSendGiftConfirmNotNoticeChecked", false) ^ p0;
          if (b) {
             ta.S8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter] needShowConfirmDialog is true", 0x18726);
             d uod = new d(ta);
             if (!PatchProxy.applyVoidOneRefs(uod, ta, c.class, "22")) {
                x.E(ta.t);
                oi1 = ta.R8(ta.r);
                oi1.e().s(11);
                ta.S8(oi1, "PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_CONFIRM_SHOW", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter]: confirm dialog show", 1);
                obj = ta.r;
                LiveWishListSendGiftConfirmDialog liveWishList = PatchProxy.applyTwoRefs(obj, uod, null, LiveWishListSendGiftConfirmDialog.class, "1");
                if (liveWishList != PatchProxyResult.class) {
                }else {
                   liveWishList = new LiveWishListSendGiftConfirmDialog();
                   liveWishList.A = obj;
                   liveWishList.w = uod;
                   liveWishList.z = p0;
                }
                ta.t = liveWishList;
                liveWishList.k0(new a(ta));
                if (ta.u.R().t0().isAdded()) {
                   ta.t.Cb(ta.u.R().t0().getChildFragmentManager(), "liveWishListSendGiftConfirm");
                   a0 z2 = ta.u.Z2;
                   gift = ta.r.mId;
                   r1 or1 = r1.class;
                   if (!PatchProxy.isSupport(or1) || !PatchProxy.applyVoidTwoRefs(z2, Integer.valueOf(gift), null, or1, "36")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "WISHLIST_SEND_GIFT_CONFIRM_DIALOG";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = z2.a();
                      ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
                      giftPackage.identity = String.valueOf(gift);
                      uContentPack.giftPackage = giftPackage;
                      u1.u0(9, uElementPack, uContentPack);
                   }
                }
             }
          }else {
             ta.Z8(oi);
             b.Z(wISH_LIST, "on audience panel send click gift send single gift : "+ta.r.mId);
          }
       }
    label_0179 :
       return;
    }
}

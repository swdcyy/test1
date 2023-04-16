package com.kuaishou.live.core.show.wishlist.sendgift.d;
import com.kuaishou.live.core.show.wishlist.sendgift.LiveWishListSendGiftConfirmDialog$a;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.a0;
import com.yxcorp.gifshow.models.Gift;
import p91.m;
import nn2.r1;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class d implements LiveWishListSendGiftConfirmDialog$a	// class@0012fc
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       uod = this.a;
       r1.n(uod.u.Z2, uod.r.mId, "CANCEL", p0);
       return;
    }
    public void b(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       uod = this.a;
       i oi = uod.R8(uod.r);
       oi.e().s(11);
       i oi1 = oi;
       this.a.S8(oi1, "PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_CONFIRM_CLICK", "[LiveAudienceWishListDetailSendGiftPresenter][setWishGiftInfoAdapter]: confirm dialog click confirm", 1);
       this.a.S8(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]dialog send gift", 1);
       this.a.Z8(oi);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("liveIsAudienceWishListSendGiftConfirmNotNoticeChecked", p0);
       g.a(uEditor);
       uod = this.a;
       r1.n(uod.u.Z2, uod.r.mId, "CONFIRM", p0);
       return;
    }
}

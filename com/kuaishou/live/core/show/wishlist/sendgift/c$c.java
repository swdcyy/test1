package com.kuaishou.live.core.show.wishlist.sendgift.c$c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailStat;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import lm1.i;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import k2b.e0;
import com.google.gson.JsonElement;
import nn2.r1;

public class c$c implements View$OnClickListener	// class@0012f8
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       Gift gift = a.a(tb.z.get(tb.q).mGiftId);
       i oi = this.b.R8(gift);
       int i = 1;
       i oi1 = oi;
       this.b.S8(oi1, "PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_CONTINUE_BUTTON_CLICK", "[LiveAudienceWishListDetailSendGiftPresenter][doBindView]:wishlist SendGift", i);
       this.b.S8(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceWishListDetailSendGiftPresenter][doBindView]wishlist SendGift", i);
       if (gift == null) {
          this.b.S8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceWishListDetailSendGiftPresenter][doBindView] wishlist  gift is null", 0x18707);
       }
       c$c tb1 = this.b;
       tb1.Y8(oi, gift, 0, 0, tb1.z.get(tb1.q).mGiftToken, true);
       tb = this.b;
       r1.v(this.b.u.R().t0(), tb.u, tb.z.get(tb.q).mGiftId, 1, true, 0, true, e.r(this.b.getActivity()), 0, null);
       return;
    }
}

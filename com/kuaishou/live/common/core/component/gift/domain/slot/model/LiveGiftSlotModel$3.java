package com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$3;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import wj1.a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.basic.model.QLiveMessage;
import hx1.a;
import b61.a;
import vj1.a;
import yb6.d;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import gm1.a;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public class LiveGiftSlotModel$3 implements Model$a	// class@001274
{
    public final LiveGiftSlotModel b;

    public void LiveGiftSlotModel$3(LiveGiftSlotModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotModel$3.class, "1")) {
       }else if(p2 != null){
          LiveGiftSlotModel$3 tb = this.b;
          Objects.requireNonNull(tb);
          p1 = LiveGiftSlotModel.class;
          if (!PatchProxy.applyVoidOneRefs(p2, tb, p1, "1")) {
             p1 = PatchProxy.applyOneRefs(p2, tb, p1, "2");
             if (p1 != PatchProxyResult.class) {
             }else {
                p1 = null;
                Gift gift = a.a(p2.mGiftId);
                if (gift == null) {
                   b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotModel][insertMockMessage]gift is null");
                }else {
                   p1 = a.a(p2);
                   UserInfo user = p2.getUser();
                   if (user != null) {
                      a.f(user, tb.l.Bi());
                   }
                   p2.mUser = user;
                   p2.mNewGiftSlotStyle = p1[0];
                   p2.mDisplayDuration = p1[1];
                   p2.mExpireDate = tb.m.i() + d.a();
                   p2.mGiftSlotSelfAvatarRingImageUrls = tb.n;
                   p2.mGiftSlotSelfAvatarRingDynamicImageUrls = tb.o;
                   p1 = a.a(p2);
                   p1.mGift = gift;
                   p2 = new ArrayList();
                   p2.add(p1);
                   p1 = p2;
                }
             }
             tb.d("[LiveGiftSendModel][insertMockMessage]", p1);
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
    }
}

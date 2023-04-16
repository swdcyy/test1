package com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lj1.d;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lj1.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.StringBuilder;
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

public class LiveGiftSlotModel$1 implements Model$a	// class@001272
{
    public final LiveGiftSlotModel b;

    public void LiveGiftSlotModel$1(LiveGiftSlotModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       UserInfo this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotModel$1.class, "1")) {
       }else if(p2 != null && p2.c() != null){
          LiveGiftSlotModel$1 tb = this.b;
          p1 = p2.c().a();
          p2 = p2.c().b();
          Objects.requireNonNull(tb);
          Gift obj = PatchProxy.applyTwoRefs(p1, p2, tb, LiveGiftSlotModel.class, "3");
          if (obj != PatchProxyResult.class) {
          }else if(p1 == null){
             tb.e(true, p2.l(), "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveGiftSlotModel][createMockGiftMessage]:giftMessage is null", 508);
          }else {
             int i = 1;
             if (p1.mSlotPos < i) {
                tb.e(true, p2.l(), "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveGiftSlotModel][createMockGiftMessage]:不支持在槽位展示", 508);
             }else if(p1.mIsDrawingGift != null){
                b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotModel][createMockGiftMessage]:手绘礼物不展示");
             }else {
                obj = a.a(p1.mGiftId);
                if (obj == null) {
                   tb.e(true, p2.l(), "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveGiftSlotModel][createMockGiftMessage]:gift is null, gift id:"+p1.mGiftId, 603);
                }else {
                   int[] ointArray = a.a(p1);
                   this = p1.getUser();
                   if (this != null) {
                      a.f(this, tb.l.Bi());
                   }
                   p1.mUser = this;
                   p1.mNewGiftSlotStyle = ointArray[0];
                   p1.mDisplayDuration = ointArray[i];
                   p1.mExpireDate = tb.m.i() + d.a();
                   p1.mGiftSlotSelfAvatarRingImageUrls = tb.n;
                   p1.mGiftSlotSelfAvatarRingDynamicImageUrls = tb.o;
                   p1 = a.a(p1);
                   p1.mGift = obj;
                   p1.traceInfo = p2.l();
                   p2 = new ArrayList();
                   tb.e(true, p1.traceInfo, "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveGiftSlotModel][createMockGiftMessage]mock giftSlot success", 1);
                   p2.add(p1);
                   obj = p2;
                }
             }
          }
          obj = null;
          tb.d("[LiveGiftSendModel][onChangeValue]", obj);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
    }
}

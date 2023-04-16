package com.kuaishou.live.common.core.component.gift.gift.l$a;
import com.kuaishou.live.common.core.component.gift.gift.l$c;
import com.kuaishou.live.common.core.component.gift.gift.l;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.l$b;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public class l$a implements l$c	// class@0012aa
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       long l;
       l$b uob1;
       Object obj = this;
       Iterator obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, l$a.class, "1")) {
          return;
       }
       l$a a = obj.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(obj1, a, l.class, "4") || (a.q == null || (a.p > null && !q.f(p0)))) {
          obj1 = p0.iterator();
          while (obj1.hasNext()) {
             QLiveMessage qLiveMessage = obj1.next();
             if (a.r.size() >= a.p) {
                a.P8();
             }
             l$b uob = PatchProxy.applyOneRefs(qLiveMessage, a, l.class, "5");
             if (uob != PatchProxyResult.class) {
             }else {
                l ol = null;
                if (!qLiveMessage instanceof LiveGiftToAudienceMessage) {
                   String str = "null";
                   BroadcastGiftMessage uBroadcastGi = null;
                   if (qLiveMessage instanceof GiftMessage) {
                      GiftMessage giftMessage = qLiveMessage.cast();
                      GiftMessage mMagicFaceId = giftMessage.mMagicFaceId;
                      if (mMagicFaceId - uBroadcastGi > 0) {
                         l = giftMessage.mType & 32;
                         if (!l - uBroadcastGi && giftMessage.mIsStreamMergingGift == null) {
                            qLiveMessage = qLiveMessage.mUser;
                            if (qLiveMessage != null) {
                               str = qLiveMessage.mId;
                            }
                            uob1 = new l$b(str, (long)giftMessage.mGiftId, mMagicFaceId, giftMessage.mTime);
                         }
                      }
                   }
                   if (qLiveMessage instanceof BroadcastGiftMessage) {
                      BroadcastGiftMessage uBroadcastGi1 = qLiveMessage.cast();
                      BroadcastGiftMessage mMagicFaceId1 = uBroadcastGi1.mMagicFaceId;
                      if (mMagicFaceId1 - uBroadcastGi > 0 && uBroadcastGi1.mDisplayAnimation != null) {
                         qLiveMessage = qLiveMessage.mUser;
                         if (qLiveMessage != null) {
                            str = qLiveMessage.mId;
                         }
                         uob1 = new l$b(str, (long)uBroadcastGi1.mGiftId, mMagicFaceId1, uBroadcastGi1.mTime);
                      }
                   }
                }
             label_00c1 :
                uob = ol;
             }
             if (uob != null) {
                a.r.add(uob);
             }
          }
       }
    label_00cb :
       return;
    }
}

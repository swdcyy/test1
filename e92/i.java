package e92.i;
import java.lang.Object;
import t02.a0;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.util.Random;
import java.lang.System;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import wj1.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import com.kuaishou.live.basic.model.QLiveMessage;
import lm1.h;
import lm1.i;
import ik1.b0;
import n81.a;

public class i	// class@0026b5
{
    public static int a = 255;
    public static int b = 1;

    public void i(){
       super();
    }
    public static void a(int p0,int p1,boolean p2,a0 p3,UserInfo p4,int p5,int p6){
       int i;
       GiftMessage giftMessage;
       object oobject = p3;
       if (PatchProxy.isSupport(i.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Boolean.valueOf(p2),oobject,p4,Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, i.class, "2")) {
             return;
          }
       }
       Gift gift = a.a(p0);
       if (gift == null) {
          return;
       }else {
          i = p5;
          int i1 = (i == i.a)? new Random(System.currentTimeMillis()).nextInt(): i;
          if (p4 == null) {
             giftMessage = GiftMessage.createSelfGiftMessage(gift.mId, gift.mGiftType, p1, p6, i1);
          }else {
             giftMessage = LiveGiftToAudienceMessage.createSelfToAudienceGiftMessage(gift.mId, gift.mGiftType, p1, i1, p4);
             giftMessage.mComboCount = p6;
          }
          giftMessage.mShouldOnlyDisplayInSlot = p2;
          int[] ointArray = a.a(giftMessage);
          giftMessage.mNewGiftSlotStyle = ointArray[0];
          giftMessage.mDisplayDuration = ointArray[1];
          giftMessage.mLiveAssistantType = oobject.b2.d(QCurrentUser.me().getId()).ordinal();
          if (!PatchProxy.applyVoidTwoRefs(giftMessage, oobject, null, i.class, "3")) {
             oobject.c2.l(new h(null, giftMessage, 2));
             a0 x = oobject.X;
             if (x != null) {
                x.R0(giftMessage);
             }
          }
          return;
       }
    }
}

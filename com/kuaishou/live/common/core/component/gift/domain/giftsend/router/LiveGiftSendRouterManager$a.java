package com.kuaishou.live.common.core.component.gift.domain.giftsend.router.LiveGiftSendRouterManager$a;
import vq5.b;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.router.LiveGiftSendRouterManager;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.x0;
import kotlin.jvm.internal.a;
import java.lang.Long;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import z1.k;
import com.kwai.framework.model.user.UserInfo;
import d61.v;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.util.Objects;
import ekd.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.models.Gift;
import ih1.l;
import java.util.Random;
import java.lang.System;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import wj1.a;
import ah1.c;

public final class LiveGiftSendRouterManager$a implements b	// class@001256
{
    public final LiveGiftSendRouterManager a;

    public void LiveGiftSendRouterManager$a(LiveGiftSendRouterManager p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       boolean b;
       LiveGiftSendRouterManager$a a;
       int i8;
       GiftMessage giftMessage;
       Object obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveGiftSendRouterManager$a.class, "1")) {
          return;
       }
       b.c0(LiveGiftTag.GIFT_SEND, "[LiveGiftSendRouterManager] receive router", "uri", obj1);
       String str = x0.a(obj1, "giftids");
       String str1 = x0.a(obj1, "giftcounts");
       if (str != null && str1 != null) {
          String str2 = x0.b(obj1, "comboKey", "-1");
          a.o(str2, "SafetyUriUtil.getQueryPa¡­nts.GIFT_COMBO_KEY, \"-1\"\)");
          long l = Long.parseLong(str2);
          int i = (int)(l % (long)0xf4240);
          str2 = x0.b(obj1, "comboCount", "-1");
          a.o(str2, "SafetyUriUtil.getQueryPa¡­T_COMBO_COUNT, \"-1\"\n    \)");
          int i1 = Integer.parseInt(str2);
          int i2 = (i1 <= 0)? 1: i1;
          str2 = x0.a(obj1, "recipient");
          String str3 = x0.a(obj1, "name");
          UserInfo userInfo = null;
          if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
             UserInfo userInfo1 = obj.a.e.get();
             userInfo1 = (userInfo1 != null)? userInfo1.mId: userInfo;
             if (!TextUtils.equals(str2, userInfo1)) {
                userInfo = new UserInfo();
                userInfo.mName = str3;
                userInfo.mId = str2;
             }
          }
       label_008e :
          UserInfo userInfo2 = userInfo;
          obj1 = x0.a(obj1, "shouldonlydisplayinslot");
          int i3 = 0;
          b = (!TextUtils.isEmpty(obj1) && v.e(obj1, 1) == 1)? true: false;
          String[] stringArray = new String[]{","};
          stringArray = new String[i3];
          Object[] objArray = StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null).toArray(stringArray);
          String str4 = "null cannot be cast to non-null type kotlin.Array<T>";
          Objects.requireNonNull(objArray, str4);
          String[] stringArray1 = new String[]{","};
          stringArray = new String[i3];
          Object[] objArray1 = StringsKt__StringsKt.H4(str1, stringArray1, false, 0, 6, null).toArray(stringArray);
          Objects.requireNonNull(objArray1, str4);
          if (j.h(objArray) || (!j.h(objArray1) && objArray.length == objArray1.length)) {
             i1 = objArray.length;
             int i4 = 0;
             while (i4 < i1) {
                int i5 = -1;
                int i6 = v.e(objArray[i4], i5);
                int i7 = v.e(objArray1[i4], 1);
                a = obj.a;
                Objects.requireNonNull(a);
                LiveGiftSendRouterManager liveGiftSend = LiveGiftSendRouterManager.class;
                if (PatchProxy.isSupport(liveGiftSend)) {
                   Object[] objArray2 = new Object[6];
                   objArray2[i3] = Integer.valueOf(i6);
                   objArray2[1] = Integer.valueOf(i7);
                   objArray2[2] = Boolean.valueOf(b);
                   objArray2[3] = userInfo2;
                   objArray2[4] = Integer.valueOf(i);
                   objArray2[5] = Integer.valueOf(i2);
                   if (PatchProxy.applyVoid(objArray2, a, liveGiftSend, "4")) {
                   label_019a :
                      i8 = i2;
                      i5 = 0;
                   label_019c :
                      i4 = i4 + 1;
                      i2 = i8;
                      i3 = 0;
                   }
                }
                Gift gift = a.f.a(i6);
                if (gift != null) {
                   int i9 = (i == i5)? new Random(System.currentTimeMillis()).nextInt(): i;
                   if (userInfo2 == null) {
                      i5 = 0;
                      i8 = i2;
                      giftMessage = GiftMessage.createSelfGiftMessage(gift.mId, gift.mGiftType, i7, i8, i9);
                      a.o(giftMessage, "GiftMessage.createSelfGi¡­ount,\n        key\n      \)");
                   }else {
                      i8 = i2;
                      i5 = 0;
                      giftMessage = LiveGiftToAudienceMessage.createSelfToAudienceGiftMessage(gift.mId, gift.mGiftType, i7, i9, userInfo2);
                      a.o(giftMessage, "LiveGiftToAudienceMessag¡­        recipient\n      \)");
                      giftMessage.mComboCount = i8;
                   }
                   giftMessage.mShouldOnlyDisplayInSlot = b;
                   int[] ointArray = a.a(giftMessage);
                   giftMessage.mNewGiftSlotStyle = ointArray[i5];
                   giftMessage.mDisplayDuration = ointArray[1];
                   a.g.e("[LiveGiftSendRouterManager][insertLiveGiftMessage]", giftMessage);
                   goto label_019c ;
                }else {
                   goto label_019a ;
                }
             }
          }
       }
    label_01a2 :
       return;
    }
}

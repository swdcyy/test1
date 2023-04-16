package com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import lj1.d;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import lnc.a1;
import ip3.a;
import s93.s;
import u93.d;
import android.graphics.Bitmap;
import u93.b;
import u93.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLiteGiftMessageManager$1 implements Model$a	// class@001de9
{
    public final LiveLiteGiftMessageManager b;

    public void LiveLiteGiftMessageManager$1(LiveLiteGiftMessageManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftMessageManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 == null || !p2.e()) {
             b.Z(LiveLogTag.LIVE_LITE, this.b.c+" onChangeValue gift failed");
          }else {
             b.Z(LiveLogTag.LIVE_LITE, this.b.c+" onChangeValue gift sent");
             this.b.d.b(LiveActionTrigger$UserAction.SendGiftOnce);
             d uod = p2.c();
             if (uod != null) {
                GiftMessage giftMessage = uod.a();
                if (giftMessage != null) {
                   p1 = a.a(giftMessage.mGiftId);
                   if (p1 != null) {
                      p2 = p1.mName;
                      p2 = (p2 == null || !p2.length())? 1: null;
                      if (!p2) {
                         p1 = p1.mName;
                      label_0077 :
                         p2 = this.b.e.get();
                         if (p2 != null) {
                            a.o(p1, "giftName");
                            p2.b(new d(p1, giftMessage.mCount, a.b(giftMessage.mGiftId)));
                         }
                         s os = this.b.e.get();
                         if (os != null) {
                            a.o(p1, "giftName");
                            os.b(new a(p1));
                         }
                      }
                   }
                   p1 = a1.p(R.string.arg_RES_7f1025a3);
                   goto label_0077 ;
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftMessageManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}

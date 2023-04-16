package com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$giftSendModelObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveComboVM$giftSendModelObserver$1 implements Model$a	// class@00118b
{
    public final LiveComboVM b;

    public void LiveComboVM$giftSendModelObserver$1(LiveComboVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboVM$giftSendModelObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 == null || p2.b() != 1) {
             b.Z(LiveGiftTag.COMBO, "[LiveComboVM]send gift failed, set comboViewVisible and holdingComboSendGift false");
             LiveComboVM$giftSendModelObserver$1 tb = this.b;
             p1 = Boolean.FALSE;
             tb.r0(tb.x0()).setValue(p1);
             tb = this.b;
             tb.r0(tb.y0()).setValue(p1);
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboVM$giftSendModelObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}

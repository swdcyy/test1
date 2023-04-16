package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import wh1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.base.inject.LiveDialogAdapterType;
import zg1.a;
import zg1.e;
import z1.k;
import wh1.a;
import xh1.a;

public final class LiveComboManager$3 extends Lambda implements p	// class@001168
{
    public final LiveComboManager this$0;

    public void LiveComboManager$3(LiveComboManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(Gift p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveComboManager$3 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveComboManager$3.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "giftTabType");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       b uob = PatchProxy.applyTwoRefs(p0, p1, obj, LiveComboManager.class, "9");
       if (uob != patchProxyRe) {
       }else {
          LiveGiftTag cOMBO = LiveGiftTag.COMBO;
          String str = "gift";
          b.c0(cOMBO, "[LiveComboManager][checkComboProtect] start", str, p0);
          b uob1 = null;
          if (p0 == null) {
             b.Z(cOMBO, "[LiveComboManager][checkComboProtect] gift = null");
          }else if(obj.k.c(LiveDialogAdapterType.SendGiftButtonPanel)){
             b.Z(cOMBO, "[LiveComboManager][checkComboProtect] comboButton is showing");
          }else {
             b uob2 = a.b(p0.mId, p1, obj.m.get());
             if (uob2 != null) {
                obj.s.d(uob2.d, uob2.e);
                b.c0(cOMBO, "[LiveComboManager][checkComboProtect] showComboView", str, p0);
                uob = uob2;
             }
          }
          uob = uob1;
       }
       return uob;
    }
}

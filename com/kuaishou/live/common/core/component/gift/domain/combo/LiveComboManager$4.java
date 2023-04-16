package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$4;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import lj1.b;
import com.yxcorp.gifshow.models.Gift;
import zh1.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import oh1.c;
import z1.k;
import sh1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveComboManager$4 extends Lambda implements p	// class@001169
{
    public final LiveComboManager this$0;

    public void LiveComboManager$4(LiveComboManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final j invoke(b p0,Gift p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveComboManager$4 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveComboManager$4.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       j oj = PatchProxy.applyTwoRefs(p0, p1, obj, LiveComboManager.class, "10");
       if (oj != patchProxyRe) {
       }else if(p0 == null || p1 == null){
          b.d0(LiveGiftTag.COMBO, "[LiveComboManager][createComboVC]", "gift", p1, "giftSendParams", p0);
          oj = null;
       }else {
          j oj1 = new j(obj.p, obj.g, p1, obj.o, p0, obj.n, obj.d);
          oj = v8;
       }
       return oj;
    }
}

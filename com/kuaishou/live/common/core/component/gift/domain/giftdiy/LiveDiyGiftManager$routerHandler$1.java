package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$routerHandler$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import java.lang.Object;
import cj1.b;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import cj1.a;

public final class LiveDiyGiftManager$routerHandler$1 extends Lambda implements p	// class@001239
{
    public final LiveDiyGiftManager this$0;

    public void LiveDiyGiftManager$routerHandler$1(LiveDiyGiftManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(b p0,int p1){
       if (PatchProxy.isSupport(LiveDiyGiftManager$routerHandler$1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveDiyGiftManager$routerHandler$1.class, "1")) {
          return;
       }
       a.p(p0, "info");
       this.this$0.c(p0, p1);
       this.this$0.d(p0.a(), new a(p0.b()));
       return;
    }
}

package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b$a;
import rw1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b;
import cj1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;

public final class LiveDiyGiftManager$b$a implements a	// class@001235
{
    public final LiveDiyGiftManager$b a;
    public final b b;

    public void LiveDiyGiftManager$b$a(LiveDiyGiftManager$b p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveDiyGiftManager$b$a.class, "2")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1036a1);
       this.a.a.f(2);
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, LiveDiyGiftManager$b$a.class, "1")) {
          return;
       }
       this.a.a.c(this.b, 2);
       return;
    }
    public void onShow(){
       PatchProxy.applyVoid(null, this, LiveDiyGiftManager$b$a.class, "3");
    }
}

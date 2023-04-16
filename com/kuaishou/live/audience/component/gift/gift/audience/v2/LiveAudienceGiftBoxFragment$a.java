package com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment$a;
import jk1.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ik1.b0;
import mk1.a;
import mk1.c;
import e17.i;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;

public class LiveAudienceGiftBoxFragment$a implements a	// class@000af6
{
    public final LiveAudienceGiftBoxFragment a;

    public void LiveAudienceGiftBoxFragment$a(LiveAudienceGiftBoxFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxFragment$a.class, "2")) {
          return;
       }
       if (this.a.n.c2.e() && this.a.l.a.c == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101277);
          this.a.l.a.c = true;
       }
       return;
    }
    public void b(boolean p0){
       LiveAudienceGiftBoxFragment$a uoa = LiveAudienceGiftBoxFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       LiveAudienceGiftBoxFragment k = this.a.k;
       int i = (p0)? 4: 0;
       k.setVisibility(i);
       return;
    }
}

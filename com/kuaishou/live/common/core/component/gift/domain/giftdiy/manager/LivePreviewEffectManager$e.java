package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$e;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class LivePreviewEffectManager$e implements k	// class@001245
{
    public final LivePreviewEffectManager b;

    public void LivePreviewEffectManager$e(LivePreviewEffectManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Integer integer = PatchProxy.apply(null, this, LivePreviewEffectManager$e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(this.b.d);
       }
       return integer;
    }
}

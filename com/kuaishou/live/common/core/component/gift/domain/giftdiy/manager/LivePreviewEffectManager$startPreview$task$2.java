package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$startPreview$task$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import java.lang.Object;
import kz2.d;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LivePreviewEffectManager$startPreview$task$2 extends Lambda implements l	// class@001246
{
    public final LivePreviewEffectManager this$0;

    public void LivePreviewEffectManager$startPreview$task$2(LivePreviewEffectManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewEffectManager$startPreview$task$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (a.g(p0, this.this$0.e) && this.this$0.d == 3)? true: false;
       return b;
    }
}

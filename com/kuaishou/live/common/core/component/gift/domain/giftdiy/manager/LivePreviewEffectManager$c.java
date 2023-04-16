package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$c;
import iy2.f$a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import bj1.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import cj1.a;

public final class LivePreviewEffectManager$c implements f$a	// class@001243
{
    public final LivePreviewEffectManager a;

    public void LivePreviewEffectManager$c(LivePreviewEffectManager p0){
       this.a = p0;
       super();
    }
    public void d(long p0){
    }
    public void h(long p0){
       LivePreviewEffectManager$c uoc = LivePreviewEffectManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       if (uoc.e != null && !uoc.j.e3((long)2080)) {
          b.c0(this.a.c, "[onEffectBizBitRemoved] resume preview effect", "bizBit", Long.valueOf(p0));
          LivePreviewEffectManager$c ta = this.a;
          LivePreviewEffectManager g = ta.g;
          if (g != null) {
             ta.c(g, ta.f);
          }
       }
       return;
    }
}

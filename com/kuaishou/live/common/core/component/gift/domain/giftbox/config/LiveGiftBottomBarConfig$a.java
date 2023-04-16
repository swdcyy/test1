package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$a;
import yg1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveGiftBottomBarConfig$a implements a	// class@0011cc
{
    public final LiveGiftBottomBarConfig a;

    public void LiveGiftBottomBarConfig$a(LiveGiftBottomBarConfig p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBottomBarConfig$a.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          p0.a = p1.c();
       }
       return;
    }
}

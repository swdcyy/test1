package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$a;
import z1.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import o73.c;
import qi1.b;
import o73.b;
import qm1.d;

public final class LiveLitGiftBoxBottomBarEntryManager$a implements a	// class@001db8
{
    public final LiveLitGiftBoxBottomBarEntryManager a;

    public void LiveLitGiftBoxBottomBarEntryManager$a(LiveLitGiftBoxBottomBarEntryManager p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitGiftBoxBottomBarEntryManager$a.class, "1")) {
       }else {
          LiveLogTag gIFT = LiveLogTag.GIFT;
          gIFT.appendTag("LiveGiftBottomBarManager");
          b.P(gIFT, "checkShowGiftBottomBar");
          LiveLitGiftBoxBottomBarEntryManager$a ta = this.a;
          Objects.requireNonNull(ta);
          LiveLitGiftBoxBottomBarEntryManager liveLitGiftB = LiveLitGiftBoxBottomBarEntryManager.class;
          if (!PatchProxy.applyVoidOneRefs(p0, ta, liveLitGiftB, "3")) {
             Boolean uBoolean = ta.i.a();
             b = (uBoolean != null)? uBoolean.booleanValue(): false;
             if (a.g(p0, Boolean.TRUE) && !b) {
                gIFT.appendTag("LiveGiftBottomBarManager");
                b.P(gIFT, "checkShowGiftBottomBar, showGiftBottomBar");
                if (!PatchProxy.applyVoid(null, ta, liveLitGiftB, "6")) {
                   ta.m.a(ta.g);
                   ta.o.d();
                   ta.n.a(ta.f);
                   p0 = ta.d;
                   if (p0 != null) {
                      p0.f();
                   }
                }
             }else if(a.g(p0, Boolean.FALSE)){
                gIFT.appendTag("LiveGiftBottomBarManager");
                b.P(gIFT, "checkShowGiftBottomBar, hideGiftBottomBar");
                ta.c();
             }
          }
       }
       return;
    }
}

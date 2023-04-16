package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$a;
import z1.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import kotlin.jvm.internal.a;

public final class LiveLiteGiftBoxSideBarEntryManager$a implements a	// class@001dc1
{
    public final LiveLiteGiftBoxSideBarEntryManager a;

    public void LiveLiteGiftBoxSideBarEntryManager$a(LiveLiteGiftBoxSideBarEntryManager p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$a.class, "1")) {
       }else {
          LiveLogTag gIFT = LiveLogTag.GIFT;
          gIFT.appendTag("LiveGiftSideBarManager");
          b.P(gIFT, "checkShowGiftSideBar");
          Boolean uBoolean = this.a.i.a();
          b = (uBoolean != null)? uBoolean.booleanValue(): false;
          if (a.g(p0, Boolean.FALSE) && !b) {
             gIFT.appendTag("LiveGiftSideBarManager");
             b.P(gIFT, "checkShowGiftSideBar, onGiftSideBarVisible");
             this.a.g();
          }else if(a.g(p0, Boolean.TRUE)){
             gIFT.appendTag("LiveGiftSideBarManager");
             b.P(gIFT, "checkShowGiftSideBar, onGiftSideBarInVisible");
             this.a.f();
          }
       }
       return;
    }
}

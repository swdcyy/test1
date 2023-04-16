package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$d$a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$a;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;

public final class LiveLiteGiftBoxSideBarEntryManager$d$a implements LiveLiteGiftBoxSideBarItem$a	// class@001dc4
{
    public final UpdatedGiftResponse a;
    public final LiveLiteGiftBoxSideBarEntryManager$d b;

    public void LiveLiteGiftBoxSideBarEntryManager$d$a(UpdatedGiftResponse p0,LiveLiteGiftBoxSideBarEntryManager$d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(View p0,boolean p1){
       if (PatchProxy.isSupport2(LiveLiteGiftBoxSideBarEntryManager$d$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, LiveLiteGiftBoxSideBarEntryManager$d$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.b.b.d(this.a, p1);
       PatchProxy.onMethodExit(LiveLiteGiftBoxSideBarEntryManager$d$a.class, "1");
       return;
    }
}

package com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$a$a;
import java.lang.Runnable;
import java.lang.String;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vq5.d;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager;
import android.app.Activity;
import android.content.Context;

public final class LiveGiftBoxGiftNamingNavigationBarManager$a$a implements Runnable	// class@000b71
{
    public final String b;
    public final LiveGiftBoxGiftNamingNavigationBarManager$a c;

    public void LiveGiftBoxGiftNamingNavigationBarManager$a$a(String p0,LiveGiftBoxGiftNamingNavigationBarManager$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveGiftBoxGiftNamingNavigationBarManager$a$a.class, "1")) {
          return;
       }
       this.c.a.d().r4(this.b, this.c.a.a());
       PatchProxy.onMethodExit(LiveGiftBoxGiftNamingNavigationBarManager$a$a.class, "1");
       return;
    }
}

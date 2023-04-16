package com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager$isLowPhoneForCustomGift$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import r63.c;
import r63.c$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveCustomGiftKrnPagePrefCtrlManager	// class@000ae5
{
    public static final p a;
    public static final LiveCustomGiftKrnPagePrefCtrlManager$a b;
    public static final LiveCustomGiftKrnPagePrefCtrlManager c;

    static {
       LiveCustomGiftKrnPagePrefCtrlManager.c = new LiveCustomGiftKrnPagePrefCtrlManager();
       LiveCustomGiftKrnPagePrefCtrlManager.a = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveCustomGiftKrnPagePrefCtrlManager$isLowPhoneForCustomGift$2.INSTANCE);
       LiveCustomGiftKrnPagePrefCtrlManager.b = new LiveCustomGiftKrnPagePrefCtrlManager$a();
    }
    public void LiveCustomGiftKrnPagePrefCtrlManager(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveCustomGiftKrnPagePrefCtrlManager.class, "2")) {
          return;
       }
       b.a(0x6e3ea8b).a("LiveCustomizePack", LiveCustomGiftKrnPagePrefCtrlManager.b);
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveCustomGiftKrnPagePrefCtrlManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiveCustomGiftKrnPagePrefCtrlManager.a.getValue();
       }
       return obj.booleanValue();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveCustomGiftKrnPagePrefCtrlManager.class, "3")) {
          return;
       }
       b.a(0x6e3ea8b).b("LiveCustomizePack", LiveCustomGiftKrnPagePrefCtrlManager.b);
       return;
    }
}

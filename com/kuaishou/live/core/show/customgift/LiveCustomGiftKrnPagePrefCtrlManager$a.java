package com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager$a;
import r63.c$a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zsd.u;
import com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager;
import com.kuaishou.live.playeradapter.statistics.c$a;
import com.kuaishou.live.playeradapter.statistics.c;
import android.os.Build$VERSION;
import o56.a;
import kotlin.jvm.internal.a;

public final class LiveCustomGiftKrnPagePrefCtrlManager$a implements c$a	// class@000ae3
{

    public void LiveCustomGiftKrnPagePrefCtrlManager$a(){
       super();
    }
    public void a(String p0,Map p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCustomGiftKrnPagePrefCtrlManager$a.class, str)) {
          return;
       }
       if (!u.J1(p0, "LiveCustomizePack", false, 2, null)) {
          return;
       }
       if (p1 != null) {
          if (!LiveCustomGiftKrnPagePrefCtrlManager.c.b()) {
             str = "0";
          }
          p1.put("isLowPhoneForCustomGift", str);
          c$a uoa = c.a();
          long l = (long)1024;
          p1.put("totalMemory", String.valueOf((uoa.a / l)));
          p1.put("maxMemory", String.valueOf((uoa.b / l)));
          p1.put("usedMemory", String.valueOf((uoa.c / l)));
          p1.put("osVersion", String.valueOf(Build$VERSION.SDK_INT));
          uoa = a.j;
          a.o(uoa, "AppEnv.MANUFACTURER");
          p1.put("deviceModel", uoa);
       }
       return;
    }
}

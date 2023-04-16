package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$e;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ad5.a;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import ad5.b;

public final class LiveLiteGiftManager$e implements k	// class@001da3
{
    public static final LiveLiteGiftManager$e b;

    static {
       LiveLiteGiftManager$e.b = new LiveLiteGiftManager$e();
    }
    public void LiveLiteGiftManager$e(){
       super();
    }
    public Object get(){
       a uoa = PatchProxy.apply(null, this, LiveLiteGiftManager$e.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          b uob = d.a(0x630bc993);
          a.o(uob, "PluginManager.get\(PaymentPlugin::class.java\)");
          uoa = uob.d1();
       }
       return uoa;
    }
}

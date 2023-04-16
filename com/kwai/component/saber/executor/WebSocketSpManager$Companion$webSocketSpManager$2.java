package com.kwai.component.saber.executor.WebSocketSpManager$Companion$webSocketSpManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.saber.executor.WebSocketSpManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import k85.c;
import kotlin.jvm.internal.a;

public final class WebSocketSpManager$Companion$webSocketSpManager$2 extends Lambda implements a	// class@000b27
{
    public static final WebSocketSpManager$Companion$webSocketSpManager$2 INSTANCE;

    static {
       WebSocketSpManager$Companion$webSocketSpManager$2.INSTANCE = new WebSocketSpManager$Companion$webSocketSpManager$2();
    }
    public void WebSocketSpManager$Companion$webSocketSpManager$2(){
       super(0);
    }
    public final WebSocketSpManager invoke(){
       Object obj = PatchProxy.apply(null, this, WebSocketSpManager$Companion$webSocketSpManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SharedPreferences sharedPrefer = c.a(a.b(), "KUAIHSOU_WEBSOCKETS_DATA", 0);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­BSOCKETS_DATA\",\n    0\n  \)");
       return new WebSocketSpManager(sharedPrefer);
    }
    public Object invoke(){
       return this.invoke();
    }
}

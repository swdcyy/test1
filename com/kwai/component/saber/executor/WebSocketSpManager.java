package com.kwai.component.saber.executor.WebSocketSpManager;
import com.kwai.component.saber.executor.WebSocketSpManager$a;
import nsd.u;
import com.kwai.component.saber.executor.WebSocketSpManager$Companion$webSocketSpManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class WebSocketSpManager	// class@000b29
{
    public final SharedPreferences a;
    public static final p b;
    public static final WebSocketSpManager$a c;

    static {
       WebSocketSpManager.c = new WebSocketSpManager$a(null);
       WebSocketSpManager.b = s.c(WebSocketSpManager$Companion$webSocketSpManager$2.INSTANCE);
    }
    public void WebSocketSpManager(SharedPreferences p0){
       super();
       this.a = p0;
    }
    public final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketSpManager.class, "1")) {
          return;
       }
       a.p(p0, "startUpKey");
       a.p(p1, "startUp");
       g.a(this.a.edit().putString(p0, p1));
       return;
    }
}

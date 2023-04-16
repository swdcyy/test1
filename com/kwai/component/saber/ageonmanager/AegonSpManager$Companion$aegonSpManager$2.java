package com.kwai.component.saber.ageonmanager.AegonSpManager$Companion$aegonSpManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.saber.ageonmanager.AegonSpManager;
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

public final class AegonSpManager$Companion$aegonSpManager$2 extends Lambda implements a	// class@000b24
{
    public static final AegonSpManager$Companion$aegonSpManager$2 INSTANCE;

    static {
       AegonSpManager$Companion$aegonSpManager$2.INSTANCE = new AegonSpManager$Companion$aegonSpManager$2();
    }
    public void AegonSpManager$Companion$aegonSpManager$2(){
       super(0);
    }
    public final AegonSpManager invoke(){
       Object obj = PatchProxy.apply(null, this, AegonSpManager$Companion$aegonSpManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SharedPreferences sharedPrefer = c.a(a.b(), "KUAIHSOU_PROXY_DATA", 0);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­OU_PROXY_DATA\",\n    0\n  \)");
       return new AegonSpManager(sharedPrefer);
    }
    public Object invoke(){
       return this.invoke();
    }
}

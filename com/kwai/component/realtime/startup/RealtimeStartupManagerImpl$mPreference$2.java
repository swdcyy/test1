package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$mPreference$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public final class RealtimeStartupManagerImpl$mPreference$2 extends Lambda implements a	// class@000b09
{
    public static final RealtimeStartupManagerImpl$mPreference$2 INSTANCE;

    static {
       RealtimeStartupManagerImpl$mPreference$2.INSTANCE = new RealtimeStartupManagerImpl$mPreference$2();
    }
    public void RealtimeStartupManagerImpl$mPreference$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl$mPreference$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), "RealtimeStartupManagerImpl2023", 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}

package com.yxcorp.gifshow.homepage.personal.realtime.RealtimeTabPluginImpl$mPreference$2;
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

public final class RealtimeTabPluginImpl$mPreference$2 extends Lambda implements a	// class@00178d
{
    public static final RealtimeTabPluginImpl$mPreference$2 INSTANCE;

    static {
       RealtimeTabPluginImpl$mPreference$2.INSTANCE = new RealtimeTabPluginImpl$mPreference$2();
    }
    public void RealtimeTabPluginImpl$mPreference$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, RealtimeTabPluginImpl$mPreference$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), "realtimeTabPageOpt2023", 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}

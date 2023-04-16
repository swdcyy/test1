package com.kuaishou.commercial.splash.SplashUtils$mLogSplashShowRemoveFailed$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SplashUtils$mLogSplashShowRemoveFailed$2 extends Lambda implements a	// class@001597
{
    public static final SplashUtils$mLogSplashShowRemoveFailed$2 INSTANCE;

    static {
       SplashUtils$mLogSplashShowRemoveFailed$2.INSTANCE = new SplashUtils$mLogSplashShowRemoveFailed$2();
    }
    public void SplashUtils$mLogSplashShowRemoveFailed$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SplashUtils$mLogSplashShowRemoveFailed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("logSplashShowRemoveFailed", true);
    }
}

package com.kuaishou.commercial.splash.SplashUtils$mSplashTokenRegexReason$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SplashUtils$mSplashTokenRegexReason$2 extends Lambda implements a	// class@00159a
{
    public static final SplashUtils$mSplashTokenRegexReason$2 INSTANCE;

    static {
       SplashUtils$mSplashTokenRegexReason$2.INSTANCE = new SplashUtils$mSplashTokenRegexReason$2();
    }
    public void SplashUtils$mSplashTokenRegexReason$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SplashUtils$mSplashTokenRegexReason$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("adSplashForbiddenClipboardRuleReason", true);
    }
}

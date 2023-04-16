package com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2 extends Lambda implements a	// class@00161e
{
    public static final SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2 INSTANCE;

    static {
       SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2.INSTANCE = new SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2();
    }
    public void SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("splashClearUselessMaterialRecordFiles", true);
    }
}

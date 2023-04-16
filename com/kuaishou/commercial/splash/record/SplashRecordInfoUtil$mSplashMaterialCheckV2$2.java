package com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashMaterialCheckV2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import nx.a;

public final class SplashRecordInfoUtil$mSplashMaterialCheckV2$2 extends Lambda implements a	// class@00161f
{
    public static final SplashRecordInfoUtil$mSplashMaterialCheckV2$2 INSTANCE;

    static {
       SplashRecordInfoUtil$mSplashMaterialCheckV2$2.INSTANCE = new SplashRecordInfoUtil$mSplashMaterialCheckV2$2();
    }
    public void SplashRecordInfoUtil$mSplashMaterialCheckV2$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SplashRecordInfoUtil$mSplashMaterialCheckV2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d(a.b, false);
    }
}

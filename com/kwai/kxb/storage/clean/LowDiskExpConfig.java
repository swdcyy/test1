package com.kwai.kxb.storage.clean.LowDiskExpConfig;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$mLowDiskSwitchConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$isManualCleanEnabled$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$isAutoCleanEnabled$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$isLowDiskModeEnabled$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskModeKeepDuration$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskCleanDuration$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$bundleLruTimeLimit$2;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskNotCleanBundles$2;
import java.lang.Object;
import uu6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LowDiskExpConfig	// class@000800
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final LowDiskExpConfig i;

    static {
       LowDiskExpConfig.i = new LowDiskExpConfig();
       LowDiskExpConfig.a = s.c(LowDiskExpConfig$mLowDiskSwitchConfig$2.INSTANCE);
       LowDiskExpConfig.b = s.c(LowDiskExpConfig$isManualCleanEnabled$2.INSTANCE);
       LowDiskExpConfig.c = s.c(LowDiskExpConfig$isAutoCleanEnabled$2.INSTANCE);
       LowDiskExpConfig.d = s.c(LowDiskExpConfig$isLowDiskModeEnabled$2.INSTANCE);
       LowDiskExpConfig.e = s.c(LowDiskExpConfig$lowDiskModeKeepDuration$2.INSTANCE);
       LowDiskExpConfig.f = s.c(LowDiskExpConfig$lowDiskCleanDuration$2.INSTANCE);
       LowDiskExpConfig.g = s.c(LowDiskExpConfig$bundleLruTimeLimit$2.INSTANCE);
       LowDiskExpConfig.h = s.c(LowDiskExpConfig$lowDiskNotCleanBundles$2.INSTANCE);
    }
    public void LowDiskExpConfig(){
       super();
    }
    public final e a(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LowDiskExpConfig.a.getValue();
    }
    public final long b(double p0){
       return (long)(p0 * (double)0x5265c00);
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = LowDiskExpConfig.c.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = LowDiskExpConfig.b.getValue();
       }
       return obj.booleanValue();
    }
}

package com.kwai.kxb.storage.clean.LowDiskExpConfig$mLowDiskSwitchConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import uu6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;
import nsd.u;
import java.lang.reflect.Type;

public final class LowDiskExpConfig$mLowDiskSwitchConfig$2 extends Lambda implements a	// class@0007ff
{
    public static final LowDiskExpConfig$mLowDiskSwitchConfig$2 INSTANCE;

    static {
       LowDiskExpConfig$mLowDiskSwitchConfig$2.INSTANCE = new LowDiskExpConfig$mLowDiskSwitchConfig$2();
    }
    public void LowDiskExpConfig$mLowDiskSwitchConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig$mLowDiskSwitchConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = new e(false, false, 0, 0, 0, 31, null);
       return ExpConfig.f.e("kds_low_disk_config", e.class, v13);
    }
}

package com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskModeKeepDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.kxb.storage.clean.LowDiskExpConfig;
import uu6.e;
import java.lang.Long;

public final class LowDiskExpConfig$lowDiskModeKeepDuration$2 extends Lambda implements a	// class@0007fc
{
    public static final LowDiskExpConfig$lowDiskModeKeepDuration$2 INSTANCE;

    static {
       LowDiskExpConfig$lowDiskModeKeepDuration$2.INSTANCE = new LowDiskExpConfig$lowDiskModeKeepDuration$2();
    }
    public void LowDiskExpConfig$lowDiskModeKeepDuration$2(){
       super(0);
    }
    public final long invoke(){
       LowDiskExpConfig obj = PatchProxy.apply(null, this, LowDiskExpConfig$lowDiskModeKeepDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = LowDiskExpConfig.i;
       return obj.b(obj.a().lowDiskKeepDuration);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}

package com.kwai.kxb.storage.clean.LowDiskExpConfig$isManualCleanEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.storage.clean.LowDiskExpConfig;
import uu6.e;

public final class LowDiskExpConfig$isManualCleanEnabled$2 extends Lambda implements a	// class@0007fa
{
    public static final LowDiskExpConfig$isManualCleanEnabled$2 INSTANCE;

    static {
       LowDiskExpConfig$isManualCleanEnabled$2.INSTANCE = new LowDiskExpConfig$isManualCleanEnabled$2();
    }
    public void LowDiskExpConfig$isManualCleanEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig$isManualCleanEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LowDiskExpConfig.i.a().isManualCleanEnabled;
    }
}

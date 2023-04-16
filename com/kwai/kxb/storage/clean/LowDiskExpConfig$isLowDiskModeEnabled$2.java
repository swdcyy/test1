package com.kwai.kxb.storage.clean.LowDiskExpConfig$isLowDiskModeEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.storage.clean.LowDiskExpConfig;

public final class LowDiskExpConfig$isLowDiskModeEnabled$2 extends Lambda implements a	// class@0007f9
{
    public static final LowDiskExpConfig$isLowDiskModeEnabled$2 INSTANCE;

    static {
       LowDiskExpConfig$isLowDiskModeEnabled$2.INSTANCE = new LowDiskExpConfig$isLowDiskModeEnabled$2();
    }
    public void LowDiskExpConfig$isLowDiskModeEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LowDiskExpConfig obj = PatchProxy.apply(null, this, LowDiskExpConfig$isLowDiskModeEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LowDiskExpConfig.i;
       boolean b = (obj.d() || obj.c())? true: false;
       return b;
    }
}

package com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$Companion$isHonorMedalMigrated$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiveControlFileUtil$Companion$isHonorMedalMigrated$2 extends Lambda implements a	// class@000ede
{
    public static final LiveControlFileUtil$Companion$isHonorMedalMigrated$2 INSTANCE;

    static {
       LiveControlFileUtil$Companion$isHonorMedalMigrated$2.INSTANCE = new LiveControlFileUtil$Companion$isHonorMedalMigrated$2();
    }
    public void LiveControlFileUtil$Companion$isHonorMedalMigrated$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileUtil$Companion$isHonorMedalMigrated$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("liveHonorMedalSwitchLiveResourceManager", false);
    }
}

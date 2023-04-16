package com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2;
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

public final class LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2 extends Lambda implements a	// class@000edf
{
    public static final LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2 INSTANCE;

    static {
       LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2.INSTANCE = new LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2();
    }
    public void LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveMaterialResourceManager", false);
    }
}

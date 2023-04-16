package com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ja1.d;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.util.Map;
import java.lang.reflect.Type;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$Companion$isDeleteMigrateResource$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$Companion$isHonorMedalMigrated$2;

public final class LiveControlFileUtil	// class@000ee1
{
    public static final d a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final LiveControlFileUtil$a e;

    static {
       u ou = null;
       LiveControlFileUtil$a uoa = new LiveControlFileUtil$a(ou);
       LiveControlFileUtil.e = uoa;
       Objects.requireNonNull(uoa);
       d uod = PatchProxy.apply(ou, uoa, LiveControlFileUtil$a.class, "5");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = a.t().u("SOURCE_LIVE").getValue("liveResourcesOptimizeConfig", d.class, new d(false, ou));
       }
       LiveControlFileUtil.a = uod;
       LiveControlFileUtil.b = s.c(LiveControlFileUtil$Companion$isDeleteMigrateResource$2.INSTANCE);
       LiveControlFileUtil.c = s.c(LiveControlFileUtil$Companion$isLiveMaterialResManagerEnable$2.INSTANCE);
       LiveControlFileUtil.d = s.c(LiveControlFileUtil$Companion$isHonorMedalMigrated$2.INSTANCE);
    }
}

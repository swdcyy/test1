package com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$create$liveStageCamera$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl;
import java.lang.Object;
import u71.c;
import u71.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import h02.b;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import android.content.Context;

public final class AudienceLiveStageServiceImpl$create$liveStageCamera$1 extends Lambda implements l	// class@000843
{
    public final AudienceLiveStageServiceImpl this$0;

    public void AudienceLiveStageServiceImpl$create$liveStageCamera$1(AudienceLiveStageServiceImpl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceLiveStageServiceImpl$create$liveStageCamera$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cameraParam");
       return d.a(-204054297).Yj(p0, new LiveCameraView(this.this$0.e));
    }
}

package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import u71.c;
import u71.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import android.app.Activity;
import rp5.a;
import sz1.e;
import sz1.f;
import android.content.Context;
import o91.c;

public final class LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1 extends Lambda implements l	// class@0017fc
{
    public final LiveAudienceMultiInteractManagerImpl this$0;

    public void LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1(LiveAudienceMultiInteractManagerImpl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(c p0){
       LiveAudienceMultiInteractManagerImpl z;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1 obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       LiveCameraView liveCameraVi = PatchProxy.apply(objArray, obj, LiveAudienceMultiInteractManagerImpl.class, "8");
       if (liveCameraVi != patchProxyRe) {
       }else {
          z = obj.B;
          if (z == null) {
             a.S("currentActivityService");
          }
          Activity uActivity = z.c();
          if (uActivity == null || uActivity.isFinishing()) {
             liveCameraVi = objArray;
          }else {
             f.a(obj);
             liveCameraVi = new LiveCameraView(uActivity);
          }
       }
       if (liveCameraVi != null) {
          z = this.this$0.z;
          if (z == null) {
             a.S("cameraService");
          }
          objArray = z.hh(p0, liveCameraVi);
       }
       return objArray;
    }
}

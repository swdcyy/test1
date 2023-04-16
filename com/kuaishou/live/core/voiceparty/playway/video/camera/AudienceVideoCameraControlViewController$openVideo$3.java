package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import java.lang.Object;
import kotlin.Result;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import ev2.j;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.feature.api.platform.antispam.model.FaceRecognitionNetworkException;

public final class AudienceVideoCameraControlViewController$openVideo$3 extends Lambda implements l	// class@0018c6
{
    public final boolean $isInvited;
    public final AudienceVideoCameraControlViewController this$0;

    public void AudienceVideoCameraControlViewController$openVideo$3(AudienceVideoCameraControlViewController p0,boolean p1){
       this.this$0 = p0;
       this.$isInvited = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.unbox-impl());
       return l1.a;
    }
    public final void invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVideoCameraControlViewController$openVideo$3.class, "1")) {
          return;
       }
       p0 = Result.exceptionOrNull-impl(p0);
       if (p0 != null) {
          j.a.a(p0);
          if (p0 instanceof KwaiException) {
             int errorCode = p0.getErrorCode();
             if (errorCode != 0x13882 && (errorCode == 0x61a81 || (p0 instanceof FaceRecognitionNetworkException && this.$isInvited != null))) {
                this.this$0.Z2();
             }
          }
       }
       return;
    }
}

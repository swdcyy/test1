package com.yxcorp.gifshow.detail.playmodule.precreate.LaunchPreCreatePlayerManager$preCreatePlayer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import uh5.e;
import com.yxcorp.gifshow.detail.playmodule.precreate.LaunchPlayerLogger;
import java.util.Objects;
import com.yxcorp.gifshow.w;
import uv8.e1;

public final class LaunchPreCreatePlayerManager$preCreatePlayer$1 extends Lambda implements l	// class@001656
{
    public final int $bufferTimeMs;
    public final boolean $forceEnableDummySurface;
    public final boolean $hdrSupport;
    public final int $mediaCodecPolicy;
    public final QPhoto $qPhoto;
    public final long $startPos;

    public void LaunchPreCreatePlayerManager$preCreatePlayer$1(QPhoto p0,int p1,long p2,boolean p3,boolean p4,int p5){
       this.$qPhoto = p0;
       this.$mediaCodecPolicy = p1;
       this.$startPos = p2;
       this.$forceEnableDummySurface = p3;
       this.$hdrSupport = p4;
       this.$bufferTimeMs = p5;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LaunchPreCreatePlayerManager$preCreatePlayer$1.class, "1")) {
          return;
       }
       a.p(p0, "buildData");
       p0.setBizFt(":ks-components:qphoto-player").setBizType(r1.o0(this.$qPhoto.getEntity(), "QPhotoMediaPlayerCM")).setMediaCodecPolicy(this.$mediaCodecPolicy).setStartPosition(this.$startPos).setIsSlideMode(e.b());
       boolean b = true;
       if (this.$forceEnableDummySurface != null) {
          LaunchPlayerLogger b1 = LaunchPlayerLogger.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(null, b1, LaunchPlayerLogger.class, "12")) {
             b1.a().z().t();
          }
          p0.setEnableMediaCodecDummySurface(b);
       }
       if (this.$hdrSupport != null) {
          p0.setVodManifestHdrAdaptiveMode(b);
       }
       LaunchPreCreatePlayerManager$preCreatePlayer$1 t$bufferTime = this.$bufferTimeMs;
       if (t$bufferTime != -1) {
          p0.setMaxBufferTimeMs(t$bufferTime);
       }
       return;
    }
}

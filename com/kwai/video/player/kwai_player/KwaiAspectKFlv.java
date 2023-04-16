package com.kwai.video.player.kwai_player.KwaiAspectKFlv;
import com.kwai.video.player.kwai_player.AspectKFlv;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KwaiAspectKFlv extends AspectKFlv	// class@000b30
{
    public final IBuildKwaiPlayer mPlayer;

    public void KwaiAspectKFlv(IBuildKwaiPlayer p0,boolean p1){
       super();
       this.mPlayer = p0;
       long l = (p1)? 1: 0;
       p0.setOption(4, "enable-live-manifest", l);
       return;
    }
    public boolean isLiveManifest(){
       Object obj = PatchProxy.apply(null, this, KwaiAspectKFlv.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mPlayer.isLiveManifestNative();
    }
    public void setDeviceGeneralScore(double p0){
       KwaiAspectKFlv kwaiAspectKF = KwaiAspectKFlv.class;
       if (PatchProxy.isSupport(kwaiAspectKF) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, kwaiAspectKF, "2")) {
          return;
       }
       this.mPlayer.setOption(1, "deviceGeneralScore", (long)(int)(p0 * 0x408f400000000000));
       return;
    }
    public void setLiveAdaptiveConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAspectKFlv.class, "1")) {
          return;
       }
       KwaiAspectKFlv tmPlayer = this.mPlayer;
       if (TextUtils.isEmpty(p0)) {
          p0 = null;
       }
       tmPlayer.setOption(1, "liveAdaptConfig", p0);
       return;
    }
}

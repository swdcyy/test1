package com.kwai.video.waynelive.mediaplayer.LivePlayerRuntimeParams;
import java.lang.Object;
import com.kwai.video.waynelive.mediaplayer.LiveExtSurfaceCropParams;
import com.kwai.video.waynelive.mediaplayer.LivePlayerWebRTCParams;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.SurfaceTexture;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LivePlayerRuntimeParams	// class@000e0b
{
    public boolean mEnableAutoUpdateViewSize;
    public SurfaceTexture mExtSurfaceTexture;
    public final LiveExtSurfaceCropParams mLiveExtSurfaceCropParams;
    public String mNetworkRetryScene;
    public final LivePlayerWebRTCParams mPlayerWebRTCParams;
    public int mViewHeight;
    public int mViewWidth;
    public String mVppExtJson;
    public int mVppRequestId;

    public void LivePlayerRuntimeParams(){
       super();
       this.mLiveExtSurfaceCropParams = new LiveExtSurfaceCropParams();
       this.mPlayerWebRTCParams = new LivePlayerWebRTCParams();
    }
    public void applyTo(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerRuntimeParams.class, "1")) {
          return;
       }
       p0.setExtSurfaceTexture(this.mExtSurfaceTexture);
       this.mLiveExtSurfaceCropParams.applyTo(p0);
       if (!TextUtils.isEmpty(this.mVppExtJson)) {
          p0.setKwaivppExtJson(this.mVppRequestId, this.mVppExtJson);
       }
       return;
    }
}

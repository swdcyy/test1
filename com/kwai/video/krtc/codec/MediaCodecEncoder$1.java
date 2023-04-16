package com.kwai.video.krtc.codec.MediaCodecEncoder$1;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import com.kwai.video.krtc.codec.MediaCodecEncoder;
import java.lang.Object;
import com.oplus.ocs.base.common.ConnectionResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class MediaCodecEncoder$1 implements OnConnectionFailedListener	// class@000777
{
    public final MediaCodecEncoder a;

    public void MediaCodecEncoder$1(MediaCodecEncoder p0){
       this.a = p0;
       super();
    }
    public void onConnectionFailed(ConnectionResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaCodecEncoder$1.class, "1")) {
          return;
       }
       Log.e(MediaCodecEncoder.a(), "onConnectionFailed, authentication fail, errorCode: "+p0.getErrorCode()+", errorMessage: "+p0.getErrorMessage());
       return;
    }
}

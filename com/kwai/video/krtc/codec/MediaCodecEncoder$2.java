package com.kwai.video.krtc.codec.MediaCodecEncoder$2;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.kwai.video.krtc.codec.MediaCodecEncoder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.utils.Log;

public class MediaCodecEncoder$2 implements OnConnectionSucceedListener	// class@000778
{
    public final MediaCodecEncoder a;

    public void MediaCodecEncoder$2(MediaCodecEncoder p0){
       this.a = p0;
       super();
    }
    public void onConnectionSucceed(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder$2.class, "1")) {
          return;
       }
       Log.i(MediaCodecEncoder.a(), "onConnectionSucceed, authentication success");
       return;
    }
}

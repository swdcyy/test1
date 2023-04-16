package com.kwai.video.krtc.rtcengine.internal.y;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.rtcengine.VideoWatermark;

public class y	// class@0008a0
{
    public Arya a;
    public boolean b;

    public void y(Arya p0){
       super();
       this.a = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoWatermark", "clearVideoWatermarks");
       this.a.setLogo(null, 0, 0, 0, 0, 0, this.b);
       return 0;
    }
    public int a(VideoWatermark p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoWatermark", "addVideoWatermark");
       if (p0 != null) {
          VideoWatermark rgba = p0.rgba;
          if (rgba != null) {
             VideoWatermark width = p0.width;
             if (width > null) {
                VideoWatermark height = p0.height;
                if (height > null) {
                   VideoWatermark logoInRtc = p0.logoInRtc;
                   this.b = logoInRtc;
                   this.a.setLogo(rgba, width, height, p0.x, p0.y, p0.colorSpace, logoInRtc);
                   return 0;
                }
             }
          }
       }
       return -1;
    }
}

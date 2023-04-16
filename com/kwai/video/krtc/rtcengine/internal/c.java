package com.kwai.video.krtc.rtcengine.internal.c;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import java.nio.ByteBuffer;

public class c	// class@000867
{
    public boolean a;
    public Arya b;

    public void c(Arya p0){
       super();
       this.a = false;
       this.b = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioInput", "enableExternalRawAudioSource");
       this.a = true;
       this.b.setExternalAudioDevice(true);
       return 0;
    }
    public int a(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a == null) {
          return -1;
       }
       int i = p0.data.remaining();
       byte[] uobyteArray = new byte[i];
       p0.data.get(uobyteArray, 0, i);
       this.b.inputRawAudio(uobyteArray, i, p0.sampleRate, p0.channelNum, p0.timestamp);
       return 0;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioInput", "disableExternalRawAudioSource");
       this.a = false;
       this.b.setExternalAudioDevice(false);
       return false;
    }
    public int b(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = p0.data.remaining();
       byte[] uobyteArray = new byte[i];
       p0.data.get(uobyteArray, 0, i);
       this.b.inputSpeakerAudio(uobyteArray, i, p0.sampleRate, p0.channelNum, p0.timestamp);
       return 0;
    }
}

package com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;

public class RtcEngineAudioFrame	// class@0007ee
{
    public int channelNum;
    public ByteBuffer data;
    public boolean isPcmData;
    public int sampleRate;
    public int size;
    public long timestamp;

    public void RtcEngineAudioFrame(ByteBuffer p0,int p1){
       super();
       this.size = 0;
       this.sampleRate = 0xac44;
       this.channelNum = 1;
       this.timestamp = 0;
       this.isPcmData = true;
       this.data = p0;
       this.size = p1;
       this.isPcmData = false;
       this.timestamp = 0;
    }
    public void RtcEngineAudioFrame(ByteBuffer p0,int p1,int p2,int p3,long p4){
       super();
       this.size = 0;
       this.sampleRate = 0xac44;
       this.channelNum = 1;
       this.timestamp = 0;
       this.isPcmData = true;
       this.data = p0;
       this.size = p1;
       this.sampleRate = p2;
       this.channelNum = p3;
       this.timestamp = p4;
       this.isPcmData = true;
    }
    public static RtcEngineAudioFrame createAudioEncodedFrame(ByteBuffer p0,int p1){
       RtcEngineAudioFrame rtcEngineAud = RtcEngineAudioFrame.class;
       if (PatchProxy.isSupport(rtcEngineAud)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, rtcEngineAud, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new RtcEngineAudioFrame(p0, p1);
    }
    public static RtcEngineAudioFrame createAudioRawFrame(ByteBuffer p0,int p1,int p2,int p3,long p4){
       Object obj;
       RtcEngineAudioFrame rtcEngineAud = RtcEngineAudioFrame.class;
       if (PatchProxy.isSupport(rtcEngineAud)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, rtcEngineAud, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RtcEngineAudioFrame rtcEngineAud1 = new RtcEngineAudioFrame(p0, p1, p2, p3, p4);
       return obj;
    }
}

package com.frog.engine.audio.TrackDecodeUtils;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.frog.engine.audio.MediaCodecDecode;
import java.lang.Thread;

public class TrackDecodeUtils	// class@0014f8
{
    public static HashMap decodeHashMap;

    static {
       TrackDecodeUtils.decodeHashMap = new HashMap();
    }
    public void TrackDecodeUtils(){
       super();
    }
    public static void closeAndRemove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TrackDecodeUtils.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          TrackDecodeUtils.decodeHashMap.remove(p0);
       }
       return;
    }
    public static int getBytesPerFrame(String p0){
       MediaCodecDecode obj = PatchProxy.applyOneRefs(p0, null, TrackDecodeUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = TrackDecodeUtils.decodeHashMap.get(p0);
       if (obj == null) {
          return (TrackDecodeUtils.getChannel(p0) * 2);
       }
       obj.getPcmEncodingSize();
       return obj.getPcmEncodingSize();
    }
    public static int getChannel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TrackDecodeUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       MediaCodecDecode mediaCodecDe = TrackDecodeUtils.decodeHashMap.get(p0);
       if (mediaCodecDe == null) {
          return 1;
       }
       mediaCodecDe.getChannel();
       return mediaCodecDe.getChannel();
    }
    public static byte[] getDecodePcmData(String p0){
       MediaCodecDecode obj = PatchProxy.applyOneRefs(p0, null, TrackDecodeUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = TrackDecodeUtils.decodeHashMap.get(p0);
       if (obj == null) {
          obj = new MediaCodecDecode();
          TrackDecodeUtils.decodeHashMap.put(p0, obj);
       }
       Thread.currentThread().getName();
       return obj.decodeCodec(p0);
    }
    public static float getDuration(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TrackDecodeUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       MediaCodecDecode mediaCodecDe = TrackDecodeUtils.decodeHashMap.get(p0);
       if (mediaCodecDe == null) {
          return 0;
       }
       mediaCodecDe.getDurationUs();
       return ((((float)mediaCodecDe.getDurationUs() * 0x3f800000) / 1000.00f) / 1000.00f);
    }
    public static int getSampleRate(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TrackDecodeUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       MediaCodecDecode mediaCodecDe = TrackDecodeUtils.decodeHashMap.get(p0);
       if (mediaCodecDe == null) {
          return 0xac44;
       }
       mediaCodecDe.getSampleRate();
       return mediaCodecDe.getSampleRate();
    }
}

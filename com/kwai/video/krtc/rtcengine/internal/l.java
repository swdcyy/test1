package com.kwai.video.krtc.rtcengine.internal.l;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.Arya;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import java.lang.StringBuilder;
import java.lang.Integer;
import android.graphics.Bitmap;
import com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import java.util.ArrayList;

public class l	// class@000880
{
    public Arya a;
    public z b;

    public void l(z p0){
       super();
       this.b = p0;
       this.a = p0.a();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "enableVideo");
       this.a.enableVideoTx(3);
       this.a.resumeAllRemoteVideoStreams();
       this.a.setDefaultNetworkProbeVideoKbps();
       return 0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "muteLocalVideoStream "+p0);
       this.a.disableVideoTx(p0, 0);
       return 0;
    }
    public int a(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreVideo", "setVideoEncoderConfiguration:"+p0+", level:"+p1);
       this.a.setVideoEncoderConfiguration(p0, p1);
       return 0;
    }
    public int a(String p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "startPushImage "+p0);
       this.a.replaceVideoWithBitmap(p0, p1);
       return 0;
    }
    public int a(String p0,RtcEngine$VideoEncoderConfiguration p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "setVideoEncoderConfiguration "+p0);
       this.a.setVideoEncoderConfiguration(p0, p1);
       return 0;
    }
    public int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "muteRemoteVideoStream "+p0+" user "+p1);
       this.a.unsubscribeRemoteVideoStreams(p0, p1);
       return 0;
    }
    public int a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreVideo", "setRemoteVideoStreamType "+p0+" user "+p1+" streamtype "+p2);
       this.a.setRemoteVideoStreamType(p0, p1, p2);
       return 0;
    }
    public void a(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "17")) {
          return;
       }
       Log.i("RtcEngineCoreVideo", "subscribeRemoteVideoStream "+p0);
       this.a.subscribeRemoteVideoStreams(p0, p1);
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "disableVideo");
       this.a.disableVideoTx(3);
       this.a.pauseAllRemoteVideoStreams();
       this.a.setDefaultNetworkProbeAudioKbps();
       return 0;
    }
    public int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "unmuteLocalVideoStream "+p0);
       this.a.enableVideoTx(p0, 0);
       return 0;
    }
    public int b(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "24");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreVideo", "setRemoteDefaultVideoStreamType "+p0+" streamtype "+p1);
       this.a.setRemoteDefaultVideoStreamType(p0, p1);
       return 0;
    }
    public int b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "unmuteRemoteVideoStream "+p0+" user "+p1);
       this.a.subscribeRemoteVideoStreams(p0, p1);
       return 0;
    }
    public void b(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "18")) {
          return;
       }
       Log.i("RtcEngineCoreVideo", "unsubscribeRemoteVideoStream "+p0);
       this.a.unsubscribeRemoteVideoStreams(p0, p1);
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "enableLocalVideo");
       this.a.setLocalVideoEnabled();
       return 0;
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "pauseAllRemoteVideoStreams "+p0);
       this.a.pauseAllRemoteVideoStreams(p0);
       return 0;
    }
    public int c(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreVideo", "setRemoteSubscribeFallbackOption "+p0+" isFallbackOrRecover "+p1);
       this.a.setRemoteSubscribeFallbackOption(p0, p1);
       return 0;
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "19")) {
          return;
       }
       Log.i("RtcEngineCoreVideo", "subscribeRemoteContent channelId:"+p0+", userId:"+p1);
       this.a.subscribeRemoteContent(p0, p1);
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "disableLocalVideo");
       this.a.setLocalVideoDisabled();
       return 0;
    }
    public int d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "resumeAllRemoteVideoStreams "+p0);
       this.a.resumeAllRemoteVideoStreams(p0);
       return 0;
    }
    public int d(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreVideo", "setLocalPublishFallbackOption "+p0+" isFallbackOrRecover "+p1);
       this.a.setLocalPublishFallbackOption(p0, p1);
       return 0;
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "20")) {
          return;
       }
       Log.i("RtcEngineCoreVideo", "unsubscribeRemoteContent channelId:"+p0+", userId:"+p1);
       this.a.unsubscribeRemoteContent(p0, p1);
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "setDefaultMuteAllRemoteVideoStreams");
       this.a.unsubscribeRemoteVideoStreamByDefault();
       return 0;
    }
    public int e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "enableDualStreamMode "+p0);
       this.a.enableDualStreamMode(p0);
       return 0;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, l.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "setDefaultUnmuteAllRemoteVideoStreams");
       this.a.subscribeRemoteVideoStreamByDefault();
       return 0;
    }
    public int f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "disableDualStreamMode "+p0);
       this.a.disableDualStreamMode(p0);
       return 0;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, l.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "subscribeRemoteVideoStreamByDefault");
       this.a.subscribeRemoteVideoStreamByDefault();
       return 0;
    }
    public int g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "stopPushImage "+p0);
       this.a.replaceVideoWithBitmap(p0, null);
       return 0;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, l.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreVideo", "unsubscribeRemoteVideoStreamByDefault");
       this.a.unsubscribeRemoteVideoStreamByDefault();
       return 0;
    }
}

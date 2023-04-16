package com.kwai.video.krtc.observers.AryaCallObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.ChannelSummaryInfo;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaNetworkStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRtcStats;

public abstract class AryaCallObserver	// class@000786
{
    public Handler handler;

    public void AryaCallObserver(){
       super();
       this.handler = new Handler(Looper.myLooper());
    }
    public void AryaCallObserver(Looper p0){
       super();
       this.handler = new Handler(p0);
    }
    public Looper getLooper(){
       Object obj = PatchProxy.apply(null, this, AryaCallObserver.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.handler.getLooper();
    }
    public void onAudioPassThroughMsg(String p0,ByteBuffer p1){
    }
    public void onClientRoleChangeFailed(String p0,int p1,int p2){
    }
    public void onClientRoleChanged(String p0,int p1,int p2){
    }
    public void onConnectionLost(String p0){
    }
    public void onConnectionStateChanged(String p0,int p1,int p2){
    }
    public void onDebugInfo(String p0,String p1){
    }
    public void onJoinChannelSuccess(String p0,String p1,int p2){
    }
    public void onLastmileQuality(int p0){
    }
    public void onLeaveChannel(String p0,int p1,int p2,ChannelSummaryInfo p3){
    }
    public void onLocalAudioStats(KWAryaStats$KWAryaLocalAudioStats p0){
    }
    public void onLocalMutedRemoteVideo(String p0,String p1,boolean p2){
    }
    public void onLocalPublishFallbackToAudioOnly(String p0,boolean p1){
    }
    public void onLocalScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
    }
    public void onLocalVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onLocalVideoStats(KWAryaStats$KWAryaLocalVideoStats p0){
    }
    public void onMediaServerInfo(String p0,String p1,int p2,boolean p3){
    }
    public void onNetworkQuality(KWAryaStats$KWAryaNetworkStats p0){
    }
    public abstract void onNotify(String p0,int p1,int p2,String p3);
    public void onPassThroughDataReceived(String p0,String p1,int p2,byte[] p3){
    }
    public void onRejoinChannelSuccess(String p0,int p1){
    }
    public void onRemoteAudioMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteAudioStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteAudioStats(KWAryaStats$KWAryaRemoteAudioStats p0){
    }
    public void onRemoteBgmProgressUpdate(String p0,int p1,int p2){
    }
    public void onRemoteScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
    }
    public void onRemoteSubscribeFallbackToAudioOnly(String p0,String p1,boolean p2){
    }
    public void onRemoteUserEnter(String p0,String p1,int p2,int p3){
    }
    public void onRemoteUserLeave(String p0,String p1,int p2,int p3){
    }
    public void onRemoteVideoFrozen(String p0,String p1,boolean p2,int p3){
    }
    public void onRemoteVideoMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteVideoStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteVideoStats(KWAryaStats$KWAryaRemoteVideoStats p0){
    }
    public void onRtcStats(KWAryaStats$KWAryaRtcStats p0){
    }
    public void onRtmpStreamingStateChanged(String p0,String p1,int p2,int p3){
    }
    public void onScreenCaptureRemoteStart(String p0,String p1){
    }
    public void onScreenCaptureRemoteStop(String p0,String p1){
    }
    public void onStreamMessageError(String p0,String p1,int p2,int p3){
    }
    public void onVideoMixTypeChanged(String p0,int p1,int p2){
    }
    public void onVideoSendParamChanged(int p0,int p1,int p2,boolean p3){
    }
    public void onVoiceComment(String p0,ByteBuffer p1){
    }
}

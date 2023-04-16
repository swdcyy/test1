package com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioVolumeInfo;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$ScaleLayout;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.ChannelSummaryInfo;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRtcStats;

public abstract class IRtcEngineEventHandler	// class@0007e2
{

    public void IRtcEngineEventHandler(){
       super();
    }
    public void bgmOffsetInLiveStream(String p0,int p1){
    }
    public void onActiveSpeaker(String p0,ArrayList p1){
    }
    public void onAudioEffectProgressed(String p0,String p1,float p2,float p3){
    }
    public void onAudioEffectStateChanged(String p0,String p1,int p2,int p3){
    }
    public void onAudioOutputDeviceChanged(){
    }
    public void onAudioPublishStateChanged(String p0,int p1,int p2,int p3){
    }
    public void onAudioRecordFinished(int p0,int p1,int p2){
    }
    public void onAudioRecordStateChange(int p0,int p1,int p2){
    }
    public void onAudioRecorded(ByteBuffer p0,int p1,int p2){
    }
    public void onAudioRouteChanged(int p0,int p1){
    }
    public void onAudioSceneStart(int p0){
    }
    public void onAudioSceneStop(int p0){
    }
    public void onAudioSubscribeStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onAudioVolumeIndication(RtcEngineAudioVolumeInfo[] p0,int p1){
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
    public void onDirectorMainSourceScaleLayout(RtcEngineExt$ScaleLayout p0){
    }
    public void onError(String p0,int p1){
    }
    public void onFileStreamPosition(String p0,long p1,long p2){
    }
    public void onFileStreamStatus(String p0,int p1){
    }
    public void onFileStreamVideoDecoded(String p0,RtcEngineVideoFrame p1){
    }
    public void onFirstLocalAudioFramePublished(int p0){
    }
    public void onFirstLocalVideoFrame(int p0,int p1,int p2){
    }
    public void onFirstLocalVideoFramePublished(int p0){
    }
    public void onFirstRemoteVideoFrame(String p0,String p1,int p2,int p3,int p4){
    }
    public void onHowlingDetected(){
    }
    public void onJoinChannelSuccess(String p0,String p1,int p2){
    }
    public void onLastmileQuality(int p0){
    }
    public void onLeaveChannel(ChannelSummaryInfo p0){
    }
    public void onLocalAudioMixingFinished(String p0,ArrayList p1){
    }
    public void onLocalAudioMixingProgress(String p0,ArrayList p1,float p2,float p3){
    }
    public void onLocalAudioMixingStateChanged(String p0,ArrayList p1,int p2,int p3){
    }
    public void onLocalAudioStateChanged(int p0,int p1){
    }
    public void onLocalAudioStats(KWAryaStats$KWAryaLocalAudioStats p0){
    }
    public void onLocalPublishFallbackToAudioOnly(String p0,boolean p1){
    }
    public void onLocalScreenCaptureStarted(String p0){
    }
    public void onLocalScreenCaptureStopped(String p0){
    }
    public void onLocalVideoStateChanged(int p0,int p1){
    }
    public void onLocalVideoStats(KWAryaStats$KWAryaLocalVideoStats p0){
    }
    public void onMediaProjectionStop(){
    }
    public void onMediaServerInfo(String p0,String p1,int p2,boolean p3){
    }
    public void onMixRemoteAndLocalAudioPcmData(ByteBuffer p0,int p1,int p2,long p3){
    }
    public void onNetworkQuality(String p0,String p1,int p2,int p3){
    }
    public void onNotifyWithChannelId(String p0,int p1){
    }
    public void onPlayAudioFinished(int p0,int p1){
    }
    public void onPlayAudioFinished(String p0,int p1){
    }
    public void onPlayAudioFinished(String p0,String p1,int p2){
    }
    public void onPlayAudioProgressed(String p0,String p1,float p2,float p3){
    }
    public void onPlayAudioStarted(String p0,String p1,long p2){
    }
    public void onReceiveStreamMessage(String p0,String p1,int p2,byte[] p3){
    }
    public void onRejoinChannelSuccess(String p0,String p1,int p2){
    }
    public void onRemoteAudioMixingProgressUpdate(String p0,int p1,int p2){
    }
    public void onRemoteAudioMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteAudioStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteAudioStats(KWAryaStats$KWAryaRemoteAudioStats p0){
    }
    public void onRemoteScreenCaptureStarted(String p0,String p1){
    }
    public void onRemoteScreenCaptureStopped(String p0,String p1){
    }
    public void onRemoteSubscribeFallbackToAudioOnly(String p0,String p1,boolean p2){
    }
    public void onRemoteVideoMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteVideoStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteVideoStats(KWAryaStats$KWAryaRemoteVideoStats p0){
    }
    public void onRtcStats(KWAryaStats$KWAryaRtcStats p0){
    }
    public void onRtmpStreamingStateChanged(String p0,String p1,int p2,int p3){
    }
    public void onScreenCaptureSizeChanged(String p0,int p1,int p2){
    }
    public void onScreenCastStop(){
    }
    public void onStreamMessageError(String p0,String p1,int p2,int p3){
    }
    public void onUserJoined(String p0,String p1,int p2){
    }
    public void onUserOffline(String p0,String p1,int p2){
    }
    public void onVideoMixTypeChanged(String p0,int p1,int p2){
    }
    public void onVideoPublishStateChanged(String p0,int p1,int p2,int p3){
    }
    public void onVideoRecordStateChanged(int p0,int p1,String p2){
    }
    public void onVideoSendParamChanged(int p0,int p1,int p2,boolean p3){
    }
    public void onVideoSizeChanged(String p0,int p1,int p2,int p3){
    }
    public void onVideoSubscribeStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onWarning(String p0,int p1){
    }
    public void onWebsocketClose(String p0,int p1){
    }
    public void onWebsocketFail(String p0,int p1){
    }
    public void onWebsocketOpen(){
    }
    public void onWebsocketReconnecting(){
    }
    public void onWebsocketRecvData(byte[] p0,int p1){
    }
    public void onWebsocketRecvMessage(String p0,int p1){
    }
}

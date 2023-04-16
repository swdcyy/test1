package com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import java.lang.Object;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.String;

public abstract class IMediaFrameObserver	// class@0007e1
{

    public void IMediaFrameObserver(){
       super();
    }
    public void onLocalAudioEncoded(ByteBuffer p0){
    }
    public void onLocalAudioPreEncoded(RtcEngineAudioFrame p0){
    }
    public void onLocalVideoAfterPreProcessed(RtcEngineVideoFrame p0){
    }
    public void onLocalVideoEncoded(ByteBuffer p0){
    }
    public void onLocalVideoPreEncoded(RtcEngineVideoFrame p0){
    }
    public void onRemoteAudioDecoded(String p0,String p1,RtcEngineAudioFrame p2){
    }
    public void onRemoteAudioPreDecoded(String p0,String p1,RtcEngineAudioFrame p2){
    }
    public void onRemoteScreenCaptureDecoded(String p0,String p1,RtcEngineVideoFrame p2){
    }
    public void onRemoteVideoDecoded(String p0,String p1,RtcEngineVideoFrame p2){
    }
    public void onRemoteVideoPreDecoded(String p0,String p1,ByteBuffer p2){
    }
}

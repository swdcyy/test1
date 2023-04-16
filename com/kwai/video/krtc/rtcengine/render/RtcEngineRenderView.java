package com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Listener;

public interface abstract RtcEngineRenderView	// class@0008a3
{

    void clear();
    void clear(float p0,float p1,float p2,float p3);
    RtcEngineRenderer getRenderer();
    void setBackColor(float p0,float p1,float p2,float p3);
    void setEnableGesture(boolean p0);
    void setGestureConfig(RtcEngineGesture$Config p0);
    void setGestureListener(RtcEngineGesture$Listener p0);
    void setMirrorMode(int p0);
    void setRedrawInfo(boolean p0,int p1);
    void setTranslateXY(float p0,float p1,float p2);
    void setVideoRenderAgedSrParams(int p0,float p1,float p2);
    void setVideoRenderHighQType(int p0);
    void setVideoRenderHighQType(int p0,float p1);
    void setVideoRenderQuality(int p0);
    void setVideoScaleMode(int p0);
}

package com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;

public interface abstract RtcEngineRenderer	// class@0008a4
{

    void clear();
    void clear(float p0,float p1,float p2,float p3);
    void renderFrame(RtcEngineVideoFrame p0);
    void renderLastFrame();
    void setBackColor(float p0,float p1,float p2,float p3);
    void setGesture(RtcEngineGesture p0);
    void setRedrawInfo(boolean p0,int p1);
    void setRenderMirrorMode(int p0);
    void setRenderQuality(int p0);
    void setRenderScaleMode(int p0);
    void setTranslateXY(float p0,float p1,float p2);
    void setVideoRenderAgedSrParams(int p0,float p1,float p2);
    void setVideoRenderHighQType(int p0);
    void setVideoRenderHighQType(int p0,float p1);
}

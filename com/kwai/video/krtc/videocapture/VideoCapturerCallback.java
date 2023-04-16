package com.kwai.video.krtc.videocapture.VideoCapturerCallback;
import java.lang.String;
import com.kwai.video.krtc.GL.TextureBuffer;

public interface abstract VideoCapturerCallback	// class@0008cc
{

    void onRawVideo(int p0,byte[] p1,int p2,int p3,long p4,int p5,int p6,String p7,boolean p8,boolean p9);
    void onRawVideo(TextureBuffer p0,String p1,boolean p2,boolean p3);
    void onScreencastStopped();
}

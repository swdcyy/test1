package com.kwai.video.krtc.rtcengine.VideoWatermark;
import java.nio.ByteBuffer;
import java.lang.Object;

public class VideoWatermark	// class@000846
{
    public int colorSpace;
    public int height;
    public boolean logoInRtc;
    public ByteBuffer rgba;
    public int width;
    public float x;
    public float y;

    public void VideoWatermark(ByteBuffer p0,int p1,int p2,float p3,float p4,int p5,boolean p6){
       super();
       this.rgba = p0;
       this.width = p1;
       this.height = p2;
       this.x = p3;
       this.y = p4;
       this.colorSpace = p5;
       this.logoInRtc = p6;
    }
}

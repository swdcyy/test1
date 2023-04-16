package com.kwai.video.krtc.rtcengine.RtcEngine$VideoInfo;
import java.lang.Object;

public class RtcEngine$VideoInfo	// class@0007ec
{
    public int height;
    public int rotation;
    public int width;

    public void RtcEngine$VideoInfo(){
       super();
       this.width = 544;
       this.height = 960;
       this.rotation = 0;
    }
    public void RtcEngine$VideoInfo(int p0,int p1,int p2){
       super();
       this.width = p0;
       this.height = p1;
       this.rotation = p2;
    }
    public boolean compare(int p0,int p1,int p2){
       boolean b = (this.width == p0 && (this.height != p1 || this.rotation != p2))? true: false;
       return b;
    }
}

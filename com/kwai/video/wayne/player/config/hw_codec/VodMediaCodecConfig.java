package com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class VodMediaCodecConfig	// class@000ccd
{
    public int mediaCodecAvcHeightLimit;
    public int mediaCodecAvcResolutionLimit;
    public int mediaCodecAvcWidthLimit;
    public int mediaCodecHevcHeightLimit;
    public int mediaCodecHevcResolutionLimit;
    public int mediaCodecHevcWidthLimit;
    public int mediaCodecMaxNum;
    public boolean supportAvcMediaCodec;
    public boolean supportHevcMediaCodec;
    public boolean useMediaCodecByteBuffer;

    public void VodMediaCodecConfig(){
       super();
    }
    public void VodMediaCodecConfig(boolean p0,boolean p1,int p2,int p3,boolean p4,int p5,int p6,int p7){
       super();
       this.useMediaCodecByteBuffer = p0;
       this.supportAvcMediaCodec = p1;
       this.mediaCodecAvcWidthLimit = p2;
       this.mediaCodecAvcHeightLimit = p3;
       this.supportHevcMediaCodec = p4;
       this.mediaCodecHevcWidthLimit = p5;
       this.mediaCodecHevcHeightLimit = p6;
       this.mediaCodecMaxNum = p7;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VodMediaCodecConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "useMediaCodecByteBuffer "+this.useMediaCodecByteBuffer+" supportAvcMediaCodec "+this.supportAvcMediaCodec+" mediaCodecAvcWidthLimit "+this.mediaCodecAvcWidthLimit+" mediaCodecAvcHeightLimit "+this.mediaCodecAvcHeightLimit+" supportHevcMediaCodec "+this.supportHevcMediaCodec+" mediaCodecHevcWidthLimit "+this.mediaCodecHevcWidthLimit+" mediaCodecHevcHeightLimit "+this.mediaCodecHevcHeightLimit+" mediaCodecMaxNum "+this.mediaCodecMaxNum;
    }
}

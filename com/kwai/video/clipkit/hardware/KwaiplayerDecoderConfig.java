package com.kwai.video.clipkit.hardware.KwaiplayerDecoderConfig;
import java.lang.Object;

public class KwaiplayerDecoderConfig	// class@001a87
{
    public int mediaCodecAvcHeightLimit;
    public int mediaCodecAvcWidthLimit;
    public int mediaCodecHevcHeightLimit;
    public int mediaCodecHevcWidthLimit;
    public int mediaCodecMaxNum;
    public boolean supportAvcMediaCodec;
    public boolean supportHevcMediaCodec;
    public boolean useMediaCodecByteBuffer;

    public void KwaiplayerDecoderConfig(){
       super();
       this.supportAvcMediaCodec = false;
       this.supportHevcMediaCodec = false;
       this.mediaCodecAvcWidthLimit = 0;
       this.mediaCodecAvcHeightLimit = 0;
       this.mediaCodecHevcWidthLimit = 0;
       this.mediaCodecHevcHeightLimit = 0;
       this.mediaCodecMaxNum = 0;
       this.useMediaCodecByteBuffer = false;
    }
}

package com.kwai.video.clipkit.ClipImportHandler$TranscodeParams;
import java.lang.Object;

public class ClipImportHandler$TranscodeParams	// class@001a2c
{
    public int alignmentFlag;
    public long audioBitrate;
    public int audioCutOff;
    public String audioProfile;
    public boolean forceMediaCodecBaseline;
    public int fps;
    public int height;
    public float minEncodeSpeed;
    public int minProfile;
    public boolean supportHwEncode;
    public List targetBitrate;
    public EditorSdk2V2$TimeRangeV2 timeRange;
    public long videoBitrate;
    public int videoGopSize;
    public Minecraft$WesterosFaceMagicParam westerosFaceMagicParam;
    public int width;
    public String x264Params;
    public String x264Preset;

    public void ClipImportHandler$TranscodeParams(){
       super();
       this.videoGopSize = 250;
       this.videoBitrate = 0x7a1200;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.minEncodeSpeed = 0x3f000000;
       this.minProfile = 0;
       this.alignmentFlag = 2;
       this.forceMediaCodecBaseline = false;
    }
}

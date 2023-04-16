package com.kwai.video.clipkit.config.EditorEncodeConfig$MVTranscodeParams;
import java.lang.Object;

public class EditorEncodeConfig$MVTranscodeParams	// class@001a68
{
    public int alignmentFlag;
    public long audioBitrate;
    public int audioCutOff;
    public String audioProfile;
    public List fallBackImportTranscodeConditions;
    public int height;
    public List importTranscodeConditions;
    public float minEncodeSpeed;
    public int minProfile;
    public long multiMaxResolution;
    public boolean supportHwEncode;
    public long videoBitrate;
    public int videoGopSize;
    public int width;
    public String x264Params;
    public String x264Preset;

    public void EditorEncodeConfig$MVTranscodeParams(){
       super();
       this.x264Preset = "ultrafast";
       this.videoGopSize = 250;
       this.videoBitrate = 0x7a1200;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.minEncodeSpeed = 0x3f000000;
       this.minProfile = 0;
       this.alignmentFlag = 2;
    }
}

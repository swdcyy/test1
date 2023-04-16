package com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import java.lang.Object;
import java.lang.String;

public class EditorEncodeConfigModule$ImportParam	// class@001a74
{
    public int alignmentFlag;
    public long audioBitrate;
    public int audioCutOff;
    public String audioProfile;
    public boolean disableSkipDialog;
    public boolean forceMediaCodecBaseline;
    public int fps;
    public int height;
    public List importTranscodeConditions;
    public int maxImportHeight;
    public int maxImportWidth;
    public float minEncodeSpeed;
    public int minProfile;
    public boolean supportHwEncode;
    public int supportImportSwDecode;
    public boolean supportPipleline;
    public List targetBitrate;
    public int version;
    public long videoBitrate;
    public int videoGopSize;
    public int width;
    public String x264Params;
    public String x264Preset;

    public void EditorEncodeConfigModule$ImportParam(){
       super();
       this.videoGopSize = 250;
       this.videoBitrate = 0xa7d8c0;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.supportPipleline = false;
       this.minEncodeSpeed = 0x3f000000;
       this.forceMediaCodecBaseline = false;
       this.minProfile = 0;
       this.alignmentFlag = 2;
       this.maxImportWidth = 0;
       this.maxImportHeight = 0;
       this.supportImportSwDecode = 0;
       this.version = 1;
       this.disableSkipDialog = false;
    }
    public void EditorEncodeConfigModule$ImportParam(int p0,int p1,int p2,int p3,String p4,String p5){
       super();
       this.videoGopSize = 250;
       this.videoBitrate = 0xa7d8c0;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.supportPipleline = false;
       this.minEncodeSpeed = 0x3f000000;
       this.forceMediaCodecBaseline = false;
       this.minProfile = 0;
       this.alignmentFlag = 2;
       this.maxImportWidth = 0;
       this.maxImportHeight = 0;
       this.supportImportSwDecode = 0;
       this.version = 1;
       this.disableSkipDialog = false;
       this.width = p0;
       this.height = p1;
       this.maxImportWidth = p2;
       this.maxImportHeight = p3;
       this.x264Params = p4;
       this.x264Preset = p5;
    }
    public void EditorEncodeConfigModule$ImportParam(int p0,int p1,String p2,String p3){
       super();
       this.videoGopSize = 250;
       this.videoBitrate = 0xa7d8c0;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.supportPipleline = false;
       this.minEncodeSpeed = 0x3f000000;
       this.forceMediaCodecBaseline = false;
       this.minProfile = 0;
       this.alignmentFlag = 2;
       this.maxImportWidth = 0;
       this.maxImportHeight = 0;
       this.supportImportSwDecode = 0;
       this.version = 1;
       this.disableSkipDialog = false;
       this.width = p0;
       this.height = p1;
       this.x264Params = p2;
       this.x264Preset = p3;
    }
    public boolean supportImportSw(){
       boolean b = (this.supportImportSwDecode > null)? true: false;
       return b;
    }
}

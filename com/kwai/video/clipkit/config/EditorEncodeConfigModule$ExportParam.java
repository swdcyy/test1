package com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import java.lang.Object;
import com.kwai.video.clipkit.cape.CapeExportParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class EditorEncodeConfigModule$ExportParam	// class@001a72
{
    public int alignmentFlag;
    public long audioBitrate;
    public int audioCutOff;
    public String audioProfile;
    public long capeMinHwBitrate;
    public long capeMinSwBitrate;
    public int capeModelIndex;
    public int height;
    public boolean isSupportPipleline;
    public float minEncodeSpeed;
    public int minProfile;
    public int singleImageQuality;
    public boolean supportHwEncode;
    public int useUploadDecision;
    public long videoBitrate;
    public int videoGopSize;
    public int width;
    public String x264Params;
    public String x264ParamsPipeline;
    public String x264ParamsReuse2;
    public String x264Preset;

    public void EditorEncodeConfigModule$ExportParam(){
       super();
       this.x264Preset = "ultrafast";
       this.isSupportPipleline = false;
       this.videoGopSize = 250;
       this.videoBitrate = 0x7a1200;
       this.audioProfile = "aac_he";
       this.audioBitrate = 0x17700;
       this.audioCutOff = 0x4e20;
       this.supportHwEncode = false;
       this.minEncodeSpeed = 0x3f000000;
       this.minProfile = 0;
       this.alignmentFlag = 2;
       this.singleImageQuality = 90;
       this.capeModelIndex = -1;
       this.capeMinSwBitrate = 0;
       this.capeMinHwBitrate = 0;
       this.useUploadDecision = 0;
    }
    public CapeExportParams getCapeExportParams(){
       CapeExportParams obj = PatchProxy.apply(null, this, EditorEncodeConfigModule$ExportParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CapeExportParams();
       obj.capeModelIndex = this.capeModelIndex;
       obj.minHwBitrate = this.capeMinHwBitrate;
       obj.minSwBitrate = this.capeMinSwBitrate;
       obj.useUploadDecision = this.useUploadDecision;
       return obj;
    }
}

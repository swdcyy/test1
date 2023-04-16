package com.kwai.video.clipkit.config.SkipTranscodeConfig;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SkipTranscodeConfig	// class@001a7c
{
    public boolean allowTrackSizeExceedsProject;
    public boolean enableUploadDecision;
    public boolean enabled;
    public int maxAvgVideoBitrate;
    public int maxBytes;
    public int maxBytes4G;
    public int maxBytesWifi;
    public boolean supportAdvancedColorspace;
    public int uploadDecisionMaxBytes;

    public void SkipTranscodeConfig(){
       super();
    }
    public EditorSdk2$ProtoSkipTranscodeConfig convertToProtoSkipTranscodeConfig(){
       EditorSdk2$ProtoSkipTranscodeConfig obj = PatchProxy.apply(null, this, SkipTranscodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2$ProtoSkipTranscodeConfig();
       obj.setEnabled(this.enabled);
       obj.setSupportAdvancedColorspace(this.supportAdvancedColorspace);
       obj.setMaxBytes(this.maxBytes);
       obj.setEnableUploadDecision(this.enableUploadDecision);
       obj.setUploadDecisionMaxBytes(this.uploadDecisionMaxBytes);
       obj.setMaxAvgVideoBitrate(this.maxAvgVideoBitrate);
       obj.setAllowTrackSizeExceedsProject(this.allowTrackSizeExceedsProject);
       obj.setMaxBytesWifi(this.maxBytesWifi);
       obj.setMaxBytes4G(this.maxBytes4G);
       return obj;
    }
}

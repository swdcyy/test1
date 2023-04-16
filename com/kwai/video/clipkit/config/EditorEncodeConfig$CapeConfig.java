package com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SimpleDecisionParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class EditorEncodeConfig$CapeConfig	// class@001a63
{
    public int bizType;
    public int capeFeature;
    public double hwExportSpeed;
    public long hwLowResRate;
    public double lowFpsRate;
    public boolean openEncodeAnalyze;
    public boolean openUploadDecision;
    public EditorEncodeConfig$SimpleDecisionParams simpleDecisionParams;
    public double swExportSpeed;
    public long swLowResRate;
    public long uploadDecisionMaxBytes;
    public int uploadDecisionMethod;

    public void EditorEncodeConfig$CapeConfig(){
       super();
       this.uploadDecisionMaxBytes = 0;
       this.openEncodeAnalyze = false;
       this.openUploadDecision = false;
       this.bizType = -1;
       this.capeFeature = 0;
       this.uploadDecisionMethod = 0;
       this.simpleDecisionParams = new EditorEncodeConfig$SimpleDecisionParams();
       this.hwExportSpeed = 0;
       this.swExportSpeed = 0;
       this.swLowResRate = 0;
       this.hwLowResRate = 0;
       this.lowFpsRate = 0;
    }
    public EditorEncodeConfig$CapeConfig copy(){
       EditorEncodeConfig$CapeConfig obj = PatchProxy.apply(null, this, EditorEncodeConfig$CapeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorEncodeConfig$CapeConfig();
       obj.uploadDecisionMaxBytes = this.uploadDecisionMaxBytes;
       obj.openEncodeAnalyze = this.openEncodeAnalyze;
       obj.openUploadDecision = this.openUploadDecision;
       obj.bizType = this.bizType;
       obj.capeFeature = this.capeFeature;
       obj.uploadDecisionMethod = this.uploadDecisionMethod;
       obj.simpleDecisionParams = this.simpleDecisionParams;
       obj.hwExportSpeed = this.hwExportSpeed;
       obj.swExportSpeed = this.swExportSpeed;
       obj.swLowResRate = this.swLowResRate;
       obj.hwLowResRate = this.hwLowResRate;
       obj.lowFpsRate = this.lowFpsRate;
       return obj;
    }
    public boolean enableCape(){
       boolean b = (this.openEncodeAnalyze != null || this.openUploadDecision != null)? true: false;
       return b;
    }
}

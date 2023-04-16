package com.kwai.video.clipkit.cape.CapeDefaultHandler;
import com.kwai.video.clipkit.cape.CapeHandlerInterface;
import java.lang.Object;
import java.util.Map;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.cape.CapeTaskParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import com.kwai.video.clipkit.cape.CapeExportParams;
import java.lang.String;

public class CapeDefaultHandler implements CapeHandlerInterface	// class@001a57
{

    public void CapeDefaultHandler(){
       super();
    }
    public Map getCAPEStatsUnit(){
       return null;
    }
    public EditorSdk2$ExportOptions getOutputExportOptions(){
       return null;
    }
    public boolean isEnableEncodeAnalyze(){
       return false;
    }
    public boolean isEnableUploadDecision(){
       return false;
    }
    public int run(CapeTaskParams p0){
       return -1;
    }
    public void setCapeConfig(EditorEncodeConfig$CapeConfig p0){
    }
    public void setCapeExportParams(CapeExportParams p0){
    }
    public void setCapeSessionId(String p0){
    }
    public void setEnableHwEncode(boolean p0){
    }
    public boolean shouldSkipTranscode(){
       return false;
    }
}

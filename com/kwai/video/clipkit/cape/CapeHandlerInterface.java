package com.kwai.video.clipkit.cape.CapeHandlerInterface;
import java.util.Map;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.cape.CapeTaskParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import com.kwai.video.clipkit.cape.CapeExportParams;
import java.lang.String;

public interface abstract CapeHandlerInterface	// class@001a59
{

    Map getCAPEStatsUnit();
    EditorSdk2$ExportOptions getOutputExportOptions();
    boolean isEnableEncodeAnalyze();
    boolean isEnableUploadDecision();
    int run(CapeTaskParams p0);
    void setCapeConfig(EditorEncodeConfig$CapeConfig p0);
    void setCapeExportParams(CapeExportParams p0);
    void setCapeSessionId(String p0);
    void setEnableHwEncode(boolean p0);
    boolean shouldSkipTranscode();
}

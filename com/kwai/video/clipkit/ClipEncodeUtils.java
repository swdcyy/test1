package com.kwai.video.clipkit.ClipEncodeUtils;
import java.lang.Object;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import android.util.Pair;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Math;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import com.kwai.video.clipkit.config.SkipTranscodeConfig;

public class ClipEncodeUtils	// class@001a04
{

    public void ClipEncodeUtils(){
       super();
    }
    public static EditorSdk2$ExportOptions getExportOptions(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2,String p3){
       EditorSdk2$ExportOptions obj;
       Pair exportSize;
       if (PatchProxy.isSupport(ClipEncodeUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, ClipEncodeUtils.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          KSClipLog.d("ClipEncodeUtils", "project is null");
          return null;
       }else {
          obj = EditorSdk2Utils.createDefaultExportOptions();
          EditorEncodeConfigModule editorEncode = EditorEncodeConfigManager.getInstance().getEditorEncodeConfigModule(p0, p1, p2);
          if (editorEncode != null) {
             EditorEncodeConfigModule exportParam = editorEncode.exportParam;
             if (exportParam != null) {
                EditorEncodeConfigModule$ExportParam isSupportPip = exportParam.isSupportPipleline;
                EditorEncodeConfigModule$ExportParam x264ParamsPi = exportParam.x264ParamsPipeline;
                int i = (x264ParamsPi != null)? 1: 0;
                if (isSupportPip & i) {
                   obj.setX264Params(x264ParamsPi);
                }else {
                   isSupportPip = exportParam.x264Params;
                   if (isSupportPip != null) {
                      obj.setX264Params(isSupportPip);
                   }
                }
                isSupportPip = exportParam.x264Preset;
                if (isSupportPip != null) {
                   obj.setX264Preset(isSupportPip);
                }
                isSupportPip = exportParam.height;
                if (isSupportPip > null) {
                   x264ParamsPi = exportParam.width;
                   if (x264ParamsPi > null) {
                      exportSize = ClipKitUtils.getExportSize(p1, x264ParamsPi, isSupportPip, p2);
                      obj.setWidth(exportSize.first.intValue());
                      obj.setHeight(exportSize.second.intValue());
                   }
                }
                obj.setSingleImageQuality(exportParam.singleImageQuality);
                if (exportParam.supportHwEncode != null) {
                   exportSize = (obj.width() > 0)? obj.width(): EditorSdk2UtilsV2.getComputedWidth(p1);
                   int i1 = (obj.height() > 0)? obj.height(): EditorSdk2UtilsV2.getComputedHeight(p1);
                   if (Math.max(exportSize, i1) > 0) {
                      obj.setVideoGopSize(exportParam.videoGopSize);
                      obj.setVideoBitrate(exportParam.videoBitrate);
                      if (exportParam.supportHwEncode != null) {
                         obj.setVideoEncoderType(5);
                      }
                   }
                }
             label_00bc :
                obj.setAudioBitrate(exportParam.audioBitrate);
                obj.setAudioCutoff(exportParam.audioCutOff);
                obj.setAudioProfile(exportParam.audioProfile);
             }
             obj.setSkipTranscodeConfig(editorEncode.skipTranscodeConfig.convertToProtoSkipTranscodeConfig());
          }
          obj.setComment(p3);
          return obj;
       }
    }
}

package com.kwai.video.clipkit.config.EditorEncodeConfig;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVTranscodeParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import java.util.Iterator;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.config.SkipTranscodeConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVImportParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$FallBackCondition;

public class EditorEncodeConfig	// class@001a6c
{
    public boolean allowTrackSizeExceedsProject;
    public List audioEncodeConfig;
    public EditorEncodeConfig$CapeConfig capeConfig;
    public boolean enableComment;
    public int enableSkipVideoTranscode;
    public int exportVersion;
    public EditorEncodeConfigModule highConfig;
    public List localExportConditions;
    public List localVideoEncodeConfig;
    public EditorEncodeConfigModule lowConfig;
    public EditorEncodeConfig$MVImportParams mvImportParams;
    public EditorEncodeConfigModule normalConfig;
    public EditorEncodeConfig$SupportAICutConditions supportAICutConditions;
    public EditorEncodeConfig$SupportHighEncodeConfig supportHighEncodeConfig;

    public void EditorEncodeConfig(){
       super();
       this.enableComment = false;
       this.buildNormalConfig();
    }
    public static EditorEncodeConfig$MVTranscodeParams getMVImportParamsWithType(int p0){
       EditorEncodeConfig$MVTranscodeParams obj;
       EditorEncodeConfig uEditorEncod = EditorEncodeConfig.class;
       if (PatchProxy.isSupport(uEditorEncod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uEditorEncod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EditorEncodeConfig$MVTranscodeParams();
       Iterator iterator = EditorEncodeConfig$LocalVideoEncodeConfig.defaultVideoEncodeConfigs().iterator();
       while (iterator.hasNext()) {
          EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn = iterator.next();
          if (localVideoEn.type == p0) {
             obj.width = localVideoEn.width;
             obj.height = localVideoEn.height;
             obj.x264Params = localVideoEn.x264params;
             obj.x264Preset = "ultrafast";
             obj.videoBitrate = (long)localVideoEn.videoBitrate;
             obj.videoGopSize = localVideoEn.videoGopSize;
             break ;
          }
       }
       return obj;
    }
    public void buildNormalConfig(){
       if (PatchProxy.applyVoid(null, this, EditorEncodeConfig.class, "3")) {
          return;
       }
       EditorEncodeConfigModule uEditorEncod = new EditorEncodeConfigModule();
       this.normalConfig = uEditorEncod;
       uEditorEncod.skipTranscodeConfig = new SkipTranscodeConfig();
       EditorEncodeConfig tnormalConfi = this.normalConfig;
       EditorEncodeConfigModule skipTranscod = tnormalConfi.skipTranscodeConfig;
       skipTranscod.enabled = true;
       skipTranscod.supportAdvancedColorspace = false;
       skipTranscod.maxBytes = 0x1312d00;
       tnormalConfi.exportVideoParams = new EditorEncodeConfigModule$ExportParam();
       tnormalConfi = this.normalConfig;
       skipTranscod = tnormalConfi.exportVideoParams;
       skipTranscod.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=18:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       skipTranscod.x264Preset = "veryfast";
       skipTranscod.x264ParamsPipeline = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=18:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=0:ipratio=1.4:qcomp=0.6:keyint=150:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       skipTranscod.width = 720;
       skipTranscod.height = 1280;
       skipTranscod.videoBitrate = 0x7a1200;
       tnormalConfi.exportPhotoMovieParams = new EditorEncodeConfigModule$ExportParam();
       tnormalConfi = this.normalConfig;
       skipTranscod = tnormalConfi.exportPhotoMovieParams;
       skipTranscod.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       skipTranscod.x264Preset = "veryfast";
       skipTranscod.width = 720;
       skipTranscod.height = 1280;
       tnormalConfi.exportWatermarkParams = new EditorEncodeConfigModule$ExportParam();
       tnormalConfi = this.normalConfig;
       skipTranscod = tnormalConfi.exportWatermarkParams;
       skipTranscod.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2: trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0: vbv_maxrate=8000:vbv_bufsize=16000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       skipTranscod.x264Preset = "ultrafast";
       skipTranscod.width = 720;
       skipTranscod.height = 1280;
       skipTranscod.videoBitrate = 0xa7d8c0;
       tnormalConfi.exportMvParams = new EditorEncodeConfigModule$ExportParam();
       tnormalConfi = this.normalConfig;
       skipTranscod = tnormalConfi.exportMvParams;
       skipTranscod.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=3500:vbv_bufsize=7000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       skipTranscod.x264Preset = "ultrafast";
       tnormalConfi.exportSinglePictureParams = new EditorEncodeConfigModule$ExportParam();
       uEditorEncod = this.normalConfig.exportSinglePictureParams;
       uEditorEncod.x264Params = "crf=15:vbv_maxrate=20000:vbv_bufsize=40000:threads=6:keyint=3";
       uEditorEncod.x264Preset = "veryfast";
       return;
    }
    public boolean getEnableComment(){
       return this.enableComment;
    }
    public EditorEncodeConfig$MVImportParams getMVImportParams(){
       EditorEncodeConfig$MVImportParams obj = PatchProxy.apply(null, this, EditorEncodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mvImportParams == null) {
          obj = new EditorEncodeConfig$MVImportParams();
          this.mvImportParams = obj;
          obj.fallbackCondition = new EditorEncodeConfig$FallBackCondition();
          EditorEncodeConfig tmvImportPar = this.mvImportParams;
          EditorEncodeConfig$MVImportParams mVImportPara = tmvImportPar.fallbackCondition;
          mVImportPara.minScreenWidth = 720;
          mVImportPara.minScreenHeight = 1280;
          mVImportPara.minAvgFps = 20;
          mVImportPara.maxStutterPerSecond = 0x3fb999999999999a;
          mVImportPara.maxProcessMemorySizeKb = 0x4118dbf000000000;
          mVImportPara.maxProcessCpuUsage = 56.00f;
          mVImportPara.supportNetWork = 15.00f;
          tmvImportPar.transcode576p = EditorEncodeConfig.getMVImportParamsWithType(1);
          this.mvImportParams.transcode720p = EditorEncodeConfig.getMVImportParamsWithType(3);
          this.mvImportParams.transcode1080p = EditorEncodeConfig.getMVImportParamsWithType(5);
       }
       return this.mvImportParams;
    }
}

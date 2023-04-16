package com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import java.util.Iterator;

public class EditorEncodeConfigModule	// class@001a76
{
    public EditorEncodeConfigModule$ExportParam exportMvParams;
    public EditorEncodeConfigModule$ExportParam exportParam;
    public EditorEncodeConfigModule$ExportParam exportPhotoMovieParams;
    public EditorEncodeConfigModule$ExportParam exportSinglePictureParams;
    public EditorEncodeConfigModule$ExportParam exportVideoParams;
    public EditorEncodeConfigModule$ExportParam exportWatermarkParams;
    public EditorEncodeConfigModule$ImportParam importAICutTransParams;
    public EditorEncodeConfigModule$ImportParam importParams;
    public SkipTranscodeConfig skipTranscodeConfig;

    public void EditorEncodeConfigModule(){
       super();
    }
    public static EditorEncodeConfigModule$ImportParam getImportAICutTransParamsWithType(int p0){
       EditorEncodeConfigModule$ImportParam obj;
       EditorEncodeConfigModule uEditorEncod = EditorEncodeConfigModule.class;
       if (PatchProxy.isSupport(uEditorEncod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uEditorEncod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EditorEncodeConfigModule$ImportParam();
       obj.x264Preset = "ultrafast";
       obj.videoGopSize = 250;
       boolean b = true;
       obj.supportHwEncode = b;
       obj.minProfile = b;
       if (!p0) {
          obj.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=6000:vbv_bufsize=12000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
          obj.width = 576;
          obj.height = 1024;
          obj.videoBitrate = 0x7a1200;
          obj.maxImportWidth = 576;
          obj.maxImportHeight = 1024;
       }else {
          obj.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=12000:vbv_bufsize=24000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
          obj.width = 720;
          obj.height = 1280;
          obj.videoBitrate = 0xb71b00;
          obj.maxImportWidth = 720;
          obj.maxImportHeight = 1280;
       }
       return obj;
    }
    public static EditorEncodeConfigModule$ImportParam getImportParamWithType(int p0){
       Object obj;
       EditorEncodeConfigModule uEditorEncod = EditorEncodeConfigModule.class;
       if (PatchProxy.isSupport(uEditorEncod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uEditorEncod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = 0;
       EditorEncodeConfigModule$ImportParam importParam = new EditorEncodeConfigModule$ImportParam();
       Iterator iterator = EditorEncodeConfig$LocalVideoEncodeConfig.defaultVideoEncodeConfigs().iterator();
       while (true) {
          if (iterator.hasNext()) {
             EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn = iterator.next();
             if (localVideoEn.type == p0) {
                importParam.width = localVideoEn.width;
                importParam.height = localVideoEn.height;
                importParam.x264Params = localVideoEn.x264params;
                importParam.videoBitrate = (long)localVideoEn.videoBitrate;
                importParam.videoGopSize = localVideoEn.videoGopSize;
                obj = 1;
             }
          }
          if (!obj) {
             importParam.x264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=8000:vbv_bufsize=16000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
             importParam.x264Preset = "veryfast";
             importParam.width = 720;
             importParam.height = 1280;
             break ;
          }
          break ;
       }
       return importParam;
    }
    public EditorEncodeConfigModule$ImportParam getImportAICutTransParams(){
       return this.importAICutTransParams;
    }
    public EditorEncodeConfigModule$ImportParam getImportParams(){
       return this.importParams;
    }
    public void setImportParams(EditorEncodeConfigModule$ImportParam p0){
       this.importParams = p0;
    }
}

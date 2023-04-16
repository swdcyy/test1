package com.yxcorp.gifshow.video.b;
import exc.h;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.c$d;
import com.kwai.robust.PatchProxyResult;
import mca.a;
import com.yxcorp.gifshow.video.b$b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.yxcorp.gifshow.video.EditorSdk2InternalErrorExceptionWrapper;
import java.lang.Exception;
import com.yxcorp.gifshow.video.c$e;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import android.util.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.video.b$c;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.util.List;
import brd.t;
import java.lang.Float;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import java.lang.Double;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.lang.Throwable;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import q46.l;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import java.lang.Number;
import cj9.b;
import com.yxcorp.gifshow.media.util.g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.yxcorp.gifshow.video.a;
import io.reactivex.g;
import com.kwai.video.editorsdk2.VideoEditorSession;
import q6b.d$b;
import q6b.d;
import java.io.IOException;

public class b implements h	// class@001690
{
    public static String b = "ExportTaskPlugin";

    public void b(){
       super();
    }
    public static void m70(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "6")) {
          return;
       }
       p0.release();
       return;
    }
    public c$d Id(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.u();
          return new b$b(this, EditorSdk2Utils.createDefaultExportOptions());
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          throw new EditorSdk2InternalErrorExceptionWrapper(e0.getMessage());
       }
    }
    public c$e JW(String p0,String p1,boolean p2,c$d p3){
       Pair obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, b.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          a.u();
          EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(p0);
          obj = EditorSdk2UtilsV2.getExportSize(videoEditorP, p3.getWidth(), p3.getHeight());
          p3.r(obj.first.intValue());
          p3.u(obj.second.intValue());
          p3.b(p2);
          return new b$c(new ExportTaskNoQueueing(a.b(), videoEditorP, p1, p3.a));
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e9){
       }catch(java.io.IOException e9){
       }
       throw new EditorSdk2InternalErrorExceptionWrapper(e9.getMessage());
    }
    public t NB(List p0,String p1,String p2,float p3){
       Object[] obj1;
       int this;
       EditorSdk2V2$VideoEditorProject videoEditorP;
       int height;
       Pair pair;
       int i2;
       String str3;
       EditorSdk2$ExportOptions obj = p0;
       String str = p1;
       String str1 = p2;
       if (PatchProxy.isSupport(b.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, p1, p2, Float.valueOf(p3), this, b.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.u();
       EditorSdkLogger.d(b.b, "buildAtlasFile\(\) called with: pictures = ["+obj+"], musicFilePath = ["+str+"], outputFile = ["+str1+"]");
       double d = 0;
       double d1 = (p0.size() == 1)? 4.00f: (double)p3;
       this = 2;
       int i = 5;
       int i1 = 0;
       Object obj2 = null;
       if (PatchProxy.isSupport(b.class)) {
          obj1 = new Object[i];
          obj1[i1] = obj;
          obj1[1] = str;
          obj1[this] = Double.valueOf(d);
          obj1[3] = Double.valueOf(d1);
          obj1[4] = Boolean.TRUE;
          videoEditorP = PatchProxy.apply(obj1, obj2, b.class, "7");
          if (videoEditorP != PatchProxyResult.class) {
          label_017c :
             PhotoMovieEncodeConfig photoMovieEn = l.e();
             int width = photoMovieEn.getWidth();
             height = photoMovieEn.getHeight();
             if (PatchProxy.isSupport(b.class)) {
                pair = PatchProxy.applyThreeRefs(videoEditorP, Integer.valueOf(width), Integer.valueOf(height), null, b.class, "2");
                if (pair != PatchProxyResult.class) {
                label_0226 :
                   obj = g.c(b.c(), pair);
                   t ot = PatchProxy.applyThreeRefs(videoEditorP, obj, p2, null, b.class, "5");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      obj.setVideoFrameRate(EditorSdk2Utils.createRational(20, 1));
                      ot = t.create(new a(obj, videoEditorP, str1));
                   }
                   return ot;
                }
             }
             Object obj3 = PatchProxy.applyOneRefs(videoEditorP, null, b.class, "3");
             if (obj3 != PatchProxyResult.class) {
                i2 = obj3.intValue();
             }else if(videoEditorP.projectOutputWidth() > 0){
                i2 = videoEditorP.projectOutputWidth();
             }else {
                i2 = EditorSdk2UtilsV2.getComputedWidth(videoEditorP);
             }
             videoEditorP.setProjectOutputWidth(i2);
             obj3 = PatchProxy.applyOneRefs(videoEditorP, null, b.class, "4");
             if (obj3 != PatchProxyResult.class) {
                i2 = obj3.intValue();
             }else if(videoEditorP.projectOutputHeight() > 0){
                i2 = videoEditorP.projectOutputHeight();
             }else {
                i2 = EditorSdk2UtilsV2.getComputedHeight(videoEditorP);
             }
             videoEditorP.setProjectOutputHeight(i2);
             EditorSdkLogger.i(b.b, "getExportSizeForceSetProjectOutputDimension maxWidth:"+width+",maxHeight:"+height+",project.projectOutputWidth\(\):"+videoEditorP.projectOutputWidth()+",project.projectOutputHeight\(\):"+videoEditorP.projectOutputHeight());
             pair = EditorSdk2UtilsV2.getExportSize(videoEditorP, width, height);
             goto label_0226 ;
          }
       }
       a.u();
       EditorSdk2V2$VideoEditorProject videoEditorP1 = new EditorSdk2V2$VideoEditorProject();
       int i3 = p0.size();
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[i3];
       videoEditorP1.setTrackAssets(trackAssetAr);
       videoEditorP1.setIsKwaiPhotoMovie(1);
       height = 0;
       while (height < i3) {
          String str2 = obj.get(height);
          if (PatchProxy.isSupport(b.class)) {
             Object[] objArray = new Object[i];
             objArray[i1] = Integer.valueOf(height);
             objArray[1] = str2;
             objArray[this] = videoEditorP1;
             objArray[3] = Double.valueOf(0);
             objArray[4] = Double.valueOf(d1);
             if (!PatchProxy.applyVoid(objArray, null, b.class, "9")) {
             label_00dd :
                Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
                Minecraft$RationalV2 rationalV2 = EditorSdk2Utils.createRationalV2(20, 1);
                try{
                   inputFileOpt.setFrameRate(rationalV2);
                   EditorSdkLogger.i(b.b, "processSinglePhoto index: "+height+" path:"+str2);
                   EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(str2, null, inputFileOpt);
                   try{
                      str3 = 0;
                      trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(str3, d1));
                      videoEditorP1.trackAssetsSetItem(height, trackAsset);
                   }catch(java.lang.Exception e0){
                   }
                   EditorSdkLogger.e(b.b, "processSinglePhoto exception: "+e0);
                }catch(java.lang.Exception e0){
                   str3 = null;
                   goto label_0120 ;
                }
             }
          }else {
             goto label_00dd ;
          }
          height = height + 1;
          this = 2;
          i = 5;
          i1 = 0;
       }
       if (!TextUtils.x(p1) && !PatchProxy.applyVoidTwoRefs(str, videoEditorP1, null, b.class, "8")) {
          EditorSdkLogger.i(b.b, "processPhotoAudio: "+str);
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[1];
          videoEditorP1.setAudioAssets(uAudioAssetA);
          try{
             uAudioAssetA = 0x3ff0000000000000;
             videoEditorP1.audioAssetsSetItem(0, EditorSdk2UtilsV2.openAudioAsset(str, uAudioAssetA, 1));
          }catch(java.io.IOException e0){
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          }
          EditorSdkLogger.e(b.b, "processPhotoAudio: ", e0);
       }
       videoEditorP = videoEditorP1;
       goto label_017c ;
    }
    public c$e cB(Context p0,List p1,String p2){
       String[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.u();
          obj = new String[p1.size()];
          EditorSdk2V2$VideoEditorProject videoEditorP = a.a(p1.toArray(obj));
          if (!videoEditorP.trackAssetsSize()) {
             throw new IOException("Not expected empty trackAssets");
          }
          for (int i = 0; i < videoEditorP.trackAssetsSize(); i = i + 1) {
             videoEditorP.trackAssets(i).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 3.00f));
          }
          videoEditorP = EditorSdk2UtilsV2.loadProject(videoEditorP);
          VideoEditorSession videoEditorS = new VideoEditorSession();
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          uExportOptio.setVideoEncoderType(5);
          uExportOptio.setVideoFrameRate(EditorSdk2Utils.createRational(30, 1));
          uExportOptio.setX264Params(d.a().a().getX264Params());
          uExportOptio.setWidth(EditorSdk2UtilsV2.getComputedWidth(videoEditorP));
          uExportOptio.setHeight(EditorSdk2UtilsV2.getComputedHeight(videoEditorP));
          ExportTask uExportTask = videoEditorS.createExportTask(p0, videoEditorP, p2, uExportOptio);
          return new b$c(uExportTask, videoEditorS);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e7){
       }catch(java.io.IOException e7){
       }
       throw new EditorSdk2InternalErrorExceptionWrapper(e7);
    }
    public boolean isAvailable(){
       return true;
    }
    public c$e q10(String p0,String p1,c$d p2){
       EditorSdk2V2$VideoEditorProject this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.u();
          this = EditorSdk2UtilsV2.createProjectWithFile(p0);
          Pair exportSize = EditorSdk2UtilsV2.getExportSize(this, p2.getWidth(), p2.getHeight());
          p2.r(exportSize.first.intValue());
          p2.u(exportSize.second.intValue());
          ExportTask uExportTask = new ExportTask(a.b(), this, p1, p2.a, 0, false);
          return new b$c(obj);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e10){
       }catch(java.io.IOException e10){
       }
       throw new EditorSdk2InternalErrorExceptionWrapper(e10.getMessage());
    }
}

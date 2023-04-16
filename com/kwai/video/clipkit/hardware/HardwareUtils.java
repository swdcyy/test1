package com.kwai.video.clipkit.hardware.HardwareUtils;
import com.kwai.video.devicepersona.hardware.DPHardwareUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.Exception;
import java.io.IOException;

public class HardwareUtils extends DPHardwareUtils	// class@001a85
{

    public void HardwareUtils(){
       super();
    }
    public static boolean isAllTrackSupportMediaCodec(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$AndroidDecoderConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HardwareUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.trackAssets() == null) {
          return false;
       }
       Iterator iterator = p0.trackAssets().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!HardwareUtils.isSupportMediaCodec(iterator.next(), p1)) {
             break ;
          }
       }
       return false;
    }
    public static boolean isSupportMediaCodec(EditorSdk2V2$TrackAsset p0,EditorSdk2$AndroidDecoderConfig p1){
       int i3;
       int i4;
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, HardwareUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 2;
       int i1 = 1;
       obj = (EditorSdk2UtilsV2.trackAssetProbedVideoStream(p0).privateCodecId() == i)? 1: null;
       String str = (obj)? p1.cvdTypeHevc(): p1.tvdType();
       if (("sw").equals(str)) {
          return false;
       }else {
          String[] stringArray = str.split("_");
          int i2 = Math.min(EditorSdk2UtilsV2.getTrackAssetWidth(p0), EditorSdk2UtilsV2.getTrackAssetHeight(p0));
          try{
             if (stringArray.length > i) {
                i3 = ((stringArray[i1]).equals("max"))? Integer.parseInt(stringArray[i]): 0;
                if ((stringArray[3]).equals("min") && stringArray.length > 4) {
                   i4 = Integer.parseInt(stringArray[4]);
                }else {
                   i4 = 0;
                }
             }else if(stringArray.length == i){
                i4 = Integer.parseInt(stringArray[i1]);
             }else {
                i4 = 0;
             }
             i3 = 0;
          }catch(java.lang.Exception e5){
             KSClipLog.e("ClipKitHardware", "isSupportMediaCodec Exception", e5);
             return false;
          }
             if (!i3 && !i4) {
                i4 = 720;
             }
             if (i3) {
                if (i2 > i3 || i2 < i4) {
                   i1 = false;
                }
                return i1;
             }else if(i2 >= i4){
                i1 = false;
             }
             return i1;
       }
    }
    public static boolean isSupportMediaCodec(String p0,EditorSdk2$AndroidDecoderConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HardwareUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          return HardwareUtils.isSupportMediaCodec(EditorSdk2UtilsV2.createProjectWithFile(p0).trackAssets(i), p1);
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e3){
          e3.printStackTrace();
       }
       return i;
    }
}

package com.kwai.video.ksuploaderkit.logreporter.LogReporterUtils;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksuploaderkit.utils.FileUtils$FileType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class LogReporterUtils	// class@0009a5
{

    public void LogReporterUtils(){
       super();
    }
    public static FileUtils$FileType getFileType(String p0,boolean p1){
       LogReporterUtils logReporterU = LogReporterUtils.class;
       if (PatchProxy.isSupport(logReporterU)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, logReporterU, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          return FileUtils$FileType.Video;
       }else {
          return FileUtils.getFileType(p0);
       }
    }
    public static KSUploaderKitCommon$MediaType getMediaType(String p0,boolean p1){
       LogReporterUtils logReporterU = LogReporterUtils.class;
       if (PatchProxy.isSupport(logReporterU)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, logReporterU, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          return KSUploaderKitCommon$MediaType.Video;
       }else {
          return FileUtils.getMediaType(p0);
       }
    }
    public static int kitStatus2TaskEventStatus(KSUploaderKitCommon$Status p0){
       int i;
       if (p0 == KSUploaderKitCommon$Status.Success) {
          i = 7;
       }else if(p0 == KSUploaderKitCommon$Status.Cancel){
          i = 9;
       }else if(p0 == KSUploaderKitCommon$Status.Fail){
          i = 8;
       }else if(p0 == KSUploaderKitCommon$Status.Pause){
          i = 3;
       }else if(p0 == KSUploaderKitCommon$Status.Resume){
          i = 4;
       }else {
          i = 1;
       }
       return i;
    }
}

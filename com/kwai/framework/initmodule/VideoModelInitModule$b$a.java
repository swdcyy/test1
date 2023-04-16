package com.kwai.framework.initmodule.VideoModelInitModule$b$a;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloadListener;
import com.kwai.framework.initmodule.VideoModelInitModule$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e66.c;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.kve.VisionEngine;
import java.lang.Throwable;
import java.lang.Float;

public class VideoModelInitModule$b$a implements ModelDownloadListener	// class@00157c
{
    public final VideoModelInitModule$b a;

    public void VideoModelInitModule$b$a(VideoModelInitModule$b p0){
       this.a = p0;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoModelInitModule$b$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("ModelSDK", "onCancel "+p0+" "+p1, objArray);
       return;
    }
    public void onCompleted(String p0,String p1,String p2,boolean p3,int p4,int p5){
       VideoModelInitModule$b$a uob$a = VideoModelInitModule$b$a.class;
       if (PatchProxy.isSupport(uob$a)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob$a, "3")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       c.C().w("ModelSDK", "onCompleted "+p0+" "+p1+" "+p2+" "+p4+" "+p5, objArray1);
       VisionEngine.setAlgorithmModelDir(p0, p4, p5, p1);
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VideoModelInitModule$b$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("ModelSDK", "onFailed "+p0+" "+p1.getMessage()+" "+p2, objArray);
       return;
    }
    public void onProgress(String p0,float p1){
       VideoModelInitModule$b$a uob$a = VideoModelInitModule$b$a.class;
       if (PatchProxy.isSupport(uob$a) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob$a, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("ModelSDK", "onProgress "+p0+" "+p1, objArray);
       return;
    }
}

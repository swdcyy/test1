package com.kwai.video.aemonplayer.surface.SurfaceUtil;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Exception;

public class SurfaceUtil	// class@0019e7
{

    public void SurfaceUtil(){
       super();
    }
    public static Surface create(SurfaceTexture p0){
       Surface obj = PatchProxy.applyOneRefs(p0, null, SurfaceUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new Surface(p0);
          "create "+obj;
          return obj;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return v1;
       }
    }
    public static void release(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SurfaceUtil.class, "2")) {
          return;
       }
       if (p0 != null) {
          try{
             p0.release();
             "release "+p0;
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
}

package com.kwai.framework.initmodule.VideoModelInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.initmodule.VideoModelInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e66.c;
import q87.c;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kuaishou.gifshow.smartalbum.logic.d;
import com.kwai.kve.VisionEngine$Handler;
import com.kwai.kve.VisionEngine;
import ekd.v0;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloader;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.ksmodelmanager.CachePolicy;
import com.kwai.framework.initmodule.VideoModelInitModule$b$a;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloadListener;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class VideoModelInitModule$b implements Runnable	// class@00157d
{
    public final VideoModelInitModule b;

    public void VideoModelInitModule$b(VideoModelInitModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray1;
       String str = "ycnn_pre";
       String str1 = "visionengine";
       if (PatchProxy.applyVoid(null, this, VideoModelInitModule$b.class, "1")) {
          return;
       }
       c uoc = c.C();
       Object[] objArray = new Object[0];
       String str2 = "onLaunchFinish";
       try{
          uoc.w("ModelSDK", str2, objArray);
          if (!Dva.instance().isLoaded(str1)) {
             Object[] objArray2 = new Object[0];
             c.C().w("ModelSDK", "vision engine is not loaded, try to load", objArray2);
             Dva.instance().getPluginInstallManager().j(str1).c();
          }else {
             objArray = new Object[0];
             c.C().w("ModelSDK", "vision engine is already loaded", objArray);
          }
          VisionEngine.setHandler(d.a);
          VisionEngine.init();
          if (!Dva.instance().isLoaded(str)) {
             objArray = new Object[0];
             c.C().w("ModelSDK", "ycnn_pre is not loaded, try to load", objArray);
             Dva.instance().getPluginInstallManager().j(str).c();
          }else {
             objArray1 = new Object[0];
             c.C().w("ModelSDK", "ycnn_pre is already loaded", objArray1);
          }
          if (this.b.l0()) {
             "hiai_c_def".b("hiai_c_def");
             "hiai_enhance".b("hiai_enhance");
             "hiai".b("hiai");
             "hiai_ir".b("hiai_ir");
             "hiai_ir_build".b("hiai_ir_build");
             "hiai_ir_infershape".b("hiai_ir_infershape");
             "hiai_binary_model_runtime".b("hiai_binary_model_runtime");
             "ai_fmk_dnnacl".b("ai_fmk_dnnacl");
             "hiai_hcl_model_runtime".b("hiai_hcl_model_runtime");
             "hiai_session_impl".b("hiai_session_impl");
          }else if(this.b.n0()){
             "tflite_static_mtk".b("tflite_static_mtk");
          }
          new ModelDownloader(a.b()).downloadAll(CachePolicy.EQUAL, CachePolicy.EQUAL, new VideoModelInitModule$b$a(this));
          return;
       }catch(java.lang.Error e0){
       }catch(java.lang.Exception e0){
       }
       objArray1 = new Object[0];
       c.C().t("ModelSDK", "vision engine download or init failed: "+e0.getLocalizedMessage(), objArray1);
       return;
    }
}

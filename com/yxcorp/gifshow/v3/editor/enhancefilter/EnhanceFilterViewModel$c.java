package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c$a;
import com.kwai.kve.VisionEngine$Handler;
import com.kwai.kve.VisionEngine;
import com.kwai.kve.LutEnhancerBuilder;
import faa.a;
import q87.c;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Exception;
import boc.e;
import boc.b;
import com.yxcorp.gifshow.util.resource.n;
import java.lang.StringBuilder;
import sqc.f;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c$b;
import ekd.k1;

public final class EnhanceFilterViewModel$c implements Runnable	// class@000f78
{
    public final EnhanceFilterViewModel b;

    public void EnhanceFilterViewModel$c(EnhanceFilterViewModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, EnhanceFilterViewModel$c.class, "1")) {
          return;
       }
       a uoa = 1;
       int i = 0;
       PluginDownloadExtension k = PluginDownloadExtension.k;
       k.a("visionengine");
       if (!Dva.instance().isLoaded("visionengine")) {
          k.s("visionengine", 40);
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          uDva.getPluginInstallManager().j("visionengine").c();
       }
       if (Dva.instance().isLoaded("visionengine")) {
          VisionEngine.setHandler(EnhanceFilterViewModel$c$a.a);
          VisionEngine.createEnhanceBuilder();
          Object[] objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "checkEnhanceColorFilter visionengine is loaded", objArray);
          str = 1;
       }else {
          str = null;
       }
       if (!str) {
          objArray1 = new Object[i];
          a.D().t("EnhanceFilterViewModel", "checkEnhanceColorFilter visionengine not found!", objArray1);
          return;
       }else {
          AdvEditUtil uAdvEditUtil = AdvEditUtil.class;
          _monitor_enter(uAdvEditUtil);
          if (AdvEditUtil.a) {
             _monitor_exit(uAdvEditUtil);
          }else {
             try{
                EditorSdk2Utils.loadVisionEnginePlugin();
                AdvEditUtil.a = uoa;
             }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                e0.printStackTrace();
             }
             _monitor_exit(uAdvEditUtil);
          }
          Object[] objArray2 = new Object[i];
          a.D().s("EnhanceFilterViewModel", "load visionengine and ksveplugin success", objArray2);
          if (this.b.r0()) {
             objArray1 = new Object[i];
             a.D().w("EnhanceFilterViewModel", "download MAGIC_YCNN_LANDMARK  result="+n.p(e.c, 6000), objArray1);
          }
          f.c("download dependent so like vision engine");
          k1.o(new EnhanceFilterViewModel$c$b(this));
          return;
       }
    }
}

package com.yxcorp.dynamicfeature.video.VideoPluginInitModule;
import com.kwai.framework.init.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ru8.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.dynamicfeature.video.a;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkTestService$ExternalInitCallback;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkTestService;
import com.yxcorp.dynamicfeature.video.b;
import o56.c;
import o56.a;
import com.kwai.sdk.switchconfig.a;
import kuaishou.perf.page.impl.d;

public class VideoPluginInitModule extends a	// class@0011d0
{
    public static final int q;

    public void VideoPluginInitModule(){
       super();
    }
    public int f0(){
       return 2;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPluginInitModule.class, "2")) {
          return;
       }
       e.h(new a(this), "EmojiInitModule", true);
       return;
    }
    public void n(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoPluginInitModule.class, "1")) {
          return;
       }
       DPBenchmarkTestService.setExternalInitCallback(a.a);
       e.g(b.b, "DPHardwareConfigInit");
       if (!PatchProxy.applyVoid(objArray, this, VideoPluginInitModule.class, "3")) {
          b = false;
          if (a.a().c() || a.t().d("enablePostPageLogger", b)) {
             b = true;
          }
          d.j = a.a().c();
          d.i = b;
       }
       return;
    }
}

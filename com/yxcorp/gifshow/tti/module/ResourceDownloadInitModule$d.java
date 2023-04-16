package com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wkd.b;
import ob6.p;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import ob6.h;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import java.lang.reflect.Type;
import da6.d;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import com.yxcorp.download.DownloadDispatcher;
import com.yxcorp.download.a;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$a;
import pxa.e;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$c;
import hlc.k;
import ob6.p$b;
import ob6.p$a;

public final class ResourceDownloadInitModule$d implements Runnable	// class@001dca
{
    public final ResourceDownloadInitModule b;

    public void ResourceDownloadInitModule$d(ResourceDownloadInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ResourceDownloadInitModule$d.class, "1")) {
          return;
       }
       ResourceDownloadInitModule$d tb = this.b;
       if (tb.q == null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, ResourceDownloadInitModule.class, "2")) {
             int i = 0x36463d96;
             if (b.a(i).b()) {
                RequestTiming oN_HOME_PAGE = RequestTiming.ON_HOME_PAGE_CREATED;
                h oh = b.a(i).f();
                int i1 = 0;
                if (oh != null) {
                   oh = oh.mBaseConfig;
                   if (oh != null) {
                      DegradeConfig uDegradeConf = oh.c();
                      if (uDegradeConf != null) {
                         i = uDegradeConf.b();
                      label_0050 :
                         i = i ^ true;
                         ResourcePreloadingConfig resourcePrel = d.b(ResourcePreloadingConfig.class);
                         if (resourcePrel == null) {
                            resourcePrel = new ResourcePreloadingConfig();
                         }
                         ResourceDownloadController.e().d(resourcePrel.enableDownloadResWithBandwidthLimit);
                         a.a().j(resourcePrel.downloadParallelCount);
                         ResourceDownloadInitModule$a uoa = new ResourceDownloadInitModule$a(i);
                         Object[] objArray1 = new Object[i1];
                         e.C().w("ResourceConfig", "send config event "+uoa, objArray1);
                         RxBus.f.c(new ResourceDownloadInitModule$c(uoa, oN_HOME_PAGE));
                      }
                   }
                }
                i = 0;
                goto label_0050 ;
             }else {
                p.a.a(new k(tb));
             }
          }
          this.b.q = true;
       }
       return;
    }
}

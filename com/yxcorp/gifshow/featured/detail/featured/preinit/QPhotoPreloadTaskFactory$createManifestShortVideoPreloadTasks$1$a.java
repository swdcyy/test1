package com.yxcorp.gifshow.featured.detail.featured.preinit.QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import com.yxcorp.gifshow.featured.detail.featured.preinit.QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1;
import yc6.d;
import java.lang.String;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask$VodAdaptiveInit;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;

public final class QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a extends VodAdaptivePreloadPriorityTask	// class@000f49
{
    public final QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1 a;
    public final d b;
    public final String c;

    public void QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a(QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1 p0,d p1,String p2,String p3,VodAdaptivePreloadPriorityTask$VodAdaptiveInit p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super(p3, p4);
    }
    public void submit(){
       if (PatchProxy.applyVoid(null, this, QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a.class, "1")) {
          return;
       }
       super.submit();
       this.b.g(super.getSelectedRepId());
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VodAdaptivePreloadPriorityTask ["+this.getCacheKey()+"]: "+this.a.$data.getPhotoId()+' '+this.a.$data.getUserName()+' '+this.a.$data.getCaption();
    }
}

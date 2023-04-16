package com.yxcorp.gifshow.featured.detail.featured.preinit.QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import msd.l;
import yc6.d;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import yc6.d$a;
import com.yxcorp.gifshow.featured.detail.featured.preinit.QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask$VodAdaptiveInit;
import java.lang.Number;

public final class QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1 extends Lambda implements q	// class@000f4a
{
    public final QPhoto $data;
    public final l $newInit;

    public void QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1(QPhoto p0,l p1){
       this.$data = p0;
       this.$newInit = p1;
       super(3);
    }
    public final VodAdaptivePreloadPriorityTask invoke(d p0,int p1,PlaySourceSwitcher$a p2){
       d obj;
       String this;
       if (PatchProxy.isSupport(QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "switcher");
       a.p(p2, "<anonymous parameter 2>");
       obj = p0.d;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.framework.player_kpmid.multisource.switcher.ManifestShortVideoSwitcherKpMid.MsvPlaySource");
       this = obj.d();
       QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a uocreateMani = new QPhotoPreloadTaskFactory$createManifestShortVideoPreloadTasks$1$a(this, p0, this, this, this.$newInit.invoke(Integer.valueOf(1)));
       return obj;
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1.intValue(), p2);
    }
}

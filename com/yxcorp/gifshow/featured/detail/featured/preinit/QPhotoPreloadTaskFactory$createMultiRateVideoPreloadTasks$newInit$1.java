package com.yxcorp.gifshow.featured.detail.featured.preinit.QPhotoPreloadTaskFactory$createMultiRateVideoPreloadTasks$newInit$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import yda.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask$VodAdaptiveInit;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yda.h;
import android.util.DisplayMetrics;
import android.content.Context;
import java.util.Objects;
import android.view.WindowManager;
import android.view.Display;
import cw9.c;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import gc6.j;
import hm6.f;
import java.lang.Number;

public final class QPhotoPreloadTaskFactory$createMultiRateVideoPreloadTasks$newInit$1 extends Lambda implements l	// class@000f4b
{
    public final QPhoto $data;
    public final f this$0;

    public void QPhotoPreloadTaskFactory$createMultiRateVideoPreloadTasks$newInit$1(f p0,QPhoto p1){
       this.this$0 = p0;
       this.$data = p1;
       super(1);
    }
    public final VodAdaptivePreloadPriorityTask$VodAdaptiveInit invoke(int p0){
       f obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.isSupport(QPhotoPreloadTaskFactory$createMultiRateVideoPreloadTasks$newInit$1.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhotoPreloadTaskFactory$createMultiRateVideoPreloadTasks$newInit$1.class, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.this$0.b;
       a.o(obj, "mContext");
       DisplayMetrics uDisplayMetr = PatchProxy.applyOneRefs(obj, null, h.class, str);
       if (uDisplayMetr != patchProxyRe) {
       }else {
          uDisplayMetr = new DisplayMetrics();
          Object systemServic = obj.getSystemService("window");
          Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
          c.d(systemServic.getDefaultDisplay(), uDisplayMetr);
       }
       VodAdaptivePreloadPriorityTask$VodAdaptiveInit vodAdaptiveI = new VodAdaptivePreloadPriorityTask$VodAdaptiveInit();
       vodAdaptiveI.rateConfig = PhotoPlayerConfig.i();
       vodAdaptiveI.devResWidth = uDisplayMetr.widthPixels;
       vodAdaptiveI.devResHeigh = uDisplayMetr.heightPixels;
       vodAdaptiveI.netType = j.a();
       vodAdaptiveI.lowDevice = PhotoPlayerConfig.j();
       vodAdaptiveI.signalStrength = 0;
       vodAdaptiveI.switchCode = f.a(this.$data);
       vodAdaptiveI.manifestType = p0;
       vodAdaptiveI.clarityScore = PhotoPlayerConfig.b();
       return vodAdaptiveI;
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}

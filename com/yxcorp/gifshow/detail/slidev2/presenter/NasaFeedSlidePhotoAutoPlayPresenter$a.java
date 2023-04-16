package com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter$a;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;

public final class NasaFeedSlidePhotoAutoPlayPresenter$a implements g	// class@0018b1
{
    public final NasaFeedSlidePhotoAutoPlayPresenter b;

    public void NasaFeedSlidePhotoAutoPlayPresenter$a(NasaFeedSlidePhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaFeedSlidePhotoAutoPlayPresenter$a.class, "1")) {
       }else {
          NasaFeedSlidePhotoAutoPlayPresenter$a tb = this.b;
          a.o(p0, "currentPosition");
          long l = p0.longValue();
          Objects.requireNonNull(tb);
          p0 = NasaFeedSlidePhotoAutoPlayPresenter.class;
          if (PatchProxy.isSupport(p0) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, p0, "10") && (System.currentTimeMillis() - tb.i1) - 0x2710 >= 0)) {
             if (PatchProxy.isSupport(p0)) {
                p0 = PatchProxy.applyOneRefs(Long.valueOf(l), tb, p0, "11");
                if (p0 != PatchProxyResult.class) {
                   b = p0.booleanValue();
                }else {
                label_0059 :
                   p0 = tb.x;
                   String str = "mPhoto";
                   a.o(p0, str);
                   if ((r1.L0(p0.getEntity()) - l) - 0x2710 <= 0) {
                      p0 = tb.x;
                      a.o(p0, str);
                      if ((r1.L0(p0.getEntity()) - l) > 0) {
                         b = true;
                      }
                   }
                   b = false;
                }
             }else {
                goto label_0059 ;
             }
             if (b) {
                tb.i1 = System.currentTimeMillis();
             }
          }
       label_008c :
          PatchProxy.onMethodExit(NasaFeedSlidePhotoAutoPlayPresenter$a.class, "1");
       }
       return;
    }
}

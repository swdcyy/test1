package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import tw.j;
import qp7.x0;
import qp7.b;
import os7.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s0d.f;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;

public final class AdAvatarElement$c implements Runnable	// class@00170f
{
    public final AdAvatarElement b;

    public void AdAvatarElement$c(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, AdAvatarElement$c.class, "1")) {
          return;
       }
       AdAvatarElement$c tb = this.b;
       if (tb.K == 3) {
          PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve = j.l(AdAvatarElement.n0(tb));
          a uoa = this.b.E();
          boolean b = true;
          PhotoAdvertisement$CaptionAdvertisementInfo mAvatarIconA = (uCaptionAdve != null)? uCaptionAdve.mAvatarIconAnimationUrlA: null;
          uCaptionAdve = (uCaptionAdve != null)? uCaptionAdve.mAvatarIconAnimationUrlB: null;
          uoa.k(b, mAvatarIconA, uCaptionAdve);
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, AdAvatarElement.class, "27")) {
             AdAvatarElement t = tb.t;
             String str = "mPhoto";
             if (t == null) {
                a.S(str);
             }
             PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve1 = c.k(t.getEntity());
             uCaptionAdve1 = (uCaptionAdve1 != null)? uCaptionAdve1.mAvatarIconAnimationUrlB: null;
             if (!TextUtils.x(uCaptionAdve1)) {
                f uof = f.x();
                AdAvatarElement t1 = tb.t;
                if (t1 == null) {
                   a.S(str);
                }
                uCaptionAdve = c.k(t1.getEntity());
                uCaptionAdve = (uCaptionAdve != null)? uCaptionAdve.mAvatarIconAnimationUrlB: null;
                e[] uoeArray = uof.t(uCaptionAdve).w();
                Fresco.getImagePipeline().prefetchToDiskCache(uoeArray[0], null, Priority.HIGH);
                Fresco.getImagePipeline().prefetchToBitmapCache(uoeArray[0], null);
             }
          }
       }
    label_0097 :
       return;
    }
}

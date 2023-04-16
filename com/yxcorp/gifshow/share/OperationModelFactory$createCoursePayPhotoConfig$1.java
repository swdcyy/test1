package com.yxcorp.gifshow.share.OperationModelFactory$createCoursePayPhotoConfig$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import mhc.x;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import xv8.b;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;

public final class OperationModelFactory$createCoursePayPhotoConfig$1 extends Lambda implements l	// class@001b6c
{
    public final x $forward;
    public final BaseFeed $photo;

    public void OperationModelFactory$createCoursePayPhotoConfig$1(x p0,BaseFeed p1){
       this.$forward = p0;
       this.$photo = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModelFactory$createCoursePayPhotoConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mTitle = a1.p(0x7f100900);
       p0.mSubTitle = a1.p(0x7f1008ff);
       p0.mShareUrl = b.c(this.$forward.y0(), this.$photo);
       CoverMeta uCoverMeta = r1.D0(this.$photo);
       CoverMeta uCoverMeta1 = null;
       CoverMeta mCoverThumbn = (uCoverMeta != null)? uCoverMeta.mCoverThumbnailUrls: uCoverMeta1;
       p0.mCoverUrls = mCoverThumbn;
       if (uCoverMeta != null) {
          uCoverMeta1 = uCoverMeta.mCoverThumbnailUrl;
       }
       p0.mCoverUrl = uCoverMeta1;
       return;
    }
}

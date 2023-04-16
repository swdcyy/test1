package com.yxcorp.gifshow.share.OperationModelFactory$createCoursePayPhotoConfig$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kp.r1;
import lnc.a1;
import com.kuaishou.android.model.mix.CoverMeta;
import xv8.b;

public final class OperationModelFactory$createCoursePayPhotoConfig$2 extends Lambda implements l	// class@001b6d
{
    public final x $forward;
    public final BaseFeed $photo;

    public void OperationModelFactory$createCoursePayPhotoConfig$2(BaseFeed p0,x p1){
       this.$photo = p0;
       this.$forward = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModelFactory$createCoursePayPhotoConfig$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mTitle = r1.V1(this.$photo);
       p0.mSubTitle = r1.p0(this.$photo);
       p0.mSource = a1.p(0x7f100900);
       CoverMeta uCoverMeta = r1.D0(this.$photo);
       p0.mShareUrl = b.c(this.$forward.y0(), this.$photo);
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

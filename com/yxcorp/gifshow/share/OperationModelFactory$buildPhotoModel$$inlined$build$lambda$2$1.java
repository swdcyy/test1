package com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2;
import mhc.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lnc.a1;
import com.yxcorp.gifshow.share.OperationModelFactory;
import xv8.b;
import com.kuaishou.android.model.mix.CoverMeta;

public final class OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1 extends Lambda implements l	// class@001b63
{
    public final x $forward;
    public final OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2 this$0;

    public void OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1(OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2 p0,x p1){
       this.this$0 = p0;
       this.$forward = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       CDNUrl[] uCDNUrlArray;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = (r1.b3(this.this$0.$photo$inlined))? a1.p(R.string.arg_RES_7f104631): a1.r(R.string.arg_RES_7f104789, r1.V1(this.this$0.$photo$inlined));
       p0.mTitle = str;
       p0.mSubTitle = OperationModelFactory.j(r1.p0(this.this$0.$photo$inlined));
       p0.mShareUrl = b.f(this.$forward.y0(), this.$forward.f0(), this.this$0.$photo$inlined);
       CoverMeta uCoverMeta = r1.D0(this.this$0.$photo$inlined);
       if (uCoverMeta != null) {
          uCoverMeta = uCoverMeta.mCoverUrls;
          if (uCoverMeta == null) {
          label_0066 :
             uCoverMeta = r1.D0(this.this$0.$photo$inlined);
             uCoverMeta = (uCoverMeta != null)? uCoverMeta.mCoverThumbnailUrls: null;
          }
       }else {
          goto label_0066 ;
       }
       p0.mCoverUrls = uCoverMeta;
       PatchProxy.onMethodExit(OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1.class, "1");
       return;
    }
}

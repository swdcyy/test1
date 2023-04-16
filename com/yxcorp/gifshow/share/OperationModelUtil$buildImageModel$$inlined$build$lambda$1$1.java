package com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1 extends Lambda implements l	// class@001b6f
{
    public final OperationModelUtil$buildImageModel$$inlined$build$lambda$1 this$0;

    public void OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1(OperationModelUtil$buildImageModel$$inlined$build$lambda$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1 tthis$0 = this.this$0;
       p0.mSubTitle = tthis$0.$subtitle$inlined;
       p0.mTitle = tthis$0.$title$inlined;
       p0.mShareUrl = tthis$0.$shareUrl$inlined;
       p0.mCoverUrl = tthis$0.$coverUrl$inlined;
       PatchProxy.onMethodExit(OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1.class, "1");
       return;
    }
}

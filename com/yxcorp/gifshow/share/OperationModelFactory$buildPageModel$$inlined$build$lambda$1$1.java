package com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1;
import mhc.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.TextUtils;

public final class OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1 extends Lambda implements l	// class@001b5e
{
    public final x $forward;
    public final OperationModelFactory$buildPageModel$$inlined$build$lambda$1 this$0;

    public void OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1(OperationModelFactory$buildPageModel$$inlined$build$lambda$1 p0,x p1){
       this.this$0 = p0;
       this.$forward = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1 tthis$0 = this.this$0;
       p0.mSubTitle = tthis$0.$subtitle$inlined;
       p0.mTitle = tthis$0.$title$inlined;
       OperationModelFactory$buildPageModel$$inlined$build$lambda$1 $ccFunc$inli = tthis$0.$ccFunc$inlined;
       String str = ($ccFunc$inli != null)? TextUtils.c(tthis$0.$localShareUrl$inlined, "cc", $ccFunc$inli.invoke(this.$forward)): tthis$0.$localShareUrl$inlined;
       p0.mShareUrl = str;
       p0.mCoverUrl = this.this$0.$coverUrl$inlined;
       PatchProxy.onMethodExit(OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1.class, "1");
       return;
    }
}

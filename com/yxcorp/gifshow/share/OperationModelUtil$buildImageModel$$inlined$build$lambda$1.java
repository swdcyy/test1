package com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import brd.t;
import java.lang.String;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import com.yxcorp.gifshow.share.OperationModelUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1;
import java.util.Objects;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1$2;

public final class OperationModelUtil$buildImageModel$$inlined$build$lambda$1 extends Lambda implements l	// class@001b71
{
    public final String $coverUrl$inlined;
    public final t $dataFetcher$inlined;
    public final File $file$inlined;
    public final String $shareUrl$inlined;
    public final String $subtitle$inlined;
    public final String $title$inlined;

    public void OperationModelUtil$buildImageModel$$inlined$build$lambda$1(File p0,t p1,String p2,String p3,String p4,String p5){
       this.$file$inlined = p0;
       this.$dataFetcher$inlined = p1;
       this.$subtitle$inlined = p2;
       this.$title$inlined = p3;
       this.$shareUrl$inlined = p4;
       this.$coverUrl$inlined = p5;
       super(1);
    }
    public final SharePlatformData invoke(x p0){
       OperationModelUtil a;
       OperationModelUtil operationMod = OperationModelUtil.class;
       String obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelUtil$buildImageModel$$inlined$build$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "forward";
       a.p(p0, obj);
       a = OperationModelUtil.a;
       OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1 uobuildImage = new OperationModelUtil$buildImageModel$$inlined$build$lambda$1$1(this);
       Objects.requireNonNull(a);
       SharePlatformData$ShareConfig shareConfig = PatchProxy.applyTwoRefs(p0, uobuildImage, a, operationMod, "11");
       if (shareConfig != PatchProxyResult.class) {
       }else {
          a.p(p0, obj);
          a.p(uobuildImage, "block");
          shareConfig = new SharePlatformData$ShareConfig();
          uobuildImage.invoke(shareConfig);
          shareConfig.mH5MaxTitleLength = SharePlatformData.getH5MaxTitleLength(p0.v());
       }
       OperationModelUtil$buildImageModel$$inlined$build$lambda$1$2 uobuildImage1 = new OperationModelUtil$buildImageModel$$inlined$build$lambda$1$2(shareConfig);
       Objects.requireNonNull(a);
       SharePlatformData sharePlatfor = PatchProxy.applyOneRefs(uobuildImage1, a, operationMod, "12");
       if (sharePlatfor != PatchProxyResult.class) {
       }else {
          a.p(uobuildImage1, "block");
          sharePlatfor = new SharePlatformData();
          uobuildImage1.invoke(sharePlatfor);
       }
       PatchProxy.onMethodExit(OperationModelUtil$buildImageModel$$inlined$build$lambda$1.class, "1");
       return sharePlatfor;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}

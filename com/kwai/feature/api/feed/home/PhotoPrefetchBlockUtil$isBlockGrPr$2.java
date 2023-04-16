package com.kwai.feature.api.feed.home.PhotoPrefetchBlockUtil$isBlockGrPr$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PhotoPrefetchBlockUtil$isBlockGrPr$2 extends Lambda implements a	// class@000ee5
{
    public static final PhotoPrefetchBlockUtil$isBlockGrPr$2 INSTANCE;

    static {
       PhotoPrefetchBlockUtil$isBlockGrPr$2.INSTANCE = new PhotoPrefetchBlockUtil$isBlockGrPr$2();
    }
    public void PhotoPrefetchBlockUtil$isBlockGrPr$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PhotoPrefetchBlockUtil$isBlockGrPr$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("LaunchOpt2022GrPrBlock", false);
    }
}

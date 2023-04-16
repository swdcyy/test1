package com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableCommonInsertCard$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FeaturedExperimentUtil$enableCommonInsertCard$2 extends Lambda implements a	// class@000e8f
{
    public static final FeaturedExperimentUtil$enableCommonInsertCard$2 INSTANCE;

    static {
       FeaturedExperimentUtil$enableCommonInsertCard$2.INSTANCE = new FeaturedExperimentUtil$enableCommonInsertCard$2();
    }
    public void FeaturedExperimentUtil$enableCommonInsertCard$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedExperimentUtil$enableCommonInsertCard$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("commonInsertCardEnable", false);
    }
}

package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$Companion$LazyInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NasaFeatureGuideManager$Companion$LazyInstance$2 extends Lambda implements a	// class@001964
{
    public static final NasaFeatureGuideManager$Companion$LazyInstance$2 INSTANCE;

    static {
       NasaFeatureGuideManager$Companion$LazyInstance$2.INSTANCE = new NasaFeatureGuideManager$Companion$LazyInstance$2();
    }
    public void NasaFeatureGuideManager$Companion$LazyInstance$2(){
       super(0);
    }
    public final NasaFeatureGuideManager invoke(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager$Companion$LazyInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NasaFeatureGuideManager();
    }
    public Object invoke(){
       return this.invoke();
    }
}

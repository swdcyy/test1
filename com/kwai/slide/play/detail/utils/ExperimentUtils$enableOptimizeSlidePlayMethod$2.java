package com.kwai.slide.play.detail.utils.ExperimentUtils$enableOptimizeSlidePlayMethod$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class ExperimentUtils$enableOptimizeSlidePlayMethod$2 extends Lambda implements a	// class@00187c
{
    public static final ExperimentUtils$enableOptimizeSlidePlayMethod$2 INSTANCE;

    static {
       ExperimentUtils$enableOptimizeSlidePlayMethod$2.INSTANCE = new ExperimentUtils$enableOptimizeSlidePlayMethod$2();
    }
    public void ExperimentUtils$enableOptimizeSlidePlayMethod$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ExperimentUtils$enableOptimizeSlidePlayMethod$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("optimizeSlidePlayMethod");
    }
}

package com.kwai.framework.plugin.feature.KwaiFeatureUpdateManager$mFeatureSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import zi7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.FeatureManager;

public final class KwaiFeatureUpdateManager$mFeatureSource$2 extends Lambda implements a	// class@000c8c
{
    public static final KwaiFeatureUpdateManager$mFeatureSource$2 INSTANCE;

    static {
       KwaiFeatureUpdateManager$mFeatureSource$2.INSTANCE = new KwaiFeatureUpdateManager$mFeatureSource$2();
    }
    public void KwaiFeatureUpdateManager$mFeatureSource$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiFeatureUpdateManager$mFeatureSource$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeatureManager.a.a();
    }
}

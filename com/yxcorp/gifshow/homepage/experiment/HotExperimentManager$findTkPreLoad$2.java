package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findTkPreLoad$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findTkPreLoad$2$a;
import java.lang.reflect.Type;
import el.a;
import trd.t0;

public final class HotExperimentManager$findTkPreLoad$2 extends Lambda implements a	// class@0016c8
{
    public static final HotExperimentManager$findTkPreLoad$2 INSTANCE;

    static {
       HotExperimentManager$findTkPreLoad$2.INSTANCE = new HotExperimentManager$findTkPreLoad$2();
    }
    public void HotExperimentManager$findTkPreLoad$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object obj = PatchProxy.apply(null, this, HotExperimentManager$findTkPreLoad$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("findTkPreLoad", new HotExperimentManager$findTkPreLoad$2$a().getType(), t0.z());
    }
}

package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableSideBarRemoveBottom$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class HomeExperimentManager$enableSideBarRemoveBottom$2 extends Lambda implements a	// class@0016b1
{
    public static final HomeExperimentManager$enableSideBarRemoveBottom$2 INSTANCE;

    static {
       HomeExperimentManager$enableSideBarRemoveBottom$2.INSTANCE = new HomeExperimentManager$enableSideBarRemoveBottom$2();
    }
    public void HomeExperimentManager$enableSideBarRemoveBottom$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$enableSideBarRemoveBottom$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableSideBarRemoveBottom");
    }
}

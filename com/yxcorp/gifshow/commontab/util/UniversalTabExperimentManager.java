package com.yxcorp.gifshow.commontab.util.UniversalTabExperimentManager;
import com.yxcorp.gifshow.commontab.util.UniversalTabExperimentManager$enableLifeCardMask$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class UniversalTabExperimentManager	// class@0011bf
{
    public static final p a;
    public static final UniversalTabExperimentManager b;

    static {
       UniversalTabExperimentManager.b = new UniversalTabExperimentManager();
       UniversalTabExperimentManager.a = s.c(UniversalTabExperimentManager$enableLifeCardMask$2.INSTANCE);
    }
    public void UniversalTabExperimentManager(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, UniversalTabExperimentManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = UniversalTabExperimentManager.a.getValue();
       }
       return obj.booleanValue();
    }
}

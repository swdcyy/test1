package com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$enableShieldReducePop$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$enableSearchMaskFix$2;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$surveyCardStyle$2;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$InternalFeedPlayCount$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class HomeCardExperimentUtil	// class@00180e
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final HomeCardExperimentUtil e;

    static {
       HomeCardExperimentUtil.e = new HomeCardExperimentUtil();
       HomeCardExperimentUtil.a = s.c(HomeCardExperimentUtil$enableShieldReducePop$2.INSTANCE);
       HomeCardExperimentUtil.b = s.c(HomeCardExperimentUtil$enableSearchMaskFix$2.INSTANCE);
       HomeCardExperimentUtil.c = s.c(HomeCardExperimentUtil$surveyCardStyle$2.INSTANCE);
       HomeCardExperimentUtil.d = s.c(HomeCardExperimentUtil$InternalFeedPlayCount$2.INSTANCE);
    }
    public void HomeCardExperimentUtil(){
       super();
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, HomeCardExperimentUtil.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = HomeCardExperimentUtil.c.getValue();
       }
       return obj.intValue();
    }
}

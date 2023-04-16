package com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$surveyCardStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class HomeCardExperimentUtil$surveyCardStyle$2 extends Lambda implements a	// class@00180d
{
    public static final HomeCardExperimentUtil$surveyCardStyle$2 INSTANCE;

    static {
       HomeCardExperimentUtil$surveyCardStyle$2.INSTANCE = new HomeCardExperimentUtil$surveyCardStyle$2();
    }
    public void HomeCardExperimentUtil$surveyCardStyle$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HomeCardExperimentUtil$surveyCardStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("surveyCardStyle", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

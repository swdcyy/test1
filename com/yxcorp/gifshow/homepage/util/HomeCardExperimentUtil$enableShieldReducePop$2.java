package com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$enableShieldReducePop$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeCardExperimentUtil$enableShieldReducePop$2 extends Lambda implements a	// class@00180c
{
    public static final HomeCardExperimentUtil$enableShieldReducePop$2 INSTANCE;

    static {
       HomeCardExperimentUtil$enableShieldReducePop$2.INSTANCE = new HomeCardExperimentUtil$enableShieldReducePop$2();
    }
    public void HomeCardExperimentUtil$enableShieldReducePop$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeCardExperimentUtil$enableShieldReducePop$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableShieldDisLikeBtn", true);
    }
}

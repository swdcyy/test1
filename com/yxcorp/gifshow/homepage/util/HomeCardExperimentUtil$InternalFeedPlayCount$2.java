package com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$InternalFeedPlayCount$2;
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

public final class HomeCardExperimentUtil$InternalFeedPlayCount$2 extends Lambda implements a	// class@00180a
{
    public static final HomeCardExperimentUtil$InternalFeedPlayCount$2 INSTANCE;

    static {
       HomeCardExperimentUtil$InternalFeedPlayCount$2.INSTANCE = new HomeCardExperimentUtil$InternalFeedPlayCount$2();
    }
    public void HomeCardExperimentUtil$InternalFeedPlayCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HomeCardExperimentUtil$InternalFeedPlayCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("InternalFeedPlayCount", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

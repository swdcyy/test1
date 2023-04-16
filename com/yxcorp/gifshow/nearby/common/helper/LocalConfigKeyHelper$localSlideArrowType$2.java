package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localSlideArrowType$2;
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

public final class LocalConfigKeyHelper$localSlideArrowType$2 extends Lambda implements a	// class@0020fb
{
    public static final LocalConfigKeyHelper$localSlideArrowType$2 INSTANCE;

    static {
       LocalConfigKeyHelper$localSlideArrowType$2.INSTANCE = new LocalConfigKeyHelper$localSlideArrowType$2();
    }
    public void LocalConfigKeyHelper$localSlideArrowType$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$localSlideArrowType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("localSlideDistanceTagArrowType", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

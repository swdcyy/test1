package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2 extends Lambda implements a	// class@0020eb
{
    public static final LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2.INSTANCE = new LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2();
    }
    public void LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("nearbyLiveStreamEnableCellular");
    }
}

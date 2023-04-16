package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2 extends Lambda implements a	// class@0020f7
{
    public static final LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2 INSTANCE;

    static {
       LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2.INSTANCE = new LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2();
    }
    public void LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableNearbySingleFeed");
    }
}

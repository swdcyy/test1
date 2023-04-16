package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import java.lang.Integer;

public final class LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2 extends Lambda implements a	// class@0020f4
{
    public static final LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2 INSTANCE;

    static {
       LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2.INSTANCE = new LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2();
    }
    public void LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (SystemUtil.K()) {
          return i.g("ENABLE_NEARBY_PREFETCH_STRATEGY");
       }
       return 0;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

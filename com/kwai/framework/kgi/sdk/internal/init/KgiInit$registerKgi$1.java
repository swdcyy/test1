package com.kwai.framework.kgi.sdk.internal.init.KgiInit$registerKgi$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KgiInit$registerKgi$1 extends Lambda implements l	// class@00159a
{
    public final int $channelId;

    public void KgiInit$registerKgi$1(int p0){
       this.$channelId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiInit$registerKgi$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.intValue() == this.$channelId)? true: false;
       return b;
    }
}

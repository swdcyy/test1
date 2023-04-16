package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaServiceImpl$cacheItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Set;

public final class LiveLiteAnchorInfoAreaServiceImpl$cacheItem$1 extends Lambda implements l	// class@001e3c
{
    public final LiveLiteAnchorInfoAreaService$a $testBizId;

    public void LiveLiteAnchorInfoAreaServiceImpl$cacheItem$1(LiveLiteAnchorInfoAreaService$a p0){
       this.$testBizId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(LiveLiteAnchorInfoAreaService$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteAnchorInfoAreaServiceImpl$cacheItem$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return p0.excludeBizIds().contains(this.$testBizId);
    }
}

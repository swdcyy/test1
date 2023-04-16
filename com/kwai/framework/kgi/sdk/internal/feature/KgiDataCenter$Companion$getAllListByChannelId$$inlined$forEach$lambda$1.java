package com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.lang.Object;
import r76.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import q76.a;
import q76.b;
import y76.b;

public final class KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1 extends Lambda implements l	// class@001592
{
    public final List $allList$inlined;
    public final int $channelId$inlined;
    public final ConcurrentHashMap $this_getAllListByChannelId$inlined;

    public void KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1(ConcurrentHashMap p0,int p1,List p2){
       this.$this_getAllListByChannelId$inlined = p0;
       this.$channelId$inlined = p1;
       this.$allList$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "feature");
       this.$allList$inlined.add(p0);
       b.g("KgiDataCenter#getAllListByChannelId: find local feature, channelId = "+this.$channelId$inlined+','+" subChannel = "+p0.i()+','+" featureType = "+p0.c()+','+" feature = "+p0.b(), false, 2, null);
       PatchProxy.onMethodExit(KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1.class, "1");
       return;
    }
}

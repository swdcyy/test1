package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.impl.LiveTempPlayPendantItemManagerImpl$grouplize$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import fv1.f;
import ls5.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveTempPlayPendantItemManagerImpl$grouplize$1$1 extends Lambda implements l	// class@0016dd
{
    public final f $groupConfig;
    public final a $item;

    public void LiveTempPlayPendantItemManagerImpl$grouplize$1$1(f p0,a p1){
       this.$groupConfig = p0;
       this.$item = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTempPlayPendantItemManagerImpl$grouplize$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (this.$groupConfig.a(this.$item.getId()) < this.$groupConfig.a(p0.getId()))? true: false;
       return b;
    }
}

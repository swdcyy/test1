package com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentViewModel$pendingShowCritMomentEnterAnim$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import xt1.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yt1.e;

public final class LiveMultiPkCritMomentViewModel$pendingShowCritMomentEnterAnim$$inlined$let$lambda$1 extends Lambda implements a	// class@00165f
{
    public final long $deadLine$inlined;
    public final h this$0;

    public void LiveMultiPkCritMomentViewModel$pendingShowCritMomentEnterAnim$$inlined$let$lambda$1(h p0,long p1){
       this.this$0 = p0;
       this.$deadLine$inlined = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, LiveMultiPkCritMomentViewModel$pendingShowCritMomentEnterAnim$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.d.b() - this.$deadLine$inlined > 0)? true: false;
       PatchProxy.onMethodExit(LiveMultiPkCritMomentViewModel$pendingShowCritMomentEnterAnim$$inlined$let$lambda$1.class, "1");
       return b;
    }
}

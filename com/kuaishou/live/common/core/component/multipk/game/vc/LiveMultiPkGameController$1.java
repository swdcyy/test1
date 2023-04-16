package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ps1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public final class LiveMultiPkGameController$1 extends Lambda implements a	// class@0015e0
{
    public final e $pkDelegate;

    public void LiveMultiPkGameController$1(e p0){
       this.$pkDelegate = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkGameController$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.$pkDelegate.j();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}

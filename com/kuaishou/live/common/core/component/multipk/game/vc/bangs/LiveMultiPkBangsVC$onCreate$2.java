package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC$onCreate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkBangsVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ps1.e;
import java.lang.Long;

public final class LiveMultiPkBangsVC$onCreate$2 extends Lambda implements a	// class@0015fa
{
    public final LiveMultiPkBangsVC this$0;

    public void LiveMultiPkBangsVC$onCreate$2(LiveMultiPkBangsVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkBangsVC$onCreate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.this$0.n.j();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}

package com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController;
import ts2.f;
import androidx.lifecycle.LiveData;
import it2.d1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import co2.f2;
import qu2.a;
import mt2.a;

public final class SharePendantViewController$viewModel$2 extends Lambda implements a	// class@00173e
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final SharePendantViewController this$0;

    public void SharePendantViewController$viewModel$2(SharePendantViewController p0,f p1,LiveData p2){
       this.this$0 = p0;
       this.$micSeatStateService = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final d1 invoke(){
       Object obj = PatchProxy.apply(null, this, SharePendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SharePendantViewController$viewModel$2 tthis$0 = this.this$0;
       d1 uod1 = new d1(this.$micSeatStateService, tthis$0.m, tthis$0.n, tthis$0.o, this.$micSeatId);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}

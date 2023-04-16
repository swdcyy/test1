package com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController;
import androidx.lifecycle.LiveData;
import it2.x0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic;

public final class OpenVideoTipsPendantViewController$viewModel$2 extends Lambda implements a	// class@00172e
{
    public final LiveData $micSeatId;
    public final OpenVideoTipsPendantViewController this$0;

    public void OpenVideoTipsPendantViewController$viewModel$2(OpenVideoTipsPendantViewController p0,LiveData p1){
       this.this$0 = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public final x0 invoke(){
       Object obj = PatchProxy.apply(null, this, OpenVideoTipsPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x0(this.this$0.l, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}

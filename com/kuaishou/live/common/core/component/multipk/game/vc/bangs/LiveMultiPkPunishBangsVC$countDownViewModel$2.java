package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$countDownViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$countDownViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$countDownViewModel$2$a;

public final class LiveMultiPkPunishBangsVC$countDownViewModel$2 extends Lambda implements a	// class@00160b
{
    public final LiveMultiPkPunishBangsVC this$0;

    public void LiveMultiPkPunishBangsVC$countDownViewModel$2(LiveMultiPkPunishBangsVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkPunishBangsVC$countDownViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkPunishBangsVC$countDownViewModel$2$a(new LiveMultiPkPunishBangsVC$countDownViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}

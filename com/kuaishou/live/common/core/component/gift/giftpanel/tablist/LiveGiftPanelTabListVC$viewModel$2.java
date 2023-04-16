package com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$viewModel$2$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$viewModel$2$a;

public final class LiveGiftPanelTabListVC$viewModel$2 extends Lambda implements a	// class@001308
{
    public final LiveGiftPanelTabListVC this$0;

    public void LiveGiftPanelTabListVC$viewModel$2(LiveGiftPanelTabListVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelTabListVC$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftPanelTabListVC$viewModel$2$a(new LiveGiftPanelTabListVC$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}

package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$viewModel$2$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$viewModel$2$a;

public final class LiveGiftPanelPagerListVC$viewModel$2 extends Lambda implements a	// class@0012e3
{
    public final LiveGiftPanelPagerListVC this$0;

    public void LiveGiftPanelPagerListVC$viewModel$2(LiveGiftPanelPagerListVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelPagerListVC$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftPanelPagerListVC$viewModel$2$a(new LiveGiftPanelPagerListVC$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}

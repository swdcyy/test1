package com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC;
import rl1.g;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$viewModel$2$1;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$viewModel$2$a;

public final class LiveGiftNamingNavigationVC$viewModel$2 extends Lambda implements a	// class@0012b9
{
    public final g $listener;
    public final LiveGiftNamingNavigationVC this$0;

    public void LiveGiftNamingNavigationVC$viewModel$2(LiveGiftNamingNavigationVC p0,g p1){
       this.this$0 = p0;
       this.$listener = p1;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNamingNavigationVC$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftNamingNavigationVC$viewModel$2$a(new LiveGiftNamingNavigationVC$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}

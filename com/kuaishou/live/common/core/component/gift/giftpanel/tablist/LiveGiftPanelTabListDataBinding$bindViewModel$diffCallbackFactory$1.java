package com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;

public final class LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1 extends Lambda implements a	// class@001303
{
    public final LiveGiftPanelTabListAdapter $adapter;

    public void LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1(LiveGiftPanelTabListAdapter p0){
       this.$adapter = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$adapter.J0();
    }
}

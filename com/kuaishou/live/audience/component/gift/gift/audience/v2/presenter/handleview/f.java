package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.f;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;

public final class f implements h	// class@000b4f
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       return LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem.parseFromLiveGiftBatchConfig(p0);
    }
}

package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.g;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;

public final class g implements Comparator	// class@000b50
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.mGiftBatchCount - p0.mGiftBatchCount);
    }
}

package com.kuaishou.live.merchant.hourlytrank.b;
import erd.r;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignal;
import ekd.j;

public final class b implements r	// class@000ccc
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 != null && !j.h(p0.sellerTabRank))? true: false;
       return b;
    }
}

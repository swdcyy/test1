package com.kuaishou.live.merchant.hourlytrank.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000ccb
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.MERCHANT, "SellerRankSignal", p0);
    }
}

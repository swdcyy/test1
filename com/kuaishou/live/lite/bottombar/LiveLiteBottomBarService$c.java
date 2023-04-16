package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$c;
import kotlin.Pair;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qrd.r0;
import trd.t;
import java.util.Map;
import trd.t0;

public final class LiveLiteBottomBarService$c	// class@001eb3
{
    public static final Map a;
    public static final LiveLiteBottomBarService$c b;

    static {
       LiveLiteBottomBarService$BottomBarType[] uBottomBarTy;
       LiveLiteBottomBarService$BottomBarType pOPULARITY;
       LiveLiteBottomBarService$c.b = new LiveLiteBottomBarService$c();
       Pair[] pairArray = new Pair[]{r0.a(LiveLiteBottomBarService$BottomBarType.GIFT, CollectionsKt__CollectionsKt.L(uBottomBarTy)),r0.a(LiveLiteBottomBarService$BottomBarType.GUIDE_GIFT, t.k(pOPULARITY))};
       uBottomBarTy = new LiveLiteBottomBarService$BottomBarType[]{LiveLiteBottomBarService$BottomBarType.VICE_GUIDE_GIFT,pOPULARITY};
       pOPULARITY = LiveLiteBottomBarService$BottomBarType.POPULARITY;
       LiveLiteBottomBarService$c.a = t0.W(pairArray);
    }
    public void LiveLiteBottomBarService$c(){
       super();
    }
}

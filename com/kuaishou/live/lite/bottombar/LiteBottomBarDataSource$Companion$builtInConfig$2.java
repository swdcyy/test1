package com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$Companion$builtInConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import qrd.l1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class LiteBottomBarDataSource$Companion$builtInConfig$2 extends Lambda implements a	// class@001ea4
{
    public static final LiteBottomBarDataSource$Companion$builtInConfig$2 INSTANCE;

    static {
       LiteBottomBarDataSource$Companion$builtInConfig$2.INSTANCE = new LiteBottomBarDataSource$Companion$builtInConfig$2();
    }
    public void LiteBottomBarDataSource$Companion$builtInConfig$2(){
       super(0);
    }
    public final LiveConfigStartupResponse$LiteBottomBarConfig invoke(){
       LiveConfigStartupResponse$LiteBottomBarItemConfig liteBottomBa1;
       LiveConfigStartupResponse$LiteBottomBarItemConfig liteBottomBa2;
       LiveConfigStartupResponse$LiteBottomBarItemConfig liteBottomBa3;
       LiveConfigStartupResponse$LiteBottomBarItemConfig liteBottomBa4;
       LiveConfigStartupResponse$LiteBottomBarConfig obj = PatchProxy.apply(null, this, LiteBottomBarDataSource$Companion$builtInConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveConfigStartupResponse$LiteBottomBarConfig();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6)};
       obj.mSlots = ArraysKt___ArraysKt.ny(integerArray);
       LiveConfigStartupResponse$LiteBottomBarItemConfig[] liteBottomBa = new LiveConfigStartupResponse$LiteBottomBarItemConfig[]{liteBottomBa1,liteBottomBa2,liteBottomBa3,liteBottomBa4,liteBottomBa4,liteBottomBa4,liteBottomBa4,liteBottomBa4};
       liteBottomBa1 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa1.mId = 1;
       liteBottomBa1.mSlot = 1;
       liteBottomBa2 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa2.mId = 2;
       liteBottomBa2.mSlot = 2;
       liteBottomBa2.mPriority = 300;
       liteBottomBa3 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa3.mId = 8;
       liteBottomBa3.mSlot = 2;
       liteBottomBa3.mPriority = 200;
       liteBottomBa4 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa4.mId = 3;
       liteBottomBa4.mSlot = 2;
       liteBottomBa4.mPriority = 100;
       liteBottomBa4 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa4.mId = 5;
       liteBottomBa4.mSlot = 3;
       liteBottomBa4 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa4.mId = 4;
       liteBottomBa4.mSlot = 4;
       liteBottomBa4 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa4.mId = 6;
       liteBottomBa4.mSlot = 5;
       liteBottomBa4 = new LiveConfigStartupResponse$LiteBottomBarItemConfig();
       liteBottomBa4.mId = 7;
       liteBottomBa4.mSlot = 6;
       List list = CollectionsKt__CollectionsKt.L(liteBottomBa);
       obj.mItems = list;
       obj.mShopLiveItems = list;
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}

package com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$getBottomBarItemInSlot$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.Map;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class LiteBottomBarDataSource$getBottomBarItemInSlot$1 extends Lambda implements l	// class@001ea9
{
    public final Map $existingItems;

    public void LiteBottomBarDataSource$getBottomBarItemInSlot$1(Map p0){
       this.$existingItems = p0;
       super(1);
    }
    public final LiveLiteBottomBarService$a invoke(LiveConfigStartupResponse$LiteBottomBarItemConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteBottomBarDataSource$getBottomBarItemInSlot$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.$existingItems.get(Integer.valueOf(p0.mId));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}

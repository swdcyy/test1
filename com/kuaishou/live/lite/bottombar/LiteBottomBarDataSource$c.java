package com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$c;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class LiteBottomBarDataSource$c implements Comparator	// class@001ea8
{

    public void LiteBottomBarDataSource$c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteBottomBarDataSource$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p1.mPriority), Integer.valueOf(p0.mPriority));
    }
}

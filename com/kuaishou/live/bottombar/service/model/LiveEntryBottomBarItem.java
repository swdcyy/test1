package com.kuaishou.live.bottombar.service.model.LiveEntryBottomBarItem;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.kuaishou.live.bottombar.service.model.LiveEntryBottomBarItem$AnimStrategy;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.service.model.f;

public class LiveEntryBottomBarItem extends LiveNormalBottomBarItem	// class@000d54
{
    public LiveEntryBottomBarItem$AnimStrategy a;
    public Animator b;

    public void LiveEntryBottomBarItem(){
       super();
       this.a = LiveEntryBottomBarItem$AnimStrategy.Default;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, LiveEntryBottomBarItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a;
    }
}

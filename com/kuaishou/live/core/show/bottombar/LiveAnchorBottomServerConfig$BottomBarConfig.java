package com.kuaishou.live.core.show.bottombar.LiveAnchorBottomServerConfig$BottomBarConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class LiveAnchorBottomServerConfig$BottomBarConfig implements Serializable	// class@000a0b
{
    public List mLeftBottomBarListItems;
    public List mRightBottomBarListItems;
    public static final long serialVersionUID = 0x2d3b683dea93466c;

    public void LiveAnchorBottomServerConfig$BottomBarConfig(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorBottomServerConfig$BottomBarConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(this.mLeftBottomBarListItems) && q.f(this.mRightBottomBarListItems)) {
          return false;
       }
       return true;
    }
}

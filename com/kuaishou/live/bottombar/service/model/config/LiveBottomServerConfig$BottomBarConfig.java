package com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class LiveBottomServerConfig$BottomBarConfig implements Serializable	// class@000d5e
{
    public List mLeftBottomBarListItems;
    public List mRightBottomBarListItems;
    public static final long serialVersionUID = 0x2d3b683dea93466c;

    public void LiveBottomServerConfig$BottomBarConfig(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveBottomServerConfig$BottomBarConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(this.mLeftBottomBarListItems) && q.f(this.mRightBottomBarListItems)) {
          return false;
       }
       return true;
    }
}

package com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFansGroupJoinButtonInfo implements Serializable	// class@000b29
{
    public String mContent;
    public int mJoinType;
    public int mOriginalPrice;
    public int mPrice;
    public static final long serialVersionUID = 0x2f22cff9a3b23210;

    public void LiveFansGroupJoinButtonInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFansGroupJoinButtonInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFansGroupJoinButtonInfo{joinType="+this.mJoinType+", content=\'"+this.mContent+'''+", price="+this.mPrice+'}';
    }
}

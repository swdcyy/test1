package com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$AnchorStatus;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveBlessingBagContainer$AnchorStatus extends Enum implements LiveBlessingBagContainer$b	// class@000a00
{
    public final int mValue;
    public static final LiveBlessingBagContainer$AnchorStatus[] $VALUES;
    public static final LiveBlessingBagContainer$AnchorStatus FINISH;
    public static final LiveBlessingBagContainer$AnchorStatus PREPARE;
    public static final LiveBlessingBagContainer$AnchorStatus SENDING;
    public static final LiveBlessingBagContainer$AnchorStatus UNKNOW;

    static {
       LiveBlessingBagContainer$AnchorStatus uAnchorStatu = new LiveBlessingBagContainer$AnchorStatus("UNKNOW", 0, 0);
       LiveBlessingBagContainer$AnchorStatus.UNKNOW = uAnchorStatu;
       LiveBlessingBagContainer$AnchorStatus uAnchorStatu1 = new LiveBlessingBagContainer$AnchorStatus("PREPARE", 1, 1);
       LiveBlessingBagContainer$AnchorStatus.PREPARE = uAnchorStatu1;
       LiveBlessingBagContainer$AnchorStatus uAnchorStatu2 = new LiveBlessingBagContainer$AnchorStatus("SENDING", 2, 2);
       LiveBlessingBagContainer$AnchorStatus.SENDING = uAnchorStatu2;
       LiveBlessingBagContainer$AnchorStatus uAnchorStatu3 = new LiveBlessingBagContainer$AnchorStatus("FINISH", 3, 3);
       LiveBlessingBagContainer$AnchorStatus.FINISH = uAnchorStatu3;
       LiveBlessingBagContainer$AnchorStatus[] uAnchorStatu4 = new LiveBlessingBagContainer$AnchorStatus[]{uAnchorStatu,uAnchorStatu1,uAnchorStatu2,uAnchorStatu3};
       LiveBlessingBagContainer$AnchorStatus.$VALUES = uAnchorStatu4;
    }
    public void LiveBlessingBagContainer$AnchorStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveBlessingBagContainer$AnchorStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBlessingBagContainer$AnchorStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBlessingBagContainer$AnchorStatus.class, p0);
    }
    public static LiveBlessingBagContainer$AnchorStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBlessingBagContainer$AnchorStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBlessingBagContainer$AnchorStatus.$VALUES.clone();
    }
    public String value(){
       Object obj = PatchProxy.apply(null, this, LiveBlessingBagContainer$AnchorStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mValue+"";
    }
}

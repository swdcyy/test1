package com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTreasureBoxModel$BoxType extends Enum	// class@001c60
{
    public int mType;
    public static final LiveTreasureBoxModel$BoxType[] $VALUES;
    public static final LiveTreasureBoxModel$BoxType GOLD;
    public static final LiveTreasureBoxModel$BoxType NORMAL;
    public static final LiveTreasureBoxModel$BoxType SIGN_IN;

    static {
       LiveTreasureBoxModel$BoxType uBoxType = new LiveTreasureBoxModel$BoxType("NORMAL", 0, 0);
       LiveTreasureBoxModel$BoxType.NORMAL = uBoxType;
       LiveTreasureBoxModel$BoxType uBoxType1 = new LiveTreasureBoxModel$BoxType("GOLD", 1, 1);
       LiveTreasureBoxModel$BoxType.GOLD = uBoxType1;
       LiveTreasureBoxModel$BoxType uBoxType2 = new LiveTreasureBoxModel$BoxType("SIGN_IN", 2, 2);
       LiveTreasureBoxModel$BoxType.SIGN_IN = uBoxType2;
       LiveTreasureBoxModel$BoxType[] uBoxTypeArra = new LiveTreasureBoxModel$BoxType[]{uBoxType,uBoxType1,uBoxType2};
       LiveTreasureBoxModel$BoxType.$VALUES = uBoxTypeArra;
    }
    public void LiveTreasureBoxModel$BoxType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveTreasureBoxModel$BoxType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTreasureBoxModel$BoxType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTreasureBoxModel$BoxType.class, p0);
    }
    public static LiveTreasureBoxModel$BoxType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTreasureBoxModel$BoxType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTreasureBoxModel$BoxType.$VALUES.clone();
    }
}

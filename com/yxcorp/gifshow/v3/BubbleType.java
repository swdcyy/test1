package com.yxcorp.gifshow.v3.BubbleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BubbleType extends Enum	// class@000d0e
{
    public static final BubbleType[] $VALUES;
    public static final BubbleType TYPE_WITH_EDIT_ACTION;

    static {
       BubbleType uBubbleType = new BubbleType("TYPE_WITH_EDIT_ACTION", 0);
       BubbleType.TYPE_WITH_EDIT_ACTION = uBubbleType;
       BubbleType[] uBubbleTypeA = new BubbleType[]{uBubbleType};
       BubbleType.$VALUES = uBubbleTypeA;
    }
    public void BubbleType(String p0,int p1){
       super(p0, p1);
    }
    public static BubbleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BubbleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BubbleType.class, p0);
    }
    public static BubbleType[] values(){
       Object obj = PatchProxy.apply(null, null, BubbleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BubbleType.$VALUES.clone();
    }
}

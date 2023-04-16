package com.yxcorp.plugin.setting.stencil.item.FansTopTagStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FansTopTagStyle extends Enum	// class@000912
{
    public static final FansTopTagStyle[] $VALUES;
    public static final FansTopTagStyle CARD;
    public static final FansTopTagStyle FREECARD;
    public static final FansTopTagStyle NONE;

    static {
       FansTopTagStyle uFansTopTagS1;
       FansTopTagStyle[] uFansTopTagS = new FansTopTagStyle[]{uFansTopTagS1,uFansTopTagS1,uFansTopTagS1};
       uFansTopTagS1 = new FansTopTagStyle("NONE", 0);
       FansTopTagStyle.NONE = uFansTopTagS1;
       uFansTopTagS1 = new FansTopTagStyle("CARD", 1);
       FansTopTagStyle.CARD = uFansTopTagS1;
       uFansTopTagS1 = new FansTopTagStyle("FREECARD", 2);
       FansTopTagStyle.FREECARD = uFansTopTagS1;
       FansTopTagStyle.$VALUES = uFansTopTagS;
    }
    public void FansTopTagStyle(String p0,int p1){
       super(p0, p1);
    }
    public static FansTopTagStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FansTopTagStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FansTopTagStyle.class, p0);
    }
    public static FansTopTagStyle[] values(){
       Object obj = PatchProxy.apply(null, null, FansTopTagStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FansTopTagStyle.$VALUES.clone();
    }
}

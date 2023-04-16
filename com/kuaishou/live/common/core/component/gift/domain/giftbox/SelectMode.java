package com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SelectMode extends Enum	// class@0011cb
{
    public static final SelectMode[] $VALUES;
    public static final SelectMode DEFAULT;
    public static final SelectMode LAST_SELECT;
    public static final SelectMode LAST_SEND;

    static {
       SelectMode selectMode;
       SelectMode[] selectModeAr = new SelectMode[]{selectMode,selectMode,selectMode};
       selectMode = new SelectMode("DEFAULT", 0);
       SelectMode.DEFAULT = selectMode;
       selectMode = new SelectMode("LAST_SEND", 1);
       SelectMode.LAST_SEND = selectMode;
       selectMode = new SelectMode("LAST_SELECT", 2);
       SelectMode.LAST_SELECT = selectMode;
       SelectMode.$VALUES = selectModeAr;
    }
    public void SelectMode(String p0,int p1){
       super(p0, p1);
    }
    public static SelectMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SelectMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SelectMode.class, p0);
    }
    public static SelectMode[] values(){
       Object obj = PatchProxy.apply(null, null, SelectMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SelectMode.$VALUES.clone();
    }
}

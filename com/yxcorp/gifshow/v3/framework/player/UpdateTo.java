package com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UpdateTo extends Enum	// class@001529
{
    public static final UpdateTo[] $VALUES;
    public static final UpdateTo BOTH;
    public static final UpdateTo NONE;
    public static final UpdateTo PLAYER;
    public static final UpdateTo TIMELINE;

    static {
       UpdateTo updateTo;
       UpdateTo[] updateToArra = new UpdateTo[]{updateTo,updateTo,updateTo,updateTo};
       updateTo = new UpdateTo("NONE", 0);
       UpdateTo.NONE = updateTo;
       updateTo = new UpdateTo("TIMELINE", 1);
       UpdateTo.TIMELINE = updateTo;
       updateTo = new UpdateTo("PLAYER", 2);
       UpdateTo.PLAYER = updateTo;
       updateTo = new UpdateTo("BOTH", 3);
       UpdateTo.BOTH = updateTo;
       UpdateTo.$VALUES = updateToArra;
    }
    public void UpdateTo(String p0,int p1){
       super(p0, p1);
    }
    public static UpdateTo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpdateTo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UpdateTo.class, p0);
    }
    public static UpdateTo[] values(){
       Object obj = PatchProxy.apply(null, null, UpdateTo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UpdateTo.$VALUES.clone();
    }
}

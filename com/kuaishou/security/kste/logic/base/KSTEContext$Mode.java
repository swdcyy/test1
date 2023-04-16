package com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSTEContext$Mode extends Enum	// class@000f13
{
    public final int value;
    public static final KSTEContext$Mode[] $VALUES;
    public static final KSTEContext$Mode ASYNC;
    public static final KSTEContext$Mode SYNC;

    static {
       KSTEContext$Mode mode = new KSTEContext$Mode("SYNC", 0, 0);
       KSTEContext$Mode.SYNC = mode;
       KSTEContext$Mode mode1 = new KSTEContext$Mode("ASYNC", 1, 1);
       KSTEContext$Mode.ASYNC = mode1;
       KSTEContext$Mode[] modeArray = new KSTEContext$Mode[]{mode,mode1};
       KSTEContext$Mode.$VALUES = modeArray;
    }
    public void KSTEContext$Mode(String p0,int p1,int p2){
       this.value = p2;
    }
    public static KSTEContext$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTEContext$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSTEContext$Mode.class, p0);
    }
    public static KSTEContext$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, KSTEContext$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSTEContext$Mode.$VALUES.clone();
    }
    public int getIntValue(){
       return this.value;
    }
}

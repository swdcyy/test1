package com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSecurityContext$Mode extends Enum	// class@0006c8
{
    public final int value;
    public static final KSecurityContext$Mode[] $VALUES;
    public static final KSecurityContext$Mode ASYNC;
    public static final KSecurityContext$Mode SYNC;

    static {
       KSecurityContext$Mode mode = new KSecurityContext$Mode("SYNC", 0, 0);
       KSecurityContext$Mode.SYNC = mode;
       KSecurityContext$Mode mode1 = new KSecurityContext$Mode("ASYNC", 1, 1);
       KSecurityContext$Mode.ASYNC = mode1;
       KSecurityContext$Mode[] modeArray = new KSecurityContext$Mode[]{mode,mode1};
       KSecurityContext$Mode.$VALUES = modeArray;
    }
    public void KSecurityContext$Mode(String p0,int p1,int p2){
       this.value = p2;
    }
    public static KSecurityContext$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurityContext$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSecurityContext$Mode.class, p0);
    }
    public static KSecurityContext$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, KSecurityContext$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSecurityContext$Mode.$VALUES.clone();
    }
    public int getIntValue(){
       return this.value;
    }
}

package com.kwai.yoda.cache.codecache.service.YodaKwService$Companion$CoreInitState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaKwService$Companion$CoreInitState extends Enum	// class@0011a9
{
    public static final YodaKwService$Companion$CoreInitState[] $VALUES;
    public static final YodaKwService$Companion$CoreInitState INITED;
    public static final YodaKwService$Companion$CoreInitState INITING;
    public static final YodaKwService$Companion$CoreInitState UNINITED;

    static {
       YodaKwService$Companion$CoreInitState uCompanion$C1;
       YodaKwService$Companion$CoreInitState[] uCompanion$C = new YodaKwService$Companion$CoreInitState[]{uCompanion$C1,uCompanion$C1,uCompanion$C1};
       uCompanion$C1 = new YodaKwService$Companion$CoreInitState("UNINITED", 0);
       YodaKwService$Companion$CoreInitState.UNINITED = uCompanion$C1;
       uCompanion$C1 = new YodaKwService$Companion$CoreInitState("INITING", 1);
       YodaKwService$Companion$CoreInitState.INITING = uCompanion$C1;
       uCompanion$C1 = new YodaKwService$Companion$CoreInitState("INITED", 2);
       YodaKwService$Companion$CoreInitState.INITED = uCompanion$C1;
       YodaKwService$Companion$CoreInitState.$VALUES = uCompanion$C;
    }
    public void YodaKwService$Companion$CoreInitState(String p0,int p1){
       super(p0, p1);
    }
    public static YodaKwService$Companion$CoreInitState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, YodaKwService$Companion$CoreInitState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(YodaKwService$Companion$CoreInitState.class, p0);
    }
    public static YodaKwService$Companion$CoreInitState[] values(){
       Object obj = PatchProxy.apply(null, null, YodaKwService$Companion$CoreInitState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaKwService$Companion$CoreInitState.$VALUES.clone();
    }
}

package com.kuaishou.security.kste.export.KSTEResult$Code;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSTEResult$Code extends Enum	// class@000f0f
{
    public final int value;
    public static final KSTEResult$Code[] $VALUES;
    public static final KSTEResult$Code INVOKE_FAIL;
    public static final KSTEResult$Code INVOKE_OFFLINE;
    public static final KSTEResult$Code INVOKE_OK;
    public static final KSTEResult$Code INVOKE_PARAM_INVALID;
    public static final KSTEResult$Code INVOKE_TIMEOUT;

    static {
       KSTEResult$Code uCode = new KSTEResult$Code("INVOKE_OK", 0, 0);
       KSTEResult$Code.INVOKE_OK = uCode;
       KSTEResult$Code uCode1 = new KSTEResult$Code("INVOKE_FAIL", 1, 1);
       KSTEResult$Code.INVOKE_FAIL = uCode1;
       KSTEResult$Code uCode2 = new KSTEResult$Code("INVOKE_TIMEOUT", 2, 2);
       KSTEResult$Code.INVOKE_TIMEOUT = uCode2;
       KSTEResult$Code uCode3 = new KSTEResult$Code("INVOKE_OFFLINE", 3, 3);
       KSTEResult$Code.INVOKE_OFFLINE = uCode3;
       KSTEResult$Code uCode4 = new KSTEResult$Code("INVOKE_PARAM_INVALID", 4, 4);
       KSTEResult$Code.INVOKE_PARAM_INVALID = uCode4;
       KSTEResult$Code[] uCodeArray = new KSTEResult$Code[]{uCode,uCode1,uCode2,uCode3,uCode4};
       KSTEResult$Code.$VALUES = uCodeArray;
    }
    public void KSTEResult$Code(String p0,int p1,int p2){
       this.value = p2;
    }
    public static KSTEResult$Code valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTEResult$Code.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSTEResult$Code.class, p0);
    }
    public static KSTEResult$Code[] values(){
       Object obj = PatchProxy.apply(null, null, KSTEResult$Code.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSTEResult$Code.$VALUES.clone();
    }
}

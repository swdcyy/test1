package com.facebook.react.bridge.CodeCacheResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CodeCacheResult extends Enum	// class@0011b4
{
    public static final CodeCacheResult[] $VALUES;
    public static final CodeCacheResult GOOD_END;
    public static final CodeCacheResult INITIALIZED;
    public static final CodeCacheResult NOT_DIRECT_BUFFER;
    public static final CodeCacheResult NO_BUFFER;
    public static final CodeCacheResult PRODUCE_FAILED;
    public static final CodeCacheResult REJECTED;
    public static final CodeCacheResult REQUEST_UPDATE;
    public static final CodeCacheResult UNINITIALIZED;

    static {
       CodeCacheResult uCodeCacheRe = new CodeCacheResult("UNINITIALIZED", 0);
       CodeCacheResult.UNINITIALIZED = uCodeCacheRe;
       CodeCacheResult uCodeCacheRe1 = new CodeCacheResult("INITIALIZED", 1);
       CodeCacheResult.INITIALIZED = uCodeCacheRe1;
       CodeCacheResult uCodeCacheRe2 = new CodeCacheResult("NO_BUFFER", 2);
       CodeCacheResult.NO_BUFFER = uCodeCacheRe2;
       CodeCacheResult uCodeCacheRe3 = new CodeCacheResult("NOT_DIRECT_BUFFER", 3);
       CodeCacheResult.NOT_DIRECT_BUFFER = uCodeCacheRe3;
       CodeCacheResult uCodeCacheRe4 = new CodeCacheResult("REJECTED", 4);
       CodeCacheResult.REJECTED = uCodeCacheRe4;
       CodeCacheResult uCodeCacheRe5 = new CodeCacheResult("PRODUCE_FAILED", 5);
       CodeCacheResult.PRODUCE_FAILED = uCodeCacheRe5;
       CodeCacheResult uCodeCacheRe6 = new CodeCacheResult("REQUEST_UPDATE", 6);
       CodeCacheResult.REQUEST_UPDATE = uCodeCacheRe6;
       CodeCacheResult uCodeCacheRe7 = new CodeCacheResult("GOOD_END", 7);
       CodeCacheResult.GOOD_END = uCodeCacheRe7;
       CodeCacheResult[] uCodeCacheRe8 = new CodeCacheResult[]{uCodeCacheRe,uCodeCacheRe1,uCodeCacheRe2,uCodeCacheRe3,uCodeCacheRe4,uCodeCacheRe5,uCodeCacheRe6,uCodeCacheRe7};
       CodeCacheResult.$VALUES = uCodeCacheRe8;
    }
    public void CodeCacheResult(String p0,int p1){
       super(p0, p1);
    }
    public static CodeCacheResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CodeCacheResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CodeCacheResult.class, p0);
    }
    public static CodeCacheResult[] values(){
       Object obj = PatchProxy.apply(null, null, CodeCacheResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CodeCacheResult.$VALUES.clone();
    }
}

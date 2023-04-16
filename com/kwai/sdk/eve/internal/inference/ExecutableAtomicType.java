package com.kwai.sdk.eve.internal.inference.ExecutableAtomicType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ExecutableAtomicType extends Enum	// class@001565
{
    public static final ExecutableAtomicType[] $VALUES;
    public static final ExecutableAtomicType Pipeline;
    public static final ExecutableAtomicType Processor;

    static {
       ExecutableAtomicType uExecutableA1;
       ExecutableAtomicType[] uExecutableA = new ExecutableAtomicType[]{uExecutableA1,uExecutableA1};
       uExecutableA1 = new ExecutableAtomicType("Processor", 0);
       ExecutableAtomicType.Processor = uExecutableA1;
       uExecutableA1 = new ExecutableAtomicType("Pipeline", 1);
       ExecutableAtomicType.Pipeline = uExecutableA1;
       ExecutableAtomicType.$VALUES = uExecutableA;
    }
    public void ExecutableAtomicType(String p0,int p1){
       super(p0, p1);
    }
    public static ExecutableAtomicType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ExecutableAtomicType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ExecutableAtomicType.class, p0);
    }
    public static ExecutableAtomicType[] values(){
       Object obj = PatchProxy.apply(null, null, ExecutableAtomicType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExecutableAtomicType.$VALUES.clone();
    }
}

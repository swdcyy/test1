package com.eclipsesource.v8.debug.DebugHandler$DebugEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DebugHandler$DebugEvent extends Enum	// class@000ff2
{
    public int index;
    public static final DebugHandler$DebugEvent[] $VALUES;
    public static final DebugHandler$DebugEvent AfterCompile;
    public static final DebugHandler$DebugEvent AsyncTaskEvent;
    public static final DebugHandler$DebugEvent BeforeCompile;
    public static final DebugHandler$DebugEvent Break;
    public static final DebugHandler$DebugEvent CompileError;
    public static final DebugHandler$DebugEvent Exception;
    public static final DebugHandler$DebugEvent NewFunction;
    public static final DebugHandler$DebugEvent PromiseError;
    public static final DebugHandler$DebugEvent Undefined;

    static {
       DebugHandler$DebugEvent uDebugEvent = new DebugHandler$DebugEvent("Undefined", 0, 0);
       DebugHandler$DebugEvent.Undefined = uDebugEvent;
       DebugHandler$DebugEvent uDebugEvent1 = new DebugHandler$DebugEvent("Break", 1, 1);
       DebugHandler$DebugEvent.Break = uDebugEvent1;
       DebugHandler$DebugEvent uDebugEvent2 = new DebugHandler$DebugEvent("Exception", 2, 2);
       DebugHandler$DebugEvent.Exception = uDebugEvent2;
       DebugHandler$DebugEvent uDebugEvent3 = new DebugHandler$DebugEvent("NewFunction", 3, 3);
       DebugHandler$DebugEvent.NewFunction = uDebugEvent3;
       DebugHandler$DebugEvent uDebugEvent4 = new DebugHandler$DebugEvent("BeforeCompile", 4, 4);
       DebugHandler$DebugEvent.BeforeCompile = uDebugEvent4;
       DebugHandler$DebugEvent uDebugEvent5 = new DebugHandler$DebugEvent("AfterCompile", 5, 5);
       DebugHandler$DebugEvent.AfterCompile = uDebugEvent5;
       DebugHandler$DebugEvent uDebugEvent6 = new DebugHandler$DebugEvent("CompileError", 6, 6);
       DebugHandler$DebugEvent.CompileError = uDebugEvent6;
       DebugHandler$DebugEvent uDebugEvent7 = new DebugHandler$DebugEvent("PromiseError", 7, 7);
       DebugHandler$DebugEvent.PromiseError = uDebugEvent7;
       DebugHandler$DebugEvent uDebugEvent8 = new DebugHandler$DebugEvent("AsyncTaskEvent", 8, 8);
       DebugHandler$DebugEvent.AsyncTaskEvent = uDebugEvent8;
       DebugHandler$DebugEvent[] uDebugEventA = new DebugHandler$DebugEvent[9];
       uDebugEventA[0] = uDebugEvent;
       uDebugEventA[1] = uDebugEvent1;
       uDebugEventA[2] = uDebugEvent2;
       uDebugEventA[3] = uDebugEvent3;
       uDebugEventA[4] = uDebugEvent4;
       uDebugEventA[5] = uDebugEvent5;
       uDebugEventA[6] = uDebugEvent6;
       uDebugEventA[7] = uDebugEvent7;
       uDebugEventA[8] = uDebugEvent8;
       DebugHandler$DebugEvent.$VALUES = uDebugEventA;
    }
    public void DebugHandler$DebugEvent(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static DebugHandler$DebugEvent valueOf(String p0){
       return Enum.valueOf(DebugHandler$DebugEvent.class, p0);
    }
    public static DebugHandler$DebugEvent[] values(){
       return DebugHandler$DebugEvent.$VALUES.clone();
    }
}

package com.eclipsesource.v8.debug.BreakEvent;
import com.eclipsesource.v8.debug.EventData;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.V8Array;

public class BreakEvent extends EventData	// class@000fed
{

    public void BreakEvent(V8Object p0){
       super(p0);
    }
    public int getSourceColumn(){
       return this.v8Object.executeIntegerFunction("sourceColumn", null);
    }
    public int getSourceLine(){
       return this.v8Object.executeIntegerFunction("sourceLine", null);
    }
    public String getSourceLineText(){
       return this.v8Object.executeStringFunction("sourceLineText", null);
    }
}

package com.eclipsesource.v8.debug.BreakHandler;
import com.eclipsesource.v8.debug.DebugHandler$DebugEvent;
import com.eclipsesource.v8.debug.ExecutionState;
import com.eclipsesource.v8.debug.EventData;
import com.eclipsesource.v8.V8Object;

public interface abstract BreakHandler	// class@000fee
{

    void onBreak(DebugHandler$DebugEvent p0,ExecutionState p1,EventData p2,V8Object p3);
}

package com.eclipsesource.v8.debug.ExecutionState;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.debug.mirror.Frame;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;
import java.lang.String;
import com.eclipsesource.v8.debug.StepAction;

public class ExecutionState implements Releasable	// class@000ff6
{
    public V8Object v8Object;

    public void ExecutionState(V8Object p0){
       super();
       this.v8Object = p0.twin();
    }
    public void close(){
       ExecutionState tv8Object = this.v8Object;
       if (tv8Object != null && !tv8Object.isReleased()) {
          this.v8Object.close();
          this.v8Object = null;
       }
       return;
    }
    public Frame getFrame(int p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       V8Object v8Object = this.v8Object.executeObjectFunction("frame", v8Array);
       Frame uFrame = new Frame(v8Object);
       v8Array.close();
       if (v8Object != null) {
          v8Object.close();
       }
       return uFrame;
    }
    public int getFrameCount(){
       return this.v8Object.executeIntegerFunction("frameCount", null);
    }
    public void prepareStep(StepAction p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0.index);
       this.v8Object.executeVoidFunction("prepareStep", v8Array);
       v8Array.close();
    }
    public void release(){
       this.close();
    }
}

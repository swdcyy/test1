package com.tkruntime.v8.V8OneTimeObject;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Value;

public class V8OneTimeObject extends V8Object	// class@000fc4
{

    public void V8OneTimeObject(V8 p0,long p1){
       super();
       this.v8 = p0;
       this.released = false;
       this.objectHandle = p1;
    }
}

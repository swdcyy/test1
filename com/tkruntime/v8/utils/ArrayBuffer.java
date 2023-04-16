package com.tkruntime.v8.utils.ArrayBuffer;
import com.tkruntime.v8.V8;
import java.nio.ByteBuffer;
import java.lang.Object;
import com.tkruntime.v8.V8ArrayBuffer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tkruntime.v8.V8Value;

public class ArrayBuffer	// class@000fd2
{
    public V8ArrayBuffer arrayBuffer;

    public void ArrayBuffer(V8 p0,ByteBuffer p1){
       super();
       this.arrayBuffer = new V8ArrayBuffer(p0, p1);
    }
    public void ArrayBuffer(V8ArrayBuffer p0){
       super();
       this.arrayBuffer = p0;
    }
    public V8ArrayBuffer getV8ArrayBuffer(){
       return this.arrayBuffer;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, ArrayBuffer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.arrayBuffer.isReleased() ^ 0x01);
    }
}

package com.eclipsesource.v8.utils.ArrayBuffer;
import com.eclipsesource.v8.V8;
import java.nio.ByteBuffer;
import java.lang.Object;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Value;

public class ArrayBuffer	// class@001011
{
    public V8ArrayBuffer arrayBuffer;

    public void ArrayBuffer(V8 p0,ByteBuffer p1){
       super();
       V8ArrayBuffer v8ArrayBuffe = new V8ArrayBuffer(p0, p1);
       this.arrayBuffer = v8ArrayBuffe.twin().setWeak();
       v8ArrayBuffe.close();
    }
    public void ArrayBuffer(V8ArrayBuffer p0){
       super();
       this.arrayBuffer = p0.twin().setWeak();
    }
    public V8ArrayBuffer getV8ArrayBuffer(){
       return this.arrayBuffer.twin();
    }
    public boolean isAvailable(){
       return (this.arrayBuffer.isReleased() ^ 0x01);
    }
}

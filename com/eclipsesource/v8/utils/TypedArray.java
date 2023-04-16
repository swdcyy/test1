package com.eclipsesource.v8.utils.TypedArray;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.utils.ArrayBuffer;
import java.lang.Object;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8TypedArray;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;

public class TypedArray	// class@001019
{
    public V8TypedArray typedArray;

    public void TypedArray(V8 p0,ArrayBuffer p1,int p2,int p3,int p4){
       super();
       V8ArrayBuffer v8ArrayBuffe = p1.getV8ArrayBuffer();
       V8TypedArray v8TypedArray = new V8TypedArray(p0, v8ArrayBuffe, p2, p3, p4);
       this.typedArray = v6.twin().setWeak();
       v8ArrayBuffe.close();
       v6.close();
    }
    public void TypedArray(V8TypedArray p0){
       super();
       this.typedArray = p0.twin().setWeak();
    }
    public V8TypedArray getV8TypedArray(){
       return this.typedArray.twin();
    }
    public boolean isAvailable(){
       return (this.typedArray.isReleased() ^ 0x01);
    }
}

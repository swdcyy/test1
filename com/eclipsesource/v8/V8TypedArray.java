package com.eclipsesource.v8.V8TypedArray;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8TypedArray$V8ArrayData;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.eclipsesource.v8.V8Value;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Float;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Byte;
import com.eclipsesource.v8.V8Object;

public class V8TypedArray extends V8Array	// class@000feb
{

    public void V8TypedArray(V8 p0){
       super(p0);
    }
    public void V8TypedArray(V8 p0,V8ArrayBuffer p1,int p2,int p3,int p4){
       super(p0, new V8TypedArray$V8ArrayData(p1, p3, p4, p2));
    }
    public static int getStructureSize(int p0){
       int i = 1;
       if (p0 != i) {
          int i1 = 2;
          if (p0 != i1) {
             if (p0 != 9) {
                switch (p0){
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                      return i1;
                    case 15:
                    case 16:
                    default:
                      throw new IllegalArgumentException("Cannot create a typed array of type "+V8Value.getStringRepresentation(p0));
                }
             }
             return i;
          }else {
             return 8;
          }
       }
       return 4;
    }
    public final void checkArrayProperties(V8TypedArray$V8ArrayData p0){
       this.checkOffset(p0);
       this.checkSize(p0);
    }
    public final void checkOffset(V8TypedArray$V8ArrayData p0){
       if (!(p0.offset % V8TypedArray.getStructureSize(p0.type))) {
          return;
       }
       throw new IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of "+V8TypedArray.getStructureSize(p0.type));
    }
    public final void checkSize(V8TypedArray$V8ArrayData p0){
       V8TypedArray$V8ArrayData size = p0.size;
       if (size < null) {
          throw new IllegalStateException("RangeError: Invalid typed array length");
       }
       if (((size * V8TypedArray.getStructureSize(p0.type)) + p0.offset) <= p0.buffer.limit()) {
          return;
       }
       throw new IllegalStateException("RangeError: Invalid typed array length");
    }
    public V8Value createTwin(){
       this.v8.checkThread();
       this.checkReleased();
       return new V8TypedArray(this.v8);
    }
    public final long createTypedArray(long p0,V8TypedArray$V8ArrayData p1){
       V8TypedArray$V8ArrayData type = p1.type;
       if (type == 1) {
          return this.v8.initNewV8Int32Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
       }
       if (type == 2) {
          return this.v8.initNewV8Float64Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
       }
       if (type == 9) {
          return this.v8.initNewV8Int8Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
       }
       switch (type){
           case 11:
             return this.v8.initNewV8UInt8Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           case 12:
             return this.v8.initNewV8UInt8ClampedArray(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           case 13:
             return this.v8.initNewV8Int16Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           case 14:
             return this.v8.initNewV8UInt16Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           case 15:
             return this.v8.initNewV8UInt32Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           case 16:
             return this.v8.initNewV8Float32Array(p0, p1.buffer.objectHandle, p1.offset, p1.size);
           default:
             throw new IllegalArgumentException("Cannot create a typed array of type "+V8Value.getStringRepresentation(p1.type));
       }
    }
    public Object get(int p0){
       this.v8.checkThread();
       this.checkReleased();
       int type = this.getType();
       if (type == 1) {
          return super.get(p0);
       }
       if (type == 2) {
          return super.get(p0);
       }
       if (type == 9) {
          return Byte.valueOf(super.get(p0).byteValue());
       }
       switch (type){
           case 11:
             return Short.valueOf((short)(super.get(p0).shortValue() & 0x00ff));
           case 12:
             return Short.valueOf((short)(super.get(p0).byteValue() & 0x00ff));
           case 13:
             return Short.valueOf(super.get(p0).shortValue());
           case 14:
             return Integer.valueOf((super.get(p0).intValue() & 0xffff));
           case 15:
             return Long.valueOf((-1 & super.get(p0).longValue()));
           case 16:
             return Float.valueOf(super.get(p0).floatValue());
           default:
             return null;
       }
    }
    public V8ArrayBuffer getBuffer(){
       return this.get("buffer");
    }
    public void initialize(long p0,Object p1){
       this.v8.checkThread();
       if (p1 == null) {
          super.initialize(p0, p1);
          return;
       }else {
          this.checkArrayProperties(p1);
          this.released = false;
          this.addObjectReference(this.createTypedArray(p0, p1));
          return;
       }
    }
}

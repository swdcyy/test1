package com.tkruntime.v8.V8TypedArray;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8TypedArray$V8ArrayData;
import java.lang.IllegalStateException;
import com.tkruntime.v8.V8ArrayBuffer;
import com.tkruntime.v8.V8Value;
import java.lang.Float;
import java.lang.Long;
import java.lang.Short;
import java.lang.Byte;
import com.tkruntime.v8.V8Object;

public class V8TypedArray extends V8Array	// class@000fd0
{

    public void V8TypedArray(V8 p0,long p1){
       super(p0, p1);
    }
    public static int getStructureSize(int p0){
       if (PatchProxy.isSupport(V8TypedArray.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, V8TypedArray.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
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
                      throw new IllegalArgumentException("Cannot create a typed array of type = "+p0);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, V8TypedArray.class, "4")) {
          return;
       }
       this.checkOffset(p0);
       this.checkSize(p0);
       return;
    }
    public final void checkOffset(V8TypedArray$V8ArrayData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8TypedArray.class, "6")) {
          return;
       }
       if (!(p0.offset % V8TypedArray.getStructureSize(p0.type))) {
          return;
       }
       throw new IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of "+V8TypedArray.getStructureSize(p0.type));
    }
    public final void checkSize(V8TypedArray$V8ArrayData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8TypedArray.class, "5")) {
          return;
       }
       V8TypedArray$V8ArrayData size = p0.size;
       if (size < null) {
          throw new IllegalStateException("RangeError: Invalid typed array length");
       }
       if (((size * V8TypedArray.getStructureSize(p0.type)) + p0.offset) <= p0.buffer.limit()) {
          return;
       }
       throw new IllegalStateException("RangeError: Invalid typed array length");
    }
    public Object get(int p0){
       if (PatchProxy.isSupport(V8TypedArray.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8TypedArray.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       int type = this.getType();
       if (type != 1) {
          if (type != 2) {
             if (type != 9) {
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
             }else {
                return Byte.valueOf(super.get(p0).byteValue());
             }
          }else {
             return super.get(p0);
          }
       }else {
          return super.get(p0);
       }
    }
    public V8ArrayBuffer getBuffer(){
       Object obj = PatchProxy.apply(null, this, V8TypedArray.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.get("buffer");
    }
}

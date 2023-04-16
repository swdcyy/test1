package com.tkruntime.v8.V8ArrayBuffer;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8;
import java.lang.Integer;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.nio.Buffer;
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;
import java.nio.IntBuffer;
import java.lang.Short;

public class V8ArrayBuffer extends V8Value	// class@000fb3
{
    public ByteBuffer byteBuffer;

    public void V8ArrayBuffer(V8 p0,int p1){
       super(p0);
       this.initialize(p0.getV8RuntimePtr(), Integer.valueOf(p1));
       ByteBuffer uByteBuffer = p0.createV8ArrayBufferBackingStore(p0.getV8RuntimePtr(), this.objectHandle, p1);
       this.byteBuffer = uByteBuffer;
       uByteBuffer.order(ByteOrder.nativeOrder());
    }
    public void V8ArrayBuffer(V8 p0,long p1,ByteBuffer p2){
       super();
       this.v8 = p0;
       this.objectHandle = p1;
       this.released = false;
       this.byteBuffer = p2;
       this.addObjectReference(p1);
    }
    public void V8ArrayBuffer(V8 p0,ByteBuffer p1){
       super(p0);
       if (p1 == null) {
          p1 = ByteBuffer.allocateDirect(0);
       }
       if (p1.isDirect()) {
          this.initialize(p0.getV8RuntimePtr(), p1);
          this.byteBuffer = p1;
          p1.order(ByteOrder.nativeOrder());
          return;
       }else {
          throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
       }
    }
    public final byte[] array(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.array();
    }
    public final int arrayOffset(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.arrayOffset();
    }
    public final int capacity(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.capacity();
    }
    public final V8ArrayBuffer clear(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.clear();
       return this;
    }
    public V8ArrayBuffer compact(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.compact();
       return this;
    }
    public final V8ArrayBuffer flip(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.flip();
       return this;
    }
    public byte get(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.byteValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.get();
    }
    public byte get(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.byteValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.get(p0);
    }
    public V8ArrayBuffer get(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8ArrayBuffer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.get(p0);
       return this;
    }
    public V8ArrayBuffer get(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, V8ArrayBuffer.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.get(p0, p1, p2);
       return this;
    }
    public char getChar(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.charValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getChar();
    }
    public char getChar(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.charValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getChar(p0);
    }
    public double getDouble(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getDouble();
    }
    public double getDouble(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getDouble(p0);
    }
    public float getFloat(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getFloat();
    }
    public float getFloat(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "49");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getFloat(p0);
    }
    public int getInt(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getInt();
    }
    public int getInt(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getInt(p0);
    }
    public long getLong(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getLong();
    }
    public long getLong(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getLong(p0);
    }
    public short getShort(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.shortValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getShort();
    }
    public short getShort(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj.shortValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getShort(p0);
    }
    public final boolean hasArray(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.hasArray();
    }
    public final boolean hasRemaining(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.hasRemaining();
    }
    public void initialize(long p0,Object p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8ArrayBuffer.class, "1")) {
          return;
       }
       boolean b = false;
       this.releaseCheck = b;
       this.v8.checkThread();
       if (p1 instanceof ByteBuffer) {
          V8Value tv8 = this.v8;
          this.objectHandle = tv8.initNewV8ArrayBuffer(tv8.getV8RuntimePtr(), p1, p1.limit());
       }else {
          p1 = this.v8;
          this.objectHandle = p1.initNewV8ArrayBuffer(p1.getV8RuntimePtr(), p1.intValue());
       }
       this.released = b;
       this.addObjectReference(this.objectHandle);
       return;
    }
    public boolean isDirect(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.isDirect();
    }
    public boolean isReadOnly(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.isReadOnly();
    }
    public int limit(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.limit();
    }
    public final V8ArrayBuffer limit(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.limit(p0);
       return this;
    }
    public final V8ArrayBuffer mark(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.mark();
       return this;
    }
    public final V8ArrayBuffer order(ByteOrder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8ArrayBuffer.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.order(p0);
       return this;
    }
    public final ByteOrder order(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.order();
    }
    public final int position(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.position();
    }
    public final V8ArrayBuffer position(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.position(p0);
       return this;
    }
    public V8ArrayBuffer put(byte p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Byte.valueOf(p0), this, V8ArrayBuffer.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public V8ArrayBuffer put(int p0,byte p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Byte.valueOf(p1), this, V8ArrayBuffer.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0, p1);
       return this;
    }
    public V8ArrayBuffer put(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8ArrayBuffer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public final V8ArrayBuffer put(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8ArrayBuffer.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public V8ArrayBuffer put(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, V8ArrayBuffer.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0, p1, p2);
       return this;
    }
    public V8ArrayBuffer putChar(char p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Character.valueOf(p0), this, V8ArrayBuffer.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putChar(p0);
       return this;
    }
    public V8ArrayBuffer putChar(int p0,char p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Character.valueOf(p1), this, V8ArrayBuffer.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putChar(p0, p1);
       return this;
    }
    public V8ArrayBuffer putDouble(double p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, V8ArrayBuffer.class, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putDouble(p0);
       return this;
    }
    public V8ArrayBuffer putDouble(int p0,double p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Double.valueOf(p1), this, V8ArrayBuffer.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putDouble(p0, p1);
       return this;
    }
    public V8ArrayBuffer putFloat(float p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, V8ArrayBuffer.class, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putFloat(p0);
       return this;
    }
    public V8ArrayBuffer putFloat(int p0,float p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, V8ArrayBuffer.class, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putFloat(p0, p1);
       return this;
    }
    public V8ArrayBuffer putInt(int p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8ArrayBuffer.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putInt(p0);
       return this;
    }
    public V8ArrayBuffer putInt(int p0,int p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, V8ArrayBuffer.class, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.asIntBuffer().put(p0, p1);
       return this;
    }
    public V8ArrayBuffer putLong(int p0,long p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, V8ArrayBuffer.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putLong(p0, p1);
       return this;
    }
    public V8ArrayBuffer putLong(long p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8ArrayBuffer.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putLong(p0);
       return this;
    }
    public V8ArrayBuffer putShort(int p0,short p1){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Short.valueOf(p1), this, V8ArrayBuffer.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putShort(p0, p1);
       return this;
    }
    public V8ArrayBuffer putShort(short p0){
       if (PatchProxy.isSupport(V8ArrayBuffer.class)) {
          Object obj = PatchProxy.applyOneRefs(Short.valueOf(p0), this, V8ArrayBuffer.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putShort(p0);
       return this;
    }
    public final int remaining(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.remaining();
    }
    public final V8ArrayBuffer reset(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.reset();
       return this;
    }
    public final V8ArrayBuffer rewind(){
       Object obj = PatchProxy.apply(null, this, V8ArrayBuffer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.rewind();
       return this;
    }
}

package com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.V8;
import java.lang.Integer;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class V8ArrayBuffer extends V8Value	// class@000fdd
{
    public ByteBuffer byteBuffer;

    public void V8ArrayBuffer(V8 p0,int p1){
       super(p0);
       this.initialize(p0.getV8RuntimePtr(), Integer.valueOf(p1));
       ByteBuffer uByteBuffer = p0.createV8ArrayBufferBackingStore(p0.getV8RuntimePtr(), this.objectHandle, p1);
       this.byteBuffer = uByteBuffer;
       uByteBuffer.order(ByteOrder.nativeOrder());
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
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.array();
    }
    public final int arrayOffset(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.arrayOffset();
    }
    public final int capacity(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.capacity();
    }
    public final V8ArrayBuffer clear(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.clear();
       return this;
    }
    public V8ArrayBuffer compact(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.compact();
       return this;
    }
    public V8Value createTwin(){
       return new V8ArrayBuffer(this.v8, this.byteBuffer);
    }
    public int doubleLimit(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.asDoubleBuffer().limit();
    }
    public final V8ArrayBuffer flip(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.flip();
       return this;
    }
    public int floatLimit(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.asFloatBuffer().limit();
    }
    public byte get(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.get();
    }
    public byte get(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.get(p0);
    }
    public V8ArrayBuffer get(byte[] p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.get(p0);
       return this;
    }
    public V8ArrayBuffer get(byte[] p0,int p1,int p2){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.get(p0, p1, p2);
       return this;
    }
    public char getChar(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getChar();
    }
    public char getChar(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getChar(p0);
    }
    public double getDouble(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getDouble();
    }
    public double getDouble(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getDouble(p0);
    }
    public float getFloat(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getFloat();
    }
    public float getFloat(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getFloat(p0);
    }
    public int getInt(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getInt();
    }
    public int getInt(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getInt(p0);
    }
    public long getLong(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getLong();
    }
    public long getLong(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getLong(p0);
    }
    public short getShort(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getShort();
    }
    public short getShort(int p0){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.getShort(p0);
    }
    public final boolean hasArray(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.hasArray();
    }
    public final boolean hasRemaining(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.hasRemaining();
    }
    public void initialize(long p0,Object p1){
       V8Value tv8;
       this.v8.checkThread();
       if (p1 instanceof ByteBuffer) {
          tv8 = this.v8;
          this.objectHandle = tv8.initNewV8ArrayBuffer(tv8.getV8RuntimePtr(), p1, p1.limit());
       }else {
          tv8 = this.v8;
          this.objectHandle = tv8.initNewV8ArrayBuffer(tv8.getV8RuntimePtr(), p1.intValue());
       }
       this.released = false;
       this.addObjectReference(this.objectHandle);
       return;
    }
    public int intLimit(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.asIntBuffer().limit();
    }
    public boolean isDirect(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.isDirect();
    }
    public boolean isReadOnly(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.isReadOnly();
    }
    public int limit(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.limit();
    }
    public final V8ArrayBuffer limit(int p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.limit(p0);
       return this;
    }
    public final V8ArrayBuffer mark(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.mark();
       return this;
    }
    public final V8ArrayBuffer order(ByteOrder p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.order(p0);
       return this;
    }
    public final ByteOrder order(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.order();
    }
    public final int position(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.position();
    }
    public final V8ArrayBuffer position(int p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.position(p0);
       return this;
    }
    public V8ArrayBuffer put(byte p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public V8ArrayBuffer put(int p0,byte p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0, p1);
       return this;
    }
    public V8ArrayBuffer put(ByteBuffer p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public final V8ArrayBuffer put(byte[] p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0);
       return this;
    }
    public V8ArrayBuffer put(byte[] p0,int p1,int p2){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.put(p0, p1, p2);
       return this;
    }
    public V8ArrayBuffer putChar(char p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putChar(p0);
       return this;
    }
    public V8ArrayBuffer putChar(int p0,char p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putChar(p0, p1);
       return this;
    }
    public V8ArrayBuffer putDouble(double p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putDouble(p0);
       return this;
    }
    public V8ArrayBuffer putDouble(int p0,double p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putDouble(p0, p1);
       return this;
    }
    public V8ArrayBuffer putFloat(float p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putFloat(p0);
       return this;
    }
    public V8ArrayBuffer putFloat(int p0,float p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putFloat(p0, p1);
       return this;
    }
    public V8ArrayBuffer putInt(int p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putInt(p0);
       return this;
    }
    public V8ArrayBuffer putInt(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.asIntBuffer().put(p0, p1);
       return this;
    }
    public V8ArrayBuffer putLong(int p0,long p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putLong(p0, p1);
       return this;
    }
    public V8ArrayBuffer putLong(long p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putLong(p0);
       return this;
    }
    public V8ArrayBuffer putShort(int p0,short p1){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putShort(p0, p1);
       return this;
    }
    public V8ArrayBuffer putShort(short p0){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.putShort(p0);
       return this;
    }
    public final int remaining(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.remaining();
    }
    public final V8ArrayBuffer reset(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.reset();
       return this;
    }
    public final V8ArrayBuffer rewind(){
       this.v8.checkThread();
       this.checkReleased();
       this.byteBuffer.rewind();
       return this;
    }
    public int shortLimit(){
       this.v8.checkThread();
       this.checkReleased();
       return this.byteBuffer.asShortBuffer().limit();
    }
    public V8ArrayBuffer twin(){
       this.v8.checkThread();
       this.checkReleased();
       return super.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}

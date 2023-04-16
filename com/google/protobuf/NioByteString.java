package com.google.protobuf.NioByteString;
import com.google.protobuf.ByteString$LeafByteString;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Collections;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;
import java.nio.Buffer;
import com.google.protobuf.ByteString;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.Utf8;
import com.google.protobuf.CodedInputStream;
import java.io.InputStream;
import com.google.protobuf.NioByteString$1;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.nio.charset.Charset;
import com.google.protobuf.ByteOutput;
import java.io.OutputStream;
import com.google.protobuf.ByteBufferWriter;

public final class NioByteString extends ByteString$LeafByteString	// class@00048f
{
    public final ByteBuffer buffer;

    public void NioByteString(ByteBuffer p0){
       super();
       Internal.checkNotNull(p0, "buffer");
       this.buffer = p0.slice().order(ByteOrder.nativeOrder());
    }
    public ByteBuffer asReadOnlyByteBuffer(){
       return this.buffer.asReadOnlyBuffer();
    }
    public List asReadOnlyByteBufferList(){
       return Collections.singletonList(this.asReadOnlyByteBuffer());
    }
    public byte byteAt(int p0){
       try{
          return this.buffer.get(p0);
       }catch(java.lang.ArrayIndexOutOfBoundsException e2){
          throw e2;
       }catch(java.lang.IndexOutOfBoundsException e2){
          throw new ArrayIndexOutOfBoundsException(e2.getMessage());
       }
    }
    public void copyTo(ByteBuffer p0){
       p0.put(this.buffer.slice());
    }
    public void copyToInternal(byte[] p0,int p1,int p2,int p3){
       ByteBuffer uByteBuffer = this.buffer.slice();
       uByteBuffer.position(p1);
       uByteBuffer.get(p0, p2, p3);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       boolean b1 = false;
       if (!p0 instanceof ByteString) {
          return b1;
       }
       ByteString uByteString = p0;
       if (this.size() != uByteString.size()) {
          return b1;
       }
       if (!this.size()) {
          return b;
       }
       if (p0 instanceof NioByteString) {
          return this.buffer.equals(p0.buffer);
       }
       if (p0 instanceof RopeByteString) {
          return p0.equals(this);
       }
       return this.buffer.equals(uByteString.asReadOnlyByteBuffer());
    }
    public boolean equalsRange(ByteString p0,int p1,int p2){
       return this.substring(0, p2).equals(p0.substring(p1, (p2 + p1)));
    }
    public byte internalByteAt(int p0){
       return this.byteAt(p0);
    }
    public boolean isValidUtf8(){
       return Utf8.isValidUtf8(this.buffer);
    }
    public CodedInputStream newCodedInput(){
       return CodedInputStream.newInstance(this.buffer, true);
    }
    public InputStream newInput(){
       return new NioByteString$1(this);
    }
    public int partialHash(int p0,int p1,int p2){
       int i = p1;
       int i1 = p1 + p2;
       while (i < i1) {
          p0 = p0 * 31;
          p0 = p0 + this.buffer.get(i);
          i = i + 1;
       }
       return p0;
    }
    public int partialIsValidUtf8(int p0,int p1,int p2){
       return Utf8.partialIsValidUtf8(p0, this.buffer, p1, (p2 + p1));
    }
    public final void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }
    public int size(){
       return this.buffer.remaining();
    }
    public final ByteBuffer slice(int p0,int p1){
       if (p0 >= this.buffer.position() && (p1 <= this.buffer.limit() && p0 <= p1)) {
          ByteBuffer uByteBuffer = this.buffer.slice();
          uByteBuffer.position((p0 - this.buffer.position()));
          uByteBuffer.limit((p1 - this.buffer.position()));
          return uByteBuffer;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
          throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", objArray));
       }
    }
    public ByteString substring(int p0,int p1){
       try{
          return new NioByteString(this.slice(p0, p1));
       }catch(java.lang.ArrayIndexOutOfBoundsException e1){
          throw e1;
       }catch(java.lang.IndexOutOfBoundsException e1){
          throw new ArrayIndexOutOfBoundsException(e1.getMessage());
       }
    }
    public String toStringInternal(Charset p0){
       byte[] uobyteArray;
       int i;
       int i1;
       if (this.buffer.hasArray()) {
          uobyteArray = this.buffer.array();
          i = this.buffer.arrayOffset() + this.buffer.position();
          i1 = this.buffer.remaining();
       }else {
          uobyteArray = this.toByteArray();
          i = 0;
          i1 = uobyteArray.length;
       }
       return new String(uobyteArray, i, i1, p0);
    }
    public final Object writeReplace(){
       return ByteString.copyFrom(this.buffer.slice());
    }
    public void writeTo(ByteOutput p0){
       p0.writeLazy(this.buffer.slice());
    }
    public void writeTo(OutputStream p0){
       p0.write(this.toByteArray());
    }
    public void writeToInternal(OutputStream p0,int p1,int p2){
       if (this.buffer.hasArray()) {
          p0.write(this.buffer.array(), ((this.buffer.arrayOffset() + this.buffer.position()) + p1), p2);
          return;
       }else {
          ByteBufferWriter.write(this.slice(p1, (p2 + p1)), p0);
          return;
       }
    }
}

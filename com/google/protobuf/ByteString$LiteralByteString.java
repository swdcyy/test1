package com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.ByteString$LeafByteString;
import java.lang.Object;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Collections;
import java.lang.System;
import com.google.protobuf.ByteString;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.protobuf.Utf8;
import com.google.protobuf.CodedInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.ByteString$BoundedByteString;
import java.nio.charset.Charset;
import com.google.protobuf.ByteOutput;
import java.io.OutputStream;

public class ByteString$LiteralByteString extends ByteString$LeafByteString	// class@0003d3
{
    public final byte[] bytes;
    public static final long serialVersionUID = 0x1;

    public void ByteString$LiteralByteString(byte[] p0){
       super();
       Objects.requireNonNull(p0);
       this.bytes = p0;
    }
    public final ByteBuffer asReadOnlyByteBuffer(){
       return ByteBuffer.wrap(this.bytes, this.getOffsetIntoBytes(), this.size()).asReadOnlyBuffer();
    }
    public final List asReadOnlyByteBufferList(){
       return Collections.singletonList(this.asReadOnlyByteBuffer());
    }
    public byte byteAt(int p0){
       return this.bytes[p0];
    }
    public final void copyTo(ByteBuffer p0){
       p0.put(this.bytes, this.getOffsetIntoBytes(), this.size());
    }
    public void copyToInternal(byte[] p0,int p1,int p2,int p3){
       System.arraycopy(this.bytes, p1, p0, p2, p3);
    }
    public final boolean equals(Object p0){
       int b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ByteString) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       if (!this.size()) {
          return b;
       }
       if (!p0 instanceof ByteString$LiteralByteString) {
          return p0.equals(this);
       }
       b = this.peekCachedHashCode();
       int i = p0.peekCachedHashCode();
       if (b && (i && b != i)) {
          return false;
       }
       return this.equalsRange(p0, false, this.size());
    }
    public final boolean equalsRange(ByteString p0,int p1,int p2){
       if (p2 > p0.size()) {
          throw new IllegalArgumentException("Length too large: "+p2+this.size());
       }
       int i = p1 + p2;
       if (i > p0.size()) {
          throw new IllegalArgumentException("Ran off end of other: "+p1+", "+p2+", "+p0.size());
       }
       if (!p0 instanceof ByteString$LiteralByteString) {
          return p0.substring(p1, i).equals(this.substring(false, p2));
       }
       ByteString$LiteralByteString tbytes = this.bytes;
       ByteString$LiteralByteString bytes = p0.bytes;
       int i1 = this.getOffsetIntoBytes() + p2;
       p2 = this.getOffsetIntoBytes();
       int i2 = p0.getOffsetIntoBytes() + p1;
       while (true) {
          if (p2 >= i1) {
             return true;
          }
          if (tbytes[p2] != bytes[i2]) {
             break ;
          }else {
             p2++;
             i2++;
          }
       }
       return false;
    }
    public int getOffsetIntoBytes(){
       return 0;
    }
    public byte internalByteAt(int p0){
       return this.bytes[p0];
    }
    public final boolean isValidUtf8(){
       int offsetIntoBy = this.getOffsetIntoBytes();
       return Utf8.isValidUtf8(this.bytes, offsetIntoBy, (this.size() + offsetIntoBy));
    }
    public final CodedInputStream newCodedInput(){
       return CodedInputStream.newInstance(this.bytes, this.getOffsetIntoBytes(), this.size(), true);
    }
    public final InputStream newInput(){
       return new ByteArrayInputStream(this.bytes, this.getOffsetIntoBytes(), this.size());
    }
    public final int partialHash(int p0,int p1,int p2){
       return Internal.partialHash(p0, this.bytes, (this.getOffsetIntoBytes() + p1), p2);
    }
    public final int partialIsValidUtf8(int p0,int p1,int p2){
       int i = this.getOffsetIntoBytes() + p1;
       return Utf8.partialIsValidUtf8(p0, this.bytes, i, (p2 + i));
    }
    public int size(){
       return this.bytes.length;
    }
    public final ByteString substring(int p0,int p1){
       p1 = ByteString.checkRange(p0, p1, this.size());
       if (!p1) {
          return ByteString.EMPTY;
       }
       return new ByteString$BoundedByteString(this.bytes, (this.getOffsetIntoBytes() + p0), p1);
    }
    public final String toStringInternal(Charset p0){
       return new String(this.bytes, this.getOffsetIntoBytes(), this.size(), p0);
    }
    public final void writeTo(ByteOutput p0){
       p0.writeLazy(this.bytes, this.getOffsetIntoBytes(), this.size());
    }
    public final void writeTo(OutputStream p0){
       p0.write(this.toByteArray());
    }
    public final void writeToInternal(OutputStream p0,int p1,int p2){
       p0.write(this.bytes, (this.getOffsetIntoBytes() + p1), p2);
    }
}

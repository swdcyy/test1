package com.google.protobuf.ByteString$BoundedByteString;
import com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.ByteString;
import java.lang.Object;
import java.lang.System;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;

public final class ByteString$BoundedByteString extends ByteString$LiteralByteString	// class@0003ce
{
    public final int bytesLength;
    public final int bytesOffset;
    public static final long serialVersionUID = 0x1;

    public void ByteString$BoundedByteString(byte[] p0,int p1,int p2){
       super(p0);
       ByteString.checkRange(p1, (p1 + p2), p0.length);
       this.bytesOffset = p1;
       this.bytesLength = p2;
    }
    public byte byteAt(int p0){
       ByteString.checkIndex(p0, this.size());
       return this.bytes[(this.bytesOffset + p0)];
    }
    public void copyToInternal(byte[] p0,int p1,int p2,int p3){
       System.arraycopy(this.bytes, (this.getOffsetIntoBytes() + p1), p0, p2, p3);
    }
    public int getOffsetIntoBytes(){
       return this.bytesOffset;
    }
    public byte internalByteAt(int p0){
       return this.bytes[(this.bytesOffset + p0)];
    }
    public final void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
    public int size(){
       return this.bytesLength;
    }
    public Object writeReplace(){
       return ByteString.wrap(this.toByteArray());
    }
}

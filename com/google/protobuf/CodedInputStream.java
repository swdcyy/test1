package com.google.protobuf.CodedInputStream;
import java.lang.Object;
import com.google.protobuf.CodedInputStream$1;
import java.io.InputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedInputStream$StreamDecoder;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Iterable;
import com.google.protobuf.CodedInputStream$UnsafeDirectNioDecoder;
import com.google.protobuf.IterableByteBufferInputStream;
import java.util.Iterator;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedInputStream$IterableDirectByteBufferDecoder;
import com.google.protobuf.CodedInputStream$ArrayDecoder;
import java.lang.Throwable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import java.lang.StringBuilder;
import com.google.protobuf.CodedOutputStream;

public abstract class CodedInputStream	// class@0003e2
{
    public int recursionDepth;
    public int recursionLimit;
    public boolean shouldDiscardUnknownFields;
    public int sizeLimit;
    public CodedInputStreamReader wrapper;

    public void CodedInputStream(){
       super();
       this.recursionLimit = 100;
       this.sizeLimit = Integer.MAX_VALUE;
       this.shouldDiscardUnknownFields = false;
    }
    public void CodedInputStream(CodedInputStream$1 p0){
       super();
    }
    public static int decodeZigZag32(int p0){
       return ((- (p0 & 0x01)) ^ (p0 >> 1));
    }
    public static long decodeZigZag64(long p0){
       return ((- (p0 & 1)) ^ (p0 >> 1));
    }
    public static CodedInputStream newInstance(InputStream p0){
       return CodedInputStream.newInstance(p0, 4096);
    }
    public static CodedInputStream newInstance(InputStream p0,int p1){
       if (p1 <= 0) {
          throw new IllegalArgumentException("bufferSize must be > 0");
       }
       if (p0 == null) {
          return CodedInputStream.newInstance(Internal.EMPTY_BYTE_ARRAY);
       }
       return new CodedInputStream$StreamDecoder(p0, p1, null);
    }
    public static CodedInputStream newInstance(Iterable p0){
       if (!CodedInputStream$UnsafeDirectNioDecoder.isSupported()) {
          return CodedInputStream.newInstance(new IterableByteBufferInputStream(p0));
       }
       return CodedInputStream.newInstance(p0, false);
    }
    public static CodedInputStream newInstance(Iterable p0,boolean p1){
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          ByteBuffer uByteBuffer = iterator.next();
          i1 = i1 + uByteBuffer.remaining();
          if (uByteBuffer.hasArray()) {
             i = i | 0x01;
          }else if(uByteBuffer.isDirect()){
             i = i | 0x02;
          }else {
             i = i | 0x04;
          }
       }
       if (i == 2) {
          return new CodedInputStream$IterableDirectByteBufferDecoder(p0, i1, p1, null);
       }
       return CodedInputStream.newInstance(new IterableByteBufferInputStream(p0));
    }
    public static CodedInputStream newInstance(ByteBuffer p0){
       return CodedInputStream.newInstance(p0, false);
    }
    public static CodedInputStream newInstance(ByteBuffer p0,boolean p1){
       if (p0.hasArray()) {
          return CodedInputStream.newInstance(p0.array(), (p0.arrayOffset() + p0.position()), p0.remaining(), p1);
       }
       if (p0.isDirect() && CodedInputStream$UnsafeDirectNioDecoder.isSupported()) {
          return new CodedInputStream$UnsafeDirectNioDecoder(p0, p1, null);
       }
       int i = p0.remaining();
       byte[] uobyteArray = new byte[i];
       p0.duplicate().get(uobyteArray);
       return CodedInputStream.newInstance(uobyteArray, 0, i, true);
    }
    public static CodedInputStream newInstance(byte[] p0){
       return CodedInputStream.newInstance(p0, 0, p0.length);
    }
    public static CodedInputStream newInstance(byte[] p0,int p1,int p2){
       return CodedInputStream.newInstance(p0, p1, p2, false);
    }
    public static CodedInputStream newInstance(byte[] p0,int p1,int p2,boolean p3){
       CodedInputStream$ArrayDecoder uArrayDecode = v6;
       byte[] uobyteArray = p0;
       int i = p1;
       int i1 = p2;
       boolean b = p3;
       try{
          uArrayDecode = new CodedInputStream$ArrayDecoder(uobyteArray, i, i1, b, null);
          v6.pushLimit(p2);
          return v6;
       }catch(com.google.protobuf.InvalidProtocolBufferException e7){
          throw new IllegalArgumentException(e7);
       }
    }
    public static int readRawVarint32(int p0,InputStream p1){
       int i2;
       if (!(p0 & 0x0080)) {
          return p0;
       }
       p0 = p0 & 0x7f;
       int i = 7;
       while (true) {
          int i1 = -1;
          if (i < 32) {
             i2 = p1.read();
             if (i2 == i1) {
                throw InvalidProtocolBufferException.truncatedMessage();
             }
             i1 = i2 & 0x7f;
             i1 = i1 << i;
             p0 = p0 | i1;
             i2 = i2 & 0x0080;
             if (!i2) {
                break ;
             }else {
                i = i + 7;
             }
          }else {
             while (true) {
                if (i >= 64) {
                   throw InvalidProtocolBufferException.malformedVarint();
                }
                i2 = p1.read();
                if (i2 == i1) {
                   throw InvalidProtocolBufferException.truncatedMessage();
                }
                i2 = i2 & 0x0080;
                if (!i2) {
                   return p0;
                }
                i = i + 7;
             }
          }
       }
       return p0;
    }
    public static int readRawVarint32(InputStream p0){
       int i = p0.read();
       if (i != -1) {
          return CodedInputStream.readRawVarint32(i, p0);
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public abstract void checkLastTagWas(int p0);
    public final void discardUnknownFields(){
       this.shouldDiscardUnknownFields = true;
    }
    public abstract void enableAliasing(boolean p0);
    public abstract int getBytesUntilLimit();
    public abstract int getLastTag();
    public abstract int getTotalBytesRead();
    public abstract boolean isAtEnd();
    public abstract void popLimit(int p0);
    public abstract int pushLimit(int p0);
    public abstract boolean readBool();
    public abstract byte[] readByteArray();
    public abstract ByteBuffer readByteBuffer();
    public abstract ByteString readBytes();
    public abstract double readDouble();
    public abstract int readEnum();
    public abstract int readFixed32();
    public abstract long readFixed64();
    public abstract float readFloat();
    public abstract MessageLite readGroup(int p0,Parser p1,ExtensionRegistryLite p2);
    public abstract void readGroup(int p0,MessageLite$Builder p1,ExtensionRegistryLite p2);
    public abstract int readInt32();
    public abstract long readInt64();
    public abstract MessageLite readMessage(Parser p0,ExtensionRegistryLite p1);
    public abstract void readMessage(MessageLite$Builder p0,ExtensionRegistryLite p1);
    public abstract byte readRawByte();
    public abstract byte[] readRawBytes(int p0);
    public abstract int readRawLittleEndian32();
    public abstract long readRawLittleEndian64();
    public abstract int readRawVarint32();
    public abstract long readRawVarint64();
    public abstract long readRawVarint64SlowPath();
    public abstract int readSFixed32();
    public abstract long readSFixed64();
    public abstract int readSInt32();
    public abstract long readSInt64();
    public abstract String readString();
    public abstract String readStringRequireUtf8();
    public abstract int readTag();
    public abstract int readUInt32();
    public abstract long readUInt64();
    public abstract void readUnknownGroup(int p0,MessageLite$Builder p1);
    public abstract void resetSizeCounter();
    public final int setRecursionLimit(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Recursion limit cannot be negative: "+p0);
       }
       CodedInputStream trecursionLi = this.recursionLimit;
       this.recursionLimit = p0;
       return trecursionLi;
    }
    public final int setSizeLimit(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Size limit cannot be negative: "+p0);
       }
       CodedInputStream tsizeLimit = this.sizeLimit;
       this.sizeLimit = p0;
       return tsizeLimit;
    }
    public final boolean shouldDiscardUnknownFields(){
       return this.shouldDiscardUnknownFields;
    }
    public abstract boolean skipField(int p0);
    public abstract boolean skipField(int p0,CodedOutputStream p1);
    public abstract void skipMessage();
    public abstract void skipMessage(CodedOutputStream p0);
    public abstract void skipRawBytes(int p0);
    public final void unsetDiscardUnknownFields(){
       this.shouldDiscardUnknownFields = false;
    }
}

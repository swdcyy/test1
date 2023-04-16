package com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import java.lang.Double;
import java.lang.Float;
import com.google.protobuf.nano.MessageNano;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.protobuf.nano.InternalNano;
import java.nio.charset.Charset;

public final class CodedInputByteBufferNano	// class@0005c2
{
    public final byte[] buffer;
    public int bufferPos;
    public int bufferSize;
    public int bufferSizeAfterLimit;
    public int bufferStart;
    public int currentLimit;
    public int lastTag;
    public int recursionDepth;
    public int recursionLimit;
    public int sizeLimit;

    public void CodedInputByteBufferNano(byte[] p0,int p1,int p2){
       super();
       this.currentLimit = Integer.MAX_VALUE;
       this.recursionLimit = 64;
       this.sizeLimit = 0x4000000;
       this.buffer = p0;
       this.bufferStart = p1;
       this.bufferSize = p2 + p1;
       this.bufferPos = p1;
    }
    public static int decodeZigZag32(int p0){
       return ((- (p0 & 0x01)) ^ (p0 >> 1));
    }
    public static long decodeZigZag64(long p0){
       return ((- (p0 & 1)) ^ (p0 >> 1));
    }
    public static CodedInputByteBufferNano newInstance(byte[] p0){
       return CodedInputByteBufferNano.newInstance(p0, 0, p0.length);
    }
    public static CodedInputByteBufferNano newInstance(byte[] p0,int p1,int p2){
       return new CodedInputByteBufferNano(p0, p1, p2);
    }
    public void checkLastTagWas(int p0){
       if (this.lastTag == p0) {
          return;
       }
       throw InvalidProtocolBufferNanoException.invalidEndTag();
    }
    public int getBytesUntilLimit(){
       CodedInputByteBufferNano tcurrentLimi = this.currentLimit;
       if (tcurrentLimi == Integer.MAX_VALUE) {
          return -1;
       }
       return (tcurrentLimi - this.bufferPos);
    }
    public byte[] getData(int p0,int p1){
       if (!p1) {
          return WireFormatNano.EMPTY_BYTES;
       }
       byte[] uobyteArray = new byte[p1];
       System.arraycopy(this.buffer, (this.bufferStart + p0), uobyteArray, 0, p1);
       return uobyteArray;
    }
    public int getPosition(){
       return (this.bufferPos - this.bufferStart);
    }
    public boolean isAtEnd(){
       boolean b = (this.bufferPos == this.bufferSize)? true: false;
       return b;
    }
    public void popLimit(int p0){
       this.currentLimit = p0;
       this.recomputeBufferSizeAfterLimit();
    }
    public int pushLimit(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferNanoException.negativeSize();
       }
       p0 = p0 + this.bufferPos;
       CodedInputByteBufferNano tcurrentLimi = this.currentLimit;
       if (p0 > tcurrentLimi) {
          throw InvalidProtocolBufferNanoException.truncatedMessage();
       }
       this.currentLimit = p0;
       this.recomputeBufferSizeAfterLimit();
       return tcurrentLimi;
    }
    public boolean readBool(){
       boolean b = (this.readRawVarint32())? true: false;
       return b;
    }
    public byte[] readBytes(){
       int i = this.readRawVarint32();
       CodedInputByteBufferNano tbufferPos = this.bufferPos;
       if (i <= (this.bufferSize - tbufferPos) && i > 0) {
          byte[] uobyteArray = new byte[i];
          System.arraycopy(this.buffer, tbufferPos, uobyteArray, 0, i);
          this.bufferPos = this.bufferPos + i;
          return uobyteArray;
       }else if(!i){
          return WireFormatNano.EMPTY_BYTES;
       }else {
          return this.readRawBytes(i);
       }
    }
    public double readDouble(){
       return Double.longBitsToDouble(this.readRawLittleEndian64());
    }
    public int readEnum(){
       return this.readRawVarint32();
    }
    public int readFixed32(){
       return this.readRawLittleEndian32();
    }
    public long readFixed64(){
       return this.readRawLittleEndian64();
    }
    public float readFloat(){
       return Float.intBitsToFloat(this.readRawLittleEndian32());
    }
    public void readGroup(MessageNano p0,int p1){
       CodedInputByteBufferNano trecursionDe = this.recursionDepth;
       if (trecursionDe >= this.recursionLimit) {
          throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
       }
       this.recursionDepth = trecursionDe + 1;
       p0.mergeFrom(this);
       this.checkLastTagWas(WireFormatNano.makeTag(p1, 4));
       this.recursionDepth = this.recursionDepth - 1;
       return;
    }
    public int readInt32(){
       return this.readRawVarint32();
    }
    public long readInt64(){
       return this.readRawVarint64();
    }
    public void readMessage(MessageNano p0){
       int i = this.readRawVarint32();
       if (this.recursionDepth >= this.recursionLimit) {
          throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
       }
       this.recursionDepth = this.recursionDepth + 1;
       p0.mergeFrom(this);
       this.checkLastTagWas(0);
       this.recursionDepth = this.recursionDepth - 1;
       this.popLimit(this.pushLimit(i));
       return;
    }
    public Object readPrimitiveField(int p0){
       switch (p0){
           case 1:
             return Double.valueOf(this.readDouble());
           case 2:
             return Float.valueOf(this.readFloat());
           case 3:
             return Long.valueOf(this.readInt64());
           case 4:
             return Long.valueOf(this.readUInt64());
           case 5:
             return Integer.valueOf(this.readInt32());
           case 6:
             return Long.valueOf(this.readFixed64());
           case 7:
             return Integer.valueOf(this.readFixed32());
           case 8:
             return Boolean.valueOf(this.readBool());
           case 9:
             return this.readString();
           case 12:
             return this.readBytes();
           case 13:
             return Integer.valueOf(this.readUInt32());
           case 14:
             return Integer.valueOf(this.readEnum());
           case 15:
             return Integer.valueOf(this.readSFixed32());
           case 16:
             return Long.valueOf(this.readSFixed64());
           case 17:
             return Integer.valueOf(this.readSInt32());
           case 18:
             return Long.valueOf(this.readSInt64());
           default:
          label_0003 :
             throw new IllegalArgumentException("Unknown type "+p0);
       }
    }
    public byte readRawByte(){
       CodedInputByteBufferNano tbufferPos = this.bufferPos;
       if (tbufferPos == this.bufferSize) {
          throw InvalidProtocolBufferNanoException.truncatedMessage();
       }
       this.bufferPos = tbufferPos + 1;
       return this.buffer[tbufferPos];
    }
    public byte[] readRawBytes(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferNanoException.negativeSize();
       }
       CodedInputByteBufferNano tbufferPos = this.bufferPos;
       CodedInputByteBufferNano tcurrentLimi = this.currentLimit;
       if ((tbufferPos + p0) <= tcurrentLimi) {
          if (p0 > (this.bufferSize - tbufferPos)) {
             throw InvalidProtocolBufferNanoException.truncatedMessage();
          }
          byte[] uobyteArray = new byte[p0];
          System.arraycopy(this.buffer, tbufferPos, uobyteArray, 0, p0);
          this.bufferPos = this.bufferPos + p0;
          return uobyteArray;
       }else {
          this.skipRawBytes((tcurrentLimi - tbufferPos));
          throw InvalidProtocolBufferNanoException.truncatedMessage();
       }
    }
    public int readRawLittleEndian32(){
       return ((((this.readRawByte() & 0x00ff) | ((this.readRawByte() & 0x00ff) << 8)) | ((this.readRawByte() & 0x00ff) << 16)) | ((this.readRawByte() & 0x00ff) << 24));
    }
    public long readRawLittleEndian64(){
       return ((((((((((long)this.readRawByte() & 255) << 8) | ((long)this.readRawByte() & 255)) | (((long)this.readRawByte() & 255) << 16)) | (((long)this.readRawByte() & 255) << 24)) | (((long)this.readRawByte() & 255) << 32)) | (((long)this.readRawByte() & 255) << 40)) | (((long)this.readRawByte() & 255) << 48)) | (((long)this.readRawByte() & 255) << 56));
    }
    public int readRawVarint32(){
       int b = this.readRawByte();
       if (b >= 0) {
          return b;
       }
       b = b & 0x7f;
       int b1 = this.readRawByte();
       if (b1 >= 0) {
          b1 = b1 << 7;
       }else {
          b = b | ((b1 & 0x7f) << 7);
          b1 = this.readRawByte();
          if (b1 >= 0) {
             b1 = b1 << 14;
          }else {
             b = b | ((b1 & 0x7f) << 14);
             b1 = this.readRawByte();
             if (b1 >= 0) {
                b1 = b1 << 21;
             }else {
                b1 = this.readRawByte();
                b = (b | ((b1 & 0x7f) << 21)) | (b1 << 28);
                if (b1 < 0) {
                   b1 = 0;
                   while (true) {
                      if (b1 >= 5) {
                         throw InvalidProtocolBufferNanoException.malformedVarint();
                      }
                      if (this.readRawByte() >= 0) {
                         break ;
                      }else {
                         b1 = b1 + 1;
                      }
                   }
                   return b;
                }else {
                label_0050 :
                   return b;
                }
             }
          }
       }
       b = b | b1;
       goto label_0050 ;
    }
    public long readRawVarint64(){
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l >= 64) {
             throw InvalidProtocolBufferNanoException.malformedVarint();
          }
          int b = this.readRawByte();
          int i = b & 0x7f;
          long l2 = (long)i << l;
          l1 = l1 | l2;
          b = b & 0x0080;
          if (!b) {
             break ;
          }else {
             l = l + 7;
          }
       }
       return l1;
    }
    public int readSFixed32(){
       return this.readRawLittleEndian32();
    }
    public long readSFixed64(){
       return this.readRawLittleEndian64();
    }
    public int readSInt32(){
       return CodedInputByteBufferNano.decodeZigZag32(this.readRawVarint32());
    }
    public long readSInt64(){
       return CodedInputByteBufferNano.decodeZigZag64(this.readRawVarint64());
    }
    public String readString(){
       int i = this.readRawVarint32();
       CodedInputByteBufferNano tbufferPos = this.bufferPos;
       if (i > (this.bufferSize - tbufferPos) || i <= 0) {
          return new String(this.readRawBytes(i), InternalNano.UTF_8);
       }
       this.bufferPos = this.bufferPos + i;
       return new String(this.buffer, tbufferPos, i, InternalNano.UTF_8);
    }
    public int readTag(){
       if (this.isAtEnd()) {
          this.lastTag = 0;
          return 0;
       }else {
          int i = this.readRawVarint32();
          this.lastTag = i;
          if (i) {
             return i;
          }
          throw InvalidProtocolBufferNanoException.invalidTag();
       }
    }
    public int readUInt32(){
       return this.readRawVarint32();
    }
    public long readUInt64(){
       return this.readRawVarint64();
    }
    public final void recomputeBufferSizeAfterLimit(){
       int i = this.bufferSize + this.bufferSizeAfterLimit;
       this.bufferSize = i;
       CodedInputByteBufferNano tcurrentLimi = this.currentLimit;
       if (i > tcurrentLimi) {
          int i1 = i - tcurrentLimi;
          this.bufferSizeAfterLimit = i1;
          this.bufferSize = i - i1;
       }else {
          this.bufferSizeAfterLimit = 0;
       }
       return;
    }
    public void resetSizeCounter(){
    }
    public void rewindToPosition(int p0){
       CodedInputByteBufferNano tbufferStart = this.bufferStart;
       if (p0 > (this.bufferPos - tbufferStart)) {
          throw new IllegalArgumentException("Position "+p0+" is beyond current "+(this.bufferPos - this.bufferStart));
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("Bad position "+p0);
       }
       this.bufferPos = tbufferStart + p0;
       return;
    }
    public int setRecursionLimit(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Recursion limit cannot be negative: "+p0);
       }
       CodedInputByteBufferNano trecursionLi = this.recursionLimit;
       this.recursionLimit = p0;
       return trecursionLi;
    }
    public int setSizeLimit(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("Size limit cannot be negative: "+p0);
       }
       CodedInputByteBufferNano tsizeLimit = this.sizeLimit;
       this.sizeLimit = p0;
       return tsizeLimit;
    }
    public boolean skipField(int p0){
       int tagWireType = WireFormatNano.getTagWireType(p0);
       if (tagWireType) {
          if (tagWireType != 1) {
             if (tagWireType != 2) {
                if (tagWireType != 3) {
                   if (tagWireType == 4) {
                      return false;
                   }
                   if (tagWireType != 5) {
                      throw InvalidProtocolBufferNanoException.invalidWireType();
                   }
                   this.readRawLittleEndian32();
                   return true;
                }else {
                   this.skipMessage();
                   this.checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(p0), 4));
                   return true;
                }
             }else {
                this.skipRawBytes(this.readRawVarint32());
                return true;
             }
          }else {
             this.readRawLittleEndian64();
             return true;
          }
       }else {
          this.readInt32();
          return true;
       }
    }
    public void skipMessage(){
       int i;
       do {
          i = this.readTag();
       } while (!i || !this.skipField(i));
       return;
    }
    public void skipRawBytes(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferNanoException.negativeSize();
       }
       CodedInputByteBufferNano tbufferPos = this.bufferPos;
       CodedInputByteBufferNano tcurrentLimi = this.currentLimit;
       if ((tbufferPos + p0) <= tcurrentLimi) {
          if (p0 > (this.bufferSize - tbufferPos)) {
             throw InvalidProtocolBufferNanoException.truncatedMessage();
          }
          this.bufferPos = tbufferPos + p0;
          return;
       }else {
          this.skipRawBytes((tcurrentLimi - tbufferPos));
          throw InvalidProtocolBufferNanoException.truncatedMessage();
       }
    }
}

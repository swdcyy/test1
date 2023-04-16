package com.google.protobuf.CodedInputStream$IterableDirectByteBufferDecoder;
import com.google.protobuf.CodedInputStream;
import java.lang.Iterable;
import com.google.protobuf.CodedInputStream$1;
import java.util.Iterator;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.ByteString;
import java.lang.Double;
import java.lang.Float;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import com.google.protobuf.WireFormat;
import com.google.protobuf.MessageLite$Builder;
import java.lang.Math;
import java.lang.String;
import java.nio.charset.Charset;
import com.google.protobuf.Utf8;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.CodedOutputStream;
import java.nio.Buffer;

public final class CodedInputStream$IterableDirectByteBufferDecoder extends CodedInputStream	// class@0003dd
{
    public int bufferSizeAfterCurrentLimit;
    public long currentAddress;
    public ByteBuffer currentByteBuffer;
    public long currentByteBufferLimit;
    public long currentByteBufferPos;
    public long currentByteBufferStartPos;
    public int currentLimit;
    public boolean enableAliasing;
    public boolean immutable;
    public Iterable input;
    public Iterator iterator;
    public int lastTag;
    public int startOffset;
    public int totalBufferSize;
    public int totalBytesRead;

    public void CodedInputStream$IterableDirectByteBufferDecoder(Iterable p0,int p1,boolean p2){
       super(null);
       this.currentLimit = Integer.MAX_VALUE;
       this.totalBufferSize = p1;
       this.input = p0;
       this.iterator = p0.iterator();
       this.immutable = p2;
       int i = 0;
       this.totalBytesRead = i;
       this.startOffset = i;
       if (!p1) {
          this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
          this.currentByteBufferPos = 0;
          this.currentByteBufferStartPos = 0;
          this.currentByteBufferLimit = 0;
          this.currentAddress = 0;
       }else {
          this.tryGetNextByteBuffer();
       }
       return;
    }
    public void CodedInputStream$IterableDirectByteBufferDecoder(Iterable p0,int p1,boolean p2,CodedInputStream$1 p3){
       super(p0, p1, p2);
    }
    public void checkLastTagWas(int p0){
       if (this.lastTag == p0) {
          return;
       }
       throw InvalidProtocolBufferException.invalidEndTag();
    }
    public final long currentRemaining(){
       return (this.currentByteBufferLimit - this.currentByteBufferPos);
    }
    public void enableAliasing(boolean p0){
       this.enableAliasing = p0;
    }
    public int getBytesUntilLimit(){
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentLimi = this.currentLimit;
       if (tcurrentLimi == Integer.MAX_VALUE) {
          return -1;
       }
       return (tcurrentLimi - this.getTotalBytesRead());
    }
    public int getLastTag(){
       return this.lastTag;
    }
    public final void getNextByteBuffer(){
       if (!this.iterator.hasNext()) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.tryGetNextByteBuffer();
       return;
    }
    public int getTotalBytesRead(){
       return (int)(((long)(this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }
    public boolean isAtEnd(){
       boolean b = (!(((long)this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos) - (long)this.totalBufferSize)? true: false;
       return b;
    }
    public void popLimit(int p0){
       this.currentLimit = p0;
       this.recomputeBufferSizeAfterLimit();
    }
    public int pushLimit(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       p0 = p0 + this.getTotalBytesRead();
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentLimi = this.currentLimit;
       if (p0 > tcurrentLimi) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.currentLimit = p0;
       this.recomputeBufferSizeAfterLimit();
       return tcurrentLimi;
    }
    public boolean readBool(){
       boolean b = (this.readRawVarint64())? true: false;
       return b;
    }
    public byte[] readByteArray(){
       return this.readRawBytes(this.readRawVarint32());
    }
    public ByteBuffer readByteBuffer(){
       int i = this.readRawVarint32();
       if (i > 0) {
          long l = (long)i;
          if (l - this.currentRemaining() <= 0) {
             if (this.immutable == null && this.enableAliasing != null) {
                long l1 = this.currentByteBufferPos + l;
                this.currentByteBufferPos = l1;
                CodedInputStream$IterableDirectByteBufferDecoder tcurrentAddr = this.currentAddress;
                return this.slice((int)((l1 - tcurrentAddr) - l), (int)(l1 - tcurrentAddr));
             }else {
                byte[] uobyteArray = new byte[i];
                UnsafeUtil.copyMemory(this.currentByteBufferPos, uobyteArray, 0, l);
                this.currentByteBufferPos = this.currentByteBufferPos + l;
                return ByteBuffer.wrap(uobyteArray);
             }
          }
       }
       if (i > 0 && i <= this.remaining()) {
          byte[] uobyteArray1 = new byte[i];
          this.readRawBytesTo(uobyteArray1, 0, i);
          return ByteBuffer.wrap(uobyteArray1);
       }else if(!i){
          return Internal.EMPTY_BYTE_BUFFER;
       }else if(i < 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public ByteString readBytes(){
       int i = this.readRawVarint32();
       if (i > 0) {
          long l = (long)i;
          CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
          if (l - (this.currentByteBufferLimit - tcurrentByte) <= 0) {
             if (this.immutable != null && this.enableAliasing != null) {
                int i1 = (int)(tcurrentByte - this.currentAddress);
                this.currentByteBufferPos = this.currentByteBufferPos + l;
                return ByteString.wrap(this.slice(i1, (i + i1)));
             }else {
                byte[] uobyteArray = new byte[i];
                UnsafeUtil.copyMemory(tcurrentByte, uobyteArray, 0, l);
                this.currentByteBufferPos = this.currentByteBufferPos + l;
                return ByteString.wrap(uobyteArray);
             }
          }
       }
       if (i > 0 && i <= this.remaining()) {
          byte[] uobyteArray1 = new byte[i];
          this.readRawBytesTo(uobyteArray1, 0, i);
          return ByteString.wrap(uobyteArray1);
       }else if(!i){
          return ByteString.EMPTY;
       }else if(i < 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
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
    public MessageLite readGroup(int p0,Parser p1,ExtensionRegistryLite p2){
       CodedInputStream trecursionDe = this.recursionDepth;
       if (trecursionDe >= this.recursionLimit) {
          throw InvalidProtocolBufferException.recursionLimitExceeded();
       }
       this.recursionDepth = trecursionDe + 1;
       MessageLite messageLite = p1.parsePartialFrom(this, p2);
       this.checkLastTagWas(WireFormat.makeTag(p0, 4));
       this.recursionDepth = this.recursionDepth - 1;
       return messageLite;
    }
    public void readGroup(int p0,MessageLite$Builder p1,ExtensionRegistryLite p2){
       CodedInputStream trecursionDe = this.recursionDepth;
       if (trecursionDe >= this.recursionLimit) {
          throw InvalidProtocolBufferException.recursionLimitExceeded();
       }
       this.recursionDepth = trecursionDe + 1;
       p1.mergeFrom(this, p2);
       this.checkLastTagWas(WireFormat.makeTag(p0, 4));
       this.recursionDepth = this.recursionDepth - 1;
       return;
    }
    public int readInt32(){
       return this.readRawVarint32();
    }
    public long readInt64(){
       return this.readRawVarint64();
    }
    public MessageLite readMessage(Parser p0,ExtensionRegistryLite p1){
       int i = this.readRawVarint32();
       if (this.recursionDepth >= this.recursionLimit) {
          throw InvalidProtocolBufferException.recursionLimitExceeded();
       }
       this.recursionDepth = this.recursionDepth + 1;
       MessageLite messageLite = p0.parsePartialFrom(this, p1);
       this.checkLastTagWas(0);
       this.recursionDepth = this.recursionDepth - 1;
       this.popLimit(this.pushLimit(i));
       return messageLite;
    }
    public void readMessage(MessageLite$Builder p0,ExtensionRegistryLite p1){
       int i = this.readRawVarint32();
       if (this.recursionDepth >= this.recursionLimit) {
          throw InvalidProtocolBufferException.recursionLimitExceeded();
       }
       this.recursionDepth = this.recursionDepth + 1;
       p0.mergeFrom(this, p1);
       this.checkLastTagWas(0);
       this.recursionDepth = this.recursionDepth - 1;
       this.popLimit(this.pushLimit(i));
       return;
    }
    public byte readRawByte(){
       if (!this.currentRemaining()) {
          this.getNextByteBuffer();
       }
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
       this.currentByteBufferPos = 1 + tcurrentByte;
       return UnsafeUtil.getByte(tcurrentByte);
    }
    public byte[] readRawBytes(int p0){
       if (p0 >= 0) {
          long l = (long)p0;
          if (l - this.currentRemaining() <= 0) {
             byte[] uobyteArray = new byte[p0];
             UnsafeUtil.copyMemory(this.currentByteBufferPos, uobyteArray, 0, l);
             this.currentByteBufferPos = this.currentByteBufferPos + l;
             return uobyteArray;
          }
       }
       if (p0 >= 0 && p0 <= this.remaining()) {
          byte[] uobyteArray1 = new byte[p0];
          this.readRawBytesTo(uobyteArray1, 0, p0);
          return uobyteArray1;
       }else if(p0 <= 0){
          if (!p0) {
             return Internal.EMPTY_BYTE_ARRAY;
          }else {
             throw InvalidProtocolBufferException.negativeSize();
          }
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void readRawBytesTo(byte[] p0,int p1,int p2){
       if (p2 >= 0 && p2 <= this.remaining()) {
          int i = p2;
          while (i > 0) {
             if (!this.currentRemaining()) {
                this.getNextByteBuffer();
             }
             int i1 = Math.min(i, (int)this.currentRemaining());
             int i2 = p2 - i;
             i2 = i2 + p1;
             long l = (long)i2;
             long l1 = (long)i1;
             UnsafeUtil.copyMemory(this.currentByteBufferPos, p0, l, l1);
             i = i - i1;
             long l2 = this.currentByteBufferPos + l1;
             this.currentByteBufferPos = l2;
          }
          return;
       }else if(p2 <= 0){
          if (!p2) {
             return;
          }
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public int readRawLittleEndian32(){
       long l = 4;
       if (this.currentRemaining() - l < 0) {
          return ((((this.readRawByte() & 0x00ff) | ((this.readRawByte() & 0x00ff) << 8)) | ((this.readRawByte() & 0x00ff) << 16)) | ((this.readRawByte() & 0x00ff) << 24));
       }
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
       this.currentByteBufferPos = l + tcurrentByte;
       return (((UnsafeUtil.getByte((tcurrentByte + 3)) & 0x00ff) << 24) | (((UnsafeUtil.getByte(tcurrentByte) & 0x00ff) | ((UnsafeUtil.getByte((1 + tcurrentByte)) & 0x00ff) << 8)) | ((UnsafeUtil.getByte((2 + tcurrentByte)) & 0x00ff) << 16)));
    }
    public long readRawLittleEndian64(){
       long l = 56;
       long l1 = 48;
       long l2 = 40;
       long l3 = 32;
       long l4 = 24;
       long l5 = 16;
       long l6 = 8;
       long l7 = 8;
       if (this.currentRemaining() - l7 < 0) {
          return (((((((((long)this.readRawByte() & 255) | (((long)this.readRawByte() & 255) << l6)) | (((long)this.readRawByte() & 255) << l5)) | (((long)this.readRawByte() & 255) << l4)) | (((long)this.readRawByte() & 255) << l3)) | (((long)this.readRawByte() & 255) << l2)) | (((long)this.readRawByte() & 255) << l1)) | (((long)this.readRawByte() & 255) << l));
       }
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
       this.currentByteBufferPos = l7 + tcurrentByte;
       return ((((long)UnsafeUtil.getByte((tcurrentByte + 7)) & 255) << l) | ((((((((long)UnsafeUtil.getByte(tcurrentByte) & 255) | (((long)UnsafeUtil.getByte((1 + tcurrentByte)) & 255) << l6)) | (((long)UnsafeUtil.getByte((2 + tcurrentByte)) & 255) << l5)) | (((long)UnsafeUtil.getByte((3 + tcurrentByte)) & 255) << l4)) | (((long)UnsafeUtil.getByte((4 + tcurrentByte)) & 255) << l3)) | (((long)UnsafeUtil.getByte((5 + tcurrentByte)) & 255) << l2)) | (((long)UnsafeUtil.getByte((6 + tcurrentByte)) & 255) << l1)));
    }
    public int readRawVarint32(){
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
       if (!this.currentByteBufferLimit - tcurrentByte) {
       }else {
          long l = tcurrentByte + 1;
          int bytex = UnsafeUtil.getByte(tcurrentByte);
          if (bytex >= 0) {
             this.currentByteBufferPos = this.currentByteBufferPos + 1;
             return bytex;
          }else if((this.currentByteBufferLimit - this.currentByteBufferPos) - 10 < 0){
             long l1 = l + 1;
             bytex = bytex ^ (UnsafeUtil.getByte(l) << 7);
             if (bytex < 0) {
                bytex = bytex ^ 0x80;
             }else {
                l = l1 + 1;
                bytex = bytex ^ (UnsafeUtil.getByte(l1) << 14);
                if (bytex >= 0) {
                   bytex = bytex ^ 0x3f80;
                }else {
                   l1 = l + 1;
                   bytex = bytex ^ (UnsafeUtil.getByte(l) << 21);
                   if (bytex < 0) {
                      bytex = bytex ^ -2080896;
                   }else {
                      l = l1 + 1;
                      byte bytex1 = UnsafeUtil.getByte(l1);
                      bytex = (bytex ^ (bytex1 << 28)) ^ 0xfe03f80;
                      if (bytex1 < 0) {
                         l1 = l + 1;
                         if (UnsafeUtil.getByte(l) < 0) {
                            l = l1 + 1;
                            if (UnsafeUtil.getByte(l1) < 0) {
                               l1 = l + 1;
                               if (UnsafeUtil.getByte(l) < 0) {
                                  l = l1 + 1;
                                  if (UnsafeUtil.getByte(l1) < 0) {
                                     l1 = l + 1;
                                     if (UnsafeUtil.getByte(l) >= 0) {
                                     label_0090 :
                                        this.currentByteBufferPos = l1;
                                        return bytex;
                                     }
                                  }
                               }else {
                                  goto label_0090 ;
                               }
                            }
                         }else {
                            goto label_0090 ;
                         }
                      }
                   }
                }
                l1 = l;
                goto label_0090 ;
             }
          }
       }
       return (int)this.readRawVarint64SlowPath();
    }
    public long readRawVarint64(){
       long l3;
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
       if (!this.currentByteBufferLimit - tcurrentByte) {
       }else {
          long l = 1;
          long l1 = tcurrentByte + l;
          int bytex = UnsafeUtil.getByte(tcurrentByte);
          if (bytex >= 0) {
             this.currentByteBufferPos = this.currentByteBufferPos + l;
             return (long)bytex;
          }else if((this.currentByteBufferLimit - this.currentByteBufferPos) - 10 < 0){
             long l2 = l1 + l;
             bytex = bytex ^ (UnsafeUtil.getByte(l1) << 7);
             if (bytex < 0) {
                bytex = bytex ^ 0x80;
             label_0035 :
                l3 = (long)bytex;
             }else {
                l1 = l2 + l;
                bytex = bytex ^ (UnsafeUtil.getByte(l2) << 14);
                if (bytex >= 0) {
                   l3 = (long)(bytex ^ 0x3f80);
                }else {
                   l2 = l1 + l;
                   bytex = bytex ^ (UnsafeUtil.getByte(l1) << 21);
                   if (bytex < 0) {
                      bytex = bytex ^ -2080896;
                      goto label_0035 ;
                   }else {
                      l1 = l2 + l;
                      l3 = (long)bytex ^ ((long)UnsafeUtil.getByte(l2) << 28);
                      l2 = 0;
                      if (l3 - l2 >= 0) {
                         l = 0xfe03f80;
                      }else {
                         long l4 = l1 + l;
                         l3 = l3 ^ ((long)UnsafeUtil.getByte(l1) << 35);
                         if (l3 - l2 < 0) {
                            l = 0xfffffff80fe03f80;
                         }else {
                            l1 = l4 + l;
                            l3 = l3 ^ ((long)UnsafeUtil.getByte(l4) << 42);
                            if (l3 - l2 >= 0) {
                               l = 0x3f80fe03f80;
                            }else {
                               l4 = l1 + l;
                               l3 = l3 ^ ((long)UnsafeUtil.getByte(l1) << 49);
                               if (l3 - l2 < 0) {
                                  l = 0xfffe03f80fe03f80;
                               }else {
                                  l1 = l4 + l;
                                  l3 = (l3 ^ ((long)UnsafeUtil.getByte(l4) << 56)) ^ 0xfe03f80fe03f80;
                                  if (l3 - l2 < 0) {
                                     l = l + l1;
                                     if ((long)UnsafeUtil.getByte(l1) - l2 >= 0) {
                                        l2 = l;
                                     }
                                  }
                               }
                            }
                         }
                         l3 = l3 ^ l;
                         l2 = l4;
                      }
                      l3 = l3 ^ l;
                   }
                }
                l2 = l1;
             }
             this.currentByteBufferPos = l2;
             return l3;
          }
       }
       return this.readRawVarint64SlowPath();
    }
    public long readRawVarint64SlowPath(){
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l1 >= 64) {
             throw InvalidProtocolBufferException.malformedVarint();
          }
          int b = this.readRawByte();
          int i = b & 0x7f;
          long l2 = (long)i << l1;
          l = l | l2;
          b = b & 0x0080;
          if (!b) {
             break ;
          }else {
             l1 = l1 + 7;
          }
       }
       return l;
    }
    public int readSFixed32(){
       return this.readRawLittleEndian32();
    }
    public long readSFixed64(){
       return this.readRawLittleEndian64();
    }
    public int readSInt32(){
       return CodedInputStream.decodeZigZag32(this.readRawVarint32());
    }
    public long readSInt64(){
       return CodedInputStream.decodeZigZag64(this.readRawVarint64());
    }
    public String readString(){
       int i = this.readRawVarint32();
       if (i > 0) {
          long l = (long)i;
          CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
          if (l - (this.currentByteBufferLimit - tcurrentByte) <= 0) {
             byte[] uobyteArray = new byte[i];
             UnsafeUtil.copyMemory(tcurrentByte, uobyteArray, 0, l);
             this.currentByteBufferPos = this.currentByteBufferPos + l;
             return new String(uobyteArray, Internal.UTF_8);
          }
       }
       if (i > 0 && i <= this.remaining()) {
          byte[] uobyteArray1 = new byte[i];
          this.readRawBytesTo(uobyteArray1, 0, i);
          return new String(uobyteArray1, Internal.UTF_8);
       }else if(!i){
          return "";
       }else if(i < 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public String readStringRequireUtf8(){
       int i = this.readRawVarint32();
       if (i > 0) {
          long l = (long)i;
          CodedInputStream$IterableDirectByteBufferDecoder tcurrentByte = this.currentByteBufferPos;
          if (l - (this.currentByteBufferLimit - tcurrentByte) <= 0) {
             this.currentByteBufferPos = this.currentByteBufferPos + l;
             return Utf8.decodeUtf8(this.currentByteBuffer, (int)(tcurrentByte - this.currentByteBufferStartPos), i);
          }
       }
       if (i >= 0 && i <= this.remaining()) {
          byte[] uobyteArray = new byte[i];
          this.readRawBytesTo(uobyteArray, 0, i);
          return Utf8.decodeUtf8(uobyteArray, 0, i);
       }else if(!i){
          return "";
       }else if(i <= 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public int readTag(){
       if (this.isAtEnd()) {
          this.lastTag = 0;
          return 0;
       }else {
          int i = this.readRawVarint32();
          this.lastTag = i;
          if (WireFormat.getTagFieldNumber(i)) {
             return this.lastTag;
          }
          throw InvalidProtocolBufferException.invalidTag();
       }
    }
    public int readUInt32(){
       return this.readRawVarint32();
    }
    public long readUInt64(){
       return this.readRawVarint64();
    }
    public void readUnknownGroup(int p0,MessageLite$Builder p1){
       this.readGroup(p0, p1, ExtensionRegistryLite.getEmptyRegistry());
    }
    public final void recomputeBufferSizeAfterLimit(){
       int i = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
       this.totalBufferSize = i;
       int i1 = i - this.startOffset;
       CodedInputStream$IterableDirectByteBufferDecoder tcurrentLimi = this.currentLimit;
       if (i1 > tcurrentLimi) {
          i1 = i1 - tcurrentLimi;
          this.bufferSizeAfterCurrentLimit = i1;
          this.totalBufferSize = i - i1;
       }else {
          this.bufferSizeAfterCurrentLimit = 0;
       }
       return;
    }
    public final int remaining(){
       return (int)(((long)(this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
    }
    public void resetSizeCounter(){
       this.startOffset = (int)(((long)this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }
    public boolean skipField(int p0){
       int tagWireType = WireFormat.getTagWireType(p0);
       if (tagWireType) {
          if (tagWireType != 1) {
             if (tagWireType != 2) {
                if (tagWireType != 3) {
                   if (tagWireType == 4) {
                      return false;
                   }
                   if (tagWireType != 5) {
                      throw InvalidProtocolBufferException.invalidWireType();
                   }
                   this.skipRawBytes(4);
                   return true;
                }else {
                   this.skipMessage();
                   this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(p0), 4));
                   return true;
                }
             }else {
                this.skipRawBytes(this.readRawVarint32());
                return true;
             }
          }else {
             this.skipRawBytes(8);
             return true;
          }
       }else {
          this.skipRawVarint();
          return true;
       }
    }
    public boolean skipField(int p0,CodedOutputStream p1){
       int tagWireType = WireFormat.getTagWireType(p0);
       if (tagWireType) {
          if (tagWireType != 1) {
             if (tagWireType != 2) {
                if (tagWireType != 3) {
                   if (tagWireType == 4) {
                      return false;
                   }
                   if (tagWireType != 5) {
                      throw InvalidProtocolBufferException.invalidWireType();
                   }
                   p1.writeRawVarint32(p0);
                   p1.writeFixed32NoTag(this.readRawLittleEndian32());
                   return true;
                }else {
                   p1.writeRawVarint32(p0);
                   this.skipMessage(p1);
                   p0 = WireFormat.makeTag(WireFormat.getTagFieldNumber(p0), 4);
                   this.checkLastTagWas(p0);
                   p1.writeRawVarint32(p0);
                   return true;
                }
             }else {
                p1.writeRawVarint32(p0);
                p1.writeBytesNoTag(this.readBytes());
                return true;
             }
          }else {
             p1.writeRawVarint32(p0);
             p1.writeFixed64NoTag(this.readRawLittleEndian64());
             return true;
          }
       }else {
          p1.writeRawVarint32(p0);
          p1.writeUInt64NoTag(this.readInt64());
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
    public void skipMessage(CodedOutputStream p0){
       int i;
       do {
          i = this.readTag();
       } while (!i || !this.skipField(i, p0));
       return;
    }
    public void skipRawBytes(int p0){
       if (p0 >= 0 && (long)p0 - (((long)(this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) <= 0) {
          while (p0 > 0) {
             if (!this.currentRemaining()) {
                this.getNextByteBuffer();
             }
             int i = Math.min(p0, (int)this.currentRemaining());
             p0 = p0 - i;
             long l = this.currentByteBufferPos + (long)i;
             this.currentByteBufferPos = l;
          }
          return;
       }else if(p0 < 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void skipRawVarint(){
       int i = 0;
       while (true) {
          if (i >= 10) {
             throw InvalidProtocolBufferException.malformedVarint();
          }
          if (this.readRawByte() >= 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public final ByteBuffer slice(int p0,int p1){
       int i = this.currentByteBuffer.position();
       int i1 = this.currentByteBuffer.limit();
       try{
          this.currentByteBuffer.position(p0);
          this.currentByteBuffer.limit(p1);
          this.currentByteBuffer.position(i);
          this.currentByteBuffer.limit(i1);
          return this.currentByteBuffer.slice();
       }catch(java.lang.IllegalArgumentException e0){
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void tryGetNextByteBuffer(){
       ByteBuffer uByteBuffer = this.iterator.next();
       this.currentByteBuffer = uByteBuffer;
       this.totalBytesRead = this.totalBytesRead + (int)(this.currentByteBufferPos - this.currentByteBufferStartPos);
       long l = (long)uByteBuffer.position();
       this.currentByteBufferPos = l;
       this.currentByteBufferStartPos = l;
       this.currentByteBufferLimit = (long)this.currentByteBuffer.limit();
       l = UnsafeUtil.addressOffset(this.currentByteBuffer);
       this.currentAddress = l;
       this.currentByteBufferPos = this.currentByteBufferPos + l;
       this.currentByteBufferStartPos = this.currentByteBufferStartPos + l;
       this.currentByteBufferLimit = this.currentByteBufferLimit + l;
    }
}

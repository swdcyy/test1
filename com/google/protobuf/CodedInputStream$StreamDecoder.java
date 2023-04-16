package com.google.protobuf.CodedInputStream$StreamDecoder;
import com.google.protobuf.CodedInputStream;
import java.io.InputStream;
import com.google.protobuf.CodedInputStream$1;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import java.nio.ByteBuffer;
import com.google.protobuf.ByteString;
import java.util.List;
import java.lang.System;
import java.util.Iterator;
import java.lang.Double;
import java.lang.Float;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.MessageLite$Builder;
import java.util.ArrayList;
import java.lang.Math;
import java.nio.charset.Charset;
import com.google.protobuf.Utf8;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.CodedOutputStream;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Class;
import com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback;

public final class CodedInputStream$StreamDecoder extends CodedInputStream	// class@0003e0
{
    public final byte[] buffer;
    public int bufferSize;
    public int bufferSizeAfterLimit;
    public int currentLimit;
    public final InputStream input;
    public int lastTag;
    public int pos;
    public CodedInputStream$StreamDecoder$RefillCallback refillCallback;
    public int totalBytesRetired;

    public void CodedInputStream$StreamDecoder(InputStream p0,int p1){
       super(null);
       this.currentLimit = Integer.MAX_VALUE;
       this.refillCallback = null;
       Internal.checkNotNull(p0, "input");
       this.input = p0;
       byte[] uobyteArray = new byte[p1];
       this.buffer = uobyteArray;
       this.bufferSize = 0;
       this.pos = 0;
       this.totalBytesRetired = 0;
    }
    public void CodedInputStream$StreamDecoder(InputStream p0,int p1,CodedInputStream$1 p2){
       super(p0, p1);
    }
    public void checkLastTagWas(int p0){
       if (this.lastTag == p0) {
          return;
       }
       throw InvalidProtocolBufferException.invalidEndTag();
    }
    public void enableAliasing(boolean p0){
    }
    public int getBytesUntilLimit(){
       CodedInputStream$StreamDecoder tcurrentLimi = this.currentLimit;
       if (tcurrentLimi == Integer.MAX_VALUE) {
          return -1;
       }
       return (tcurrentLimi - (this.totalBytesRetired + this.pos));
    }
    public int getLastTag(){
       return this.lastTag;
    }
    public int getTotalBytesRead(){
       return (this.totalBytesRetired + this.pos);
    }
    public boolean isAtEnd(){
       int i = 1;
       if (this.pos != this.bufferSize || this.tryRefillBuffer(i)) {
          i = false;
       }
       return i;
    }
    public void popLimit(int p0){
       this.currentLimit = p0;
       this.recomputeBufferSizeAfterLimit();
    }
    public int pushLimit(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       p0 = p0 + (this.totalBytesRetired + this.pos);
       CodedInputStream$StreamDecoder tcurrentLimi = this.currentLimit;
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
       int i = this.readRawVarint32();
       CodedInputStream$StreamDecoder tpos = this.pos;
       if (i > (this.bufferSize - tpos) || i <= 0) {
          return this.readRawBytesSlowPath(i, false);
       }
       this.pos = this.pos + i;
       return Arrays.copyOfRange(this.buffer, tpos, (tpos + i));
    }
    public ByteBuffer readByteBuffer(){
       int i = this.readRawVarint32();
       CodedInputStream$StreamDecoder tpos = this.pos;
       if (i <= (this.bufferSize - tpos) && i > 0) {
          this.pos = this.pos + i;
          return ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, tpos, (tpos + i)));
       }else if(!i){
          return Internal.EMPTY_BYTE_BUFFER;
       }else {
          return ByteBuffer.wrap(this.readRawBytesSlowPath(i, true));
       }
    }
    public ByteString readBytes(){
       int i = this.readRawVarint32();
       CodedInputStream$StreamDecoder tpos = this.pos;
       if (i <= (this.bufferSize - tpos) && i > 0) {
          this.pos = this.pos + i;
          return ByteString.copyFrom(this.buffer, tpos, i);
       }else if(!i){
          return ByteString.EMPTY;
       }else {
          return this.readBytesSlowPath(i);
       }
    }
    public final ByteString readBytesSlowPath(int p0){
       byte[] uobyteArray = this.readRawBytesSlowPathOneChunk(p0);
       if (uobyteArray != null) {
          return ByteString.copyFrom(uobyteArray);
       }
       CodedInputStream$StreamDecoder tpos = this.pos;
       CodedInputStream$StreamDecoder tbufferSize = this.bufferSize;
       int i = tbufferSize - tpos;
       this.totalBytesRetired = this.totalBytesRetired + tbufferSize;
       this.pos = 0;
       this.bufferSize = 0;
       byte[] uobyteArray1 = new byte[p0];
       System.arraycopy(this.buffer, tpos, uobyteArray1, 0, i);
       Iterator iterator = this.readRawBytesSlowPathRemainingChunks((p0 - i)).iterator();
       while (iterator.hasNext()) {
          byte[] uobyteArray2 = iterator.next();
          System.arraycopy(uobyteArray2, 0, uobyteArray1, i, uobyteArray2.length);
          i = i + uobyteArray2.length;
       }
       return ByteString.wrap(uobyteArray1);
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
       if (this.pos == this.bufferSize) {
          this.refillBuffer(1);
       }
       CodedInputStream$StreamDecoder tpos = this.pos;
       this.pos = tpos + 1;
       return this.buffer[tpos];
    }
    public byte[] readRawBytes(int p0){
       CodedInputStream$StreamDecoder tpos = this.pos;
       if (p0 > (this.bufferSize - tpos) || p0 <= 0) {
          return this.readRawBytesSlowPath(p0, false);
       }
       p0 = p0 + tpos;
       this.pos = p0;
       return Arrays.copyOfRange(this.buffer, tpos, p0);
    }
    public final byte[] readRawBytesSlowPath(int p0,boolean p1){
       byte[] uobyteArray = this.readRawBytesSlowPathOneChunk(p0);
       if (uobyteArray != null) {
          if (p1) {
             uobyteArray = uobyteArray.clone();
          }
          return uobyteArray;
       }else {
          CodedInputStream$StreamDecoder tpos = this.pos;
          CodedInputStream$StreamDecoder tbufferSize = this.bufferSize;
          int i = tbufferSize - tpos;
          this.totalBytesRetired = this.totalBytesRetired + tbufferSize;
          this.pos = 0;
          this.bufferSize = 0;
          byte[] uobyteArray1 = new byte[p0];
          System.arraycopy(this.buffer, tpos, uobyteArray1, 0, i);
          Iterator iterator = this.readRawBytesSlowPathRemainingChunks((p0 - i)).iterator();
          while (iterator.hasNext()) {
             byte[] uobyteArray2 = iterator.next();
             System.arraycopy(uobyteArray2, 0, uobyteArray1, i, uobyteArray2.length);
             i = i + uobyteArray2.length;
          }
          return uobyteArray1;
       }
    }
    public final byte[] readRawBytesSlowPathOneChunk(int p0){
       if (!p0) {
          return Internal.EMPTY_BYTE_ARRAY;
       }
       if (p0 < 0) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       CodedInputStream$StreamDecoder ttotalBytesR = this.totalBytesRetired;
       CodedInputStream$StreamDecoder tpos = this.pos;
       int i = (ttotalBytesR + tpos) + p0;
       if ((i - this.sizeLimit) > 0) {
          throw InvalidProtocolBufferException.sizeLimitExceeded();
       }
       CodedInputStream$StreamDecoder tcurrentLimi = this.currentLimit;
       if (i <= tcurrentLimi) {
          int i1 = this.bufferSize - tpos;
          int i2 = p0 - i1;
          if (i2 >= 4096 && i2 > this.input.available()) {
             return null;
          }
          byte[] uobyteArray = new byte[p0];
          System.arraycopy(this.buffer, this.pos, uobyteArray, 0, i1);
          this.totalBytesRetired = this.totalBytesRetired + this.bufferSize;
          this.pos = 0;
          this.bufferSize = 0;
          while (true) {
             if (i1 >= p0) {
                return uobyteArray;
             }
             int i3 = p0 - i1;
             i = this.input.read(uobyteArray, i1, i3);
             if (i != -1) {
                i3 = this.totalBytesRetired + i;
                this.totalBytesRetired = i3;
                i1 = i1 + i;
             }else {
                break ;
             }
          }
          throw InvalidProtocolBufferException.truncatedMessage();
       }else {
          this.skipRawBytes(((tcurrentLimi - ttotalBytesR) - tpos));
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final List readRawBytesSlowPathRemainingChunks(int p0){
       ArrayList uArrayList = new ArrayList();
       while (true) {
          if (p0 <= 0) {
             return uArrayList;
          }
          int i = Math.min(p0, 4096);
          byte[] uobyteArray = new byte[i];
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                int i2 = i - i1;
                int i3 = this.input.read(uobyteArray, i1, i2);
                if (i3 != -1) {
                   i2 = this.totalBytesRetired + i3;
                   this.totalBytesRetired = i2;
                   i1 = i1 + i3;
                }else {
                   break ;
                }
             }else {
                p0 = p0 - i;
                uArrayList.add(uobyteArray);
             }
          }
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public int readRawLittleEndian32(){
       CodedInputStream$StreamDecoder tpos = this.pos;
       int i = 4;
       if ((this.bufferSize - tpos) < i) {
          this.refillBuffer(i);
          tpos = this.pos;
       }
       CodedInputStream$StreamDecoder tbuffer = this.buffer;
       this.pos = tpos + 4;
       return (((tbuffer[(tpos + 3)] & 0x00ff) << 24) | (((tbuffer[tpos] & 0x00ff) | ((tbuffer[(tpos + 1)] & 0x00ff) << 8)) | ((tbuffer[(tpos + 2)] & 0x00ff) << 16)));
    }
    public long readRawLittleEndian64(){
       CodedInputStream$StreamDecoder tpos = this.pos;
       int i = 8;
       if ((this.bufferSize - tpos) < i) {
          this.refillBuffer(i);
          tpos = this.pos;
       }
       CodedInputStream$StreamDecoder tbuffer = this.buffer;
       this.pos = tpos + 8;
       return ((((long)tbuffer[(tpos + 7)] & 255) << 56) | ((((((((long)tbuffer[tpos] & 255) | (((long)tbuffer[(tpos + 1)] & 255) << i)) | (((long)tbuffer[(tpos + 2)] & 255) << 16)) | (((long)tbuffer[(tpos + 3)] & 255) << 24)) | (((long)tbuffer[(tpos + 4)] & 255) << 32)) | (((long)tbuffer[(tpos + 5)] & 255) << 40)) | (((long)tbuffer[(tpos + 6)] & 255) << 48)));
    }
    public int readRawVarint32(){
       CodedInputStream$StreamDecoder tpos = this.pos;
       CodedInputStream$StreamDecoder tbufferSize = this.bufferSize;
       if (tbufferSize == tpos) {
       }else {
          CodedInputStream$StreamDecoder tbuffer = this.buffer;
          int i = tpos + 1;
          int b = tbuffer[tpos];
          if (b >= 0) {
             this.pos = i;
             return b;
          }else if((tbufferSize - i) < 9){
             byte i1 = i + 1;
             b = b ^ (tbuffer[i] << 7);
             if (b < 0) {
                b = b ^ 0x80;
             }else {
                i = i1 + 1;
                b = b ^ (tbuffer[i1] << 14);
                if (b >= 0) {
                   b = b ^ 0x3f80;
                }else {
                   i1 = i + 1;
                   b = b ^ (tbuffer[i] << 21);
                   if (b < 0) {
                      b = b ^ -2080896;
                   }else {
                      i = i1 + 1;
                      i1 = tbuffer[i1];
                      b = (b ^ (i1 << 28)) ^ 0xfe03f80;
                      if (i1 < 0) {
                         i1 = i + 1;
                         if (tbuffer[i] < 0) {
                            i = i1 + 1;
                            if (tbuffer[i1] < 0) {
                               i1 = i + 1;
                               if (tbuffer[i] < 0) {
                                  i = i1 + 1;
                                  if (tbuffer[i1] < 0) {
                                     i1 = i + 1;
                                     if (tbuffer[i] >= 0) {
                                     label_0070 :
                                        this.pos = i1;
                                        return b;
                                     }
                                  }
                               }else {
                                  goto label_0070 ;
                               }
                            }
                         }else {
                            goto label_0070 ;
                         }
                      }
                   }
                }
                i1 = i;
                goto label_0070 ;
             }
          }
       }
       return (int)this.readRawVarint64SlowPath();
    }
    public long readRawVarint64(){
       long l;
       long l2;
       long l3;
       CodedInputStream$StreamDecoder tpos = this.pos;
       CodedInputStream$StreamDecoder tbufferSize = this.bufferSize;
       if (tbufferSize == tpos) {
       }else {
          CodedInputStream$StreamDecoder tbuffer = this.buffer;
          int i = tpos + 1;
          int b = tbuffer[tpos];
          if (b >= 0) {
             this.pos = i;
             return (long)b;
          }else if((tbufferSize - i) < 9){
             int i1 = i + 1;
             b = b ^ (tbuffer[i] << 7);
             if (b < 0) {
                b = b ^ 0x80;
             label_0026 :
                l = (long)b;
             }else {
                i = i1 + 1;
                b = b ^ (tbuffer[i1] << 14);
                if (b >= 0) {
                   i1 = i;
                   l = (long)(b ^ 0x3f80);
                }else {
                   i1 = i + 1;
                   b = b ^ (tbuffer[i] << 21);
                   if (b < 0) {
                      b = b ^ -2080896;
                      goto label_0026 ;
                   }else {
                      b = i1 + 1;
                      long l1 = (long)b ^ ((long)tbuffer[i1] << 28);
                      int i2 = 0;
                      if (l1 - i2 >= 0) {
                         l2 = 0xfe03f80;
                      }else {
                         i1 = b + 1;
                         l1 = l1 ^ ((long)tbuffer[b] << 35);
                         if (l1 - i2 < 0) {
                            l3 = 0xfffffff80fe03f80;
                         }else {
                            b = i1 + 1;
                            l1 = l1 ^ ((long)tbuffer[i1] << 42);
                            if (l1 - i2 >= 0) {
                               l2 = 0x3f80fe03f80;
                            }else {
                               i1 = b + 1;
                               l1 = l1 ^ ((long)tbuffer[b] << 49);
                               if (l1 - i2 < 0) {
                                  l3 = 0xfffe03f80fe03f80;
                               }else {
                                  b = i1 + 1;
                                  l1 = (l1 ^ ((long)tbuffer[i1] << 56)) ^ 0xfe03f80fe03f80;
                                  if (l1 - i2 < 0) {
                                     i1 = b + 1;
                                     if ((long)tbuffer[b] - i2 >= 0) {
                                     }
                                  }else {
                                     i1 = b;
                                  }
                               }
                            }
                         }
                         l = l1 ^ l3;
                      }
                      l = l1 ^ l2;
                      i1 = b;
                   }
                }
             }
             this.pos = i1;
             return l;
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
          CodedInputStream$StreamDecoder tpos = this.pos;
          if (i <= (this.bufferSize - tpos)) {
             this.pos = this.pos + i;
             return new String(this.buffer, tpos, i, Internal.UTF_8);
          }
       }
       if (!i) {
          return "";
       }else if(i <= this.bufferSize){
          this.refillBuffer(i);
          this.pos = this.pos + i;
          return new String(this.buffer, this.pos, i, Internal.UTF_8);
       }else {
          return new String(this.readRawBytesSlowPath(i, false), Internal.UTF_8);
       }
    }
    public String readStringRequireUtf8(){
       int i = this.readRawVarint32();
       CodedInputStream$StreamDecoder tpos = this.pos;
       CodedInputStream$StreamDecoder tbufferSize = this.bufferSize;
       if (i <= (tbufferSize - tpos) && i > 0) {
          tbufferSize = this.buffer;
          this.pos = tpos + i;
       }else if(!i){
          return "";
       }else if(i <= tbufferSize){
          this.refillBuffer(i);
          tbufferSize = this.buffer;
          this.pos = i + 0;
       }else {
          byte[] uobyteArray = this.readRawBytesSlowPath(i, false);
       }
       tpos = 0;
       return Utf8.decodeUtf8(tbufferSize, tpos, i);
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
       int i = this.bufferSize + this.bufferSizeAfterLimit;
       this.bufferSize = i;
       int i1 = this.totalBytesRetired + i;
       CodedInputStream$StreamDecoder tcurrentLimi = this.currentLimit;
       if (i1 > tcurrentLimi) {
          i1 = i1 - tcurrentLimi;
          this.bufferSizeAfterLimit = i1;
          this.bufferSize = i - i1;
       }else {
          this.bufferSizeAfterLimit = 0;
       }
       return;
    }
    public final void refillBuffer(int p0){
       if (this.tryRefillBuffer(p0)) {
          return;
       }
       if (p0 > ((this.sizeLimit - this.totalBytesRetired) - this.pos)) {
          throw InvalidProtocolBufferException.sizeLimitExceeded();
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public void resetSizeCounter(){
       this.totalBytesRetired = - this.pos;
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
       CodedInputStream$StreamDecoder tpos = this.pos;
       if (p0 <= (this.bufferSize - tpos) && p0 >= 0) {
          this.pos = tpos + p0;
       }else {
          this.skipRawBytesSlowPath(p0);
       }
       return;
    }
    public final void skipRawBytesSlowPath(int p0){
       if (p0 < 0) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       CodedInputStream$StreamDecoder ttotalBytesR = this.totalBytesRetired;
       CodedInputStream$StreamDecoder tpos = this.pos;
       CodedInputStream$StreamDecoder tcurrentLimi = this.currentLimit;
       if (((ttotalBytesR + tpos) + p0) <= tcurrentLimi) {
          int i = 0;
          if (this.refillCallback == null) {
             this.totalBytesRetired = ttotalBytesR + tpos;
             this.bufferSize = i;
             this.pos = i;
             i = this.bufferSize - tpos;
             while (true) {
                if (i < p0) {
                   int i1 = p0 - i;
                   long l = (long)i1;
                   long l1 = this.input.skip(l);
                   if ((v2 = l1) >= 0 && l1 - l <= 0) {
                      if (!v2) {
                      label_0067 :
                         this.totalBytesRetired = this.totalBytesRetired + i;
                         this.recomputeBufferSizeAfterLimit();
                      }else {
                         i = i + (int)l1;
                      }
                   }else {
                      throw new IllegalStateException(this.input.getClass()+"#skip returned invalid result: "+l1+"\nThe InputStream implementation is buggy.");
                   }
                }else {
                   goto label_0067 ;
                }
             }
          }
          if (i < p0) {
             ttotalBytesR = this.bufferSize;
             int i2 = ttotalBytesR - this.pos;
             this.pos = ttotalBytesR;
             this.refillBuffer(1);
             int i3 = p0 - i2;
             tcurrentLimi = this.bufferSize;
             while (i3 > tcurrentLimi) {
                i2 = i2 + tcurrentLimi;
                this.pos = tcurrentLimi;
                this.refillBuffer(1);
             }
             this.pos = i3;
          }
          return;
       }else {
          this.skipRawBytes(((tcurrentLimi - ttotalBytesR) - tpos));
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void skipRawVarint(){
       if ((this.bufferSize - this.pos) >= 10) {
          this.skipRawVarintFastPath();
       }else {
          this.skipRawVarintSlowPath();
       }
       return;
    }
    public final void skipRawVarintFastPath(){
       int i = 0;
       while (true) {
          if (i >= 10) {
             throw InvalidProtocolBufferException.malformedVarint();
          }
          CodedInputStream$StreamDecoder tpos = this.pos;
          int i1 = tpos + 1;
          this.pos = i1;
          if (this.buffer[tpos] >= 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public final void skipRawVarintSlowPath(){
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
    public final boolean tryRefillBuffer(int p0){
       CodedInputStream$StreamDecoder tbufferSize;
       CodedInputStream$StreamDecoder tpos = this.pos;
       if ((tpos + p0) <= this.bufferSize) {
          throw new IllegalStateException("refillBuffer\(\) called when "+p0+" bytes were already available in buffer");
       }
       CodedInputStream$StreamDecoder ttotalBytesR = this.totalBytesRetired;
       if (p0 > ((this.sizeLimit - ttotalBytesR) - tpos)) {
          return false;
       }
       if (((ttotalBytesR + tpos) + p0) > this.currentLimit) {
          return false;
       }
       tpos = this.refillCallback;
       if (tpos != null) {
          tpos.onRefill();
       }
       tpos = this.pos;
       if (tpos > null) {
          tbufferSize = this.bufferSize;
          if (tbufferSize > tpos) {
             System.arraycopy(this.buffer, tpos, this.buffer, false, (tbufferSize - tpos));
          }
          this.totalBytesRetired = this.totalBytesRetired + tpos;
          this.bufferSize = this.bufferSize - tpos;
          this.pos = 0;
       }
       tbufferSize = this.buffer;
       ttotalBytesR = this.bufferSize;
       int i = this.input.read(tbufferSize, ttotalBytesR, Math.min((tbufferSize.length - ttotalBytesR), ((this.sizeLimit - this.totalBytesRetired) - ttotalBytesR)));
       if (i && (i >= -1 && i <= this.buffer.length)) {
          if (i > 0) {
             this.bufferSize = this.bufferSize + i;
             this.recomputeBufferSizeAfterLimit();
             boolean b = (this.bufferSize >= p0)? true: this.tryRefillBuffer(p0);
             return b;
          }else {
             return false;
          }
       }else {
          throw new IllegalStateException(this.input.getClass()+"#read\(byte[]\) returned invalid result: "+i+"\nThe InputStream implementation is buggy.");
       }
    }
}

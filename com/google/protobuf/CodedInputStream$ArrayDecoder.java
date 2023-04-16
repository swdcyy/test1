package com.google.protobuf.CodedInputStream$ArrayDecoder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStream$1;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import com.google.protobuf.Internal;
import com.google.protobuf.ByteString;
import java.lang.Double;
import java.lang.Float;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import com.google.protobuf.WireFormat;
import com.google.protobuf.MessageLite$Builder;
import java.lang.String;
import java.nio.charset.Charset;
import com.google.protobuf.Utf8;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.CodedOutputStream;

public final class CodedInputStream$ArrayDecoder extends CodedInputStream	// class@0003dc
{
    public final byte[] buffer;
    public int bufferSizeAfterLimit;
    public int currentLimit;
    public boolean enableAliasing;
    public final boolean immutable;
    public int lastTag;
    public int limit;
    public int pos;
    public int startPos;

    public void CodedInputStream$ArrayDecoder(byte[] p0,int p1,int p2,boolean p3){
       super(null);
       this.currentLimit = Integer.MAX_VALUE;
       this.buffer = p0;
       this.limit = p2 + p1;
       this.pos = p1;
       this.startPos = p1;
       this.immutable = p3;
    }
    public void CodedInputStream$ArrayDecoder(byte[] p0,int p1,int p2,boolean p3,CodedInputStream$1 p4){
       super(p0, p1, p2, p3);
    }
    public void checkLastTagWas(int p0){
       if (this.lastTag == p0) {
          return;
       }
       throw InvalidProtocolBufferException.invalidEndTag();
    }
    public void enableAliasing(boolean p0){
       this.enableAliasing = p0;
    }
    public int getBytesUntilLimit(){
       CodedInputStream$ArrayDecoder tcurrentLimi = this.currentLimit;
       if (tcurrentLimi == Integer.MAX_VALUE) {
          return -1;
       }
       return (tcurrentLimi - this.getTotalBytesRead());
    }
    public int getLastTag(){
       return this.lastTag;
    }
    public int getTotalBytesRead(){
       return (this.pos - this.startPos);
    }
    public boolean isAtEnd(){
       boolean b = (this.pos == this.limit)? true: false;
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
       CodedInputStream$ArrayDecoder tcurrentLimi = this.currentLimit;
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
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (i <= (this.limit - tpos)) {
             ByteBuffer uByteBuffer = (this.immutable == null && this.enableAliasing != null)? ByteBuffer.wrap(this.buffer, tpos, i).slice(): ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, tpos, (tpos + i)));
             this.pos = this.pos + i;
             return uByteBuffer;
          }
       }
       if (!i) {
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
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (i <= (this.limit - tpos)) {
             ByteString uByteString = (this.immutable != null && this.enableAliasing != null)? ByteString.wrap(this.buffer, tpos, i): ByteString.copyFrom(this.buffer, tpos, i);
             this.pos = this.pos + i;
             return uByteString;
          }
       }
       if (!i) {
          return ByteString.EMPTY;
       }else {
          return ByteString.wrap(this.readRawBytes(i));
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
       CodedInputStream$ArrayDecoder tpos = this.pos;
       if (tpos == this.limit) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.pos = tpos + 1;
       return this.buffer[tpos];
    }
    public byte[] readRawBytes(int p0){
       if (p0 > 0) {
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (p0 <= (this.limit - tpos)) {
             p0 = p0 + tpos;
             this.pos = p0;
             return Arrays.copyOfRange(this.buffer, tpos, p0);
          }
       }
       if (p0 <= 0) {
          if (!p0) {
             return Internal.EMPTY_BYTE_ARRAY;
          }else {
             throw InvalidProtocolBufferException.negativeSize();
          }
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public int readRawLittleEndian32(){
       CodedInputStream$ArrayDecoder tpos = this.pos;
       if ((this.limit - tpos) < 4) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       CodedInputStream$ArrayDecoder tbuffer = this.buffer;
       this.pos = tpos + 4;
       return (((tbuffer[(tpos + 3)] & 0x00ff) << 24) | (((tbuffer[tpos] & 0x00ff) | ((tbuffer[(tpos + 1)] & 0x00ff) << 8)) | ((tbuffer[(tpos + 2)] & 0x00ff) << 16)));
    }
    public long readRawLittleEndian64(){
       CodedInputStream$ArrayDecoder tpos = this.pos;
       long l = 8;
       if ((this.limit - tpos) < l) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       CodedInputStream$ArrayDecoder tbuffer = this.buffer;
       this.pos = tpos + 8;
       return ((((long)tbuffer[(tpos + 7)] & 255) << 56) | ((((((((long)tbuffer[tpos] & 255) | (((long)tbuffer[(tpos + 1)] & 255) << l)) | (((long)tbuffer[(tpos + 2)] & 255) << 16)) | (((long)tbuffer[(tpos + 3)] & 255) << 24)) | (((long)tbuffer[(tpos + 4)] & 255) << 32)) | (((long)tbuffer[(tpos + 5)] & 255) << 40)) | (((long)tbuffer[(tpos + 6)] & 255) << 48)));
    }
    public int readRawVarint32(){
       CodedInputStream$ArrayDecoder tpos = this.pos;
       CodedInputStream$ArrayDecoder tlimit = this.limit;
       if (tlimit == tpos) {
       }else {
          CodedInputStream$ArrayDecoder tbuffer = this.buffer;
          int i = tpos + 1;
          int b = tbuffer[tpos];
          if (b >= 0) {
             this.pos = i;
             return b;
          }else if((tlimit - i) < 9){
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
       CodedInputStream$ArrayDecoder tpos = this.pos;
       CodedInputStream$ArrayDecoder tlimit = this.limit;
       if (tlimit == tpos) {
       }else {
          CodedInputStream$ArrayDecoder tbuffer = this.buffer;
          int i = tpos + 1;
          int b = tbuffer[tpos];
          if (b >= 0) {
             this.pos = i;
             return (long)b;
          }else if((tlimit - i) < 9){
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
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (i <= (this.limit - tpos)) {
             this.pos = this.pos + i;
             return new String(this.buffer, tpos, i, Internal.UTF_8);
          }
       }
       if (!i) {
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
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (i <= (this.limit - tpos)) {
             this.pos = this.pos + i;
             return Utf8.decodeUtf8(this.buffer, tpos, i);
          }
       }
       if (!i) {
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
       int i = this.limit + this.bufferSizeAfterLimit;
       this.limit = i;
       int i1 = i - this.startPos;
       CodedInputStream$ArrayDecoder tcurrentLimi = this.currentLimit;
       if (i1 > tcurrentLimi) {
          i1 = i1 - tcurrentLimi;
          this.bufferSizeAfterLimit = i1;
          this.limit = i - i1;
       }else {
          this.bufferSizeAfterLimit = 0;
       }
       return;
    }
    public void resetSizeCounter(){
       this.startPos = this.pos;
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
       if (p0 >= 0) {
          CodedInputStream$ArrayDecoder tpos = this.pos;
          if (p0 <= (this.limit - tpos)) {
             this.pos = tpos + p0;
             return;
          }
       }
       if (p0 < 0) {
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void skipRawVarint(){
       if ((this.limit - this.pos) >= 10) {
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
          CodedInputStream$ArrayDecoder tpos = this.pos;
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
}

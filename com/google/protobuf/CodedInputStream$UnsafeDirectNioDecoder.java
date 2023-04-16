package com.google.protobuf.CodedInputStream$UnsafeDirectNioDecoder;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedInputStream$1;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.InvalidProtocolBufferException;
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
import java.nio.Buffer;

public final class CodedInputStream$UnsafeDirectNioDecoder extends CodedInputStream	// class@0003e1
{
    public final long address;
    public final ByteBuffer buffer;
    public int bufferSizeAfterLimit;
    public int currentLimit;
    public boolean enableAliasing;
    public final boolean immutable;
    public int lastTag;
    public long limit;
    public long pos;
    public long startPos;

    public void CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer p0,boolean p1){
       super(null);
       this.currentLimit = Integer.MAX_VALUE;
       this.buffer = p0;
       long l = UnsafeUtil.addressOffset(p0);
       this.address = l;
       this.limit = (long)p0.limit() + l;
       l = l + (long)p0.position();
       this.pos = l;
       this.startPos = l;
       this.immutable = p1;
    }
    public void CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer p0,boolean p1,CodedInputStream$1 p2){
       super(p0, p1);
    }
    public static boolean isSupported(){
       return UnsafeUtil.hasUnsafeByteBufferOperations();
    }
    public final int bufferPos(long p0){
       return (int)(p0 - this.address);
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
       CodedInputStream$UnsafeDirectNioDecoder tcurrentLimi = this.currentLimit;
       if (tcurrentLimi == Integer.MAX_VALUE) {
          return -1;
       }
       return (tcurrentLimi - this.getTotalBytesRead());
    }
    public int getLastTag(){
       return this.lastTag;
    }
    public int getTotalBytesRead(){
       return (int)(this.pos - this.startPos);
    }
    public boolean isAtEnd(){
       boolean b = (!this.pos - this.limit)? true: false;
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
       CodedInputStream$UnsafeDirectNioDecoder tcurrentLimi = this.currentLimit;
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
       if (i > 0 && i <= this.remaining()) {
          if (this.immutable == null && this.enableAliasing != null) {
             CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
             long l = (long)i;
             ByteBuffer uByteBuffer = this.slice(tpos, (tpos + l));
             this.pos = this.pos + l;
             return uByteBuffer;
          }else {
             byte[] uobyteArray = new byte[i];
             long l1 = (long)i;
             UnsafeUtil.copyMemory(this.pos, uobyteArray, 0, l1);
             this.pos = this.pos + l1;
             return ByteBuffer.wrap(uobyteArray);
          }
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
       if (i > 0 && i <= this.remaining()) {
          if (this.immutable != null && this.enableAliasing != null) {
             CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
             long l = (long)i;
             ByteBuffer uByteBuffer = this.slice(tpos, (tpos + l));
             this.pos = this.pos + l;
             return ByteString.wrap(uByteBuffer);
          }else {
             byte[] uobyteArray = new byte[i];
             long l1 = (long)i;
             UnsafeUtil.copyMemory(this.pos, uobyteArray, 0, l1);
             this.pos = this.pos + l1;
             return ByteString.wrap(uobyteArray);
          }
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
       CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
       if (!tpos - this.limit) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.pos = 1 + tpos;
       return UnsafeUtil.getByte(tpos);
    }
    public byte[] readRawBytes(int p0){
       if (p0 >= 0 && p0 <= this.remaining()) {
          byte[] uobyteArray = new byte[p0];
          CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
          long l = (long)p0;
          this.slice(tpos, (tpos + l)).get(uobyteArray);
          this.pos = this.pos + l;
          return uobyteArray;
       }else if(p0 <= 0){
          if (!p0) {
             return Internal.EMPTY_BYTE_ARRAY;
          }
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public int readRawLittleEndian32(){
       CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
       long l = 4;
       if ((this.limit - tpos) - l < 0) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.pos = l + tpos;
       return (((UnsafeUtil.getByte((tpos + 3)) & 0x00ff) << 24) | (((UnsafeUtil.getByte(tpos) & 0x00ff) | ((UnsafeUtil.getByte((1 + tpos)) & 0x00ff) << 8)) | ((UnsafeUtil.getByte((2 + tpos)) & 0x00ff) << 16)));
    }
    public long readRawLittleEndian64(){
       CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
       long l = 8;
       if ((this.limit - tpos) - l < 0) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.pos = l + tpos;
       return ((((long)UnsafeUtil.getByte((tpos + 7)) & 255) << 56) | ((((((((long)UnsafeUtil.getByte(tpos) & 255) | (((long)UnsafeUtil.getByte((1 + tpos)) & 255) << 8)) | (((long)UnsafeUtil.getByte((2 + tpos)) & 255) << 16)) | (((long)UnsafeUtil.getByte((3 + tpos)) & 255) << 24)) | (((long)UnsafeUtil.getByte((4 + tpos)) & 255) << 32)) | (((long)UnsafeUtil.getByte((5 + tpos)) & 255) << 40)) | (((long)UnsafeUtil.getByte((6 + tpos)) & 255) << 48)));
    }
    public int readRawVarint32(){
       CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
       if (!this.limit - tpos) {
       }else {
          long l = tpos + 1;
          int bytex = UnsafeUtil.getByte(tpos);
          if (bytex >= 0) {
             this.pos = l;
             return bytex;
          }else if((this.limit - l) - 9 < 0){
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
                                     label_008b :
                                        this.pos = l1;
                                        return bytex;
                                     }
                                  }
                               }else {
                                  goto label_008b ;
                               }
                            }
                         }else {
                            goto label_008b ;
                         }
                      }
                   }
                }
                l1 = l;
                goto label_008b ;
             }
          }
       }
       return (int)this.readRawVarint64SlowPath();
    }
    public long readRawVarint64(){
       long l3;
       CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
       if (!this.limit - tpos) {
       }else {
          long l = 1;
          long l1 = tpos + l;
          int bytex = UnsafeUtil.getByte(tpos);
          if (bytex >= 0) {
             this.pos = l1;
             return (long)bytex;
          }else if((this.limit - l1) - 9 < 0){
             long l2 = l1 + l;
             bytex = bytex ^ (UnsafeUtil.getByte(l1) << 7);
             if (bytex < 0) {
                bytex = bytex ^ 0x80;
             label_0030 :
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
                      goto label_0030 ;
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
             this.pos = l2;
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
       if (i > 0 && i <= this.remaining()) {
          byte[] uobyteArray = new byte[i];
          long l = (long)i;
          UnsafeUtil.copyMemory(this.pos, uobyteArray, 0, l);
          String str = new String(uobyteArray, Internal.UTF_8);
          this.pos = this.pos + l;
          return str;
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
       if (i > 0 && i <= this.remaining()) {
          this.pos = this.pos + (long)i;
          return Utf8.decodeUtf8(this.buffer, this.bufferPos(this.pos), i);
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
       long l = this.limit + (long)this.bufferSizeAfterLimit;
       this.limit = l;
       int i = (int)(l - this.startPos);
       CodedInputStream$UnsafeDirectNioDecoder tcurrentLimi = this.currentLimit;
       if (i > tcurrentLimi) {
          i = i - tcurrentLimi;
          this.bufferSizeAfterLimit = i;
          this.limit = l - (long)i;
       }else {
          this.bufferSizeAfterLimit = 0;
       }
       return;
    }
    public final int remaining(){
       return (int)(this.limit - this.pos);
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
       if (p0 >= 0 && p0 <= this.remaining()) {
          this.pos = this.pos + (long)p0;
          return;
       }else if(p0 < 0){
          throw InvalidProtocolBufferException.negativeSize();
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public final void skipRawVarint(){
       if (this.remaining() >= 10) {
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
          CodedInputStream$UnsafeDirectNioDecoder tpos = this.pos;
          long l = 1 + tpos;
          this.pos = l;
          if (UnsafeUtil.getByte(tpos) >= 0) {
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
    public final ByteBuffer slice(long p0,long p1){
       int i = this.buffer.position();
       int i1 = this.buffer.limit();
       try{
          this.buffer.position(this.bufferPos(p0));
          this.buffer.limit(this.bufferPos(p1));
          this.buffer.position(i);
          this.buffer.limit(i1);
          return this.buffer.slice();
       }catch(java.lang.IllegalArgumentException e0){
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
}

package com.google.protobuf.BinaryWriter$UnsafeDirectWriter;
import com.google.protobuf.BinaryWriter;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.BinaryWriter$1;
import com.google.protobuf.UnsafeUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import com.google.protobuf.AllocatedBuffer;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.RuntimeException;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteOutput;
import java.lang.Throwable;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Writer;
import com.google.protobuf.Schema;
import com.google.protobuf.CodedOutputStream;
import java.lang.Character;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;

public final class BinaryWriter$UnsafeDirectWriter extends BinaryWriter	// class@0003be
{
    public ByteBuffer buffer;
    public long bufferOffset;
    public long limitMinusOne;
    public long pos;

    public void BinaryWriter$UnsafeDirectWriter(BufferAllocator p0,int p1){
       super(p0, p1, null);
       this.nextBuffer();
    }
    public static boolean isSupported(){
       return UnsafeUtil.hasUnsafeByteBufferOperations();
    }
    public final int bufferPos(){
       return (int)(this.pos - this.bufferOffset);
    }
    public final int bytesWrittenToCurrentBuffer(){
       return (int)(this.limitMinusOne - this.pos);
    }
    public void finishCurrentBuffer(){
       if (this.buffer != null) {
          this.totalDoneBytes = this.totalDoneBytes + this.bytesWrittenToCurrentBuffer();
          this.buffer.position((this.bufferPos() + 1));
          this.buffer = null;
          this.pos = 0;
          this.limitMinusOne = 0;
       }
       return;
    }
    public int getTotalBytesWritten(){
       return (this.totalDoneBytes + this.bytesWrittenToCurrentBuffer());
    }
    public final void nextBuffer(){
       this.nextBuffer(this.newDirectBuffer());
    }
    public final void nextBuffer(int p0){
       this.nextBuffer(this.newDirectBuffer(p0));
    }
    public final void nextBuffer(AllocatedBuffer p0){
       if (!p0.hasNioBuffer()) {
          throw new RuntimeException("Allocated buffer does not have NIO buffer");
       }
       ByteBuffer uByteBuffer = p0.nioBuffer();
       if (!uByteBuffer.isDirect()) {
          throw new RuntimeException("Allocator returned non-direct buffer");
       }
       this.finishCurrentBuffer();
       this.buffers.addFirst(p0);
       this.buffer = uByteBuffer;
       uByteBuffer.limit(uByteBuffer.capacity());
       this.buffer.position(0);
       long l = UnsafeUtil.addressOffset(this.buffer);
       this.bufferOffset = l;
       l = l + (long)(this.buffer.limit() - 1);
       this.limitMinusOne = l;
       this.pos = l;
       return;
    }
    public void requireSpace(int p0){
       if (this.spaceLeft() < p0) {
          this.nextBuffer(p0);
       }
       return;
    }
    public final int spaceLeft(){
       return (this.bufferPos() + 1);
    }
    public void write(byte p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, p0);
    }
    public void write(ByteBuffer p0){
       int i = p0.remaining();
       if (this.spaceLeft() < i) {
          this.nextBuffer(i);
       }
       this.pos = this.pos - (long)i;
       this.buffer.position((this.bufferPos() + 1));
       this.buffer.put(p0);
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (this.spaceLeft() < p2) {
          this.nextBuffer(p2);
       }
       this.pos = this.pos - (long)p2;
       this.buffer.position((this.bufferPos() + 1));
       this.buffer.put(p0, p1, p2);
       return;
    }
    public void writeBool(int p0,boolean p1){
       this.requireSpace(6);
       this.write((byte)p1);
       this.writeTag(p0, 0);
    }
    public void writeBool(boolean p0){
       this.write((byte)p0);
    }
    public void writeBytes(int p0,ByteString p1){
       try{
          p1.writeToReverse(this);
          this.requireSpace(10);
          this.writeVarint32(p1.size());
          this.writeTag(p0, 2);
          return;
       }catch(java.io.IOException e2){
          throw new RuntimeException(e2);
       }
    }
    public void writeEndGroup(int p0){
       this.writeTag(p0, 4);
    }
    public void writeFixed32(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 >> 24) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 >> 16) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 >> 8) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(p0 & 0x00ff));
    }
    public void writeFixed32(int p0,int p1){
       this.requireSpace(9);
       this.writeFixed32(p1);
       this.writeTag(p0, 5);
    }
    public void writeFixed64(int p0,long p1){
       this.requireSpace(13);
       this.writeFixed64(p1);
       this.writeTag(p0, 1);
    }
    public void writeFixed64(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 56) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 48) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 40) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 32) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 24) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 16) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)(p0 >> 8) & 0x00ff));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)p0 & 0x00ff));
    }
    public void writeGroup(int p0,Object p1){
       this.writeTag(p0, 4);
       Protobuf.getInstance().writeTo(p1, this);
       this.writeTag(p0, 3);
    }
    public void writeGroup(int p0,Object p1,Schema p2){
       this.writeTag(p0, 4);
       p2.writeTo(p1, this);
       this.writeTag(p0, 3);
    }
    public void writeInt32(int p0){
       if (p0 >= 0) {
          this.writeVarint32(p0);
       }else {
          this.writeVarint64((long)p0);
       }
       return;
    }
    public void writeInt32(int p0,int p1){
       this.requireSpace(15);
       this.writeInt32(p1);
       this.writeTag(p0, 0);
    }
    public void writeLazy(ByteBuffer p0){
       int i = p0.remaining();
       if (this.spaceLeft() < i) {
          this.totalDoneBytes = this.totalDoneBytes + i;
          this.buffers.addFirst(AllocatedBuffer.wrap(p0));
          this.nextBuffer();
          return;
       }else {
          this.pos = this.pos - (long)i;
          this.buffer.position((this.bufferPos() + 1));
          this.buffer.put(p0);
          return;
       }
    }
    public void writeLazy(byte[] p0,int p1,int p2){
       if (this.spaceLeft() < p2) {
          this.totalDoneBytes = this.totalDoneBytes + p2;
          this.buffers.addFirst(AllocatedBuffer.wrap(p0, p1, p2));
          this.nextBuffer();
          return;
       }else {
          this.pos = this.pos - (long)p2;
          this.buffer.position((this.bufferPos() + 1));
          this.buffer.put(p0, p1, p2);
          return;
       }
    }
    public void writeMessage(int p0,Object p1){
       Protobuf.getInstance().writeTo(p1, this);
       this.requireSpace(10);
       this.writeVarint32((this.getTotalBytesWritten() - this.getTotalBytesWritten()));
       this.writeTag(p0, 2);
    }
    public void writeMessage(int p0,Object p1,Schema p2){
       p2.writeTo(p1, this);
       this.requireSpace(10);
       this.writeVarint32((this.getTotalBytesWritten() - this.getTotalBytesWritten()));
       this.writeTag(p0, 2);
    }
    public void writeSInt32(int p0){
       this.writeVarint32(CodedOutputStream.encodeZigZag32(p0));
    }
    public void writeSInt32(int p0,int p1){
       this.requireSpace(10);
       this.writeSInt32(p1);
       this.writeTag(p0, 0);
    }
    public void writeSInt64(int p0,long p1){
       this.requireSpace(15);
       this.writeSInt64(p1);
       this.writeTag(p0, 0);
    }
    public void writeSInt64(long p0){
       this.writeVarint64(CodedOutputStream.encodeZigZag64(p0));
    }
    public void writeStartGroup(int p0){
       this.writeTag(p0, 3);
    }
    public void writeString(int p0,String p1){
       this.writeString(p1);
       this.requireSpace(10);
       this.writeVarint32((this.getTotalBytesWritten() - this.getTotalBytesWritten()));
       this.writeTag(p0, 2);
    }
    public void writeString(String p0){
       long l1;
       int i1;
       int i2;
       this.requireSpace(p0.length());
       int i = p0.length() - 1;
       long l = 128;
       while (i >= 0) {
          char c = p0.charAt(i);
          if (c < l) {
             BinaryWriter$UnsafeDirectWriter tpos = this.pos;
             l = tpos - 1;
             this.pos = l;
             UnsafeUtil.putByte(tpos, (byte)c);
             i = i - 1;
          }else if(i == -1){
             return;
          }else {
             while (true) {
                if (i < 0) {
                   return;
                }
                char c1 = p0.charAt(i);
                if (c1 < l) {
                   BinaryWriter$UnsafeDirectWriter tpos1 = this.pos;
                   if (tpos1 - this.bufferOffset >= 0) {
                      l1 = tpos1 - 1;
                      this.pos = l1;
                      UnsafeUtil.putByte(tpos1, (byte)c1);
                   }else if(c1 < 2048){
                      tpos1 = this.pos;
                      if (tpos1 - this.bufferOffset > 0) {
                         l1 = tpos1 - 1;
                         this.pos = l1;
                         i1 = c1 & 0x3f;
                         i1 = i1 | l;
                         UnsafeUtil.putByte(tpos1, (byte)i1);
                         tpos1 = this.pos;
                         l1 = tpos1 - 1;
                         this.pos = l1;
                         i2 = c1 >> 6;
                         i2 = i2 | 0x03c0;
                         UnsafeUtil.putByte(tpos1, (byte)i2);
                      }
                   }
                   if (c1 < 0xd800 || 0xdfff < c1) {
                      tpos1 = this.pos;
                      l1 = this.bufferOffset + 1;
                      if (tpos1 - l1 > 0) {
                         l1 = tpos1 - 1;
                         this.pos = l1;
                         i1 = c1 & 0x3f;
                         i1 = i1 | l;
                         UnsafeUtil.putByte(tpos1, (byte)i1);
                         tpos1 = this.pos;
                         l1 = tpos1 - 1;
                         this.pos = l1;
                         i1 = c1 >> 6;
                         i1 = i1 & 0x3f;
                         i1 = i1 | l;
                         UnsafeUtil.putByte(tpos1, (byte)i1);
                         tpos1 = this.pos;
                         l1 = tpos1 - 1;
                         this.pos = l1;
                         i2 = c1 >> 12;
                         i2 = i2 | 0x01e0;
                         UnsafeUtil.putByte(tpos1, (byte)i2);
                      }
                   }
                   l1 = this.bufferOffset + 2;
                   if (this.pos - l1 > 0) {
                      if (i) {
                         int i3 = i - 1;
                         char c2 = p0.charAt(i3);
                         if (Character.isSurrogatePair(c2, c1)) {
                            i = i - 1;
                            i2 = Character.toCodePoint(c2, c1);
                            tpos1 = this.pos;
                            l1 = tpos1 - 1;
                            this.pos = l1;
                            i1 = i2 & 0x3f;
                            i1 = i1 | l;
                            UnsafeUtil.putByte(tpos1, (byte)i1);
                            tpos1 = this.pos;
                            l1 = tpos1 - 1;
                            this.pos = l1;
                            i1 = i2 >> 6;
                            i1 = i1 & 0x3f;
                            i1 = i1 | l;
                            UnsafeUtil.putByte(tpos1, (byte)i1);
                            tpos1 = this.pos;
                            l1 = tpos1 - 1;
                            this.pos = l1;
                            i1 = i2 >> 12;
                            i1 = i1 & 0x3f;
                            i1 = i1 | l;
                            UnsafeUtil.putByte(tpos1, (byte)i1);
                            tpos1 = this.pos;
                            l1 = tpos1 - 1;
                            this.pos = l1;
                            i2 = i2 >> 18;
                            i2 = i2 | 0x00f0;
                            UnsafeUtil.putByte(tpos1, (byte)i2);
                         }
                      }
                      break ;
                   }else {
                      this.requireSpace(i);
                      i = i + 1;
                   }
                }else {
                   goto label_0044 ;
                }
                i = i - 1;
             }
             throw new Utf8$UnpairedSurrogateException((i - 1), i);
          }
       }
    }
    public void writeTag(int p0,int p1){
       this.writeVarint32(WireFormat.makeTag(p0, p1));
    }
    public void writeUInt32(int p0,int p1){
       this.requireSpace(10);
       this.writeVarint32(p1);
       this.writeTag(p0, 0);
    }
    public void writeUInt64(int p0,long p1){
       this.requireSpace(15);
       this.writeVarint64(p1);
       this.writeTag(p0, 0);
    }
    public void writeVarint32(int p0){
       if (!(p0 & 0x80)) {
          this.writeVarint32OneByte(p0);
       }else if(!(p0 & 0xc000)){
          this.writeVarint32TwoBytes(p0);
       }else if(!(0xffe00000 & p0)){
          this.writeVarint32ThreeBytes(p0);
       }else if(!(0xf0000000 & p0)){
          this.writeVarint32FourBytes(p0);
       }else {
          this.writeVarint32FiveBytes(p0);
       }
       return;
    }
    public final void writeVarint32FiveBytes(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(p0 >> 28));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 21) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 14) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 7) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 & 0x7f) | 0x0080));
    }
    public final void writeVarint32FourBytes(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(p0 >> 21));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 14) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 7) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 & 0x7f) | 0x0080));
    }
    public final void writeVarint32OneByte(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)p0);
    }
    public final void writeVarint32ThreeBytes(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(p0 >> 14));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((p0 >> 7) & 0x7f) | 0x0080));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 & 0x7f) | 0x0080));
    }
    public final void writeVarint32TwoBytes(int p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(p0 >> 7));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((p0 & 0x7f) | 0x0080));
    }
    public void writeVarint64(long p0){
       switch (BinaryWriter.computeUInt64SizeNoTag(p0)){
           case 1:
             this.writeVarint64OneByte(p0);
             break;
           case 2:
             this.writeVarint64TwoBytes(p0);
             break;
           case 3:
             this.writeVarint64ThreeBytes(p0);
             break;
           case 4:
             this.writeVarint64FourBytes(p0);
             break;
           case 5:
             this.writeVarint64FiveBytes(p0);
             break;
           case 6:
             this.writeVarint64SixBytes(p0);
             break;
           case 7:
             this.writeVarint64SevenBytes(p0);
             break;
           case 8:
             this.writeVarint64EightBytes(p0);
             break;
           case 9:
             this.writeVarint64NineBytes(p0);
             break;
           case 10:
             this.writeVarint64TenBytes(p0);
             break;
           default:
       }
       return;
    }
    public final void writeVarint64EightBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 49));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 42) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 35) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 28) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64FiveBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 28));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64FourBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 21));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64NineBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 56));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 49) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 42) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 35) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 28) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64OneByte(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)p0);
    }
    public final void writeVarint64SevenBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 42));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 35) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 28) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64SixBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 35));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 28) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64TenBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 63));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 56) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 49) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 42) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 35) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 28) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 21) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 14) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64ThreeBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)((int)p0 >> 14));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(((p0 >> 7) & 127) | 128));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)((p0 & 127) | 128));
    }
    public final void writeVarint64TwoBytes(long p0){
       BinaryWriter$UnsafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(int)(p0 >> 7));
       tpos = this.pos;
       this.pos = tpos - 1;
       UnsafeUtil.putByte(tpos, (byte)(((int)p0 & 0x7f) | 0x0080));
    }
}

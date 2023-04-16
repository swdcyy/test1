package com.google.protobuf.BinaryWriter$SafeDirectWriter;
import com.google.protobuf.BinaryWriter;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.BinaryWriter$1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import com.google.protobuf.AllocatedBuffer;
import java.lang.Object;
import java.util.ArrayDeque;
import java.nio.ByteOrder;
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

public final class BinaryWriter$SafeDirectWriter extends BinaryWriter	// class@0003bc
{
    public ByteBuffer buffer;
    public int limitMinusOne;
    public int pos;

    public void BinaryWriter$SafeDirectWriter(BufferAllocator p0,int p1){
       super(p0, p1, null);
       this.nextBuffer();
    }
    public final int bytesWrittenToCurrentBuffer(){
       return (this.limitMinusOne - this.pos);
    }
    public void finishCurrentBuffer(){
       if (this.buffer != null) {
          this.totalDoneBytes = this.totalDoneBytes + this.bytesWrittenToCurrentBuffer();
          this.buffer.position((this.pos + 1));
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
       this.buffer.order(ByteOrder.LITTLE_ENDIAN);
       int i = this.buffer.limit() - 1;
       this.limitMinusOne = i;
       this.pos = i;
       return;
    }
    public void requireSpace(int p0){
       if (this.spaceLeft() < p0) {
          this.nextBuffer(p0);
       }
       return;
    }
    public final int spaceLeft(){
       return (this.pos + 1);
    }
    public void write(byte p0){
       BinaryWriter$SafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, p0);
    }
    public void write(ByteBuffer p0){
       int i = p0.remaining();
       if (this.spaceLeft() < i) {
          this.nextBuffer(i);
       }
       int i1 = this.pos - i;
       this.pos = i1;
       this.buffer.position((i1 + 1));
       this.buffer.put(p0);
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (this.spaceLeft() < p2) {
          this.nextBuffer(p2);
       }
       int i = this.pos - p2;
       this.pos = i;
       this.buffer.position((i + 1));
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
       int i = this.pos - 4;
       this.pos = i;
       this.buffer.putInt((i + 1), p0);
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
       int i = this.pos - 8;
       this.pos = i;
       this.buffer.putLong((i + 1), p0);
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
          int i1 = this.pos - i;
          this.pos = i1;
          this.buffer.position((i1 + 1));
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
          int i = this.pos - p2;
          this.pos = i;
          this.buffer.position((i + 1));
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
       int i2;
       int i3;
       BinaryWriter$SafeDirectWriter tpos1;
       this.requireSpace(p0.length());
       int i = 1;
       int i1 = p0.length() - i;
       this.pos = this.pos - i1;
       BinaryWriter$SafeDirectWriter safeDirectWr = 128;
       while (i1 >= 0) {
          char c = p0.charAt(i1);
          if (c < safeDirectWr) {
             i2 = this.pos + i1;
             this.buffer.put(i2, (byte)c);
             i1 = i1 - 1;
          }else if(i1 == -1){
             this.pos = this.pos - i;
             return;
          }else {
             this.pos = this.pos + i1;
             while (true) {
                if (i1 < 0) {
                   return;
                }
                char c1 = p0.charAt(i1);
                if (c1 < safeDirectWr) {
                   BinaryWriter$SafeDirectWriter tpos = this.pos;
                   if (tpos >= null) {
                      i3 = tpos - 1;
                      this.pos = i3;
                      this.buffer.put(tpos, (byte)c1);
                   }else if(c1 < 2048){
                      tpos = this.pos;
                      if (tpos > null) {
                         i3 = tpos - 1;
                         this.pos = i3;
                         i3 = c1 & 0x3f;
                         i3 = i3 | safeDirectWr;
                         this.buffer.put(tpos, (byte)i3);
                         tpos1 = this.pos;
                         i3 = tpos1 - 1;
                         this.pos = i3;
                         i2 = c1 >> 6;
                         i2 = i2 | 0x03c0;
                         this.buffer.put(tpos1, (byte)i2);
                      }
                   }
                   if (c1 < 0xd800 || 0xdfff < c1) {
                      tpos = this.pos;
                      if (tpos > i) {
                         i3 = tpos - 1;
                         this.pos = i3;
                         i3 = c1 & 0x3f;
                         i3 = i3 | safeDirectWr;
                         this.buffer.put(tpos, (byte)i3);
                         tpos1 = this.pos;
                         i3 = tpos1 - 1;
                         this.pos = i3;
                         i3 = c1 >> 6;
                         i3 = i3 & 0x3f;
                         i3 = i3 | safeDirectWr;
                         this.buffer.put(tpos1, (byte)i3);
                         tpos1 = this.pos;
                         i3 = tpos1 - 1;
                         this.pos = i3;
                         i2 = c1 >> 12;
                         i2 = i2 | 0x01e0;
                         this.buffer.put(tpos1, (byte)i2);
                      }
                   }
                   if (this.pos > 2) {
                      if (i1) {
                         int i4 = i1 - 1;
                         char c2 = p0.charAt(i4);
                         if (Character.isSurrogatePair(c2, c1)) {
                            i1 = i1 - 1;
                            i2 = Character.toCodePoint(c2, c1);
                            tpos1 = this.pos;
                            i3 = tpos1 - 1;
                            this.pos = i3;
                            i3 = i2 & 0x3f;
                            i3 = i3 | safeDirectWr;
                            this.buffer.put(tpos1, (byte)i3);
                            tpos1 = this.pos;
                            i3 = tpos1 - 1;
                            this.pos = i3;
                            i3 = i2 >> 6;
                            i3 = i3 & 0x3f;
                            i3 = i3 | safeDirectWr;
                            this.buffer.put(tpos1, (byte)i3);
                            tpos1 = this.pos;
                            i3 = tpos1 - 1;
                            this.pos = i3;
                            i3 = i2 >> 12;
                            i3 = i3 & 0x3f;
                            i3 = i3 | safeDirectWr;
                            this.buffer.put(tpos1, (byte)i3);
                            tpos1 = this.pos;
                            i3 = tpos1 - 1;
                            this.pos = i3;
                            i2 = i2 >> 18;
                            i2 = i2 | 0x00f0;
                            this.buffer.put(tpos1, (byte)i2);
                         }
                      }
                      break ;
                   }else {
                      this.requireSpace(i1);
                      i1 = i1 + 1;
                   }
                }else {
                   goto label_004e ;
                }
                i1 = i1 - 1;
             }
             throw new Utf8$UnpairedSurrogateException((i1 - 1), i1);
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
       BinaryWriter$SafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, (byte)(p0 >> 28));
       int i = this.pos - 4;
       this.pos = i;
       this.buffer.putInt((i + 1), (((p0 & 0x7f) | 0x0080) | ((((((p0 >> 21) & 0x7f) | 0x0080) << 24) | ((((p0 >> 14) & 0x7f) | 0x0080) << 16)) | ((((p0 >> 7) & 0x7f) | 0x0080) << 8))));
    }
    public final void writeVarint32FourBytes(int p0){
       int i = this.pos - 4;
       this.pos = i;
       this.buffer.putInt((i + 1), (((p0 & 0x7f) | 0x0080) | ((((0xfe00000 & p0) << 3) | (((0x1fc000 & p0) | 0x200000) << 2)) | (((p0 & 0x3f80) | 0x4000) << 1))));
    }
    public final void writeVarint32OneByte(int p0){
       BinaryWriter$SafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, (byte)p0);
    }
    public final void writeVarint32ThreeBytes(int p0){
       int i = this.pos - 3;
       this.pos = i;
       this.buffer.putInt(i, ((((p0 & 0x7f) | 0x0080) << 8) | (((0x1fc000 & p0) << 10) | (((p0 & 0x3f80) | 0x4000) << 9))));
    }
    public final void writeVarint32TwoBytes(int p0){
       int i = this.pos - 2;
       this.pos = i;
       this.buffer.putShort((i + 1), (short)(((p0 & 0x7f) | 0x0080) | ((p0 & 0x3f80) << 1)));
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
       int i = this.pos - 8;
       this.pos = i;
       this.buffer.putLong((i + 1), (((p0 & 127) | 128) | ((((((((0xfe000000000000 & p0) << 7) | (((0x1fc0000000000 & p0) | 0x2000000000000) << 6)) | (((0x3f800000000 & p0) | 0x40000000000) << 5)) | (((0x7f0000000 & p0) | 0x800000000) << 4)) | (((0xfe00000 & p0) | 0x10000000) << 3)) | (((0x1fc000 & p0) | 0x200000) << 2)) | (((0x3f80 & p0) | 0x4000) << 1))));
    }
    public final void writeVarint64EightBytesWithSign(long p0){
       int i = this.pos - 8;
       this.pos = i;
       this.buffer.putLong((i + 1), (((p0 & 127) | 128) | (((((((((0xfe000000000000 & p0) | 0x100000000000000) << 7) | (((0x1fc0000000000 & p0) | 0x2000000000000) << 6)) | (((0x3f800000000 & p0) | 0x40000000000) << 5)) | (((0x7f0000000 & p0) | 0x800000000) << 4)) | (((0xfe00000 & p0) | 0x10000000) << 3)) | (((0x1fc000 & p0) | 0x200000) << 2)) | (((0x3f80 & p0) | 0x4000) << 1))));
    }
    public final void writeVarint64FiveBytes(long p0){
       int i = this.pos - 5;
       this.pos = i;
       this.buffer.putLong((i - 2), ((((p0 & 127) | 128) << 24) | (((((0x7f0000000 & p0) << 28) | (((0xfe00000 & p0) | 0x10000000) << 27)) | (((0x1fc000 & p0) | 0x200000) << 26)) | (((0x3f80 & p0) | 0x4000) << 25))));
    }
    public final void writeVarint64FourBytes(long p0){
       this.writeVarint32FourBytes((int)p0);
    }
    public final void writeVarint64NineBytes(long p0){
       BinaryWriter$SafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, (byte)(int)(p0 >> 56));
       this.writeVarint64EightBytesWithSign((p0 & 0xffffffffffffff));
    }
    public final void writeVarint64OneByte(long p0){
       this.writeVarint32OneByte((int)p0);
    }
    public final void writeVarint64SevenBytes(long p0){
       int i = this.pos - 7;
       this.pos = i;
       this.buffer.putLong(i, ((((p0 & 127) | 128) << 8) | (((((((0x1fc0000000000 & p0) << 14) | (((0x3f800000000 & p0) | 0x40000000000) << 13)) | (((0x7f0000000 & p0) | 0x800000000) << 12)) | (((0xfe00000 & p0) | 0x10000000) << 11)) | (((0x1fc000 & p0) | 0x200000) << 10)) | (((0x3f80 & p0) | 0x4000) << 9))));
    }
    public final void writeVarint64SixBytes(long p0){
       int i = this.pos - 6;
       this.pos = i;
       this.buffer.putLong((i - 1), ((((p0 & 127) | 128) << 16) | ((((((0x3f800000000 & p0) << 21) | (((0x7f0000000 & p0) | 0x800000000) << 20)) | (((0xfe00000 & p0) | 0x10000000) << 19)) | (((0x1fc000 & p0) | 0x200000) << 18)) | (((0x3f80 & p0) | 0x4000) << 17))));
    }
    public final void writeVarint64TenBytes(long p0){
       BinaryWriter$SafeDirectWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, (byte)(int)(p0 >> 63));
       tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer.put(tpos, (byte)(int)(((p0 >> 56) & 127) | 128));
       this.writeVarint64EightBytesWithSign((p0 & 0xffffffffffffff));
    }
    public final void writeVarint64ThreeBytes(long p0){
       this.writeVarint32ThreeBytes((int)p0);
    }
    public final void writeVarint64TwoBytes(long p0){
       this.writeVarint32TwoBytes((int)p0);
    }
}

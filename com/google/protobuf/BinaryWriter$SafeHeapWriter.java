package com.google.protobuf.BinaryWriter$SafeHeapWriter;
import com.google.protobuf.BinaryWriter;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.BinaryWriter$1;
import com.google.protobuf.AllocatedBuffer;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.RuntimeException;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.System;
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

public final class BinaryWriter$SafeHeapWriter extends BinaryWriter	// class@0003bd
{
    public AllocatedBuffer allocatedBuffer;
    public byte[] buffer;
    public int limit;
    public int limitMinusOne;
    public int offset;
    public int offsetMinusOne;
    public int pos;

    public void BinaryWriter$SafeHeapWriter(BufferAllocator p0,int p1){
       super(p0, p1, null);
       this.nextBuffer();
    }
    public int bytesWrittenToCurrentBuffer(){
       return (this.limitMinusOne - this.pos);
    }
    public void finishCurrentBuffer(){
       if (this.allocatedBuffer != null) {
          this.totalDoneBytes = this.totalDoneBytes + this.bytesWrittenToCurrentBuffer();
          BinaryWriter$SafeHeapWriter tallocatedBu = this.allocatedBuffer;
          tallocatedBu.position(((this.pos - tallocatedBu.arrayOffset()) + 1));
          this.allocatedBuffer = null;
          this.pos = 0;
          this.limitMinusOne = 0;
       }
       return;
    }
    public int getTotalBytesWritten(){
       return (this.totalDoneBytes + this.bytesWrittenToCurrentBuffer());
    }
    public final void nextBuffer(){
       this.nextBuffer(this.newHeapBuffer());
    }
    public final void nextBuffer(int p0){
       this.nextBuffer(this.newHeapBuffer(p0));
    }
    public final void nextBuffer(AllocatedBuffer p0){
       if (!p0.hasArray()) {
          throw new RuntimeException("Allocator returned non-heap buffer");
       }
       this.finishCurrentBuffer();
       this.buffers.addFirst(p0);
       this.allocatedBuffer = p0;
       this.buffer = p0.array();
       int i = p0.arrayOffset();
       this.limit = p0.limit() + i;
       i = i + p0.position();
       this.offset = i;
       this.offsetMinusOne = i - 1;
       int i1 = this.limit - 1;
       this.limitMinusOne = i1;
       this.pos = i1;
       return;
    }
    public void requireSpace(int p0){
       if (this.spaceLeft() < p0) {
          this.nextBuffer(p0);
       }
       return;
    }
    public int spaceLeft(){
       return (this.pos - this.offsetMinusOne);
    }
    public void write(byte p0){
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer[tpos] = p0;
    }
    public void write(ByteBuffer p0){
       int i = p0.remaining();
       if (this.spaceLeft() < i) {
          this.nextBuffer(i);
       }
       int i1 = this.pos - i;
       this.pos = i1;
       p0.get(this.buffer, (i1 + 1), i);
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (this.spaceLeft() < p2) {
          this.nextBuffer(p2);
       }
       int i = this.pos - p2;
       this.pos = i;
       System.arraycopy(p0, p1, this.buffer, (i + 1), p2);
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
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)((p0 >> 24) & 0x00ff);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)((p0 >> 16) & 0x00ff);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)((p0 >> 8) & 0x00ff);
       this.pos = i - 1;
       tbuffer[i] = (byte)(p0 & 0x00ff);
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
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)((int)(p0 >> 56) & 0x00ff);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)((int)(p0 >> 48) & 0x00ff);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)((int)(p0 >> 40) & 0x00ff);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)((int)(p0 >> 32) & 0x00ff);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)((int)(p0 >> 24) & 0x00ff);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)((int)(p0 >> 16) & 0x00ff);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)((int)(p0 >> 8) & 0x00ff);
       this.pos = i - 1;
       tbuffer[i] = (byte)((int)p0 & 0x00ff);
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
       }
       int i1 = this.pos - i;
       this.pos = i1;
       p0.get(this.buffer, (i1 + 1), i);
       return;
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
          System.arraycopy(p0, p1, this.buffer, (i + 1), p2);
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
       int i1;
       int i2;
       BinaryWriter$SafeHeapWriter tbuffer;
       int i3;
       int i4;
       int i5;
       this.requireSpace(p0.length());
       int i = p0.length() - 1;
       this.pos = this.pos - i;
       BinaryWriter$SafeHeapWriter safeHeapWrit = 128;
       while (i >= 0) {
          char c = p0.charAt(i);
          if (c < safeHeapWrit) {
             i1 = this.pos + i;
             this.buffer[i1] = (byte)c;
             i = i - 1;
          }else if(i == -1){
             this.pos = this.pos - 1;
             return;
          }else {
             this.pos = this.pos + i;
             while (true) {
                if (i < 0) {
                   return;
                }
                char c1 = p0.charAt(i);
                if (c1 < safeHeapWrit) {
                   BinaryWriter$SafeHeapWriter tpos = this.pos;
                   if (tpos > this.offsetMinusOne) {
                      i2 = tpos - 1;
                      this.pos = i2;
                      this.buffer[tpos] = (byte)c1;
                   }else if(c1 < 2048){
                      tpos = this.pos;
                      if (tpos > this.offset) {
                         tbuffer = this.buffer;
                         i2 = tpos - 1;
                         this.pos = i2;
                         i3 = c1 & 0x3f;
                         i3 = i3 | safeHeapWrit;
                         tbuffer[tpos] = (byte)i3;
                         i4 = i2 - 1;
                         this.pos = i4;
                         i1 = c1 >> 6;
                         i1 = i1 | 0x03c0;
                         tbuffer[i2] = (byte)i1;
                      }
                   }
                   if (c1 < 0xd800 || 0xdfff < c1) {
                      tpos = this.pos;
                      i5 = this.offset + 1;
                      if (tpos > i5) {
                         tbuffer = this.buffer;
                         i2 = tpos - 1;
                         this.pos = i2;
                         i3 = c1 & 0x3f;
                         i3 = i3 | safeHeapWrit;
                         tbuffer[tpos] = (byte)i3;
                         i4 = i2 - 1;
                         this.pos = i4;
                         i3 = c1 >> 6;
                         i3 = i3 & 0x3f;
                         i3 = i3 | safeHeapWrit;
                         tbuffer[i2] = (byte)i3;
                         i2 = i4 - 1;
                         this.pos = i2;
                         i1 = c1 >> 12;
                         i1 = i1 | 0x01e0;
                         tbuffer[i4] = (byte)i1;
                      }
                   }
                   i5 = this.offset + 2;
                   if (this.pos > i5) {
                      if (i) {
                         i4 = i - 1;
                         char c2 = p0.charAt(i4);
                         if (Character.isSurrogatePair(c2, c1)) {
                            i = i - 1;
                            i1 = Character.toCodePoint(c2, c1);
                            tpos = this.buffer;
                            tbuffer = this.pos;
                            i2 = tbuffer - 1;
                            this.pos = i2;
                            i3 = i1 & 0x3f;
                            i3 = i3 | safeHeapWrit;
                            tpos[tbuffer] = (byte)i3;
                            i5 = i2 - 1;
                            this.pos = i5;
                            i3 = i1 >> 6;
                            i3 = i3 & 0x3f;
                            i3 = i3 | safeHeapWrit;
                            tpos[i2] = (byte)i3;
                            i2 = i5 - 1;
                            this.pos = i2;
                            i3 = i1 >> 12;
                            i3 = i3 & 0x3f;
                            i3 = i3 | safeHeapWrit;
                            tpos[i5] = (byte)i3;
                            i5 = i2 - 1;
                            this.pos = i5;
                            i1 = i1 >> 18;
                            i1 = i1 | 0x00f0;
                            tpos[i2] = (byte)i1;
                         }
                      }
                      break ;
                   }else {
                      this.requireSpace(i);
                      i = i + 1;
                   }
                }else {
                   goto label_004f ;
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
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(p0 >> 28);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(((p0 >> 21) & 0x7f) | 0x0080);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(((p0 >> 14) & 0x7f) | 0x0080);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(((p0 >> 7) & 0x7f) | 0x0080);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)((p0 & 0x7f) | 0x0080);
    }
    public final void writeVarint32FourBytes(int p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(p0 >> 21);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(((p0 >> 14) & 0x7f) | 0x0080);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(((p0 >> 7) & 0x7f) | 0x0080);
       this.pos = i - 1;
       tbuffer[i] = (byte)((p0 & 0x7f) | 0x0080);
    }
    public final void writeVarint32OneByte(int p0){
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer[tpos] = (byte)p0;
    }
    public final void writeVarint32ThreeBytes(int p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(p0 >> 14);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(((p0 >> 7) & 0x7f) | 0x0080);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)((p0 & 0x7f) | 0x0080);
    }
    public final void writeVarint32TwoBytes(int p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(p0 >> 7);
       this.pos = i - 1;
       tbuffer[i] = (byte)((p0 & 0x7f) | 0x0080);
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
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 49);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 42) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 35) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 28) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i - 1;
       tbuffer[i] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64FiveBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 28);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64FourBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 21);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i - 1;
       tbuffer[i] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64NineBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 56);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 49) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 42) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 35) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 28) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64OneByte(long p0){
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       this.pos = tpos - 1;
       this.buffer[tpos] = (byte)(int)p0;
    }
    public final void writeVarint64SevenBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 42);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 35) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 28) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64SixBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 35);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 28) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i - 1;
       tbuffer[i] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64TenBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 63);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 56) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 49) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 42) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 35) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 28) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 21) & 127) | 128);
       i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 14) & 127) | 128);
       i = i1 - 1;
       this.pos = i;
       tbuffer[i1] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i - 1;
       tbuffer[i] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64ThreeBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)((int)p0 >> 14);
       int i1 = i - 1;
       this.pos = i1;
       tbuffer[i] = (byte)(int)(((p0 >> 7) & 127) | 128);
       this.pos = i1 - 1;
       tbuffer[i1] = (byte)(int)((p0 & 127) | 128);
    }
    public final void writeVarint64TwoBytes(long p0){
       BinaryWriter$SafeHeapWriter tbuffer = this.buffer;
       BinaryWriter$SafeHeapWriter tpos = this.pos;
       int i = tpos - 1;
       this.pos = i;
       tbuffer[tpos] = (byte)(int)(p0 >> 7);
       this.pos = i - 1;
       tbuffer[i] = (byte)(((int)p0 & 0x7f) | 0x0080);
    }
}

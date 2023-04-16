package com.google.protobuf.CodedOutputStream$ArrayEncoder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStream$1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import java.lang.System;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Writer;
import java.nio.Buffer;
import java.lang.CharSequence;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Android;
import com.google.protobuf.UnsafeUtil;

public class CodedOutputStream$ArrayEncoder extends CodedOutputStream	// class@0003e7
{
    public final byte[] buffer;
    public final int limit;
    public final int offset;
    public int position;

    public void CodedOutputStream$ArrayEncoder(byte[] p0,int p1,int p2){
       super(null);
       Objects.requireNonNull(p0, "buffer");
       int i = p1 + p2;
       if (((p1 | p2) | (p0.length - i)) >= 0) {
          this.buffer = p0;
          this.offset = p1;
          this.position = p1;
          this.limit = i;
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.length),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArray));
       }
    }
    public void flush(){
    }
    public final int getTotalBytesWritten(){
       return (this.position - this.offset);
    }
    public final int spaceLeft(){
       return (this.limit - this.position);
    }
    public final void write(byte p0){
       try{
          CodedOutputStream$ArrayEncoder tposition = this.position;
          this.position = tposition + 1;
          this.buffer[tposition] = p0;
          return;
       }catch(java.lang.IndexOutOfBoundsException e5){
          Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(1)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
       }
    }
    public final void write(ByteBuffer p0){
       int i = p0.remaining();
       try{
          p0.get(this.buffer, this.position, i);
          this.position = this.position + i;
          return;
       }catch(java.lang.IndexOutOfBoundsException e6){
          Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(i)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e6);
       }
    }
    public final void write(byte[] p0,int p1,int p2){
       try{
          System.arraycopy(p0, p1, this.buffer, this.position, p2);
          this.position = this.position + p2;
          return;
       }catch(java.lang.IndexOutOfBoundsException e4){
          Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(p2)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e4);
       }
    }
    public final void writeBool(int p0,boolean p1){
       this.writeTag(p0, 0);
       this.write((byte)p1);
    }
    public final void writeByteArray(int p0,byte[] p1){
       this.writeByteArray(p0, p1, 0, p1.length);
    }
    public final void writeByteArray(int p0,byte[] p1,int p2,int p3){
       this.writeTag(p0, 2);
       this.writeByteArrayNoTag(p1, p2, p3);
    }
    public final void writeByteArrayNoTag(byte[] p0,int p1,int p2){
       this.writeUInt32NoTag(p2);
       this.write(p0, p1, p2);
    }
    public final void writeByteBuffer(int p0,ByteBuffer p1){
       this.writeTag(p0, 2);
       this.writeUInt32NoTag(p1.capacity());
       this.writeRawBytes(p1);
    }
    public final void writeBytes(int p0,ByteString p1){
       this.writeTag(p0, 2);
       this.writeBytesNoTag(p1);
    }
    public final void writeBytesNoTag(ByteString p0){
       this.writeUInt32NoTag(p0.size());
       p0.writeTo(this);
    }
    public final void writeFixed32(int p0,int p1){
       this.writeTag(p0, 5);
       this.writeFixed32NoTag(p1);
    }
    public final void writeFixed32NoTag(int p0){
       try{
          CodedOutputStream$ArrayEncoder tbuffer = this.buffer;
          CodedOutputStream$ArrayEncoder tposition = this.position;
          int i = tposition + 1;
          this.position = i;
          tbuffer[tposition] = (byte)(p0 & 0x00ff);
          int i1 = i + 1;
          this.position = i1;
          tbuffer[i] = (byte)((p0 >> 8) & 0x00ff);
          i = i1 + 1;
          this.position = i;
          tbuffer[i1] = (byte)((p0 >> 16) & 0x00ff);
          this.position = i + 1;
          tbuffer[i] = (byte)((p0 >> 24) & 0x00ff);
          return;
       }catch(java.lang.IndexOutOfBoundsException e5){
          Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(1)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
       }
    }
    public final void writeFixed64(int p0,long p1){
       this.writeTag(p0, 1);
       this.writeFixed64NoTag(p1);
    }
    public final void writeFixed64NoTag(long p0){
       try{
          CodedOutputStream$ArrayEncoder tbuffer = this.buffer;
          CodedOutputStream$ArrayEncoder tposition = this.position;
          int i = tposition + 1;
          this.position = i;
          tbuffer[tposition] = (byte)((int)p0 & 0x00ff);
          int i1 = i + 1;
          this.position = i1;
          tbuffer[i] = (byte)((int)(p0 >> 8) & 0x00ff);
          i = i1 + 1;
          this.position = i;
          tbuffer[i1] = (byte)((int)(p0 >> 16) & 0x00ff);
          i1 = i + 1;
          this.position = i1;
          tbuffer[i] = (byte)((int)(p0 >> 24) & 0x00ff);
          i = i1 + 1;
          this.position = i;
          tbuffer[i1] = (byte)((int)(p0 >> 32) & 0x00ff);
          i1 = i + 1;
          this.position = i1;
          tbuffer[i] = (byte)((int)(p0 >> 40) & 0x00ff);
          i = i1 + 1;
          this.position = i;
          tbuffer[i1] = (byte)((int)(p0 >> 48) & 0x00ff);
          this.position = i + 1;
          tbuffer[i] = (byte)((int)(p0 >> 56) & 0x00ff);
          return;
       }catch(java.lang.IndexOutOfBoundsException e6){
          Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(1)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e6);
       }
    }
    public final void writeInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeInt32NoTag(p1);
    }
    public final void writeInt32NoTag(int p0){
       if (p0 >= 0) {
          this.writeUInt32NoTag(p0);
       }else {
          this.writeUInt64NoTag((long)p0);
       }
       return;
    }
    public final void writeLazy(ByteBuffer p0){
       this.write(p0);
    }
    public final void writeLazy(byte[] p0,int p1,int p2){
       this.write(p0, p1, p2);
    }
    public final void writeMessage(int p0,MessageLite p1){
       this.writeTag(p0, 2);
       this.writeMessageNoTag(p1);
    }
    public final void writeMessage(int p0,MessageLite p1,Schema p2){
       this.writeTag(p0, 2);
       this.writeUInt32NoTag(p1.getSerializedSize(p2));
       p2.writeTo(p1, this.wrapper);
    }
    public final void writeMessageNoTag(MessageLite p0){
       this.writeUInt32NoTag(p0.getSerializedSize());
       p0.writeTo(this);
    }
    public final void writeMessageNoTag(MessageLite p0,Schema p1){
       this.writeUInt32NoTag(p0.getSerializedSize(p1));
       p1.writeTo(p0, this.wrapper);
    }
    public final void writeMessageSetExtension(int p0,MessageLite p1){
       this.writeTag(1, 3);
       this.writeUInt32(2, p0);
       this.writeMessage(3, p1);
       this.writeTag(1, 4);
    }
    public final void writeRawBytes(ByteBuffer p0){
       if (p0.hasArray()) {
          this.write(p0.array(), p0.arrayOffset(), p0.capacity());
       }else {
          p0 = p0.duplicate();
          p0.clear();
          this.write(p0);
       }
       return;
    }
    public final void writeRawMessageSetExtension(int p0,ByteString p1){
       this.writeTag(1, 3);
       this.writeUInt32(2, p0);
       this.writeBytes(3, p1);
       this.writeTag(1, 4);
    }
    public final void writeString(int p0,String p1){
       this.writeTag(p0, 2);
       this.writeStringNoTag(p1);
    }
    public final void writeStringNoTag(String p0){
       CodedOutputStream$ArrayEncoder tposition = this.position;
       try{
          int i = CodedOutputStream.computeUInt32SizeNoTag(p0.length());
          if (i == CodedOutputStream.computeUInt32SizeNoTag((p0.length() * 3))) {
             int i1 = tposition + i;
             this.position = i1;
             i1 = Utf8.encode(p0, this.buffer, i1, this.spaceLeft());
             this.position = tposition;
             this.writeUInt32NoTag(((i1 - tposition) - i));
             this.position = i1;
          }else {
             this.writeUInt32NoTag(Utf8.encodedLength(p0));
             this.position = Utf8.encode(p0, this.buffer, this.position, this.spaceLeft());
          }
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e1){
          this.position = tposition;
          this.inefficientWriteStringNoTag(p0, e1);
       }catch(java.lang.IndexOutOfBoundsException e6){
          throw new CodedOutputStream$OutOfSpaceException(e6);
       }
       return;
    }
    public final void writeTag(int p0,int p1){
       this.writeUInt32NoTag(WireFormat.makeTag(p0, p1));
    }
    public final void writeUInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeUInt32NoTag(p1);
    }
    public final void writeUInt32NoTag(int p0){
       CodedOutputStream$ArrayEncoder tposition;
       if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && (!Android.isOnAndroidDevice() && this.spaceLeft() >= 5)) {
          if (!(p0 & 0x80)) {
             tposition = this.position;
             this.position = tposition + 1;
             UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)p0);
             return;
          }else {
             tposition = this.position;
             this.position = tposition + 1;
             UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)(p0 | 0x0080));
             p0 = p0 >> 7;
             if (!(p0 & 0x80)) {
                tposition = this.position;
                this.position = tposition + 1;
                UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)p0);
                return;
             }else {
                tposition = this.position;
                this.position = tposition + 1;
                UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)(p0 | 0x0080));
                p0 = p0 >> 7;
                if (!(p0 & 0x80)) {
                   tposition = this.position;
                   this.position = tposition + 1;
                   UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)p0);
                   return;
                }else {
                   tposition = this.position;
                   this.position = tposition + 1;
                   UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)(p0 | 0x0080));
                   p0 = p0 >> 7;
                   if (!(p0 & 0x80)) {
                      tposition = this.position;
                      this.position = tposition + 1;
                      UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)p0);
                      return;
                   }else {
                      tposition = this.position;
                      this.position = tposition + 1;
                      UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)(p0 | 0x0080));
                      tposition = this.position;
                      this.position = tposition + 1;
                      UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)(p0 >> 7));
                      return;
                   }
                }
             }
          }
       }else {
          try{
             int i = p0 & 0x80;
             while (i) {
                tposition = this.position;
                int i1 = tposition + 1;
                this.position = i1;
                i1 = p0 & 0x7f;
                i1 = i1 | 0x0080;
                this.buffer[tposition] = (byte)i1;
                p0 = p0 >> 7;
             }
             tposition = this.position;
             this.position = tposition + 1;
             this.buffer[tposition] = (byte)p0;
             return;
          }catch(java.lang.IndexOutOfBoundsException e5){
             Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(1)};
             throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
          }
       }
    }
    public final void writeUInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeUInt64NoTag(p1);
    }
    public final void writeUInt64NoTag(long p0){
       long l;
       CodedOutputStream$ArrayEncoder tposition;
       int i1;
       CodedOutputStream$ArrayEncoder uArrayEncode = 7;
       int i = 0;
       if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && this.spaceLeft() >= 10) {
          l = p0 & -128;
          while (l - i) {
             tposition = this.position;
             i1 = tposition + 1;
             this.position = i1;
             int i2 = (int)p0 & 0x7f;
             i2 = i2 | 0x0080;
             UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)i2);
             p0 = p0 >> uArrayEncode;
          }
          uArrayEncode = this.position;
          this.position = uArrayEncode + 1;
          UnsafeUtil.putByte(this.buffer, (long)uArrayEncode, (byte)(int)p0);
          return;
       }else {
          try{
             l = p0 & -128;
             while (l - i) {
                tposition = this.position;
                i1 = tposition + 1;
                this.position = i1;
                i1 = (int)p0 & 0x7f;
                i1 = i1 | 0x0080;
                this.buffer[tposition] = (byte)i1;
                p0 = p0 >> uArrayEncode;
             }
             uArrayEncode = this.position;
             this.position = uArrayEncode + 1;
             this.buffer[uArrayEncode] = (byte)(int)p0;
             return;
          }catch(java.lang.IndexOutOfBoundsException e10){
             Object[] objArray = new Object[]{Integer.valueOf(this.position),Integer.valueOf(this.limit),Integer.valueOf(1)};
             throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray), e10);
          }
       }
    }
}

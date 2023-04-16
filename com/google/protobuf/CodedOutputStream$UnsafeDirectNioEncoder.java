package com.google.protobuf.CodedOutputStream$UnsafeDirectNioEncoder;
import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream$1;
import java.nio.ByteOrder;
import com.google.protobuf.UnsafeUtil;
import java.nio.Buffer;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import java.lang.Throwable;
import java.util.Objects;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Writer;
import java.lang.CharSequence;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;

public final class CodedOutputStream$UnsafeDirectNioEncoder extends CodedOutputStream	// class@0003ed
{
    public final long address;
    public final ByteBuffer buffer;
    public final long initialPosition;
    public final long limit;
    public final long oneVarintLimit;
    public final ByteBuffer originalBuffer;
    public long position;

    public void CodedOutputStream$UnsafeDirectNioEncoder(ByteBuffer p0){
       super(null);
       this.originalBuffer = p0;
       this.buffer = p0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       long l = UnsafeUtil.addressOffset(p0);
       this.address = l;
       long l1 = (long)p0.position() + l;
       this.initialPosition = l1;
       l = l + (long)p0.limit();
       this.limit = l;
       this.oneVarintLimit = l - 10;
       this.position = l1;
    }
    public static boolean isSupported(){
       return UnsafeUtil.hasUnsafeByteBufferOperations();
    }
    public final int bufferPos(long p0){
       return (int)(p0 - this.address);
    }
    public void flush(){
       this.originalBuffer.position(this.bufferPos(this.position));
    }
    public int getTotalBytesWritten(){
       return (int)(this.position - this.initialPosition);
    }
    public final void repositionBuffer(long p0){
       this.buffer.position(this.bufferPos(p0));
    }
    public int spaceLeft(){
       return (int)(this.limit - this.position);
    }
    public void write(byte p0){
       CodedOutputStream$UnsafeDirectNioEncoder tposition = this.position;
       if (tposition - this.limit < 0) {
          this.position = 1 + tposition;
          UnsafeUtil.putByte(tposition, p0);
          return;
       }else {
          Object[] objArray = new Object[]{Long.valueOf(this.position),Long.valueOf(this.limit),Integer.valueOf(1)};
          throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray));
       }
    }
    public void write(ByteBuffer p0){
       try{
          this.repositionBuffer(this.position);
          this.buffer.put(p0);
          this.position = this.position + (long)p0.remaining();
          return;
       }catch(java.nio.BufferOverflowException e6){
          throw new CodedOutputStream$OutOfSpaceException(e6);
       }
    }
    public void write(byte[] p0,int p1,int p2){
       if (p0 != null && (p1 >= 0 && (p2 >= 0 && (p0.length - p2) >= p1))) {
          long l = (long)p2;
          CodedOutputStream$UnsafeDirectNioEncoder tposition = this.position;
          if ((this.limit - l) - tposition >= 0) {
             UnsafeUtil.copyMemory(p0, (long)p1, tposition, l);
             this.position = this.position + l;
             return;
          }
       }
    label_0020 :
       Objects.requireNonNull(p0, "value");
       Object[] objArray = new Object[]{Long.valueOf(this.position),Long.valueOf(this.limit),Integer.valueOf(p2)};
       throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray));
    }
    public void writeBool(int p0,boolean p1){
       this.writeTag(p0, 0);
       this.write((byte)p1);
    }
    public void writeByteArray(int p0,byte[] p1){
       this.writeByteArray(p0, p1, 0, p1.length);
    }
    public void writeByteArray(int p0,byte[] p1,int p2,int p3){
       this.writeTag(p0, 2);
       this.writeByteArrayNoTag(p1, p2, p3);
    }
    public void writeByteArrayNoTag(byte[] p0,int p1,int p2){
       this.writeUInt32NoTag(p2);
       this.write(p0, p1, p2);
    }
    public void writeByteBuffer(int p0,ByteBuffer p1){
       this.writeTag(p0, 2);
       this.writeUInt32NoTag(p1.capacity());
       this.writeRawBytes(p1);
    }
    public void writeBytes(int p0,ByteString p1){
       this.writeTag(p0, 2);
       this.writeBytesNoTag(p1);
    }
    public void writeBytesNoTag(ByteString p0){
       this.writeUInt32NoTag(p0.size());
       p0.writeTo(this);
    }
    public void writeFixed32(int p0,int p1){
       this.writeTag(p0, 5);
       this.writeFixed32NoTag(p1);
    }
    public void writeFixed32NoTag(int p0){
       this.buffer.putInt(this.bufferPos(this.position), p0);
       this.position = this.position + 4;
    }
    public void writeFixed64(int p0,long p1){
       this.writeTag(p0, 1);
       this.writeFixed64NoTag(p1);
    }
    public void writeFixed64NoTag(long p0){
       this.buffer.putLong(this.bufferPos(this.position), p0);
       this.position = this.position + 8;
    }
    public void writeInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeInt32NoTag(p1);
    }
    public void writeInt32NoTag(int p0){
       if (p0 >= 0) {
          this.writeUInt32NoTag(p0);
       }else {
          this.writeUInt64NoTag((long)p0);
       }
       return;
    }
    public void writeLazy(ByteBuffer p0){
       this.write(p0);
    }
    public void writeLazy(byte[] p0,int p1,int p2){
       this.write(p0, p1, p2);
    }
    public void writeMessage(int p0,MessageLite p1){
       this.writeTag(p0, 2);
       this.writeMessageNoTag(p1);
    }
    public void writeMessage(int p0,MessageLite p1,Schema p2){
       this.writeTag(p0, 2);
       this.writeMessageNoTag(p1, p2);
    }
    public void writeMessageNoTag(MessageLite p0){
       this.writeUInt32NoTag(p0.getSerializedSize());
       p0.writeTo(this);
    }
    public void writeMessageNoTag(MessageLite p0,Schema p1){
       this.writeUInt32NoTag(p0.getSerializedSize(p1));
       p1.writeTo(p0, this.wrapper);
    }
    public void writeMessageSetExtension(int p0,MessageLite p1){
       this.writeTag(1, 3);
       this.writeUInt32(2, p0);
       this.writeMessage(3, p1);
       this.writeTag(1, 4);
    }
    public void writeRawBytes(ByteBuffer p0){
       if (p0.hasArray()) {
          this.write(p0.array(), p0.arrayOffset(), p0.capacity());
       }else {
          p0 = p0.duplicate();
          p0.clear();
          this.write(p0);
       }
       return;
    }
    public void writeRawMessageSetExtension(int p0,ByteString p1){
       this.writeTag(1, 3);
       this.writeUInt32(2, p0);
       this.writeBytes(3, p1);
       this.writeTag(1, 4);
    }
    public void writeString(int p0,String p1){
       this.writeTag(p0, 2);
       this.writeStringNoTag(p1);
    }
    public void writeStringNoTag(String p0){
       int i1;
       CodedOutputStream$UnsafeDirectNioEncoder tposition = this.position;
       try{
          int i = CodedOutputStream.computeUInt32SizeNoTag(p0.length());
          if (i == CodedOutputStream.computeUInt32SizeNoTag((p0.length() * 3))) {
             i1 = this.bufferPos(this.position) + i;
             this.buffer.position(i1);
             Utf8.encodeUtf8(p0, this.buffer);
             i = this.buffer.position() - i1;
             this.writeUInt32NoTag(i);
             this.position = this.position + (long)i;
          }else {
             i1 = Utf8.encodedLength(p0);
             this.writeUInt32NoTag(i1);
             this.repositionBuffer(this.position);
             Utf8.encodeUtf8(p0, this.buffer);
             this.position = this.position + (long)i1;
          }
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e2){
          this.position = tposition;
          this.repositionBuffer(tposition);
          this.inefficientWriteStringNoTag(p0, e2);
       }catch(java.lang.IllegalArgumentException e8){
          throw new CodedOutputStream$OutOfSpaceException(e8);
       }catch(java.lang.IndexOutOfBoundsException e8){
          throw new CodedOutputStream$OutOfSpaceException(e8);
       }
       return;
    }
    public void writeTag(int p0,int p1){
       this.writeUInt32NoTag(WireFormat.makeTag(p0, p1));
    }
    public void writeUInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeUInt32NoTag(p1);
    }
    public void writeUInt32NoTag(int p0){
       CodedOutputStream$UnsafeDirectNioEncoder tposition;
       long l1;
       int i1;
       long l = 1;
       if (this.position - this.oneVarintLimit <= 0) {
          int i = p0 & 0x80;
          while (i) {
             tposition = this.position;
             l1 = tposition + l;
             this.position = l1;
             i1 = p0 & 0x7f;
             i1 = i1 | 0x0080;
             UnsafeUtil.putByte(tposition, (byte)i1);
             p0 = p0 >> 7;
          }
          tposition = this.position;
          this.position = l + tposition;
          UnsafeUtil.putByte(tposition, (byte)p0);
          return;
       }else {
          while (true) {
             tposition = this.position;
             if (tposition - this.limit < 0) {
                i1 = p0 & 0x80;
                if (!i1) {
                   break ;
                }else {
                   l1 = tposition + l;
                   this.position = l1;
                   i1 = p0 & 0x7f;
                   i1 = i1 | 0x0080;
                   UnsafeUtil.putByte(tposition, (byte)i1);
                   p0 = p0 >> 7;
                }
             }else {
                Object[] objArray = new Object[]{Long.valueOf(this.position),Long.valueOf(this.limit),Integer.valueOf(1)};
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray));
             }
          }
          this.position = l + tposition;
          UnsafeUtil.putByte(tposition, (byte)p0);
          return;
       }
    }
    public void writeUInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeUInt64NoTag(p1);
    }
    public void writeUInt64NoTag(long p0){
       CodedOutputStream$UnsafeDirectNioEncoder tposition;
       long l2;
       int i;
       long l = 1;
       if (this.position - this.oneVarintLimit <= 0) {
          long l1 = p0 & -128;
          while (l1) {
             tposition = this.position;
             l2 = tposition + l;
             this.position = l2;
             i = (int)p0 & 0x7f;
             i = i | 0x0080;
             UnsafeUtil.putByte(tposition, (byte)i);
             p0 = p0 >> 7;
          }
          tposition = this.position;
          this.position = l + tposition;
          UnsafeUtil.putByte(tposition, (byte)(int)p0);
          return;
       }else {
          while (true) {
             tposition = this.position;
             if (tposition - this.limit < 0) {
                l2 = p0 & -128;
                if (!l2) {
                   break ;
                }else {
                   l2 = tposition + l;
                   this.position = l2;
                   i = (int)p0 & 0x7f;
                   i = i | 0x0080;
                   UnsafeUtil.putByte(tposition, (byte)i);
                   p0 = p0 >> 7;
                }
             }else {
                Object[] objArray = new Object[]{Long.valueOf(this.position),Long.valueOf(this.limit),Integer.valueOf(1)};
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", objArray));
             }
          }
          this.position = l + tposition;
          UnsafeUtil.putByte(tposition, (byte)(int)p0);
          return;
       }
    }
}

package com.google.protobuf.CodedOutputStream$SafeDirectNioEncoder;
import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream$1;
import java.nio.ByteOrder;
import java.lang.String;
import java.lang.CharSequence;
import com.google.protobuf.Utf8;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.lang.Throwable;
import java.nio.Buffer;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.AbstractMessageLite;
import java.lang.Object;
import com.google.protobuf.Writer;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;

public final class CodedOutputStream$SafeDirectNioEncoder extends CodedOutputStream	// class@0003ec
{
    public final ByteBuffer buffer;
    public final int initialPosition;
    public final ByteBuffer originalBuffer;

    public void CodedOutputStream$SafeDirectNioEncoder(ByteBuffer p0){
       super(null);
       this.originalBuffer = p0;
       this.buffer = p0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       this.initialPosition = p0.position();
    }
    public final void encode(String p0){
       try{
          Utf8.encodeUtf8(p0, this.buffer);
          return;
       }catch(java.lang.IndexOutOfBoundsException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
    }
    public void flush(){
       this.originalBuffer.position(this.buffer.position());
    }
    public int getTotalBytesWritten(){
       return (this.buffer.position() - this.initialPosition);
    }
    public int spaceLeft(){
       return this.buffer.remaining();
    }
    public void write(byte p0){
       try{
          this.buffer.put(p0);
          return;
       }catch(java.nio.BufferOverflowException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
    }
    public void write(ByteBuffer p0){
       try{
          this.buffer.put(p0);
          return;
       }catch(java.nio.BufferOverflowException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
    }
    public void write(byte[] p0,int p1,int p2){
       try{
          this.buffer.put(p0, p1, p2);
          return;
       }catch(java.lang.IndexOutOfBoundsException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }catch(java.nio.BufferOverflowException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
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
       try{
          this.buffer.putInt(p0);
          return;
       }catch(java.nio.BufferOverflowException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
    }
    public void writeFixed64(int p0,long p1){
       this.writeTag(p0, 1);
       this.writeFixed64NoTag(p1);
    }
    public void writeFixed64NoTag(long p0){
       try{
          this.buffer.putLong(p0);
          return;
       }catch(java.nio.BufferOverflowException e2){
          throw new CodedOutputStream$OutOfSpaceException(e2);
       }
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
       int i = this.buffer.position();
       try{
          int i1 = CodedOutputStream.computeUInt32SizeNoTag(p0.length());
          if (i1 == CodedOutputStream.computeUInt32SizeNoTag((p0.length() * 3))) {
             int i2 = this.buffer.position() + i1;
             this.buffer.position(i2);
             this.encode(p0);
             i1 = this.buffer.position();
             this.buffer.position(i);
             this.writeUInt32NoTag((i1 - i2));
             this.buffer.position(i1);
          }else {
             this.writeUInt32NoTag(Utf8.encodedLength(p0));
             this.encode(p0);
          }
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e1){
          this.buffer.position(i);
          this.inefficientWriteStringNoTag(p0, e1);
       }catch(java.lang.IllegalArgumentException e5){
          throw new CodedOutputStream$OutOfSpaceException(e5);
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
       try{
          int i = p0 & 0x80;
          while (i) {
             int i1 = p0 & 0x7f;
             i1 = i1 | 0x0080;
             this.buffer.put((byte)i1);
             p0 = p0 >> 7;
          }
          this.buffer.put((byte)p0);
          return;
       }catch(java.nio.BufferOverflowException e3){
          throw new CodedOutputStream$OutOfSpaceException(e3);
       }
    }
    public void writeUInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeUInt64NoTag(p1);
    }
    public void writeUInt64NoTag(long p0){
       try{
          long l = -128 & p0;
          while (l) {
             int i = (int)p0 & 0x7f;
             i = i | 0x0080;
             this.buffer.put((byte)i);
             p0 = p0 >> 7;
          }
          this.buffer.put((byte)(int)p0);
          return;
       }catch(java.nio.BufferOverflowException e6){
          throw new CodedOutputStream$OutOfSpaceException(e6);
       }
    }
}

package com.google.protobuf.CodedOutputStream$ByteOutputEncoder;
import com.google.protobuf.CodedOutputStream$AbstractBufferedEncoder;
import com.google.protobuf.ByteOutput;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteBuffer;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Writer;
import java.nio.Buffer;
import java.lang.CharSequence;
import com.google.protobuf.Utf8;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.lang.Throwable;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;

public final class CodedOutputStream$ByteOutputEncoder extends CodedOutputStream$AbstractBufferedEncoder	// class@0003e8
{
    public final ByteOutput out;

    public void CodedOutputStream$ByteOutputEncoder(ByteOutput p0,int p1){
       super(p1);
       Objects.requireNonNull(p0, "out");
       this.out = p0;
    }
    public final void doFlush(){
       this.out.write(this.buffer, 0, this.position);
       this.position = 0;
    }
    public void flush(){
       if (this.position > null) {
          this.doFlush();
       }
       return;
    }
    public final void flushIfNotAvailable(int p0){
       if ((this.limit - this.position) < p0) {
          this.doFlush();
       }
       return;
    }
    public void write(byte p0){
       if (this.position == this.limit) {
          this.doFlush();
       }
       this.buffer(p0);
       return;
    }
    public void write(ByteBuffer p0){
       this.flush();
       this.out.write(p0);
       this.totalBytesWritten = this.totalBytesWritten + p0.remaining();
    }
    public void write(byte[] p0,int p1,int p2){
       this.flush();
       this.out.write(p0, p1, p2);
       this.totalBytesWritten = this.totalBytesWritten + p2;
    }
    public void writeBool(int p0,boolean p1){
       this.flushIfNotAvailable(11);
       this.bufferTag(p0, 0);
       this.buffer((byte)p1);
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
       this.flushIfNotAvailable(14);
       this.bufferTag(p0, 5);
       this.bufferFixed32NoTag(p1);
    }
    public void writeFixed32NoTag(int p0){
       this.flushIfNotAvailable(4);
       this.bufferFixed32NoTag(p0);
    }
    public void writeFixed64(int p0,long p1){
       this.flushIfNotAvailable(18);
       this.bufferTag(p0, 1);
       this.bufferFixed64NoTag(p1);
    }
    public void writeFixed64NoTag(long p0){
       this.flushIfNotAvailable(8);
       this.bufferFixed64NoTag(p0);
    }
    public void writeInt32(int p0,int p1){
       this.flushIfNotAvailable(20);
       this.bufferTag(p0, 0);
       this.bufferInt32NoTag(p1);
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
       this.flush();
       this.out.writeLazy(p0);
       this.totalBytesWritten = this.totalBytesWritten + p0.remaining();
    }
    public void writeLazy(byte[] p0,int p1,int p2){
       this.flush();
       this.out.writeLazy(p0, p1, p2);
       this.totalBytesWritten = this.totalBytesWritten + p2;
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
       int i = p0.length() * 3;
       int i1 = CodedOutputStream.computeUInt32SizeNoTag(i);
       int i2 = i1 + i;
       CodedOutputStream$AbstractBufferedEncoder tlimit = this.limit;
       if (i2 > tlimit) {
          byte[] uobyteArray = new byte[i];
          int i3 = Utf8.encode(p0, uobyteArray, 0, i);
          this.writeUInt32NoTag(i3);
          this.writeLazy(uobyteArray, 0, i3);
          return;
       }else if(i2 > (tlimit - this.position)){
          this.doFlush();
       }
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       try{
          i2 = CodedOutputStream.computeUInt32SizeNoTag(p0.length());
          if (i2 == i1) {
             i1 = tposition + i2;
             this.position = i1;
             i1 = Utf8.encode(p0, this.buffer, i1, (this.limit - i1));
             this.position = tposition;
             int i4 = (i1 - tposition) - i2;
             this.bufferUInt32NoTag(i4);
             this.position = i1;
             this.totalBytesWritten = this.totalBytesWritten + i4;
          }else {
             i1 = Utf8.encodedLength(p0);
             this.bufferUInt32NoTag(i1);
             this.position = Utf8.encode(p0, this.buffer, this.position, i1);
             this.totalBytesWritten = this.totalBytesWritten + i1;
          }
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e1){
          this.totalBytesWritten = this.totalBytesWritten - (this.position - tposition);
          this.position = tposition;
          this.inefficientWriteStringNoTag(p0, e1);
       }catch(java.lang.IndexOutOfBoundsException e6){
          throw new CodedOutputStream$OutOfSpaceException(e6);
       }
       return;
    }
    public void writeTag(int p0,int p1){
       this.writeUInt32NoTag(WireFormat.makeTag(p0, p1));
    }
    public void writeUInt32(int p0,int p1){
       this.flushIfNotAvailable(20);
       this.bufferTag(p0, 0);
       this.bufferUInt32NoTag(p1);
    }
    public void writeUInt32NoTag(int p0){
       this.flushIfNotAvailable(5);
       this.bufferUInt32NoTag(p0);
    }
    public void writeUInt64(int p0,long p1){
       this.flushIfNotAvailable(20);
       this.bufferTag(p0, 0);
       this.bufferUInt64NoTag(p1);
    }
    public void writeUInt64NoTag(long p0){
       this.flushIfNotAvailable(10);
       this.bufferUInt64NoTag(p0);
    }
}

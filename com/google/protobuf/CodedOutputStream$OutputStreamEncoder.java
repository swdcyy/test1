package com.google.protobuf.CodedOutputStream$OutputStreamEncoder;
import com.google.protobuf.CodedOutputStream$AbstractBufferedEncoder;
import java.io.OutputStream;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.lang.System;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteOutput;
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

public final class CodedOutputStream$OutputStreamEncoder extends CodedOutputStream$AbstractBufferedEncoder	// class@0003eb
{
    public final OutputStream out;

    public void CodedOutputStream$OutputStreamEncoder(OutputStream p0,int p1){
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
       int i = p0.remaining();
       CodedOutputStream$AbstractBufferedEncoder tlimit = this.limit;
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       if ((tlimit - tposition) >= i) {
          p0.get(this.buffer, tposition, i);
          this.position = this.position + i;
          this.totalBytesWritten = this.totalBytesWritten + i;
       }else {
          int i1 = tlimit - tposition;
          p0.get(this.buffer, tposition, i1);
          i = i - i1;
          this.position = this.limit;
          this.totalBytesWritten = this.totalBytesWritten + i1;
          this.doFlush();
          tlimit = this.limit;
          int i2 = 0;
          while (i > tlimit) {
             p0.get(this.buffer, i2, tlimit);
             this.out.write(this.buffer, i2, this.limit);
             tlimit = this.limit;
             i = i - tlimit;
             i2 = this.totalBytesWritten + tlimit;
             this.totalBytesWritten = i2;
          }
          p0.get(this.buffer, i2, i);
          this.position = i;
          this.totalBytesWritten = this.totalBytesWritten + i;
       }
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       CodedOutputStream$AbstractBufferedEncoder tlimit = this.limit;
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       if ((tlimit - tposition) >= p2) {
          System.arraycopy(p0, p1, this.buffer, tposition, p2);
          this.position = this.position + p2;
          this.totalBytesWritten = this.totalBytesWritten + p2;
       }else {
          int i = tlimit - tposition;
          System.arraycopy(p0, p1, this.buffer, tposition, i);
          p1 = p1 + i;
          p2 = p2 - i;
          this.position = this.limit;
          this.totalBytesWritten = this.totalBytesWritten + i;
          this.doFlush();
          if (p2 <= this.limit) {
             System.arraycopy(p0, p1, this.buffer, 0, p2);
             this.position = p2;
          }else {
             this.out.write(p0, p1, p2);
          }
          this.totalBytesWritten = this.totalBytesWritten + p2;
       }
       return;
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
       CodedOutputStream$AbstractBufferedEncoder tposition;
       int i3;
       try{
          int i = p0.length() * 3;
          int i1 = CodedOutputStream.computeUInt32SizeNoTag(i);
          int i2 = i1 + i;
          CodedOutputStream$AbstractBufferedEncoder tlimit = this.limit;
          if (i2 > tlimit) {
             byte[] uobyteArray = new byte[i];
             i = Utf8.encode(p0, uobyteArray, 0, i);
             this.writeUInt32NoTag(i);
             this.writeLazy(uobyteArray, 0, i);
             return;
          }else if(i2 > (tlimit - this.position)){
             this.doFlush();
          }
          try{
             i = CodedOutputStream.computeUInt32SizeNoTag(p0.length());
             tposition = this.position;
             if (i == i1) {
                i1 = tposition + i;
                this.position = i1;
                i1 = Utf8.encode(p0, this.buffer, i1, (this.limit - i1));
                this.position = tposition;
                i3 = (i1 - tposition) - i;
                this.bufferUInt32NoTag(i3);
                this.position = i1;
             }else {
                i3 = Utf8.encodedLength(p0);
                this.bufferUInt32NoTag(i3);
                this.position = Utf8.encode(p0, this.buffer, this.position, i3);
             }
             this.totalBytesWritten = this.totalBytesWritten + i3;
          }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e0){
             this.totalBytesWritten = this.totalBytesWritten - (this.position - tposition);
             this.position = tposition;
             throw e0;
          }catch(java.lang.ArrayIndexOutOfBoundsException e0){
             try{
                throw new CodedOutputStream$OutOfSpaceException(e0);
             }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e0){
                this.inefficientWriteStringNoTag(p0, e0);
             }
          }
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e0){
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

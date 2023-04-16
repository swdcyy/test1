package com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteOutput;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.CodedOutputStream$1;
import java.nio.ByteBuffer;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.LazyFieldLite;
import java.lang.CharSequence;
import com.google.protobuf.Utf8;
import com.google.protobuf.Internal;
import java.nio.charset.Charset;
import com.google.protobuf.WireFormat;
import com.google.protobuf.CodedOutputStream$ByteOutputEncoder;
import java.lang.IllegalArgumentException;
import java.io.OutputStream;
import com.google.protobuf.CodedOutputStream$OutputStreamEncoder;
import com.google.protobuf.CodedOutputStream$HeapNioEncoder;
import com.google.protobuf.CodedOutputStream$UnsafeDirectNioEncoder;
import com.google.protobuf.CodedOutputStream$ArrayEncoder;
import com.google.protobuf.CodedOutputStream$SafeDirectNioEncoder;
import java.lang.IllegalStateException;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.util.logging.Level;
import java.lang.Throwable;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.lang.Double;
import java.lang.Float;
import java.lang.Object;
import com.google.protobuf.Writer;

public abstract class CodedOutputStream extends ByteOutput	// class@0003ee
{
    public boolean serializationDeterministic;
    public CodedOutputStreamWriter wrapper;
    public static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    public static final int LITTLE_ENDIAN_32_SIZE = 1;
    public static final Logger logger;

    static {
       CodedOutputStream.logger = Logger.getLogger(CodedOutputStream.class.getName());
       CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();
    }
    public void CodedOutputStream(){
       super();
    }
    public void CodedOutputStream(CodedOutputStream$1 p0){
       super();
    }
    public static int computeBoolSize(int p0,boolean p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeBoolSizeNoTag(p1));
    }
    public static int computeBoolSizeNoTag(boolean p0){
       return 1;
    }
    public static int computeByteArraySize(int p0,byte[] p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeByteArraySizeNoTag(p1));
    }
    public static int computeByteArraySizeNoTag(byte[] p0){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.length);
    }
    public static int computeByteBufferSize(int p0,ByteBuffer p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeByteBufferSizeNoTag(p1));
    }
    public static int computeByteBufferSizeNoTag(ByteBuffer p0){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.capacity());
    }
    public static int computeBytesSize(int p0,ByteString p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeBytesSizeNoTag(p1));
    }
    public static int computeBytesSizeNoTag(ByteString p0){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.size());
    }
    public static int computeDoubleSize(int p0,double p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeDoubleSizeNoTag(p1));
    }
    public static int computeDoubleSizeNoTag(double p0){
       return 8;
    }
    public static int computeEnumSize(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeEnumSizeNoTag(p1));
    }
    public static int computeEnumSizeNoTag(int p0){
       return CodedOutputStream.computeInt32SizeNoTag(p0);
    }
    public static int computeFixed32Size(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeFixed32SizeNoTag(p1));
    }
    public static int computeFixed32SizeNoTag(int p0){
       return 4;
    }
    public static int computeFixed64Size(int p0,long p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeFixed64SizeNoTag(p1));
    }
    public static int computeFixed64SizeNoTag(long p0){
       return 8;
    }
    public static int computeFloatSize(int p0,float p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeFloatSizeNoTag(p1));
    }
    public static int computeFloatSizeNoTag(float p0){
       return 4;
    }
    public static int computeGroupSize(int p0,MessageLite p1){
       return ((CodedOutputStream.computeTagSize(p0) * 2) + CodedOutputStream.computeGroupSizeNoTag(p1));
    }
    public static int computeGroupSize(int p0,MessageLite p1,Schema p2){
       return ((CodedOutputStream.computeTagSize(p0) * 2) + CodedOutputStream.computeGroupSizeNoTag(p1, p2));
    }
    public static int computeGroupSizeNoTag(MessageLite p0){
       return p0.getSerializedSize();
    }
    public static int computeGroupSizeNoTag(MessageLite p0,Schema p1){
       return p0.getSerializedSize(p1);
    }
    public static int computeInt32Size(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeInt32SizeNoTag(p1));
    }
    public static int computeInt32SizeNoTag(int p0){
       if (p0 >= 0) {
          return CodedOutputStream.computeUInt32SizeNoTag(p0);
       }
       return 10;
    }
    public static int computeInt64Size(int p0,long p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeInt64SizeNoTag(p1));
    }
    public static int computeInt64SizeNoTag(long p0){
       return CodedOutputStream.computeUInt64SizeNoTag(p0);
    }
    public static int computeLazyFieldMessageSetExtensionSize(int p0,LazyFieldLite p1){
       return (((CodedOutputStream.computeTagSize(1) * 2) + CodedOutputStream.computeUInt32Size(2, p0)) + CodedOutputStream.computeLazyFieldSize(3, p1));
    }
    public static int computeLazyFieldSize(int p0,LazyFieldLite p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLazyFieldSizeNoTag(p1));
    }
    public static int computeLazyFieldSizeNoTag(LazyFieldLite p0){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.getSerializedSize());
    }
    public static int computeLengthDelimitedFieldSize(int p0){
       return (CodedOutputStream.computeUInt32SizeNoTag(p0) + p0);
    }
    public static int computeMessageSetExtensionSize(int p0,MessageLite p1){
       return (((CodedOutputStream.computeTagSize(1) * 2) + CodedOutputStream.computeUInt32Size(2, p0)) + CodedOutputStream.computeMessageSize(3, p1));
    }
    public static int computeMessageSize(int p0,MessageLite p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeMessageSizeNoTag(p1));
    }
    public static int computeMessageSize(int p0,MessageLite p1,Schema p2){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeMessageSizeNoTag(p1, p2));
    }
    public static int computeMessageSizeNoTag(MessageLite p0){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.getSerializedSize());
    }
    public static int computeMessageSizeNoTag(MessageLite p0,Schema p1){
       return CodedOutputStream.computeLengthDelimitedFieldSize(p0.getSerializedSize(p1));
    }
    public static int computePreferredBufferSize(int p0){
       if (p0 > 4096) {
          return 4096;
       }
       return p0;
    }
    public static int computeRawMessageSetExtensionSize(int p0,ByteString p1){
       return (((CodedOutputStream.computeTagSize(1) * 2) + CodedOutputStream.computeUInt32Size(2, p0)) + CodedOutputStream.computeBytesSize(3, p1));
    }
    public static int computeRawVarint32Size(int p0){
       return CodedOutputStream.computeUInt32SizeNoTag(p0);
    }
    public static int computeRawVarint64Size(long p0){
       return CodedOutputStream.computeUInt64SizeNoTag(p0);
    }
    public static int computeSFixed32Size(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeSFixed32SizeNoTag(p1));
    }
    public static int computeSFixed32SizeNoTag(int p0){
       return 4;
    }
    public static int computeSFixed64Size(int p0,long p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeSFixed64SizeNoTag(p1));
    }
    public static int computeSFixed64SizeNoTag(long p0){
       return 8;
    }
    public static int computeSInt32Size(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeSInt32SizeNoTag(p1));
    }
    public static int computeSInt32SizeNoTag(int p0){
       return CodedOutputStream.computeUInt32SizeNoTag(CodedOutputStream.encodeZigZag32(p0));
    }
    public static int computeSInt64Size(int p0,long p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeSInt64SizeNoTag(p1));
    }
    public static int computeSInt64SizeNoTag(long p0){
       return CodedOutputStream.computeUInt64SizeNoTag(CodedOutputStream.encodeZigZag64(p0));
    }
    public static int computeStringSize(int p0,String p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeStringSizeNoTag(p1));
    }
    public static int computeStringSizeNoTag(String p0){
       int i;
       try{
          i = Utf8.encodedLength(p0);
       }catch(com.google.protobuf.Utf8$UnpairedSurrogateException e0){
          i = i.getBytes(Internal.UTF_8).length;
       }
       return CodedOutputStream.computeLengthDelimitedFieldSize(i);
    }
    public static int computeTagSize(int p0){
       return CodedOutputStream.computeUInt32SizeNoTag(WireFormat.makeTag(p0, 0));
    }
    public static int computeUInt32Size(int p0,int p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeUInt32SizeNoTag(p1));
    }
    public static int computeUInt32SizeNoTag(int p0){
       if (!(p0 & 0x80)) {
          return 1;
       }
       if (!(p0 & 0xc000)) {
          return 2;
       }
       if (!(0xffe00000 & p0)) {
          return 3;
       }
       if (!(p0 & 0xf0000000)) {
          return 4;
       }
       return 5;
    }
    public static int computeUInt64Size(int p0,long p1){
       return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeUInt64SizeNoTag(p1));
    }
    public static int computeUInt64SizeNoTag(long p0){
       int i;
       if (!(-128 & p0)) {
          return 1;
       }
       if (p0 < 0) {
          return 10;
       }
       if (0xfffffff800000000 & p0) {
          i = 6;
          p0 = p0 >> 28;
       }else {
          i = 2;
       }
       if (-2097152 & p0) {
          i = i + 2;
          p0 = p0 >> 14;
       }
       if (p0 & -16384) {
          i = i + 1;
       }
       return i;
    }
    public static int encodeZigZag32(int p0){
       return ((p0 >> 31) ^ (p0 << 1));
    }
    public static long encodeZigZag64(long p0){
       return ((p0 >> 63) ^ (p0 << 1));
    }
    public static CodedOutputStream newInstance(ByteOutput p0,int p1){
       if (p1 >= 0) {
          return new CodedOutputStream$ByteOutputEncoder(p0, p1);
       }
       throw new IllegalArgumentException("bufferSize must be positive");
    }
    public static CodedOutputStream newInstance(OutputStream p0){
       return CodedOutputStream.newInstance(p0, 4096);
    }
    public static CodedOutputStream newInstance(OutputStream p0,int p1){
       return new CodedOutputStream$OutputStreamEncoder(p0, p1);
    }
    public static CodedOutputStream newInstance(ByteBuffer p0){
       if (p0.hasArray()) {
          return new CodedOutputStream$HeapNioEncoder(p0);
       }
       if (!p0.isDirect() || p0.isReadOnly()) {
          throw new IllegalArgumentException("ByteBuffer is read-only");
       }
       CodedOutputStream uCodedOutput = (CodedOutputStream$UnsafeDirectNioEncoder.isSupported())? CodedOutputStream.newUnsafeInstance(p0): CodedOutputStream.newSafeInstance(p0);
       return uCodedOutput;
    }
    public static CodedOutputStream newInstance(ByteBuffer p0,int p1){
       return CodedOutputStream.newInstance(p0);
    }
    public static CodedOutputStream newInstance(byte[] p0){
       return CodedOutputStream.newInstance(p0, 0, p0.length);
    }
    public static CodedOutputStream newInstance(byte[] p0,int p1,int p2){
       return new CodedOutputStream$ArrayEncoder(p0, p1, p2);
    }
    public static CodedOutputStream newSafeInstance(ByteBuffer p0){
       return new CodedOutputStream$SafeDirectNioEncoder(p0);
    }
    public static CodedOutputStream newUnsafeInstance(ByteBuffer p0){
       return new CodedOutputStream$UnsafeDirectNioEncoder(p0);
    }
    public final void checkNoSpaceLeft(){
       if (!this.spaceLeft()) {
          return;
       }
       throw new IllegalStateException("Did not write as much data as expected.");
    }
    public abstract void flush();
    public abstract int getTotalBytesWritten();
    public final void inefficientWriteStringNoTag(String p0,Utf8$UnpairedSurrogateException p1){
       CodedOutputStream.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p1);
       byte[] bytes = p0.getBytes(Internal.UTF_8);
       try{
          this.writeUInt32NoTag(bytes.length);
          this.writeLazy(bytes, 0, bytes.length);
          return;
       }catch(java.lang.IndexOutOfBoundsException e4){
          throw new CodedOutputStream$OutOfSpaceException(e4);
       }catch(com.google.protobuf.CodedOutputStream$OutOfSpaceException e4){
          throw e4;
       }
    }
    public boolean isSerializationDeterministic(){
       return this.serializationDeterministic;
    }
    public abstract int spaceLeft();
    public void useDeterministicSerialization(){
       this.serializationDeterministic = true;
    }
    public abstract void write(byte p0);
    public abstract void write(ByteBuffer p0);
    public abstract void write(byte[] p0,int p1,int p2);
    public abstract void writeBool(int p0,boolean p1);
    public final void writeBoolNoTag(boolean p0){
       this.write((byte)p0);
    }
    public abstract void writeByteArray(int p0,byte[] p1);
    public abstract void writeByteArray(int p0,byte[] p1,int p2,int p3);
    public final void writeByteArrayNoTag(byte[] p0){
       this.writeByteArrayNoTag(p0, 0, p0.length);
    }
    public abstract void writeByteArrayNoTag(byte[] p0,int p1,int p2);
    public abstract void writeByteBuffer(int p0,ByteBuffer p1);
    public abstract void writeBytes(int p0,ByteString p1);
    public abstract void writeBytesNoTag(ByteString p0);
    public final void writeDouble(int p0,double p1){
       this.writeFixed64(p0, Double.doubleToRawLongBits(p1));
    }
    public final void writeDoubleNoTag(double p0){
       this.writeFixed64NoTag(Double.doubleToRawLongBits(p0));
    }
    public final void writeEnum(int p0,int p1){
       this.writeInt32(p0, p1);
    }
    public final void writeEnumNoTag(int p0){
       this.writeInt32NoTag(p0);
    }
    public abstract void writeFixed32(int p0,int p1);
    public abstract void writeFixed32NoTag(int p0);
    public abstract void writeFixed64(int p0,long p1);
    public abstract void writeFixed64NoTag(long p0);
    public final void writeFloat(int p0,float p1){
       this.writeFixed32(p0, Float.floatToRawIntBits(p1));
    }
    public final void writeFloatNoTag(float p0){
       this.writeFixed32NoTag(Float.floatToRawIntBits(p0));
    }
    public final void writeGroup(int p0,MessageLite p1){
       this.writeTag(p0, 3);
       this.writeGroupNoTag(p1);
       this.writeTag(p0, 4);
    }
    public final void writeGroup(int p0,MessageLite p1,Schema p2){
       this.writeTag(p0, 3);
       this.writeGroupNoTag(p1, p2);
       this.writeTag(p0, 4);
    }
    public final void writeGroupNoTag(MessageLite p0){
       p0.writeTo(this);
    }
    public final void writeGroupNoTag(MessageLite p0,Schema p1){
       p1.writeTo(p0, this.wrapper);
    }
    public abstract void writeInt32(int p0,int p1);
    public abstract void writeInt32NoTag(int p0);
    public final void writeInt64(int p0,long p1){
       this.writeUInt64(p0, p1);
    }
    public final void writeInt64NoTag(long p0){
       this.writeUInt64NoTag(p0);
    }
    public abstract void writeLazy(ByteBuffer p0);
    public abstract void writeLazy(byte[] p0,int p1,int p2);
    public abstract void writeMessage(int p0,MessageLite p1);
    public abstract void writeMessage(int p0,MessageLite p1,Schema p2);
    public abstract void writeMessageNoTag(MessageLite p0);
    public abstract void writeMessageNoTag(MessageLite p0,Schema p1);
    public abstract void writeMessageSetExtension(int p0,MessageLite p1);
    public final void writeRawByte(byte p0){
       this.write(p0);
    }
    public final void writeRawByte(int p0){
       this.write((byte)p0);
    }
    public final void writeRawBytes(ByteString p0){
       p0.writeTo(this);
    }
    public abstract void writeRawBytes(ByteBuffer p0);
    public final void writeRawBytes(byte[] p0){
       this.write(p0, 0, p0.length);
    }
    public final void writeRawBytes(byte[] p0,int p1,int p2){
       this.write(p0, p1, p2);
    }
    public final void writeRawLittleEndian32(int p0){
       this.writeFixed32NoTag(p0);
    }
    public final void writeRawLittleEndian64(long p0){
       this.writeFixed64NoTag(p0);
    }
    public abstract void writeRawMessageSetExtension(int p0,ByteString p1);
    public final void writeRawVarint32(int p0){
       this.writeUInt32NoTag(p0);
    }
    public final void writeRawVarint64(long p0){
       this.writeUInt64NoTag(p0);
    }
    public final void writeSFixed32(int p0,int p1){
       this.writeFixed32(p0, p1);
    }
    public final void writeSFixed32NoTag(int p0){
       this.writeFixed32NoTag(p0);
    }
    public final void writeSFixed64(int p0,long p1){
       this.writeFixed64(p0, p1);
    }
    public final void writeSFixed64NoTag(long p0){
       this.writeFixed64NoTag(p0);
    }
    public final void writeSInt32(int p0,int p1){
       this.writeUInt32(p0, CodedOutputStream.encodeZigZag32(p1));
    }
    public final void writeSInt32NoTag(int p0){
       this.writeUInt32NoTag(CodedOutputStream.encodeZigZag32(p0));
    }
    public final void writeSInt64(int p0,long p1){
       this.writeUInt64(p0, CodedOutputStream.encodeZigZag64(p1));
    }
    public final void writeSInt64NoTag(long p0){
       this.writeUInt64NoTag(CodedOutputStream.encodeZigZag64(p0));
    }
    public abstract void writeString(int p0,String p1);
    public abstract void writeStringNoTag(String p0);
    public abstract void writeTag(int p0,int p1);
    public abstract void writeUInt32(int p0,int p1);
    public abstract void writeUInt32NoTag(int p0);
    public abstract void writeUInt64(int p0,long p1);
    public abstract void writeUInt64NoTag(long p0);
}

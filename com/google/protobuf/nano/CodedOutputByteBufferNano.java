package com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.nio.ByteOrder;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import com.google.protobuf.nano.MessageNano;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import java.lang.CharSequence;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Character;
import java.lang.ArrayIndexOutOfBoundsException;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.lang.Throwable;
import java.nio.ReadOnlyBufferException;
import java.lang.IllegalStateException;
import java.io.IOException;
import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;

public final class CodedOutputByteBufferNano	// class@0005c4
{
    public final ByteBuffer buffer;

    public void CodedOutputByteBufferNano(ByteBuffer p0){
       super();
       this.buffer = p0;
       p0.order(ByteOrder.LITTLE_ENDIAN);
    }
    public void CodedOutputByteBufferNano(byte[] p0,int p1,int p2){
       super(ByteBuffer.wrap(p0, p1, p2));
    }
    public static int computeBoolSize(int p0,boolean p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeBoolSizeNoTag(p1));
    }
    public static int computeBoolSizeNoTag(boolean p0){
       return 1;
    }
    public static int computeBytesSize(int p0,byte[] p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeBytesSizeNoTag(p1));
    }
    public static int computeBytesSizeNoTag(byte[] p0){
       return (CodedOutputByteBufferNano.computeRawVarint32Size(p0.length) + p0.length);
    }
    public static int computeDoubleSize(int p0,double p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeDoubleSizeNoTag(p1));
    }
    public static int computeDoubleSizeNoTag(double p0){
       return 8;
    }
    public static int computeEnumSize(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeEnumSizeNoTag(p1));
    }
    public static int computeEnumSizeNoTag(int p0){
       return CodedOutputByteBufferNano.computeRawVarint32Size(p0);
    }
    public static int computeFieldSize(int p0,int p1,Object p2){
       switch (p1){
           case 1:
             return CodedOutputByteBufferNano.computeDoubleSize(p0, p2.doubleValue());
           case 2:
             return CodedOutputByteBufferNano.computeFloatSize(p0, p2.floatValue());
           case 3:
             return CodedOutputByteBufferNano.computeInt64Size(p0, p2.longValue());
           case 4:
             return CodedOutputByteBufferNano.computeUInt64Size(p0, p2.longValue());
           case 5:
             return CodedOutputByteBufferNano.computeInt32Size(p0, p2.intValue());
           case 6:
             return CodedOutputByteBufferNano.computeFixed64Size(p0, p2.longValue());
           case 7:
             return CodedOutputByteBufferNano.computeFixed32Size(p0, p2.intValue());
           case 8:
             return CodedOutputByteBufferNano.computeBoolSize(p0, p2.booleanValue());
           case 9:
             return CodedOutputByteBufferNano.computeStringSize(p0, p2);
           case 10:
             return CodedOutputByteBufferNano.computeGroupSize(p0, p2);
           case 11:
             return CodedOutputByteBufferNano.computeMessageSize(p0, p2);
           case 12:
             return CodedOutputByteBufferNano.computeBytesSize(p0, p2);
           case 13:
             return CodedOutputByteBufferNano.computeUInt32Size(p0, p2.intValue());
           case 14:
             return CodedOutputByteBufferNano.computeEnumSize(p0, p2.intValue());
           case 15:
             return CodedOutputByteBufferNano.computeSFixed32Size(p0, p2.intValue());
           case 16:
             return CodedOutputByteBufferNano.computeSFixed64Size(p0, p2.longValue());
           case 17:
             return CodedOutputByteBufferNano.computeSInt32Size(p0, p2.intValue());
           case 18:
             return CodedOutputByteBufferNano.computeSInt64Size(p0, p2.longValue());
           default:
             throw new IllegalArgumentException("Unknown type: "+p1);
       }
    }
    public static int computeFixed32Size(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeFixed32SizeNoTag(p1));
    }
    public static int computeFixed32SizeNoTag(int p0){
       return 4;
    }
    public static int computeFixed64Size(int p0,long p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeFixed64SizeNoTag(p1));
    }
    public static int computeFixed64SizeNoTag(long p0){
       return 8;
    }
    public static int computeFloatSize(int p0,float p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeFloatSizeNoTag(p1));
    }
    public static int computeFloatSizeNoTag(float p0){
       return 4;
    }
    public static int computeGroupSize(int p0,MessageNano p1){
       return ((CodedOutputByteBufferNano.computeTagSize(p0) * 2) + CodedOutputByteBufferNano.computeGroupSizeNoTag(p1));
    }
    public static int computeGroupSizeNoTag(MessageNano p0){
       return p0.getSerializedSize();
    }
    public static int computeInt32Size(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeInt32SizeNoTag(p1));
    }
    public static int computeInt32SizeNoTag(int p0){
       if (p0 >= 0) {
          return CodedOutputByteBufferNano.computeRawVarint32Size(p0);
       }
       return 10;
    }
    public static int computeInt64Size(int p0,long p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeInt64SizeNoTag(p1));
    }
    public static int computeInt64SizeNoTag(long p0){
       return CodedOutputByteBufferNano.computeRawVarint64Size(p0);
    }
    public static int computeMessageSize(int p0,MessageNano p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeMessageSizeNoTag(p1));
    }
    public static int computeMessageSizeNoTag(MessageNano p0){
       int serializedSi = p0.getSerializedSize();
       return (CodedOutputByteBufferNano.computeRawVarint32Size(serializedSi) + serializedSi);
    }
    public static int computeRawVarint32Size(int p0){
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
    public static int computeRawVarint64Size(long p0){
       if (!(-128 & p0)) {
          return 1;
       }
       if (!(-16384 & p0)) {
          return 2;
       }
       if (!(-2097152 & p0)) {
          return 3;
       }
       if (!(-268435456 & p0)) {
          return 4;
       }
       if (!(0xfffffff800000000 & p0)) {
          return 5;
       }
       if (!(0xfffffc0000000000 & p0)) {
          return 6;
       }
       if (!(0xfffe000000000000 & p0)) {
          return 7;
       }
       if (!(0xff00000000000000 & p0)) {
          return 8;
       }
       if (!(p0 & Long.MIN_VALUE)) {
          return 9;
       }
       return 10;
    }
    public static int computeSFixed32Size(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeSFixed32SizeNoTag(p1));
    }
    public static int computeSFixed32SizeNoTag(int p0){
       return 4;
    }
    public static int computeSFixed64Size(int p0,long p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeSFixed64SizeNoTag(p1));
    }
    public static int computeSFixed64SizeNoTag(long p0){
       return 8;
    }
    public static int computeSInt32Size(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeSInt32SizeNoTag(p1));
    }
    public static int computeSInt32SizeNoTag(int p0){
       return CodedOutputByteBufferNano.computeRawVarint32Size(CodedOutputByteBufferNano.encodeZigZag32(p0));
    }
    public static int computeSInt64Size(int p0,long p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeSInt64SizeNoTag(p1));
    }
    public static int computeSInt64SizeNoTag(long p0){
       return CodedOutputByteBufferNano.computeRawVarint64Size(CodedOutputByteBufferNano.encodeZigZag64(p0));
    }
    public static int computeStringSize(int p0,String p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeStringSizeNoTag(p1));
    }
    public static int computeStringSizeNoTag(String p0){
       int i = CodedOutputByteBufferNano.encodedLength(p0);
       return (CodedOutputByteBufferNano.computeRawVarint32Size(i) + i);
    }
    public static int computeTagSize(int p0){
       return CodedOutputByteBufferNano.computeRawVarint32Size(WireFormatNano.makeTag(p0, 0));
    }
    public static int computeUInt32Size(int p0,int p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeUInt32SizeNoTag(p1));
    }
    public static int computeUInt32SizeNoTag(int p0){
       return CodedOutputByteBufferNano.computeRawVarint32Size(p0);
    }
    public static int computeUInt64Size(int p0,long p1){
       return (CodedOutputByteBufferNano.computeTagSize(p0) + CodedOutputByteBufferNano.computeUInt64SizeNoTag(p1));
    }
    public static int computeUInt64SizeNoTag(long p0){
       return CodedOutputByteBufferNano.computeRawVarint64Size(p0);
    }
    public static int encode(CharSequence p0,byte[] p1,int p2,int p3){
       int i3;
       int i4;
       int i = p0.length();
       p3 = p3 + p2;
       int i1 = 0;
       byte b = 128;
       while (i1 < i) {
          int i2 = i1 + p2;
          if (i2 < p3) {
             char c = p0.charAt(i1);
             if (c < b) {
                p1[i2] = (byte)c;
                i1 = i1 + 1;
             }else if(i1 == i){
                return (p2 + i);
             }else {
                p2 = p2 + i1;
                while (true) {
                   if (i1 >= i) {
                      return p2;
                   }
                   char c1 = p0.charAt(i1);
                   if (c1 < b && p2 < p3) {
                      i3 = p2 + 1;
                      p1[p2] = (byte)c1;
                   label_002e :
                      p2 = i3;
                   }else if(c1 < 2048){
                      i3 = p3 - 2;
                      if (p2 <= i3) {
                         i3 = p2 + 1;
                         i4 = c1 >> 6;
                         i4 = i4 | 0x03c0;
                         p1[p2] = (byte)i4;
                         p2 = i3 + 1;
                         i2 = c1 & 0x3f;
                         i2 = i2 | b;
                         p1[i3] = (byte)i2;
                      }
                   }
                   if (c1 < 0xd800 || 0xdfff < c1) {
                      i3 = p3 - 3;
                      if (p2 <= i3) {
                         i3 = p2 + 1;
                         i4 = c1 >> 12;
                         i4 = i4 | 0x01e0;
                         p1[p2] = (byte)i4;
                         p2 = i3 + 1;
                         i4 = c1 >> 6;
                         i4 = i4 & 0x3f;
                         i4 = i4 | b;
                         p1[i3] = (byte)i4;
                         i3 = p2 + 1;
                         i2 = c1 & 0x3f;
                         i2 = i2 | b;
                         p1[p2] = (byte)i2;
                         goto label_002e ;
                      }
                   }
                   i3 = p3 - 4;
                   if (p2 <= i3) {
                      i3 = i1 + 1;
                      if (i3 != p0.length()) {
                         char c2 = p0.charAt(i3);
                         if (Character.isSurrogatePair(c1, c2)) {
                            i1 = Character.toCodePoint(c1, c2);
                            i2 = p2 + 1;
                            i4 = i1 >> 18;
                            i4 = i4 | 0x00f0;
                            p1[p2] = (byte)i4;
                            p2 = i2 + 1;
                            i4 = i1 >> 12;
                            i4 = i4 & 0x3f;
                            i4 = i4 | b;
                            p1[i2] = (byte)i4;
                            i2 = p2 + 1;
                            i4 = i1 >> 6;
                            i4 = i4 & 0x3f;
                            i4 = i4 | b;
                            p1[p2] = (byte)i4;
                            p2 = i2 + 1;
                            i1 = i1 & 0x3f;
                            i1 = i1 | b;
                            p1[i2] = (byte)i1;
                            i1 = i3;
                         }else {
                            i1 = i3;
                            break ;
                         }
                      }
                      break ;
                   }else {
                      throw new ArrayIndexOutOfBoundsException("Failed writing "+c1+" at index "+p2);
                   }
                   i1 = i1 + 1;
                }
                throw new IllegalArgumentException("Unpaired surrogate at index "+(i1 - 1));
             }
          }else {
             goto label_001a ;
          }
       }
    }
    public static void encode(CharSequence p0,ByteBuffer p1){
       if (p1.isReadOnly()) {
          throw new ReadOnlyBufferException();
       }
       if (p1.hasArray()) {
          try{
             p1.position((CodedOutputByteBufferNano.encode(p0, p1.array(), (p1.arrayOffset() + p1.position()), p1.remaining()) - p1.arrayOffset()));
          }catch(java.lang.ArrayIndexOutOfBoundsException e3){
             BufferOverflowException uBufferOverf = new BufferOverflowException();
             uBufferOverf.initCause(e3);
             throw uBufferOverf;
          }
       }else {
          CodedOutputByteBufferNano.encodeDirect(p0, p1);
       }
       return;
    }
    public static void encodeDirect(CharSequence p0,ByteBuffer p1){
       int i2;
       int i3;
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return;
          }
          char c = p0.charAt(i1);
          if (c < 128) {
             p1.put((byte)c);
          }else if(c < 2048){
             i2 = c >> 6;
             i2 = i2 | 0x03c0;
             p1.put((byte)i2);
             i3 = c & 0x3f;
             i3 = i3 | 128;
             p1.put((byte)i3);
          }else if(c < 0xd800 || 0xdfff < c){
             i2 = c >> 12;
             i2 = i2 | 0x01e0;
             p1.put((byte)i2);
             i2 = c >> 6;
             i2 = i2 & 0x3f;
             i2 = i2 | 128;
             p1.put((byte)i2);
             i3 = c & 0x3f;
             i3 = i3 | 128;
             p1.put((byte)i3);
          }else {
             i2 = i1 + 1;
             if (i2 != p0.length()) {
                char c1 = p0.charAt(i2);
                if (Character.isSurrogatePair(c, c1)) {
                   i1 = Character.toCodePoint(c, c1);
                   i3 = i1 >> 18;
                   i3 = i3 | 0x00f0;
                   p1.put((byte)i3);
                   i3 = i1 >> 12;
                   i3 = i3 & 0x3f;
                   i3 = i3 | 128;
                   p1.put((byte)i3);
                   i3 = i1 >> 6;
                   i3 = i3 & 0x3f;
                   i3 = i3 | 128;
                   p1.put((byte)i3);
                   i1 = i1 & 0x3f;
                   i1 = i1 | 128;
                   p1.put((byte)i1);
                   i1 = i2;
                }else {
                   i1 = i2;
                   break ;
                }
             }
             break ;
          }
          i1 = i1 + 1;
       }
       throw new IllegalArgumentException("Unpaired surrogate at index "+(i1 - 1));
    }
    public static int encodeZigZag32(int p0){
       return ((p0 >> 31) ^ (p0 << 1));
    }
    public static long encodeZigZag64(long p0){
       return ((p0 >> 63) ^ (p0 << 1));
    }
    public static int encodedLength(CharSequence p0){
       int i = p0.length();
       int i1 = 0;
       while (i1 < i && p0.charAt(i1) < 128) {
          i1 = i1 + 1;
       }
       int i2 = i;
       for (; i1 < i; i1 = i1 + 1) {
          char c = p0.charAt(i1);
          if (c < 2048) {
             int i3 = c - 127;
             i3 = i3 >> 31;
             i2 = i2 + i3;
          }else {
             i2 = i2 + CodedOutputByteBufferNano.encodedLengthGeneral(p0, i1);
             break ;
          }
       }
       if (i2 >= i) {
          return i2;
       }
       throw new IllegalArgumentException("UTF-8 length does not fit in int: "+((long)i2 + 0x100000000));
    }
    public static int encodedLengthGeneral(CharSequence p0,int p1){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (p1 >= i) {
             return i1;
          }
          char c = p0.charAt(p1);
          if (c < 2048) {
             int i2 = c - 127;
             i2 = i2 >> 31;
             i1 = i1 + i2;
          }else {
             i1 = i1 + 2;
             if (0xd800 <= c && c <= 0xdfff) {
                if (Character.codePointAt(p0, p1) >= 0x10000) {
                   p1++;
                }else {
                   break ;
                }
             }
          }
          p1++;
       }
       throw new IllegalArgumentException("Unpaired surrogate at index "+p1);
    }
    public static CodedOutputByteBufferNano newInstance(byte[] p0){
       return CodedOutputByteBufferNano.newInstance(p0, 0, p0.length);
    }
    public static CodedOutputByteBufferNano newInstance(byte[] p0,int p1,int p2){
       return new CodedOutputByteBufferNano(p0, p1, p2);
    }
    public void checkNoSpaceLeft(){
       if (!this.spaceLeft()) {
          return;
       }
       throw new IllegalStateException("Did not write as much data as expected.");
    }
    public int position(){
       return this.buffer.position();
    }
    public void reset(){
       this.buffer.clear();
    }
    public int spaceLeft(){
       return this.buffer.remaining();
    }
    public void writeBool(int p0,boolean p1){
       this.writeTag(p0, 0);
       this.writeBoolNoTag(p1);
    }
    public void writeBoolNoTag(boolean p0){
       this.writeRawByte(p0);
    }
    public void writeBytes(int p0,byte[] p1){
       this.writeTag(p0, 2);
       this.writeBytesNoTag(p1);
    }
    public void writeBytesNoTag(byte[] p0){
       this.writeRawVarint32(p0.length);
       this.writeRawBytes(p0);
    }
    public void writeDouble(int p0,double p1){
       this.writeTag(p0, 1);
       this.writeDoubleNoTag(p1);
    }
    public void writeDoubleNoTag(double p0){
       this.writeRawLittleEndian64(Double.doubleToLongBits(p0));
    }
    public void writeEnum(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeEnumNoTag(p1);
    }
    public void writeEnumNoTag(int p0){
       this.writeRawVarint32(p0);
    }
    public void writeField(int p0,int p1,Object p2){
       switch (p1){
           case 1:
             this.writeDouble(p0, p2.doubleValue());
             break;
           case 2:
             this.writeFloat(p0, p2.floatValue());
             break;
           case 3:
             this.writeInt64(p0, p2.longValue());
             break;
           case 4:
             this.writeUInt64(p0, p2.longValue());
             break;
           case 5:
             this.writeInt32(p0, p2.intValue());
             break;
           case 6:
             this.writeFixed64(p0, p2.longValue());
             break;
           case 7:
             this.writeFixed32(p0, p2.intValue());
             break;
           case 8:
             this.writeBool(p0, p2.booleanValue());
             break;
           case 9:
             this.writeString(p0, p2);
             break;
           case 10:
             this.writeGroup(p0, p2);
             break;
           case 11:
             this.writeMessage(p0, p2);
             break;
           case 12:
             this.writeBytes(p0, p2);
             break;
           case 13:
             this.writeUInt32(p0, p2.intValue());
             break;
           case 14:
             this.writeEnum(p0, p2.intValue());
             break;
           case 15:
             this.writeSFixed32(p0, p2.intValue());
             break;
           case 16:
             this.writeSFixed64(p0, p2.longValue());
             break;
           case 17:
             this.writeSInt32(p0, p2.intValue());
             break;
           case 18:
             this.writeSInt64(p0, p2.longValue());
             break;
           default:
             throw new IOException("Unknown type: "+p1);
       }
       return;
    }
    public void writeFixed32(int p0,int p1){
       this.writeTag(p0, 5);
       this.writeFixed32NoTag(p1);
    }
    public void writeFixed32NoTag(int p0){
       this.writeRawLittleEndian32(p0);
    }
    public void writeFixed64(int p0,long p1){
       this.writeTag(p0, 1);
       this.writeFixed64NoTag(p1);
    }
    public void writeFixed64NoTag(long p0){
       this.writeRawLittleEndian64(p0);
    }
    public void writeFloat(int p0,float p1){
       this.writeTag(p0, 5);
       this.writeFloatNoTag(p1);
    }
    public void writeFloatNoTag(float p0){
       this.writeRawLittleEndian32(Float.floatToIntBits(p0));
    }
    public void writeGroup(int p0,MessageNano p1){
       this.writeTag(p0, 3);
       this.writeGroupNoTag(p1);
       this.writeTag(p0, 4);
    }
    public void writeGroupNoTag(MessageNano p0){
       p0.writeTo(this);
    }
    public void writeInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeInt32NoTag(p1);
    }
    public void writeInt32NoTag(int p0){
       if (p0 >= 0) {
          this.writeRawVarint32(p0);
       }else {
          this.writeRawVarint64((long)p0);
       }
       return;
    }
    public void writeInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeInt64NoTag(p1);
    }
    public void writeInt64NoTag(long p0){
       this.writeRawVarint64(p0);
    }
    public void writeMessage(int p0,MessageNano p1){
       this.writeTag(p0, 2);
       this.writeMessageNoTag(p1);
    }
    public void writeMessageNoTag(MessageNano p0){
       this.writeRawVarint32(p0.getCachedSize());
       p0.writeTo(this);
    }
    public void writeRawByte(byte p0){
       if (!this.buffer.hasRemaining()) {
          throw new CodedOutputByteBufferNano$OutOfSpaceException(this.buffer.position(), this.buffer.limit());
       }
       this.buffer.put(p0);
       return;
    }
    public void writeRawByte(int p0){
       this.writeRawByte((byte)p0);
    }
    public void writeRawBytes(byte[] p0){
       this.writeRawBytes(p0, 0, p0.length);
    }
    public void writeRawBytes(byte[] p0,int p1,int p2){
       if (this.buffer.remaining() < p2) {
          throw new CodedOutputByteBufferNano$OutOfSpaceException(this.buffer.position(), this.buffer.limit());
       }
       this.buffer.put(p0, p1, p2);
       return;
    }
    public void writeRawLittleEndian32(int p0){
       if (this.buffer.remaining() < 4) {
          throw new CodedOutputByteBufferNano$OutOfSpaceException(this.buffer.position(), this.buffer.limit());
       }
       this.buffer.putInt(p0);
       return;
    }
    public void writeRawLittleEndian64(long p0){
       if (this.buffer.remaining() < 8) {
          throw new CodedOutputByteBufferNano$OutOfSpaceException(this.buffer.position(), this.buffer.limit());
       }
       this.buffer.putLong(p0);
       return;
    }
    public void writeRawVarint32(int p0){
       int i = p0 & 0x80;
       while (i) {
          i = p0 & 0x7f;
          i = i | 0x0080;
          this.writeRawByte(i);
          p0 = p0 >> 7;
       }
       this.writeRawByte(p0);
       return;
    }
    public void writeRawVarint64(long p0){
       long l = -128 & p0;
       while (l) {
          int i = (int)p0 & 0x7f;
          i = i | 0x0080;
          this.writeRawByte(i);
          p0 = p0 >> 7;
       }
       this.writeRawByte((int)p0);
       return;
    }
    public void writeSFixed32(int p0,int p1){
       this.writeTag(p0, 5);
       this.writeSFixed32NoTag(p1);
    }
    public void writeSFixed32NoTag(int p0){
       this.writeRawLittleEndian32(p0);
    }
    public void writeSFixed64(int p0,long p1){
       this.writeTag(p0, 1);
       this.writeSFixed64NoTag(p1);
    }
    public void writeSFixed64NoTag(long p0){
       this.writeRawLittleEndian64(p0);
    }
    public void writeSInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeSInt32NoTag(p1);
    }
    public void writeSInt32NoTag(int p0){
       this.writeRawVarint32(CodedOutputByteBufferNano.encodeZigZag32(p0));
    }
    public void writeSInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeSInt64NoTag(p1);
    }
    public void writeSInt64NoTag(long p0){
       this.writeRawVarint64(CodedOutputByteBufferNano.encodeZigZag64(p0));
    }
    public void writeString(int p0,String p1){
       this.writeTag(p0, 2);
       this.writeStringNoTag(p1);
    }
    public void writeStringNoTag(String p0){
       try{
          int i = CodedOutputByteBufferNano.computeRawVarint32Size(p0.length());
          if (i == CodedOutputByteBufferNano.computeRawVarint32Size((p0.length() * 3))) {
             int i1 = this.buffer.position();
             if (this.buffer.remaining() >= i) {
                this.buffer.position((i1 + i));
                CodedOutputByteBufferNano.encode(p0, this.buffer);
                int i2 = this.buffer.position();
                this.buffer.position(i1);
                this.writeRawVarint32(((i2 - i1) - i));
                this.buffer.position(i2);
             }else {
                throw new CodedOutputByteBufferNano$OutOfSpaceException((i1 + i), this.buffer.limit());
             }
          }else {
             this.writeRawVarint32(CodedOutputByteBufferNano.encodedLength(p0));
             CodedOutputByteBufferNano.encode(p0, this.buffer);
          }
          return;
       }catch(java.nio.BufferOverflowException e5){
          CodedOutputByteBufferNano$OutOfSpaceException outOfSpaceEx = new CodedOutputByteBufferNano$OutOfSpaceException(this.buffer.position(), this.buffer.limit());
          outOfSpaceEx.initCause(e5);
          throw outOfSpaceEx;
       }
    }
    public void writeTag(int p0,int p1){
       this.writeRawVarint32(WireFormatNano.makeTag(p0, p1));
    }
    public void writeUInt32(int p0,int p1){
       this.writeTag(p0, 0);
       this.writeUInt32NoTag(p1);
    }
    public void writeUInt32NoTag(int p0){
       this.writeRawVarint32(p0);
    }
    public void writeUInt64(int p0,long p1){
       this.writeTag(p0, 0);
       this.writeUInt64NoTag(p1);
    }
    public void writeUInt64NoTag(long p0){
       this.writeRawVarint64(p0);
    }
}

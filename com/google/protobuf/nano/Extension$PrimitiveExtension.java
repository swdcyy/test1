package com.google.protobuf.nano.Extension$PrimitiveExtension;
import com.google.protobuf.nano.Extension;
import java.lang.Class;
import com.google.protobuf.nano.Extension$1;
import java.lang.Object;
import java.lang.reflect.Array;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Throwable;
import com.google.protobuf.nano.UnknownFieldData;
import java.util.List;
import java.lang.IllegalStateException;

public class Extension$PrimitiveExtension extends Extension	// class@000508
{
    public final int nonPackedTag;
    public final int packedTag;

    public void Extension$PrimitiveExtension(int p0,Class p1,int p2,boolean p3,int p4,int p5){
       super(p0, p1, p2, p3, null);
       this.nonPackedTag = p4;
       this.packedTag = p5;
    }
    public final int computePackedDataSize(Object p0){
       int i1;
       int length = Array.getLength(p0);
       int i = 0;
       switch (this.type){
           case 1:
           case 6:
           case 16:
             length = length * 8;
             break;
           case 2:
           case 7:
           case 15:
             length = length * 4;
             break;
           case 3:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(p0, i));
             }
          label_008c :
             length = i1;
             break;
           case 4:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(p0, i));
             }
             break;
           case 5:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(p0, i));
             }
             break;
           case 8:
           case 13:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(p0, i));
             }
             break;
           case 14:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(p0, i));
             }
             break;
           case 17:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(p0, i));
             }
             break;
           case 18:
             i1 = 0;
             for (; i < length; i = i + 1) {
                i1 = i1 + CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(p0, i));
             }
             break;
           default:
          label_000a :
             throw new IllegalArgumentException("Unexpected non-packable type "+this.type);
       }
       return length;
    }
    public int computeRepeatedSerializedSize(Object p0){
       Extension ttag = this.tag;
       if (ttag == this.nonPackedTag) {
          return super.computeRepeatedSerializedSize(p0);
       }
       if (ttag != this.packedTag) {
          throw new IllegalArgumentException("Unexpected repeated extension tag "+this.tag+", unequal to both non-packed variant "+this.nonPackedTag+" and packed variant "+this.packedTag);
       }
       int i = this.computePackedDataSize(p0);
       return ((i + CodedOutputByteBufferNano.computeRawVarint32Size(i)) + CodedOutputByteBufferNano.computeRawVarint32Size(this.tag));
    }
    public final int computeSingularSerializedSize(Object p0){
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(this.tag);
       switch (this.type){
           case 1:
             return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumb, p0.doubleValue());
           case 2:
             return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumb, p0.floatValue());
           case 3:
             return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumb, p0.longValue());
           case 4:
             return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumb, p0.longValue());
           case 5:
             return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumb, p0.intValue());
           case 6:
             return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumb, p0.longValue());
           case 7:
             return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumb, p0.intValue());
           case 8:
             return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumb, p0.booleanValue());
           case 9:
             return CodedOutputByteBufferNano.computeStringSize(tagFieldNumb, p0);
           case 12:
             return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumb, p0);
           case 13:
             return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumb, p0.intValue());
           case 14:
             return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumb, p0.intValue());
           case 15:
             return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumb, p0.intValue());
           case 16:
             return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumb, p0.longValue());
           case 17:
             return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumb, p0.intValue());
           case 18:
             return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumb, p0.longValue());
           default:
          label_000b :
             throw new IllegalArgumentException("Unknown type "+this.type);
       }
    }
    public Object readData(CodedInputByteBufferNano p0){
       try{
          return p0.readPrimitiveField(this.type);
       }catch(java.io.IOException e3){
          throw new IllegalArgumentException("Error reading extension field", e3);
       }
    }
    public void readDataInto(UnknownFieldData p0,List p1){
       if (p0.tag == this.nonPackedTag) {
          p1.add(this.readData(CodedInputByteBufferNano.newInstance(p0.bytes)));
       }else {
          CodedInputByteBufferNano uCodedInputB = CodedInputByteBufferNano.newInstance(p0.bytes);
          try{
             uCodedInputB.pushLimit(uCodedInputB.readRawVarint32());
             while (!uCodedInputB.isAtEnd()) {
                p1.add(this.readData(uCodedInputB));
             }
          }catch(java.io.IOException e3){
             throw new IllegalArgumentException("Error reading extension field", e3);
          }
       }
       return;
    }
    public void writeRepeatedData(Object p0,CodedOutputByteBufferNano p1){
       try{
          Extension ttag = this.tag;
          if (ttag == this.nonPackedTag) {
             super.writeRepeatedData(p0, p1);
          }else if(ttag == this.packedTag){
             int length = Array.getLength(p0);
             int i = this.computePackedDataSize(p0);
             p1.writeRawVarint32(this.tag);
             p1.writeRawVarint32(i);
             int i1 = 0;
             switch (this.type){
                 case 1:
                   break;
                 case 2:
                   for (i1 = i1 + 1; i1 < length; i1 = i1 + 1) {
                      p1.writeFloatNoTag(Array.getFloat(p0, i1));
                   }
                   break;
                 case 3:
                   for (i1 = i1 + 1; i1 < length; p1.writeInt64NoTag(Array.getLong(p0, i1))) {
                   }
                   break;
                 case 4:
                   for (i1 = i1 + 1; i1 < length; p1.writeUInt64NoTag(Array.getLong(p0, i1))) {
                   }
                   break;
                 case 5:
                   for (i1 = i1 + 1; i1 < length; p1.writeInt32NoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 6:
                   for (i1 = i1 + 1; i1 < length; p1.writeFixed64NoTag(Array.getLong(p0, i1))) {
                   }
                   break;
                 case 7:
                   for (i1 = i1 + 1; i1 < length; p1.writeFixed32NoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 8:
                   for (i1 = i1 + 1; i1 < length; p1.writeBoolNoTag(Array.getBoolean(p0, i1))) {
                   }
                   break;
                 case 13:
                   for (i1 = i1 + 1; i1 < length; p1.writeUInt32NoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 14:
                   for (i1 = i1 + 1; i1 < length; p1.writeEnumNoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 15:
                   for (i1 = i1 + 1; i1 < length; p1.writeSFixed32NoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 16:
                   for (i1 = i1 + 1; i1 < length; p1.writeSFixed64NoTag(Array.getLong(p0, i1))) {
                   }
                   break;
                 case 17:
                   for (i1 = i1 + 1; i1 < length; p1.writeSInt32NoTag(Array.getInt(p0, i1))) {
                   }
                   break;
                 case 18:
                   for (; i1 < length; p1.writeSInt64NoTag(Array.getLong(p0, i1))) {
                   }
                   break;
                 default:
                   throw new IllegalArgumentException("Unpackable type "+this.type);
             }
             if (i1 < length) {
                p1.writeDoubleNoTag(Array.getDouble(p0, i1));
                i1 = i1 + 1;
                goto label_00c5 ;
             }
          }else {
             throw new IllegalArgumentException("Unexpected repeated extension tag "+this.tag+", unequal to both non-packed variant "+this.nonPackedTag+" and packed variant "+this.packedTag);
          }
          return;
       }catch(java.io.IOException e6){
          throw new IllegalStateException(e6);
       }
    }
    public final void writeSingularData(Object p0,CodedOutputByteBufferNano p1){
       try{
          p1.writeRawVarint32(this.tag);
          switch (this.type){
              case 1:
                p1.writeDoubleNoTag(p0.doubleValue());
                break;
              case 2:
                p1.writeFloatNoTag(p0.floatValue());
                break;
              case 3:
                p1.writeInt64NoTag(p0.longValue());
                break;
              case 4:
                p1.writeUInt64NoTag(p0.longValue());
                break;
              case 5:
                p1.writeInt32NoTag(p0.intValue());
                break;
              case 6:
                p1.writeFixed64NoTag(p0.longValue());
                break;
              case 7:
                p1.writeFixed32NoTag(p0.intValue());
                break;
              case 8:
                p1.writeBoolNoTag(p0.booleanValue());
                break;
              case 9:
                p1.writeStringNoTag(p0);
                break;
              case 12:
                p1.writeBytesNoTag(p0);
                break;
              case 13:
                p1.writeUInt32NoTag(p0.intValue());
                break;
              case 14:
                p1.writeEnumNoTag(p0.intValue());
                break;
              case 15:
                p1.writeSFixed32NoTag(p0.intValue());
                break;
              case 16:
                p1.writeSFixed64NoTag(p0.longValue());
                break;
              case 17:
                p1.writeSInt32NoTag(p0.intValue());
                break;
              case 18:
                p1.writeSInt64NoTag(p0.longValue());
                break;
              default:
                throw new IllegalArgumentException("Unknown type "+this.type);
          }
          return;
       }catch(java.io.IOException e3){
          throw new IllegalStateException(e3);
       }
    }
}

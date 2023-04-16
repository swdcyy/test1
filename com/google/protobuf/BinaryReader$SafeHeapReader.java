package com.google.protobuf.BinaryReader$SafeHeapReader;
import com.google.protobuf.BinaryReader;
import java.nio.ByteBuffer;
import com.google.protobuf.BinaryReader$1;
import com.google.protobuf.WireFormat;
import java.util.List;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.Boolean;
import java.lang.Object;
import com.google.protobuf.ByteString;
import java.lang.Double;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.IntArrayList;
import java.lang.Integer;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Class;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Long;
import java.lang.Float;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Schema;
import com.google.protobuf.Reader;
import com.google.protobuf.Protobuf;
import java.util.Map;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Utf8;
import com.google.protobuf.Internal;
import java.nio.charset.Charset;
import com.google.protobuf.LazyStringList;

public final class BinaryReader$SafeHeapReader extends BinaryReader	// class@0003b9
{
    public final byte[] buffer;
    public final boolean bufferIsImmutable;
    public int endGroupTag;
    public final int initialPos;
    public int limit;
    public int pos;
    public int tag;

    public void BinaryReader$SafeHeapReader(ByteBuffer p0,boolean p1){
       super(null);
       this.bufferIsImmutable = p1;
       this.buffer = p0.array();
       int i = p0.arrayOffset() + p0.position();
       this.pos = i;
       this.initialPos = i;
       this.limit = p0.arrayOffset() + p0.limit();
    }
    public int getFieldNumber(){
       if (this.isAtEnd()) {
          return Integer.MAX_VALUE;
       }
       int i = this.readVarint32();
       this.tag = i;
       if (i == this.endGroupTag) {
          return Integer.MAX_VALUE;
       }
       return WireFormat.getTagFieldNumber(i);
    }
    public int getTag(){
       return this.tag;
    }
    public int getTotalBytesRead(){
       return (this.pos - this.initialPos);
    }
    public final boolean isAtEnd(){
       boolean b = (this.pos == this.limit)? true: false;
       return b;
    }
    public boolean readBool(){
       int i = 0;
       this.requireWireType(i);
       if (this.readVarint32()) {
          i = true;
       }
       return i;
    }
    public void readBoolList(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof BooleanArrayList) {
          BooleanArrayList uBooleanArra = p0;
          boolean tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   tagWireType = (this.readVarint32())? true: false;
                   uBooleanArra.addBoolean(tagWireType);
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                uBooleanArra.addBoolean(this.readBool());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          boolean tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   tagWireType1 = (this.readVarint32())? true: false;
                   p0.add(Boolean.valueOf(tagWireType1));
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Boolean.valueOf(this.readBool()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public final byte readByte(){
       BinaryReader$SafeHeapReader tpos = this.pos;
       if (tpos == this.limit) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       this.pos = tpos + 1;
       return this.buffer[tpos];
    }
    public ByteString readBytes(){
       this.requireWireType(2);
       int i = this.readVarint32();
       if (!i) {
          return ByteString.EMPTY;
       }
       this.requireBytes(i);
       ByteString uByteString = (this.bufferIsImmutable != null)? ByteString.wrap(this.buffer, this.pos, i): ByteString.copyFrom(this.buffer, this.pos, i);
       this.pos = this.pos + i;
       return uByteString;
    }
    public void readBytesList(List p0){
       BinaryReader$SafeHeapReader tpos;
       if (WireFormat.getTagWireType(this.tag) != 2) {
       label_0024 :
          throw InvalidProtocolBufferException.invalidWireType();
       }
       while (true) {
          p0.add(this.readBytes());
          if (this.isAtEnd()) {
             return;
          }
          tpos = this.pos;
          if (this.readVarint32() != this.tag) {
             break ;
          }
       }
       this.pos = tpos;
       return;
    }
    public double readDouble(){
       this.requireWireType(1);
       return Double.longBitsToDouble(this.readLittleEndian64());
    }
    public void readDoubleList(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       long l = 1;
       if (p0 instanceof DoubleArrayList) {
          DoubleArrayList uDoubleArray = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != l) {
             if (tagWireType == safeHeapRead) {
                tagWireType = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.pos + tagWireType;
                while (this.pos < i) {
                   uDoubleArray.addDouble(Double.longBitsToDouble(this.readLittleEndian64_NoCheck()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                uDoubleArray.addDouble(this.readDouble());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != l) {
             if (tagWireType1 == safeHeapRead) {
                tagWireType1 = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.pos + tagWireType1;
                while (this.pos < i) {
                   p0.add(Double.valueOf(Double.longBitsToDouble(this.readLittleEndian64_NoCheck())));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Double.valueOf(this.readDouble()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public int readEnum(){
       this.requireWireType(0);
       return this.readVarint32();
    }
    public void readEnumList(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   intArrayList.addInt(this.readVarint32());
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.readEnum());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Integer.valueOf(this.readVarint32()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.readEnum()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public final Object readField(WireFormat$FieldType p0,Class p1,ExtensionRegistryLite p2){
       switch (BinaryReader$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p0.ordinal()]){
           case 1:
             return Boolean.valueOf(this.readBool());
           case 2:
             return this.readBytes();
           case 3:
             return Double.valueOf(this.readDouble());
           case 4:
             return Integer.valueOf(this.readEnum());
           case 5:
             return Integer.valueOf(this.readFixed32());
           case 6:
             return Long.valueOf(this.readFixed64());
           case 7:
             return Float.valueOf(this.readFloat());
           case 8:
             return Integer.valueOf(this.readInt32());
           case 9:
             return Long.valueOf(this.readInt64());
           case 10:
             return this.readMessage(p1, p2);
           case 11:
             return Integer.valueOf(this.readSFixed32());
           case 12:
             return Long.valueOf(this.readSFixed64());
           case 13:
             return Integer.valueOf(this.readSInt32());
           case 14:
             return Long.valueOf(this.readSInt64());
           case 15:
             return this.readStringRequireUtf8();
           case 16:
             return Integer.valueOf(this.readUInt32());
           case 17:
             return Long.valueOf(this.readUInt64());
           default:
             throw new RuntimeException("unsupported field type.");
       }
    }
    public int readFixed32(){
       this.requireWireType(5);
       return this.readLittleEndian32();
    }
    public void readFixed32List(List p0){
       int tagWireType;
       BinaryReader$SafeHeapReader tpos;
       int i = 5;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.addInt(this.readFixed32());
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.addInt(this.readLittleEndian32_NoCheck());
             }
          }
       }else {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.add(Integer.valueOf(this.readFixed32()));
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.add(Integer.valueOf(this.readLittleEndian32_NoCheck()));
             }
          }
       }
       return;
    }
    public long readFixed64(){
       this.requireWireType(1);
       return this.readLittleEndian64();
    }
    public void readFixed64List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       long l = 1;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != l) {
             if (tagWireType == safeHeapRead) {
                tagWireType = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.pos + tagWireType;
                while (this.pos < i) {
                   longArrayLis.addLong(this.readLittleEndian64_NoCheck());
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.readFixed64());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != l) {
             if (tagWireType1 == safeHeapRead) {
                tagWireType1 = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.pos + tagWireType1;
                while (this.pos < i) {
                   p0.add(Long.valueOf(this.readLittleEndian64_NoCheck()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.readFixed64()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public float readFloat(){
       this.requireWireType(5);
       return Float.intBitsToFloat(this.readLittleEndian32());
    }
    public void readFloatList(List p0){
       int tagWireType;
       BinaryReader$SafeHeapReader tpos;
       int i = 5;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof FloatArrayList) {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.addFloat(this.readFloat());
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.addFloat(Float.intBitsToFloat(this.readLittleEndian32_NoCheck()));
             }
          }
       }else {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.add(Float.valueOf(this.readFloat()));
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.add(Float.valueOf(Float.intBitsToFloat(this.readLittleEndian32_NoCheck())));
             }
          }
       }
       return;
    }
    public final Object readGroup(Schema p0,ExtensionRegistryLite p1){
       BinaryReader$SafeHeapReader tendGroupTag = this.endGroupTag;
       this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
       Object obj = p0.newInstance();
       p0.mergeFrom(obj, this, p1);
       p0.makeImmutable(obj);
       if (this.tag != this.endGroupTag) {
          throw InvalidProtocolBufferException.parseFailure();
       }
       this.endGroupTag = tendGroupTag;
       return obj;
    }
    public Object readGroup(Class p0,ExtensionRegistryLite p1){
       this.requireWireType(3);
       return this.readGroup(Protobuf.getInstance().schemaFor(p0), p1);
    }
    public Object readGroupBySchemaWithCheck(Schema p0,ExtensionRegistryLite p1){
       this.requireWireType(3);
       return this.readGroup(p0, p1);
    }
    public void readGroupList(List p0,Schema p1,ExtensionRegistryLite p2){
       BinaryReader$SafeHeapReader tpos;
       if (WireFormat.getTagWireType(this.tag) != 3) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       BinaryReader$SafeHeapReader ttag = this.tag;
       while (true) {
          p0.add(this.readGroup(p1, p2));
          if (this.isAtEnd()) {
             return;
          }
          tpos = this.pos;
          if (this.readVarint32() != ttag) {
             break ;
          }
       }
       this.pos = tpos;
       return;
    }
    public void readGroupList(List p0,Class p1,ExtensionRegistryLite p2){
       this.readGroupList(p0, Protobuf.getInstance().schemaFor(p1), p2);
    }
    public int readInt32(){
       this.requireWireType(0);
       return this.readVarint32();
    }
    public void readInt32List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   intArrayList.addInt(this.readVarint32());
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.readInt32());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Integer.valueOf(this.readVarint32()));
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.readInt32()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public long readInt64(){
       this.requireWireType(0);
       return this.readVarint64();
    }
    public void readInt64List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   longArrayLis.addLong(this.readVarint64());
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.readInt64());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Long.valueOf(this.readVarint64()));
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.readInt64()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public final int readLittleEndian32(){
       this.requireBytes(4);
       return this.readLittleEndian32_NoCheck();
    }
    public final int readLittleEndian32_NoCheck(){
       BinaryReader$SafeHeapReader tpos = this.pos;
       BinaryReader$SafeHeapReader tbuffer = this.buffer;
       this.pos = tpos + 4;
       return (((tbuffer[(tpos + 3)] & 0x00ff) << 24) | (((tbuffer[tpos] & 0x00ff) | ((tbuffer[(tpos + 1)] & 0x00ff) << 8)) | ((tbuffer[(tpos + 2)] & 0x00ff) << 16)));
    }
    public final long readLittleEndian64(){
       this.requireBytes(8);
       return this.readLittleEndian64_NoCheck();
    }
    public final long readLittleEndian64_NoCheck(){
       BinaryReader$SafeHeapReader tpos = this.pos;
       BinaryReader$SafeHeapReader tbuffer = this.buffer;
       this.pos = tpos + 8;
       return ((((long)tbuffer[(tpos + 7)] & 255) << 56) | ((((((((long)tbuffer[tpos] & 255) | (((long)tbuffer[(tpos + 1)] & 255) << 8)) | (((long)tbuffer[(tpos + 2)] & 255) << 16)) | (((long)tbuffer[(tpos + 3)] & 255) << 24)) | (((long)tbuffer[(tpos + 4)] & 255) << 32)) | (((long)tbuffer[(tpos + 5)] & 255) << 40)) | (((long)tbuffer[(tpos + 6)] & 255) << 48)));
    }
    public void readMap(Map p0,MapEntryLite$Metadata p1,ExtensionRegistryLite p2){
       this.requireWireType(2);
       int i = this.readVarint32();
       this.requireBytes(i);
       BinaryReader$SafeHeapReader tlimit = this.limit;
       this.limit = this.pos + i;
       MapEntryLite$Metadata defaultKey = p1.defaultKey;
       MapEntryLite$Metadata defaultValue = p1.defaultValue;
       while (true) {
          int fieldNumber = this.getFieldNumber();
          if (fieldNumber == Integer.MAX_VALUE) {
             p0.put(defaultKey, defaultValue);
             this.limit = tlimit;
             return;
          }else if(fieldNumber != 1){
             if (fieldNumber != 2) {
                if (this.skipField()) {
                   continue ;
                }else {
                   break ;
                }
             }else {
                defaultValue = this.readField(p1.valueType, p1.defaultValue.getClass(), p2);
             }
          }else {
             defaultKey = this.readField(p1.keyType, null, null);
          }
       }
       throw new InvalidProtocolBufferException("Unable to parse map entry.");
    }
    public final Object readMessage(Schema p0,ExtensionRegistryLite p1){
       int i = this.readVarint32();
       this.requireBytes(i);
       BinaryReader$SafeHeapReader tlimit = this.limit;
       int i1 = this.pos + i;
       this.limit = i1;
       Object obj = p0.newInstance();
       p0.mergeFrom(obj, this, p1);
       p0.makeImmutable(obj);
       if (this.pos != i1) {
          throw InvalidProtocolBufferException.parseFailure();
       }
       this.limit = tlimit;
       return obj;
    }
    public Object readMessage(Class p0,ExtensionRegistryLite p1){
       this.requireWireType(2);
       return this.readMessage(Protobuf.getInstance().schemaFor(p0), p1);
    }
    public Object readMessageBySchemaWithCheck(Schema p0,ExtensionRegistryLite p1){
       this.requireWireType(2);
       return this.readMessage(p0, p1);
    }
    public void readMessageList(List p0,Schema p1,ExtensionRegistryLite p2){
       BinaryReader$SafeHeapReader tpos;
       if (WireFormat.getTagWireType(this.tag) != 2) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       BinaryReader$SafeHeapReader ttag = this.tag;
       while (true) {
          p0.add(this.readMessage(p1, p2));
          if (this.isAtEnd()) {
             return;
          }
          tpos = this.pos;
          if (this.readVarint32() != ttag) {
             break ;
          }
       }
       this.pos = tpos;
       return;
    }
    public void readMessageList(List p0,Class p1,ExtensionRegistryLite p2){
       this.readMessageList(p0, Protobuf.getInstance().schemaFor(p1), p2);
    }
    public int readSFixed32(){
       this.requireWireType(5);
       return this.readLittleEndian32();
    }
    public void readSFixed32List(List p0){
       int tagWireType;
       BinaryReader$SafeHeapReader tpos;
       int i = 5;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.addInt(this.readSFixed32());
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.addInt(this.readLittleEndian32_NoCheck());
             }
          }
       }else {
          tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != safeHeapRead) {
             if (tagWireType == i) {
                while (true) {
                   p0.add(Integer.valueOf(this.readSFixed32()));
                   if (this.isAtEnd()) {
                      return;
                   }
                   tpos = this.pos;
                   if (this.readVarint32() != this.tag) {
                      break ;
                   }
                }
                this.pos = tpos;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.readVarint32();
             this.verifyPackedFixed32Length(tagWireType);
             i = this.pos + tagWireType;
             while (this.pos < i) {
                p0.add(Integer.valueOf(this.readLittleEndian32_NoCheck()));
             }
          }
       }
       return;
    }
    public long readSFixed64(){
       this.requireWireType(1);
       return this.readLittleEndian64();
    }
    public void readSFixed64List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       long l = 1;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != l) {
             if (tagWireType == safeHeapRead) {
                tagWireType = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.pos + tagWireType;
                while (this.pos < i) {
                   longArrayLis.addLong(this.readLittleEndian64_NoCheck());
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.readSFixed64());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != l) {
             if (tagWireType1 == safeHeapRead) {
                tagWireType1 = this.readVarint32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.pos + tagWireType1;
                while (this.pos < i) {
                   p0.add(Long.valueOf(this.readLittleEndian64_NoCheck()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.readSFixed64()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public int readSInt32(){
       this.requireWireType(0);
       return CodedInputStream.decodeZigZag32(this.readVarint32());
    }
    public void readSInt32List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   intArrayList.addInt(CodedInputStream.decodeZigZag32(this.readVarint32()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.readSInt32());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Integer.valueOf(CodedInputStream.decodeZigZag32(this.readVarint32())));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.readSInt32()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public long readSInt64(){
       this.requireWireType(0);
       return CodedInputStream.decodeZigZag64(this.readVarint64());
    }
    public void readSInt64List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   longArrayLis.addLong(CodedInputStream.decodeZigZag64(this.readVarint64()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.readSInt64());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Long.valueOf(CodedInputStream.decodeZigZag64(this.readVarint64())));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.readSInt64()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public String readString(){
       return this.readStringInternal(false);
    }
    public String readStringInternal(boolean p0){
       this.requireWireType(2);
       int i = this.readVarint32();
       if (!i) {
          return "";
       }
       this.requireBytes(i);
       if (p0) {
          BinaryReader$SafeHeapReader tpos = this.pos;
          if (!Utf8.isValidUtf8(this.buffer, tpos, (tpos + i))) {
             throw InvalidProtocolBufferException.invalidUtf8();
          }
       }
       this.pos = this.pos + i;
       return new String(this.buffer, this.pos, i, Internal.UTF_8);
    }
    public void readStringList(List p0){
       this.readStringListInternal(p0, false);
    }
    public void readStringListInternal(List p0,boolean p1){
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       if (WireFormat.getTagWireType(this.tag) != 2) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       if (p0 instanceof LazyStringList && !p1) {
          LazyStringList lazyStringLi = p0;
          while (true) {
             lazyStringLi.add(this.readBytes());
             if (this.isAtEnd()) {
                return;
             }
             tpos = this.pos;
             if (this.readVarint32() != this.tag) {
                break ;
             }
          }
          this.pos = tpos;
          return;
       }else {
          while (true) {
             p0.add(this.readStringInternal(p1));
             if (this.isAtEnd()) {
                return;
             }
             tpos1 = this.pos;
             if (this.readVarint32() != this.tag) {
                break ;
             }
          }
          this.pos = tpos1;
          return;
       }
    }
    public void readStringListRequireUtf8(List p0){
       this.readStringListInternal(p0, true);
    }
    public String readStringRequireUtf8(){
       return this.readStringInternal(true);
    }
    public int readUInt32(){
       this.requireWireType(0);
       return this.readVarint32();
    }
    public void readUInt32List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   intArrayList.addInt(this.readVarint32());
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.readUInt32());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Integer.valueOf(this.readVarint32()));
                }
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.readUInt32()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public long readUInt64(){
       this.requireWireType(0);
       return this.readVarint64();
    }
    public void readUInt64List(List p0){
       int i;
       BinaryReader$SafeHeapReader tpos;
       BinaryReader$SafeHeapReader tpos1;
       BinaryReader$SafeHeapReader safeHeapRead = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   longArrayLis.addLong(this.readVarint64());
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.readUInt64());
                if (this.isAtEnd()) {
                   return;
                }
                tpos = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == safeHeapRead) {
                i = this.pos + this.readVarint32();
                while (this.pos < i) {
                   p0.add(Long.valueOf(this.readVarint64()));
                }
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.readUInt64()));
                if (this.isAtEnd()) {
                   return;
                }
                tpos1 = this.pos;
                if (this.readVarint32() != this.tag) {
                   break ;
                }
             }
             this.pos = tpos1;
             return;
          }
       }
       return;
    }
    public final int readVarint32(){
       BinaryReader$SafeHeapReader tpos = this.pos;
       BinaryReader$SafeHeapReader tlimit = this.limit;
       if (tlimit == tpos) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       BinaryReader$SafeHeapReader tbuffer = this.buffer;
       int i = tpos + 1;
       int b = tbuffer[tpos];
       if (b >= 0) {
          this.pos = i;
          return b;
       }else if((tlimit - i) < 9){
          return (int)this.readVarint64SlowPath();
       }else {
          byte i1 = i + 1;
          b = b ^ (tbuffer[i] << 7);
          if (b < 0) {
             b = b ^ 0x80;
          }else {
             i = i1 + 1;
             b = b ^ (tbuffer[i1] << 14);
             if (b >= 0) {
                b = b ^ 0x3f80;
             }else {
                i1 = i + 1;
                b = b ^ (tbuffer[i] << 21);
                if (b < 0) {
                   b = b ^ -2080896;
                }else {
                   i = i1 + 1;
                   i1 = tbuffer[i1];
                   b = (b ^ (i1 << 28)) ^ 0xfe03f80;
                   if (i1 < 0) {
                      i1 = i + 1;
                      if (tbuffer[i] < 0) {
                         i = i1 + 1;
                         if (tbuffer[i1] < 0) {
                            i1 = i + 1;
                            if (tbuffer[i] < 0) {
                               i = i1 + 1;
                               if (tbuffer[i1] < 0) {
                                  i1 = i + 1;
                                  if (tbuffer[i] < 0) {
                                     throw InvalidProtocolBufferException.malformedVarint();
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
             i1 = i;
          }
       label_0074 :
          this.pos = i1;
          return b;
       }
    }
    public long readVarint64(){
       long l;
       long l2;
       long l3;
       BinaryReader$SafeHeapReader tpos = this.pos;
       BinaryReader$SafeHeapReader tlimit = this.limit;
       if (tlimit == tpos) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       BinaryReader$SafeHeapReader tbuffer = this.buffer;
       int i = tpos + 1;
       int b = tbuffer[tpos];
       if (b >= 0) {
          this.pos = i;
          return (long)b;
       }else if((tlimit - i) < 9){
          return this.readVarint64SlowPath();
       }else {
          int i1 = i + 1;
          b = b ^ (tbuffer[i] << 7);
          if (b < 0) {
             b = b ^ 0x80;
          label_0027 :
             l = (long)b;
          }else {
             i = i1 + 1;
             b = b ^ (tbuffer[i1] << 14);
             if (b >= 0) {
                i1 = i;
                l = (long)(b ^ 0x3f80);
             }else {
                i1 = i + 1;
                b = b ^ (tbuffer[i] << 21);
                if (b < 0) {
                   b = b ^ -2080896;
                   goto label_0027 ;
                }else {
                   b = i1 + 1;
                   long l1 = (long)b ^ ((long)tbuffer[i1] << 28);
                   int i2 = 0;
                   if (l1 - i2 >= 0) {
                      l2 = 0xfe03f80;
                   }else {
                      i1 = b + 1;
                      l1 = l1 ^ ((long)tbuffer[b] << 35);
                      if (l1 - i2 < 0) {
                         l3 = 0xfffffff80fe03f80;
                      }else {
                         b = i1 + 1;
                         l1 = l1 ^ ((long)tbuffer[i1] << 42);
                         if (l1 - i2 >= 0) {
                            l2 = 0x3f80fe03f80;
                         }else {
                            i1 = b + 1;
                            l1 = l1 ^ ((long)tbuffer[b] << 49);
                            if (l1 - i2 < 0) {
                               l3 = 0xfffe03f80fe03f80;
                            }else {
                               b = i1 + 1;
                               l1 = (l1 ^ ((long)tbuffer[i1] << 56)) ^ 0xfe03f80fe03f80;
                               if (l1 - i2 < 0) {
                                  i1 = b + 1;
                                  if ((long)tbuffer[b] - i2 < 0) {
                                     throw InvalidProtocolBufferException.malformedVarint();
                                  }
                               }else {
                                  i1 = b;
                               }
                               l = l1;
                            }
                         }
                      }
                      l = l1 ^ l3;
                   }
                   l = l1 ^ l2;
                   i1 = b;
                }
             }
          }
          this.pos = i1;
          return l;
       }
    }
    public final long readVarint64SlowPath(){
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l1 >= 64) {
             throw InvalidProtocolBufferException.malformedVarint();
          }
          int b = this.readByte();
          int i = b & 0x7f;
          long l2 = (long)i << l1;
          l = l | l2;
          b = b & 0x0080;
          if (!b) {
             break ;
          }else {
             l1 = l1 + 7;
          }
       }
       return l;
    }
    public final void requireBytes(int p0){
       if (p0 >= 0 && p0 <= (this.limit - this.pos)) {
          return;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public final void requirePosition(int p0){
       if (this.pos == p0) {
          return;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public final void requireWireType(int p0){
       if (WireFormat.getTagWireType(this.tag) == p0) {
          return;
       }
       throw InvalidProtocolBufferException.invalidWireType();
    }
    public final void skipBytes(int p0){
       this.requireBytes(p0);
       this.pos = this.pos + p0;
    }
    public boolean skipField(){
       if (!this.isAtEnd()) {
          BinaryReader$SafeHeapReader ttag = this.tag;
          if (ttag != this.endGroupTag) {
             int tagWireType = WireFormat.getTagWireType(ttag);
             if (tagWireType) {
                if (tagWireType != 1) {
                   if (tagWireType != 2) {
                      if (tagWireType != 3) {
                         if (tagWireType == 5) {
                            this.skipBytes(4);
                            return true;
                         }else {
                            throw InvalidProtocolBufferException.invalidWireType();
                         }
                      }else {
                         this.skipGroup();
                         return true;
                      }
                   }else {
                      this.skipBytes(this.readVarint32());
                      return true;
                   }
                }else {
                   this.skipBytes(8);
                   return true;
                }
             }else {
                this.skipVarint();
                return true;
             }
          }
       }
       return false;
    }
    public final void skipGroup(){
       BinaryReader$SafeHeapReader tendGroupTag = this.endGroupTag;
       this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
       do {
       } while (this.getFieldNumber() == Integer.MAX_VALUE || !this.skipField());
       if (this.tag != this.endGroupTag) {
          throw InvalidProtocolBufferException.parseFailure();
       }
       this.endGroupTag = tendGroupTag;
       return;
    }
    public final void skipVarint(){
       BinaryReader$SafeHeapReader tpos = this.pos;
       if ((this.limit - tpos) >= 10) {
          BinaryReader$SafeHeapReader tbuffer = this.buffer;
          int i = 0;
          while (i < 10) {
             int i1 = tpos + 1;
             if (tbuffer[tpos] >= 0) {
                this.pos = i1;
                return;
             }
             i = i + 1;
             tpos = i1;
          }
       }
       this.skipVarintSlowPath();
       return;
    }
    public final void skipVarintSlowPath(){
       int i = 0;
       while (true) {
          if (i >= 10) {
             throw InvalidProtocolBufferException.malformedVarint();
          }
          if (this.readByte() >= 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public final void verifyPackedFixed32Length(int p0){
       this.requireBytes(p0);
       if (!(p0 & 0x03)) {
          return;
       }
       throw InvalidProtocolBufferException.parseFailure();
    }
    public final void verifyPackedFixed64Length(int p0){
       this.requireBytes(p0);
       if (!(p0 & 0x07)) {
          return;
       }
       throw InvalidProtocolBufferException.parseFailure();
    }
}

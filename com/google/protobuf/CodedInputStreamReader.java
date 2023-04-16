package com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.Reader;
import com.google.protobuf.CodedInputStream;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.List;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.Boolean;
import com.google.protobuf.ByteString;
import com.google.protobuf.DoubleArrayList;
import java.lang.Double;
import com.google.protobuf.IntArrayList;
import java.lang.Integer;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Class;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStreamReader$1;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.Long;
import java.lang.Float;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Schema;
import com.google.protobuf.Protobuf;
import java.util.Map;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.LazyStringList;

public final class CodedInputStreamReader implements Reader	// class@0003e4
{
    public int endGroupTag;
    public final CodedInputStream input;
    public int nextTag;
    public int tag;

    public void CodedInputStreamReader(CodedInputStream p0){
       super();
       this.nextTag = 0;
       p0 = Internal.checkNotNull(p0, "input");
       this.input = p0;
       p0.wrapper = this;
    }
    public static CodedInputStreamReader forCodedInput(CodedInputStream p0){
       CodedInputStream wrapper = p0.wrapper;
       if (wrapper != null) {
          return wrapper;
       }
       return new CodedInputStreamReader(p0);
    }
    public int getFieldNumber(){
       CodedInputStreamReader tnextTag = this.nextTag;
       if (tnextTag != null) {
          this.tag = tnextTag;
          this.nextTag = 0;
       }else {
          this.tag = this.input.readTag();
       }
       tnextTag = this.tag;
       if (tnextTag == null || tnextTag == this.endGroupTag) {
          return Integer.MAX_VALUE;
       }else {
          return WireFormat.getTagFieldNumber(tnextTag);
       }
    }
    public int getTag(){
       return this.tag;
    }
    public boolean readBool(){
       this.requireWireType(0);
       return this.input.readBool();
    }
    public void readBoolList(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof BooleanArrayList) {
          BooleanArrayList uBooleanArra = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   uBooleanArra.addBoolean(this.input.readBool());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                uBooleanArra.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Boolean.valueOf(this.input.readBool()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Boolean.valueOf(this.input.readBool()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public ByteString readBytes(){
       this.requireWireType(2);
       return this.input.readBytes();
    }
    public void readBytesList(List p0){
       int i;
       if (WireFormat.getTagWireType(this.tag) != 2) {
       label_0026 :
          throw InvalidProtocolBufferException.invalidWireType();
       }
       while (true) {
          p0.add(this.readBytes());
          if (this.input.isAtEnd()) {
             return;
          }
          i = this.input.readTag();
          if (i != this.tag) {
             break ;
          }
       }
       this.nextTag = i;
       return;
    }
    public double readDouble(){
       this.requireWireType(1);
       return this.input.readDouble();
    }
    public void readDoubleList(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       double d = Double.MIN_VALUE;
       if (p0 instanceof DoubleArrayList) {
          DoubleArrayList uDoubleArray = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != d) {
             if (tagWireType == uCodedInputS) {
                tagWireType = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.input.getTotalBytesRead() + tagWireType;
                do {
                   uDoubleArray.addDouble(this.input.readDouble());
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                uDoubleArray.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != d) {
             if (tagWireType1 == uCodedInputS) {
                tagWireType1 = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.input.getTotalBytesRead() + tagWireType1;
                do {
                   p0.add(Double.valueOf(this.input.readDouble()));
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Double.valueOf(this.input.readDouble()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public int readEnum(){
       this.requireWireType(0);
       return this.input.readEnum();
    }
    public void readEnumList(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   intArrayList.addInt(this.input.readEnum());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Integer.valueOf(this.input.readEnum()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.input.readEnum()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public final Object readField(WireFormat$FieldType p0,Class p1,ExtensionRegistryLite p2){
       switch (CodedInputStreamReader$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p0.ordinal()]){
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
       return this.input.readFixed32();
    }
    public void readFixed32List(List p0){
       CodedInputStreamReader uCodedInputS = 5;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != 2) {
             if (tagWireType == uCodedInputS) {
                while (true) {
                   intArrayList.addInt(this.input.readFixed32());
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType = this.input.readTag();
                   if (tagWireType != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType);
             int i = this.input.getTotalBytesRead() + tagWireType;
             do {
                intArrayList.addInt(this.input.readFixed32());
             } while (this.input.getTotalBytesRead() >= i);
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != 2) {
             if (tagWireType1 == uCodedInputS) {
                while (true) {
                   p0.add(Integer.valueOf(this.input.readFixed32()));
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType1 = this.input.readTag();
                   if (tagWireType1 != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType1;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType1 = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType1);
             int i1 = this.input.getTotalBytesRead() + tagWireType1;
             do {
                p0.add(Integer.valueOf(this.input.readFixed32()));
             } while (this.input.getTotalBytesRead() >= i1);
          }
       }
       return;
    }
    public long readFixed64(){
       this.requireWireType(1);
       return this.input.readFixed64();
    }
    public void readFixed64List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       long l = 1;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != l) {
             if (tagWireType == uCodedInputS) {
                tagWireType = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.input.getTotalBytesRead() + tagWireType;
                do {
                   longArrayLis.addLong(this.input.readFixed64());
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != l) {
             if (tagWireType1 == uCodedInputS) {
                tagWireType1 = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.input.getTotalBytesRead() + tagWireType1;
                do {
                   p0.add(Long.valueOf(this.input.readFixed64()));
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.input.readFixed64()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public float readFloat(){
       this.requireWireType(5);
       return this.input.readFloat();
    }
    public void readFloatList(List p0){
       CodedInputStreamReader uCodedInputS = 5;
       if (p0 instanceof FloatArrayList) {
          FloatArrayList uFloatArrayL = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != 2) {
             if (tagWireType == uCodedInputS) {
                while (true) {
                   uFloatArrayL.addFloat(this.input.readFloat());
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType = this.input.readTag();
                   if (tagWireType != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType);
             int i = this.input.getTotalBytesRead() + tagWireType;
             do {
                uFloatArrayL.addFloat(this.input.readFloat());
             } while (this.input.getTotalBytesRead() >= i);
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != 2) {
             if (tagWireType1 == uCodedInputS) {
                while (true) {
                   p0.add(Float.valueOf(this.input.readFloat()));
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType1 = this.input.readTag();
                   if (tagWireType1 != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType1;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType1 = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType1);
             int i1 = this.input.getTotalBytesRead() + tagWireType1;
             do {
                p0.add(Float.valueOf(this.input.readFloat()));
             } while (this.input.getTotalBytesRead() >= i1);
          }
       }
       return;
    }
    public final Object readGroup(Schema p0,ExtensionRegistryLite p1){
       CodedInputStreamReader tendGroupTag = this.endGroupTag;
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
       if (WireFormat.getTagWireType(this.tag) != 3) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       CodedInputStreamReader ttag = this.tag;
       p0.add(this.readGroup(p1, p2));
       while (!this.input.isAtEnd() && this.nextTag == null) {
          int i = this.input.readTag();
          if (i != ttag) {
             this.nextTag = i;
             break ;
          }
       }
       return;
    }
    public void readGroupList(List p0,Class p1,ExtensionRegistryLite p2){
       this.readGroupList(p0, Protobuf.getInstance().schemaFor(p1), p2);
    }
    public int readInt32(){
       this.requireWireType(0);
       return this.input.readInt32();
    }
    public void readInt32List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   intArrayList.addInt(this.input.readInt32());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Integer.valueOf(this.input.readInt32()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.input.readInt32()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public long readInt64(){
       this.requireWireType(0);
       return this.input.readInt64();
    }
    public void readInt64List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   longArrayLis.addLong(this.input.readInt64());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Long.valueOf(this.input.readInt64()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.input.readInt64()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public void readMap(Map p0,MapEntryLite$Metadata p1,ExtensionRegistryLite p2){
       this.requireWireType(2);
       int i = this.input.pushLimit(this.input.readUInt32());
       MapEntryLite$Metadata defaultKey = p1.defaultKey;
       MapEntryLite$Metadata defaultValue = p1.defaultValue;
       while (true) {
          int fieldNumber = this.getFieldNumber();
          if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
             p0.put(defaultKey, defaultValue);
             this.input.popLimit(i);
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
       int i = this.input.readUInt32();
       CodedInputStreamReader tinput = this.input;
       if (tinput.recursionDepth >= tinput.recursionLimit) {
          throw InvalidProtocolBufferException.recursionLimitExceeded();
       }
       Object obj = p0.newInstance();
       CodedInputStreamReader tinput1 = this.input;
       tinput1.recursionDepth = tinput1.recursionDepth + 1;
       p0.mergeFrom(obj, this, p1);
       p0.makeImmutable(obj);
       this.input.checkLastTagWas(0);
       CodedInputStreamReader tinput2 = this.input;
       tinput2.recursionDepth = tinput2.recursionDepth - 1;
       tinput2.popLimit(tinput.pushLimit(i));
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
       if (WireFormat.getTagWireType(this.tag) != 2) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       CodedInputStreamReader ttag = this.tag;
       p0.add(this.readMessage(p1, p2));
       while (!this.input.isAtEnd() && this.nextTag == null) {
          int i = this.input.readTag();
          if (i != ttag) {
             this.nextTag = i;
             break ;
          }
       }
       return;
    }
    public void readMessageList(List p0,Class p1,ExtensionRegistryLite p2){
       this.readMessageList(p0, Protobuf.getInstance().schemaFor(p1), p2);
    }
    public int readSFixed32(){
       this.requireWireType(5);
       return this.input.readSFixed32();
    }
    public void readSFixed32List(List p0){
       CodedInputStreamReader uCodedInputS = 5;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != 2) {
             if (tagWireType == uCodedInputS) {
                while (true) {
                   intArrayList.addInt(this.input.readSFixed32());
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType = this.input.readTag();
                   if (tagWireType != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType);
             int i = this.input.getTotalBytesRead() + tagWireType;
             do {
                intArrayList.addInt(this.input.readSFixed32());
             } while (this.input.getTotalBytesRead() >= i);
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != 2) {
             if (tagWireType1 == uCodedInputS) {
                while (true) {
                   p0.add(Integer.valueOf(this.input.readSFixed32()));
                   if (this.input.isAtEnd()) {
                      return;
                   }
                   tagWireType1 = this.input.readTag();
                   if (tagWireType1 != this.tag) {
                      break ;
                   }
                }
                this.nextTag = tagWireType1;
                return;
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             tagWireType1 = this.input.readUInt32();
             this.verifyPackedFixed32Length(tagWireType1);
             int i1 = this.input.getTotalBytesRead() + tagWireType1;
             do {
                p0.add(Integer.valueOf(this.input.readSFixed32()));
             } while (this.input.getTotalBytesRead() >= i1);
          }
       }
       return;
    }
    public long readSFixed64(){
       this.requireWireType(1);
       return this.input.readSFixed64();
    }
    public void readSFixed64List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       long l = 1;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType != l) {
             if (tagWireType == uCodedInputS) {
                tagWireType = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType);
                i = this.input.getTotalBytesRead() + tagWireType;
                do {
                   longArrayLis.addLong(this.input.readSFixed64());
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1 != l) {
             if (tagWireType1 == uCodedInputS) {
                tagWireType1 = this.input.readUInt32();
                this.verifyPackedFixed64Length(tagWireType1);
                i = this.input.getTotalBytesRead() + tagWireType1;
                do {
                   p0.add(Long.valueOf(this.input.readSFixed64()));
                } while (this.input.getTotalBytesRead() >= i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.input.readSFixed64()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public int readSInt32(){
       this.requireWireType(0);
       return this.input.readSInt32();
    }
    public void readSInt32List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   intArrayList.addInt(this.input.readSInt32());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Integer.valueOf(this.input.readSInt32()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.input.readSInt32()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public long readSInt64(){
       this.requireWireType(0);
       return this.input.readSInt64();
    }
    public void readSInt64List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   longArrayLis.addLong(this.input.readSInt64());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Long.valueOf(this.input.readSInt64()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.input.readSInt64()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public String readString(){
       this.requireWireType(2);
       return this.input.readString();
    }
    public void readStringList(List p0){
       this.readStringListInternal(p0, false);
    }
    public void readStringListInternal(List p0,boolean p1){
       int i;
       String str;
       if (WireFormat.getTagWireType(this.tag) != 2) {
          throw InvalidProtocolBufferException.invalidWireType();
       }
       if (p0 instanceof LazyStringList && !p1) {
          LazyStringList lazyStringLi = p0;
          while (true) {
             lazyStringLi.add(this.readBytes());
             if (this.input.isAtEnd()) {
                return;
             }
             i = this.input.readTag();
             if (i != this.tag) {
                break ;
             }
          }
          this.nextTag = i;
          return;
       }else if(p1){
          str = this.readStringRequireUtf8();
       }else {
          str = this.readString();
       }
       p0.add(str);
       if (this.input.isAtEnd()) {
       }else {
          int i1 = this.input.readTag();
          if (i1 != this.tag) {
             this.nextTag = i1;
             return;
          }
       }
    }
    public void readStringListRequireUtf8(List p0){
       this.readStringListInternal(p0, true);
    }
    public String readStringRequireUtf8(){
       this.requireWireType(2);
       return this.input.readStringRequireUtf8();
    }
    public int readUInt32(){
       this.requireWireType(0);
       return this.input.readUInt32();
    }
    public void readUInt32List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof IntArrayList) {
          IntArrayList intArrayList = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   intArrayList.addInt(this.input.readUInt32());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                intArrayList.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Integer.valueOf(this.input.readUInt32()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Integer.valueOf(this.input.readUInt32()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public long readUInt64(){
       this.requireWireType(0);
       return this.input.readUInt64();
    }
    public void readUInt64List(List p0){
       int i;
       CodedInputStreamReader uCodedInputS = 2;
       if (p0 instanceof LongArrayList) {
          LongArrayList longArrayLis = p0;
          int tagWireType = WireFormat.getTagWireType(this.tag);
          if (tagWireType) {
             if (tagWireType == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   longArrayLis.addLong(this.input.readUInt64());
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                longArrayLis.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType = this.input.readTag();
                if (tagWireType != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType;
             return;
          }
       }else {
          int tagWireType1 = WireFormat.getTagWireType(this.tag);
          if (tagWireType1) {
             if (tagWireType1 == uCodedInputS) {
                i = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                   p0.add(Long.valueOf(this.input.readUInt64()));
                } while (this.input.getTotalBytesRead() >= i);
                this.requirePosition(i);
             }else {
                throw InvalidProtocolBufferException.invalidWireType();
             }
          }else {
             while (true) {
                p0.add(Long.valueOf(this.input.readUInt64()));
                if (this.input.isAtEnd()) {
                   return;
                }
                tagWireType1 = this.input.readTag();
                if (tagWireType1 != this.tag) {
                   break ;
                }
             }
             this.nextTag = tagWireType1;
             return;
          }
       }
       return;
    }
    public final void requirePosition(int p0){
       if (this.input.getTotalBytesRead() == p0) {
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
    public boolean shouldDiscardUnknownFields(){
       return this.input.shouldDiscardUnknownFields();
    }
    public boolean skipField(){
       if (!this.input.isAtEnd()) {
          CodedInputStreamReader ttag = this.tag;
          if (ttag != this.endGroupTag) {
             return this.input.skipField(ttag);
          }
       }
       return false;
    }
    public final void verifyPackedFixed32Length(int p0){
       if (!(p0 & 0x03)) {
          return;
       }
       throw InvalidProtocolBufferException.parseFailure();
    }
    public final void verifyPackedFixed64Length(int p0){
       if (!(p0 & 0x07)) {
          return;
       }
       throw InvalidProtocolBufferException.parseFailure();
    }
}

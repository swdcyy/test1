package com.google.protobuf.ArrayDecoders;
import java.lang.Object;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.lang.Double;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.ArrayDecoders$1;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Integer;
import com.google.protobuf.Protobuf;
import com.google.protobuf.MessageLite;
import java.lang.Class;
import com.google.protobuf.Schema;
import com.google.protobuf.CodedInputStream;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Float;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageSchema;
import java.nio.charset.Charset;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;

public final class ArrayDecoders	// class@0003b7
{

    public void ArrayDecoders(){
       super();
    }
    public static int decodeBoolList(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint64(p1, p2, p5);
       boolean b = (p5.long1)? true: false;
       p4.addBoolean(b);
       while (p2 < p3) {
          b = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p2 = ArrayDecoders.decodeVarint64(p1, b, p5);
             b = (p5.long1)? true: false;
             p4.addBoolean(b);
          }
       }
       return p2;
    }
    public static int decodeBytes(byte[] p0,int p1,ArrayDecoders$Registers p2){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p2);
       ArrayDecoders$Registers int1 = p2.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       if (int1 > (p0.length - p1)) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       if (int1 == null) {
          p2.object1 = ByteString.EMPTY;
          return p1;
       }else {
          p2.object1 = ByteString.copyFrom(p0, p1, int1);
          return (p1 + int1);
       }
    }
    public static int decodeBytesList(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
       ArrayDecoders$Registers int1 = p5.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       int i = p1.length - p2;
       if (int1 > i) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       if (int1 == null) {
          p4.add(ByteString.EMPTY);
          while (p2 < p3) {
             int i1 = ArrayDecoders.decodeVarint32(p1, p2, p5);
             if (p0 != p5.int1) {
                break ;
             }else {
                p2 = ArrayDecoders.decodeVarint32(p1, i1, p5);
                int1 = p5.int1;
                if (int1 >= null) {
                   i = p1.length - p2;
                   if (int1 <= i) {
                      if (int1 == null) {
                         p4.add(ByteString.EMPTY);
                      }else {
                         p4.add(ByteString.copyFrom(p1, p2, int1));
                      }
                   }else {
                      throw InvalidProtocolBufferException.truncatedMessage();
                   }
                }else {
                   throw InvalidProtocolBufferException.negativeSize();
                }
             }
          }
          return p2;
       }else {
          p4.add(ByteString.copyFrom(p1, p2, int1));
       }
       p2 = p2 + int1;
    }
    public static double decodeDouble(byte[] p0,int p1){
       return Double.longBitsToDouble(ArrayDecoders.decodeFixed64(p0, p1));
    }
    public static int decodeDoubleList(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p4.addDouble(ArrayDecoders.decodeDouble(p1, p2));
       for (p2 = p2 + 8; p2 < p3; p2 = i + 8) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p4.addDouble(ArrayDecoders.decodeDouble(p1, i));
          }
       }
       return p2;
    }
    public static int decodeExtension(int p0,byte[] p1,int p2,int p3,GeneratedMessageLite$ExtendableMessage p4,GeneratedMessageLite$GeneratedExtension p5,UnknownFieldSchema p6,ArrayDecoders$Registers p7){
       int i;
       LongArrayList longArrayLis;
       IntArrayList intArrayList;
       GeneratedMessageLite$ExtendableMessage extensions = p4.extensions;
       p0 = p0 >> 3;
       GeneratedMessageLite generatedMes = null;
       if (p5.descriptor.isRepeated() && p5.descriptor.isPacked()) {
          switch (ArrayDecoders$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p5.getLiteType().ordinal()]){
              case 1:
                DoubleArrayList uDoubleArray = new DoubleArrayList();
                i = ArrayDecoders.decodePackedDoubleList(p1, p2, uDoubleArray, p7);
                extensions.setField(p5.descriptor, uDoubleArray);
                break;
              case 2:
                FloatArrayList uFloatArrayL = new FloatArrayList();
                i = ArrayDecoders.decodePackedFloatList(p1, p2, uFloatArrayL, p7);
                extensions.setField(p5.descriptor, uFloatArrayL);
                break;
              case 3:
              case 4:
                longArrayLis = new LongArrayList();
                i = ArrayDecoders.decodePackedVarint64List(p1, p2, longArrayLis, p7);
                extensions.setField(p5.descriptor, longArrayLis);
                break;
              case 5:
              case 6:
                intArrayList = new IntArrayList();
                i = ArrayDecoders.decodePackedVarint32List(p1, p2, intArrayList, p7);
                extensions.setField(p5.descriptor, intArrayList);
                break;
              case 7:
              case 8:
                longArrayLis = new LongArrayList();
                i = ArrayDecoders.decodePackedFixed64List(p1, p2, longArrayLis, p7);
                extensions.setField(p5.descriptor, longArrayLis);
                break;
              case 9:
              case 10:
                intArrayList = new IntArrayList();
                i = ArrayDecoders.decodePackedFixed32List(p1, p2, intArrayList, p7);
                extensions.setField(p5.descriptor, intArrayList);
                break;
              case 11:
                BooleanArrayList uBooleanArra = new BooleanArrayList();
                i = ArrayDecoders.decodePackedBoolList(p1, p2, uBooleanArra, p7);
                extensions.setField(p5.descriptor, uBooleanArra);
                break;
              case 12:
                intArrayList = new IntArrayList();
                i = ArrayDecoders.decodePackedSInt32List(p1, p2, intArrayList, p7);
                extensions.setField(p5.descriptor, intArrayList);
                break;
              case 13:
                longArrayLis = new LongArrayList();
                i = ArrayDecoders.decodePackedSInt64List(p1, p2, longArrayLis, p7);
                extensions.setField(p5.descriptor, longArrayLis);
                break;
              case 14:
                IntArrayList intArrayList1 = new IntArrayList();
                i = ArrayDecoders.decodePackedVarint32List(p1, p2, intArrayList1, p7);
                GeneratedMessageLite unknownField = p4.unknownFields;
                if (unknownField != UnknownFieldSetLite.getDefaultInstance()) {
                   generatedMes = unknownField;
                }
                UnknownFieldSetLite unknownField1 = SchemaUtil.filterUnknownEnumList(p0, intArrayList1, p5.descriptor.getEnumType(), generatedMes, p6);
                if (unknownField1 != null) {
                   p4.unknownFields = unknownField1;
                }
                extensions.setField(p5.descriptor, intArrayList1);
                break;
              default:
                throw new IllegalStateException("Type cannot be packed: "+p5.descriptor.getLiteType());
          }
       }else if(p5.getLiteType() == WireFormat$FieldType.ENUM){
          p2 = ArrayDecoders.decodeVarint32(p1, p2, p7);
          if (p5.descriptor.getEnumType().findValueByNumber(p7.int1) == null) {
             GeneratedMessageLite unknownField2 = p4.unknownFields;
             if (unknownField2 == UnknownFieldSetLite.getDefaultInstance()) {
                unknownField2 = UnknownFieldSetLite.newInstance();
                p4.unknownFields = unknownField2;
             }
             SchemaUtil.storeUnknownEnum(p0, p7.int1, unknownField2, p6);
             return p2;
          }else {
             generatedMes = Integer.valueOf(p7.int1);
          }
       }else {
          switch (ArrayDecoders$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p5.getLiteType().ordinal()]){
              case 1:
                generatedMes = Double.valueOf(ArrayDecoders.decodeDouble(p1, p2));
             label_01ff :
                p2 = p2 + 8;
                break;
              case 2:
                generatedMes = Float.valueOf(ArrayDecoders.decodeFloat(p1, p2));
             label_01f4 :
                p2 = p2 + 4;
                break;
              case 3:
              case 4:
                p2 = ArrayDecoders.decodeVarint64(p1, p2, p7);
                generatedMes = Long.valueOf(p7.long1);
                break;
              case 5:
              case 6:
                p2 = ArrayDecoders.decodeVarint32(p1, p2, p7);
                generatedMes = Integer.valueOf(p7.int1);
                break;
              case 7:
              case 8:
                generatedMes = Long.valueOf(ArrayDecoders.decodeFixed64(p1, p2));
                goto label_01ff ;
                break;
              case 9:
              case 10:
                generatedMes = Integer.valueOf(ArrayDecoders.decodeFixed32(p1, p2));
                goto label_01f4 ;
                break;
              case 11:
                p2 = ArrayDecoders.decodeVarint64(p1, p2, p7);
                boolean b = (p7.long1)? true: false;
                generatedMes = Boolean.valueOf(b);
                break;
              case 12:
                p2 = ArrayDecoders.decodeVarint32(p1, p2, p7);
                generatedMes = Integer.valueOf(CodedInputStream.decodeZigZag32(p7.int1));
                break;
              case 13:
                p2 = ArrayDecoders.decodeVarint64(p1, p2, p7);
                generatedMes = Long.valueOf(CodedInputStream.decodeZigZag64(p7.long1));
                break;
              case 14:
                throw new IllegalStateException("Shouldn\'t reach here.");
              case 15:
                p2 = ArrayDecoders.decodeBytes(p1, p2, p7);
                generatedMes = p7.object1;
                break;
              case 16:
                p2 = ArrayDecoders.decodeString(p1, p2, p7);
                generatedMes = p7.object1;
                break;
              case 17:
                p2 = ArrayDecoders.decodeGroupField(Protobuf.getInstance().schemaFor(p5.getMessageDefaultInstance().getClass()), p1, p2, p3, ((p0 << 3) | 0x04), p7);
                generatedMes = p7.object1;
                break;
              case 18:
                p2 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(p5.getMessageDefaultInstance().getClass()), p1, p2, p3, p7);
                generatedMes = p7.object1;
                break;
              default:
          }
       }
       if (p5.isRepeated()) {
          extensions.addRepeatedField(p5.descriptor, generatedMes);
       }else {
          p0 = ArrayDecoders$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p5.getLiteType().ordinal()];
          if (p0 == 17 || p0 == 18) {
             Object field = extensions.getField(p5.descriptor);
             if (field != null) {
                generatedMes = Internal.mergeMessage(field, generatedMes);
             }
          }
          extensions.setField(p5.descriptor, generatedMes);
       }
       i = p2;
       return i;
    }
    public static int decodeExtensionOrUnknownField(int p0,byte[] p1,int p2,int p3,Object p4,MessageLite p5,UnknownFieldSchema p6,ArrayDecoders$Registers p7){
       GeneratedMessageLite$GeneratedExtension generatedExt = p7.extensionRegistry.findLiteExtensionByNumber(p5, (p0 >> 3));
       if (generatedExt == null) {
          return ArrayDecoders.decodeUnknownField(p0, p1, p2, p3, MessageSchema.getMutableUnknownFields(p4), p7);
       }
       GeneratedMessageLite$ExtendableMessage uExtendableM = p4;
       uExtendableM.ensureExtensionsAreMutable();
       return ArrayDecoders.decodeExtension(p0, p1, p2, p3, uExtendableM, generatedExt, p6, p7);
    }
    public static int decodeFixed32(byte[] p0,int p1){
       return (((p0[(p1 + 3)] & 0x00ff) << 24) | (((p0[p1] & 0x00ff) | ((p0[(p1 + 1)] & 0x00ff) << 8)) | ((p0[(p1 + 2)] & 0x00ff) << 16)));
    }
    public static int decodeFixed32List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p4.addInt(ArrayDecoders.decodeFixed32(p1, p2));
       for (p2 = p2 + 4; p2 < p3; p2 = i + 4) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p4.addInt(ArrayDecoders.decodeFixed32(p1, i));
          }
       }
       return p2;
    }
    public static long decodeFixed64(byte[] p0,int p1){
       return ((((long)p0[(p1 + 7)] & 255) << 56) | ((((((((long)p0[p1] & 255) | (((long)p0[(p1 + 1)] & 255) << 8)) | (((long)p0[(p1 + 2)] & 255) << 16)) | (((long)p0[(p1 + 3)] & 255) << 24)) | (((long)p0[(p1 + 4)] & 255) << 32)) | (((long)p0[(p1 + 5)] & 255) << 40)) | (((long)p0[(p1 + 6)] & 255) << 48)));
    }
    public static int decodeFixed64List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p4.addLong(ArrayDecoders.decodeFixed64(p1, p2));
       for (p2 = p2 + 8; p2 < p3; p2 = i + 8) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p4.addLong(ArrayDecoders.decodeFixed64(p1, i));
          }
       }
       return p2;
    }
    public static float decodeFloat(byte[] p0,int p1){
       return Float.intBitsToFloat(ArrayDecoders.decodeFixed32(p0, p1));
    }
    public static int decodeFloatList(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p4.addFloat(ArrayDecoders.decodeFloat(p1, p2));
       for (p2 = p2 + 4; p2 < p3; p2 = i + 4) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p4.addFloat(ArrayDecoders.decodeFloat(p1, i));
          }
       }
       return p2;
    }
    public static int decodeGroupField(Schema p0,byte[] p1,int p2,int p3,int p4,ArrayDecoders$Registers p5){
       Object obj = p0.newInstance();
       p0.makeImmutable(obj);
       p5.object1 = obj;
       return p0.parseProto2Message(obj, p1, p2, p3, p4, p5);
    }
    public static int decodeGroupList(Schema p0,int p1,byte[] p2,int p3,int p4,Internal$ProtobufList p5,ArrayDecoders$Registers p6){
       int i = (p1 & 0xf8) | 0x04;
       p3 = ArrayDecoders.decodeGroupField(p0, p2, p3, p4, i, p6);
       p5.add(p6.object1);
       while (p3 < p4) {
          int i1 = ArrayDecoders.decodeVarint32(p2, p3, p6);
          if (p1 != p6.int1) {
             break ;
          }else {
             p3 = ArrayDecoders.decodeGroupField(p0, p2, i1, p4, i, p6);
             p5.add(p6.object1);
          }
       }
       return p3;
    }
    public static int decodeMessageField(Schema p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4){
       int i = p2 + 1;
       byte b = p1[p2];
       if (b < 0) {
          i = ArrayDecoders.decodeVarint32(b, p1, i, p4);
          b = p4.int1;
       }
       int i1 = i;
       if (b >= null && b <= (p3 - i1)) {
          Object obj = p0.newInstance();
          b = b + i1;
          p0.mergeFrom(obj, p1, i1, b, p4);
          p0.makeImmutable(obj);
          p4.object1 = obj;
          return b;
       }else {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
    }
    public static int decodeMessageList(Schema p0,int p1,byte[] p2,int p3,int p4,Internal$ProtobufList p5,ArrayDecoders$Registers p6){
       p3 = ArrayDecoders.decodeMessageField(p0, p2, p3, p4, p6);
       p5.add(p6.object1);
       while (p3 < p4) {
          int i = ArrayDecoders.decodeVarint32(p2, p3, p6);
          if (p1 != p6.int1) {
             break ;
          }else {
             p3 = ArrayDecoders.decodeMessageField(p0, p2, i, p4, p6);
             p5.add(p6.object1);
          }
       }
       return p3;
    }
    public static int decodePackedBoolList(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       while (p1 < i) {
          p1 = ArrayDecoders.decodeVarint64(p0, p1, p3);
          boolean b = (p3.long1)? true: false;
          p2.addBoolean(b);
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedDoubleList(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       for (; p1 < i; p1 = p1 + 8) {
          p2.addDouble(ArrayDecoders.decodeDouble(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedFixed32List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       for (; p1 < i; p1 = p1 + 4) {
          p2.addInt(ArrayDecoders.decodeFixed32(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedFixed64List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       for (; p1 < i; p1 = p1 + 8) {
          p2.addLong(ArrayDecoders.decodeFixed64(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedFloatList(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       for (; p1 < i; p1 = p1 + 4) {
          p2.addFloat(ArrayDecoders.decodeFloat(p0, p1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedSInt32List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       while (p1 < i) {
          p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
          p2.addInt(CodedInputStream.decodeZigZag32(p3.int1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedSInt64List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       while (p1 < i) {
          p1 = ArrayDecoders.decodeVarint64(p0, p1, p3);
          p2.addLong(CodedInputStream.decodeZigZag64(p3.long1));
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedVarint32List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       while (p1 < i) {
          p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
          p2.addInt(p3.int1);
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodePackedVarint64List(byte[] p0,int p1,Internal$ProtobufList p2,ArrayDecoders$Registers p3){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p3);
       int i = p3.int1 + p1;
       while (p1 < i) {
          p1 = ArrayDecoders.decodeVarint64(p0, p1, p3);
          p2.addLong(p3.long1);
       }
       if (p1 == i) {
          return p1;
       }
       throw InvalidProtocolBufferException.truncatedMessage();
    }
    public static int decodeSInt32List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
       p4.addInt(CodedInputStream.decodeZigZag32(p5.int1));
       while (p2 < p3) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p2 = ArrayDecoders.decodeVarint32(p1, i, p5);
             p4.addInt(CodedInputStream.decodeZigZag32(p5.int1));
          }
       }
       return p2;
    }
    public static int decodeSInt64List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint64(p1, p2, p5);
       p4.addLong(CodedInputStream.decodeZigZag64(p5.long1));
       while (p2 < p3) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p2 = ArrayDecoders.decodeVarint64(p1, i, p5);
             p4.addLong(CodedInputStream.decodeZigZag64(p5.long1));
          }
       }
       return p2;
    }
    public static int decodeString(byte[] p0,int p1,ArrayDecoders$Registers p2){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p2);
       ArrayDecoders$Registers int1 = p2.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       if (int1 == null) {
          p2.object1 = "";
          return p1;
       }else {
          p2.object1 = new String(p0, p1, int1, Internal.UTF_8);
          return (p1 + int1);
       }
    }
    public static int decodeStringList(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
       ArrayDecoders$Registers int1 = p5.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       if (int1 == null) {
          p4.add("");
          while (p2 < p3) {
             int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
             if (p0 != p5.int1) {
                break ;
             }else {
                p2 = ArrayDecoders.decodeVarint32(p1, i, p5);
                int1 = p5.int1;
                if (int1 >= null) {
                   if (int1 == null) {
                      p4.add("");
                   }else {
                      p4.add(new String(p1, p2, int1, Internal.UTF_8));
                   }
                }else {
                   throw InvalidProtocolBufferException.negativeSize();
                }
             }
          }
          return p2;
       }else {
          p4.add(new String(p1, p2, int1, Internal.UTF_8));
       }
       p2 = p2 + int1;
    }
    public static int decodeStringListRequireUtf8(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       int i1;
       p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
       ArrayDecoders$Registers int1 = p5.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       if (int1 == null) {
          p4.add("");
          while (p2 < p3) {
             int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
             if (p0 != p5.int1) {
                break ;
             }else {
                p2 = ArrayDecoders.decodeVarint32(p1, i, p5);
                int1 = p5.int1;
                if (int1 >= null) {
                   if (int1 == null) {
                      p4.add("");
                   }else {
                      i1 = p2 + int1;
                      if (Utf8.isValidUtf8(p1, p2, i1)) {
                         p4.add(new String(p1, p2, int1, Internal.UTF_8));
                      }else {
                         throw InvalidProtocolBufferException.invalidUtf8();
                      }
                   }
                }else {
                   throw InvalidProtocolBufferException.negativeSize();
                }
             }
          }
          return p2;
       }else {
          i1 = p2 + int1;
          if (Utf8.isValidUtf8(p1, p2, i1)) {
             p4.add(new String(p1, p2, int1, Internal.UTF_8));
          }else {
             throw InvalidProtocolBufferException.invalidUtf8();
          }
       }
       p2 = i1;
    }
    public static int decodeStringRequireUtf8(byte[] p0,int p1,ArrayDecoders$Registers p2){
       p1 = ArrayDecoders.decodeVarint32(p0, p1, p2);
       ArrayDecoders$Registers int1 = p2.int1;
       if (int1 < null) {
          throw InvalidProtocolBufferException.negativeSize();
       }
       if (int1 == null) {
          p2.object1 = "";
          return p1;
       }else {
          p2.object1 = Utf8.decodeUtf8(p0, p1, int1);
          return (p1 + int1);
       }
    }
    public static int decodeUnknownField(int p0,byte[] p1,int p2,int p3,UnknownFieldSetLite p4,ArrayDecoders$Registers p5){
       ArrayDecoders$Registers int1;
       ArrayDecoders$Registers registers;
       if (!WireFormat.getTagFieldNumber(p0)) {
          throw InvalidProtocolBufferException.invalidTag();
       }
       int tagWireType = WireFormat.getTagWireType(p0);
       if (tagWireType) {
          if (tagWireType != 1) {
             if (tagWireType != 2) {
                if (tagWireType != 3) {
                   if (tagWireType == 5) {
                      p4.storeField(p0, Integer.valueOf(ArrayDecoders.decodeFixed32(p1, p2)));
                      return (p2 + 4);
                   }else {
                      throw InvalidProtocolBufferException.invalidTag();
                   }
                }else {
                   UnknownFieldSetLite unknownField = UnknownFieldSetLite.newInstance();
                   int i = (p0 & 0xf8) | 0x04;
                   tagWireType = 0;
                   for (; p2 < p3; int1 = ArrayDecoders.decodeUnknownField(int1, p1, i1, p3, unknownField, p5)) {
                      int i1 = ArrayDecoders.decodeVarint32(p1, p2, p5);
                      int1 = p5.int1;
                      if (int1 == i) {
                         registers = int1;
                         int1 = i1;
                         break ;
                      }
                      registers = int1;
                   }
                   if (int1 <= p3 && registers == i) {
                      p4.storeField(p0, unknownField);
                      return int1;
                   }else {
                      throw InvalidProtocolBufferException.parseFailure();
                   }
                }
             }else {
                p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
                ArrayDecoders$Registers int11 = p5.int1;
                if (int11 < null) {
                   throw InvalidProtocolBufferException.negativeSize();
                }
                if (int11 > (p1.length - p2)) {
                   throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (int11 == null) {
                   p4.storeField(p0, ByteString.EMPTY);
                }else {
                   p4.storeField(p0, ByteString.copyFrom(p1, p2, int11));
                }
                return (p2 + int11);
             }
          }else {
             p4.storeField(p0, Long.valueOf(ArrayDecoders.decodeFixed64(p1, p2)));
             return (p2 + 8);
          }
       }else {
          p4.storeField(p0, Long.valueOf(p5.long1));
          return ArrayDecoders.decodeVarint64(p1, p2, p5);
       }
    }
    public static int decodeVarint32(int p0,byte[] p1,int p2,ArrayDecoders$Registers p3){
       p0 = p0 & 0x7f;
       int i = p2 + 1;
       byte b = p1[p2];
       if (b >= 0) {
          p3.int1 = p0 | (b << 7);
          return i;
       }else {
          p0 = p0 | ((b & 0x7f) << 7);
          b = i + 1;
          i = p1[i];
          if (i >= 0) {
             p3.int1 = p0 | (i << 14);
             return b;
          }else {
             p0 = p0 | ((i & 0x7f) << 14);
             i = b + 1;
             b = p1[b];
             if (b >= 0) {
                p3.int1 = p0 | (b << 21);
                return i;
             }else {
                p0 = p0 | ((b & 0x7f) << 21);
                b = i + 1;
                i = p1[i];
                if (i >= 0) {
                   p3.int1 = p0 | (i << 28);
                   return b;
                }else {
                   p0 = p0 | ((i & 0x7f) << 28);
                   i = b + 1;
                   while (p1[b] < 0) {
                      b = i;
                   }
                   p3.int1 = p0;
                   return i;
                }
             }
          }
       }
    }
    public static int decodeVarint32(byte[] p0,int p1,ArrayDecoders$Registers p2){
       int i = p1 + 1;
       byte b = p0[p1];
       if (b < 0) {
          return ArrayDecoders.decodeVarint32(b, p0, i, p2);
       }
       p2.int1 = b;
       return i;
    }
    public static int decodeVarint32List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint32(p1, p2, p5);
       p4.addInt(p5.int1);
       while (p2 < p3) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p2 = ArrayDecoders.decodeVarint32(p1, i, p5);
             p4.addInt(p5.int1);
          }
       }
       return p2;
    }
    public static int decodeVarint64(long p0,byte[] p1,int p2,ArrayDecoders$Registers p3){
       byte i = p2 + 1;
       byte b = p1[p2];
       p0 = (p0 & 127) | ((long)(b & 0x7f) << 7);
       int i1 = 7;
       for (; b < 0; b = b1) {
          b = i + 1;
          i = p1[i];
          i1 = i1 + 7;
          int i2 = i & 0x7f;
          long l = (long)i2 << i1;
          p0 = p0 | l;
          byte b1 = i;
          i = b;
       }
       p3.long1 = p0;
       return i;
    }
    public static int decodeVarint64(byte[] p0,int p1,ArrayDecoders$Registers p2){
       int i = p1 + 1;
       long l = (long)p0[p1];
       if (l < 0) {
          return ArrayDecoders.decodeVarint64(l, p0, i, p2);
       }
       p2.long1 = l;
       return i;
    }
    public static int decodeVarint64List(int p0,byte[] p1,int p2,int p3,Internal$ProtobufList p4,ArrayDecoders$Registers p5){
       p2 = ArrayDecoders.decodeVarint64(p1, p2, p5);
       p4.addLong(p5.long1);
       while (p2 < p3) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p5);
          if (p0 != p5.int1) {
             break ;
          }else {
             p2 = ArrayDecoders.decodeVarint64(p1, i, p5);
             p4.addLong(p5.long1);
          }
       }
       return p2;
    }
    public static int skipField(int p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4){
       if (!WireFormat.getTagFieldNumber(p0)) {
          throw InvalidProtocolBufferException.invalidTag();
       }
       int tagWireType = WireFormat.getTagWireType(p0);
       if (!tagWireType) {
          return ArrayDecoders.decodeVarint64(p1, p2, p4);
       }
       if (tagWireType == 1) {
          return (p2 + 8);
       }
       if (tagWireType == 2) {
          return (ArrayDecoders.decodeVarint32(p1, p2, p4) + p4.int1);
       }
       if (tagWireType != 3) {
          if (tagWireType == 5) {
             return (p2 + 4);
          }
          throw InvalidProtocolBufferException.invalidTag();
       }else {
          p0 = (p0 & 0xf8) | 0x04;
          ArrayDecoders$Registers registers = null;
          for (; p2 < p3; p2 = ArrayDecoders.skipField(registers, p1, p2, p3, p4)) {
             p2 = ArrayDecoders.decodeVarint32(p1, p2, p4);
             registers = p4.int1;
             if (registers == p0) {
                break ;
             }else {
             }
          }
          if (p2 <= p3 && registers == p0) {
             return p2;
          }
          throw InvalidProtocolBufferException.parseFailure();
       }
    }
}

package com.google.protobuf.ExtensionSchemaLite;
import com.google.protobuf.ExtensionSchema;
import java.util.Map$Entry;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.Reader;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.ExtensionSchemaLite$1;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Integer;
import java.lang.Class;
import com.google.protobuf.ByteString;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite$Builder;
import java.nio.ByteBuffer;
import com.google.protobuf.BinaryReader;
import com.google.protobuf.Protobuf;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Writer;
import com.google.protobuf.Schema;

public final class ExtensionSchemaLite extends ExtensionSchema	// class@000410
{

    public void ExtensionSchemaLite(){
       super();
    }
    public int extensionNumber(Map$Entry p0){
       return p0.getKey().getNumber();
    }
    public Object findExtensionByNumber(ExtensionRegistryLite p0,MessageLite p1,int p2){
       return p0.findLiteExtensionByNumber(p1, p2);
    }
    public FieldSet getExtensions(Object p0){
       return p0.extensions;
    }
    public FieldSet getMutableExtensions(Object p0){
       return p0.ensureExtensionsAreMutable();
    }
    public boolean hasExtensions(MessageLite p0){
       return p0 instanceof GeneratedMessageLite$ExtendableMessage;
    }
    public void makeImmutable(Object p0){
       this.getExtensions(p0).makeImmutable();
    }
    public Object parseExtension(Reader p0,Object p1,ExtensionRegistryLite p2,FieldSet p3,Object p4,UnknownFieldSchema p5){
       ArrayList uArrayList;
       int i;
       int number = p1.getNumber();
       if (p1.descriptor.isRepeated() && p1.descriptor.isPacked()) {
          switch (ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.getLiteType().ordinal()]){
              case 1:
                uArrayList = new ArrayList();
                p0.readDoubleList(uArrayList);
             label_00cb :
                p3.setField(p1.descriptor, uArrayList);
                break;
              case 2:
                uArrayList = new ArrayList();
                p0.readFloatList(uArrayList);
                goto label_00cb ;
                break;
              case 3:
                uArrayList = new ArrayList();
                p0.readInt64List(uArrayList);
                goto label_00cb ;
                break;
              case 4:
                uArrayList = new ArrayList();
                p0.readUInt64List(uArrayList);
                goto label_00cb ;
                break;
              case 5:
                uArrayList = new ArrayList();
                p0.readInt32List(uArrayList);
                goto label_00cb ;
                break;
              case 6:
                uArrayList = new ArrayList();
                p0.readFixed64List(uArrayList);
                goto label_00cb ;
                break;
              case 7:
                uArrayList = new ArrayList();
                p0.readFixed32List(uArrayList);
                goto label_00cb ;
                break;
              case 8:
                uArrayList = new ArrayList();
                p0.readBoolList(uArrayList);
                goto label_00cb ;
                break;
              case 9:
                uArrayList = new ArrayList();
                p0.readUInt32List(uArrayList);
                goto label_00cb ;
                break;
              case 10:
                uArrayList = new ArrayList();
                p0.readSFixed32List(uArrayList);
                goto label_00cb ;
                break;
              case 11:
                uArrayList = new ArrayList();
                p0.readSFixed64List(uArrayList);
                goto label_00cb ;
                break;
              case 12:
                uArrayList = new ArrayList();
                p0.readSInt32List(uArrayList);
                goto label_00cb ;
                break;
              case 13:
                uArrayList = new ArrayList();
                p0.readSInt64List(uArrayList);
                goto label_00cb ;
                break;
              case 14:
                uArrayList = new ArrayList();
                p0.readEnumList(uArrayList);
                p4 = SchemaUtil.filterUnknownEnumList(number, uArrayList, p1.descriptor.getEnumType(), p4, p5);
                goto label_00cb ;
                break;
              default:
                throw new IllegalStateException("Type cannot be packed: "+p1.descriptor.getLiteType());
          }
       }else {
          Integer integer = null;
          if (p1.getLiteType() == WireFormat$FieldType.ENUM) {
             i = p0.readInt32();
             if (p1.descriptor.getEnumType().findValueByNumber(i) == null) {
                return SchemaUtil.storeUnknownEnum(number, i, p4, p5);
             }else {
                integer = Integer.valueOf(i);
             }
          }else {
             switch (ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.getLiteType().ordinal()]){
                 case 1:
                   integer = Double.valueOf(p0.readDouble());
                   break;
                 case 2:
                   integer = Float.valueOf(p0.readFloat());
                   break;
                 case 3:
                   integer = Long.valueOf(p0.readInt64());
                   break;
                 case 4:
                   integer = Long.valueOf(p0.readUInt64());
                   break;
                 case 5:
                   integer = Integer.valueOf(p0.readInt32());
                   break;
                 case 6:
                   integer = Long.valueOf(p0.readFixed64());
                   break;
                 case 7:
                   integer = Integer.valueOf(p0.readFixed32());
                   break;
                 case 8:
                   integer = Boolean.valueOf(p0.readBool());
                   break;
                 case 9:
                   integer = Integer.valueOf(p0.readUInt32());
                   break;
                 case 10:
                   integer = Integer.valueOf(p0.readSFixed32());
                   break;
                 case 11:
                   integer = Long.valueOf(p0.readSFixed64());
                   break;
                 case 12:
                   integer = Integer.valueOf(p0.readSInt32());
                   break;
                 case 13:
                   integer = Long.valueOf(p0.readSInt64());
                   break;
                 case 14:
                   throw new IllegalStateException("Shouldn\'t reach here.");
                 case 15:
                   integer = p0.readBytes();
                   break;
                 case 16:
                   integer = p0.readString();
                   break;
                 case 17:
                   integer = p0.readGroup(p1.getMessageDefaultInstance().getClass(), p2);
                   break;
                 case 18:
                   integer = p0.readMessage(p1.getMessageDefaultInstance().getClass(), p2);
                   break;
                 default:
             }
          }
          if (p1.isRepeated()) {
             p3.addRepeatedField(p1.descriptor, integer);
          }else {
             i = ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.getLiteType().ordinal()];
             if (i == 17 || i == 18) {
                i = p3.getField(p1.descriptor);
                if (i != null) {
                   integer = Internal.mergeMessage(i, integer);
                }
             }
             p3.setField(p1.descriptor, integer);
          }
       }
       return p4;
    }
    public void parseLengthPrefixedMessageSetItem(Reader p0,Object p1,ExtensionRegistryLite p2,FieldSet p3){
       p3.setField(p1.descriptor, p0.readMessage(p1.getMessageDefaultInstance().getClass(), p2));
    }
    public void parseMessageSetItem(ByteString p0,Object p1,ExtensionRegistryLite p2,FieldSet p3){
       MessageLite messageLite = p1.getMessageDefaultInstance().newBuilderForType().buildPartial();
       BinaryReader uBinaryReade = BinaryReader.newInstance(ByteBuffer.wrap(p0.toByteArray()), true);
       Protobuf.getInstance().mergeFrom(messageLite, uBinaryReade, p2);
       p3.setField(p1.descriptor, messageLite);
       if (uBinaryReade.getFieldNumber() == Integer.MAX_VALUE) {
          return;
       }
       throw InvalidProtocolBufferException.invalidEndTag();
    }
    public void serializeExtension(Writer p0,Map$Entry p1){
       List value;
       GeneratedMessageLite$ExtensionDescriptor key = p1.getKey();
       if (key.isRepeated()) {
          switch (ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[key.getLiteType().ordinal()]){
              case 1:
                SchemaUtil.writeDoubleList(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 2:
                SchemaUtil.writeFloatList(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 3:
                SchemaUtil.writeInt64List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 4:
                SchemaUtil.writeUInt64List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 5:
                SchemaUtil.writeInt32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 6:
                SchemaUtil.writeFixed64List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 7:
                SchemaUtil.writeFixed32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 8:
                SchemaUtil.writeBoolList(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 9:
                SchemaUtil.writeUInt32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 10:
                SchemaUtil.writeSFixed32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 11:
                SchemaUtil.writeSFixed64List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 12:
                SchemaUtil.writeSInt32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 13:
                SchemaUtil.writeSInt64List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 14:
                SchemaUtil.writeInt32List(key.getNumber(), p1.getValue(), p0, key.isPacked());
                break;
              case 15:
                SchemaUtil.writeBytesList(key.getNumber(), p1.getValue(), p0);
                break;
              case 16:
                SchemaUtil.writeStringList(key.getNumber(), p1.getValue(), p0);
                break;
              case 17:
                value = p1.getValue();
                if (value != null && !value.isEmpty()) {
                   SchemaUtil.writeGroupList(key.getNumber(), p1.getValue(), p0, Protobuf.getInstance().schemaFor(value.get(0).getClass()));
                }
                break;
              case 18:
                value = p1.getValue();
                if (value != null && !value.isEmpty()) {
                   SchemaUtil.writeMessageList(key.getNumber(), p1.getValue(), p0, Protobuf.getInstance().schemaFor(value.get(0).getClass()));
                }
                break;
              default:
          }
       }else {
          switch (ExtensionSchemaLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[key.getLiteType().ordinal()]){
              case 1:
                p0.writeDouble(key.getNumber(), p1.getValue().doubleValue());
                break;
              case 2:
                p0.writeFloat(key.getNumber(), p1.getValue().floatValue());
                break;
              case 3:
                p0.writeInt64(key.getNumber(), p1.getValue().longValue());
                break;
              case 4:
                p0.writeUInt64(key.getNumber(), p1.getValue().longValue());
                break;
              case 5:
                p0.writeInt32(key.getNumber(), p1.getValue().intValue());
                break;
              case 6:
                p0.writeFixed64(key.getNumber(), p1.getValue().longValue());
                break;
              case 7:
                p0.writeFixed32(key.getNumber(), p1.getValue().intValue());
                break;
              case 8:
                p0.writeBool(key.getNumber(), p1.getValue().booleanValue());
                break;
              case 9:
                p0.writeUInt32(key.getNumber(), p1.getValue().intValue());
                break;
              case 10:
                p0.writeSFixed32(key.getNumber(), p1.getValue().intValue());
                break;
              case 11:
                p0.writeSFixed64(key.getNumber(), p1.getValue().longValue());
                break;
              case 12:
                p0.writeSInt32(key.getNumber(), p1.getValue().intValue());
                break;
              case 13:
                p0.writeSInt64(key.getNumber(), p1.getValue().longValue());
                break;
              case 14:
                p0.writeInt32(key.getNumber(), p1.getValue().intValue());
                break;
              case 15:
                p0.writeBytes(key.getNumber(), p1.getValue());
                break;
              case 16:
                p0.writeString(key.getNumber(), p1.getValue());
                break;
              case 17:
                p0.writeGroup(key.getNumber(), p1.getValue(), Protobuf.getInstance().schemaFor(p1.getValue().getClass()));
                break;
              case 18:
                p0.writeMessage(key.getNumber(), p1.getValue(), Protobuf.getInstance().schemaFor(p1.getValue().getClass()));
                break;
              default:
          }
       }
       return;
    }
    public void setExtensions(Object p0,FieldSet p1){
       p0.extensions = p1;
    }
}

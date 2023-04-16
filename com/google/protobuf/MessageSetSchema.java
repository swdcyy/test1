package com.google.protobuf.MessageSetSchema;
import com.google.protobuf.Schema;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Reader;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.WireFormat;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.Protobuf;
import java.lang.Class;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Writer;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.LazyField$LazyEntry;
import com.google.protobuf.LazyField;
import com.google.protobuf.LazyFieldLite;
import java.lang.IllegalStateException;
import java.lang.String;

public final class MessageSetSchema implements Schema	// class@000480
{
    public final MessageLite defaultInstance;
    public final ExtensionSchema extensionSchema;
    public final boolean hasExtensions;
    public final UnknownFieldSchema unknownFieldSchema;

    public void MessageSetSchema(UnknownFieldSchema p0,ExtensionSchema p1,MessageLite p2){
       super();
       this.unknownFieldSchema = p0;
       this.hasExtensions = p1.hasExtensions(p2);
       this.extensionSchema = p1;
       this.defaultInstance = p2;
    }
    public static MessageSetSchema newSchema(UnknownFieldSchema p0,ExtensionSchema p1,MessageLite p2){
       return new MessageSetSchema(p0, p1, p2);
    }
    public boolean equals(Object p0,Object p1){
       if (!this.unknownFieldSchema.getFromMessage(p0).equals(this.unknownFieldSchema.getFromMessage(p1))) {
          return false;
       }
       if (this.hasExtensions != null) {
          return this.extensionSchema.getExtensions(p0).equals(this.extensionSchema.getExtensions(p1));
       }
       return true;
    }
    public int getSerializedSize(Object p0){
       int i = this.getUnknownFieldsSerializedSize(this.unknownFieldSchema, p0) + 0;
       if (this.hasExtensions != null) {
          i = i + this.extensionSchema.getExtensions(p0).getMessageSetSerializedSize();
       }
       return i;
    }
    public final int getUnknownFieldsSerializedSize(UnknownFieldSchema p0,Object p1){
       return p0.getSerializedSizeAsMessageSet(p0.getFromMessage(p1));
    }
    public int hashCode(Object p0){
       int i = this.unknownFieldSchema.getFromMessage(p0).hashCode();
       if (this.hasExtensions != null) {
          i = (i * 53) + this.extensionSchema.getExtensions(p0).hashCode();
       }
       return i;
    }
    public final boolean isInitialized(Object p0){
       return this.extensionSchema.getExtensions(p0).isInitialized();
    }
    public void makeImmutable(Object p0){
       this.unknownFieldSchema.makeImmutable(p0);
       this.extensionSchema.makeImmutable(p0);
    }
    public void mergeFrom(Object p0,Reader p1,ExtensionRegistryLite p2){
       this.mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, p0, p1, p2);
    }
    public void mergeFrom(Object p0,Object p1){
       SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, p0, p1);
       if (this.hasExtensions != null) {
          SchemaUtil.mergeExtensions(this.extensionSchema, p0, p1);
       }
       return;
    }
    public void mergeFrom(Object p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4){
       GeneratedMessageLite generatedMes = p0;
       GeneratedMessageLite unknownField = generatedMes.unknownFields;
       if (unknownField == UnknownFieldSetLite.getDefaultInstance()) {
          unknownField = UnknownFieldSetLite.newInstance();
          generatedMes.unknownFields = unknownField;
       }
       p0 = p0.ensureExtensionsAreMutable();
       GeneratedMessageLite$GeneratedExtension generatedExt = null;
       while (p2 < p3) {
          int i = ArrayDecoders.decodeVarint32(p1, p2, p4);
          ArrayDecoders$Registers int1 = p4.int1;
          MessageSetSchema messageSetSc = 2;
          if (int1 != WireFormat.MESSAGE_SET_ITEM_TAG) {
             if (WireFormat.getTagWireType(int1) == messageSetSc) {
                Object obj = this.extensionSchema.findExtensionByNumber(p4.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(int1));
                if (obj != null) {
                   int1 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(obj.getMessageDefaultInstance().getClass()), p1, i, p3, p4);
                   p0.setField(obj.descriptor, p4.object1);
                }else {
                   int1 = ArrayDecoders.decodeUnknownField(int1, p1, i, p3, unknownField, p4);
                }
                generatedExt = obj;
             }else {
                int1 = ArrayDecoders.skipField(int1, p1, i, p3, p4);
             }
          }else {
             int1 = 0;
             ArrayDecoders$Registers registers = null;
             while (i < p3) {
                i = ArrayDecoders.decodeVarint32(p1, i, p4);
                ArrayDecoders$Registers int11 = p4.int1;
                int tagFieldNumb = WireFormat.getTagFieldNumber(int11);
                int tagWireType = WireFormat.getTagWireType(int11);
                if (tagFieldNumb != messageSetSc) {
                   if (tagFieldNumb == 3) {
                      if (generatedExt != null) {
                         i = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(generatedExt.getMessageDefaultInstance().getClass()), p1, i, p3, p4);
                         p0.setField(generatedExt.descriptor, p4.object1);
                         continue ;
                      }else if(tagWireType == messageSetSc){
                         i = ArrayDecoders.decodeBytes(p1, i, p4);
                         registers = p4.object1;
                         continue ;
                      }
                   }
                }else if(!tagWireType){
                   i = ArrayDecoders.decodeVarint32(p1, i, p4);
                   int1 = p4.int1;
                   generatedExt = this.extensionSchema.findExtensionByNumber(p4.extensionRegistry, this.defaultInstance, int1);
                   continue ;
                }
                if (int11 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                }
                i = ArrayDecoders.skipField(int11, p1, i, p3, p4);
             }
             if (registers != null) {
                unknownField.storeField(WireFormat.makeTag(int1, messageSetSc), registers);
             }
             int1 = i;
          }
       }
       if (p2 == p3) {
          return;
       }else {
          throw InvalidProtocolBufferException.parseFailure();
       }
    }
    public final void mergeFromHelper(UnknownFieldSchema p0,ExtensionSchema p1,Object p2,Reader p3,ExtensionRegistryLite p4){
       Object builderFromM = p0.getBuilderFromMessage(p2);
       FieldSet mutableExten = p1.getMutableExtensions(p2);
       while (true) {
          if (p3.getFieldNumber() == Integer.MAX_VALUE) {
             p0.setBuilderToMessage(p2, builderFromM);
             return;
          }else if(this.parseMessageSetItemOrUnknownField(p3, p4, p1, mutableExten, p0, builderFromM)){
             continue ;
          }else {
             break ;
          }
       }
       p0.setBuilderToMessage(p2, builderFromM);
       return;
    }
    public Object newInstance(){
       return this.defaultInstance.newBuilderForType().buildPartial();
    }
    public final boolean parseMessageSetItemOrUnknownField(Reader p0,ExtensionRegistryLite p1,ExtensionSchema p2,FieldSet p3,UnknownFieldSchema p4,Object p5){
       int tag = p0.getTag();
       if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
          if (WireFormat.getTagWireType(tag) == 2) {
             Object obj = p2.findExtensionByNumber(p1, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
             if (obj != null) {
                p2.parseLengthPrefixedMessageSetItem(p0, obj, p1, p3);
                return true;
             }else {
                return p4.mergeOneFieldFrom(p5, p0);
             }
          }else {
             return p0.skipField();
          }
       }else {
          tag = 0;
          Object obj1 = null;
          ByteString uByteString = obj1;
          while (p0.getFieldNumber() != Integer.MAX_VALUE) {
             int tag1 = p0.getTag();
             if (tag1 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                tag = p0.readUInt32();
                obj1 = p2.findExtensionByNumber(p1, this.defaultInstance, tag);
             }else if(tag1 == WireFormat.MESSAGE_SET_MESSAGE_TAG){
                if (obj1 != null) {
                   p2.parseLengthPrefixedMessageSetItem(p0, obj1, p1, p3);
                }else {
                   uByteString = p0.readBytes();
                }
             }else if(!p0.skipField()){
                break ;
             }
          }
          if (p0.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
             throw InvalidProtocolBufferException.invalidEndTag();
          }
          if (uByteString != null) {
             if (obj1 != null) {
                p2.parseMessageSetItem(uByteString, obj1, p1, p3);
             }else {
                p4.addLengthDelimited(p5, tag, uByteString);
             }
          }
          return true;
       }
    }
    public void writeTo(Object p0,Writer p1){
       Iterator iterator = this.extensionSchema.getExtensions(p0).iterator();
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             FieldSet$FieldDescriptorLite key = uEntry.getKey();
             if (key.getLiteJavaType() == WireFormat$JavaType.MESSAGE && (!key.isRepeated() && !key.isPacked())) {
                if (uEntry instanceof LazyField$LazyEntry) {
                   p1.writeMessageSetItem(key.getNumber(), uEntry.getField().toByteString());
                }else {
                   p1.writeMessageSetItem(key.getNumber(), uEntry.getValue());
                }
             }else {
                break ;
             }
          }else {
             this.writeUnknownFieldsHelper(this.unknownFieldSchema, p0, p1);
             return;
          }
       }
       throw new IllegalStateException("Found invalid MessageSet item.");
    }
    public final void writeUnknownFieldsHelper(UnknownFieldSchema p0,Object p1,Writer p2){
       p0.writeAsMessageSetTo(p0.getFromMessage(p1), p2);
    }
}

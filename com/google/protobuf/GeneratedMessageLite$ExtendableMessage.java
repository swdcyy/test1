package com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionLite;
import java.lang.Object;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter;
import com.google.protobuf.GeneratedMessageLite$1;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.WireFormat$JavaType;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class GeneratedMessageLite$ExtendableMessage extends GeneratedMessageLite implements GeneratedMessageLite$ExtendableMessageOrBuilder	// class@000436
{
    public FieldSet extensions;

    public void GeneratedMessageLite$ExtendableMessage(){
       super();
       this.extensions = FieldSet.emptySet();
    }
    public final void eagerlyMergeMessageSetExtension(CodedInputStream p0,GeneratedMessageLite$GeneratedExtension p1,ExtensionRegistryLite p2,int p3){
       this.parseExtension(p0, p2, p1, WireFormat.makeTag(p3, 2), p3);
    }
    public FieldSet ensureExtensionsAreMutable(){
       if (this.extensions.isImmutable()) {
          this.extensions = this.extensions.clone();
       }
       return this.extensions;
    }
    public boolean extensionsAreInitialized(){
       return this.extensions.isInitialized();
    }
    public int extensionsSerializedSize(){
       return this.extensions.getSerializedSize();
    }
    public int extensionsSerializedSizeAsMessageSet(){
       return this.extensions.getMessageSetSerializedSize();
    }
    public MessageLite getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Object getExtension(ExtensionLite p0){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       Object field = this.extensions.getField(generatedExt.descriptor);
       if (field == null) {
          return generatedExt.defaultValue;
       }
       return generatedExt.fromFieldSetType(field);
    }
    public final Object getExtension(ExtensionLite p0,int p1){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       return generatedExt.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExt.descriptor, p1));
    }
    public final int getExtensionCount(ExtensionLite p0){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       return this.extensions.getRepeatedFieldCount(generatedExt.descriptor);
    }
    public final boolean hasExtension(ExtensionLite p0){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       return this.extensions.hasField(generatedExt.descriptor);
    }
    public final void mergeExtensionFields(GeneratedMessageLite$ExtendableMessage p0){
       if (this.extensions.isImmutable()) {
          this.extensions = this.extensions.clone();
       }
       this.extensions.mergeFrom(p0.extensions);
       return;
    }
    public final void mergeMessageSetExtensionFromBytes(ByteString p0,ExtensionRegistryLite p1,GeneratedMessageLite$GeneratedExtension p2){
       MessageLite field = this.extensions.getField(p2.descriptor);
       MessageLite$Builder uBuilder = (field != null)? field.toBuilder(): null;
       if (uBuilder == null) {
          uBuilder = p2.getMessageDefaultInstance().newBuilderForType();
       }
       uBuilder.mergeFrom(p0, p1);
       this.ensureExtensionsAreMutable().setField(p2.descriptor, p2.singularToFieldSetType(uBuilder.build()));
       return;
    }
    public final void mergeMessageSetExtensionFromCodedStream(MessageLite p0,CodedInputStream p1,ExtensionRegistryLite p2){
       int i = 0;
       ByteString uByteString = null;
       GeneratedMessageLite$GeneratedExtension generatedExt = uByteString;
       int i1 = p1.readTag();
       while (i1) {
          if (i1 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
             i = p1.readUInt32();
             if (i) {
                generatedExt = p2.findLiteExtensionByNumber(p0, i);
             }
          }else if(i1 == WireFormat.MESSAGE_SET_MESSAGE_TAG){
             if (i && generatedExt != null) {
                this.eagerlyMergeMessageSetExtension(p1, generatedExt, p2, i);
                uByteString = null;
             }else {
                uByteString = p1.readBytes();
             }
          }else if(!p1.skipField(i1)){
             break ;
          }
       }
       p1.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
       if (uByteString != null && i) {
          if (generatedExt != null) {
             this.mergeMessageSetExtensionFromBytes(uByteString, p2, generatedExt);
          }else {
             this.mergeLengthDelimitedField(i, uByteString);
          }
       }
       return;
    }
    public MessageLite$Builder newBuilderForType(){
       return super.newBuilderForType();
    }
    public GeneratedMessageLite$ExtendableMessage$ExtensionWriter newExtensionWriter(){
       return new GeneratedMessageLite$ExtendableMessage$ExtensionWriter(this, false, null);
    }
    public GeneratedMessageLite$ExtendableMessage$ExtensionWriter newMessageSetExtensionWriter(){
       return new GeneratedMessageLite$ExtendableMessage$ExtensionWriter(this, true, null);
    }
    public final boolean parseExtension(CodedInputStream p0,ExtensionRegistryLite p1,GeneratedMessageLite$GeneratedExtension p2,int p3,int p4){
       GeneratedMessageLite$GeneratedExtension generatedExt;
       Internal$EnumLite uEnumLite1;
       int tagWireType = WireFormat.getTagWireType(p3);
       if (p2 != null) {
          if (tagWireType == FieldSet.getWireFormatForFieldType(p2.descriptor.getLiteType(), false)) {
             generatedExt = null;
          label_0009 :
             int i = 0;
          label_0035 :
             if (generatedExt) {
                return this.parseUnknownField(p3, p0);
             }else {
                this.ensureExtensionsAreMutable();
                if (i) {
                   int i1 = p0.pushLimit(p0.readRawVarint32());
                   if (p2.descriptor.getLiteType() == WireFormat$FieldType.ENUM) {
                      while (true) {
                         if (p0.getBytesUntilLimit() > 0) {
                            Internal$EnumLite uEnumLite = p2.descriptor.getEnumType().findValueByNumber(p0.readEnum());
                            if (uEnumLite == null) {
                               return true;
                            }else {
                               this.extensions.addRepeatedField(p2.descriptor, p2.singularToFieldSetType(uEnumLite));
                            }
                         }
                      }
                   }else {
                      while (p0.getBytesUntilLimit() > 0) {
                         this.extensions.addRepeatedField(p2.descriptor, FieldSet.readPrimitiveField(p0, p2.descriptor.getLiteType(), false));
                      }
                   }
                   p0.popLimit(i1);
                }else {
                   p3 = GeneratedMessageLite$1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[p2.descriptor.getLiteJavaType().ordinal()];
                   if (p3 != 1) {
                      if (p3 != 2) {
                         uEnumLite1 = FieldSet.readPrimitiveField(p0, p2.descriptor.getLiteType(), false);
                      }else {
                         int i2 = p0.readEnum();
                         Internal$EnumLite uEnumLite2 = p2.descriptor.getEnumType().findValueByNumber(i2);
                         if (uEnumLite2 == null) {
                            this.mergeVarintField(p4, i2);
                            return true;
                         }else {
                            uEnumLite1 = uEnumLite2;
                         }
                      }
                   }else {
                      MessageLite$Builder uBuilder = null;
                      if (!p2.descriptor.isRepeated()) {
                         MessageLite field = this.extensions.getField(p2.descriptor);
                         if (field != null) {
                            uBuilder = field.toBuilder();
                         }
                      }
                      if (uBuilder == null) {
                         uBuilder = p2.getMessageDefaultInstance().newBuilderForType();
                      }
                      if (p2.descriptor.getLiteType() == WireFormat$FieldType.GROUP) {
                         p0.readGroup(p2.getNumber(), uBuilder, p1);
                      }else {
                         p0.readMessage(uBuilder, p1);
                      }
                      uEnumLite1 = uBuilder.build();
                   }
                   if (p2.descriptor.isRepeated()) {
                      this.extensions.addRepeatedField(p2.descriptor, p2.singularToFieldSetType(uEnumLite1));
                   }else {
                      this.extensions.setField(p2.descriptor, p2.singularToFieldSetType(uEnumLite1));
                   }
                }
                return true;
             }
          }else {
             GeneratedMessageLite$GeneratedExtension descriptor = p2.descriptor;
             if (descriptor.isRepeated != null && (descriptor.type.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(p2.descriptor.getLiteType(), true))) {
                generatedExt = null;
                descriptor = 1;
                goto label_0035 ;
             }
          }
       }
       generatedExt = 1;
       goto label_0009 ;
    }
    public boolean parseUnknownField(MessageLite p0,CodedInputStream p1,ExtensionRegistryLite p2,int p3){
       int tagFieldNumb = WireFormat.getTagFieldNumber(p3);
       return this.parseExtension(p1, p2, p2.findLiteExtensionByNumber(p0, tagFieldNumb), p3, tagFieldNumb);
    }
    public boolean parseUnknownFieldAsMessageSet(MessageLite p0,CodedInputStream p1,ExtensionRegistryLite p2,int p3){
       if (p3 == WireFormat.MESSAGE_SET_ITEM_TAG) {
          this.mergeMessageSetExtensionFromCodedStream(p0, p1, p2);
          return true;
       }else if(WireFormat.getTagWireType(p3) == 2){
          return this.parseUnknownField(p0, p1, p2, p3);
       }else {
          return p1.skipField(p3);
       }
    }
    public MessageLite$Builder toBuilder(){
       return super.toBuilder();
    }
    public final void verifyExtensionContainingType(GeneratedMessageLite$GeneratedExtension p0){
       if (p0.getContainingTypeDefaultInstance() == this.getDefaultInstanceForType()) {
          return;
       }
       throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}

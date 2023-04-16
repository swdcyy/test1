package com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ExtensionLite;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.MessageLite;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class GeneratedMessageLite$ExtendableBuilder extends GeneratedMessageLite$Builder implements GeneratedMessageLite$ExtendableMessageOrBuilder	// class@000434
{

    public void GeneratedMessageLite$ExtendableBuilder(GeneratedMessageLite$ExtendableMessage p0){
       super(p0);
    }
    public final GeneratedMessageLite$ExtendableBuilder addExtension(ExtensionLite p0,Object p1){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       this.copyOnWrite();
       this.ensureExtensionsAreMutable().addRepeatedField(generatedExt.descriptor, generatedExt.singularToFieldSetType(p1));
       return this;
    }
    public final GeneratedMessageLite$ExtendableMessage buildPartial(){
       if (this.isBuilt != null) {
          return this.instance;
       }
       this.instance.extensions.makeImmutable();
       return super.buildPartial();
    }
    public GeneratedMessageLite buildPartial(){
       return this.buildPartial();
    }
    public MessageLite buildPartial(){
       return this.buildPartial();
    }
    public final GeneratedMessageLite$ExtendableBuilder clearExtension(ExtensionLite p0){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       this.copyOnWrite();
       this.ensureExtensionsAreMutable().clearField(generatedExt.descriptor);
       return this;
    }
    public void copyOnWriteInternal(){
       super.copyOnWriteInternal();
       GeneratedMessageLite$Builder tinstance = this.instance;
       tinstance.extensions = tinstance.extensions.clone();
    }
    public final FieldSet ensureExtensionsAreMutable(){
       GeneratedMessageLite$ExtendableMessage extensions = this.instance.extensions;
       if (extensions.isImmutable()) {
          extensions = extensions.clone();
          this.instance.extensions = extensions;
       }
       return extensions;
    }
    public final Object getExtension(ExtensionLite p0){
       return this.instance.getExtension(p0);
    }
    public final Object getExtension(ExtensionLite p0,int p1){
       return this.instance.getExtension(p0, p1);
    }
    public final int getExtensionCount(ExtensionLite p0){
       return this.instance.getExtensionCount(p0);
    }
    public final boolean hasExtension(ExtensionLite p0){
       return this.instance.hasExtension(p0);
    }
    public void internalSetExtensionSet(FieldSet p0){
       this.copyOnWrite();
       this.instance.extensions = p0;
    }
    public final GeneratedMessageLite$ExtendableBuilder setExtension(ExtensionLite p0,int p1,Object p2){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       this.copyOnWrite();
       this.ensureExtensionsAreMutable().setRepeatedField(generatedExt.descriptor, p1, generatedExt.singularToFieldSetType(p2));
       return this;
    }
    public final GeneratedMessageLite$ExtendableBuilder setExtension(ExtensionLite p0,Object p1){
       GeneratedMessageLite$GeneratedExtension generatedExt = GeneratedMessageLite.checkIsLite(p0);
       this.verifyExtensionContainingType(generatedExt);
       this.copyOnWrite();
       this.ensureExtensionsAreMutable().setField(generatedExt.descriptor, generatedExt.toFieldSetType(p1));
       return this;
    }
    public final void verifyExtensionContainingType(GeneratedMessageLite$GeneratedExtension p0){
       if (p0.getContainingTypeDefaultInstance() == this.getDefaultInstanceForType()) {
          return;
       }
       throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}

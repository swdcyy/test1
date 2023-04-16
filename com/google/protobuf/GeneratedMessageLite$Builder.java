package com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.AbstractMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.Reader;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.io.IOException;
import com.google.protobuf.ArrayDecoders$Registers;
import java.lang.String;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class GeneratedMessageLite$Builder extends AbstractMessageLite$Builder	// class@000432
{
    public final GeneratedMessageLite defaultInstance;
    public GeneratedMessageLite instance;
    public boolean isBuilt;

    public void GeneratedMessageLite$Builder(GeneratedMessageLite p0){
       super();
       this.defaultInstance = p0;
       this.instance = p0.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
       this.isBuilt = false;
    }
    public final GeneratedMessageLite build(){
       GeneratedMessageLite generatedMes = this.buildPartial();
       if (generatedMes.isInitialized()) {
          return generatedMes;
       }
       throw AbstractMessageLite$Builder.newUninitializedMessageException(generatedMes);
    }
    public MessageLite build(){
       return this.build();
    }
    public GeneratedMessageLite buildPartial(){
       if (this.isBuilt != null) {
          return this.instance;
       }
       this.instance.makeImmutable();
       this.isBuilt = true;
       return this.instance;
    }
    public MessageLite buildPartial(){
       return this.buildPartial();
    }
    public final GeneratedMessageLite$Builder clear(){
       this.instance = this.instance.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
       return this;
    }
    public MessageLite$Builder clear(){
       return this.clear();
    }
    public AbstractMessageLite$Builder clone(){
       return this.clone();
    }
    public GeneratedMessageLite$Builder clone(){
       GeneratedMessageLite$Builder uBuilder = this.getDefaultInstanceForType().newBuilderForType();
       uBuilder.mergeFrom(this.buildPartial());
       return uBuilder;
    }
    public MessageLite$Builder clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public final void copyOnWrite(){
       if (this.isBuilt != null) {
          this.copyOnWriteInternal();
          this.isBuilt = false;
       }
       return;
    }
    public void copyOnWriteInternal(){
       GeneratedMessageLite generatedMes = this.instance.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
       this.mergeFromInstance(generatedMes, this.instance);
       this.instance = generatedMes;
    }
    public GeneratedMessageLite getDefaultInstanceForType(){
       return this.defaultInstance;
    }
    public MessageLite getDefaultInstanceForType(){
       return this.getDefaultInstanceForType();
    }
    public AbstractMessageLite$Builder internalMergeFrom(AbstractMessageLite p0){
       return this.internalMergeFrom(p0);
    }
    public GeneratedMessageLite$Builder internalMergeFrom(GeneratedMessageLite p0){
       return this.mergeFrom(p0);
    }
    public final boolean isInitialized(){
       return GeneratedMessageLite.isInitialized(this.instance, false);
    }
    public AbstractMessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2){
       return this.mergeFrom(p0, p1, p2);
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.mergeFrom(p0, p1, p2, p3);
    }
    public GeneratedMessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       try{
          this.copyOnWrite();
          Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, CodedInputStreamReader.forCodedInput(p0), p1);
          return this;
       }catch(java.lang.RuntimeException e3){
          if (e3.getCause() instanceof IOException) {
             throw e3.getCause();
          }
          throw e3;
       }
    }
    public GeneratedMessageLite$Builder mergeFrom(GeneratedMessageLite p0){
       this.copyOnWrite();
       this.mergeFromInstance(this.instance, p0);
       return this;
    }
    public GeneratedMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2){
       return this.mergeFrom(p0, p1, p2, ExtensionRegistryLite.getEmptyRegistry());
    }
    public GeneratedMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       try{
          this.copyOnWrite();
          Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, p0, p1, (p1 + p2), new ArrayDecoders$Registers(p3));
          return this;
       }catch(com.google.protobuf.InvalidProtocolBufferException e9){
          throw e9;
       }catch(java.lang.IndexOutOfBoundsException e0){
          throw InvalidProtocolBufferException.truncatedMessage();
       }catch(java.io.IOException e9){
          throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
       }
    }
    public MessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
    public MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2){
       return this.mergeFrom(p0, p1, p2);
    }
    public MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.mergeFrom(p0, p1, p2, p3);
    }
    public final void mergeFromInstance(GeneratedMessageLite p0,GeneratedMessageLite p1){
       Protobuf.getInstance().schemaFor(p0).mergeFrom(p0, p1);
    }
}

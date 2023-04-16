package com.kwai.video.westeros.models.PickMediaServerInfo;
import com.kwai.video.westeros.models.PickMediaServerInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.PickMediaServerInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.PickMediaOutput$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.PickMediaOutput;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.PickMediaServerInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickMediaOutputOrBuilder;

public final class PickMediaServerInfo extends GeneratedMessageLite implements PickMediaServerInfoOrBuilder	// class@000ff5
{
    public String action_;
    public String name_;
    public Internal$ProtobufList output_;
    public String type_;
    public static final PickMediaServerInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickMediaServerInfo pickMediaSer = new PickMediaServerInfo();
       PickMediaServerInfo.DEFAULT_INSTANCE = pickMediaSer;
       GeneratedMessageLite.registerDefaultInstance(PickMediaServerInfo.class, pickMediaSer);
    }
    public void PickMediaServerInfo(){
       super();
       this.name_ = "";
       this.action_ = "";
       this.type_ = "";
       this.output_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static PickMediaServerInfo getDefaultInstance(){
       return PickMediaServerInfo.DEFAULT_INSTANCE;
    }
    public static PickMediaServerInfo$Builder newBuilder(){
       return PickMediaServerInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickMediaServerInfo$Builder newBuilder(PickMediaServerInfo p0){
       return PickMediaServerInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickMediaServerInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaServerInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaServerInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaServerInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaServerInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaServerInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaServerInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaServerInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickMediaServerInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllOutput(Iterable p0){
       this.ensureOutputIsMutable();
       AbstractMessageLite.addAll(p0, this.output_);
    }
    public void addOutput(int p0,PickMediaOutput$Builder p1){
       this.ensureOutputIsMutable();
       this.output_.add(p0, p1.build());
    }
    public void addOutput(int p0,PickMediaOutput p1){
       Objects.requireNonNull(p1);
       this.ensureOutputIsMutable();
       this.output_.add(p0, p1);
    }
    public void addOutput(PickMediaOutput$Builder p0){
       this.ensureOutputIsMutable();
       this.output_.add(p0.build());
    }
    public void addOutput(PickMediaOutput p0){
       Objects.requireNonNull(p0);
       this.ensureOutputIsMutable();
       this.output_.add(p0);
    }
    public void clearAction(){
       this.action_ = PickMediaServerInfo.getDefaultInstance().getAction();
    }
    public void clearName(){
       this.name_ = PickMediaServerInfo.getDefaultInstance().getName();
    }
    public void clearOutput(){
       this.output_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearType(){
       this.type_ = PickMediaServerInfo.getDefaultInstance().getType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickMediaServerInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickMediaServerInfo();
           case 2:
             return new PickMediaServerInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","action_","type_","output_",PickMediaOutput.class};
             return GeneratedMessageLite.newMessageInfo(PickMediaServerInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x1b\x00", objArray);
           case 4:
             return PickMediaServerInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickMediaServerInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickMediaServerInfo.class);
                pARSER = PickMediaServerInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickMediaServerInfo.DEFAULT_INSTANCE);
                   PickMediaServerInfo.PARSER = pARSER;
                }
                _monitor_exit(PickMediaServerInfo.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureOutputIsMutable(){
       if (!this.output_.isModifiable()) {
          this.output_ = GeneratedMessageLite.mutableCopy(this.output_);
       }
       return;
    }
    public String getAction(){
       return this.action_;
    }
    public ByteString getActionBytes(){
       return ByteString.copyFromUtf8(this.action_);
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public PickMediaOutput getOutput(int p0){
       return this.output_.get(p0);
    }
    public int getOutputCount(){
       return this.output_.size();
    }
    public List getOutputList(){
       return this.output_;
    }
    public PickMediaOutputOrBuilder getOutputOrBuilder(int p0){
       return this.output_.get(p0);
    }
    public List getOutputOrBuilderList(){
       return this.output_;
    }
    public String getType(){
       return this.type_;
    }
    public ByteString getTypeBytes(){
       return ByteString.copyFromUtf8(this.type_);
    }
    public void removeOutput(int p0){
       this.ensureOutputIsMutable();
       this.output_.remove(p0);
    }
    public void setAction(String p0){
       Objects.requireNonNull(p0);
       this.action_ = p0;
    }
    public void setActionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.action_ = p0.toStringUtf8();
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setOutput(int p0,PickMediaOutput$Builder p1){
       this.ensureOutputIsMutable();
       this.output_.set(p0, p1.build());
    }
    public void setOutput(int p0,PickMediaOutput p1){
       Objects.requireNonNull(p1);
       this.ensureOutputIsMutable();
       this.output_.set(p0, p1);
    }
    public void setType(String p0){
       Objects.requireNonNull(p0);
       this.type_ = p0;
    }
    public void setTypeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.type_ = p0.toStringUtf8();
    }
}

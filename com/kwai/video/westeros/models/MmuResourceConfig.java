package com.kwai.video.westeros.models.MmuResourceConfig;
import com.kwai.video.westeros.models.MmuResourceConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MmuResourceConfig$Builder;
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
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MmuResourceConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class MmuResourceConfig extends GeneratedMessageLite implements MmuResourceConfigOrBuilder	// class@000fe2
{
    public boolean isBuiltin_;
    public Internal$ProtobufList mmuModelPath_;
    public String resourcePath_;
    public String ycnnModelPath_;
    public static final MmuResourceConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuResourceConfig mmuResourceC = new MmuResourceConfig();
       MmuResourceConfig.DEFAULT_INSTANCE = mmuResourceC;
       GeneratedMessageLite.registerDefaultInstance(MmuResourceConfig.class, mmuResourceC);
    }
    public void MmuResourceConfig(){
       super();
       this.ycnnModelPath_ = "";
       this.mmuModelPath_ = GeneratedMessageLite.emptyProtobufList();
       this.resourcePath_ = "";
    }
    public static MmuResourceConfig getDefaultInstance(){
       return MmuResourceConfig.DEFAULT_INSTANCE;
    }
    public static MmuResourceConfig$Builder newBuilder(){
       return MmuResourceConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuResourceConfig$Builder newBuilder(MmuResourceConfig p0){
       return MmuResourceConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuResourceConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuResourceConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuResourceConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuResourceConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuResourceConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuResourceConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuResourceConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuResourceConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuResourceConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllMmuModelPath(Iterable p0){
       this.ensureMmuModelPathIsMutable();
       AbstractMessageLite.addAll(p0, this.mmuModelPath_);
    }
    public void addMmuModelPath(String p0){
       Objects.requireNonNull(p0);
       this.ensureMmuModelPathIsMutable();
       this.mmuModelPath_.add(p0);
    }
    public void addMmuModelPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureMmuModelPathIsMutable();
       this.mmuModelPath_.add(p0.toStringUtf8());
    }
    public void clearIsBuiltin(){
       this.isBuiltin_ = false;
    }
    public void clearMmuModelPath(){
       this.mmuModelPath_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearResourcePath(){
       this.resourcePath_ = MmuResourceConfig.getDefaultInstance().getResourcePath();
    }
    public void clearYcnnModelPath(){
       this.ycnnModelPath_ = MmuResourceConfig.getDefaultInstance().getYcnnModelPath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuResourceConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuResourceConfig();
           case 2:
             return new MmuResourceConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ycnnModelPath_","mmuModelPath_","resourcePath_","isBuiltin_"};
             return GeneratedMessageLite.newMessageInfo(MmuResourceConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x07\x00", objArray);
           case 4:
             return MmuResourceConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuResourceConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuResourceConfig.class);
                pARSER = MmuResourceConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuResourceConfig.DEFAULT_INSTANCE);
                   MmuResourceConfig.PARSER = pARSER;
                }
                _monitor_exit(MmuResourceConfig.class);
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
    public final void ensureMmuModelPathIsMutable(){
       if (!this.mmuModelPath_.isModifiable()) {
          this.mmuModelPath_ = GeneratedMessageLite.mutableCopy(this.mmuModelPath_);
       }
       return;
    }
    public boolean getIsBuiltin(){
       return this.isBuiltin_;
    }
    public String getMmuModelPath(int p0){
       return this.mmuModelPath_.get(p0);
    }
    public ByteString getMmuModelPathBytes(int p0){
       return ByteString.copyFromUtf8(this.mmuModelPath_.get(p0));
    }
    public int getMmuModelPathCount(){
       return this.mmuModelPath_.size();
    }
    public List getMmuModelPathList(){
       return this.mmuModelPath_;
    }
    public String getResourcePath(){
       return this.resourcePath_;
    }
    public ByteString getResourcePathBytes(){
       return ByteString.copyFromUtf8(this.resourcePath_);
    }
    public String getYcnnModelPath(){
       return this.ycnnModelPath_;
    }
    public ByteString getYcnnModelPathBytes(){
       return ByteString.copyFromUtf8(this.ycnnModelPath_);
    }
    public void setIsBuiltin(boolean p0){
       this.isBuiltin_ = p0;
    }
    public void setMmuModelPath(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureMmuModelPathIsMutable();
       this.mmuModelPath_.set(p0, p1);
    }
    public void setResourcePath(String p0){
       Objects.requireNonNull(p0);
       this.resourcePath_ = p0;
    }
    public void setResourcePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resourcePath_ = p0.toStringUtf8();
    }
    public void setYcnnModelPath(String p0){
       Objects.requireNonNull(p0);
       this.ycnnModelPath_ = p0;
    }
    public void setYcnnModelPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ycnnModelPath_ = p0.toStringUtf8();
    }
}

package com.kwai.video.westeros.models.MakeupResource;
import com.kwai.video.westeros.models.MakeupResourceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MakeupResource$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MakeupResource$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MakeupResource extends GeneratedMessageLite implements MakeupResourceOrBuilder	// class@000fa7
{
    public float intensity_;
    public int priority_;
    public String resourceDir_;
    public String type_;
    public static final MakeupResource DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MakeupResource makeupResour = new MakeupResource();
       MakeupResource.DEFAULT_INSTANCE = makeupResour;
       GeneratedMessageLite.registerDefaultInstance(MakeupResource.class, makeupResour);
    }
    public void MakeupResource(){
       super();
       this.type_ = "";
       this.resourceDir_ = "";
    }
    public static MakeupResource getDefaultInstance(){
       return MakeupResource.DEFAULT_INSTANCE;
    }
    public static MakeupResource$Builder newBuilder(){
       return MakeupResource.DEFAULT_INSTANCE.createBuilder();
    }
    public static MakeupResource$Builder newBuilder(MakeupResource p0){
       return MakeupResource.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MakeupResource parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResource parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResource parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResource parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResource parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResource parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResource parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MakeupResource.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public void clearPriority(){
       this.priority_ = 0;
    }
    public void clearResourceDir(){
       this.resourceDir_ = MakeupResource.getDefaultInstance().getResourceDir();
    }
    public void clearType(){
       this.type_ = MakeupResource.getDefaultInstance().getType();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MakeupResource$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MakeupResource();
           case 2:
             return new MakeupResource$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"priority_","intensity_","type_","resourceDir_"};
             return GeneratedMessageLite.newMessageInfo(MakeupResource.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x01\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return MakeupResource.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MakeupResource.PARSER;
             if (pARSER == null) {
                _monitor_enter(MakeupResource.class);
                pARSER = MakeupResource.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MakeupResource.DEFAULT_INSTANCE);
                   MakeupResource.PARSER = pARSER;
                }
                _monitor_exit(MakeupResource.class);
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
    public float getIntensity(){
       return this.intensity_;
    }
    public int getPriority(){
       return this.priority_;
    }
    public String getResourceDir(){
       return this.resourceDir_;
    }
    public ByteString getResourceDirBytes(){
       return ByteString.copyFromUtf8(this.resourceDir_);
    }
    public String getType(){
       return this.type_;
    }
    public ByteString getTypeBytes(){
       return ByteString.copyFromUtf8(this.type_);
    }
    public void setIntensity(float p0){
       this.intensity_ = p0;
    }
    public void setPriority(int p0){
       this.priority_ = p0;
    }
    public void setResourceDir(String p0){
       Objects.requireNonNull(p0);
       this.resourceDir_ = p0;
    }
    public void setResourceDirBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resourceDir_ = p0.toStringUtf8();
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

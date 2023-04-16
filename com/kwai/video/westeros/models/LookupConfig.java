package com.kwai.video.westeros.models.LookupConfig;
import com.kwai.video.westeros.models.LookupConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.LookupConfig$Builder;
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
import com.kwai.video.westeros.models.LookupConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class LookupConfig extends GeneratedMessageLite implements LookupConfigOrBuilder	// class@000f9b
{
    public float dimension_;
    public int filterId_;
    public float intensity_;
    public String name_;
    public int type_;
    public static final LookupConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       LookupConfig lookupConfig = new LookupConfig();
       LookupConfig.DEFAULT_INSTANCE = lookupConfig;
       GeneratedMessageLite.registerDefaultInstance(LookupConfig.class, lookupConfig);
    }
    public void LookupConfig(){
       super();
       this.name_ = "";
    }
    public static LookupConfig getDefaultInstance(){
       return LookupConfig.DEFAULT_INSTANCE;
    }
    public static LookupConfig$Builder newBuilder(){
       return LookupConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static LookupConfig$Builder newBuilder(LookupConfig p0){
       return LookupConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static LookupConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static LookupConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static LookupConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static LookupConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static LookupConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static LookupConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0);
    }
    public static LookupConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(LookupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return LookupConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDimension(){
       this.dimension_ = 0;
    }
    public void clearFilterId(){
       this.filterId_ = 0;
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public void clearName(){
       this.name_ = LookupConfig.getDefaultInstance().getName();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (LookupConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new LookupConfig();
           case 2:
             return new LookupConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"filterId_","type_","intensity_","dimension_","name_"};
             return GeneratedMessageLite.newMessageInfo(LookupConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x01\x04\x01\x05\x02\x02\x00", objArray);
           case 4:
             return LookupConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = LookupConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(LookupConfig.class);
                pARSER = LookupConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(LookupConfig.DEFAULT_INSTANCE);
                   LookupConfig.PARSER = pARSER;
                }
                _monitor_exit(LookupConfig.class);
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
    public float getDimension(){
       return this.dimension_;
    }
    public int getFilterId(){
       return this.filterId_;
    }
    public float getIntensity(){
       return this.intensity_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public int getType(){
       return this.type_;
    }
    public void setDimension(float p0){
       this.dimension_ = p0;
    }
    public void setFilterId(int p0){
       this.filterId_ = p0;
    }
    public void setIntensity(float p0){
       this.intensity_ = p0;
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
    public void setType(int p0){
       this.type_ = p0;
    }
}

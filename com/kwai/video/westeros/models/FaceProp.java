package com.kwai.video.westeros.models.FaceProp;
import com.kwai.video.westeros.models.FacePropOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FaceProp$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FaceProp$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FaceProp extends GeneratedMessageLite implements FacePropOrBuilder	// class@000f66
{
    public int dataFlag_;
    public boolean hasGlass_;
    public boolean isMale_;
    public static final FaceProp DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceProp uFaceProp = new FaceProp();
       FaceProp.DEFAULT_INSTANCE = uFaceProp;
       GeneratedMessageLite.registerDefaultInstance(FaceProp.class, uFaceProp);
    }
    public void FaceProp(){
       super();
    }
    public static FaceProp getDefaultInstance(){
       return FaceProp.DEFAULT_INSTANCE;
    }
    public static FaceProp$Builder newBuilder(){
       return FaceProp.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceProp$Builder newBuilder(FaceProp p0){
       return FaceProp.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceProp parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceProp parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceProp parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceProp parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceProp parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceProp parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0);
    }
    public static FaceProp parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceProp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceProp.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDataFlag(){
       this.dataFlag_ = 0;
    }
    public void clearHasGlass(){
       this.hasGlass_ = false;
    }
    public void clearIsMale(){
       this.isMale_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceProp$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FaceProp();
           case 2:
             return new FaceProp$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"dataFlag_","hasGlass_","isMale_"};
             return GeneratedMessageLite.newMessageInfo(FaceProp.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x07\x03\x07\x00", objArray);
           case 4:
             return FaceProp.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceProp.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceProp.class);
                pARSER = FaceProp.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceProp.DEFAULT_INSTANCE);
                   FaceProp.PARSER = pARSER;
                }
                _monitor_exit(FaceProp.class);
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
    public int getDataFlag(){
       return this.dataFlag_;
    }
    public boolean getHasGlass(){
       return this.hasGlass_;
    }
    public boolean getIsMale(){
       return this.isMale_;
    }
    public void setDataFlag(int p0){
       this.dataFlag_ = p0;
    }
    public void setHasGlass(boolean p0){
       this.hasGlass_ = p0;
    }
    public void setIsMale(boolean p0){
       this.isMale_ = p0;
    }
}

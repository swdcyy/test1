package com.kwai.video.westeros.models.FMTimeStamp;
import com.kwai.video.westeros.models.FMTimeStampOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FMTimeStamp$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FMTimeStamp$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FMTimeStamp extends GeneratedMessageLite implements FMTimeStampOrBuilder	// class@000f5a
{
    public double duration_;
    public double effectTime_;
    public double frameTime_;
    public static final FMTimeStamp DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FMTimeStamp uFMTimeStamp = new FMTimeStamp();
       FMTimeStamp.DEFAULT_INSTANCE = uFMTimeStamp;
       GeneratedMessageLite.registerDefaultInstance(FMTimeStamp.class, uFMTimeStamp);
    }
    public void FMTimeStamp(){
       super();
    }
    public static FMTimeStamp getDefaultInstance(){
       return FMTimeStamp.DEFAULT_INSTANCE;
    }
    public static FMTimeStamp$Builder newBuilder(){
       return FMTimeStamp.DEFAULT_INSTANCE.createBuilder();
    }
    public static FMTimeStamp$Builder newBuilder(FMTimeStamp p0){
       return FMTimeStamp.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FMTimeStamp parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMTimeStamp parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMTimeStamp parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMTimeStamp parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMTimeStamp parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static FMTimeStamp parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0);
    }
    public static FMTimeStamp parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FMTimeStamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FMTimeStamp.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearEffectTime(){
       this.effectTime_ = 0;
    }
    public void clearFrameTime(){
       this.frameTime_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FMTimeStamp$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FMTimeStamp();
           case 2:
             return new FMTimeStamp$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"effectTime_","duration_","frameTime_"};
             return GeneratedMessageLite.newMessageInfo(FMTimeStamp.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\xff\x02\xff\x02\x03\xff\x02\xff\x02\x00", objArray);
           case 4:
             return FMTimeStamp.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FMTimeStamp.PARSER;
             if (pARSER == null) {
                _monitor_enter(FMTimeStamp.class);
                pARSER = FMTimeStamp.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FMTimeStamp.DEFAULT_INSTANCE);
                   FMTimeStamp.PARSER = pARSER;
                }
                _monitor_exit(FMTimeStamp.class);
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
    public double getDuration(){
       return this.duration_;
    }
    public double getEffectTime(){
       return this.effectTime_;
    }
    public double getFrameTime(){
       return this.frameTime_;
    }
    public void setDuration(double p0){
       this.duration_ = p0;
    }
    public void setEffectTime(double p0){
       this.effectTime_ = p0;
    }
    public void setFrameTime(double p0){
       this.frameTime_ = p0;
    }
}

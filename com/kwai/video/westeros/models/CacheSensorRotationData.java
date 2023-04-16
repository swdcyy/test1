package com.kwai.video.westeros.models.CacheSensorRotationData;
import com.kwai.video.westeros.models.CacheSensorRotationDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.CacheSensorRotationData$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.CacheSensorRotationData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class CacheSensorRotationData extends GeneratedMessageLite implements CacheSensorRotationDataOrBuilder	// class@000ee2
{
    public long ptsMs_;
    public float rotation_;
    public static final CacheSensorRotationData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CacheSensorRotationData uCacheSensor = new CacheSensorRotationData();
       CacheSensorRotationData.DEFAULT_INSTANCE = uCacheSensor;
       GeneratedMessageLite.registerDefaultInstance(CacheSensorRotationData.class, uCacheSensor);
    }
    public void CacheSensorRotationData(){
       super();
    }
    public static CacheSensorRotationData getDefaultInstance(){
       return CacheSensorRotationData.DEFAULT_INSTANCE;
    }
    public static CacheSensorRotationData$Builder newBuilder(){
       return CacheSensorRotationData.DEFAULT_INSTANCE.createBuilder();
    }
    public static CacheSensorRotationData$Builder newBuilder(CacheSensorRotationData p0){
       return CacheSensorRotationData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CacheSensorRotationData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CacheSensorRotationData.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearPtsMs(){
       this.ptsMs_ = 0;
    }
    public void clearRotation(){
       this.rotation_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CacheSensorRotationData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CacheSensorRotationData();
           case 2:
             return new CacheSensorRotationData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ptsMs_","rotation_"};
             return GeneratedMessageLite.newMessageInfo(CacheSensorRotationData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x02\x01\x00", objArray);
           case 4:
             return CacheSensorRotationData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CacheSensorRotationData.PARSER;
             if (pARSER == null) {
                _monitor_enter(CacheSensorRotationData.class);
                pARSER = CacheSensorRotationData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CacheSensorRotationData.DEFAULT_INSTANCE);
                   CacheSensorRotationData.PARSER = pARSER;
                }
                _monitor_exit(CacheSensorRotationData.class);
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
    public long getPtsMs(){
       return this.ptsMs_;
    }
    public float getRotation(){
       return this.rotation_;
    }
    public void setPtsMs(long p0){
       this.ptsMs_ = p0;
    }
    public void setRotation(float p0){
       this.rotation_ = p0;
    }
}

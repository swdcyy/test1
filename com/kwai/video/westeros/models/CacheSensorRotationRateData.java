package com.kwai.video.westeros.models.CacheSensorRotationRateData;
import com.kwai.video.westeros.models.CacheSensorRotationRateDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$DoubleList;
import com.kwai.video.westeros.models.CacheSensorRotationRateData$Builder;
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
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.CacheSensorRotationRateData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class CacheSensorRotationRateData extends GeneratedMessageLite implements CacheSensorRotationRateDataOrBuilder	// class@000ee6
{
    public long ptsMs_;
    public int rotationRateMemoizedSerializedSize;
    public Internal$DoubleList rotationRate_;
    public static final CacheSensorRotationRateData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CacheSensorRotationRateData uCacheSensor = new CacheSensorRotationRateData();
       CacheSensorRotationRateData.DEFAULT_INSTANCE = uCacheSensor;
       GeneratedMessageLite.registerDefaultInstance(CacheSensorRotationRateData.class, uCacheSensor);
    }
    public void CacheSensorRotationRateData(){
       super();
       this.rotationRateMemoizedSerializedSize = -1;
       this.rotationRate_ = GeneratedMessageLite.emptyDoubleList();
    }
    public static CacheSensorRotationRateData getDefaultInstance(){
       return CacheSensorRotationRateData.DEFAULT_INSTANCE;
    }
    public static CacheSensorRotationRateData$Builder newBuilder(){
       return CacheSensorRotationRateData.DEFAULT_INSTANCE.createBuilder();
    }
    public static CacheSensorRotationRateData$Builder newBuilder(CacheSensorRotationRateData p0){
       return CacheSensorRotationRateData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CacheSensorRotationRateData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationRateData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationRateData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationRateData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationRateData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorRotationRateData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorRotationRateData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorRotationRateData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CacheSensorRotationRateData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllRotationRate(Iterable p0){
       this.ensureRotationRateIsMutable();
       AbstractMessageLite.addAll(p0, this.rotationRate_);
    }
    public void addRotationRate(double p0){
       this.ensureRotationRateIsMutable();
       this.rotationRate_.addDouble(p0);
    }
    public void clearPtsMs(){
       this.ptsMs_ = 0;
    }
    public void clearRotationRate(){
       this.rotationRate_ = GeneratedMessageLite.emptyDoubleList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CacheSensorRotationRateData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CacheSensorRotationRateData();
           case 2:
             return new CacheSensorRotationRateData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ptsMs_","rotationRate_"};
             return GeneratedMessageLite.newMessageInfo(CacheSensorRotationRateData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x03\x02#\x00", objArray);
           case 4:
             return CacheSensorRotationRateData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CacheSensorRotationRateData.PARSER;
             if (pARSER == null) {
                _monitor_enter(CacheSensorRotationRateData.class);
                pARSER = CacheSensorRotationRateData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CacheSensorRotationRateData.DEFAULT_INSTANCE);
                   CacheSensorRotationRateData.PARSER = pARSER;
                }
                _monitor_exit(CacheSensorRotationRateData.class);
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
    public final void ensureRotationRateIsMutable(){
       if (!this.rotationRate_.isModifiable()) {
          this.rotationRate_ = GeneratedMessageLite.mutableCopy(this.rotationRate_);
       }
       return;
    }
    public long getPtsMs(){
       return this.ptsMs_;
    }
    public double getRotationRate(int p0){
       return this.rotationRate_.getDouble(p0);
    }
    public int getRotationRateCount(){
       return this.rotationRate_.size();
    }
    public List getRotationRateList(){
       return this.rotationRate_;
    }
    public void setPtsMs(long p0){
       this.ptsMs_ = p0;
    }
    public void setRotationRate(int p0,double p1){
       this.ensureRotationRateIsMutable();
       this.rotationRate_.setDouble(p0, p1);
    }
}

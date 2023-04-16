package com.kwai.video.westeros.models.CacheSensorAccelerationData;
import com.kwai.video.westeros.models.CacheSensorAccelerationDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$DoubleList;
import com.kwai.video.westeros.models.CacheSensorAccelerationData$Builder;
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
import com.kwai.video.westeros.models.CacheSensorAccelerationData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class CacheSensorAccelerationData extends GeneratedMessageLite implements CacheSensorAccelerationDataOrBuilder	// class@000ed2
{
    public int accelerationMemoizedSerializedSize;
    public Internal$DoubleList acceleration_;
    public long ptsMs_;
    public static final CacheSensorAccelerationData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CacheSensorAccelerationData uCacheSensor = new CacheSensorAccelerationData();
       CacheSensorAccelerationData.DEFAULT_INSTANCE = uCacheSensor;
       GeneratedMessageLite.registerDefaultInstance(CacheSensorAccelerationData.class, uCacheSensor);
    }
    public void CacheSensorAccelerationData(){
       super();
       this.accelerationMemoizedSerializedSize = -1;
       this.acceleration_ = GeneratedMessageLite.emptyDoubleList();
    }
    public static CacheSensorAccelerationData getDefaultInstance(){
       return CacheSensorAccelerationData.DEFAULT_INSTANCE;
    }
    public static CacheSensorAccelerationData$Builder newBuilder(){
       return CacheSensorAccelerationData.DEFAULT_INSTANCE.createBuilder();
    }
    public static CacheSensorAccelerationData$Builder newBuilder(CacheSensorAccelerationData p0){
       return CacheSensorAccelerationData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CacheSensorAccelerationData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAccelerationData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAccelerationData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAccelerationData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAccelerationData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAccelerationData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAccelerationData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAccelerationData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CacheSensorAccelerationData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAcceleration(double p0){
       this.ensureAccelerationIsMutable();
       this.acceleration_.addDouble(p0);
    }
    public void addAllAcceleration(Iterable p0){
       this.ensureAccelerationIsMutable();
       AbstractMessageLite.addAll(p0, this.acceleration_);
    }
    public void clearAcceleration(){
       this.acceleration_ = GeneratedMessageLite.emptyDoubleList();
    }
    public void clearPtsMs(){
       this.ptsMs_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CacheSensorAccelerationData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CacheSensorAccelerationData();
           case 2:
             return new CacheSensorAccelerationData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ptsMs_","acceleration_"};
             return GeneratedMessageLite.newMessageInfo(CacheSensorAccelerationData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x03\x02#\x00", objArray);
           case 4:
             return CacheSensorAccelerationData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CacheSensorAccelerationData.PARSER;
             if (pARSER == null) {
                _monitor_enter(CacheSensorAccelerationData.class);
                pARSER = CacheSensorAccelerationData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CacheSensorAccelerationData.DEFAULT_INSTANCE);
                   CacheSensorAccelerationData.PARSER = pARSER;
                }
                _monitor_exit(CacheSensorAccelerationData.class);
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
    public final void ensureAccelerationIsMutable(){
       if (!this.acceleration_.isModifiable()) {
          this.acceleration_ = GeneratedMessageLite.mutableCopy(this.acceleration_);
       }
       return;
    }
    public double getAcceleration(int p0){
       return this.acceleration_.getDouble(p0);
    }
    public int getAccelerationCount(){
       return this.acceleration_.size();
    }
    public List getAccelerationList(){
       return this.acceleration_;
    }
    public long getPtsMs(){
       return this.ptsMs_;
    }
    public void setAcceleration(int p0,double p1){
       this.ensureAccelerationIsMutable();
       this.acceleration_.setDouble(p0, p1);
    }
    public void setPtsMs(long p0){
       this.ptsMs_ = p0;
    }
}

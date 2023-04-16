package com.kwai.video.westeros.models.CacheSensorAttitudeData;
import com.kwai.video.westeros.models.CacheSensorAttitudeDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$DoubleList;
import com.kwai.video.westeros.models.CacheSensorAttitudeData$Builder;
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
import com.kwai.video.westeros.models.CacheSensorAttitudeData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class CacheSensorAttitudeData extends GeneratedMessageLite implements CacheSensorAttitudeDataOrBuilder	// class@000ed6
{
    public int attitudeMemoizedSerializedSize;
    public Internal$DoubleList attitude_;
    public long ptsMs_;
    public static final CacheSensorAttitudeData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CacheSensorAttitudeData uCacheSensor = new CacheSensorAttitudeData();
       CacheSensorAttitudeData.DEFAULT_INSTANCE = uCacheSensor;
       GeneratedMessageLite.registerDefaultInstance(CacheSensorAttitudeData.class, uCacheSensor);
    }
    public void CacheSensorAttitudeData(){
       super();
       this.attitudeMemoizedSerializedSize = -1;
       this.attitude_ = GeneratedMessageLite.emptyDoubleList();
    }
    public static CacheSensorAttitudeData getDefaultInstance(){
       return CacheSensorAttitudeData.DEFAULT_INSTANCE;
    }
    public static CacheSensorAttitudeData$Builder newBuilder(){
       return CacheSensorAttitudeData.DEFAULT_INSTANCE.createBuilder();
    }
    public static CacheSensorAttitudeData$Builder newBuilder(CacheSensorAttitudeData p0){
       return CacheSensorAttitudeData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CacheSensorAttitudeData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAttitudeData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAttitudeData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAttitudeData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAttitudeData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorAttitudeData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorAttitudeData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorAttitudeData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CacheSensorAttitudeData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllAttitude(Iterable p0){
       this.ensureAttitudeIsMutable();
       AbstractMessageLite.addAll(p0, this.attitude_);
    }
    public void addAttitude(double p0){
       this.ensureAttitudeIsMutable();
       this.attitude_.addDouble(p0);
    }
    public void clearAttitude(){
       this.attitude_ = GeneratedMessageLite.emptyDoubleList();
    }
    public void clearPtsMs(){
       this.ptsMs_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CacheSensorAttitudeData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CacheSensorAttitudeData();
           case 2:
             return new CacheSensorAttitudeData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"ptsMs_","attitude_"};
             return GeneratedMessageLite.newMessageInfo(CacheSensorAttitudeData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x03\x02#\x00", objArray);
           case 4:
             return CacheSensorAttitudeData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CacheSensorAttitudeData.PARSER;
             if (pARSER == null) {
                _monitor_enter(CacheSensorAttitudeData.class);
                pARSER = CacheSensorAttitudeData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CacheSensorAttitudeData.DEFAULT_INSTANCE);
                   CacheSensorAttitudeData.PARSER = pARSER;
                }
                _monitor_exit(CacheSensorAttitudeData.class);
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
    public final void ensureAttitudeIsMutable(){
       if (!this.attitude_.isModifiable()) {
          this.attitude_ = GeneratedMessageLite.mutableCopy(this.attitude_);
       }
       return;
    }
    public double getAttitude(int p0){
       return this.attitude_.getDouble(p0);
    }
    public int getAttitudeCount(){
       return this.attitude_.size();
    }
    public List getAttitudeList(){
       return this.attitude_;
    }
    public long getPtsMs(){
       return this.ptsMs_;
    }
    public void setAttitude(int p0,double p1){
       this.ensureAttitudeIsMutable();
       this.attitude_.setDouble(p0, p1);
    }
    public void setPtsMs(long p0){
       this.ptsMs_ = p0;
    }
}

package com.kwai.video.westeros.models.CacheSensorData;
import com.kwai.video.westeros.models.CacheSensorDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.kwai.video.westeros.models.CacheSensorData$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Long;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.CacheSensorData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.CacheSensorData$RotationMapDefaultEntryHolder;
import com.kwai.video.westeros.models.CacheSensorData$RotationRateMapDefaultEntryHolder;
import com.kwai.video.westeros.models.CacheSensorData$AccelerationMapDefaultEntryHolder;
import com.kwai.video.westeros.models.CacheSensorData$AttitudeMapDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.lang.String;
import java.util.Map;
import java.util.Collections;
import com.kwai.video.westeros.models.CacheSensorAccelerationData;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.CacheSensorAttitudeData;
import com.kwai.video.westeros.models.CacheSensorRotationData;
import com.kwai.video.westeros.models.CacheSensorRotationRateData;

public final class CacheSensorData extends GeneratedMessageLite implements CacheSensorDataOrBuilder	// class@000ede
{
    public MapFieldLite accelerationMap_;
    public MapFieldLite attitudeMap_;
    public MapFieldLite rotationMap_;
    public MapFieldLite rotationRateMap_;
    public static final CacheSensorData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CacheSensorData uCacheSensor = new CacheSensorData();
       CacheSensorData.DEFAULT_INSTANCE = uCacheSensor;
       GeneratedMessageLite.registerDefaultInstance(CacheSensorData.class, uCacheSensor);
    }
    public void CacheSensorData(){
       super();
       this.rotationMap_ = MapFieldLite.emptyMapField();
       this.rotationRateMap_ = MapFieldLite.emptyMapField();
       this.accelerationMap_ = MapFieldLite.emptyMapField();
       this.attitudeMap_ = MapFieldLite.emptyMapField();
    }
    public static CacheSensorData getDefaultInstance(){
       return CacheSensorData.DEFAULT_INSTANCE;
    }
    public static CacheSensorData$Builder newBuilder(){
       return CacheSensorData.DEFAULT_INSTANCE.createBuilder();
    }
    public static CacheSensorData$Builder newBuilder(CacheSensorData p0){
       return CacheSensorData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CacheSensorData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static CacheSensorData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0);
    }
    public static CacheSensorData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CacheSensorData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CacheSensorData.DEFAULT_INSTANCE.getParserForType();
    }
    public boolean containsAccelerationMap(long p0){
       return this.internalGetAccelerationMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsAttitudeMap(long p0){
       return this.internalGetAttitudeMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsRotationMap(long p0){
       return this.internalGetRotationMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsRotationRateMap(long p0){
       return this.internalGetRotationRateMap().containsKey(Long.valueOf(p0));
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CacheSensorData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CacheSensorData();
           case 2:
             return new CacheSensorData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"rotationMap_",CacheSensorData$RotationMapDefaultEntryHolder.defaultEntry,"rotationRateMap_",CacheSensorData$RotationRateMapDefaultEntryHolder.defaultEntry,"accelerationMap_",CacheSensorData$AccelerationMapDefaultEntryHolder.defaultEntry,"attitudeMap_",CacheSensorData$AttitudeMapDefaultEntryHolder.defaultEntry};
             return GeneratedMessageLite.newMessageInfo(CacheSensorData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\x012\x022\x032\x042\x00", objArray);
           case 4:
             return CacheSensorData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CacheSensorData.PARSER;
             if (pARSER == null) {
                _monitor_enter(CacheSensorData.class);
                pARSER = CacheSensorData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CacheSensorData.DEFAULT_INSTANCE);
                   CacheSensorData.PARSER = pARSER;
                }
                _monitor_exit(CacheSensorData.class);
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
    public Map getAccelerationMap(){
       return this.getAccelerationMapMap();
    }
    public int getAccelerationMapCount(){
       return this.internalGetAccelerationMap().size();
    }
    public Map getAccelerationMapMap(){
       return Collections.unmodifiableMap(this.internalGetAccelerationMap());
    }
    public CacheSensorAccelerationData getAccelerationMapOrDefault(long p0,CacheSensorAccelerationData p1){
       MapFieldLite mapFieldLite = this.internalGetAccelerationMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          p1 = mapFieldLite.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorAccelerationData getAccelerationMapOrThrow(long p0){
       MapFieldLite mapFieldLite = this.internalGetAccelerationMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          return mapFieldLite.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getAttitudeMap(){
       return this.getAttitudeMapMap();
    }
    public int getAttitudeMapCount(){
       return this.internalGetAttitudeMap().size();
    }
    public Map getAttitudeMapMap(){
       return Collections.unmodifiableMap(this.internalGetAttitudeMap());
    }
    public CacheSensorAttitudeData getAttitudeMapOrDefault(long p0,CacheSensorAttitudeData p1){
       MapFieldLite mapFieldLite = this.internalGetAttitudeMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          p1 = mapFieldLite.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorAttitudeData getAttitudeMapOrThrow(long p0){
       MapFieldLite mapFieldLite = this.internalGetAttitudeMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          return mapFieldLite.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getMutableAccelerationMapMap(){
       return this.internalGetMutableAccelerationMap();
    }
    public Map getMutableAttitudeMapMap(){
       return this.internalGetMutableAttitudeMap();
    }
    public Map getMutableRotationMapMap(){
       return this.internalGetMutableRotationMap();
    }
    public Map getMutableRotationRateMapMap(){
       return this.internalGetMutableRotationRateMap();
    }
    public Map getRotationMap(){
       return this.getRotationMapMap();
    }
    public int getRotationMapCount(){
       return this.internalGetRotationMap().size();
    }
    public Map getRotationMapMap(){
       return Collections.unmodifiableMap(this.internalGetRotationMap());
    }
    public CacheSensorRotationData getRotationMapOrDefault(long p0,CacheSensorRotationData p1){
       MapFieldLite mapFieldLite = this.internalGetRotationMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          p1 = mapFieldLite.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorRotationData getRotationMapOrThrow(long p0){
       MapFieldLite mapFieldLite = this.internalGetRotationMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          return mapFieldLite.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getRotationRateMap(){
       return this.getRotationRateMapMap();
    }
    public int getRotationRateMapCount(){
       return this.internalGetRotationRateMap().size();
    }
    public Map getRotationRateMapMap(){
       return Collections.unmodifiableMap(this.internalGetRotationRateMap());
    }
    public CacheSensorRotationRateData getRotationRateMapOrDefault(long p0,CacheSensorRotationRateData p1){
       MapFieldLite mapFieldLite = this.internalGetRotationRateMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          p1 = mapFieldLite.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorRotationRateData getRotationRateMapOrThrow(long p0){
       MapFieldLite mapFieldLite = this.internalGetRotationRateMap();
       if (mapFieldLite.containsKey(Long.valueOf(p0))) {
          return mapFieldLite.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public final MapFieldLite internalGetAccelerationMap(){
       return this.accelerationMap_;
    }
    public final MapFieldLite internalGetAttitudeMap(){
       return this.attitudeMap_;
    }
    public final MapFieldLite internalGetMutableAccelerationMap(){
       if (!this.accelerationMap_.isMutable()) {
          this.accelerationMap_ = this.accelerationMap_.mutableCopy();
       }
       return this.accelerationMap_;
    }
    public final MapFieldLite internalGetMutableAttitudeMap(){
       if (!this.attitudeMap_.isMutable()) {
          this.attitudeMap_ = this.attitudeMap_.mutableCopy();
       }
       return this.attitudeMap_;
    }
    public final MapFieldLite internalGetMutableRotationMap(){
       if (!this.rotationMap_.isMutable()) {
          this.rotationMap_ = this.rotationMap_.mutableCopy();
       }
       return this.rotationMap_;
    }
    public final MapFieldLite internalGetMutableRotationRateMap(){
       if (!this.rotationRateMap_.isMutable()) {
          this.rotationRateMap_ = this.rotationRateMap_.mutableCopy();
       }
       return this.rotationRateMap_;
    }
    public final MapFieldLite internalGetRotationMap(){
       return this.rotationMap_;
    }
    public final MapFieldLite internalGetRotationRateMap(){
       return this.rotationRateMap_;
    }
}

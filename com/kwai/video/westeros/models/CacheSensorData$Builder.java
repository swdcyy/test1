package com.kwai.video.westeros.models.CacheSensorData$Builder;
import com.kwai.video.westeros.models.CacheSensorDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CacheSensorData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CacheSensorData$1;
import java.util.Map;
import java.lang.Long;
import java.lang.Object;
import java.util.Collections;
import com.kwai.video.westeros.models.CacheSensorAccelerationData;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.CacheSensorAttitudeData;
import com.kwai.video.westeros.models.CacheSensorRotationData;
import com.kwai.video.westeros.models.CacheSensorRotationRateData;
import java.util.Objects;

public final class CacheSensorData$Builder extends GeneratedMessageLite$Builder implements CacheSensorDataOrBuilder	// class@000edb
{

    public void CacheSensorData$Builder(){
       super(CacheSensorData.DEFAULT_INSTANCE);
    }
    public void CacheSensorData$Builder(CacheSensorData$1 p0){
       super();
    }
    public CacheSensorData$Builder clearAccelerationMap(){
       this.copyOnWrite();
       this.instance.getMutableAccelerationMapMap().clear();
       return this;
    }
    public CacheSensorData$Builder clearAttitudeMap(){
       this.copyOnWrite();
       this.instance.getMutableAttitudeMapMap().clear();
       return this;
    }
    public CacheSensorData$Builder clearRotationMap(){
       this.copyOnWrite();
       this.instance.getMutableRotationMapMap().clear();
       return this;
    }
    public CacheSensorData$Builder clearRotationRateMap(){
       this.copyOnWrite();
       this.instance.getMutableRotationRateMapMap().clear();
       return this;
    }
    public boolean containsAccelerationMap(long p0){
       return this.instance.getAccelerationMapMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsAttitudeMap(long p0){
       return this.instance.getAttitudeMapMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsRotationMap(long p0){
       return this.instance.getRotationMapMap().containsKey(Long.valueOf(p0));
    }
    public boolean containsRotationRateMap(long p0){
       return this.instance.getRotationRateMapMap().containsKey(Long.valueOf(p0));
    }
    public Map getAccelerationMap(){
       return this.getAccelerationMapMap();
    }
    public int getAccelerationMapCount(){
       return this.instance.getAccelerationMapMap().size();
    }
    public Map getAccelerationMapMap(){
       return Collections.unmodifiableMap(this.instance.getAccelerationMapMap());
    }
    public CacheSensorAccelerationData getAccelerationMapOrDefault(long p0,CacheSensorAccelerationData p1){
       Map acceleration = this.instance.getAccelerationMapMap();
       if (acceleration.containsKey(Long.valueOf(p0))) {
          p1 = acceleration.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorAccelerationData getAccelerationMapOrThrow(long p0){
       Map acceleration = this.instance.getAccelerationMapMap();
       if (acceleration.containsKey(Long.valueOf(p0))) {
          return acceleration.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getAttitudeMap(){
       return this.getAttitudeMapMap();
    }
    public int getAttitudeMapCount(){
       return this.instance.getAttitudeMapMap().size();
    }
    public Map getAttitudeMapMap(){
       return Collections.unmodifiableMap(this.instance.getAttitudeMapMap());
    }
    public CacheSensorAttitudeData getAttitudeMapOrDefault(long p0,CacheSensorAttitudeData p1){
       Map attitudeMapM = this.instance.getAttitudeMapMap();
       if (attitudeMapM.containsKey(Long.valueOf(p0))) {
          p1 = attitudeMapM.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorAttitudeData getAttitudeMapOrThrow(long p0){
       Map attitudeMapM = this.instance.getAttitudeMapMap();
       if (attitudeMapM.containsKey(Long.valueOf(p0))) {
          return attitudeMapM.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getRotationMap(){
       return this.getRotationMapMap();
    }
    public int getRotationMapCount(){
       return this.instance.getRotationMapMap().size();
    }
    public Map getRotationMapMap(){
       return Collections.unmodifiableMap(this.instance.getRotationMapMap());
    }
    public CacheSensorRotationData getRotationMapOrDefault(long p0,CacheSensorRotationData p1){
       Map rotationMapM = this.instance.getRotationMapMap();
       if (rotationMapM.containsKey(Long.valueOf(p0))) {
          p1 = rotationMapM.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorRotationData getRotationMapOrThrow(long p0){
       Map rotationMapM = this.instance.getRotationMapMap();
       if (rotationMapM.containsKey(Long.valueOf(p0))) {
          return rotationMapM.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public Map getRotationRateMap(){
       return this.getRotationRateMapMap();
    }
    public int getRotationRateMapCount(){
       return this.instance.getRotationRateMapMap().size();
    }
    public Map getRotationRateMapMap(){
       return Collections.unmodifiableMap(this.instance.getRotationRateMapMap());
    }
    public CacheSensorRotationRateData getRotationRateMapOrDefault(long p0,CacheSensorRotationRateData p1){
       Map rotationRate = this.instance.getRotationRateMapMap();
       if (rotationRate.containsKey(Long.valueOf(p0))) {
          p1 = rotationRate.get(Long.valueOf(p0));
       }
       return p1;
    }
    public CacheSensorRotationRateData getRotationRateMapOrThrow(long p0){
       Map rotationRate = this.instance.getRotationRateMapMap();
       if (rotationRate.containsKey(Long.valueOf(p0))) {
          return rotationRate.get(Long.valueOf(p0));
       }
       throw new IllegalArgumentException();
    }
    public CacheSensorData$Builder putAccelerationMap(long p0,CacheSensorAccelerationData p1){
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableAccelerationMapMap().put(Long.valueOf(p0), p1);
       return this;
    }
    public CacheSensorData$Builder putAllAccelerationMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableAccelerationMapMap().putAll(p0);
       return this;
    }
    public CacheSensorData$Builder putAllAttitudeMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableAttitudeMapMap().putAll(p0);
       return this;
    }
    public CacheSensorData$Builder putAllRotationMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableRotationMapMap().putAll(p0);
       return this;
    }
    public CacheSensorData$Builder putAllRotationRateMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableRotationRateMapMap().putAll(p0);
       return this;
    }
    public CacheSensorData$Builder putAttitudeMap(long p0,CacheSensorAttitudeData p1){
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableAttitudeMapMap().put(Long.valueOf(p0), p1);
       return this;
    }
    public CacheSensorData$Builder putRotationMap(long p0,CacheSensorRotationData p1){
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableRotationMapMap().put(Long.valueOf(p0), p1);
       return this;
    }
    public CacheSensorData$Builder putRotationRateMap(long p0,CacheSensorRotationRateData p1){
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableRotationRateMapMap().put(Long.valueOf(p0), p1);
       return this;
    }
    public CacheSensorData$Builder removeAccelerationMap(long p0){
       this.copyOnWrite();
       this.instance.getMutableAccelerationMapMap().remove(Long.valueOf(p0));
       return this;
    }
    public CacheSensorData$Builder removeAttitudeMap(long p0){
       this.copyOnWrite();
       this.instance.getMutableAttitudeMapMap().remove(Long.valueOf(p0));
       return this;
    }
    public CacheSensorData$Builder removeRotationMap(long p0){
       this.copyOnWrite();
       this.instance.getMutableRotationMapMap().remove(Long.valueOf(p0));
       return this;
    }
    public CacheSensorData$Builder removeRotationRateMap(long p0){
       this.copyOnWrite();
       this.instance.getMutableRotationRateMapMap().remove(Long.valueOf(p0));
       return this;
    }
}

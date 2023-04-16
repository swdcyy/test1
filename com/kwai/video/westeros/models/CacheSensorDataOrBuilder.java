package com.kwai.video.westeros.models.CacheSensorDataOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;
import com.kwai.video.westeros.models.CacheSensorAccelerationData;
import com.kwai.video.westeros.models.CacheSensorAttitudeData;
import com.kwai.video.westeros.models.CacheSensorRotationData;
import com.kwai.video.westeros.models.CacheSensorRotationRateData;

public interface abstract CacheSensorDataOrBuilder implements MessageLiteOrBuilder	// class@000edf
{

    boolean containsAccelerationMap(long p0);
    boolean containsAttitudeMap(long p0);
    boolean containsRotationMap(long p0);
    boolean containsRotationRateMap(long p0);
    Map getAccelerationMap();
    int getAccelerationMapCount();
    Map getAccelerationMapMap();
    CacheSensorAccelerationData getAccelerationMapOrDefault(long p0,CacheSensorAccelerationData p1);
    CacheSensorAccelerationData getAccelerationMapOrThrow(long p0);
    Map getAttitudeMap();
    int getAttitudeMapCount();
    Map getAttitudeMapMap();
    CacheSensorAttitudeData getAttitudeMapOrDefault(long p0,CacheSensorAttitudeData p1);
    CacheSensorAttitudeData getAttitudeMapOrThrow(long p0);
    Map getRotationMap();
    int getRotationMapCount();
    Map getRotationMapMap();
    CacheSensorRotationData getRotationMapOrDefault(long p0,CacheSensorRotationData p1);
    CacheSensorRotationData getRotationMapOrThrow(long p0);
    Map getRotationRateMap();
    int getRotationRateMapCount();
    Map getRotationRateMapMap();
    CacheSensorRotationRateData getRotationRateMapOrDefault(long p0,CacheSensorRotationRateData p1);
    CacheSensorRotationRateData getRotationRateMapOrThrow(long p0);
}

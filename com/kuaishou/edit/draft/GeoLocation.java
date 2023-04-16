package com.kuaishou.edit.draft.GeoLocation;
import z30.k0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.GeoLocation$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.GeoLocation$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class GeoLocation extends GeneratedMessageLite implements k0	// class@0017ba
{
    public double latitude_;
    public double longitude_;
    public static final GeoLocation DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       GeoLocation geoLocation = new GeoLocation();
       GeoLocation.DEFAULT_INSTANCE = geoLocation;
       GeneratedMessageLite.registerDefaultInstance(GeoLocation.class, geoLocation);
    }
    public void GeoLocation(){
       super();
    }
    public static GeoLocation getDefaultInstance(){
       return GeoLocation.DEFAULT_INSTANCE;
    }
    public static GeoLocation$b newBuilder(){
       return GeoLocation.DEFAULT_INSTANCE.createBuilder();
    }
    public static GeoLocation$b newBuilder(GeoLocation p0){
       return GeoLocation.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GeoLocation parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static GeoLocation parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static GeoLocation parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static GeoLocation parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static GeoLocation parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static GeoLocation parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0);
    }
    public static GeoLocation parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GeoLocation.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return GeoLocation.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearLatitude(){
       this.latitude_ = 0;
    }
    public void clearLongitude(){
       this.longitude_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (GeoLocation$a.a[p0.ordinal()]){
           case 1:
             return new GeoLocation();
           case 2:
             return new GeoLocation$b(p2);
           case 3:
             Object[] objArray = new Object[]{"longitude_","latitude_"};
             return GeneratedMessageLite.newMessageInfo(GeoLocation.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\xff\x02\xff\x02\x00", objArray);
           case 4:
             return GeoLocation.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = GeoLocation.PARSER;
             if (pARSER == null) {
                _monitor_enter(GeoLocation.class);
                pARSER = GeoLocation.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(GeoLocation.DEFAULT_INSTANCE);
                   GeoLocation.PARSER = pARSER;
                }
                _monitor_exit(GeoLocation.class);
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
    public double getLatitude(){
       return this.latitude_;
    }
    public double getLongitude(){
       return this.longitude_;
    }
    public void setLatitude(double p0){
       this.latitude_ = p0;
    }
    public void setLongitude(double p0){
       this.longitude_ = p0;
    }
}

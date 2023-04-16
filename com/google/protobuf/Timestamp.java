package com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Timestamp$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Timestamp extends GeneratedMessageLite implements TimestampOrBuilder	// class@0004cd
{
    public int nanos_;
    public long seconds_;
    public static final Timestamp DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Timestamp timestamp = new Timestamp();
       Timestamp.DEFAULT_INSTANCE = timestamp;
       GeneratedMessageLite.registerDefaultInstance(Timestamp.class, timestamp);
    }
    public void Timestamp(){
       super();
    }
    public static Timestamp getDefaultInstance(){
       return Timestamp.DEFAULT_INSTANCE;
    }
    public static Timestamp$Builder newBuilder(){
       return Timestamp.DEFAULT_INSTANCE.createBuilder();
    }
    public static Timestamp$Builder newBuilder(Timestamp p0){
       return Timestamp.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Timestamp parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Timestamp parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Timestamp parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Timestamp parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Timestamp parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Timestamp parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0);
    }
    public static Timestamp parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Timestamp.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearNanos(){
       this.nanos_ = 0;
    }
    public void clearSeconds(){
       this.seconds_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Timestamp$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Timestamp();
           case 2:
             return new Timestamp$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"seconds_","nanos_"};
             return GeneratedMessageLite.newMessageInfo(Timestamp.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x04\x00", objArray);
           case 4:
             return Timestamp.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Timestamp.PARSER;
             if (pARSER == null) {
                _monitor_enter(Timestamp.class);
                pARSER = Timestamp.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Timestamp.DEFAULT_INSTANCE);
                   Timestamp.PARSER = pARSER;
                }
                _monitor_exit(Timestamp.class);
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
    public int getNanos(){
       return this.nanos_;
    }
    public long getSeconds(){
       return this.seconds_;
    }
    public void setNanos(int p0){
       this.nanos_ = p0;
    }
    public void setSeconds(long p0){
       this.seconds_ = p0;
    }
}

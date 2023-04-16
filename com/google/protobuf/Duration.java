package com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Duration$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Duration extends GeneratedMessageLite implements DurationOrBuilder	// class@0003f8
{
    public int nanos_;
    public long seconds_;
    public static final Duration DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Duration uDuration = new Duration();
       Duration.DEFAULT_INSTANCE = uDuration;
       GeneratedMessageLite.registerDefaultInstance(Duration.class, uDuration);
    }
    public void Duration(){
       super();
    }
    public static Duration getDefaultInstance(){
       return Duration.DEFAULT_INSTANCE;
    }
    public static Duration$Builder newBuilder(){
       return Duration.DEFAULT_INSTANCE.createBuilder();
    }
    public static Duration$Builder newBuilder(Duration p0){
       return Duration.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Duration parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Duration parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Duration parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Duration parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Duration parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Duration parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0);
    }
    public static Duration parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Duration.DEFAULT_INSTANCE.getParserForType();
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
       switch (Duration$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Duration();
           case 2:
             return new Duration$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"seconds_","nanos_"};
             return GeneratedMessageLite.newMessageInfo(Duration.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x04\x00", objArray);
           case 4:
             return Duration.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Duration.PARSER;
             if (pARSER == null) {
                _monitor_enter(Duration.class);
                pARSER = Duration.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Duration.DEFAULT_INSTANCE);
                   Duration.PARSER = pARSER;
                }
                _monitor_exit(Duration.class);
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

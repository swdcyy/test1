package com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.UInt64Value$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.UInt64Value$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class UInt64Value extends GeneratedMessageLite implements UInt64ValueOrBuilder	// class@0004db
{
    public long value_;
    public static final UInt64Value DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       UInt64Value uInt64Value = new UInt64Value();
       UInt64Value.DEFAULT_INSTANCE = uInt64Value;
       GeneratedMessageLite.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }
    public void UInt64Value(){
       super();
    }
    public static UInt64Value getDefaultInstance(){
       return UInt64Value.DEFAULT_INSTANCE;
    }
    public static UInt64Value$Builder newBuilder(){
       return UInt64Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static UInt64Value$Builder newBuilder(UInt64Value p0){
       return UInt64Value.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static UInt64Value of(long p0){
       return UInt64Value.newBuilder().setValue(p0).build();
    }
    public static UInt64Value parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt64Value parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt64Value parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt64Value parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt64Value parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt64Value parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt64Value parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return UInt64Value.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (UInt64Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new UInt64Value();
           case 2:
             return new UInt64Value$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(UInt64Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x00", objArray);
           case 4:
             return UInt64Value.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = UInt64Value.PARSER;
             if (pARSER == null) {
                _monitor_enter(UInt64Value.class);
                pARSER = UInt64Value.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(UInt64Value.DEFAULT_INSTANCE);
                   UInt64Value.PARSER = pARSER;
                }
                _monitor_exit(UInt64Value.class);
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
    public long getValue(){
       return this.value_;
    }
    public void setValue(long p0){
       this.value_ = p0;
    }
}

package com.google.protobuf.Int64Value;
import com.google.protobuf.Int64ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Int64Value$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Int64Value$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Int64Value extends GeneratedMessageLite implements Int64ValueOrBuilder	// class@000443
{
    public long value_;
    public static final Int64Value DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Int64Value int64Value = new Int64Value();
       Int64Value.DEFAULT_INSTANCE = int64Value;
       GeneratedMessageLite.registerDefaultInstance(Int64Value.class, int64Value);
    }
    public void Int64Value(){
       super();
    }
    public static Int64Value getDefaultInstance(){
       return Int64Value.DEFAULT_INSTANCE;
    }
    public static Int64Value$Builder newBuilder(){
       return Int64Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static Int64Value$Builder newBuilder(Int64Value p0){
       return Int64Value.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Int64Value of(long p0){
       return Int64Value.newBuilder().setValue(p0).build();
    }
    public static Int64Value parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64Value parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64Value parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64Value parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64Value parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64Value parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0);
    }
    public static Int64Value parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Int64Value.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Int64Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Int64Value();
           case 2:
             return new Int64Value$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(Int64Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x00", objArray);
           case 4:
             return Int64Value.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Int64Value.PARSER;
             if (pARSER == null) {
                _monitor_enter(Int64Value.class);
                pARSER = Int64Value.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Int64Value.DEFAULT_INSTANCE);
                   Int64Value.PARSER = pARSER;
                }
                _monitor_exit(Int64Value.class);
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

package com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.UInt32Value$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.UInt32Value$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class UInt32Value extends GeneratedMessageLite implements UInt32ValueOrBuilder	// class@0004d7
{
    public int value_;
    public static final UInt32Value DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       UInt32Value uInt32Value = new UInt32Value();
       UInt32Value.DEFAULT_INSTANCE = uInt32Value;
       GeneratedMessageLite.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }
    public void UInt32Value(){
       super();
    }
    public static UInt32Value getDefaultInstance(){
       return UInt32Value.DEFAULT_INSTANCE;
    }
    public static UInt32Value$Builder newBuilder(){
       return UInt32Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static UInt32Value$Builder newBuilder(UInt32Value p0){
       return UInt32Value.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static UInt32Value of(int p0){
       return UInt32Value.newBuilder().setValue(p0).build();
    }
    public static UInt32Value parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt32Value parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt32Value parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt32Value parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt32Value parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static UInt32Value parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0);
    }
    public static UInt32Value parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return UInt32Value.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (UInt32Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new UInt32Value();
           case 2:
             return new UInt32Value$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(UInt32Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x00", objArray);
           case 4:
             return UInt32Value.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = UInt32Value.PARSER;
             if (pARSER == null) {
                _monitor_enter(UInt32Value.class);
                pARSER = UInt32Value.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(UInt32Value.DEFAULT_INSTANCE);
                   UInt32Value.PARSER = pARSER;
                }
                _monitor_exit(UInt32Value.class);
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
    public int getValue(){
       return this.value_;
    }
    public void setValue(int p0){
       this.value_ = p0;
    }
}

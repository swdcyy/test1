package com.google.protobuf.Int32Value;
import com.google.protobuf.Int32ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Int32Value$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Int32Value$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Int32Value extends GeneratedMessageLite implements Int32ValueOrBuilder	// class@00043f
{
    public int value_;
    public static final Int32Value DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Int32Value int32Value = new Int32Value();
       Int32Value.DEFAULT_INSTANCE = int32Value;
       GeneratedMessageLite.registerDefaultInstance(Int32Value.class, int32Value);
    }
    public void Int32Value(){
       super();
    }
    public static Int32Value getDefaultInstance(){
       return Int32Value.DEFAULT_INSTANCE;
    }
    public static Int32Value$Builder newBuilder(){
       return Int32Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static Int32Value$Builder newBuilder(Int32Value p0){
       return Int32Value.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Int32Value of(int p0){
       return Int32Value.newBuilder().setValue(p0).build();
    }
    public static Int32Value parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int32Value parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int32Value parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int32Value parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int32Value parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int32Value parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0);
    }
    public static Int32Value parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Int32Value.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Int32Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Int32Value();
           case 2:
             return new Int32Value$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(Int32Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x00", objArray);
           case 4:
             return Int32Value.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Int32Value.PARSER;
             if (pARSER == null) {
                _monitor_enter(Int32Value.class);
                pARSER = Int32Value.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Int32Value.DEFAULT_INSTANCE);
                   Int32Value.PARSER = pARSER;
                }
                _monitor_exit(Int32Value.class);
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

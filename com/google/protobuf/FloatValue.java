package com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.FloatValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.FloatValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FloatValue extends GeneratedMessageLite implements FloatValueOrBuilder	// class@00042e
{
    public float value_;
    public static final FloatValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FloatValue uFloatValue = new FloatValue();
       FloatValue.DEFAULT_INSTANCE = uFloatValue;
       GeneratedMessageLite.registerDefaultInstance(FloatValue.class, uFloatValue);
    }
    public void FloatValue(){
       super();
    }
    public static FloatValue getDefaultInstance(){
       return FloatValue.DEFAULT_INSTANCE;
    }
    public static FloatValue$Builder newBuilder(){
       return FloatValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static FloatValue$Builder newBuilder(FloatValue p0){
       return FloatValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FloatValue of(float p0){
       return FloatValue.newBuilder().setValue(p0).build();
    }
    public static FloatValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0);
    }
    public static FloatValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FloatValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FloatValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FloatValue();
           case 2:
             return new FloatValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(FloatValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x00", objArray);
           case 4:
             return FloatValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FloatValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(FloatValue.class);
                pARSER = FloatValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FloatValue.DEFAULT_INSTANCE);
                   FloatValue.PARSER = pARSER;
                }
                _monitor_exit(FloatValue.class);
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
    public float getValue(){
       return this.value_;
    }
    public void setValue(float p0){
       this.value_ = p0;
    }
}

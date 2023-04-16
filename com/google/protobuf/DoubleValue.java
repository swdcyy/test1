package com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.DoubleValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.DoubleValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class DoubleValue extends GeneratedMessageLite implements DoubleValueOrBuilder	// class@0003f4
{
    public double value_;
    public static final DoubleValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       DoubleValue uDoubleValue = new DoubleValue();
       DoubleValue.DEFAULT_INSTANCE = uDoubleValue;
       GeneratedMessageLite.registerDefaultInstance(DoubleValue.class, uDoubleValue);
    }
    public void DoubleValue(){
       super();
    }
    public static DoubleValue getDefaultInstance(){
       return DoubleValue.DEFAULT_INSTANCE;
    }
    public static DoubleValue$Builder newBuilder(){
       return DoubleValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static DoubleValue$Builder newBuilder(DoubleValue p0){
       return DoubleValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DoubleValue of(double p0){
       return DoubleValue.newBuilder().setValue(p0).build();
    }
    public static DoubleValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static DoubleValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static DoubleValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static DoubleValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static DoubleValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static DoubleValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0);
    }
    public static DoubleValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return DoubleValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (DoubleValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new DoubleValue();
           case 2:
             return new DoubleValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(DoubleValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x00", objArray);
           case 4:
             return DoubleValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = DoubleValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(DoubleValue.class);
                pARSER = DoubleValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(DoubleValue.DEFAULT_INSTANCE);
                   DoubleValue.PARSER = pARSER;
                }
                _monitor_exit(DoubleValue.class);
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
    public double getValue(){
       return this.value_;
    }
    public void setValue(double p0){
       this.value_ = p0;
    }
}

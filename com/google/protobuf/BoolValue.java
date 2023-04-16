package com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.BoolValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.BoolValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class BoolValue extends GeneratedMessageLite implements BoolValueOrBuilder	// class@0003c3
{
    public boolean value_;
    public static final BoolValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BoolValue uBoolValue = new BoolValue();
       BoolValue.DEFAULT_INSTANCE = uBoolValue;
       GeneratedMessageLite.registerDefaultInstance(BoolValue.class, uBoolValue);
    }
    public void BoolValue(){
       super();
    }
    public static BoolValue getDefaultInstance(){
       return BoolValue.DEFAULT_INSTANCE;
    }
    public static BoolValue$Builder newBuilder(){
       return BoolValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static BoolValue$Builder newBuilder(BoolValue p0){
       return BoolValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BoolValue of(boolean p0){
       return BoolValue.newBuilder().setValue(p0).build();
    }
    public static BoolValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BoolValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BoolValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BoolValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BoolValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static BoolValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static BoolValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BoolValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       this.value_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BoolValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new BoolValue();
           case 2:
             return new BoolValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(BoolValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x00", objArray);
           case 4:
             return BoolValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BoolValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(BoolValue.class);
                pARSER = BoolValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BoolValue.DEFAULT_INSTANCE);
                   BoolValue.PARSER = pARSER;
                }
                _monitor_exit(BoolValue.class);
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
    public boolean getValue(){
       return this.value_;
    }
    public void setValue(boolean p0){
       this.value_ = p0;
    }
}

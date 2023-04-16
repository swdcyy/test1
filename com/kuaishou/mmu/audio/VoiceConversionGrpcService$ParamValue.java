package com.kuaishou.mmu.audio.VoiceConversionGrpcService$ParamValue;
import fn4.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$ParamValue$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import fn4.c;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class VoiceConversionGrpcService$ParamValue extends GeneratedMessageLite implements d	// class@0009f8
{
    public float floatVal_;
    public int int32Val_;
    public String strVal_;
    public static final VoiceConversionGrpcService$ParamValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       VoiceConversionGrpcService$ParamValue paramValue = new VoiceConversionGrpcService$ParamValue();
       VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE = paramValue;
       GeneratedMessageLite.registerDefaultInstance(VoiceConversionGrpcService$ParamValue.class, paramValue);
    }
    public void VoiceConversionGrpcService$ParamValue(){
       super();
       this.strVal_ = "";
    }
    public static VoiceConversionGrpcService$ParamValue getDefaultInstance(){
       return VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE;
    }
    public static VoiceConversionGrpcService$ParamValue$a newBuilder(){
       return VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static VoiceConversionGrpcService$ParamValue$a newBuilder(VoiceConversionGrpcService$ParamValue p0){
       return VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$ParamValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFloatVal(){
       this.floatVal_ = 0;
    }
    public void clearInt32Val(){
       this.int32Val_ = 0;
    }
    public void clearStrVal(){
       this.strVal_ = VoiceConversionGrpcService$ParamValue.getDefaultInstance().getStrVal();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (c.a[p0.ordinal()]){
           case 1:
             return new VoiceConversionGrpcService$ParamValue();
           case 2:
             return new VoiceConversionGrpcService$ParamValue$a(p2);
           case 3:
             Object[] objArray = new Object[]{"int32Val_","strVal_","floatVal_"};
             return GeneratedMessageLite.newMessageInfo(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02\x03\x01\x00", objArray);
           case 4:
             return VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = VoiceConversionGrpcService$ParamValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(VoiceConversionGrpcService$ParamValue.class);
                pARSER = VoiceConversionGrpcService$ParamValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(VoiceConversionGrpcService$ParamValue.DEFAULT_INSTANCE);
                   VoiceConversionGrpcService$ParamValue.PARSER = pARSER;
                }
                _monitor_exit(VoiceConversionGrpcService$ParamValue.class);
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
    public float getFloatVal(){
       return this.floatVal_;
    }
    public int getInt32Val(){
       return this.int32Val_;
    }
    public String getStrVal(){
       return this.strVal_;
    }
    public ByteString getStrValBytes(){
       return ByteString.copyFromUtf8(this.strVal_);
    }
    public void setFloatVal(float p0){
       this.floatVal_ = p0;
    }
    public void setInt32Val(int p0){
       this.int32Val_ = p0;
    }
    public void setStrVal(String p0){
       Objects.requireNonNull(p0);
       this.strVal_ = p0;
    }
    public void setStrValBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.strVal_ = p0.toStringUtf8();
    }
}

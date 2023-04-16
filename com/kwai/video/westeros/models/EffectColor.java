package com.kwai.video.westeros.models.EffectColor;
import com.kwai.video.westeros.models.EffectColorOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectColor$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectColor$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class EffectColor extends GeneratedMessageLite implements EffectColorOrBuilder	// class@000f00
{
    public float a_;
    public float b_;
    public float g_;
    public float r_;
    public static final EffectColor DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectColor uEffectColor = new EffectColor();
       EffectColor.DEFAULT_INSTANCE = uEffectColor;
       GeneratedMessageLite.registerDefaultInstance(EffectColor.class, uEffectColor);
    }
    public void EffectColor(){
       super();
    }
    public static EffectColor getDefaultInstance(){
       return EffectColor.DEFAULT_INSTANCE;
    }
    public static EffectColor$Builder newBuilder(){
       return EffectColor.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectColor$Builder newBuilder(EffectColor p0){
       return EffectColor.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectColor parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectColor parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectColor parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectColor parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectColor parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectColor parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0);
    }
    public static EffectColor parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectColor.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearA(){
       this.a_ = 0;
    }
    public void clearB(){
       this.b_ = 0;
    }
    public void clearG(){
       this.g_ = 0;
    }
    public void clearR(){
       this.r_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectColor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectColor();
           case 2:
             return new EffectColor$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"r_","g_","b_","a_"};
             return GeneratedMessageLite.newMessageInfo(EffectColor.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return EffectColor.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectColor.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectColor.class);
                pARSER = EffectColor.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectColor.DEFAULT_INSTANCE);
                   EffectColor.PARSER = pARSER;
                }
                _monitor_exit(EffectColor.class);
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
    public float getA(){
       return this.a_;
    }
    public float getB(){
       return this.b_;
    }
    public float getG(){
       return this.g_;
    }
    public float getR(){
       return this.r_;
    }
    public void setA(float p0){
       this.a_ = p0;
    }
    public void setB(float p0){
       this.b_ = p0;
    }
    public void setG(float p0){
       this.g_ = p0;
    }
    public void setR(float p0){
       this.r_ = p0;
    }
}

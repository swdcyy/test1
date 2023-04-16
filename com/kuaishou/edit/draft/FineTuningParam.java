package com.kuaishou.edit.draft.FineTuningParam;
import z30.h0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FineTuningParam$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.FineTuningParam$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FineTuningParam extends GeneratedMessageLite implements h0	// class@0017a5
{
    public float brightness_;
    public float clarity_;
    public float colorTemperature_;
    public float contrast_;
    public float saturation_;
    public float sharpen_;
    public static final FineTuningParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FineTuningParam uFineTuningP = new FineTuningParam();
       FineTuningParam.DEFAULT_INSTANCE = uFineTuningP;
       GeneratedMessageLite.registerDefaultInstance(FineTuningParam.class, uFineTuningP);
    }
    public void FineTuningParam(){
       super();
    }
    public static FineTuningParam getDefaultInstance(){
       return FineTuningParam.DEFAULT_INSTANCE;
    }
    public static FineTuningParam$b newBuilder(){
       return FineTuningParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static FineTuningParam$b newBuilder(FineTuningParam p0){
       return FineTuningParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FineTuningParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static FineTuningParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static FineTuningParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static FineTuningParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static FineTuningParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static FineTuningParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0);
    }
    public static FineTuningParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FineTuningParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FineTuningParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBrightness(){
       this.brightness_ = 0;
    }
    public void clearClarity(){
       this.clarity_ = 0;
    }
    public void clearColorTemperature(){
       this.colorTemperature_ = 0;
    }
    public void clearContrast(){
       this.contrast_ = 0;
    }
    public void clearSaturation(){
       this.saturation_ = 0;
    }
    public void clearSharpen(){
       this.sharpen_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FineTuningParam$a.a[p0.ordinal()]){
           case 1:
             return new FineTuningParam();
           case 2:
             return new FineTuningParam$b(p2);
           case 3:
             Object[] objArray = new Object[]{"brightness_","contrast_","saturation_","sharpen_","colorTemperature_","clarity_"};
             return GeneratedMessageLite.newMessageInfo(FineTuningParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x05\x01\x06\x01\x00", objArray);
           case 4:
             return FineTuningParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FineTuningParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(FineTuningParam.class);
                pARSER = FineTuningParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FineTuningParam.DEFAULT_INSTANCE);
                   FineTuningParam.PARSER = pARSER;
                }
                _monitor_exit(FineTuningParam.class);
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
    public float getBrightness(){
       return this.brightness_;
    }
    public float getClarity(){
       return this.clarity_;
    }
    public float getColorTemperature(){
       return this.colorTemperature_;
    }
    public float getContrast(){
       return this.contrast_;
    }
    public float getSaturation(){
       return this.saturation_;
    }
    public float getSharpen(){
       return this.sharpen_;
    }
    public void setBrightness(float p0){
       this.brightness_ = p0;
    }
    public void setClarity(float p0){
       this.clarity_ = p0;
    }
    public void setColorTemperature(float p0){
       this.colorTemperature_ = p0;
    }
    public void setContrast(float p0){
       this.contrast_ = p0;
    }
    public void setSaturation(float p0){
       this.saturation_ = p0;
    }
    public void setSharpen(float p0){
       this.sharpen_ = p0;
    }
}

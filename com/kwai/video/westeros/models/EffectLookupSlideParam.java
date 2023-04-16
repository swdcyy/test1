package com.kwai.video.westeros.models.EffectLookupSlideParam;
import com.kwai.video.westeros.models.EffectLookupSlideParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectLookupSlideParam$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectLookupSlideParam$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class EffectLookupSlideParam extends GeneratedMessageLite implements EffectLookupSlideParamOrBuilder	// class@000f2f
{
    public boolean endWithNewEffect_;
    public float newEffectDisplayLeft_;
    public float newEffectDisplayRight_;
    public static final EffectLookupSlideParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectLookupSlideParam uEffectLooku = new EffectLookupSlideParam();
       EffectLookupSlideParam.DEFAULT_INSTANCE = uEffectLooku;
       GeneratedMessageLite.registerDefaultInstance(EffectLookupSlideParam.class, uEffectLooku);
    }
    public void EffectLookupSlideParam(){
       super();
    }
    public static EffectLookupSlideParam getDefaultInstance(){
       return EffectLookupSlideParam.DEFAULT_INSTANCE;
    }
    public static EffectLookupSlideParam$Builder newBuilder(){
       return EffectLookupSlideParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectLookupSlideParam$Builder newBuilder(EffectLookupSlideParam p0){
       return EffectLookupSlideParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectLookupSlideParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupSlideParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupSlideParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupSlideParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupSlideParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectLookupSlideParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0);
    }
    public static EffectLookupSlideParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectLookupSlideParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectLookupSlideParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEndWithNewEffect(){
       this.endWithNewEffect_ = false;
    }
    public void clearNewEffectDisplayLeft(){
       this.newEffectDisplayLeft_ = 0;
    }
    public void clearNewEffectDisplayRight(){
       this.newEffectDisplayRight_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectLookupSlideParam$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectLookupSlideParam();
           case 2:
             return new EffectLookupSlideParam$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"newEffectDisplayLeft_","newEffectDisplayRight_","endWithNewEffect_"};
             return GeneratedMessageLite.newMessageInfo(EffectLookupSlideParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x07\x00", objArray);
           case 4:
             return EffectLookupSlideParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectLookupSlideParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectLookupSlideParam.class);
                pARSER = EffectLookupSlideParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectLookupSlideParam.DEFAULT_INSTANCE);
                   EffectLookupSlideParam.PARSER = pARSER;
                }
                _monitor_exit(EffectLookupSlideParam.class);
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
    public boolean getEndWithNewEffect(){
       return this.endWithNewEffect_;
    }
    public float getNewEffectDisplayLeft(){
       return this.newEffectDisplayLeft_;
    }
    public float getNewEffectDisplayRight(){
       return this.newEffectDisplayRight_;
    }
    public void setEndWithNewEffect(boolean p0){
       this.endWithNewEffect_ = p0;
    }
    public void setNewEffectDisplayLeft(float p0){
       this.newEffectDisplayLeft_ = p0;
    }
    public void setNewEffectDisplayRight(float p0){
       this.newEffectDisplayRight_ = p0;
    }
}

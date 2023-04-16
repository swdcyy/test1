package com.kwai.video.westeros.models.VEFeatureParams;
import com.kwai.video.westeros.models.VEFeatureParamsOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.VEFeatureParams$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.VEFeatureParams$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class VEFeatureParams extends GeneratedMessageLite implements VEFeatureParamsOrBuilder	// class@001082
{
    public int framePts_;
    public float indensity_;
    public int intervalMs_;
    public static final VEFeatureParams DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       VEFeatureParams vEFeaturePar = new VEFeatureParams();
       VEFeatureParams.DEFAULT_INSTANCE = vEFeaturePar;
       GeneratedMessageLite.registerDefaultInstance(VEFeatureParams.class, vEFeaturePar);
    }
    public void VEFeatureParams(){
       super();
    }
    public static VEFeatureParams getDefaultInstance(){
       return VEFeatureParams.DEFAULT_INSTANCE;
    }
    public static VEFeatureParams$Builder newBuilder(){
       return VEFeatureParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static VEFeatureParams$Builder newBuilder(VEFeatureParams p0){
       return VEFeatureParams.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static VEFeatureParams parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static VEFeatureParams parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static VEFeatureParams parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static VEFeatureParams parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static VEFeatureParams parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static VEFeatureParams parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static VEFeatureParams parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VEFeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return VEFeatureParams.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFramePts(){
       this.framePts_ = 0;
    }
    public void clearIndensity(){
       this.indensity_ = 0;
    }
    public void clearIntervalMs(){
       this.intervalMs_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (VEFeatureParams$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new VEFeatureParams();
           case 2:
             return new VEFeatureParams$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"indensity_","intervalMs_","framePts_"};
             return GeneratedMessageLite.newMessageInfo(VEFeatureParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x04\x03\x04\x00", objArray);
           case 4:
             return VEFeatureParams.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = VEFeatureParams.PARSER;
             if (pARSER == null) {
                _monitor_enter(VEFeatureParams.class);
                pARSER = VEFeatureParams.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(VEFeatureParams.DEFAULT_INSTANCE);
                   VEFeatureParams.PARSER = pARSER;
                }
                _monitor_exit(VEFeatureParams.class);
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
    public int getFramePts(){
       return this.framePts_;
    }
    public float getIndensity(){
       return this.indensity_;
    }
    public int getIntervalMs(){
       return this.intervalMs_;
    }
    public void setFramePts(int p0){
       this.framePts_ = p0;
    }
    public void setIndensity(float p0){
       this.indensity_ = p0;
    }
    public void setIntervalMs(int p0){
       this.intervalMs_ = p0;
    }
}

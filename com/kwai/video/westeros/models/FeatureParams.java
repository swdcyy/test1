package com.kwai.video.westeros.models.FeatureParams;
import com.kwai.video.westeros.models.FeatureParamsOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.FeatureParams$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.FeatureParams$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class FeatureParams extends GeneratedMessageLite implements FeatureParamsOrBuilder	// class@000f6e
{
    public float bsgContrastIndensity_;
    public float bsgSharpIndensity_;
    public int guidedfilterDetectPeriod_;
    public float guidedfilterIsoIndensity_;
    public float guidedfilterSharpIndensity_;
    public float lrfIndensity_;
    public float newDenoiseIntensity_;
    public float newDenoiseIsoThreshold_;
    public float saturationAdjustIndensity_;
    public float sharpenClipRange_;
    public boolean sharpenEnableProcessTakePictureFrame_;
    public float sharpenIndensity_;
    public float sharpenRadius_;
    public float sharpenThreshold_;
    public float whileBalanceIndensity_;
    public static final FeatureParams DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FeatureParams uFeaturePara = new FeatureParams();
       FeatureParams.DEFAULT_INSTANCE = uFeaturePara;
       GeneratedMessageLite.registerDefaultInstance(FeatureParams.class, uFeaturePara);
    }
    public void FeatureParams(){
       super();
    }
    public static FeatureParams getDefaultInstance(){
       return FeatureParams.DEFAULT_INSTANCE;
    }
    public static FeatureParams$Builder newBuilder(){
       return FeatureParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static FeatureParams$Builder newBuilder(FeatureParams p0){
       return FeatureParams.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FeatureParams parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureParams parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureParams parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureParams parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureParams parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static FeatureParams parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0);
    }
    public static FeatureParams parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FeatureParams.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FeatureParams.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBsgContrastIndensity(){
       this.bsgContrastIndensity_ = 0;
    }
    public void clearBsgSharpIndensity(){
       this.bsgSharpIndensity_ = 0;
    }
    public void clearGuidedfilterDetectPeriod(){
       this.guidedfilterDetectPeriod_ = 0;
    }
    public void clearGuidedfilterIsoIndensity(){
       this.guidedfilterIsoIndensity_ = 0;
    }
    public void clearGuidedfilterSharpIndensity(){
       this.guidedfilterSharpIndensity_ = 0;
    }
    public void clearLrfIndensity(){
       this.lrfIndensity_ = 0;
    }
    public void clearNewDenoiseIntensity(){
       this.newDenoiseIntensity_ = 0;
    }
    public void clearNewDenoiseIsoThreshold(){
       this.newDenoiseIsoThreshold_ = 0;
    }
    public void clearSaturationAdjustIndensity(){
       this.saturationAdjustIndensity_ = 0;
    }
    public void clearSharpenClipRange(){
       this.sharpenClipRange_ = 0;
    }
    public void clearSharpenEnableProcessTakePictureFrame(){
       this.sharpenEnableProcessTakePictureFrame_ = false;
    }
    public void clearSharpenIndensity(){
       this.sharpenIndensity_ = 0;
    }
    public void clearSharpenRadius(){
       this.sharpenRadius_ = 0;
    }
    public void clearSharpenThreshold(){
       this.sharpenThreshold_ = 0;
    }
    public void clearWhileBalanceIndensity(){
       this.whileBalanceIndensity_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FeatureParams$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new FeatureParams();
           case 2:
             return new FeatureParams$Builder(p2);
           case 3:
             Object[] objArray = new Object[15];
             objArray[0] = "whileBalanceIndensity_";
             objArray[i] = "lrfIndensity_";
             objArray[2] = "bsgSharpIndensity_";
             objArray[3] = "bsgContrastIndensity_";
             objArray[4] = "saturationAdjustIndensity_";
             objArray[5] = "sharpenRadius_";
             objArray[6] = "sharpenIndensity_";
             objArray[7] = "sharpenThreshold_";
             objArray[8] = "sharpenClipRange_";
             objArray[9] = "sharpenEnableProcessTakePictureFrame_";
             objArray[10] = "guidedfilterSharpIndensity_";
             objArray[11] = "guidedfilterIsoIndensity_";
             objArray[12] = "guidedfilterDetectPeriod_";
             objArray[13] = "newDenoiseIntensity_";
             objArray[14] = "newDenoiseIsoThreshold_";
             return GeneratedMessageLite.newMessageInfo(FeatureParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0f\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x0f\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x03\x01\x04\x01\x05\x01\x06\x01\x07\x01\b\x01\t\x01\n\x01\x0b\x07\f\x01\r\x01\x0e\x04\x0f\x01\x10\x01\x00", objArray);
           case 4:
             return FeatureParams.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FeatureParams.PARSER;
             if (pARSER == null) {
                _monitor_enter(FeatureParams.class);
                pARSER = FeatureParams.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FeatureParams.DEFAULT_INSTANCE);
                   FeatureParams.PARSER = pARSER;
                }
                _monitor_exit(FeatureParams.class);
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
    public float getBsgContrastIndensity(){
       return this.bsgContrastIndensity_;
    }
    public float getBsgSharpIndensity(){
       return this.bsgSharpIndensity_;
    }
    public int getGuidedfilterDetectPeriod(){
       return this.guidedfilterDetectPeriod_;
    }
    public float getGuidedfilterIsoIndensity(){
       return this.guidedfilterIsoIndensity_;
    }
    public float getGuidedfilterSharpIndensity(){
       return this.guidedfilterSharpIndensity_;
    }
    public float getLrfIndensity(){
       return this.lrfIndensity_;
    }
    public float getNewDenoiseIntensity(){
       return this.newDenoiseIntensity_;
    }
    public float getNewDenoiseIsoThreshold(){
       return this.newDenoiseIsoThreshold_;
    }
    public float getSaturationAdjustIndensity(){
       return this.saturationAdjustIndensity_;
    }
    public float getSharpenClipRange(){
       return this.sharpenClipRange_;
    }
    public boolean getSharpenEnableProcessTakePictureFrame(){
       return this.sharpenEnableProcessTakePictureFrame_;
    }
    public float getSharpenIndensity(){
       return this.sharpenIndensity_;
    }
    public float getSharpenRadius(){
       return this.sharpenRadius_;
    }
    public float getSharpenThreshold(){
       return this.sharpenThreshold_;
    }
    public float getWhileBalanceIndensity(){
       return this.whileBalanceIndensity_;
    }
    public void setBsgContrastIndensity(float p0){
       this.bsgContrastIndensity_ = p0;
    }
    public void setBsgSharpIndensity(float p0){
       this.bsgSharpIndensity_ = p0;
    }
    public void setGuidedfilterDetectPeriod(int p0){
       this.guidedfilterDetectPeriod_ = p0;
    }
    public void setGuidedfilterIsoIndensity(float p0){
       this.guidedfilterIsoIndensity_ = p0;
    }
    public void setGuidedfilterSharpIndensity(float p0){
       this.guidedfilterSharpIndensity_ = p0;
    }
    public void setLrfIndensity(float p0){
       this.lrfIndensity_ = p0;
    }
    public void setNewDenoiseIntensity(float p0){
       this.newDenoiseIntensity_ = p0;
    }
    public void setNewDenoiseIsoThreshold(float p0){
       this.newDenoiseIsoThreshold_ = p0;
    }
    public void setSaturationAdjustIndensity(float p0){
       this.saturationAdjustIndensity_ = p0;
    }
    public void setSharpenClipRange(float p0){
       this.sharpenClipRange_ = p0;
    }
    public void setSharpenEnableProcessTakePictureFrame(boolean p0){
       this.sharpenEnableProcessTakePictureFrame_ = p0;
    }
    public void setSharpenIndensity(float p0){
       this.sharpenIndensity_ = p0;
    }
    public void setSharpenRadius(float p0){
       this.sharpenRadius_ = p0;
    }
    public void setSharpenThreshold(float p0){
       this.sharpenThreshold_ = p0;
    }
    public void setWhileBalanceIndensity(float p0){
       this.whileBalanceIndensity_ = p0;
    }
}

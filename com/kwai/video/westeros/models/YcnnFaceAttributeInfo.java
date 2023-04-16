package com.kwai.video.westeros.models.YcnnFaceAttributeInfo;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$FloatList;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class YcnnFaceAttributeInfo extends GeneratedMessageLite implements YcnnFaceAttributeInfoOrBuilder	// class@0010a6
{
    public float ageConf_;
    public float age_;
    public float beauty_;
    public float eyelidLeftConf_;
    public int eyelidLeft_;
    public float eyelidRightConf_;
    public int eyelidRight_;
    public int faceid_;
    public int featureMemoizedSerializedSize;
    public Internal$FloatList feature_;
    public float gender_;
    public int index_;
    public float skinSmooth_;
    public static final YcnnFaceAttributeInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YcnnFaceAttributeInfo ycnnFaceAttr = new YcnnFaceAttributeInfo();
       YcnnFaceAttributeInfo.DEFAULT_INSTANCE = ycnnFaceAttr;
       GeneratedMessageLite.registerDefaultInstance(YcnnFaceAttributeInfo.class, ycnnFaceAttr);
    }
    public void YcnnFaceAttributeInfo(){
       super();
       this.featureMemoizedSerializedSize = -1;
       this.feature_ = GeneratedMessageLite.emptyFloatList();
    }
    public static YcnnFaceAttributeInfo getDefaultInstance(){
       return YcnnFaceAttributeInfo.DEFAULT_INSTANCE;
    }
    public static YcnnFaceAttributeInfo$Builder newBuilder(){
       return YcnnFaceAttributeInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static YcnnFaceAttributeInfo$Builder newBuilder(YcnnFaceAttributeInfo p0){
       return YcnnFaceAttributeInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YcnnFaceAttributeInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static YcnnFaceAttributeInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0);
    }
    public static YcnnFaceAttributeInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YcnnFaceAttributeInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFeature(Iterable p0){
       this.ensureFeatureIsMutable();
       AbstractMessageLite.addAll(p0, this.feature_);
    }
    public void addFeature(float p0){
       this.ensureFeatureIsMutable();
       this.feature_.addFloat(p0);
    }
    public void clearAge(){
       this.age_ = 0;
    }
    public void clearAgeConf(){
       this.ageConf_ = 0;
    }
    public void clearBeauty(){
       this.beauty_ = 0;
    }
    public void clearEyelidLeft(){
       this.eyelidLeft_ = 0;
    }
    public void clearEyelidLeftConf(){
       this.eyelidLeftConf_ = 0;
    }
    public void clearEyelidRight(){
       this.eyelidRight_ = 0;
    }
    public void clearEyelidRightConf(){
       this.eyelidRightConf_ = 0;
    }
    public void clearFaceid(){
       this.faceid_ = 0;
    }
    public void clearFeature(){
       this.feature_ = GeneratedMessageLite.emptyFloatList();
    }
    public void clearGender(){
       this.gender_ = 0;
    }
    public void clearIndex(){
       this.index_ = 0;
    }
    public void clearSkinSmooth(){
       this.skinSmooth_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YcnnFaceAttributeInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YcnnFaceAttributeInfo();
           case 2:
             return new YcnnFaceAttributeInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[12];
             objArray[0] = "index_";
             objArray[i] = "age_";
             objArray[2] = "ageConf_";
             objArray[3] = "eyelidLeft_";
             objArray[4] = "eyelidRight_";
             objArray[5] = "eyelidLeftConf_";
             objArray[6] = "eyelidRightConf_";
             objArray[7] = "faceid_";
             objArray[8] = "gender_";
             objArray[9] = "feature_";
             objArray[10] = "beauty_";
             objArray[11] = "skinSmooth_";
             return GeneratedMessageLite.newMessageInfo(YcnnFaceAttributeInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\f\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\f\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x04\x02\x01\x03\x01\x04\x04\x05\x04\x06\x01\x07\x01\b\x04\t\x01\n$\x0b\x01\f\x01\x00", objArray);
           case 4:
             return YcnnFaceAttributeInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YcnnFaceAttributeInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(YcnnFaceAttributeInfo.class);
                pARSER = YcnnFaceAttributeInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YcnnFaceAttributeInfo.DEFAULT_INSTANCE);
                   YcnnFaceAttributeInfo.PARSER = pARSER;
                }
                _monitor_exit(YcnnFaceAttributeInfo.class);
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
    public final void ensureFeatureIsMutable(){
       if (!this.feature_.isModifiable()) {
          this.feature_ = GeneratedMessageLite.mutableCopy(this.feature_);
       }
       return;
    }
    public float getAge(){
       return this.age_;
    }
    public float getAgeConf(){
       return this.ageConf_;
    }
    public float getBeauty(){
       return this.beauty_;
    }
    public int getEyelidLeft(){
       return this.eyelidLeft_;
    }
    public float getEyelidLeftConf(){
       return this.eyelidLeftConf_;
    }
    public int getEyelidRight(){
       return this.eyelidRight_;
    }
    public float getEyelidRightConf(){
       return this.eyelidRightConf_;
    }
    public int getFaceid(){
       return this.faceid_;
    }
    public float getFeature(int p0){
       return this.feature_.getFloat(p0);
    }
    public int getFeatureCount(){
       return this.feature_.size();
    }
    public List getFeatureList(){
       return this.feature_;
    }
    public float getGender(){
       return this.gender_;
    }
    public int getIndex(){
       return this.index_;
    }
    public float getSkinSmooth(){
       return this.skinSmooth_;
    }
    public void setAge(float p0){
       this.age_ = p0;
    }
    public void setAgeConf(float p0){
       this.ageConf_ = p0;
    }
    public void setBeauty(float p0){
       this.beauty_ = p0;
    }
    public void setEyelidLeft(int p0){
       this.eyelidLeft_ = p0;
    }
    public void setEyelidLeftConf(float p0){
       this.eyelidLeftConf_ = p0;
    }
    public void setEyelidRight(int p0){
       this.eyelidRight_ = p0;
    }
    public void setEyelidRightConf(float p0){
       this.eyelidRightConf_ = p0;
    }
    public void setFaceid(int p0){
       this.faceid_ = p0;
    }
    public void setFeature(int p0,float p1){
       this.ensureFeatureIsMutable();
       this.feature_.setFloat(p0, p1);
    }
    public void setGender(float p0){
       this.gender_ = p0;
    }
    public void setIndex(int p0){
       this.index_ = p0;
    }
    public void setSkinSmooth(float p0){
       this.skinSmooth_ = p0;
    }
}

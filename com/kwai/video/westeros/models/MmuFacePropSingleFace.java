package com.kwai.video.westeros.models.MmuFacePropSingleFace;
import com.kwai.video.westeros.models.MmuFacePropSingleFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MmuFacePropSingleFace$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFacePropSingleFace$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class MmuFacePropSingleFace extends GeneratedMessageLite implements MmuFacePropSingleFaceOrBuilder	// class@000fcb
{
    public float age_;
    public float beautyPred_;
    public float beauty_;
    public float gender_;
    public float glass_;
    public float smile_;
    public static final MmuFacePropSingleFace DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFacePropSingleFace mmuFacePropS = new MmuFacePropSingleFace();
       MmuFacePropSingleFace.DEFAULT_INSTANCE = mmuFacePropS;
       GeneratedMessageLite.registerDefaultInstance(MmuFacePropSingleFace.class, mmuFacePropS);
    }
    public void MmuFacePropSingleFace(){
       super();
    }
    public static MmuFacePropSingleFace getDefaultInstance(){
       return MmuFacePropSingleFace.DEFAULT_INSTANCE;
    }
    public static MmuFacePropSingleFace$Builder newBuilder(){
       return MmuFacePropSingleFace.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFacePropSingleFace$Builder newBuilder(MmuFacePropSingleFace p0){
       return MmuFacePropSingleFace.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFacePropSingleFace parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropSingleFace parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropSingleFace parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropSingleFace parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropSingleFace parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropSingleFace parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropSingleFace parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFacePropSingleFace.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAge(){
       this.age_ = 0;
    }
    public void clearBeauty(){
       this.beauty_ = 0;
    }
    public void clearBeautyPred(){
       this.beautyPred_ = 0;
    }
    public void clearGender(){
       this.gender_ = 0;
    }
    public void clearGlass(){
       this.glass_ = 0;
    }
    public void clearSmile(){
       this.smile_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuFacePropSingleFace$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFacePropSingleFace();
           case 2:
             return new MmuFacePropSingleFace$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"age_","glass_","smile_","beauty_","gender_","beautyPred_"};
             return GeneratedMessageLite.newMessageInfo(MmuFacePropSingleFace.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x05\x01\x06\x01\x00", objArray);
           case 4:
             return MmuFacePropSingleFace.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFacePropSingleFace.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFacePropSingleFace.class);
                pARSER = MmuFacePropSingleFace.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFacePropSingleFace.DEFAULT_INSTANCE);
                   MmuFacePropSingleFace.PARSER = pARSER;
                }
                _monitor_exit(MmuFacePropSingleFace.class);
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
    public float getAge(){
       return this.age_;
    }
    public float getBeauty(){
       return this.beauty_;
    }
    public float getBeautyPred(){
       return this.beautyPred_;
    }
    public float getGender(){
       return this.gender_;
    }
    public float getGlass(){
       return this.glass_;
    }
    public float getSmile(){
       return this.smile_;
    }
    public void setAge(float p0){
       this.age_ = p0;
    }
    public void setBeauty(float p0){
       this.beauty_ = p0;
    }
    public void setBeautyPred(float p0){
       this.beautyPred_ = p0;
    }
    public void setGender(float p0){
       this.gender_ = p0;
    }
    public void setGlass(float p0){
       this.glass_ = p0;
    }
    public void setSmile(float p0){
       this.smile_ = p0;
    }
}

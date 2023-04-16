package com.kwai.video.westeros.models.MmuFacePropConfig;
import com.kwai.video.westeros.models.MmuFacePropConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MmuFacePropConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFacePropConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class MmuFacePropConfig extends GeneratedMessageLite implements MmuFacePropConfigOrBuilder	// class@000fc3
{
    public boolean needAge_;
    public boolean needBeauty_;
    public boolean needGender_;
    public boolean needGlass_;
    public boolean needSmile_;
    public static final MmuFacePropConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFacePropConfig mmuFacePropC = new MmuFacePropConfig();
       MmuFacePropConfig.DEFAULT_INSTANCE = mmuFacePropC;
       GeneratedMessageLite.registerDefaultInstance(MmuFacePropConfig.class, mmuFacePropC);
    }
    public void MmuFacePropConfig(){
       super();
    }
    public static MmuFacePropConfig getDefaultInstance(){
       return MmuFacePropConfig.DEFAULT_INSTANCE;
    }
    public static MmuFacePropConfig$Builder newBuilder(){
       return MmuFacePropConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFacePropConfig$Builder newBuilder(MmuFacePropConfig p0){
       return MmuFacePropConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFacePropConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFacePropConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0);
    }
    public static MmuFacePropConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFacePropConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFacePropConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearNeedAge(){
       this.needAge_ = false;
    }
    public void clearNeedBeauty(){
       this.needBeauty_ = false;
    }
    public void clearNeedGender(){
       this.needGender_ = false;
    }
    public void clearNeedGlass(){
       this.needGlass_ = false;
    }
    public void clearNeedSmile(){
       this.needSmile_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuFacePropConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFacePropConfig();
           case 2:
             return new MmuFacePropConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"needAge_","needGlass_","needSmile_","needBeauty_","needGender_"};
             return GeneratedMessageLite.newMessageInfo(MmuFacePropConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x07\x05\x07\x00", objArray);
           case 4:
             return MmuFacePropConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFacePropConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFacePropConfig.class);
                pARSER = MmuFacePropConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFacePropConfig.DEFAULT_INSTANCE);
                   MmuFacePropConfig.PARSER = pARSER;
                }
                _monitor_exit(MmuFacePropConfig.class);
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
    public boolean getNeedAge(){
       return this.needAge_;
    }
    public boolean getNeedBeauty(){
       return this.needBeauty_;
    }
    public boolean getNeedGender(){
       return this.needGender_;
    }
    public boolean getNeedGlass(){
       return this.needGlass_;
    }
    public boolean getNeedSmile(){
       return this.needSmile_;
    }
    public void setNeedAge(boolean p0){
       this.needAge_ = p0;
    }
    public void setNeedBeauty(boolean p0){
       this.needBeauty_ = p0;
    }
    public void setNeedGender(boolean p0){
       this.needGender_ = p0;
    }
    public void setNeedGlass(boolean p0){
       this.needGlass_ = p0;
    }
    public void setNeedSmile(boolean p0){
       this.needSmile_ = p0;
    }
}

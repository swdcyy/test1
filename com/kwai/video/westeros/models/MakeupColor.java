package com.kwai.video.westeros.models.MakeupColor;
import com.kwai.video.westeros.models.MakeupColorOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MakeupColor$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MakeupColor$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class MakeupColor extends GeneratedMessageLite implements MakeupColorOrBuilder	// class@000f9f
{
    public float colorA_;
    public float colorB_;
    public float colorG_;
    public float colorR_;
    public static final MakeupColor DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MakeupColor makeupColor = new MakeupColor();
       MakeupColor.DEFAULT_INSTANCE = makeupColor;
       GeneratedMessageLite.registerDefaultInstance(MakeupColor.class, makeupColor);
    }
    public void MakeupColor(){
       super();
    }
    public static MakeupColor getDefaultInstance(){
       return MakeupColor.DEFAULT_INSTANCE;
    }
    public static MakeupColor$Builder newBuilder(){
       return MakeupColor.DEFAULT_INSTANCE.createBuilder();
    }
    public static MakeupColor$Builder newBuilder(MakeupColor p0){
       return MakeupColor.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MakeupColor parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupColor parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupColor parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupColor parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupColor parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupColor parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0);
    }
    public static MakeupColor parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupColor.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MakeupColor.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearColorA(){
       this.colorA_ = 0;
    }
    public void clearColorB(){
       this.colorB_ = 0;
    }
    public void clearColorG(){
       this.colorG_ = 0;
    }
    public void clearColorR(){
       this.colorR_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MakeupColor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MakeupColor();
           case 2:
             return new MakeupColor$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"colorR_","colorG_","colorB_","colorA_"};
             return GeneratedMessageLite.newMessageInfo(MakeupColor.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return MakeupColor.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MakeupColor.PARSER;
             if (pARSER == null) {
                _monitor_enter(MakeupColor.class);
                pARSER = MakeupColor.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MakeupColor.DEFAULT_INSTANCE);
                   MakeupColor.PARSER = pARSER;
                }
                _monitor_exit(MakeupColor.class);
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
    public float getColorA(){
       return this.colorA_;
    }
    public float getColorB(){
       return this.colorB_;
    }
    public float getColorG(){
       return this.colorG_;
    }
    public float getColorR(){
       return this.colorR_;
    }
    public void setColorA(float p0){
       this.colorA_ = p0;
    }
    public void setColorB(float p0){
       this.colorB_ = p0;
    }
    public void setColorG(float p0){
       this.colorG_ = p0;
    }
    public void setColorR(float p0){
       this.colorR_ = p0;
    }
}

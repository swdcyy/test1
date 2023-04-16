package com.kwai.video.westeros.models.MmuRect;
import com.kwai.video.westeros.models.MmuRectOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MmuRect$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuRect$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class MmuRect extends GeneratedMessageLite implements MmuRectOrBuilder	// class@000fde
{
    public float bottom_;
    public float left_;
    public float right_;
    public float top_;
    public static final MmuRect DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuRect mmuRect = new MmuRect();
       MmuRect.DEFAULT_INSTANCE = mmuRect;
       GeneratedMessageLite.registerDefaultInstance(MmuRect.class, mmuRect);
    }
    public void MmuRect(){
       super();
    }
    public static MmuRect getDefaultInstance(){
       return MmuRect.DEFAULT_INSTANCE;
    }
    public static MmuRect$Builder newBuilder(){
       return MmuRect.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuRect$Builder newBuilder(MmuRect p0){
       return MmuRect.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuRect parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuRect parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuRect parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuRect parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuRect parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuRect parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0);
    }
    public static MmuRect parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuRect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuRect.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBottom(){
       this.bottom_ = 0;
    }
    public void clearLeft(){
       this.left_ = 0;
    }
    public void clearRight(){
       this.right_ = 0;
    }
    public void clearTop(){
       this.top_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuRect$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuRect();
           case 2:
             return new MmuRect$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"left_","top_","right_","bottom_"};
             return GeneratedMessageLite.newMessageInfo(MmuRect.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return MmuRect.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuRect.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuRect.class);
                pARSER = MmuRect.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuRect.DEFAULT_INSTANCE);
                   MmuRect.PARSER = pARSER;
                }
                _monitor_exit(MmuRect.class);
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
    public float getBottom(){
       return this.bottom_;
    }
    public float getLeft(){
       return this.left_;
    }
    public float getRight(){
       return this.right_;
    }
    public float getTop(){
       return this.top_;
    }
    public void setBottom(float p0){
       this.bottom_ = p0;
    }
    public void setLeft(float p0){
       this.left_ = p0;
    }
    public void setRight(float p0){
       this.right_ = p0;
    }
    public void setTop(float p0){
       this.top_ = p0;
    }
}

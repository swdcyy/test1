package com.kwai.video.westeros.models.Rect;
import com.kwai.video.westeros.models.RectOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.Rect$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.Rect$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Rect extends GeneratedMessageLite implements RectOrBuilder	// class@001024
{
    public float bottom_;
    public float left_;
    public float right_;
    public float top_;
    public static final Rect DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Rect rect = new Rect();
       Rect.DEFAULT_INSTANCE = rect;
       GeneratedMessageLite.registerDefaultInstance(Rect.class, rect);
    }
    public void Rect(){
       super();
    }
    public static Rect getDefaultInstance(){
       return Rect.DEFAULT_INSTANCE;
    }
    public static Rect$Builder newBuilder(){
       return Rect.DEFAULT_INSTANCE.createBuilder();
    }
    public static Rect$Builder newBuilder(Rect p0){
       return Rect.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Rect parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Rect parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Rect parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Rect parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Rect parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Rect parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0);
    }
    public static Rect parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Rect.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Rect.DEFAULT_INSTANCE.getParserForType();
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
       switch (Rect$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Rect();
           case 2:
             return new Rect$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"left_","top_","right_","bottom_"};
             return GeneratedMessageLite.newMessageInfo(Rect.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return Rect.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Rect.PARSER;
             if (pARSER == null) {
                _monitor_enter(Rect.class);
                pARSER = Rect.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Rect.DEFAULT_INSTANCE);
                   Rect.PARSER = pARSER;
                }
                _monitor_exit(Rect.class);
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

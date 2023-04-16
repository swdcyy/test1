package com.kuaishou.edit.draft.Frame;
import z30.i0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Frame$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.Frame$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Frame extends GeneratedMessageLite implements i0	// class@0017a8
{
    public int height_;
    public int width_;
    public int x_;
    public int y_;
    public static final Frame DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Frame uFrame = new Frame();
       Frame.DEFAULT_INSTANCE = uFrame;
       GeneratedMessageLite.registerDefaultInstance(Frame.class, uFrame);
    }
    public void Frame(){
       super();
    }
    public static Frame getDefaultInstance(){
       return Frame.DEFAULT_INSTANCE;
    }
    public static Frame$b newBuilder(){
       return Frame.DEFAULT_INSTANCE.createBuilder();
    }
    public static Frame$b newBuilder(Frame p0){
       return Frame.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Frame parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Frame parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Frame parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Frame parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Frame parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Frame parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0);
    }
    public static Frame parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Frame.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Frame.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public void clearX(){
       this.x_ = 0;
    }
    public void clearY(){
       this.y_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Frame$a.a[p0.ordinal()]){
           case 1:
             return new Frame();
           case 2:
             return new Frame$b(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_","width_","height_"};
             return GeneratedMessageLite.newMessageInfo(Frame.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x04\x04\x04\x00", objArray);
           case 4:
             return Frame.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Frame.PARSER;
             if (pARSER == null) {
                _monitor_enter(Frame.class);
                pARSER = Frame.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Frame.DEFAULT_INSTANCE);
                   Frame.PARSER = pARSER;
                }
                _monitor_exit(Frame.class);
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
    public int getHeight(){
       return this.height_;
    }
    public int getWidth(){
       return this.width_;
    }
    public int getX(){
       return this.x_;
    }
    public int getY(){
       return this.y_;
    }
    public void setHeight(int p0){
       this.height_ = p0;
    }
    public void setWidth(int p0){
       this.width_ = p0;
    }
    public void setX(int p0){
       this.x_ = p0;
    }
    public void setY(int p0){
       this.y_ = p0;
    }
}

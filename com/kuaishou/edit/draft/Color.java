package com.kuaishou.edit.draft.Color;
import z30.o;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Color$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.Color$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Color extends GeneratedMessageLite implements o	// class@00174d
{
    public float alpha_;
    public float blue_;
    public float green_;
    public float red_;
    public static final Color DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Color uColor = new Color();
       Color.DEFAULT_INSTANCE = uColor;
       GeneratedMessageLite.registerDefaultInstance(Color.class, uColor);
    }
    public void Color(){
       super();
    }
    public static Color getDefaultInstance(){
       return Color.DEFAULT_INSTANCE;
    }
    public static Color$b newBuilder(){
       return Color.DEFAULT_INSTANCE.createBuilder();
    }
    public static Color$b newBuilder(Color p0){
       return Color.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Color parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Color parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Color parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Color parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Color parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Color parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0);
    }
    public static Color parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Color.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Color.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAlpha(){
       this.alpha_ = 0;
    }
    public void clearBlue(){
       this.blue_ = 0;
    }
    public void clearGreen(){
       this.green_ = 0;
    }
    public void clearRed(){
       this.red_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Color$a.a[p0.ordinal()]){
           case 1:
             return new Color();
           case 2:
             return new Color$b(p2);
           case 3:
             Object[] objArray = new Object[]{"alpha_","red_","green_","blue_"};
             return GeneratedMessageLite.newMessageInfo(Color.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\x01\x00", objArray);
           case 4:
             return Color.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Color.PARSER;
             if (pARSER == null) {
                _monitor_enter(Color.class);
                pARSER = Color.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Color.DEFAULT_INSTANCE);
                   Color.PARSER = pARSER;
                }
                _monitor_exit(Color.class);
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
    public float getAlpha(){
       return this.alpha_;
    }
    public float getBlue(){
       return this.blue_;
    }
    public float getGreen(){
       return this.green_;
    }
    public float getRed(){
       return this.red_;
    }
    public void setAlpha(float p0){
       this.alpha_ = p0;
    }
    public void setBlue(float p0){
       this.blue_ = p0;
    }
    public void setGreen(float p0){
       this.green_ = p0;
    }
    public void setRed(float p0){
       this.red_ = p0;
    }
}

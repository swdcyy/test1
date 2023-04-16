package com.kwai.video.westeros.models.Point2d;
import com.kwai.video.westeros.models.Point2dOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.Point2d$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.Point2d$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Point2d extends GeneratedMessageLite implements Point2dOrBuilder	// class@00100a
{
    public float x_;
    public float y_;
    public static final Point2d DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Point2d point2d = new Point2d();
       Point2d.DEFAULT_INSTANCE = point2d;
       GeneratedMessageLite.registerDefaultInstance(Point2d.class, point2d);
    }
    public void Point2d(){
       super();
    }
    public static Point2d getDefaultInstance(){
       return Point2d.DEFAULT_INSTANCE;
    }
    public static Point2d$Builder newBuilder(){
       return Point2d.DEFAULT_INSTANCE.createBuilder();
    }
    public static Point2d$Builder newBuilder(Point2d p0){
       return Point2d.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Point2d parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Point2d parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Point2d parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Point2d parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Point2d parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Point2d parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0);
    }
    public static Point2d parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Point2d.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Point2d.DEFAULT_INSTANCE.getParserForType();
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
       switch (Point2d$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Point2d();
           case 2:
             return new Point2d$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_"};
             return GeneratedMessageLite.newMessageInfo(Point2d.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return Point2d.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Point2d.PARSER;
             if (pARSER == null) {
                _monitor_enter(Point2d.class);
                pARSER = Point2d.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Point2d.DEFAULT_INSTANCE);
                   Point2d.PARSER = pARSER;
                }
                _monitor_exit(Point2d.class);
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
    public float getX(){
       return this.x_;
    }
    public float getY(){
       return this.y_;
    }
    public void setX(float p0){
       this.x_ = p0;
    }
    public void setY(float p0){
       this.y_ = p0;
    }
}

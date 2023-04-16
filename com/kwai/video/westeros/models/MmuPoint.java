package com.kwai.video.westeros.models.MmuPoint;
import com.kwai.video.westeros.models.MmuPointOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MmuPoint$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuPoint$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class MmuPoint extends GeneratedMessageLite implements MmuPointOrBuilder	// class@000fda
{
    public float x_;
    public float y_;
    public static final MmuPoint DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuPoint mmuPoint = new MmuPoint();
       MmuPoint.DEFAULT_INSTANCE = mmuPoint;
       GeneratedMessageLite.registerDefaultInstance(MmuPoint.class, mmuPoint);
    }
    public void MmuPoint(){
       super();
    }
    public static MmuPoint getDefaultInstance(){
       return MmuPoint.DEFAULT_INSTANCE;
    }
    public static MmuPoint$Builder newBuilder(){
       return MmuPoint.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuPoint$Builder newBuilder(MmuPoint p0){
       return MmuPoint.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuPoint parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuPoint parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuPoint parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuPoint parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuPoint parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuPoint parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0);
    }
    public static MmuPoint parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuPoint.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuPoint.DEFAULT_INSTANCE.getParserForType();
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
       switch (MmuPoint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuPoint();
           case 2:
             return new MmuPoint$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_"};
             return GeneratedMessageLite.newMessageInfo(MmuPoint.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return MmuPoint.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuPoint.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuPoint.class);
                pARSER = MmuPoint.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuPoint.DEFAULT_INSTANCE);
                   MmuPoint.PARSER = pARSER;
                }
                _monitor_exit(MmuPoint.class);
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

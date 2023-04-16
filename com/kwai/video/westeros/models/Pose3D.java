package com.kwai.video.westeros.models.Pose3D;
import com.kwai.video.westeros.models.Pose3DOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.Pose3D$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.Pose3D$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class Pose3D extends GeneratedMessageLite implements Pose3DOrBuilder	// class@00101d
{
    public float pitch_;
    public float roll_;
    public float yaw_;
    public static final Pose3D DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Pose3D pose3D = new Pose3D();
       Pose3D.DEFAULT_INSTANCE = pose3D;
       GeneratedMessageLite.registerDefaultInstance(Pose3D.class, pose3D);
    }
    public void Pose3D(){
       super();
    }
    public static Pose3D getDefaultInstance(){
       return Pose3D.DEFAULT_INSTANCE;
    }
    public static Pose3D$Builder newBuilder(){
       return Pose3D.DEFAULT_INSTANCE.createBuilder();
    }
    public static Pose3D$Builder newBuilder(Pose3D p0){
       return Pose3D.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Pose3D parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Pose3D parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Pose3D parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Pose3D parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Pose3D parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Pose3D parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0);
    }
    public static Pose3D parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Pose3D.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Pose3D.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearPitch(){
       this.pitch_ = 0;
    }
    public void clearRoll(){
       this.roll_ = 0;
    }
    public void clearYaw(){
       this.yaw_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Pose3D$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Pose3D();
           case 2:
             return new Pose3D$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"pitch_","yaw_","roll_"};
             return GeneratedMessageLite.newMessageInfo(Pose3D.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x00", objArray);
           case 4:
             return Pose3D.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Pose3D.PARSER;
             if (pARSER == null) {
                _monitor_enter(Pose3D.class);
                pARSER = Pose3D.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Pose3D.DEFAULT_INSTANCE);
                   Pose3D.PARSER = pARSER;
                }
                _monitor_exit(Pose3D.class);
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
    public float getPitch(){
       return this.pitch_;
    }
    public float getRoll(){
       return this.roll_;
    }
    public float getYaw(){
       return this.yaw_;
    }
    public void setPitch(float p0){
       this.pitch_ = p0;
    }
    public void setRoll(float p0){
       this.roll_ = p0;
    }
    public void setYaw(float p0){
       this.yaw_ = p0;
    }
}

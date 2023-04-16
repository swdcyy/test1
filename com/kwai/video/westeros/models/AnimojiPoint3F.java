package com.kwai.video.westeros.models.AnimojiPoint3F;
import com.kwai.video.westeros.models.AnimojiPoint3FOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.AnimojiPoint3F$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.AnimojiPoint3F$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class AnimojiPoint3F extends GeneratedMessageLite implements AnimojiPoint3FOrBuilder	// class@000ea5
{
    public float x_;
    public float y_;
    public float z_;
    public static final AnimojiPoint3F DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AnimojiPoint3F uAnimojiPoin = new AnimojiPoint3F();
       AnimojiPoint3F.DEFAULT_INSTANCE = uAnimojiPoin;
       GeneratedMessageLite.registerDefaultInstance(AnimojiPoint3F.class, uAnimojiPoin);
    }
    public void AnimojiPoint3F(){
       super();
    }
    public static AnimojiPoint3F getDefaultInstance(){
       return AnimojiPoint3F.DEFAULT_INSTANCE;
    }
    public static AnimojiPoint3F$Builder newBuilder(){
       return AnimojiPoint3F.DEFAULT_INSTANCE.createBuilder();
    }
    public static AnimojiPoint3F$Builder newBuilder(AnimojiPoint3F p0){
       return AnimojiPoint3F.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AnimojiPoint3F parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiPoint3F parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiPoint3F parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiPoint3F parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiPoint3F parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiPoint3F parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiPoint3F parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiPoint3F.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AnimojiPoint3F.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearX(){
       this.x_ = 0;
    }
    public void clearY(){
       this.y_ = 0;
    }
    public void clearZ(){
       this.z_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AnimojiPoint3F$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new AnimojiPoint3F();
           case 2:
             return new AnimojiPoint3F$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_","z_"};
             return GeneratedMessageLite.newMessageInfo(AnimojiPoint3F.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x00", objArray);
           case 4:
             return AnimojiPoint3F.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AnimojiPoint3F.PARSER;
             if (pARSER == null) {
                _monitor_enter(AnimojiPoint3F.class);
                pARSER = AnimojiPoint3F.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AnimojiPoint3F.DEFAULT_INSTANCE);
                   AnimojiPoint3F.PARSER = pARSER;
                }
                _monitor_exit(AnimojiPoint3F.class);
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
    public float getZ(){
       return this.z_;
    }
    public void setX(float p0){
       this.x_ = p0;
    }
    public void setY(float p0){
       this.y_ = p0;
    }
    public void setZ(float p0){
       this.z_ = p0;
    }
}

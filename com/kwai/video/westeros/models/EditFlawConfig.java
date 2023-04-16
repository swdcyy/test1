package com.kwai.video.westeros.models.EditFlawConfig;
import com.kwai.video.westeros.models.EditFlawConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EditFlawConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EditFlawConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class EditFlawConfig extends GeneratedMessageLite implements EditFlawConfigOrBuilder	// class@000efc
{
    public int h_;
    public int r_;
    public int w_;
    public int x_;
    public int y_;
    public static final EditFlawConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EditFlawConfig uEditFlawCon = new EditFlawConfig();
       EditFlawConfig.DEFAULT_INSTANCE = uEditFlawCon;
       GeneratedMessageLite.registerDefaultInstance(EditFlawConfig.class, uEditFlawCon);
    }
    public void EditFlawConfig(){
       super();
    }
    public static EditFlawConfig getDefaultInstance(){
       return EditFlawConfig.DEFAULT_INSTANCE;
    }
    public static EditFlawConfig$Builder newBuilder(){
       return EditFlawConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static EditFlawConfig$Builder newBuilder(EditFlawConfig p0){
       return EditFlawConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EditFlawConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditFlawConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditFlawConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditFlawConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditFlawConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditFlawConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditFlawConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditFlawConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EditFlawConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearH(){
       this.h_ = 0;
    }
    public void clearR(){
       this.r_ = 0;
    }
    public void clearW(){
       this.w_ = 0;
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
       switch (EditFlawConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EditFlawConfig();
           case 2:
             return new EditFlawConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_","r_","w_","h_"};
             return GeneratedMessageLite.newMessageInfo(EditFlawConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x04\x04\x04\x05\x04\x00", objArray);
           case 4:
             return EditFlawConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EditFlawConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(EditFlawConfig.class);
                pARSER = EditFlawConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EditFlawConfig.DEFAULT_INSTANCE);
                   EditFlawConfig.PARSER = pARSER;
                }
                _monitor_exit(EditFlawConfig.class);
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
    public int getH(){
       return this.h_;
    }
    public int getR(){
       return this.r_;
    }
    public int getW(){
       return this.w_;
    }
    public int getX(){
       return this.x_;
    }
    public int getY(){
       return this.y_;
    }
    public void setH(int p0){
       this.h_ = p0;
    }
    public void setR(int p0){
       this.r_ = p0;
    }
    public void setW(int p0){
       this.w_ = p0;
    }
    public void setX(int p0){
       this.x_ = p0;
    }
    public void setY(int p0){
       this.y_ = p0;
    }
}

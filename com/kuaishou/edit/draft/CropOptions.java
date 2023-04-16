package com.kuaishou.edit.draft.CropOptions;
import z30.q;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CropOptions$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.CropOptions$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.Transform;
import java.util.Objects;
import com.kuaishou.edit.draft.Transform$b;

public final class CropOptions extends GeneratedMessageLite implements q	// class@001760
{
    public boolean borderPosLeftBottom_;
    public boolean borderPosLeftTop_;
    public boolean borderPosRightBottom_;
    public boolean borderPosRightTop_;
    public float borderRadius_;
    public int height_;
    public Transform transform_;
    public int width_;
    public static final CropOptions DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CropOptions uCropOptions = new CropOptions();
       CropOptions.DEFAULT_INSTANCE = uCropOptions;
       GeneratedMessageLite.registerDefaultInstance(CropOptions.class, uCropOptions);
    }
    public void CropOptions(){
       super();
    }
    public static CropOptions getDefaultInstance(){
       return CropOptions.DEFAULT_INSTANCE;
    }
    public static CropOptions$b newBuilder(){
       return CropOptions.DEFAULT_INSTANCE.createBuilder();
    }
    public static CropOptions$b newBuilder(CropOptions p0){
       return CropOptions.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CropOptions parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static CropOptions parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static CropOptions parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static CropOptions parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static CropOptions parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static CropOptions parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0);
    }
    public static CropOptions parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CropOptions.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CropOptions.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBorderPosLeftBottom(){
       this.borderPosLeftBottom_ = false;
    }
    public void clearBorderPosLeftTop(){
       this.borderPosLeftTop_ = false;
    }
    public void clearBorderPosRightBottom(){
       this.borderPosRightBottom_ = false;
    }
    public void clearBorderPosRightTop(){
       this.borderPosRightTop_ = false;
    }
    public void clearBorderRadius(){
       this.borderRadius_ = 0;
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearTransform(){
       this.transform_ = null;
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CropOptions$a.a[p0.ordinal()]){
           case 1:
             return new CropOptions();
           case 2:
             return new CropOptions$b(p2);
           case 3:
             Object[] objArray = new Object[]{"transform_","width_","height_","borderRadius_","borderPosLeftTop_","borderPosLeftBottom_","borderPosRightTop_","borderPosRightBottom_"};
             return GeneratedMessageLite.newMessageInfo(CropOptions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x04\x03\x04\x04\x01\x05\x07\x06\x07\x07\x07\b\x07\x00", objArray);
           case 4:
             return CropOptions.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CropOptions.PARSER;
             if (pARSER == null) {
                _monitor_enter(CropOptions.class);
                pARSER = CropOptions.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CropOptions.DEFAULT_INSTANCE);
                   CropOptions.PARSER = pARSER;
                }
                _monitor_exit(CropOptions.class);
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
    public boolean getBorderPosLeftBottom(){
       return this.borderPosLeftBottom_;
    }
    public boolean getBorderPosLeftTop(){
       return this.borderPosLeftTop_;
    }
    public boolean getBorderPosRightBottom(){
       return this.borderPosRightBottom_;
    }
    public boolean getBorderPosRightTop(){
       return this.borderPosRightTop_;
    }
    public float getBorderRadius(){
       return this.borderRadius_;
    }
    public int getHeight(){
       return this.height_;
    }
    public Transform getTransform(){
       CropOptions ttransform_ = this.transform_;
       if (ttransform_ == null) {
          ttransform_ = Transform.getDefaultInstance();
       }
       return ttransform_;
    }
    public int getWidth(){
       return this.width_;
    }
    public boolean hasTransform(){
       boolean b = (this.transform_ != null)? true: false;
       return b;
    }
    public void mergeTransform(Transform p0){
       Objects.requireNonNull(p0);
       CropOptions ttransform_ = this.transform_;
       this.transform_ = (ttransform_ != null && ttransform_ != Transform.getDefaultInstance())? Transform.newBuilder(this.transform_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setBorderPosLeftBottom(boolean p0){
       this.borderPosLeftBottom_ = p0;
    }
    public void setBorderPosLeftTop(boolean p0){
       this.borderPosLeftTop_ = p0;
    }
    public void setBorderPosRightBottom(boolean p0){
       this.borderPosRightBottom_ = p0;
    }
    public void setBorderPosRightTop(boolean p0){
       this.borderPosRightTop_ = p0;
    }
    public void setBorderRadius(float p0){
       this.borderRadius_ = p0;
    }
    public void setHeight(int p0){
       this.height_ = p0;
    }
    public void setTransform(Transform$b p0){
       this.transform_ = p0.build();
    }
    public void setTransform(Transform p0){
       Objects.requireNonNull(p0);
       this.transform_ = p0;
    }
    public void setWidth(int p0){
       this.width_ = p0;
    }
}

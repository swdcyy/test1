package com.kuaishou.edit.draft.CustomTextStyle;
import z30.s;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CustomTextStyle$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.CustomTextStyle$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CustomTextStyle extends GeneratedMessageLite implements s	// class@001766
{
    public String backgroundColorKey_;
    public String fillColorKey_;
    public String shadowColorKey_;
    public String strokeColorKey_;
    public int textAlign_;
    public int textMode_;
    public static final CustomTextStyle DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CustomTextStyle uCustomTextS = new CustomTextStyle();
       CustomTextStyle.DEFAULT_INSTANCE = uCustomTextS;
       GeneratedMessageLite.registerDefaultInstance(CustomTextStyle.class, uCustomTextS);
    }
    public void CustomTextStyle(){
       super();
       this.backgroundColorKey_ = "";
       this.fillColorKey_ = "";
       this.strokeColorKey_ = "";
       this.shadowColorKey_ = "";
    }
    public static CustomTextStyle getDefaultInstance(){
       return CustomTextStyle.DEFAULT_INSTANCE;
    }
    public static CustomTextStyle$b newBuilder(){
       return CustomTextStyle.DEFAULT_INSTANCE.createBuilder();
    }
    public static CustomTextStyle$b newBuilder(CustomTextStyle p0){
       return CustomTextStyle.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CustomTextStyle parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomTextStyle parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomTextStyle parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomTextStyle parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomTextStyle parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomTextStyle parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0);
    }
    public static CustomTextStyle parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomTextStyle.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CustomTextStyle.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBackgroundColorKey(){
       this.backgroundColorKey_ = CustomTextStyle.getDefaultInstance().getBackgroundColorKey();
    }
    public void clearFillColorKey(){
       this.fillColorKey_ = CustomTextStyle.getDefaultInstance().getFillColorKey();
    }
    public void clearShadowColorKey(){
       this.shadowColorKey_ = CustomTextStyle.getDefaultInstance().getShadowColorKey();
    }
    public void clearStrokeColorKey(){
       this.strokeColorKey_ = CustomTextStyle.getDefaultInstance().getStrokeColorKey();
    }
    public void clearTextAlign(){
       this.textAlign_ = 0;
    }
    public void clearTextMode(){
       this.textMode_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CustomTextStyle$a.a[p0.ordinal()]){
           case 1:
             return new CustomTextStyle();
           case 2:
             return new CustomTextStyle$b(p2);
           case 3:
             Object[] objArray = new Object[]{"backgroundColorKey_","fillColorKey_","strokeColorKey_","shadowColorKey_","textAlign_","textMode_"};
             return GeneratedMessageLite.newMessageInfo(CustomTextStyle.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x0b\x06\x0b\x00", objArray);
           case 4:
             return CustomTextStyle.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CustomTextStyle.PARSER;
             if (pARSER == null) {
                _monitor_enter(CustomTextStyle.class);
                pARSER = CustomTextStyle.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CustomTextStyle.DEFAULT_INSTANCE);
                   CustomTextStyle.PARSER = pARSER;
                }
                _monitor_exit(CustomTextStyle.class);
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
    public String getBackgroundColorKey(){
       return this.backgroundColorKey_;
    }
    public ByteString getBackgroundColorKeyBytes(){
       return ByteString.copyFromUtf8(this.backgroundColorKey_);
    }
    public String getFillColorKey(){
       return this.fillColorKey_;
    }
    public ByteString getFillColorKeyBytes(){
       return ByteString.copyFromUtf8(this.fillColorKey_);
    }
    public String getShadowColorKey(){
       return this.shadowColorKey_;
    }
    public ByteString getShadowColorKeyBytes(){
       return ByteString.copyFromUtf8(this.shadowColorKey_);
    }
    public String getStrokeColorKey(){
       return this.strokeColorKey_;
    }
    public ByteString getStrokeColorKeyBytes(){
       return ByteString.copyFromUtf8(this.strokeColorKey_);
    }
    public int getTextAlign(){
       return this.textAlign_;
    }
    public int getTextMode(){
       return this.textMode_;
    }
    public void setBackgroundColorKey(String p0){
       Objects.requireNonNull(p0);
       this.backgroundColorKey_ = p0;
    }
    public void setBackgroundColorKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.backgroundColorKey_ = p0.toStringUtf8();
    }
    public void setFillColorKey(String p0){
       Objects.requireNonNull(p0);
       this.fillColorKey_ = p0;
    }
    public void setFillColorKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fillColorKey_ = p0.toStringUtf8();
    }
    public void setShadowColorKey(String p0){
       Objects.requireNonNull(p0);
       this.shadowColorKey_ = p0;
    }
    public void setShadowColorKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shadowColorKey_ = p0.toStringUtf8();
    }
    public void setStrokeColorKey(String p0){
       Objects.requireNonNull(p0);
       this.strokeColorKey_ = p0;
    }
    public void setStrokeColorKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.strokeColorKey_ = p0.toStringUtf8();
    }
    public void setTextAlign(int p0){
       this.textAlign_ = p0;
    }
    public void setTextMode(int p0){
       this.textMode_ = p0;
    }
}

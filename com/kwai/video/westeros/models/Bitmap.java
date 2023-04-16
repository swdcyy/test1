package com.kwai.video.westeros.models.Bitmap;
import com.kwai.video.westeros.models.BitmapOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.Bitmap$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.Bitmap$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.Bitmap$Format;
import java.util.Objects;

public final class Bitmap extends GeneratedMessageLite implements BitmapOrBuilder	// class@000ebc
{
    public ByteString data_;
    public int format_;
    public int height_;
    public int width_;
    public static final Bitmap DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Bitmap uBitmap = new Bitmap();
       Bitmap.DEFAULT_INSTANCE = uBitmap;
       GeneratedMessageLite.registerDefaultInstance(Bitmap.class, uBitmap);
    }
    public void Bitmap(){
       super();
       this.data_ = ByteString.EMPTY;
    }
    public static Bitmap getDefaultInstance(){
       return Bitmap.DEFAULT_INSTANCE;
    }
    public static Bitmap$Builder newBuilder(){
       return Bitmap.DEFAULT_INSTANCE.createBuilder();
    }
    public static Bitmap$Builder newBuilder(Bitmap p0){
       return Bitmap.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Bitmap parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Bitmap parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Bitmap parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Bitmap parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Bitmap parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Bitmap parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0);
    }
    public static Bitmap parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Bitmap.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Bitmap.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearData(){
       this.data_ = Bitmap.getDefaultInstance().getData();
    }
    public void clearFormat(){
       this.format_ = 0;
    }
    public void clearHeight(){
       this.height_ = 0;
    }
    public void clearWidth(){
       this.width_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Bitmap$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Bitmap();
           case 2:
             return new Bitmap$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"width_","height_","data_","format_"};
             return GeneratedMessageLite.newMessageInfo(Bitmap.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\n\x04\f\x00", objArray);
           case 4:
             return Bitmap.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Bitmap.PARSER;
             if (pARSER == null) {
                _monitor_enter(Bitmap.class);
                pARSER = Bitmap.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Bitmap.DEFAULT_INSTANCE);
                   Bitmap.PARSER = pARSER;
                }
                _monitor_exit(Bitmap.class);
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
    public ByteString getData(){
       return this.data_;
    }
    public Bitmap$Format getFormat(){
       Bitmap$Format uFormat = Bitmap$Format.forNumber(this.format_);
       if (uFormat == null) {
          uFormat = Bitmap$Format.UNRECOGNIZED;
       }
       return uFormat;
    }
    public int getFormatValue(){
       return this.format_;
    }
    public int getHeight(){
       return this.height_;
    }
    public int getWidth(){
       return this.width_;
    }
    public void setData(ByteString p0){
       Objects.requireNonNull(p0);
       this.data_ = p0;
    }
    public void setFormat(Bitmap$Format p0){
       Objects.requireNonNull(p0);
       this.format_ = p0.getNumber();
    }
    public void setFormatValue(int p0){
       this.format_ = p0;
    }
    public void setHeight(int p0){
       this.height_ = p0;
    }
    public void setWidth(int p0){
       this.width_ = p0;
    }
}

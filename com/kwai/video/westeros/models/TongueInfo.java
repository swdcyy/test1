package com.kwai.video.westeros.models.TongueInfo;
import com.kwai.video.westeros.models.TongueInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.TongueInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.TongueInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.AnimojiPoint3F;
import java.util.Objects;
import com.kwai.video.westeros.models.AnimojiPoint3F$Builder;

public final class TongueInfo extends GeneratedMessageLite implements TongueInfoOrBuilder	// class@001053
{
    public AnimojiPoint3F pos_;
    public boolean visible_;
    public static final TongueInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TongueInfo tongueInfo = new TongueInfo();
       TongueInfo.DEFAULT_INSTANCE = tongueInfo;
       GeneratedMessageLite.registerDefaultInstance(TongueInfo.class, tongueInfo);
    }
    public void TongueInfo(){
       super();
    }
    public static TongueInfo getDefaultInstance(){
       return TongueInfo.DEFAULT_INSTANCE;
    }
    public static TongueInfo$Builder newBuilder(){
       return TongueInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static TongueInfo$Builder newBuilder(TongueInfo p0){
       return TongueInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TongueInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static TongueInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static TongueInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static TongueInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static TongueInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static TongueInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0);
    }
    public static TongueInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TongueInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TongueInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearPos(){
       this.pos_ = null;
    }
    public void clearVisible(){
       this.visible_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TongueInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TongueInfo();
           case 2:
             return new TongueInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"visible_","pos_"};
             return GeneratedMessageLite.newMessageInfo(TongueInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\t\x00", objArray);
           case 4:
             return TongueInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TongueInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(TongueInfo.class);
                pARSER = TongueInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TongueInfo.DEFAULT_INSTANCE);
                   TongueInfo.PARSER = pARSER;
                }
                _monitor_exit(TongueInfo.class);
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
    public AnimojiPoint3F getPos(){
       TongueInfo tpos_ = this.pos_;
       if (tpos_ == null) {
          tpos_ = AnimojiPoint3F.getDefaultInstance();
       }
       return tpos_;
    }
    public boolean getVisible(){
       return this.visible_;
    }
    public boolean hasPos(){
       boolean b = (this.pos_ != null)? true: false;
       return b;
    }
    public void mergePos(AnimojiPoint3F p0){
       Objects.requireNonNull(p0);
       TongueInfo tpos_ = this.pos_;
       this.pos_ = (tpos_ != null && tpos_ != AnimojiPoint3F.getDefaultInstance())? AnimojiPoint3F.newBuilder(this.pos_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setPos(AnimojiPoint3F$Builder p0){
       this.pos_ = p0.build();
    }
    public void setPos(AnimojiPoint3F p0){
       Objects.requireNonNull(p0);
       this.pos_ = p0;
    }
    public void setVisible(boolean p0){
       this.visible_ = p0;
    }
}

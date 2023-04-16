package com.kwai.video.westeros.models.SalientInfo;
import com.kwai.video.westeros.models.SalientInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.SalientInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.SalientInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.Rect;
import java.util.Objects;
import com.kwai.video.westeros.models.Rect$Builder;

public final class SalientInfo extends GeneratedMessageLite implements SalientInfoOrBuilder	// class@001037
{
    public float confidence_;
    public Rect position_;
    public int type_;
    public static final SalientInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SalientInfo salientInfo = new SalientInfo();
       SalientInfo.DEFAULT_INSTANCE = salientInfo;
       GeneratedMessageLite.registerDefaultInstance(SalientInfo.class, salientInfo);
    }
    public void SalientInfo(){
       super();
    }
    public static SalientInfo getDefaultInstance(){
       return SalientInfo.DEFAULT_INSTANCE;
    }
    public static SalientInfo$Builder newBuilder(){
       return SalientInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static SalientInfo$Builder newBuilder(SalientInfo p0){
       return SalientInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SalientInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SalientInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0);
    }
    public static SalientInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SalientInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return SalientInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearConfidence(){
       this.confidence_ = 0;
    }
    public void clearPosition(){
       this.position_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (SalientInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new SalientInfo();
           case 2:
             return new SalientInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","position_","confidence_"};
             return GeneratedMessageLite.newMessageInfo(SalientInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\t\x03\x01\x00", objArray);
           case 4:
             return SalientInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SalientInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(SalientInfo.class);
                pARSER = SalientInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SalientInfo.DEFAULT_INSTANCE);
                   SalientInfo.PARSER = pARSER;
                }
                _monitor_exit(SalientInfo.class);
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
    public float getConfidence(){
       return this.confidence_;
    }
    public Rect getPosition(){
       SalientInfo tposition_ = this.position_;
       if (tposition_ == null) {
          tposition_ = Rect.getDefaultInstance();
       }
       return tposition_;
    }
    public int getType(){
       return this.type_;
    }
    public boolean hasPosition(){
       boolean b = (this.position_ != null)? true: false;
       return b;
    }
    public void mergePosition(Rect p0){
       Objects.requireNonNull(p0);
       SalientInfo tposition_ = this.position_;
       this.position_ = (tposition_ != null && tposition_ != Rect.getDefaultInstance())? Rect.newBuilder(this.position_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setConfidence(float p0){
       this.confidence_ = p0;
    }
    public void setPosition(Rect$Builder p0){
       this.position_ = p0.build();
    }
    public void setPosition(Rect p0){
       Objects.requireNonNull(p0);
       this.position_ = p0;
    }
    public void setType(int p0){
       this.type_ = p0;
    }
}

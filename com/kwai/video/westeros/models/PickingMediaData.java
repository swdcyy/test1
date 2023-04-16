package com.kwai.video.westeros.models.PickingMediaData;
import com.kwai.video.westeros.models.PickingMediaDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.PickingMediaData$Builder;
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
import com.kwai.video.westeros.models.PickingMediaData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickingMediaResType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PickingMediaData extends GeneratedMessageLite implements PickingMediaDataOrBuilder	// class@000ffd
{
    public String key_;
    public String path_;
    public int type_;
    public static final PickingMediaData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickingMediaData pickingMedia = new PickingMediaData();
       PickingMediaData.DEFAULT_INSTANCE = pickingMedia;
       GeneratedMessageLite.registerDefaultInstance(PickingMediaData.class, pickingMedia);
    }
    public void PickingMediaData(){
       super();
       this.key_ = "";
       this.path_ = "";
    }
    public static PickingMediaData getDefaultInstance(){
       return PickingMediaData.DEFAULT_INSTANCE;
    }
    public static PickingMediaData$Builder newBuilder(){
       return PickingMediaData.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickingMediaData$Builder newBuilder(PickingMediaData p0){
       return PickingMediaData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickingMediaData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingMediaData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingMediaData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingMediaData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingMediaData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickingMediaData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0);
    }
    public static PickingMediaData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickingMediaData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickingMediaData.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearKey(){
       this.key_ = PickingMediaData.getDefaultInstance().getKey();
    }
    public void clearPath(){
       this.path_ = PickingMediaData.getDefaultInstance().getPath();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickingMediaData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickingMediaData();
           case 2:
             return new PickingMediaData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"key_","type_","path_"};
             return GeneratedMessageLite.newMessageInfo(PickingMediaData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x02\x02\x00", objArray);
           case 4:
             return PickingMediaData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickingMediaData.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickingMediaData.class);
                pARSER = PickingMediaData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickingMediaData.DEFAULT_INSTANCE);
                   PickingMediaData.PARSER = pARSER;
                }
                _monitor_exit(PickingMediaData.class);
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
    public String getKey(){
       return this.key_;
    }
    public ByteString getKeyBytes(){
       return ByteString.copyFromUtf8(this.key_);
    }
    public String getPath(){
       return this.path_;
    }
    public ByteString getPathBytes(){
       return ByteString.copyFromUtf8(this.path_);
    }
    public PickingMediaResType getType(){
       PickingMediaResType pickingMedia = PickingMediaResType.forNumber(this.type_);
       if (pickingMedia == null) {
          pickingMedia = PickingMediaResType.UNRECOGNIZED;
       }
       return pickingMedia;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setKey(String p0){
       Objects.requireNonNull(p0);
       this.key_ = p0;
    }
    public void setKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.key_ = p0.toStringUtf8();
    }
    public void setPath(String p0){
       Objects.requireNonNull(p0);
       this.path_ = p0;
    }
    public void setPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.path_ = p0.toStringUtf8();
    }
    public void setType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}

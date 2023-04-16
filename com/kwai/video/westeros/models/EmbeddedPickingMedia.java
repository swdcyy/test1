package com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.kwai.video.westeros.models.EmbeddedPickingMediaOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
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
import com.kwai.video.westeros.models.EmbeddedPickingMedia$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickingMediaResType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class EmbeddedPickingMedia extends GeneratedMessageLite implements EmbeddedPickingMediaOrBuilder	// class@000f4b
{
    public float duration_;
    public String iconPath_;
    public String mediaPath_;
    public boolean pick_;
    public int type_;
    public static final EmbeddedPickingMedia DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EmbeddedPickingMedia uEmbeddedPic = new EmbeddedPickingMedia();
       EmbeddedPickingMedia.DEFAULT_INSTANCE = uEmbeddedPic;
       GeneratedMessageLite.registerDefaultInstance(EmbeddedPickingMedia.class, uEmbeddedPic);
    }
    public void EmbeddedPickingMedia(){
       super();
       this.mediaPath_ = "";
       this.iconPath_ = "";
    }
    public static EmbeddedPickingMedia getDefaultInstance(){
       return EmbeddedPickingMedia.DEFAULT_INSTANCE;
    }
    public static EmbeddedPickingMedia$Builder newBuilder(){
       return EmbeddedPickingMedia.DEFAULT_INSTANCE.createBuilder();
    }
    public static EmbeddedPickingMedia$Builder newBuilder(EmbeddedPickingMedia p0){
       return EmbeddedPickingMedia.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EmbeddedPickingMedia parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static EmbeddedPickingMedia parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static EmbeddedPickingMedia parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static EmbeddedPickingMedia parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static EmbeddedPickingMedia parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static EmbeddedPickingMedia parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0);
    }
    public static EmbeddedPickingMedia parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EmbeddedPickingMedia.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EmbeddedPickingMedia.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearIconPath(){
       this.iconPath_ = EmbeddedPickingMedia.getDefaultInstance().getIconPath();
    }
    public void clearMediaPath(){
       this.mediaPath_ = EmbeddedPickingMedia.getDefaultInstance().getMediaPath();
    }
    public void clearPick(){
       this.pick_ = false;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EmbeddedPickingMedia$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EmbeddedPickingMedia();
           case 2:
             return new EmbeddedPickingMedia$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","mediaPath_","iconPath_","duration_","pick_"};
             return GeneratedMessageLite.newMessageInfo(EmbeddedPickingMedia.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x02\x02\x04\x01\x05\x07\x00", objArray);
           case 4:
             return EmbeddedPickingMedia.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EmbeddedPickingMedia.PARSER;
             if (pARSER == null) {
                _monitor_enter(EmbeddedPickingMedia.class);
                pARSER = EmbeddedPickingMedia.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EmbeddedPickingMedia.DEFAULT_INSTANCE);
                   EmbeddedPickingMedia.PARSER = pARSER;
                }
                _monitor_exit(EmbeddedPickingMedia.class);
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
    public float getDuration(){
       return this.duration_;
    }
    public String getIconPath(){
       return this.iconPath_;
    }
    public ByteString getIconPathBytes(){
       return ByteString.copyFromUtf8(this.iconPath_);
    }
    public String getMediaPath(){
       return this.mediaPath_;
    }
    public ByteString getMediaPathBytes(){
       return ByteString.copyFromUtf8(this.mediaPath_);
    }
    public boolean getPick(){
       return this.pick_;
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
    public void setDuration(float p0){
       this.duration_ = p0;
    }
    public void setIconPath(String p0){
       Objects.requireNonNull(p0);
       this.iconPath_ = p0;
    }
    public void setIconPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.iconPath_ = p0.toStringUtf8();
    }
    public void setMediaPath(String p0){
       Objects.requireNonNull(p0);
       this.mediaPath_ = p0;
    }
    public void setMediaPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.mediaPath_ = p0.toStringUtf8();
    }
    public void setPick(boolean p0){
       this.pick_ = p0;
    }
    public void setType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}

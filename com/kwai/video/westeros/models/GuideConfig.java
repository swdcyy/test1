package com.kwai.video.westeros.models.GuideConfig;
import com.kwai.video.westeros.models.GuideConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.GuideConfig$Builder;
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
import com.kwai.video.westeros.models.GuideConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class GuideConfig extends GeneratedMessageLite implements GuideConfigOrBuilder	// class@000f82
{
    public String content_;
    public String image_;
    public String title_;
    public static final GuideConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       GuideConfig guideConfig = new GuideConfig();
       GuideConfig.DEFAULT_INSTANCE = guideConfig;
       GeneratedMessageLite.registerDefaultInstance(GuideConfig.class, guideConfig);
    }
    public void GuideConfig(){
       super();
       this.title_ = "";
       this.content_ = "";
       this.image_ = "";
    }
    public static GuideConfig getDefaultInstance(){
       return GuideConfig.DEFAULT_INSTANCE;
    }
    public static GuideConfig$Builder newBuilder(){
       return GuideConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static GuideConfig$Builder newBuilder(GuideConfig p0){
       return GuideConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GuideConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static GuideConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static GuideConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static GuideConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static GuideConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static GuideConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0);
    }
    public static GuideConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(GuideConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return GuideConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearContent(){
       this.content_ = GuideConfig.getDefaultInstance().getContent();
    }
    public void clearImage(){
       this.image_ = GuideConfig.getDefaultInstance().getImage();
    }
    public void clearTitle(){
       this.title_ = GuideConfig.getDefaultInstance().getTitle();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (GuideConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new GuideConfig();
           case 2:
             return new GuideConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"title_","content_","image_"};
             return GeneratedMessageLite.newMessageInfo(GuideConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x00", objArray);
           case 4:
             return GuideConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = GuideConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(GuideConfig.class);
                pARSER = GuideConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(GuideConfig.DEFAULT_INSTANCE);
                   GuideConfig.PARSER = pARSER;
                }
                _monitor_exit(GuideConfig.class);
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
    public String getContent(){
       return this.content_;
    }
    public ByteString getContentBytes(){
       return ByteString.copyFromUtf8(this.content_);
    }
    public String getImage(){
       return this.image_;
    }
    public ByteString getImageBytes(){
       return ByteString.copyFromUtf8(this.image_);
    }
    public String getTitle(){
       return this.title_;
    }
    public ByteString getTitleBytes(){
       return ByteString.copyFromUtf8(this.title_);
    }
    public void setContent(String p0){
       Objects.requireNonNull(p0);
       this.content_ = p0;
    }
    public void setContentBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.content_ = p0.toStringUtf8();
    }
    public void setImage(String p0){
       Objects.requireNonNull(p0);
       this.image_ = p0;
    }
    public void setImageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.image_ = p0.toStringUtf8();
    }
    public void setTitle(String p0){
       Objects.requireNonNull(p0);
       this.title_ = p0;
    }
    public void setTitleBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.title_ = p0.toStringUtf8();
    }
}

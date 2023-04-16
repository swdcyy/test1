package com.kwai.video.westeros.models.ImageLocaleTips;
import com.kwai.video.westeros.models.ImageLocaleTipsOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.kwai.video.westeros.models.ImageLocaleTips$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.ImageLocaleTips$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.ImageLocaleTips$TipsDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

public final class ImageLocaleTips extends GeneratedMessageLite implements ImageLocaleTipsOrBuilder	// class@000f91
{
    public int displayDuration_;
    public MapFieldLite tips_;
    public static final ImageLocaleTips DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ImageLocaleTips imageLocaleT = new ImageLocaleTips();
       ImageLocaleTips.DEFAULT_INSTANCE = imageLocaleT;
       GeneratedMessageLite.registerDefaultInstance(ImageLocaleTips.class, imageLocaleT);
    }
    public void ImageLocaleTips(){
       super();
       this.tips_ = MapFieldLite.emptyMapField();
    }
    public static ImageLocaleTips getDefaultInstance(){
       return ImageLocaleTips.DEFAULT_INSTANCE;
    }
    public static ImageLocaleTips$Builder newBuilder(){
       return ImageLocaleTips.DEFAULT_INSTANCE.createBuilder();
    }
    public static ImageLocaleTips$Builder newBuilder(ImageLocaleTips p0){
       return ImageLocaleTips.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ImageLocaleTips parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static ImageLocaleTips parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static ImageLocaleTips parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static ImageLocaleTips parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static ImageLocaleTips parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static ImageLocaleTips parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0);
    }
    public static ImageLocaleTips parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ImageLocaleTips.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ImageLocaleTips.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDisplayDuration(){
       this.displayDuration_ = 0;
    }
    public boolean containsTips(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetTips().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ImageLocaleTips$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ImageLocaleTips();
           case 2:
             return new ImageLocaleTips$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"displayDuration_","tips_",ImageLocaleTips$TipsDefaultEntryHolder.defaultEntry};
             return GeneratedMessageLite.newMessageInfo(ImageLocaleTips.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x022\x00", objArray);
           case 4:
             return ImageLocaleTips.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ImageLocaleTips.PARSER;
             if (pARSER == null) {
                _monitor_enter(ImageLocaleTips.class);
                pARSER = ImageLocaleTips.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ImageLocaleTips.DEFAULT_INSTANCE);
                   ImageLocaleTips.PARSER = pARSER;
                }
                _monitor_exit(ImageLocaleTips.class);
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
    public int getDisplayDuration(){
       return this.displayDuration_;
    }
    public Map getMutableTipsMap(){
       return this.internalGetMutableTips();
    }
    public Map getTips(){
       return this.getTipsMap();
    }
    public int getTipsCount(){
       return this.internalGetTips().size();
    }
    public Map getTipsMap(){
       return Collections.unmodifiableMap(this.internalGetTips());
    }
    public String getTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetTips();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetTips();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public final MapFieldLite internalGetMutableTips(){
       if (!this.tips_.isMutable()) {
          this.tips_ = this.tips_.mutableCopy();
       }
       return this.tips_;
    }
    public final MapFieldLite internalGetTips(){
       return this.tips_;
    }
    public void setDisplayDuration(int p0){
       this.displayDuration_ = p0;
    }
}

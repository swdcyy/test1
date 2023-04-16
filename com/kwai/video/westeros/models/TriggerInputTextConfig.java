package com.kwai.video.westeros.models.TriggerInputTextConfig;
import com.kwai.video.westeros.models.TriggerInputTextConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.kwai.video.westeros.models.TriggerInputTextConfig$Builder;
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
import com.kwai.video.westeros.models.TriggerInputTextConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.TriggerInputTextConfig$DataDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import com.kwai.video.westeros.models.TriggerInputTextData;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.google.protobuf.AbstractMessageLite;

public final class TriggerInputTextConfig extends GeneratedMessageLite implements TriggerInputTextConfigOrBuilder	// class@001064
{
    public String bgColor_;
    public MapFieldLite data_;
    public String fontPath_;
    public int maxInputLength_;
    public String textColor_;
    public String title_;
    public static final TriggerInputTextConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TriggerInputTextConfig triggerInput = new TriggerInputTextConfig();
       TriggerInputTextConfig.DEFAULT_INSTANCE = triggerInput;
       GeneratedMessageLite.registerDefaultInstance(TriggerInputTextConfig.class, triggerInput);
    }
    public void TriggerInputTextConfig(){
       super();
       this.data_ = MapFieldLite.emptyMapField();
       this.bgColor_ = "";
       this.textColor_ = "";
       this.fontPath_ = "";
       this.title_ = "";
    }
    public static TriggerInputTextConfig getDefaultInstance(){
       return TriggerInputTextConfig.DEFAULT_INSTANCE;
    }
    public static TriggerInputTextConfig$Builder newBuilder(){
       return TriggerInputTextConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static TriggerInputTextConfig$Builder newBuilder(TriggerInputTextConfig p0){
       return TriggerInputTextConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TriggerInputTextConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TriggerInputTextConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBgColor(){
       this.bgColor_ = TriggerInputTextConfig.getDefaultInstance().getBgColor();
    }
    public void clearFontPath(){
       this.fontPath_ = TriggerInputTextConfig.getDefaultInstance().getFontPath();
    }
    public void clearMaxInputLength(){
       this.maxInputLength_ = 0;
    }
    public void clearTextColor(){
       this.textColor_ = TriggerInputTextConfig.getDefaultInstance().getTextColor();
    }
    public void clearTitle(){
       this.title_ = TriggerInputTextConfig.getDefaultInstance().getTitle();
    }
    public boolean containsData(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetData().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TriggerInputTextConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TriggerInputTextConfig();
           case 2:
             return new TriggerInputTextConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"data_",TriggerInputTextConfig$DataDefaultEntryHolder.defaultEntry,"maxInputLength_","bgColor_","textColor_","fontPath_","title_"};
             return GeneratedMessageLite.newMessageInfo(TriggerInputTextConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012\x02\x04\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x00", objArray);
           case 4:
             return TriggerInputTextConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TriggerInputTextConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(TriggerInputTextConfig.class);
                pARSER = TriggerInputTextConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TriggerInputTextConfig.DEFAULT_INSTANCE);
                   TriggerInputTextConfig.PARSER = pARSER;
                }
                _monitor_exit(TriggerInputTextConfig.class);
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
    public String getBgColor(){
       return this.bgColor_;
    }
    public ByteString getBgColorBytes(){
       return ByteString.copyFromUtf8(this.bgColor_);
    }
    public Map getData(){
       return this.getDataMap();
    }
    public int getDataCount(){
       return this.internalGetData().size();
    }
    public Map getDataMap(){
       return Collections.unmodifiableMap(this.internalGetData());
    }
    public TriggerInputTextData getDataOrDefault(String p0,TriggerInputTextData p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetData();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public TriggerInputTextData getDataOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetData();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public String getFontPath(){
       return this.fontPath_;
    }
    public ByteString getFontPathBytes(){
       return ByteString.copyFromUtf8(this.fontPath_);
    }
    public int getMaxInputLength(){
       return this.maxInputLength_;
    }
    public Map getMutableDataMap(){
       return this.internalGetMutableData();
    }
    public String getTextColor(){
       return this.textColor_;
    }
    public ByteString getTextColorBytes(){
       return ByteString.copyFromUtf8(this.textColor_);
    }
    public String getTitle(){
       return this.title_;
    }
    public ByteString getTitleBytes(){
       return ByteString.copyFromUtf8(this.title_);
    }
    public final MapFieldLite internalGetData(){
       return this.data_;
    }
    public final MapFieldLite internalGetMutableData(){
       if (!this.data_.isMutable()) {
          this.data_ = this.data_.mutableCopy();
       }
       return this.data_;
    }
    public void setBgColor(String p0){
       Objects.requireNonNull(p0);
       this.bgColor_ = p0;
    }
    public void setBgColorBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.bgColor_ = p0.toStringUtf8();
    }
    public void setFontPath(String p0){
       Objects.requireNonNull(p0);
       this.fontPath_ = p0;
    }
    public void setFontPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fontPath_ = p0.toStringUtf8();
    }
    public void setMaxInputLength(int p0){
       this.maxInputLength_ = p0;
    }
    public void setTextColor(String p0){
       Objects.requireNonNull(p0);
       this.textColor_ = p0;
    }
    public void setTextColorBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.textColor_ = p0.toStringUtf8();
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

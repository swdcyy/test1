package com.kwai.video.westeros.models.PopupWindowConfig;
import com.kwai.video.westeros.models.PopupWindowConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.kwai.video.westeros.models.PopupWindowConfig$Builder;
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
import com.kwai.video.westeros.models.PopupWindowConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.PopupWindowConfig$DataDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import com.kwai.video.westeros.models.PopupWindowConfigData;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.google.protobuf.AbstractMessageLite;

public final class PopupWindowConfig extends GeneratedMessageLite implements PopupWindowConfigOrBuilder	// class@001015
{
    public String bgColor_;
    public MapFieldLite data_;
    public int maxInputLength_;
    public float triggerHeight_;
    public float triggerWidth_;
    public float triggerX_;
    public float triggerY_;
    public static final PopupWindowConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PopupWindowConfig popupWindowC = new PopupWindowConfig();
       PopupWindowConfig.DEFAULT_INSTANCE = popupWindowC;
       GeneratedMessageLite.registerDefaultInstance(PopupWindowConfig.class, popupWindowC);
    }
    public void PopupWindowConfig(){
       super();
       this.data_ = MapFieldLite.emptyMapField();
       this.bgColor_ = "";
    }
    public static PopupWindowConfig getDefaultInstance(){
       return PopupWindowConfig.DEFAULT_INSTANCE;
    }
    public static PopupWindowConfig$Builder newBuilder(){
       return PopupWindowConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static PopupWindowConfig$Builder newBuilder(PopupWindowConfig p0){
       return PopupWindowConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PopupWindowConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PopupWindowConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBgColor(){
       this.bgColor_ = PopupWindowConfig.getDefaultInstance().getBgColor();
    }
    public void clearMaxInputLength(){
       this.maxInputLength_ = 0;
    }
    public void clearTriggerHeight(){
       this.triggerHeight_ = 0;
    }
    public void clearTriggerWidth(){
       this.triggerWidth_ = 0;
    }
    public void clearTriggerX(){
       this.triggerX_ = 0;
    }
    public void clearTriggerY(){
       this.triggerY_ = 0;
    }
    public boolean containsData(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetData().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PopupWindowConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PopupWindowConfig();
           case 2:
             return new PopupWindowConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"data_",PopupWindowConfig$DataDefaultEntryHolder.defaultEntry,"maxInputLength_","triggerX_","triggerY_","triggerWidth_","triggerHeight_","bgColor_"};
             return GeneratedMessageLite.newMessageInfo(PopupWindowConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012\x02\x04\x03\x01\x04\x01\x05\x01\x06\x01\x07\x02\x02\x00", objArray);
           case 4:
             return PopupWindowConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PopupWindowConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(PopupWindowConfig.class);
                pARSER = PopupWindowConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PopupWindowConfig.DEFAULT_INSTANCE);
                   PopupWindowConfig.PARSER = pARSER;
                }
                _monitor_exit(PopupWindowConfig.class);
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
    public PopupWindowConfigData getDataOrDefault(String p0,PopupWindowConfigData p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetData();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public PopupWindowConfigData getDataOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetData();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public int getMaxInputLength(){
       return this.maxInputLength_;
    }
    public Map getMutableDataMap(){
       return this.internalGetMutableData();
    }
    public float getTriggerHeight(){
       return this.triggerHeight_;
    }
    public float getTriggerWidth(){
       return this.triggerWidth_;
    }
    public float getTriggerX(){
       return this.triggerX_;
    }
    public float getTriggerY(){
       return this.triggerY_;
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
    public void setMaxInputLength(int p0){
       this.maxInputLength_ = p0;
    }
    public void setTriggerHeight(float p0){
       this.triggerHeight_ = p0;
    }
    public void setTriggerWidth(float p0){
       this.triggerWidth_ = p0;
    }
    public void setTriggerX(float p0){
       this.triggerX_ = p0;
    }
    public void setTriggerY(float p0){
       this.triggerY_ = p0;
    }
}

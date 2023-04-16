package com.kwai.video.westeros.models.PopupWindowConfigData;
import com.kwai.video.westeros.models.PopupWindowConfigDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.PopupWindowConfigData$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.PopupWindowConfigData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class PopupWindowConfigData extends GeneratedMessageLite implements PopupWindowConfigDataOrBuilder	// class@001018
{
    public Internal$ProtobufList alternativeContent_;
    public String inputHint_;
    public String title_;
    public static final PopupWindowConfigData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PopupWindowConfigData popupWindowC = new PopupWindowConfigData();
       PopupWindowConfigData.DEFAULT_INSTANCE = popupWindowC;
       GeneratedMessageLite.registerDefaultInstance(PopupWindowConfigData.class, popupWindowC);
    }
    public void PopupWindowConfigData(){
       super();
       this.title_ = "";
       this.inputHint_ = "";
       this.alternativeContent_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static PopupWindowConfigData getDefaultInstance(){
       return PopupWindowConfigData.DEFAULT_INSTANCE;
    }
    public static PopupWindowConfigData$Builder newBuilder(){
       return PopupWindowConfigData.DEFAULT_INSTANCE.createBuilder();
    }
    public static PopupWindowConfigData$Builder newBuilder(PopupWindowConfigData p0){
       return PopupWindowConfigData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PopupWindowConfigData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfigData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfigData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfigData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfigData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static PopupWindowConfigData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0);
    }
    public static PopupWindowConfigData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PopupWindowConfigData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PopupWindowConfigData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllAlternativeContent(Iterable p0){
       this.ensureAlternativeContentIsMutable();
       AbstractMessageLite.addAll(p0, this.alternativeContent_);
    }
    public void addAlternativeContent(String p0){
       Objects.requireNonNull(p0);
       this.ensureAlternativeContentIsMutable();
       this.alternativeContent_.add(p0);
    }
    public void addAlternativeContentBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureAlternativeContentIsMutable();
       this.alternativeContent_.add(p0.toStringUtf8());
    }
    public void clearAlternativeContent(){
       this.alternativeContent_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearInputHint(){
       this.inputHint_ = PopupWindowConfigData.getDefaultInstance().getInputHint();
    }
    public void clearTitle(){
       this.title_ = PopupWindowConfigData.getDefaultInstance().getTitle();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PopupWindowConfigData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PopupWindowConfigData();
           case 2:
             return new PopupWindowConfigData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"title_","inputHint_","alternativeContent_"};
             return GeneratedMessageLite.newMessageInfo(PopupWindowConfigData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return PopupWindowConfigData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PopupWindowConfigData.PARSER;
             if (pARSER == null) {
                _monitor_enter(PopupWindowConfigData.class);
                pARSER = PopupWindowConfigData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PopupWindowConfigData.DEFAULT_INSTANCE);
                   PopupWindowConfigData.PARSER = pARSER;
                }
                _monitor_exit(PopupWindowConfigData.class);
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
    public final void ensureAlternativeContentIsMutable(){
       if (!this.alternativeContent_.isModifiable()) {
          this.alternativeContent_ = GeneratedMessageLite.mutableCopy(this.alternativeContent_);
       }
       return;
    }
    public String getAlternativeContent(int p0){
       return this.alternativeContent_.get(p0);
    }
    public ByteString getAlternativeContentBytes(int p0){
       return ByteString.copyFromUtf8(this.alternativeContent_.get(p0));
    }
    public int getAlternativeContentCount(){
       return this.alternativeContent_.size();
    }
    public List getAlternativeContentList(){
       return this.alternativeContent_;
    }
    public String getInputHint(){
       return this.inputHint_;
    }
    public ByteString getInputHintBytes(){
       return ByteString.copyFromUtf8(this.inputHint_);
    }
    public String getTitle(){
       return this.title_;
    }
    public ByteString getTitleBytes(){
       return ByteString.copyFromUtf8(this.title_);
    }
    public void setAlternativeContent(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureAlternativeContentIsMutable();
       this.alternativeContent_.set(p0, p1);
    }
    public void setInputHint(String p0){
       Objects.requireNonNull(p0);
       this.inputHint_ = p0;
    }
    public void setInputHintBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.inputHint_ = p0.toStringUtf8();
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

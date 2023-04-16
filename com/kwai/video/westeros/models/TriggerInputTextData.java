package com.kwai.video.westeros.models.TriggerInputTextData;
import com.kwai.video.westeros.models.TriggerInputTextDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.TriggerInputTextData$Builder;
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
import com.kwai.video.westeros.models.TriggerInputTextData$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class TriggerInputTextData extends GeneratedMessageLite implements TriggerInputTextDataOrBuilder	// class@001068
{
    public String inputHint_;
    public Internal$ProtobufList text_;
    public static final TriggerInputTextData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TriggerInputTextData triggerInput = new TriggerInputTextData();
       TriggerInputTextData.DEFAULT_INSTANCE = triggerInput;
       GeneratedMessageLite.registerDefaultInstance(TriggerInputTextData.class, triggerInput);
    }
    public void TriggerInputTextData(){
       super();
       this.text_ = GeneratedMessageLite.emptyProtobufList();
       this.inputHint_ = "";
    }
    public static TriggerInputTextData getDefaultInstance(){
       return TriggerInputTextData.DEFAULT_INSTANCE;
    }
    public static TriggerInputTextData$Builder newBuilder(){
       return TriggerInputTextData.DEFAULT_INSTANCE.createBuilder();
    }
    public static TriggerInputTextData$Builder newBuilder(TriggerInputTextData p0){
       return TriggerInputTextData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TriggerInputTextData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TriggerInputTextData.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllText(Iterable p0){
       this.ensureTextIsMutable();
       AbstractMessageLite.addAll(p0, this.text_);
    }
    public void addText(String p0){
       Objects.requireNonNull(p0);
       this.ensureTextIsMutable();
       this.text_.add(p0);
    }
    public void addTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureTextIsMutable();
       this.text_.add(p0.toStringUtf8());
    }
    public void clearInputHint(){
       this.inputHint_ = TriggerInputTextData.getDefaultInstance().getInputHint();
    }
    public void clearText(){
       this.text_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TriggerInputTextData$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TriggerInputTextData();
           case 2:
             return new TriggerInputTextData$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"text_","inputHint_"};
             return GeneratedMessageLite.newMessageInfo(TriggerInputTextData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return TriggerInputTextData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TriggerInputTextData.PARSER;
             if (pARSER == null) {
                _monitor_enter(TriggerInputTextData.class);
                pARSER = TriggerInputTextData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TriggerInputTextData.DEFAULT_INSTANCE);
                   TriggerInputTextData.PARSER = pARSER;
                }
                _monitor_exit(TriggerInputTextData.class);
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
    public final void ensureTextIsMutable(){
       if (!this.text_.isModifiable()) {
          this.text_ = GeneratedMessageLite.mutableCopy(this.text_);
       }
       return;
    }
    public String getInputHint(){
       return this.inputHint_;
    }
    public ByteString getInputHintBytes(){
       return ByteString.copyFromUtf8(this.inputHint_);
    }
    public String getText(int p0){
       return this.text_.get(p0);
    }
    public ByteString getTextBytes(int p0){
       return ByteString.copyFromUtf8(this.text_.get(p0));
    }
    public int getTextCount(){
       return this.text_.size();
    }
    public List getTextList(){
       return this.text_;
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
    public void setText(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureTextIsMutable();
       this.text_.set(p0, p1);
    }
}

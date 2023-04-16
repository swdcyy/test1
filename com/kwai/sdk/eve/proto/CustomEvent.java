package com.kwai.sdk.eve.proto.CustomEvent;
import com.kwai.sdk.eve.proto.CustomEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
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
import com.kwai.sdk.eve.proto.CustomEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CustomEvent extends GeneratedMessageLite implements CustomEventOrBuilder	// class@0015e7
{
    public String customKey_;
    public String customValue_;
    public String page_;
    public String referPage_;
    public String taskId_;
    public static final CustomEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CustomEvent uCustomEvent = new CustomEvent();
       CustomEvent.DEFAULT_INSTANCE = uCustomEvent;
       GeneratedMessageLite.registerDefaultInstance(CustomEvent.class, uCustomEvent);
    }
    public void CustomEvent(){
       super();
       this.customKey_ = "";
       this.customValue_ = "";
       this.page_ = "";
       this.referPage_ = "";
       this.taskId_ = "";
    }
    public static CustomEvent getDefaultInstance(){
       return CustomEvent.DEFAULT_INSTANCE;
    }
    public static CustomEvent$Builder newBuilder(){
       return CustomEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static CustomEvent$Builder newBuilder(CustomEvent p0){
       return CustomEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CustomEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0);
    }
    public static CustomEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CustomEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCustomKey(){
       this.customKey_ = CustomEvent.getDefaultInstance().getCustomKey();
    }
    public void clearCustomValue(){
       this.customValue_ = CustomEvent.getDefaultInstance().getCustomValue();
    }
    public void clearPage(){
       this.page_ = CustomEvent.getDefaultInstance().getPage();
    }
    public void clearReferPage(){
       this.referPage_ = CustomEvent.getDefaultInstance().getReferPage();
    }
    public void clearTaskId(){
       this.taskId_ = CustomEvent.getDefaultInstance().getTaskId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CustomEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CustomEvent();
           case 2:
             return new CustomEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"customKey_","customValue_","page_","referPage_","taskId_"};
             return GeneratedMessageLite.newMessageInfo(CustomEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x00", objArray);
           case 4:
             return CustomEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CustomEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(CustomEvent.class);
                pARSER = CustomEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CustomEvent.DEFAULT_INSTANCE);
                   CustomEvent.PARSER = pARSER;
                }
                _monitor_exit(CustomEvent.class);
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
    public String getCustomKey(){
       return this.customKey_;
    }
    public ByteString getCustomKeyBytes(){
       return ByteString.copyFromUtf8(this.customKey_);
    }
    public String getCustomValue(){
       return this.customValue_;
    }
    public ByteString getCustomValueBytes(){
       return ByteString.copyFromUtf8(this.customValue_);
    }
    public String getPage(){
       return this.page_;
    }
    public ByteString getPageBytes(){
       return ByteString.copyFromUtf8(this.page_);
    }
    public String getReferPage(){
       return this.referPage_;
    }
    public ByteString getReferPageBytes(){
       return ByteString.copyFromUtf8(this.referPage_);
    }
    public String getTaskId(){
       return this.taskId_;
    }
    public ByteString getTaskIdBytes(){
       return ByteString.copyFromUtf8(this.taskId_);
    }
    public void setCustomKey(String p0){
       Objects.requireNonNull(p0);
       this.customKey_ = p0;
    }
    public void setCustomKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.customKey_ = p0.toStringUtf8();
    }
    public void setCustomValue(String p0){
       Objects.requireNonNull(p0);
       this.customValue_ = p0;
    }
    public void setCustomValueBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.customValue_ = p0.toStringUtf8();
    }
    public void setPage(String p0){
       Objects.requireNonNull(p0);
       this.page_ = p0;
    }
    public void setPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.page_ = p0.toStringUtf8();
    }
    public void setReferPage(String p0){
       Objects.requireNonNull(p0);
       this.referPage_ = p0;
    }
    public void setReferPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.referPage_ = p0.toStringUtf8();
    }
    public void setTaskId(String p0){
       Objects.requireNonNull(p0);
       this.taskId_ = p0;
    }
    public void setTaskIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.taskId_ = p0.toStringUtf8();
    }
}

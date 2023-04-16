package com.kuaishou.edit.draft.EditConfig;
import z30.y;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.EditConfig$b;
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
import com.kuaishou.edit.draft.EditConfig$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class EditConfig extends GeneratedMessageLite implements y	// class@001778
{
    public boolean disableAddImage_;
    public boolean disableMoment_;
    public boolean disableNextStep_;
    public boolean disableRecover_;
    public String momentButtonText_;
    public String segmentIconTitle_;
    public static final EditConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EditConfig uEditConfig = new EditConfig();
       EditConfig.DEFAULT_INSTANCE = uEditConfig;
       GeneratedMessageLite.registerDefaultInstance(EditConfig.class, uEditConfig);
    }
    public void EditConfig(){
       super();
       this.momentButtonText_ = "";
       this.segmentIconTitle_ = "";
    }
    public static EditConfig getDefaultInstance(){
       return EditConfig.DEFAULT_INSTANCE;
    }
    public static EditConfig$b newBuilder(){
       return EditConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static EditConfig$b newBuilder(EditConfig p0){
       return EditConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EditConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0);
    }
    public static EditConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EditConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDisableAddImage(){
       this.disableAddImage_ = false;
    }
    public void clearDisableMoment(){
       this.disableMoment_ = false;
    }
    public void clearDisableNextStep(){
       this.disableNextStep_ = false;
    }
    public void clearDisableRecover(){
       this.disableRecover_ = false;
    }
    public void clearMomentButtonText(){
       this.momentButtonText_ = EditConfig.getDefaultInstance().getMomentButtonText();
    }
    public void clearSegmentIconTitle(){
       this.segmentIconTitle_ = EditConfig.getDefaultInstance().getSegmentIconTitle();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EditConfig$a.a[p0.ordinal()]){
           case 1:
             return new EditConfig();
           case 2:
             return new EditConfig$b(p2);
           case 3:
             Object[] objArray = new Object[]{"disableAddImage_","disableMoment_","disableNextStep_","momentButtonText_","disableRecover_","segmentIconTitle_"};
             return GeneratedMessageLite.newMessageInfo(EditConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x02\x02\x05\x07\x06\x02\x02\x00", objArray);
           case 4:
             return EditConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EditConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(EditConfig.class);
                pARSER = EditConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EditConfig.DEFAULT_INSTANCE);
                   EditConfig.PARSER = pARSER;
                }
                _monitor_exit(EditConfig.class);
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
    public boolean getDisableAddImage(){
       return this.disableAddImage_;
    }
    public boolean getDisableMoment(){
       return this.disableMoment_;
    }
    public boolean getDisableNextStep(){
       return this.disableNextStep_;
    }
    public boolean getDisableRecover(){
       return this.disableRecover_;
    }
    public String getMomentButtonText(){
       return this.momentButtonText_;
    }
    public ByteString getMomentButtonTextBytes(){
       return ByteString.copyFromUtf8(this.momentButtonText_);
    }
    public String getSegmentIconTitle(){
       return this.segmentIconTitle_;
    }
    public ByteString getSegmentIconTitleBytes(){
       return ByteString.copyFromUtf8(this.segmentIconTitle_);
    }
    public void setDisableAddImage(boolean p0){
       this.disableAddImage_ = p0;
    }
    public void setDisableMoment(boolean p0){
       this.disableMoment_ = p0;
    }
    public void setDisableNextStep(boolean p0){
       this.disableNextStep_ = p0;
    }
    public void setDisableRecover(boolean p0){
       this.disableRecover_ = p0;
    }
    public void setMomentButtonText(String p0){
       Objects.requireNonNull(p0);
       this.momentButtonText_ = p0;
    }
    public void setMomentButtonTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.momentButtonText_ = p0.toStringUtf8();
    }
    public void setSegmentIconTitle(String p0){
       Objects.requireNonNull(p0);
       this.segmentIconTitle_ = p0;
    }
    public void setSegmentIconTitleBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.segmentIconTitle_ = p0.toStringUtf8();
    }
}

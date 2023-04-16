package com.kwai.video.westeros.models.CustomInputText;
import com.kwai.video.westeros.models.CustomInputTextOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.CustomInputText$Builder;
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
import com.kwai.video.westeros.models.CustomInputText$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CustomInputText extends GeneratedMessageLite implements CustomInputTextOrBuilder	// class@000ef5
{
    public int index_;
    public String inputText_;
    public static final CustomInputText DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CustomInputText uCustomInput = new CustomInputText();
       CustomInputText.DEFAULT_INSTANCE = uCustomInput;
       GeneratedMessageLite.registerDefaultInstance(CustomInputText.class, uCustomInput);
    }
    public void CustomInputText(){
       super();
       this.inputText_ = "";
    }
    public static CustomInputText getDefaultInstance(){
       return CustomInputText.DEFAULT_INSTANCE;
    }
    public static CustomInputText$Builder newBuilder(){
       return CustomInputText.DEFAULT_INSTANCE.createBuilder();
    }
    public static CustomInputText$Builder newBuilder(CustomInputText p0){
       return CustomInputText.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CustomInputText parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomInputText parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomInputText parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomInputText parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomInputText parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomInputText parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0);
    }
    public static CustomInputText parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomInputText.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CustomInputText.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIndex(){
       this.index_ = 0;
    }
    public void clearInputText(){
       this.inputText_ = CustomInputText.getDefaultInstance().getInputText();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CustomInputText$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CustomInputText();
           case 2:
             return new CustomInputText$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"index_","inputText_"};
             return GeneratedMessageLite.newMessageInfo(CustomInputText.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02\x00", objArray);
           case 4:
             return CustomInputText.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CustomInputText.PARSER;
             if (pARSER == null) {
                _monitor_enter(CustomInputText.class);
                pARSER = CustomInputText.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CustomInputText.DEFAULT_INSTANCE);
                   CustomInputText.PARSER = pARSER;
                }
                _monitor_exit(CustomInputText.class);
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
    public int getIndex(){
       return this.index_;
    }
    public String getInputText(){
       return this.inputText_;
    }
    public ByteString getInputTextBytes(){
       return ByteString.copyFromUtf8(this.inputText_);
    }
    public void setIndex(int p0){
       this.index_ = p0;
    }
    public void setInputText(String p0){
       Objects.requireNonNull(p0);
       this.inputText_ = p0;
    }
    public void setInputTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.inputText_ = p0.toStringUtf8();
    }
}

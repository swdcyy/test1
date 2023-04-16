package com.google.protobuf.Method;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Method$Builder;
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
import com.google.protobuf.Option;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Method$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Syntax;

public final class Method extends GeneratedMessageLite implements MethodOrBuilder	// class@000483
{
    public String name_;
    public Internal$ProtobufList options_;
    public boolean requestStreaming_;
    public String requestTypeUrl_;
    public boolean responseStreaming_;
    public String responseTypeUrl_;
    public int syntax_;
    public static final Method DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Method method = new Method();
       Method.DEFAULT_INSTANCE = method;
       GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }
    public void Method(){
       super();
       this.name_ = "";
       this.requestTypeUrl_ = "";
       this.responseTypeUrl_ = "";
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static Method getDefaultInstance(){
       return Method.DEFAULT_INSTANCE;
    }
    public static Method$Builder newBuilder(){
       return Method.DEFAULT_INSTANCE.createBuilder();
    }
    public static Method$Builder newBuilder(Method p0){
       return Method.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Method parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Method parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Method parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Method parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Method parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Method parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0);
    }
    public static Method parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Method.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllOptions(Iterable p0){
       this.ensureOptionsIsMutable();
       AbstractMessageLite.addAll(p0, this.options_);
    }
    public void addOptions(int p0,Option p1){
       Objects.requireNonNull(p1);
       this.ensureOptionsIsMutable();
       this.options_.add(p0, p1);
    }
    public void addOptions(Option p0){
       Objects.requireNonNull(p0);
       this.ensureOptionsIsMutable();
       this.options_.add(p0);
    }
    public void clearName(){
       this.name_ = Method.getDefaultInstance().getName();
    }
    public void clearOptions(){
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRequestStreaming(){
       this.requestStreaming_ = false;
    }
    public void clearRequestTypeUrl(){
       this.requestTypeUrl_ = Method.getDefaultInstance().getRequestTypeUrl();
    }
    public void clearResponseStreaming(){
       this.responseStreaming_ = false;
    }
    public void clearResponseTypeUrl(){
       this.responseTypeUrl_ = Method.getDefaultInstance().getResponseTypeUrl();
    }
    public void clearSyntax(){
       this.syntax_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Method$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Method();
           case 2:
             return new Method$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","requestTypeUrl_","requestStreaming_","responseTypeUrl_","responseStreaming_","options_",Option.class,"syntax_"};
             return GeneratedMessageLite.newMessageInfo(Method.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x02\x02\x05\x07\x06\x1b\x07\f\x00", objArray);
           case 4:
             return Method.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Method.PARSER;
             if (pARSER == null) {
                _monitor_enter(Method.class);
                pARSER = Method.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Method.DEFAULT_INSTANCE);
                   Method.PARSER = pARSER;
                }
                _monitor_exit(Method.class);
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
    public final void ensureOptionsIsMutable(){
       if (!this.options_.isModifiable()) {
          this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
       }
       return;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public Option getOptions(int p0){
       return this.options_.get(p0);
    }
    public int getOptionsCount(){
       return this.options_.size();
    }
    public List getOptionsList(){
       return this.options_;
    }
    public OptionOrBuilder getOptionsOrBuilder(int p0){
       return this.options_.get(p0);
    }
    public List getOptionsOrBuilderList(){
       return this.options_;
    }
    public boolean getRequestStreaming(){
       return this.requestStreaming_;
    }
    public String getRequestTypeUrl(){
       return this.requestTypeUrl_;
    }
    public ByteString getRequestTypeUrlBytes(){
       return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }
    public boolean getResponseStreaming(){
       return this.responseStreaming_;
    }
    public String getResponseTypeUrl(){
       return this.responseTypeUrl_;
    }
    public ByteString getResponseTypeUrlBytes(){
       return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }
    public Syntax getSyntax(){
       Syntax syntax = Syntax.forNumber(this.syntax_);
       if (syntax == null) {
          syntax = Syntax.UNRECOGNIZED;
       }
       return syntax;
    }
    public int getSyntaxValue(){
       return this.syntax_;
    }
    public void removeOptions(int p0){
       this.ensureOptionsIsMutable();
       this.options_.remove(p0);
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setOptions(int p0,Option p1){
       Objects.requireNonNull(p1);
       this.ensureOptionsIsMutable();
       this.options_.set(p0, p1);
    }
    public void setRequestStreaming(boolean p0){
       this.requestStreaming_ = p0;
    }
    public void setRequestTypeUrl(String p0){
       Objects.requireNonNull(p0);
       this.requestTypeUrl_ = p0;
    }
    public void setRequestTypeUrlBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.requestTypeUrl_ = p0.toStringUtf8();
    }
    public void setResponseStreaming(boolean p0){
       this.responseStreaming_ = p0;
    }
    public void setResponseTypeUrl(String p0){
       Objects.requireNonNull(p0);
       this.responseTypeUrl_ = p0;
    }
    public void setResponseTypeUrlBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.responseTypeUrl_ = p0.toStringUtf8();
    }
    public void setSyntax(Syntax p0){
       this.syntax_ = p0.getNumber();
    }
    public void setSyntaxValue(int p0){
       this.syntax_ = p0;
    }
}

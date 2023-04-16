package com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Api$Builder;
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
import com.google.protobuf.Method;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Api$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Api extends GeneratedMessageLite implements ApiOrBuilder	// class@0003b2
{
    public Internal$ProtobufList methods_;
    public Internal$ProtobufList mixins_;
    public String name_;
    public Internal$ProtobufList options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;
    public static final Api DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Api uApi = new Api();
       Api.DEFAULT_INSTANCE = uApi;
       GeneratedMessageLite.registerDefaultInstance(Api.class, uApi);
    }
    public void Api(){
       super();
       this.name_ = "";
       this.methods_ = GeneratedMessageLite.emptyProtobufList();
       this.options_ = GeneratedMessageLite.emptyProtobufList();
       this.version_ = "";
       this.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static Api getDefaultInstance(){
       return Api.DEFAULT_INSTANCE;
    }
    public static Api$Builder newBuilder(){
       return Api.DEFAULT_INSTANCE.createBuilder();
    }
    public static Api$Builder newBuilder(Api p0){
       return Api.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Api parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Api parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Api parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Api parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Api parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Api parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0);
    }
    public static Api parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Api.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllMethods(Iterable p0){
       this.ensureMethodsIsMutable();
       AbstractMessageLite.addAll(p0, this.methods_);
    }
    public void addAllMixins(Iterable p0){
       this.ensureMixinsIsMutable();
       AbstractMessageLite.addAll(p0, this.mixins_);
    }
    public void addAllOptions(Iterable p0){
       this.ensureOptionsIsMutable();
       AbstractMessageLite.addAll(p0, this.options_);
    }
    public void addMethods(int p0,Method p1){
       Objects.requireNonNull(p1);
       this.ensureMethodsIsMutable();
       this.methods_.add(p0, p1);
    }
    public void addMethods(Method p0){
       Objects.requireNonNull(p0);
       this.ensureMethodsIsMutable();
       this.methods_.add(p0);
    }
    public void addMixins(int p0,Mixin p1){
       Objects.requireNonNull(p1);
       this.ensureMixinsIsMutable();
       this.mixins_.add(p0, p1);
    }
    public void addMixins(Mixin p0){
       Objects.requireNonNull(p0);
       this.ensureMixinsIsMutable();
       this.mixins_.add(p0);
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
    public void clearMethods(){
       this.methods_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMixins(){
       this.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearName(){
       this.name_ = Api.getDefaultInstance().getName();
    }
    public void clearOptions(){
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSourceContext(){
       this.sourceContext_ = null;
    }
    public void clearSyntax(){
       this.syntax_ = 0;
    }
    public void clearVersion(){
       this.version_ = Api.getDefaultInstance().getVersion();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Api$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Api();
           case 2:
             return new Api$Builder(p2);
           case 3:
             Object[] objArray = new Object[10];
             objArray[0] = "name_";
             objArray[i] = "methods_";
             objArray[2] = Method.class;
             objArray[3] = "options_";
             objArray[4] = Option.class;
             objArray[5] = "version_";
             objArray[6] = "sourceContext_";
             objArray[7] = "mixins_";
             objArray[8] = Mixin.class;
             objArray[9] = "syntax_";
             return GeneratedMessageLite.newMessageInfo(Api.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x02\x02\x02\x1b\x03\x1b\x04\x02\x02\x05\t\x06\x1b\x07\f\x00", objArray);
           case 4:
             return Api.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Api.PARSER;
             if (pARSER == null) {
                _monitor_enter(Api.class);
                pARSER = Api.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Api.DEFAULT_INSTANCE);
                   Api.PARSER = pARSER;
                }
                _monitor_exit(Api.class);
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
    public final void ensureMethodsIsMutable(){
       if (!this.methods_.isModifiable()) {
          this.methods_ = GeneratedMessageLite.mutableCopy(this.methods_);
       }
       return;
    }
    public final void ensureMixinsIsMutable(){
       if (!this.mixins_.isModifiable()) {
          this.mixins_ = GeneratedMessageLite.mutableCopy(this.mixins_);
       }
       return;
    }
    public final void ensureOptionsIsMutable(){
       if (!this.options_.isModifiable()) {
          this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
       }
       return;
    }
    public Method getMethods(int p0){
       return this.methods_.get(p0);
    }
    public int getMethodsCount(){
       return this.methods_.size();
    }
    public List getMethodsList(){
       return this.methods_;
    }
    public MethodOrBuilder getMethodsOrBuilder(int p0){
       return this.methods_.get(p0);
    }
    public List getMethodsOrBuilderList(){
       return this.methods_;
    }
    public Mixin getMixins(int p0){
       return this.mixins_.get(p0);
    }
    public int getMixinsCount(){
       return this.mixins_.size();
    }
    public List getMixinsList(){
       return this.mixins_;
    }
    public MixinOrBuilder getMixinsOrBuilder(int p0){
       return this.mixins_.get(p0);
    }
    public List getMixinsOrBuilderList(){
       return this.mixins_;
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
    public SourceContext getSourceContext(){
       Api tsourceConte = this.sourceContext_;
       if (tsourceConte == null) {
          tsourceConte = SourceContext.getDefaultInstance();
       }
       return tsourceConte;
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
    public String getVersion(){
       return this.version_;
    }
    public ByteString getVersionBytes(){
       return ByteString.copyFromUtf8(this.version_);
    }
    public boolean hasSourceContext(){
       boolean b = (this.sourceContext_ != null)? true: false;
       return b;
    }
    public void mergeSourceContext(SourceContext p0){
       Objects.requireNonNull(p0);
       Api tsourceConte = this.sourceContext_;
       this.sourceContext_ = (tsourceConte != null && tsourceConte != SourceContext.getDefaultInstance())? SourceContext.newBuilder(this.sourceContext_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeMethods(int p0){
       this.ensureMethodsIsMutable();
       this.methods_.remove(p0);
    }
    public void removeMixins(int p0){
       this.ensureMixinsIsMutable();
       this.mixins_.remove(p0);
    }
    public void removeOptions(int p0){
       this.ensureOptionsIsMutable();
       this.options_.remove(p0);
    }
    public void setMethods(int p0,Method p1){
       Objects.requireNonNull(p1);
       this.ensureMethodsIsMutable();
       this.methods_.set(p0, p1);
    }
    public void setMixins(int p0,Mixin p1){
       Objects.requireNonNull(p1);
       this.ensureMixinsIsMutable();
       this.mixins_.set(p0, p1);
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
    public void setSourceContext(SourceContext p0){
       Objects.requireNonNull(p0);
       this.sourceContext_ = p0;
    }
    public void setSyntax(Syntax p0){
       this.syntax_ = p0.getNumber();
    }
    public void setSyntaxValue(int p0){
       this.syntax_ = p0;
    }
    public void setVersion(String p0){
       Objects.requireNonNull(p0);
       this.version_ = p0;
    }
    public void setVersionBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.version_ = p0.toStringUtf8();
    }
}

package com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Enum$Builder;
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
import com.google.protobuf.EnumValue;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.Option;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Enum$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Enum extends GeneratedMessageLite implements EnumOrBuilder	// class@000402
{
    public Internal$ProtobufList enumvalue_;
    public String name_;
    public Internal$ProtobufList options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public static final Enum DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Enum uEnum = new Enum();
       Enum.DEFAULT_INSTANCE = uEnum;
       GeneratedMessageLite.registerDefaultInstance(Enum.class, uEnum);
    }
    public void Enum(){
       super();
       this.name_ = "";
       this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static Enum getDefaultInstance(){
       return Enum.DEFAULT_INSTANCE;
    }
    public static Enum$Builder newBuilder(){
       return Enum.DEFAULT_INSTANCE.createBuilder();
    }
    public static Enum$Builder newBuilder(Enum p0){
       return Enum.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Enum parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Enum parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Enum parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Enum parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Enum parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Enum parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0);
    }
    public static Enum parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Enum.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllEnumvalue(Iterable p0){
       this.ensureEnumvalueIsMutable();
       AbstractMessageLite.addAll(p0, this.enumvalue_);
    }
    public void addAllOptions(Iterable p0){
       this.ensureOptionsIsMutable();
       AbstractMessageLite.addAll(p0, this.options_);
    }
    public void addEnumvalue(int p0,EnumValue p1){
       Objects.requireNonNull(p1);
       this.ensureEnumvalueIsMutable();
       this.enumvalue_.add(p0, p1);
    }
    public void addEnumvalue(EnumValue p0){
       Objects.requireNonNull(p0);
       this.ensureEnumvalueIsMutable();
       this.enumvalue_.add(p0);
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
    public void clearEnumvalue(){
       this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearName(){
       this.name_ = Enum.getDefaultInstance().getName();
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Enum$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Enum();
           case 2:
             return new Enum$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","enumvalue_",EnumValue.class,"options_",Option.class,"sourceContext_","syntax_"};
             return GeneratedMessageLite.newMessageInfo(Enum.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x1b\x03\x1b\x04\t\x05\f\x00", objArray);
           case 4:
             return Enum.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Enum.PARSER;
             if (pARSER == null) {
                _monitor_enter(Enum.class);
                pARSER = Enum.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Enum.DEFAULT_INSTANCE);
                   Enum.PARSER = pARSER;
                }
                _monitor_exit(Enum.class);
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
    public final void ensureEnumvalueIsMutable(){
       if (!this.enumvalue_.isModifiable()) {
          this.enumvalue_ = GeneratedMessageLite.mutableCopy(this.enumvalue_);
       }
       return;
    }
    public final void ensureOptionsIsMutable(){
       if (!this.options_.isModifiable()) {
          this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
       }
       return;
    }
    public EnumValue getEnumvalue(int p0){
       return this.enumvalue_.get(p0);
    }
    public int getEnumvalueCount(){
       return this.enumvalue_.size();
    }
    public List getEnumvalueList(){
       return this.enumvalue_;
    }
    public EnumValueOrBuilder getEnumvalueOrBuilder(int p0){
       return this.enumvalue_.get(p0);
    }
    public List getEnumvalueOrBuilderList(){
       return this.enumvalue_;
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
       Enum tsourceConte = this.sourceContext_;
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
    public boolean hasSourceContext(){
       boolean b = (this.sourceContext_ != null)? true: false;
       return b;
    }
    public void mergeSourceContext(SourceContext p0){
       Objects.requireNonNull(p0);
       Enum tsourceConte = this.sourceContext_;
       this.sourceContext_ = (tsourceConte != null && tsourceConte != SourceContext.getDefaultInstance())? SourceContext.newBuilder(this.sourceContext_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeEnumvalue(int p0){
       this.ensureEnumvalueIsMutable();
       this.enumvalue_.remove(p0);
    }
    public void removeOptions(int p0){
       this.ensureOptionsIsMutable();
       this.options_.remove(p0);
    }
    public void setEnumvalue(int p0,EnumValue p1){
       Objects.requireNonNull(p1);
       this.ensureEnumvalueIsMutable();
       this.enumvalue_.set(p0, p1);
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
}

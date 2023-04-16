package com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Type$Builder;
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
import com.google.protobuf.Field;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.Option;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Type$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Type extends GeneratedMessageLite implements TypeOrBuilder	// class@0004d2
{
    public Internal$ProtobufList fields_;
    public String name_;
    public Internal$ProtobufList oneofs_;
    public Internal$ProtobufList options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public static final Type DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Type type = new Type();
       Type.DEFAULT_INSTANCE = type;
       GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }
    public void Type(){
       super();
       this.name_ = "";
       this.fields_ = GeneratedMessageLite.emptyProtobufList();
       this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static Type getDefaultInstance(){
       return Type.DEFAULT_INSTANCE;
    }
    public static Type$Builder newBuilder(){
       return Type.DEFAULT_INSTANCE.createBuilder();
    }
    public static Type$Builder newBuilder(Type p0){
       return Type.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Type parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Type parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Type parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Type parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Type parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Type parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0);
    }
    public static Type parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Type.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllFields(Iterable p0){
       this.ensureFieldsIsMutable();
       AbstractMessageLite.addAll(p0, this.fields_);
    }
    public void addAllOneofs(Iterable p0){
       this.ensureOneofsIsMutable();
       AbstractMessageLite.addAll(p0, this.oneofs_);
    }
    public void addAllOptions(Iterable p0){
       this.ensureOptionsIsMutable();
       AbstractMessageLite.addAll(p0, this.options_);
    }
    public void addFields(int p0,Field p1){
       Objects.requireNonNull(p1);
       this.ensureFieldsIsMutable();
       this.fields_.add(p0, p1);
    }
    public void addFields(Field p0){
       Objects.requireNonNull(p0);
       this.ensureFieldsIsMutable();
       this.fields_.add(p0);
    }
    public void addOneofs(String p0){
       Objects.requireNonNull(p0);
       this.ensureOneofsIsMutable();
       this.oneofs_.add(p0);
    }
    public void addOneofsBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureOneofsIsMutable();
       this.oneofs_.add(p0.toStringUtf8());
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
    public void clearFields(){
       this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearName(){
       this.name_ = Type.getDefaultInstance().getName();
    }
    public void clearOneofs(){
       this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
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
       switch (Type$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Type();
           case 2:
             return new Type$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","fields_",Field.class,"oneofs_","options_",Option.class,"sourceContext_","syntax_"};
             return GeneratedMessageLite.newMessageInfo(Type.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x02\x02\x02\x1b\x03\x02\x02\x04\x1b\x05\t\x06\f\x00", objArray);
           case 4:
             return Type.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Type.PARSER;
             if (pARSER == null) {
                _monitor_enter(Type.class);
                pARSER = Type.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Type.DEFAULT_INSTANCE);
                   Type.PARSER = pARSER;
                }
                _monitor_exit(Type.class);
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
    public final void ensureFieldsIsMutable(){
       if (!this.fields_.isModifiable()) {
          this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
       }
       return;
    }
    public final void ensureOneofsIsMutable(){
       if (!this.oneofs_.isModifiable()) {
          this.oneofs_ = GeneratedMessageLite.mutableCopy(this.oneofs_);
       }
       return;
    }
    public final void ensureOptionsIsMutable(){
       if (!this.options_.isModifiable()) {
          this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
       }
       return;
    }
    public Field getFields(int p0){
       return this.fields_.get(p0);
    }
    public int getFieldsCount(){
       return this.fields_.size();
    }
    public List getFieldsList(){
       return this.fields_;
    }
    public FieldOrBuilder getFieldsOrBuilder(int p0){
       return this.fields_.get(p0);
    }
    public List getFieldsOrBuilderList(){
       return this.fields_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public String getOneofs(int p0){
       return this.oneofs_.get(p0);
    }
    public ByteString getOneofsBytes(int p0){
       return ByteString.copyFromUtf8(this.oneofs_.get(p0));
    }
    public int getOneofsCount(){
       return this.oneofs_.size();
    }
    public List getOneofsList(){
       return this.oneofs_;
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
       Type tsourceConte = this.sourceContext_;
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
       Type tsourceConte = this.sourceContext_;
       this.sourceContext_ = (tsourceConte != null && tsourceConte != SourceContext.getDefaultInstance())? SourceContext.newBuilder(this.sourceContext_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeFields(int p0){
       this.ensureFieldsIsMutable();
       this.fields_.remove(p0);
    }
    public void removeOptions(int p0){
       this.ensureOptionsIsMutable();
       this.options_.remove(p0);
    }
    public void setFields(int p0,Field p1){
       Objects.requireNonNull(p1);
       this.ensureFieldsIsMutable();
       this.fields_.set(p0, p1);
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setOneofs(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureOneofsIsMutable();
       this.oneofs_.set(p0, p1);
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

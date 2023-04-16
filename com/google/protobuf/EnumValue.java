package com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.EnumValue$Builder;
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
import com.google.protobuf.EnumValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.OptionOrBuilder;

public final class EnumValue extends GeneratedMessageLite implements EnumValueOrBuilder	// class@000406
{
    public String name_;
    public int number_;
    public Internal$ProtobufList options_;
    public static final EnumValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EnumValue uEnumValue = new EnumValue();
       EnumValue.DEFAULT_INSTANCE = uEnumValue;
       GeneratedMessageLite.registerDefaultInstance(EnumValue.class, uEnumValue);
    }
    public void EnumValue(){
       super();
       this.name_ = "";
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EnumValue getDefaultInstance(){
       return EnumValue.DEFAULT_INSTANCE;
    }
    public static EnumValue$Builder newBuilder(){
       return EnumValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static EnumValue$Builder newBuilder(EnumValue p0){
       return EnumValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EnumValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnumValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnumValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnumValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnumValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static EnumValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static EnumValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EnumValue.DEFAULT_INSTANCE.getParserForType();
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
       this.name_ = EnumValue.getDefaultInstance().getName();
    }
    public void clearNumber(){
       this.number_ = 0;
    }
    public void clearOptions(){
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EnumValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EnumValue();
           case 2:
             return new EnumValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","number_","options_",Option.class};
             return GeneratedMessageLite.newMessageInfo(EnumValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x04\x03\x1b\x00", objArray);
           case 4:
             return EnumValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EnumValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(EnumValue.class);
                pARSER = EnumValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EnumValue.DEFAULT_INSTANCE);
                   EnumValue.PARSER = pARSER;
                }
                _monitor_exit(EnumValue.class);
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
    public int getNumber(){
       return this.number_;
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
    public void setNumber(int p0){
       this.number_ = p0;
    }
    public void setOptions(int p0,Option p1){
       Objects.requireNonNull(p1);
       this.ensureOptionsIsMutable();
       this.options_.set(p0, p1);
    }
}

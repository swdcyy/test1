package com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Option$Builder;
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
import com.google.protobuf.Option$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Any;
import java.util.Objects;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class Option extends GeneratedMessageLite implements OptionOrBuilder	// class@000496
{
    public String name_;
    public Any value_;
    public static final Option DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Option option = new Option();
       Option.DEFAULT_INSTANCE = option;
       GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }
    public void Option(){
       super();
       this.name_ = "";
    }
    public static Option getDefaultInstance(){
       return Option.DEFAULT_INSTANCE;
    }
    public static Option$Builder newBuilder(){
       return Option.DEFAULT_INSTANCE.createBuilder();
    }
    public static Option$Builder newBuilder(Option p0){
       return Option.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Option parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Option parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Option parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Option parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Option parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Option parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0);
    }
    public static Option parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Option.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearName(){
       this.name_ = Option.getDefaultInstance().getName();
    }
    public void clearValue(){
       this.value_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Option$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Option();
           case 2:
             return new Option$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","value_"};
             return GeneratedMessageLite.newMessageInfo(Option.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x00", objArray);
           case 4:
             return Option.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Option.PARSER;
             if (pARSER == null) {
                _monitor_enter(Option.class);
                pARSER = Option.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Option.DEFAULT_INSTANCE);
                   Option.PARSER = pARSER;
                }
                _monitor_exit(Option.class);
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
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public Any getValue(){
       Option tvalue_ = this.value_;
       if (tvalue_ == null) {
          tvalue_ = Any.getDefaultInstance();
       }
       return tvalue_;
    }
    public boolean hasValue(){
       boolean b = (this.value_ != null)? true: false;
       return b;
    }
    public void mergeValue(Any p0){
       Objects.requireNonNull(p0);
       Option tvalue_ = this.value_;
       this.value_ = (tvalue_ != null && tvalue_ != Any.getDefaultInstance())? Any.newBuilder(this.value_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setValue(Any p0){
       Objects.requireNonNull(p0);
       this.value_ = p0;
    }
}

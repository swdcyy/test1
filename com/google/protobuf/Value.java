package com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Value$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Value$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.Struct;
import com.google.protobuf.ListValue;
import com.google.protobuf.MessageLite;
import java.lang.String;
import java.lang.Boolean;
import com.google.protobuf.Value$KindCase;
import com.google.protobuf.NullValue;
import java.lang.Integer;
import java.lang.Double;
import java.util.Objects;
import com.google.protobuf.ListValue$Builder;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class Value extends GeneratedMessageLite implements ValueOrBuilder	// class@0004f3
{
    public int kindCase_;
    public Object kind_;
    public static final Value DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Value value = new Value();
       Value.DEFAULT_INSTANCE = value;
       GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }
    public void Value(){
       super();
       this.kindCase_ = 0;
    }
    public static Value getDefaultInstance(){
       return Value.DEFAULT_INSTANCE;
    }
    public static Value$Builder newBuilder(){
       return Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static Value$Builder newBuilder(Value p0){
       return Value.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Value parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Value parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Value parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Value parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Value parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Value parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0);
    }
    public static Value parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Value.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBoolValue(){
       if (this.kindCase_ == 4) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearKind(){
       this.kindCase_ = 0;
       this.kind_ = null;
    }
    public void clearListValue(){
       if (this.kindCase_ == 6) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearNullValue(){
       if (this.kindCase_ == 1) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearNumberValue(){
       if (this.kindCase_ == 2) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearStringValue(){
       if (this.kindCase_ == 3) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearStructValue(){
       if (this.kindCase_ == 5) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Value();
           case 2:
             return new Value$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"kind_","kindCase_",Struct.class,ListValue.class};
             return GeneratedMessageLite.newMessageInfo(Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\x01\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01?\xff\x02\xff\x02\x023\xff\x02\xff\x02\x03\x02\x02\xff\x02\xff\x02\x04:\xff\x02\xff\x02\x05<\xff\x02\xff\x02\x06<\xff\x02\xff\x02\x00", objArray);
           case 4:
             return Value.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Value.PARSER;
             if (pARSER == null) {
                _monitor_enter(Value.class);
                pARSER = Value.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Value.DEFAULT_INSTANCE);
                   Value.PARSER = pARSER;
                }
                _monitor_exit(Value.class);
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
    public boolean getBoolValue(){
       if (this.kindCase_ == 4) {
          return this.kind_.booleanValue();
       }
       return false;
    }
    public Value$KindCase getKindCase(){
       return Value$KindCase.forNumber(this.kindCase_);
    }
    public ListValue getListValue(){
       if (this.kindCase_ == 6) {
          return this.kind_;
       }
       return ListValue.getDefaultInstance();
    }
    public NullValue getNullValue(){
       if (this.kindCase_ != 1) {
          return NullValue.NULL_VALUE;
       }
       NullValue nullValue = NullValue.forNumber(this.kind_.intValue());
       if (nullValue == null) {
          nullValue = NullValue.UNRECOGNIZED;
       }
       return nullValue;
    }
    public int getNullValueValue(){
       if (this.kindCase_ == 1) {
          return this.kind_.intValue();
       }
       return 0;
    }
    public double getNumberValue(){
       if (this.kindCase_ == 2) {
          return this.kind_.doubleValue();
       }
       return 0;
    }
    public String getStringValue(){
       Value tkind_ = (this.kindCase_ == 3)? this.kind_: "";
       return tkind_;
    }
    public ByteString getStringValueBytes(){
       Value tkind_ = (this.kindCase_ == 3)? this.kind_: "";
       return ByteString.copyFromUtf8(tkind_);
    }
    public Struct getStructValue(){
       if (this.kindCase_ == 5) {
          return this.kind_;
       }
       return Struct.getDefaultInstance();
    }
    public boolean hasListValue(){
       boolean b = (this.kindCase_ == 6)? true: false;
       return b;
    }
    public boolean hasStructValue(){
       boolean b = (this.kindCase_ == 5)? true: false;
       return b;
    }
    public void mergeListValue(ListValue p0){
       Objects.requireNonNull(p0);
       this.kind_ = (this.kindCase_ == 6 && this.kind_ != ListValue.getDefaultInstance())? ListValue.newBuilder(this.kind_).mergeFrom(p0).buildPartial(): p0;
       this.kindCase_ = 6;
       return;
    }
    public void mergeStructValue(Struct p0){
       Objects.requireNonNull(p0);
       this.kind_ = (this.kindCase_ == 5 && this.kind_ != Struct.getDefaultInstance())? Struct.newBuilder(this.kind_).mergeFrom(p0).buildPartial(): p0;
       this.kindCase_ = 5;
       return;
    }
    public void setBoolValue(boolean p0){
       this.kindCase_ = 4;
       this.kind_ = Boolean.valueOf(p0);
    }
    public void setListValue(ListValue p0){
       Objects.requireNonNull(p0);
       this.kind_ = p0;
       this.kindCase_ = 6;
    }
    public void setNullValue(NullValue p0){
       this.kind_ = Integer.valueOf(p0.getNumber());
       this.kindCase_ = 1;
    }
    public void setNullValueValue(int p0){
       this.kindCase_ = 1;
       this.kind_ = Integer.valueOf(p0);
    }
    public void setNumberValue(double p0){
       this.kindCase_ = 2;
       this.kind_ = Double.valueOf(p0);
    }
    public void setStringValue(String p0){
       Objects.requireNonNull(p0);
       this.kindCase_ = 3;
       this.kind_ = p0;
    }
    public void setStringValueBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.kind_ = p0.toStringUtf8();
       this.kindCase_ = 3;
    }
    public void setStructValue(Struct p0){
       Objects.requireNonNull(p0);
       this.kind_ = p0;
       this.kindCase_ = 5;
    }
}

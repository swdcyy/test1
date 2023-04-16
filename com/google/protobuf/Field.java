package com.google.protobuf.Field;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Field$Builder;
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
import com.google.protobuf.Field$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Field$Cardinality;
import com.google.protobuf.Field$Kind;
import com.google.protobuf.OptionOrBuilder;

public final class Field extends GeneratedMessageLite implements FieldOrBuilder	// class@00041a
{
    public int cardinality_;
    public String defaultValue_;
    public String jsonName_;
    public int kind_;
    public String name_;
    public int number_;
    public int oneofIndex_;
    public Internal$ProtobufList options_;
    public boolean packed_;
    public String typeUrl_;
    public static final Field DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Field uField = new Field();
       Field.DEFAULT_INSTANCE = uField;
       GeneratedMessageLite.registerDefaultInstance(Field.class, uField);
    }
    public void Field(){
       super();
       this.name_ = "";
       this.typeUrl_ = "";
       this.options_ = GeneratedMessageLite.emptyProtobufList();
       this.jsonName_ = "";
       this.defaultValue_ = "";
    }
    public static Field getDefaultInstance(){
       return Field.DEFAULT_INSTANCE;
    }
    public static Field$Builder newBuilder(){
       return Field.DEFAULT_INSTANCE.createBuilder();
    }
    public static Field$Builder newBuilder(Field p0){
       return Field.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Field parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Field parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Field parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Field parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Field parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Field parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0);
    }
    public static Field parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Field.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Field.DEFAULT_INSTANCE.getParserForType();
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
    public void clearCardinality(){
       this.cardinality_ = 0;
    }
    public void clearDefaultValue(){
       this.defaultValue_ = Field.getDefaultInstance().getDefaultValue();
    }
    public void clearJsonName(){
       this.jsonName_ = Field.getDefaultInstance().getJsonName();
    }
    public void clearKind(){
       this.kind_ = 0;
    }
    public void clearName(){
       this.name_ = Field.getDefaultInstance().getName();
    }
    public void clearNumber(){
       this.number_ = 0;
    }
    public void clearOneofIndex(){
       this.oneofIndex_ = 0;
    }
    public void clearOptions(){
       this.options_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearPacked(){
       this.packed_ = false;
    }
    public void clearTypeUrl(){
       this.typeUrl_ = Field.getDefaultInstance().getTypeUrl();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Field$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Field();
           case 2:
             return new Field$Builder(p2);
           case 3:
             Object[] objArray = new Object[11];
             objArray[0] = "kind_";
             objArray[i] = "cardinality_";
             objArray[2] = "number_";
             objArray[3] = "name_";
             objArray[4] = "typeUrl_";
             objArray[5] = "oneofIndex_";
             objArray[6] = "packed_";
             objArray[7] = "options_";
             objArray[8] = Option.class;
             objArray[9] = "jsonName_";
             objArray[10] = "defaultValue_";
             return GeneratedMessageLite.newMessageInfo(Field.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\n\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\f\x03\x04\x04\x02\x02\x06\x02\x02\x07\x04\b\x07\t\x1b\n\x02\x02\x0b\x02\x02\x00", objArray);
           case 4:
             return Field.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Field.PARSER;
             if (pARSER == null) {
                _monitor_enter(Field.class);
                pARSER = Field.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Field.DEFAULT_INSTANCE);
                   Field.PARSER = pARSER;
                }
                _monitor_exit(Field.class);
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
    public Field$Cardinality getCardinality(){
       Field$Cardinality uCardinality = Field$Cardinality.forNumber(this.cardinality_);
       if (uCardinality == null) {
          uCardinality = Field$Cardinality.UNRECOGNIZED;
       }
       return uCardinality;
    }
    public int getCardinalityValue(){
       return this.cardinality_;
    }
    public String getDefaultValue(){
       return this.defaultValue_;
    }
    public ByteString getDefaultValueBytes(){
       return ByteString.copyFromUtf8(this.defaultValue_);
    }
    public String getJsonName(){
       return this.jsonName_;
    }
    public ByteString getJsonNameBytes(){
       return ByteString.copyFromUtf8(this.jsonName_);
    }
    public Field$Kind getKind(){
       Field$Kind kind = Field$Kind.forNumber(this.kind_);
       if (kind == null) {
          kind = Field$Kind.UNRECOGNIZED;
       }
       return kind;
    }
    public int getKindValue(){
       return this.kind_;
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
    public int getOneofIndex(){
       return this.oneofIndex_;
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
    public boolean getPacked(){
       return this.packed_;
    }
    public String getTypeUrl(){
       return this.typeUrl_;
    }
    public ByteString getTypeUrlBytes(){
       return ByteString.copyFromUtf8(this.typeUrl_);
    }
    public void removeOptions(int p0){
       this.ensureOptionsIsMutable();
       this.options_.remove(p0);
    }
    public void setCardinality(Field$Cardinality p0){
       this.cardinality_ = p0.getNumber();
    }
    public void setCardinalityValue(int p0){
       this.cardinality_ = p0;
    }
    public void setDefaultValue(String p0){
       Objects.requireNonNull(p0);
       this.defaultValue_ = p0;
    }
    public void setDefaultValueBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.defaultValue_ = p0.toStringUtf8();
    }
    public void setJsonName(String p0){
       Objects.requireNonNull(p0);
       this.jsonName_ = p0;
    }
    public void setJsonNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.jsonName_ = p0.toStringUtf8();
    }
    public void setKind(Field$Kind p0){
       this.kind_ = p0.getNumber();
    }
    public void setKindValue(int p0){
       this.kind_ = p0;
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
    public void setOneofIndex(int p0){
       this.oneofIndex_ = p0;
    }
    public void setOptions(int p0,Option p1){
       Objects.requireNonNull(p1);
       this.ensureOptionsIsMutable();
       this.options_.set(p0, p1);
    }
    public void setPacked(boolean p0){
       this.packed_ = p0;
    }
    public void setTypeUrl(String p0){
       Objects.requireNonNull(p0);
       this.typeUrl_ = p0;
    }
    public void setTypeUrlBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.typeUrl_ = p0.toStringUtf8();
    }
}

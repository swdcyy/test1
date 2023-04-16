package com.google.protobuf.ListValue;
import com.google.protobuf.ListValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ListValue$Builder;
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
import com.google.protobuf.Value;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.ListValue$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.ValueOrBuilder;

public final class ListValue extends GeneratedMessageLite implements ListValueOrBuilder	// class@00046b
{
    public Internal$ProtobufList values_;
    public static final ListValue DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ListValue listValue = new ListValue();
       ListValue.DEFAULT_INSTANCE = listValue;
       GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue);
    }
    public void ListValue(){
       super();
       this.values_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static ListValue getDefaultInstance(){
       return ListValue.DEFAULT_INSTANCE;
    }
    public static ListValue$Builder newBuilder(){
       return ListValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static ListValue$Builder newBuilder(ListValue p0){
       return ListValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ListValue parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static ListValue parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static ListValue parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static ListValue parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static ListValue parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static ListValue parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0);
    }
    public static ListValue parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ListValue.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllValues(Iterable p0){
       this.ensureValuesIsMutable();
       AbstractMessageLite.addAll(p0, this.values_);
    }
    public void addValues(int p0,Value p1){
       Objects.requireNonNull(p1);
       this.ensureValuesIsMutable();
       this.values_.add(p0, p1);
    }
    public void addValues(Value p0){
       Objects.requireNonNull(p0);
       this.ensureValuesIsMutable();
       this.values_.add(p0);
    }
    public void clearValues(){
       this.values_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ListValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ListValue();
           case 2:
             return new ListValue$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"values_",Value.class};
             return GeneratedMessageLite.newMessageInfo(ListValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return ListValue.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ListValue.PARSER;
             if (pARSER == null) {
                _monitor_enter(ListValue.class);
                pARSER = ListValue.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ListValue.DEFAULT_INSTANCE);
                   ListValue.PARSER = pARSER;
                }
                _monitor_exit(ListValue.class);
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
    public final void ensureValuesIsMutable(){
       if (!this.values_.isModifiable()) {
          this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
       }
       return;
    }
    public Value getValues(int p0){
       return this.values_.get(p0);
    }
    public int getValuesCount(){
       return this.values_.size();
    }
    public List getValuesList(){
       return this.values_;
    }
    public ValueOrBuilder getValuesOrBuilder(int p0){
       return this.values_.get(p0);
    }
    public List getValuesOrBuilderList(){
       return this.values_;
    }
    public void removeValues(int p0){
       this.ensureValuesIsMutable();
       this.values_.remove(p0);
    }
    public void setValues(int p0,Value p1){
       Objects.requireNonNull(p1);
       this.ensureValuesIsMutable();
       this.values_.set(p0, p1);
    }
}

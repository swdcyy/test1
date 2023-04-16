package com.kuaishou.protobuf.kfs.feature.BytesList;
import er4.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.kfs.feature.BytesList$b;
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
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.kfs.feature.BytesList$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class BytesList extends GeneratedMessageLite implements a	// class@000bec
{
    public Internal$ProtobufList value_;
    public static final BytesList DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BytesList uBytesList = new BytesList();
       BytesList.DEFAULT_INSTANCE = uBytesList;
       GeneratedMessageLite.registerDefaultInstance(BytesList.class, uBytesList);
    }
    public void BytesList(){
       super();
       this.value_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static BytesList getDefaultInstance(){
       return BytesList.DEFAULT_INSTANCE;
    }
    public static BytesList$b newBuilder(){
       return BytesList.DEFAULT_INSTANCE.createBuilder();
    }
    public static BytesList$b newBuilder(BytesList p0){
       return BytesList.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BytesList parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesList parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesList parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesList parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesList parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static BytesList parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0);
    }
    public static BytesList parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BytesList.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BytesList.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllValue(Iterable p0){
       this.ensureValueIsMutable();
       AbstractMessageLite.addAll(p0, this.value_);
    }
    public void addValue(ByteString p0){
       Objects.requireNonNull(p0);
       this.ensureValueIsMutable();
       this.value_.add(p0);
    }
    public void clearValue(){
       this.value_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BytesList$a.a[p0.ordinal()]){
           case 1:
             return new BytesList();
           case 2:
             return new BytesList$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(BytesList.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1c\x00", objArray);
           case 4:
             return BytesList.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BytesList.PARSER;
             if (pARSER == null) {
                _monitor_enter(BytesList.class);
                pARSER = BytesList.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BytesList.DEFAULT_INSTANCE);
                   BytesList.PARSER = pARSER;
                }
                _monitor_exit(BytesList.class);
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
    public final void ensureValueIsMutable(){
       if (!this.value_.isModifiable()) {
          this.value_ = GeneratedMessageLite.mutableCopy(this.value_);
       }
       return;
    }
    public ByteString getValue(int p0){
       return this.value_.get(p0);
    }
    public int getValueCount(){
       return this.value_.size();
    }
    public List getValueList(){
       return this.value_;
    }
    public void setValue(int p0,ByteString p1){
       Objects.requireNonNull(p1);
       this.ensureValueIsMutable();
       this.value_.set(p0, p1);
    }
}

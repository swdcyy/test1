package com.kuaishou.protobuf.kfs.feature.Int64List;
import er4.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$LongList;
import com.kuaishou.protobuf.kfs.feature.Int64List$b;
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
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.protobuf.kfs.feature.Int64List$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class Int64List extends GeneratedMessageLite implements c	// class@000bf6
{
    public int valueMemoizedSerializedSize;
    public Internal$LongList value_;
    public static final Int64List DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Int64List int64List = new Int64List();
       Int64List.DEFAULT_INSTANCE = int64List;
       GeneratedMessageLite.registerDefaultInstance(Int64List.class, int64List);
    }
    public void Int64List(){
       super();
       this.valueMemoizedSerializedSize = -1;
       this.value_ = GeneratedMessageLite.emptyLongList();
    }
    public static Int64List getDefaultInstance(){
       return Int64List.DEFAULT_INSTANCE;
    }
    public static Int64List$b newBuilder(){
       return Int64List.DEFAULT_INSTANCE.createBuilder();
    }
    public static Int64List$b newBuilder(Int64List p0){
       return Int64List.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Int64List parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64List parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64List parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64List parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64List parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Int64List parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0);
    }
    public static Int64List parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Int64List.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Int64List.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllValue(Iterable p0){
       this.ensureValueIsMutable();
       AbstractMessageLite.addAll(p0, this.value_);
    }
    public void addValue(long p0){
       this.ensureValueIsMutable();
       this.value_.addLong(p0);
    }
    public void clearValue(){
       this.value_ = GeneratedMessageLite.emptyLongList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Int64List$a.a[p0.ordinal()]){
           case 1:
             return new Int64List();
           case 2:
             return new Int64List$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(Int64List.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01%\x00", objArray);
           case 4:
             return Int64List.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Int64List.PARSER;
             if (pARSER == null) {
                _monitor_enter(Int64List.class);
                pARSER = Int64List.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Int64List.DEFAULT_INSTANCE);
                   Int64List.PARSER = pARSER;
                }
                _monitor_exit(Int64List.class);
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
    public long getValue(int p0){
       return this.value_.getLong(p0);
    }
    public int getValueCount(){
       return this.value_.size();
    }
    public List getValueList(){
       return this.value_;
    }
    public void setValue(int p0,long p1){
       this.ensureValueIsMutable();
       this.value_.setLong(p0, p1);
    }
}

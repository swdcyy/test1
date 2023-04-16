package com.kuaishou.protobuf.kfs.feature.FloatList;
import er4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$FloatList;
import com.kuaishou.protobuf.kfs.feature.FloatList$b;
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
import com.kuaishou.protobuf.kfs.feature.FloatList$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;

public final class FloatList extends GeneratedMessageLite implements b	// class@000bf3
{
    public int valueMemoizedSerializedSize;
    public Internal$FloatList value_;
    public static final FloatList DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FloatList uFloatList = new FloatList();
       FloatList.DEFAULT_INSTANCE = uFloatList;
       GeneratedMessageLite.registerDefaultInstance(FloatList.class, uFloatList);
    }
    public void FloatList(){
       super();
       this.valueMemoizedSerializedSize = -1;
       this.value_ = GeneratedMessageLite.emptyFloatList();
    }
    public static FloatList getDefaultInstance(){
       return FloatList.DEFAULT_INSTANCE;
    }
    public static FloatList$b newBuilder(){
       return FloatList.DEFAULT_INSTANCE.createBuilder();
    }
    public static FloatList$b newBuilder(FloatList p0){
       return FloatList.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FloatList parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatList parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatList parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatList parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatList parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static FloatList parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0);
    }
    public static FloatList parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FloatList.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FloatList.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllValue(Iterable p0){
       this.ensureValueIsMutable();
       AbstractMessageLite.addAll(p0, this.value_);
    }
    public void addValue(float p0){
       this.ensureValueIsMutable();
       this.value_.addFloat(p0);
    }
    public void clearValue(){
       this.value_ = GeneratedMessageLite.emptyFloatList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FloatList$a.a[p0.ordinal()]){
           case 1:
             return new FloatList();
           case 2:
             return new FloatList$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(FloatList.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01$\x00", objArray);
           case 4:
             return FloatList.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FloatList.PARSER;
             if (pARSER == null) {
                _monitor_enter(FloatList.class);
                pARSER = FloatList.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FloatList.DEFAULT_INSTANCE);
                   FloatList.PARSER = pARSER;
                }
                _monitor_exit(FloatList.class);
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
    public float getValue(int p0){
       return this.value_.getFloat(p0);
    }
    public int getValueCount(){
       return this.value_.size();
    }
    public List getValueList(){
       return this.value_;
    }
    public void setValue(int p0,float p1){
       this.ensureValueIsMutable();
       this.value_.setFloat(p0, p1);
    }
}

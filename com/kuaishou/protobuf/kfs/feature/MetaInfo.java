package com.kuaishou.protobuf.kfs.feature.MetaInfo;
import er4.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.kfs.feature.MetaInfo$b;
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
import com.kuaishou.protobuf.kfs.feature.MetaInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MetaInfo extends GeneratedMessageLite implements d	// class@000bf9
{
    public int dimension_;
    public long fid_;
    public String name_;
    public static final MetaInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MetaInfo metaInfo = new MetaInfo();
       MetaInfo.DEFAULT_INSTANCE = metaInfo;
       GeneratedMessageLite.registerDefaultInstance(MetaInfo.class, metaInfo);
    }
    public void MetaInfo(){
       super();
       this.name_ = "";
    }
    public static MetaInfo getDefaultInstance(){
       return MetaInfo.DEFAULT_INSTANCE;
    }
    public static MetaInfo$b newBuilder(){
       return MetaInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static MetaInfo$b newBuilder(MetaInfo p0){
       return MetaInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MetaInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static MetaInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static MetaInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static MetaInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static MetaInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static MetaInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0);
    }
    public static MetaInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MetaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MetaInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDimension(){
       this.dimension_ = 0;
    }
    public void clearFid(){
       this.fid_ = 0;
    }
    public void clearName(){
       this.name_ = MetaInfo.getDefaultInstance().getName();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MetaInfo$a.a[p0.ordinal()]){
           case 1:
             return new MetaInfo();
           case 2:
             return new MetaInfo$b(p2);
           case 3:
             Object[] objArray = new Object[]{"fid_","dimension_","name_"};
             return GeneratedMessageLite.newMessageInfo(MetaInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x02\x04\x03\x02\x02\x00", objArray);
           case 4:
             return MetaInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MetaInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(MetaInfo.class);
                pARSER = MetaInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MetaInfo.DEFAULT_INSTANCE);
                   MetaInfo.PARSER = pARSER;
                }
                _monitor_exit(MetaInfo.class);
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
    public int getDimension(){
       return this.dimension_;
    }
    public long getFid(){
       return this.fid_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public void setDimension(int p0){
       this.dimension_ = p0;
    }
    public void setFid(long p0){
       this.fid_ = p0;
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
}

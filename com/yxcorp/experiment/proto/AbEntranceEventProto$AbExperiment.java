package com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import cv8.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
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
import cv8.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class AbEntranceEventProto$AbExperiment extends GeneratedMessageLite implements b	// class@0011f5
{
    public int count_;
    public int df_;
    public String extraInfo_;
    public long gid_;
    public static final AbEntranceEventProto$AbExperiment DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AbEntranceEventProto$AbExperiment uAbExperimen = new AbEntranceEventProto$AbExperiment();
       AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE = uAbExperimen;
       GeneratedMessageLite.registerDefaultInstance(AbEntranceEventProto$AbExperiment.class, uAbExperimen);
    }
    public void AbEntranceEventProto$AbExperiment(){
       super();
       this.extraInfo_ = "";
    }
    public static AbEntranceEventProto$AbExperiment getDefaultInstance(){
       return AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE;
    }
    public static AbEntranceEventProto$AbExperiment$a newBuilder(){
       return AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE.createBuilder();
    }
    public static AbEntranceEventProto$AbExperiment$a newBuilder(AbEntranceEventProto$AbExperiment p0){
       return AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AbEntranceEventProto$AbExperiment parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbExperiment parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCount(){
       this.count_ = 0;
    }
    public void clearDf(){
       this.df_ = 0;
    }
    public void clearExtraInfo(){
       this.extraInfo_ = AbEntranceEventProto$AbExperiment.getDefaultInstance().getExtraInfo();
    }
    public void clearGid(){
       this.gid_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new AbEntranceEventProto$AbExperiment();
           case 2:
             return new AbEntranceEventProto$AbExperiment$a(p2);
           case 3:
             Object[] objArray = new Object[]{"gid_","count_","df_","extraInfo_"};
             return GeneratedMessageLite.newMessageInfo(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x02\x0b\x03\x0b\x04\x02\x02\x00", objArray);
           case 4:
             return AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AbEntranceEventProto$AbExperiment.PARSER;
             if (pARSER == null) {
                _monitor_enter(AbEntranceEventProto$AbExperiment.class);
                pARSER = AbEntranceEventProto$AbExperiment.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE);
                   AbEntranceEventProto$AbExperiment.PARSER = pARSER;
                }
                _monitor_exit(AbEntranceEventProto$AbExperiment.class);
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
    public int getCount(){
       return this.count_;
    }
    public int getDf(){
       return this.df_;
    }
    public String getExtraInfo(){
       return this.extraInfo_;
    }
    public ByteString getExtraInfoBytes(){
       return ByteString.copyFromUtf8(this.extraInfo_);
    }
    public long getGid(){
       return this.gid_;
    }
    public void setCount(int p0){
       this.count_ = p0;
    }
    public void setDf(int p0){
       this.df_ = p0;
    }
    public void setExtraInfo(String p0){
       Objects.requireNonNull(p0);
       this.extraInfo_ = p0;
    }
    public void setExtraInfoBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.extraInfo_ = p0.toStringUtf8();
    }
    public void setGid(long p0){
       this.gid_ = p0;
    }
}

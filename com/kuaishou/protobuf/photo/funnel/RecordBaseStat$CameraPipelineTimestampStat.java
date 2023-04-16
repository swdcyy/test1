package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class RecordBaseStat$CameraPipelineTimestampStat extends GeneratedMessageLite implements RecordBaseStat$c	// class@000e4c
{
    public long access_;
    public long firstFrame_;
    public long load_;
    public static final RecordBaseStat$CameraPipelineTimestampStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat$CameraPipelineTimestampStat uCameraPipel = new RecordBaseStat$CameraPipelineTimestampStat();
       RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE = uCameraPipel;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat$CameraPipelineTimestampStat.class, uCameraPipel);
    }
    public void RecordBaseStat$CameraPipelineTimestampStat(){
       super();
    }
    public static RecordBaseStat$CameraPipelineTimestampStat getDefaultInstance(){
       return RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$CameraPipelineTimestampStat$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$CameraPipelineTimestampStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$CameraPipelineTimestampStat$a newBuilder(RecordBaseStat$CameraPipelineTimestampStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$CameraPipelineTimestampStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$CameraPipelineTimestampStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$CameraPipelineTimestampStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$CameraPipelineTimestampStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAccess(){
       this.access_ = 0;
    }
    public void clearFirstFrame(){
       this.firstFrame_ = 0;
    }
    public void clearLoad(){
       this.load_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat$CameraPipelineTimestampStat.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat$CameraPipelineTimestampStat();
           case 2:
             return new RecordBaseStat$CameraPipelineTimestampStat$a(p2);
           case 3:
             Object[] objArray = new Object[]{"access_","load_","firstFrame_"};
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x00", objArray);
           case 4:
             return RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat$CameraPipelineTimestampStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat$CameraPipelineTimestampStat.class);
                pARSER = RecordBaseStat$CameraPipelineTimestampStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE);
                   RecordBaseStat$CameraPipelineTimestampStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat$CameraPipelineTimestampStat.class);
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
    public long getAccess(){
       return this.access_;
    }
    public long getFirstFrame(){
       return this.firstFrame_;
    }
    public long getLoad(){
       return this.load_;
    }
    public void setAccess(long p0){
       this.access_ = p0;
    }
    public void setFirstFrame(long p0){
       this.firstFrame_ = p0;
    }
    public void setLoad(long p0){
       this.load_ = p0;
    }
}

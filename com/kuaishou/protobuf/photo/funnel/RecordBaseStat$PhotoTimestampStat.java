package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat$a;
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

public final class RecordBaseStat$PhotoTimestampStat extends GeneratedMessageLite implements RecordBaseStat$e	// class@000e50
{
    public long editFirstFrame_;
    public long preEdit_;
    public long preProcess_;
    public long sdkCallback_;
    public static final RecordBaseStat$PhotoTimestampStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat$PhotoTimestampStat photoTimesta = new RecordBaseStat$PhotoTimestampStat();
       RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE = photoTimesta;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat$PhotoTimestampStat.class, photoTimesta);
    }
    public void RecordBaseStat$PhotoTimestampStat(){
       super();
    }
    public static RecordBaseStat$PhotoTimestampStat getDefaultInstance(){
       return RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$PhotoTimestampStat$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$PhotoTimestampStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$PhotoTimestampStat$a newBuilder(RecordBaseStat$PhotoTimestampStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PhotoTimestampStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PhotoTimestampStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PhotoTimestampStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$PhotoTimestampStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEditFirstFrame(){
       this.editFirstFrame_ = 0;
    }
    public void clearPreEdit(){
       this.preEdit_ = 0;
    }
    public void clearPreProcess(){
       this.preProcess_ = 0;
    }
    public void clearSdkCallback(){
       this.sdkCallback_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat$PhotoTimestampStat.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat$PhotoTimestampStat();
           case 2:
             return new RecordBaseStat$PhotoTimestampStat$a(p2);
           case 3:
             Object[] objArray = new Object[]{"sdkCallback_","preProcess_","preEdit_","editFirstFrame_"};
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x04\x02\x00", objArray);
           case 4:
             return RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat$PhotoTimestampStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat$PhotoTimestampStat.class);
                pARSER = RecordBaseStat$PhotoTimestampStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE);
                   RecordBaseStat$PhotoTimestampStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat$PhotoTimestampStat.class);
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
    public long getEditFirstFrame(){
       return this.editFirstFrame_;
    }
    public long getPreEdit(){
       return this.preEdit_;
    }
    public long getPreProcess(){
       return this.preProcess_;
    }
    public long getSdkCallback(){
       return this.sdkCallback_;
    }
    public void setEditFirstFrame(long p0){
       this.editFirstFrame_ = p0;
    }
    public void setPreEdit(long p0){
       this.preEdit_ = p0;
    }
    public void setPreProcess(long p0){
       this.preProcess_ = p0;
    }
    public void setSdkCallback(long p0){
       this.sdkCallback_ = p0;
    }
}

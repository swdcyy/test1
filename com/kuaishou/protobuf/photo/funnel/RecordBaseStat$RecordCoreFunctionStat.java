package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$f;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat$a;
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

public final class RecordBaseStat$RecordCoreFunctionStat extends GeneratedMessageLite implements RecordBaseStat$f	// class@000e52
{
    public boolean isSuccess_;
    public float playerStart_;
    public float toast_;
    public static final RecordBaseStat$RecordCoreFunctionStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat$RecordCoreFunctionStat recordCoreFu = new RecordBaseStat$RecordCoreFunctionStat();
       RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE = recordCoreFu;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat$RecordCoreFunctionStat.class, recordCoreFu);
    }
    public void RecordBaseStat$RecordCoreFunctionStat(){
       super();
    }
    public static RecordBaseStat$RecordCoreFunctionStat getDefaultInstance(){
       return RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$RecordCoreFunctionStat$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$RecordCoreFunctionStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$RecordCoreFunctionStat$a newBuilder(RecordBaseStat$RecordCoreFunctionStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordCoreFunctionStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordCoreFunctionStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordCoreFunctionStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$RecordCoreFunctionStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIsSuccess(){
       this.isSuccess_ = false;
    }
    public void clearPlayerStart(){
       this.playerStart_ = 0;
    }
    public void clearToast(){
       this.toast_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat$RecordCoreFunctionStat.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat$RecordCoreFunctionStat();
           case 2:
             return new RecordBaseStat$RecordCoreFunctionStat$a(p2);
           case 3:
             Object[] objArray = new Object[]{"toast_","isSuccess_","playerStart_"};
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x07\x03\x01\x00", objArray);
           case 4:
             return RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat$RecordCoreFunctionStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat$RecordCoreFunctionStat.class);
                pARSER = RecordBaseStat$RecordCoreFunctionStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE);
                   RecordBaseStat$RecordCoreFunctionStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat$RecordCoreFunctionStat.class);
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
    public boolean getIsSuccess(){
       return this.isSuccess_;
    }
    public float getPlayerStart(){
       return this.playerStart_;
    }
    public float getToast(){
       return this.toast_;
    }
    public void setIsSuccess(boolean p0){
       this.isSuccess_ = p0;
    }
    public void setPlayerStart(float p0){
       this.playerStart_ = p0;
    }
    public void setToast(float p0){
       this.toast_ = p0;
    }
}

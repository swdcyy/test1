package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat$a;
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

public final class RecordBaseStat$RecordToEditTimestampStat extends GeneratedMessageLite implements RecordBaseStat$g	// class@000e54
{
    public long editFirstFrame_;
    public long editPre_;
    public long recordFinish_;
    public long recordPre_;
    public static final RecordBaseStat$RecordToEditTimestampStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat$RecordToEditTimestampStat recordToEdit = new RecordBaseStat$RecordToEditTimestampStat();
       RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE = recordToEdit;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat$RecordToEditTimestampStat.class, recordToEdit);
    }
    public void RecordBaseStat$RecordToEditTimestampStat(){
       super();
    }
    public static RecordBaseStat$RecordToEditTimestampStat getDefaultInstance(){
       return RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$RecordToEditTimestampStat$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$RecordToEditTimestampStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$RecordToEditTimestampStat$a newBuilder(RecordBaseStat$RecordToEditTimestampStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$RecordToEditTimestampStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$RecordToEditTimestampStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$RecordToEditTimestampStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$RecordToEditTimestampStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEditFirstFrame(){
       this.editFirstFrame_ = 0;
    }
    public void clearEditPre(){
       this.editPre_ = 0;
    }
    public void clearRecordFinish(){
       this.recordFinish_ = 0;
    }
    public void clearRecordPre(){
       this.recordPre_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat$RecordToEditTimestampStat.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat$RecordToEditTimestampStat();
           case 2:
             return new RecordBaseStat$RecordToEditTimestampStat$a(p2);
           case 3:
             Object[] objArray = new Object[]{"recordFinish_","recordPre_","editPre_","editFirstFrame_"};
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x04\x02\x00", objArray);
           case 4:
             return RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat$RecordToEditTimestampStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat$RecordToEditTimestampStat.class);
                pARSER = RecordBaseStat$RecordToEditTimestampStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE);
                   RecordBaseStat$RecordToEditTimestampStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat$RecordToEditTimestampStat.class);
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
    public long getEditPre(){
       return this.editPre_;
    }
    public long getRecordFinish(){
       return this.recordFinish_;
    }
    public long getRecordPre(){
       return this.recordPre_;
    }
    public void setEditFirstFrame(long p0){
       this.editFirstFrame_ = p0;
    }
    public void setEditPre(long p0){
       this.editPre_ = p0;
    }
    public void setRecordFinish(long p0){
       this.recordFinish_ = p0;
    }
    public void setRecordPre(long p0){
       this.recordPre_ = p0;
    }
}

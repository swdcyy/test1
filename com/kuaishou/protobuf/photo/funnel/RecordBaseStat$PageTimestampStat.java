package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat$a;
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

public final class RecordBaseStat$PageTimestampStat extends GeneratedMessageLite implements RecordBaseStat$d	// class@000e4e
{
    public long dealloc_;
    public long didAppear_;
    public long didLoad_;
    public long init_;
    public long loadView_;
    public static final RecordBaseStat$PageTimestampStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat$PageTimestampStat pageTimestam = new RecordBaseStat$PageTimestampStat();
       RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE = pageTimestam;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat$PageTimestampStat.class, pageTimestam);
    }
    public void RecordBaseStat$PageTimestampStat(){
       super();
    }
    public static RecordBaseStat$PageTimestampStat getDefaultInstance(){
       return RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$PageTimestampStat$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$PageTimestampStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$PageTimestampStat$a newBuilder(RecordBaseStat$PageTimestampStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat$PageTimestampStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat$PageTimestampStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat$PageTimestampStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat$PageTimestampStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat$PageTimestampStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDealloc(){
       this.dealloc_ = 0;
    }
    public void clearDidAppear(){
       this.didAppear_ = 0;
    }
    public void clearDidLoad(){
       this.didLoad_ = 0;
    }
    public void clearInit(){
       this.init_ = 0;
    }
    public void clearLoadView(){
       this.loadView_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat$PageTimestampStat.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat$PageTimestampStat();
           case 2:
             return new RecordBaseStat$PageTimestampStat$a(p2);
           case 3:
             Object[] objArray = new Object[]{"init_","loadView_","didLoad_","didAppear_","dealloc_"};
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x04\x02\x05\x02\x00", objArray);
           case 4:
             return RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat$PageTimestampStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat$PageTimestampStat.class);
                pARSER = RecordBaseStat$PageTimestampStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE);
                   RecordBaseStat$PageTimestampStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat$PageTimestampStat.class);
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
    public long getDealloc(){
       return this.dealloc_;
    }
    public long getDidAppear(){
       return this.didAppear_;
    }
    public long getDidLoad(){
       return this.didLoad_;
    }
    public long getInit(){
       return this.init_;
    }
    public long getLoadView(){
       return this.loadView_;
    }
    public void setDealloc(long p0){
       this.dealloc_ = p0;
    }
    public void setDidAppear(long p0){
       this.didAppear_ = p0;
    }
    public void setDidLoad(long p0){
       this.didLoad_ = p0;
    }
    public void setInit(long p0){
       this.init_ = p0;
    }
    public void setLoadView(long p0){
       this.loadView_ = p0;
    }
}

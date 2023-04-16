package com.kuaishou.protobuf.photo.funnel.Performance;
import pr4.i;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.Performance$b;
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
import com.kuaishou.protobuf.photo.funnel.Performance$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Performance extends GeneratedMessageLite implements i	// class@000e33
{
    public String diskMemory_;
    public String memory_;
    public String threadCnt_;
    public String time_;
    public static final Performance DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Performance performance = new Performance();
       Performance.DEFAULT_INSTANCE = performance;
       GeneratedMessageLite.registerDefaultInstance(Performance.class, performance);
    }
    public void Performance(){
       super();
       this.time_ = "";
       this.memory_ = "";
       this.threadCnt_ = "";
       this.diskMemory_ = "";
    }
    public static Performance getDefaultInstance(){
       return Performance.DEFAULT_INSTANCE;
    }
    public static Performance$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, Performance.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Performance.DEFAULT_INSTANCE.createBuilder();
    }
    public static Performance$b newBuilder(Performance p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Performance.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Performance parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Performance parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Performance parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Performance parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Performance parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Performance parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Performance.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0);
    }
    public static Performance parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Performance.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Performance.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, Performance.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Performance.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDiskMemory(){
       if (PatchProxy.applyVoid(null, this, Performance.class, "15")) {
          return;
       }
       this.diskMemory_ = Performance.getDefaultInstance().getDiskMemory();
       return;
    }
    public void clearMemory(){
       if (PatchProxy.applyVoid(null, this, Performance.class, "7")) {
          return;
       }
       this.memory_ = Performance.getDefaultInstance().getMemory();
       return;
    }
    public void clearThreadCnt(){
       if (PatchProxy.applyVoid(null, this, Performance.class, "11")) {
          return;
       }
       this.threadCnt_ = Performance.getDefaultInstance().getThreadCnt();
       return;
    }
    public void clearTime(){
       if (PatchProxy.applyVoid(null, this, Performance.class, "3")) {
          return;
       }
       this.time_ = Performance.getDefaultInstance().getTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, Performance.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (Performance$a.a[p0.ordinal()]){
           case 1:
             return new Performance();
           case 2:
             return new Performance$b(p2);
           case 3:
             Object[] objArray = new Object[]{"time_","memory_","threadCnt_","diskMemory_"};
             return GeneratedMessageLite.newMessageInfo(Performance.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return Performance.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Performance.PARSER;
             if (pARSER == null) {
                _monitor_enter(Performance.class);
                pARSER = Performance.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Performance.DEFAULT_INSTANCE);
                   Performance.PARSER = pARSER;
                }
                _monitor_exit(Performance.class);
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
    public String getDiskMemory(){
       return this.diskMemory_;
    }
    public ByteString getDiskMemoryBytes(){
       Object obj = PatchProxy.apply(null, this, Performance.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.diskMemory_);
    }
    public String getMemory(){
       return this.memory_;
    }
    public ByteString getMemoryBytes(){
       Object obj = PatchProxy.apply(null, this, Performance.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.memory_);
    }
    public String getThreadCnt(){
       return this.threadCnt_;
    }
    public ByteString getThreadCntBytes(){
       Object obj = PatchProxy.apply(null, this, Performance.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.threadCnt_);
    }
    public String getTime(){
       return this.time_;
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, Performance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.time_);
    }
    public void setDiskMemory(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.diskMemory_ = p0;
       return;
    }
    public void setDiskMemoryBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.diskMemory_ = p0.toStringUtf8();
       return;
    }
    public void setMemory(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.memory_ = p0;
       return;
    }
    public void setMemoryBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.memory_ = p0.toStringUtf8();
       return;
    }
    public void setThreadCnt(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.threadCnt_ = p0;
       return;
    }
    public void setThreadCntBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.threadCnt_ = p0.toStringUtf8();
       return;
    }
    public void setTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.time_ = p0;
       return;
    }
    public void setTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Performance.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.time_ = p0.toStringUtf8();
       return;
    }
}

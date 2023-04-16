package com.kuaishou.protobuf.photo.funnel.PageInfo;
import pr4.h;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.PageInfo$b;
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
import com.kuaishou.protobuf.photo.funnel.PageInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PageInfo extends GeneratedMessageLite implements h	// class@000e30
{
    public String name_;
    public String stage_;
    public String time_;
    public static final PageInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PageInfo pageInfo = new PageInfo();
       PageInfo.DEFAULT_INSTANCE = pageInfo;
       GeneratedMessageLite.registerDefaultInstance(PageInfo.class, pageInfo);
    }
    public void PageInfo(){
       super();
       this.name_ = "";
       this.stage_ = "";
       this.time_ = "";
    }
    public static PageInfo getDefaultInstance(){
       return PageInfo.DEFAULT_INSTANCE;
    }
    public static PageInfo$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PageInfo.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PageInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static PageInfo$b newBuilder(PageInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PageInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PageInfo parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageInfo parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageInfo parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageInfo parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageInfo parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageInfo parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0);
    }
    public static PageInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PageInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PageInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PageInfo.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PageInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, PageInfo.class, "3")) {
          return;
       }
       this.name_ = PageInfo.getDefaultInstance().getName();
       return;
    }
    public void clearStage(){
       if (PatchProxy.applyVoid(null, this, PageInfo.class, "7")) {
          return;
       }
       this.stage_ = PageInfo.getDefaultInstance().getStage();
       return;
    }
    public void clearTime(){
       if (PatchProxy.applyVoid(null, this, PageInfo.class, "11")) {
          return;
       }
       this.time_ = PageInfo.getDefaultInstance().getTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PageInfo.class, "27");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PageInfo$a.a[p0.ordinal()]){
           case 1:
             return new PageInfo();
           case 2:
             return new PageInfo$b(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","stage_","time_"};
             return GeneratedMessageLite.newMessageInfo(PageInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x00", objArray);
           case 4:
             return PageInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PageInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(PageInfo.class);
                pARSER = PageInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PageInfo.DEFAULT_INSTANCE);
                   PageInfo.PARSER = pARSER;
                }
                _monitor_exit(PageInfo.class);
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
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public String getStage(){
       return this.stage_;
    }
    public ByteString getStageBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.stage_);
    }
    public String getTime(){
       return this.time_;
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.time_);
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
       return;
    }
    public void setStage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.stage_ = p0;
       return;
    }
    public void setStageBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.stage_ = p0.toStringUtf8();
       return;
    }
    public void setTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.time_ = p0;
       return;
    }
    public void setTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfo.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.time_ = p0.toStringUtf8();
       return;
    }
}

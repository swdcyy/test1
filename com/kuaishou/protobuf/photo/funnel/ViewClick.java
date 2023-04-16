package com.kuaishou.protobuf.photo.funnel.ViewClick;
import pr4.t;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.ViewClick$b;
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
import com.kuaishou.protobuf.photo.funnel.ViewClick$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ViewClick extends GeneratedMessageLite implements t	// class@000e83
{
    public String id_;
    public String time_;
    public static final ViewClick DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ViewClick viewClick = new ViewClick();
       ViewClick.DEFAULT_INSTANCE = viewClick;
       GeneratedMessageLite.registerDefaultInstance(ViewClick.class, viewClick);
    }
    public void ViewClick(){
       super();
       this.id_ = "";
       this.time_ = "";
    }
    public static ViewClick getDefaultInstance(){
       return ViewClick.DEFAULT_INSTANCE;
    }
    public static ViewClick$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, ViewClick.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewClick.DEFAULT_INSTANCE.createBuilder();
    }
    public static ViewClick$b newBuilder(ViewClick p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewClick.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ViewClick parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static ViewClick parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static ViewClick parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static ViewClick parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static ViewClick parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static ViewClick parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewClick.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0);
    }
    public static ViewClick parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewClick.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ViewClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, ViewClick.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewClick.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, ViewClick.class, "3")) {
          return;
       }
       this.id_ = ViewClick.getDefaultInstance().getId();
       return;
    }
    public void clearTime(){
       if (PatchProxy.applyVoid(null, this, ViewClick.class, "7")) {
          return;
       }
       this.time_ = ViewClick.getDefaultInstance().getTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ViewClick.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (ViewClick$a.a[p0.ordinal()]){
           case 1:
             return new ViewClick();
           case 2:
             return new ViewClick$b(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","time_"};
             return GeneratedMessageLite.newMessageInfo(ViewClick.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return ViewClick.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ViewClick.PARSER;
             if (pARSER == null) {
                _monitor_enter(ViewClick.class);
                pARSER = ViewClick.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ViewClick.DEFAULT_INSTANCE);
                   ViewClick.PARSER = pARSER;
                }
                _monitor_exit(ViewClick.class);
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
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, ViewClick.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public String getTime(){
       return this.time_;
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, ViewClick.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.time_);
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewClick.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewClick.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewClick.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.time_ = p0;
       return;
    }
    public void setTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewClick.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.time_ = p0.toStringUtf8();
       return;
    }
}

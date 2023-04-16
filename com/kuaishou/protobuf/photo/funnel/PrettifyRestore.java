package com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import pr4.n;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$b;
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
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PrettifyRestore extends GeneratedMessageLite implements n	// class@000e44
{
    public String errorCode_;
    public String lastSessionId_;
    public String lastSuitId_;
    public String suitId_;
    public static final PrettifyRestore DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PrettifyRestore prettifyRest = new PrettifyRestore();
       PrettifyRestore.DEFAULT_INSTANCE = prettifyRest;
       GeneratedMessageLite.registerDefaultInstance(PrettifyRestore.class, prettifyRest);
    }
    public void PrettifyRestore(){
       super();
       this.suitId_ = "";
       this.errorCode_ = "";
       this.lastSuitId_ = "";
       this.lastSessionId_ = "";
    }
    public static PrettifyRestore getDefaultInstance(){
       return PrettifyRestore.DEFAULT_INSTANCE;
    }
    public static PrettifyRestore$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PrettifyRestore.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyRestore.DEFAULT_INSTANCE.createBuilder();
    }
    public static PrettifyRestore$b newBuilder(PrettifyRestore p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyRestore.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PrettifyRestore parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyRestore parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyRestore parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyRestore parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyRestore parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyRestore parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyRestore.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyRestore parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyRestore.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyRestore.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PrettifyRestore.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyRestore.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearErrorCode(){
       if (PatchProxy.applyVoid(null, this, PrettifyRestore.class, "7")) {
          return;
       }
       this.errorCode_ = PrettifyRestore.getDefaultInstance().getErrorCode();
       return;
    }
    public void clearLastSessionId(){
       if (PatchProxy.applyVoid(null, this, PrettifyRestore.class, "15")) {
          return;
       }
       this.lastSessionId_ = PrettifyRestore.getDefaultInstance().getLastSessionId();
       return;
    }
    public void clearLastSuitId(){
       if (PatchProxy.applyVoid(null, this, PrettifyRestore.class, "11")) {
          return;
       }
       this.lastSuitId_ = PrettifyRestore.getDefaultInstance().getLastSuitId();
       return;
    }
    public void clearSuitId(){
       if (PatchProxy.applyVoid(null, this, PrettifyRestore.class, "3")) {
          return;
       }
       this.suitId_ = PrettifyRestore.getDefaultInstance().getSuitId();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrettifyRestore.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PrettifyRestore$a.a[p0.ordinal()]){
           case 1:
             return new PrettifyRestore();
           case 2:
             return new PrettifyRestore$b(p2);
           case 3:
             Object[] objArray = new Object[]{"suitId_","errorCode_","lastSuitId_","lastSessionId_"};
             return GeneratedMessageLite.newMessageInfo(PrettifyRestore.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return PrettifyRestore.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PrettifyRestore.PARSER;
             if (pARSER == null) {
                _monitor_enter(PrettifyRestore.class);
                pARSER = PrettifyRestore.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PrettifyRestore.DEFAULT_INSTANCE);
                   PrettifyRestore.PARSER = pARSER;
                }
                _monitor_exit(PrettifyRestore.class);
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
    public String getErrorCode(){
       return this.errorCode_;
    }
    public ByteString getErrorCodeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.errorCode_);
    }
    public String getLastSessionId(){
       return this.lastSessionId_;
    }
    public ByteString getLastSessionIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.lastSessionId_);
    }
    public String getLastSuitId(){
       return this.lastSuitId_;
    }
    public ByteString getLastSuitIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.lastSuitId_);
    }
    public String getSuitId(){
       return this.suitId_;
    }
    public ByteString getSuitIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.suitId_);
    }
    public void setErrorCode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.errorCode_ = p0;
       return;
    }
    public void setErrorCodeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.errorCode_ = p0.toStringUtf8();
       return;
    }
    public void setLastSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.lastSessionId_ = p0;
       return;
    }
    public void setLastSessionIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lastSessionId_ = p0.toStringUtf8();
       return;
    }
    public void setLastSuitId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.lastSuitId_ = p0;
       return;
    }
    public void setLastSuitIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lastSuitId_ = p0.toStringUtf8();
       return;
    }
    public void setSuitId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.suitId_ = p0;
       return;
    }
    public void setSuitIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyRestore.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.suitId_ = p0.toStringUtf8();
       return;
    }
}

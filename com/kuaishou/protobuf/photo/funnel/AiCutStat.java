package com.kuaishou.protobuf.photo.funnel.AiCutStat;
import pr4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.AiCutStat$b;
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
import com.kuaishou.protobuf.photo.funnel.AiCutStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class AiCutStat extends GeneratedMessageLite implements b	// class@000e03
{
    public String id_;
    public String name_;
    public static final AiCutStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AiCutStat uAiCutStat = new AiCutStat();
       AiCutStat.DEFAULT_INSTANCE = uAiCutStat;
       GeneratedMessageLite.registerDefaultInstance(AiCutStat.class, uAiCutStat);
    }
    public void AiCutStat(){
       super();
       this.id_ = "";
       this.name_ = "";
    }
    public static AiCutStat getDefaultInstance(){
       return AiCutStat.DEFAULT_INSTANCE;
    }
    public static AiCutStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, AiCutStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AiCutStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static AiCutStat$b newBuilder(AiCutStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AiCutStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AiCutStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AiCutStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AiCutStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AiCutStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AiCutStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AiCutStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AiCutStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0);
    }
    public static AiCutStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AiCutStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AiCutStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, AiCutStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AiCutStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, AiCutStat.class, "3")) {
          return;
       }
       this.id_ = AiCutStat.getDefaultInstance().getId();
       return;
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, AiCutStat.class, "7")) {
          return;
       }
       this.name_ = AiCutStat.getDefaultInstance().getName();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AiCutStat.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (AiCutStat$a.a[p0.ordinal()]){
           case 1:
             return new AiCutStat();
           case 2:
             return new AiCutStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","name_"};
             return GeneratedMessageLite.newMessageInfo(AiCutStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return AiCutStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AiCutStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(AiCutStat.class);
                pARSER = AiCutStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AiCutStat.DEFAULT_INSTANCE);
                   AiCutStat.PARSER = pARSER;
                }
                _monitor_exit(AiCutStat.class);
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
       Object obj = PatchProxy.apply(null, this, AiCutStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, AiCutStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AiCutStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AiCutStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AiCutStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AiCutStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
       return;
    }
}

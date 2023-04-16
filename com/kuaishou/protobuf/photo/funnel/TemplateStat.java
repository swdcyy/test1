package com.kuaishou.protobuf.photo.funnel.TemplateStat;
import pr4.s;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.TemplateStat$b;
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
import com.kuaishou.protobuf.photo.funnel.TemplateStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class TemplateStat extends GeneratedMessageLite implements s	// class@000e7a
{
    public String id_;
    public String name_;
    public static final TemplateStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TemplateStat templateStat = new TemplateStat();
       TemplateStat.DEFAULT_INSTANCE = templateStat;
       GeneratedMessageLite.registerDefaultInstance(TemplateStat.class, templateStat);
    }
    public void TemplateStat(){
       super();
       this.id_ = "";
       this.name_ = "";
    }
    public static TemplateStat getDefaultInstance(){
       return TemplateStat.DEFAULT_INSTANCE;
    }
    public static TemplateStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, TemplateStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TemplateStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static TemplateStat$b newBuilder(TemplateStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TemplateStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TemplateStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TemplateStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TemplateStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TemplateStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TemplateStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TemplateStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TemplateStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0);
    }
    public static TemplateStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TemplateStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TemplateStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, TemplateStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TemplateStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, TemplateStat.class, "3")) {
          return;
       }
       this.id_ = TemplateStat.getDefaultInstance().getId();
       return;
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, TemplateStat.class, "7")) {
          return;
       }
       this.name_ = TemplateStat.getDefaultInstance().getName();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TemplateStat.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (TemplateStat$a.a[p0.ordinal()]){
           case 1:
             return new TemplateStat();
           case 2:
             return new TemplateStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","name_"};
             return GeneratedMessageLite.newMessageInfo(TemplateStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return TemplateStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TemplateStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(TemplateStat.class);
                pARSER = TemplateStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TemplateStat.DEFAULT_INSTANCE);
                   TemplateStat.PARSER = pARSER;
                }
                _monitor_exit(TemplateStat.class);
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
       Object obj = PatchProxy.apply(null, this, TemplateStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, TemplateStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
       return;
    }
}

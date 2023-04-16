package com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import pr4.m;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem$b;
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
import com.kuaishou.protobuf.photo.funnel.PrettifyItem$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PrettifyItem extends GeneratedMessageLite implements m	// class@000e41
{
    public String id_;
    public String name_;
    public float value_;
    public static final PrettifyItem DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PrettifyItem prettifyItem = new PrettifyItem();
       PrettifyItem.DEFAULT_INSTANCE = prettifyItem;
       GeneratedMessageLite.registerDefaultInstance(PrettifyItem.class, prettifyItem);
    }
    public void PrettifyItem(){
       super();
       this.id_ = "";
       this.name_ = "";
    }
    public static PrettifyItem getDefaultInstance(){
       return PrettifyItem.DEFAULT_INSTANCE;
    }
    public static PrettifyItem$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PrettifyItem.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static PrettifyItem$b newBuilder(PrettifyItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyItem.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PrettifyItem parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyItem parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyItem parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyItem parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyItem parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyItem parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyItem parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PrettifyItem.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyItem.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, PrettifyItem.class, "3")) {
          return;
       }
       this.id_ = PrettifyItem.getDefaultInstance().getId();
       return;
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, PrettifyItem.class, "7")) {
          return;
       }
       this.name_ = PrettifyItem.getDefaultInstance().getName();
       return;
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrettifyItem.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PrettifyItem$a.a[p0.ordinal()]){
           case 1:
             return new PrettifyItem();
           case 2:
             return new PrettifyItem$b(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","name_","value_"};
             return GeneratedMessageLite.newMessageInfo(PrettifyItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x01\x00", objArray);
           case 4:
             return PrettifyItem.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PrettifyItem.PARSER;
             if (pARSER == null) {
                _monitor_enter(PrettifyItem.class);
                pARSER = PrettifyItem.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PrettifyItem.DEFAULT_INSTANCE);
                   PrettifyItem.PARSER = pARSER;
                }
                _monitor_exit(PrettifyItem.class);
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
       Object obj = PatchProxy.apply(null, this, PrettifyItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public float getValue(){
       return this.value_;
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyItem.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyItem.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyItem.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyItem.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
       return;
    }
    public void setValue(float p0){
       this.value_ = p0;
    }
}

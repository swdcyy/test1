package com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import com.kuaishou.protobuf.photo.funnel.BodyStat$b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem$a;
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
import com.kuaishou.protobuf.photo.funnel.BodyStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class BodyStat$BodyItem extends GeneratedMessageLite implements BodyStat$b	// class@000e0e
{
    public String name_;
    public float value_;
    public static final BodyStat$BodyItem DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BodyStat$BodyItem uBodyItem = new BodyStat$BodyItem();
       BodyStat$BodyItem.DEFAULT_INSTANCE = uBodyItem;
       GeneratedMessageLite.registerDefaultInstance(BodyStat$BodyItem.class, uBodyItem);
    }
    public void BodyStat$BodyItem(){
       super();
       this.name_ = "";
    }
    public static BodyStat$BodyItem getDefaultInstance(){
       return BodyStat$BodyItem.DEFAULT_INSTANCE;
    }
    public static BodyStat$BodyItem$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, BodyStat$BodyItem.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat$BodyItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static BodyStat$BodyItem$a newBuilder(BodyStat$BodyItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat$BodyItem.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BodyStat$BodyItem parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat$BodyItem parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat$BodyItem parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat$BodyItem parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat$BodyItem parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat$BodyItem parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat$BodyItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat$BodyItem parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat$BodyItem.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat$BodyItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, BodyStat$BodyItem.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat$BodyItem.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, BodyStat$BodyItem.class, "3")) {
          return;
       }
       this.name_ = BodyStat$BodyItem.getDefaultInstance().getName();
       return;
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BodyStat$BodyItem.class, "19");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (BodyStat$a.a[p0.ordinal()]){
           case 1:
             return new BodyStat$BodyItem();
           case 2:
             return new BodyStat$BodyItem$a(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","value_"};
             return GeneratedMessageLite.newMessageInfo(BodyStat$BodyItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x01\x00", objArray);
           case 4:
             return BodyStat$BodyItem.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BodyStat$BodyItem.PARSER;
             if (pARSER == null) {
                _monitor_enter(BodyStat$BodyItem.class);
                pARSER = BodyStat$BodyItem.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BodyStat$BodyItem.DEFAULT_INSTANCE);
                   BodyStat$BodyItem.PARSER = pARSER;
                }
                _monitor_exit(BodyStat$BodyItem.class);
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
       Object obj = PatchProxy.apply(null, this, BodyStat$BodyItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public float getValue(){
       return this.value_;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodyStat$BodyItem.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodyStat$BodyItem.class, "4")) {
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

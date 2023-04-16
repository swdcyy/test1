package com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage;
import aba.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage$b;
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
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StringMessage extends GeneratedMessageLite implements a	// class@001b0a
{
    public String value_;
    public static final StringMessage DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StringMessage stringMessag = new StringMessage();
       StringMessage.DEFAULT_INSTANCE = stringMessag;
       GeneratedMessageLite.registerDefaultInstance(StringMessage.class, stringMessag);
    }
    public void StringMessage(){
       super();
       this.value_ = "";
    }
    public static StringMessage getDefaultInstance(){
       return StringMessage.DEFAULT_INSTANCE;
    }
    public static StringMessage$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, StringMessage.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringMessage.DEFAULT_INSTANCE.createBuilder();
    }
    public static StringMessage$b newBuilder(StringMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringMessage.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StringMessage of(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringMessage.newBuilder().a(p0).build();
    }
    public static StringMessage parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringMessage parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringMessage parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringMessage parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringMessage parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static StringMessage parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringMessage.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0);
    }
    public static StringMessage parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringMessage.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StringMessage.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, StringMessage.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringMessage.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearValue(){
       if (PatchProxy.applyVoid(null, this, StringMessage.class, "2")) {
          return;
       }
       this.value_ = StringMessage.getDefaultInstance().getValue();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StringMessage.class, "18");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (StringMessage$a.a[p0.ordinal()]){
           case 1:
             return new StringMessage();
           case 2:
             return new StringMessage$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "value_";
             return GeneratedMessageLite.newMessageInfo(StringMessage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return StringMessage.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StringMessage.PARSER;
             if (pARSER == null) {
                _monitor_enter(StringMessage.class);
                pARSER = StringMessage.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StringMessage.DEFAULT_INSTANCE);
                   StringMessage.PARSER = pARSER;
                }
                _monitor_exit(StringMessage.class);
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
    public String getValue(){
       return this.value_;
    }
    public ByteString getValueBytes(){
       Object obj = PatchProxy.apply(null, this, StringMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.value_);
    }
    public void setValue(String p0){
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.value_ = p0;
       return;
    }
    public void setValueBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StringMessage.class, "3")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.value_ = p0.toStringUtf8();
       return;
    }
}

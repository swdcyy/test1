package com.kuaishou.protobuf.photo.funnel.Action;
import pr4.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.Action$b;
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
import com.kuaishou.protobuf.photo.funnel.Action$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Action extends GeneratedMessageLite implements a	// class@000e00
{
    public String name_;
    public String time_;
    public static final Action DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Action uAction = new Action();
       Action.DEFAULT_INSTANCE = uAction;
       GeneratedMessageLite.registerDefaultInstance(Action.class, uAction);
    }
    public void Action(){
       super();
       this.name_ = "";
       this.time_ = "";
    }
    public static Action getDefaultInstance(){
       return Action.DEFAULT_INSTANCE;
    }
    public static Action$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, Action.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Action.DEFAULT_INSTANCE.createBuilder();
    }
    public static Action$b newBuilder(Action p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Action.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Action parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Action parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Action parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Action parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Action parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Action parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Action.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0);
    }
    public static Action parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Action.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Action.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, Action.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Action.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearName(){
       if (PatchProxy.applyVoid(null, this, Action.class, "3")) {
          return;
       }
       this.name_ = Action.getDefaultInstance().getName();
       return;
    }
    public void clearTime(){
       if (PatchProxy.applyVoid(null, this, Action.class, "7")) {
          return;
       }
       this.time_ = Action.getDefaultInstance().getTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, Action.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (Action$a.a[p0.ordinal()]){
           case 1:
             return new Action();
           case 2:
             return new Action$b(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","time_"};
             return GeneratedMessageLite.newMessageInfo(Action.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return Action.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Action.PARSER;
             if (pARSER == null) {
                _monitor_enter(Action.class);
                pARSER = Action.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Action.DEFAULT_INSTANCE);
                   Action.PARSER = pARSER;
                }
                _monitor_exit(Action.class);
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
       Object obj = PatchProxy.apply(null, this, Action.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.name_);
    }
    public String getTime(){
       return this.time_;
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, Action.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.time_);
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Action.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.name_ = p0;
       return;
    }
    public void setNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Action.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
       return;
    }
    public void setTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Action.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.time_ = p0;
       return;
    }
    public void setTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Action.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.time_ = p0.toStringUtf8();
       return;
    }
}

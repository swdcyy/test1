package com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo$a;
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
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class SubtitleStat$RecInfo extends GeneratedMessageLite implements SubtitleStat$d	// class@000e6c
{
    public float end_;
    public float start_;
    public String text_;
    public static final SubtitleStat$RecInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SubtitleStat$RecInfo recInfo = new SubtitleStat$RecInfo();
       SubtitleStat$RecInfo.DEFAULT_INSTANCE = recInfo;
       GeneratedMessageLite.registerDefaultInstance(SubtitleStat$RecInfo.class, recInfo);
    }
    public void SubtitleStat$RecInfo(){
       super();
       this.text_ = "";
    }
    public static SubtitleStat$RecInfo getDefaultInstance(){
       return SubtitleStat$RecInfo.DEFAULT_INSTANCE;
    }
    public static SubtitleStat$RecInfo$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$RecInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$RecInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubtitleStat$RecInfo$a newBuilder(SubtitleStat$RecInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$RecInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubtitleStat$RecInfo parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$RecInfo parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$RecInfo parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$RecInfo parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$RecInfo parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$RecInfo parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$RecInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$RecInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$RecInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$RecInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$RecInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$RecInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEnd(){
       this.end_ = 0;
    }
    public void clearStart(){
       this.start_ = 0;
    }
    public void clearText(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$RecInfo.class, "3")) {
          return;
       }
       this.text_ = SubtitleStat$RecInfo.getDefaultInstance().getText();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitleStat$RecInfo.class, "19");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (SubtitleStat$a.a[p0.ordinal()]){
           case 1:
             return new SubtitleStat$RecInfo();
           case 2:
             return new SubtitleStat$RecInfo$a(p2);
           case 3:
             Object[] objArray = new Object[]{"text_","start_","end_"};
             return GeneratedMessageLite.newMessageInfo(SubtitleStat$RecInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x01\x03\x01\x00", objArray);
           case 4:
             return SubtitleStat$RecInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SubtitleStat$RecInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(SubtitleStat$RecInfo.class);
                pARSER = SubtitleStat$RecInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SubtitleStat$RecInfo.DEFAULT_INSTANCE);
                   SubtitleStat$RecInfo.PARSER = pARSER;
                }
                _monitor_exit(SubtitleStat$RecInfo.class);
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
    public float getEnd(){
       return this.end_;
    }
    public float getStart(){
       return this.start_;
    }
    public String getText(){
       return this.text_;
    }
    public ByteString getTextBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$RecInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.text_);
    }
    public void setEnd(float p0){
       this.end_ = p0;
    }
    public void setStart(float p0){
       this.start_ = p0;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$RecInfo.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.text_ = p0;
       return;
    }
    public void setTextBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$RecInfo.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.text_ = p0.toStringUtf8();
       return;
    }
}

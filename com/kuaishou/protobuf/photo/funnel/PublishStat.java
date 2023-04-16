package com.kuaishou.protobuf.photo.funnel.PublishStat;
import pr4.p;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.PublishStat$b;
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
import com.kuaishou.protobuf.photo.funnel.PublishStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PublishStat extends GeneratedMessageLite implements p	// class@000e4a
{
    public boolean hasPublished_;
    public String hashTags_;
    public boolean isEnter_;
    public String privacy_;
    public boolean saveToDraft_;
    public static final PublishStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PublishStat publishStat = new PublishStat();
       PublishStat.DEFAULT_INSTANCE = publishStat;
       GeneratedMessageLite.registerDefaultInstance(PublishStat.class, publishStat);
    }
    public void PublishStat(){
       super();
       this.hashTags_ = "";
       this.privacy_ = "";
    }
    public static PublishStat getDefaultInstance(){
       return PublishStat.DEFAULT_INSTANCE;
    }
    public static PublishStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PublishStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static PublishStat$b newBuilder(PublishStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PublishStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PublishStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PublishStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PublishStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PublishStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PublishStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0);
    }
    public static PublishStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PublishStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PublishStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PublishStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHasPublished(){
       this.hasPublished_ = false;
    }
    public void clearHashTags(){
       if (PatchProxy.applyVoid(null, this, PublishStat.class, "3")) {
          return;
       }
       this.hashTags_ = PublishStat.getDefaultInstance().getHashTags();
       return;
    }
    public void clearIsEnter(){
       this.isEnter_ = false;
    }
    public void clearPrivacy(){
       if (PatchProxy.applyVoid(null, this, PublishStat.class, "7")) {
          return;
       }
       this.privacy_ = PublishStat.getDefaultInstance().getPrivacy();
       return;
    }
    public void clearSaveToDraft(){
       this.saveToDraft_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PublishStat.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PublishStat$a.a[p0.ordinal()]){
           case 1:
             return new PublishStat();
           case 2:
             return new PublishStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"isEnter_","hasPublished_","saveToDraft_","hashTags_","privacy_"};
             return GeneratedMessageLite.newMessageInfo(PublishStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x02\x02\x05\x02\x02\x00", objArray);
           case 4:
             return PublishStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PublishStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(PublishStat.class);
                pARSER = PublishStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PublishStat.DEFAULT_INSTANCE);
                   PublishStat.PARSER = pARSER;
                }
                _monitor_exit(PublishStat.class);
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
    public boolean getHasPublished(){
       return this.hasPublished_;
    }
    public String getHashTags(){
       return this.hashTags_;
    }
    public ByteString getHashTagsBytes(){
       Object obj = PatchProxy.apply(null, this, PublishStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.hashTags_);
    }
    public boolean getIsEnter(){
       return this.isEnter_;
    }
    public String getPrivacy(){
       return this.privacy_;
    }
    public ByteString getPrivacyBytes(){
       Object obj = PatchProxy.apply(null, this, PublishStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.privacy_);
    }
    public boolean getSaveToDraft(){
       return this.saveToDraft_;
    }
    public void setHasPublished(boolean p0){
       this.hasPublished_ = p0;
    }
    public void setHashTags(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.hashTags_ = p0;
       return;
    }
    public void setHashTagsBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.hashTags_ = p0.toStringUtf8();
       return;
    }
    public void setIsEnter(boolean p0){
       this.isEnter_ = p0;
    }
    public void setPrivacy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.privacy_ = p0;
       return;
    }
    public void setPrivacyBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.privacy_ = p0.toStringUtf8();
       return;
    }
    public void setSaveToDraft(boolean p0){
       this.saveToDraft_ = p0;
    }
}

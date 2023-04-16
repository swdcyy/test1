package com.kuaishou.protobuf.photo.funnel.CoverStat;
import pr4.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.CoverStat$b;
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
import com.kuaishou.protobuf.photo.funnel.CoverStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CoverStat extends GeneratedMessageLite implements d	// class@000e15
{
    public float customTimestamp_;
    public boolean isChange_;
    public String stickerName_;
    public static final CoverStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CoverStat uCoverStat = new CoverStat();
       CoverStat.DEFAULT_INSTANCE = uCoverStat;
       GeneratedMessageLite.registerDefaultInstance(CoverStat.class, uCoverStat);
    }
    public void CoverStat(){
       super();
       this.stickerName_ = "";
    }
    public static CoverStat getDefaultInstance(){
       return CoverStat.DEFAULT_INSTANCE;
    }
    public static CoverStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, CoverStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoverStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static CoverStat$b newBuilder(CoverStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoverStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CoverStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static CoverStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static CoverStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static CoverStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static CoverStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static CoverStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0);
    }
    public static CoverStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(CoverStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, CoverStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoverStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCustomTimestamp(){
       this.customTimestamp_ = 0;
    }
    public void clearIsChange(){
       this.isChange_ = false;
    }
    public void clearStickerName(){
       if (PatchProxy.applyVoid(null, this, CoverStat.class, "3")) {
          return;
       }
       this.stickerName_ = CoverStat.getDefaultInstance().getStickerName();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoverStat.class, "19");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (CoverStat$a.a[p0.ordinal()]){
           case 1:
             return new CoverStat();
           case 2:
             return new CoverStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"isChange_","stickerName_","customTimestamp_"};
             return GeneratedMessageLite.newMessageInfo(CoverStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x02\x02\x03\x01\x00", objArray);
           case 4:
             return CoverStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CoverStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(CoverStat.class);
                pARSER = CoverStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CoverStat.DEFAULT_INSTANCE);
                   CoverStat.PARSER = pARSER;
                }
                _monitor_exit(CoverStat.class);
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
    public float getCustomTimestamp(){
       return this.customTimestamp_;
    }
    public boolean getIsChange(){
       return this.isChange_;
    }
    public String getStickerName(){
       return this.stickerName_;
    }
    public ByteString getStickerNameBytes(){
       Object obj = PatchProxy.apply(null, this, CoverStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.stickerName_);
    }
    public void setCustomTimestamp(float p0){
       this.customTimestamp_ = p0;
    }
    public void setIsChange(boolean p0){
       this.isChange_ = p0;
    }
    public void setStickerName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.stickerName_ = p0;
       return;
    }
    public void setStickerNameBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.stickerName_ = p0.toStringUtf8();
       return;
    }
}

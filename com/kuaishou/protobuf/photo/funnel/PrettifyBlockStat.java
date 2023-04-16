package com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat;
import pr4.l;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat$b;
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
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PrettifyBlockStat extends GeneratedMessageLite implements l	// class@000e3e
{
    public String blockTime_;
    public String blockType_;
    public String finishType_;
    public String type_;
    public static final PrettifyBlockStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PrettifyBlockStat prettifyBloc = new PrettifyBlockStat();
       PrettifyBlockStat.DEFAULT_INSTANCE = prettifyBloc;
       GeneratedMessageLite.registerDefaultInstance(PrettifyBlockStat.class, prettifyBloc);
    }
    public void PrettifyBlockStat(){
       super();
       this.type_ = "";
       this.blockType_ = "";
       this.blockTime_ = "";
       this.finishType_ = "";
    }
    public static PrettifyBlockStat getDefaultInstance(){
       return PrettifyBlockStat.DEFAULT_INSTANCE;
    }
    public static PrettifyBlockStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PrettifyBlockStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyBlockStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static PrettifyBlockStat$b newBuilder(PrettifyBlockStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyBlockStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PrettifyBlockStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyBlockStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyBlockStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyBlockStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyBlockStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyBlockStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBlockStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyBlockStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyBlockStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyBlockStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PrettifyBlockStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyBlockStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBlockTime(){
       if (PatchProxy.applyVoid(null, this, PrettifyBlockStat.class, "11")) {
          return;
       }
       this.blockTime_ = PrettifyBlockStat.getDefaultInstance().getBlockTime();
       return;
    }
    public void clearBlockType(){
       if (PatchProxy.applyVoid(null, this, PrettifyBlockStat.class, "7")) {
          return;
       }
       this.blockType_ = PrettifyBlockStat.getDefaultInstance().getBlockType();
       return;
    }
    public void clearFinishType(){
       if (PatchProxy.applyVoid(null, this, PrettifyBlockStat.class, "15")) {
          return;
       }
       this.finishType_ = PrettifyBlockStat.getDefaultInstance().getFinishType();
       return;
    }
    public void clearType(){
       if (PatchProxy.applyVoid(null, this, PrettifyBlockStat.class, "3")) {
          return;
       }
       this.type_ = PrettifyBlockStat.getDefaultInstance().getType();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrettifyBlockStat.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PrettifyBlockStat$a.a[p0.ordinal()]){
           case 1:
             return new PrettifyBlockStat();
           case 2:
             return new PrettifyBlockStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","blockType_","blockTime_","finishType_"};
             return GeneratedMessageLite.newMessageInfo(PrettifyBlockStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return PrettifyBlockStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PrettifyBlockStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(PrettifyBlockStat.class);
                pARSER = PrettifyBlockStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PrettifyBlockStat.DEFAULT_INSTANCE);
                   PrettifyBlockStat.PARSER = pARSER;
                }
                _monitor_exit(PrettifyBlockStat.class);
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
    public String getBlockTime(){
       return this.blockTime_;
    }
    public ByteString getBlockTimeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.blockTime_);
    }
    public String getBlockType(){
       return this.blockType_;
    }
    public ByteString getBlockTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.blockType_);
    }
    public String getFinishType(){
       return this.finishType_;
    }
    public ByteString getFinishTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.finishType_);
    }
    public String getType(){
       return this.type_;
    }
    public ByteString getTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.type_);
    }
    public void setBlockTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.blockTime_ = p0;
       return;
    }
    public void setBlockTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.blockTime_ = p0.toStringUtf8();
       return;
    }
    public void setBlockType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.blockType_ = p0;
       return;
    }
    public void setBlockTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.blockType_ = p0.toStringUtf8();
       return;
    }
    public void setFinishType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.finishType_ = p0;
       return;
    }
    public void setFinishTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.finishType_ = p0.toStringUtf8();
       return;
    }
    public void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.type_ = p0;
       return;
    }
    public void setTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBlockStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.type_ = p0.toStringUtf8();
       return;
    }
}

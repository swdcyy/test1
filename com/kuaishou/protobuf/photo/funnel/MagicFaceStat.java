package com.kuaishou.protobuf.photo.funnel.MagicFaceStat;
import pr4.f;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat$b;
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
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MagicFaceStat extends GeneratedMessageLite implements f	// class@000e21
{
    public String applyFailReason_;
    public boolean applySuccess_;
    public String applyTimeCost_;
    public String dataFailReason_;
    public boolean dataSuccess_;
    public String dataTimeCost_;
    public boolean resouceDownload_;
    public static final MagicFaceStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MagicFaceStat magicFaceSta = new MagicFaceStat();
       MagicFaceStat.DEFAULT_INSTANCE = magicFaceSta;
       GeneratedMessageLite.registerDefaultInstance(MagicFaceStat.class, magicFaceSta);
    }
    public void MagicFaceStat(){
       super();
       this.applyTimeCost_ = "";
       this.dataTimeCost_ = "";
       this.dataFailReason_ = "";
       this.applyFailReason_ = "";
    }
    public static MagicFaceStat getDefaultInstance(){
       return MagicFaceStat.DEFAULT_INSTANCE;
    }
    public static MagicFaceStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, MagicFaceStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicFaceStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static MagicFaceStat$b newBuilder(MagicFaceStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicFaceStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MagicFaceStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MagicFaceStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MagicFaceStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MagicFaceStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MagicFaceStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MagicFaceStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFaceStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0);
    }
    public static MagicFaceStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicFaceStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MagicFaceStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, MagicFaceStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicFaceStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearApplyFailReason(){
       if (PatchProxy.applyVoid(null, this, MagicFaceStat.class, "15")) {
          return;
       }
       this.applyFailReason_ = MagicFaceStat.getDefaultInstance().getApplyFailReason();
       return;
    }
    public void clearApplySuccess(){
       this.applySuccess_ = false;
    }
    public void clearApplyTimeCost(){
       if (PatchProxy.applyVoid(null, this, MagicFaceStat.class, "3")) {
          return;
       }
       this.applyTimeCost_ = MagicFaceStat.getDefaultInstance().getApplyTimeCost();
       return;
    }
    public void clearDataFailReason(){
       if (PatchProxy.applyVoid(null, this, MagicFaceStat.class, "11")) {
          return;
       }
       this.dataFailReason_ = MagicFaceStat.getDefaultInstance().getDataFailReason();
       return;
    }
    public void clearDataSuccess(){
       this.dataSuccess_ = false;
    }
    public void clearDataTimeCost(){
       if (PatchProxy.applyVoid(null, this, MagicFaceStat.class, "7")) {
          return;
       }
       this.dataTimeCost_ = MagicFaceStat.getDefaultInstance().getDataTimeCost();
       return;
    }
    public void clearResouceDownload(){
       this.resouceDownload_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicFaceStat.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (MagicFaceStat$a.a[p0.ordinal()]){
           case 1:
             return new MagicFaceStat();
           case 2:
             return new MagicFaceStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"applySuccess_","applyTimeCost_","resouceDownload_","dataTimeCost_","dataSuccess_","dataFailReason_","applyFailReason_"};
             return GeneratedMessageLite.newMessageInfo(MagicFaceStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x02\x02\x03\x07\x04\x02\x02\x05\x07\x06\x02\x02\x07\x02\x02\x00", objArray);
           case 4:
             return MagicFaceStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MagicFaceStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(MagicFaceStat.class);
                pARSER = MagicFaceStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MagicFaceStat.DEFAULT_INSTANCE);
                   MagicFaceStat.PARSER = pARSER;
                }
                _monitor_exit(MagicFaceStat.class);
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
    public String getApplyFailReason(){
       return this.applyFailReason_;
    }
    public ByteString getApplyFailReasonBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.applyFailReason_);
    }
    public boolean getApplySuccess(){
       return this.applySuccess_;
    }
    public String getApplyTimeCost(){
       return this.applyTimeCost_;
    }
    public ByteString getApplyTimeCostBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.applyTimeCost_);
    }
    public String getDataFailReason(){
       return this.dataFailReason_;
    }
    public ByteString getDataFailReasonBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.dataFailReason_);
    }
    public boolean getDataSuccess(){
       return this.dataSuccess_;
    }
    public String getDataTimeCost(){
       return this.dataTimeCost_;
    }
    public ByteString getDataTimeCostBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.dataTimeCost_);
    }
    public boolean getResouceDownload(){
       return this.resouceDownload_;
    }
    public void setApplyFailReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.applyFailReason_ = p0;
       return;
    }
    public void setApplyFailReasonBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.applyFailReason_ = p0.toStringUtf8();
       return;
    }
    public void setApplySuccess(boolean p0){
       this.applySuccess_ = p0;
    }
    public void setApplyTimeCost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.applyTimeCost_ = p0;
       return;
    }
    public void setApplyTimeCostBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.applyTimeCost_ = p0.toStringUtf8();
       return;
    }
    public void setDataFailReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.dataFailReason_ = p0;
       return;
    }
    public void setDataFailReasonBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.dataFailReason_ = p0.toStringUtf8();
       return;
    }
    public void setDataSuccess(boolean p0){
       this.dataSuccess_ = p0;
    }
    public void setDataTimeCost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.dataTimeCost_ = p0;
       return;
    }
    public void setDataTimeCostBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.dataTimeCost_ = p0.toStringUtf8();
       return;
    }
    public void setResouceDownload(boolean p0){
       this.resouceDownload_ = p0;
    }
}

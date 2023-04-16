package com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result$a;
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
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo$a;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$d;

public final class SubtitleStat$Result extends GeneratedMessageLite implements SubtitleStat$e	// class@000e6e
{
    public String fileKey_;
    public Internal$ProtobufList info_;
    public int status_;
    public static final SubtitleStat$Result DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SubtitleStat$Result result = new SubtitleStat$Result();
       SubtitleStat$Result.DEFAULT_INSTANCE = result;
       GeneratedMessageLite.registerDefaultInstance(SubtitleStat$Result.class, result);
    }
    public void SubtitleStat$Result(){
       super();
       this.info_ = GeneratedMessageLite.emptyProtobufList();
       this.fileKey_ = "";
    }
    public static SubtitleStat$Result getDefaultInstance(){
       return SubtitleStat$Result.DEFAULT_INSTANCE;
    }
    public static SubtitleStat$Result$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$Result.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$Result.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubtitleStat$Result$a newBuilder(SubtitleStat$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$Result.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubtitleStat$Result parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$Result parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$Result parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$Result parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$Result parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$Result parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Result.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$Result parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$Result.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$Result.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$Result.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$Result.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllInfo(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$Result.class, "11")) {
          return;
       }
       this.ensureInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.info_);
       return;
    }
    public void addInfo(int p0,SubtitleStat$RecInfo$a p1){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, result, "10")) {
          return;
       }
       this.ensureInfoIsMutable();
       this.info_.add(p0, p1.build());
       return;
    }
    public void addInfo(int p0,SubtitleStat$RecInfo p1){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, result, "8")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureInfoIsMutable();
       this.info_.add(p0, p1);
       return;
    }
    public void addInfo(SubtitleStat$RecInfo$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$Result.class, "9")) {
          return;
       }
       this.ensureInfoIsMutable();
       this.info_.add(p0.build());
       return;
    }
    public void addInfo(SubtitleStat$RecInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$Result.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureInfoIsMutable();
       this.info_.add(p0);
       return;
    }
    public void clearFileKey(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$Result.class, "16")) {
          return;
       }
       this.fileKey_ = SubtitleStat$Result.getDefaultInstance().getFileKey();
       return;
    }
    public void clearInfo(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$Result.class, "12")) {
          return;
       }
       this.info_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitleStat$Result.class, "32");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (SubtitleStat$a.a[p0.ordinal()]){
           case 1:
             return new SubtitleStat$Result();
           case 2:
             return new SubtitleStat$Result$a(p2);
           case 3:
             Object[] objArray = new Object[]{"info_",SubtitleStat$RecInfo.class,"fileKey_","status_"};
             return GeneratedMessageLite.newMessageInfo(SubtitleStat$Result.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x02\x02\x03\x04\x00", objArray);
           case 4:
             return SubtitleStat$Result.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SubtitleStat$Result.PARSER;
             if (pARSER == null) {
                _monitor_enter(SubtitleStat$Result.class);
                pARSER = SubtitleStat$Result.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SubtitleStat$Result.DEFAULT_INSTANCE);
                   SubtitleStat$Result.PARSER = pARSER;
                }
                _monitor_exit(SubtitleStat$Result.class);
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
    public final void ensureInfoIsMutable(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$Result.class, "4")) {
          return;
       }
       if (!this.info_.isModifiable()) {
          this.info_ = GeneratedMessageLite.mutableCopy(this.info_);
       }
       return;
    }
    public String getFileKey(){
       return this.fileKey_;
    }
    public ByteString getFileKeyBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.fileKey_);
    }
    public SubtitleStat$RecInfo getInfo(int p0){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, result, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.info_.get(p0);
    }
    public int getInfoCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.info_.size();
    }
    public List getInfoList(){
       return this.info_;
    }
    public SubtitleStat$d getInfoOrBuilder(int p0){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, result, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.info_.get(p0);
    }
    public List getInfoOrBuilderList(){
       return this.info_;
    }
    public int getStatus(){
       return this.status_;
    }
    public void removeInfo(int p0){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, result, "13")) {
          return;
       }
       this.ensureInfoIsMutable();
       this.info_.remove(p0);
       return;
    }
    public void setFileKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$Result.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.fileKey_ = p0;
       return;
    }
    public void setFileKeyBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$Result.class, "17")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fileKey_ = p0.toStringUtf8();
       return;
    }
    public void setInfo(int p0,SubtitleStat$RecInfo$a p1){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, result, "6")) {
          return;
       }
       this.ensureInfoIsMutable();
       this.info_.set(p0, p1.build());
       return;
    }
    public void setInfo(int p0,SubtitleStat$RecInfo p1){
       SubtitleStat$Result result = SubtitleStat$Result.class;
       if (PatchProxy.isSupport(result) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, result, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureInfoIsMutable();
       this.info_.set(p0, p1);
       return;
    }
    public void setStatus(int p0){
       this.status_ = p0;
    }
}

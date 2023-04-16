package com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat;
import pr4.r;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat$b;
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
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ResourceDownloadStat extends GeneratedMessageLite implements r	// class@000e62
{
    public String bizType_;
    public String downloadReason_;
    public String expectedSize_;
    public long finishDownloadTime_;
    public String identifier_;
    public String preloadReceivedSize_;
    public String qosRank_;
    public String reportReason_;
    public String resourceType_;
    public long startDownloadTime_;
    public long submitTime_;
    public String urls_;
    public static final ResourceDownloadStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ResourceDownloadStat resourceDown = new ResourceDownloadStat();
       ResourceDownloadStat.DEFAULT_INSTANCE = resourceDown;
       GeneratedMessageLite.registerDefaultInstance(ResourceDownloadStat.class, resourceDown);
    }
    public void ResourceDownloadStat(){
       super();
       this.resourceType_ = "";
       this.identifier_ = "";
       this.qosRank_ = "";
       this.bizType_ = "";
       this.urls_ = "";
       this.preloadReceivedSize_ = "";
       this.expectedSize_ = "";
       this.downloadReason_ = "";
       this.reportReason_ = "";
    }
    public static ResourceDownloadStat getDefaultInstance(){
       return ResourceDownloadStat.DEFAULT_INSTANCE;
    }
    public static ResourceDownloadStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, ResourceDownloadStat.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceDownloadStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static ResourceDownloadStat$b newBuilder(ResourceDownloadStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceDownloadStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ResourceDownloadStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResourceDownloadStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResourceDownloadStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResourceDownloadStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResourceDownloadStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResourceDownloadStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadStat.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0);
    }
    public static ResourceDownloadStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ResourceDownloadStat.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(ResourceDownloadStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, ResourceDownloadStat.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceDownloadStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBizType(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "15")) {
          return;
       }
       this.bizType_ = ResourceDownloadStat.getDefaultInstance().getBizType();
       return;
    }
    public void clearDownloadReason(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "31")) {
          return;
       }
       this.downloadReason_ = ResourceDownloadStat.getDefaultInstance().getDownloadReason();
       return;
    }
    public void clearExpectedSize(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "27")) {
          return;
       }
       this.expectedSize_ = ResourceDownloadStat.getDefaultInstance().getExpectedSize();
       return;
    }
    public void clearFinishDownloadTime(){
       this.finishDownloadTime_ = 0;
    }
    public void clearIdentifier(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "7")) {
          return;
       }
       this.identifier_ = ResourceDownloadStat.getDefaultInstance().getIdentifier();
       return;
    }
    public void clearPreloadReceivedSize(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "23")) {
          return;
       }
       this.preloadReceivedSize_ = ResourceDownloadStat.getDefaultInstance().getPreloadReceivedSize();
       return;
    }
    public void clearQosRank(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "11")) {
          return;
       }
       this.qosRank_ = ResourceDownloadStat.getDefaultInstance().getQosRank();
       return;
    }
    public void clearReportReason(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "35")) {
          return;
       }
       this.reportReason_ = ResourceDownloadStat.getDefaultInstance().getReportReason();
       return;
    }
    public void clearResourceType(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "3")) {
          return;
       }
       this.resourceType_ = ResourceDownloadStat.getDefaultInstance().getResourceType();
       return;
    }
    public void clearStartDownloadTime(){
       this.startDownloadTime_ = 0;
    }
    public void clearSubmitTime(){
       this.submitTime_ = 0;
    }
    public void clearUrls(){
       if (PatchProxy.applyVoid(null, this, ResourceDownloadStat.class, "19")) {
          return;
       }
       this.urls_ = ResourceDownloadStat.getDefaultInstance().getUrls();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ResourceDownloadStat.class, "51");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (ResourceDownloadStat$a.a[p0.ordinal()]){
           case 1:
             return new ResourceDownloadStat();
           case 2:
             return new ResourceDownloadStat$b(p2);
           case 3:
             Object[] objArray = new Object[12];
             objArray[0] = "submitTime_";
             objArray[i] = "startDownloadTime_";
             objArray[2] = "finishDownloadTime_";
             objArray[3] = "resourceType_";
             objArray[4] = "identifier_";
             objArray[5] = "qosRank_";
             objArray[6] = "bizType_";
             objArray[7] = "urls_";
             objArray[8] = "preloadReceivedSize_";
             objArray[9] = "expectedSize_";
             objArray[10] = "downloadReason_";
             objArray[11] = "reportReason_";
             return GeneratedMessageLite.newMessageInfo(ResourceDownloadStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\f\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\f\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x02\x02\x0b\x02\x02\f\x02\x02\x00", objArray);
           case 4:
             return ResourceDownloadStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ResourceDownloadStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(ResourceDownloadStat.class);
                pARSER = ResourceDownloadStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ResourceDownloadStat.DEFAULT_INSTANCE);
                   ResourceDownloadStat.PARSER = pARSER;
                }
                _monitor_exit(ResourceDownloadStat.class);
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
    public String getBizType(){
       return this.bizType_;
    }
    public ByteString getBizTypeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.bizType_);
    }
    public String getDownloadReason(){
       return this.downloadReason_;
    }
    public ByteString getDownloadReasonBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.downloadReason_);
    }
    public String getExpectedSize(){
       return this.expectedSize_;
    }
    public ByteString getExpectedSizeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.expectedSize_);
    }
    public long getFinishDownloadTime(){
       return this.finishDownloadTime_;
    }
    public String getIdentifier(){
       return this.identifier_;
    }
    public ByteString getIdentifierBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.identifier_);
    }
    public String getPreloadReceivedSize(){
       return this.preloadReceivedSize_;
    }
    public ByteString getPreloadReceivedSizeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.preloadReceivedSize_);
    }
    public String getQosRank(){
       return this.qosRank_;
    }
    public ByteString getQosRankBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.qosRank_);
    }
    public String getReportReason(){
       return this.reportReason_;
    }
    public ByteString getReportReasonBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.reportReason_);
    }
    public String getResourceType(){
       return this.resourceType_;
    }
    public ByteString getResourceTypeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.resourceType_);
    }
    public long getStartDownloadTime(){
       return this.startDownloadTime_;
    }
    public long getSubmitTime(){
       return this.submitTime_;
    }
    public String getUrls(){
       return this.urls_;
    }
    public ByteString getUrlsBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.urls_);
    }
    public void setBizType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.bizType_ = p0;
       return;
    }
    public void setBizTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.bizType_ = p0.toStringUtf8();
       return;
    }
    public void setDownloadReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "30")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.downloadReason_ = p0;
       return;
    }
    public void setDownloadReasonBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "32")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.downloadReason_ = p0.toStringUtf8();
       return;
    }
    public void setExpectedSize(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "26")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.expectedSize_ = p0;
       return;
    }
    public void setExpectedSizeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "28")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.expectedSize_ = p0.toStringUtf8();
       return;
    }
    public void setFinishDownloadTime(long p0){
       this.finishDownloadTime_ = p0;
    }
    public void setIdentifier(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.identifier_ = p0;
       return;
    }
    public void setIdentifierBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.identifier_ = p0.toStringUtf8();
       return;
    }
    public void setPreloadReceivedSize(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "22")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.preloadReceivedSize_ = p0;
       return;
    }
    public void setPreloadReceivedSizeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "24")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.preloadReceivedSize_ = p0.toStringUtf8();
       return;
    }
    public void setQosRank(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.qosRank_ = p0;
       return;
    }
    public void setQosRankBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.qosRank_ = p0.toStringUtf8();
       return;
    }
    public void setReportReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "34")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.reportReason_ = p0;
       return;
    }
    public void setReportReasonBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "36")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reportReason_ = p0.toStringUtf8();
       return;
    }
    public void setResourceType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.resourceType_ = p0;
       return;
    }
    public void setResourceTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resourceType_ = p0.toStringUtf8();
       return;
    }
    public void setStartDownloadTime(long p0){
       this.startDownloadTime_ = p0;
    }
    public void setSubmitTime(long p0){
       this.submitTime_ = p0;
    }
    public void setUrls(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "18")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.urls_ = p0;
       return;
    }
    public void setUrlsBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadStat.class, "20")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.urls_ = p0.toStringUtf8();
       return;
    }
}

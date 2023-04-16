package com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat$b;
import pr4.r;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import java.lang.Number;

public final class ResourceDownloadStat$b extends GeneratedMessageLite$Builder implements r	// class@000e61
{

    public void ResourceDownloadStat$b(){
       super(ResourceDownloadStat.DEFAULT_INSTANCE);
    }
    public void ResourceDownloadStat$b(ResourceDownloadStat$a p0){
       super(ResourceDownloadStat.DEFAULT_INSTANCE);
    }
    public String getBizType(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBizType();
    }
    public ByteString getBizTypeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBizTypeBytes();
    }
    public String getDownloadReason(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDownloadReason();
    }
    public ByteString getDownloadReasonBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDownloadReasonBytes();
    }
    public String getExpectedSize(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getExpectedSize();
    }
    public ByteString getExpectedSizeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getExpectedSizeBytes();
    }
    public long getFinishDownloadTime(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getFinishDownloadTime();
    }
    public String getIdentifier(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdentifier();
    }
    public ByteString getIdentifierBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdentifierBytes();
    }
    public String getPreloadReceivedSize(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPreloadReceivedSize();
    }
    public ByteString getPreloadReceivedSizeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPreloadReceivedSizeBytes();
    }
    public String getQosRank(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getQosRank();
    }
    public ByteString getQosRankBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getQosRankBytes();
    }
    public String getReportReason(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getReportReason();
    }
    public ByteString getReportReasonBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getReportReasonBytes();
    }
    public String getResourceType(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getResourceType();
    }
    public ByteString getResourceTypeBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getResourceTypeBytes();
    }
    public long getStartDownloadTime(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getStartDownloadTime();
    }
    public long getSubmitTime(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getSubmitTime();
    }
    public String getUrls(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getUrls();
    }
    public ByteString getUrlsBytes(){
       Object obj = PatchProxy.apply(null, this, ResourceDownloadStat$b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getUrlsBytes();
    }
}

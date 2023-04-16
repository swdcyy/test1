package com.kuaishou.merchant.live.cart.onsale.model.FullDeliveryTaskProgress;
import java.io.Serializable;
import mkd.a;
import com.kuaishou.merchant.live.cart.onsale.model.FullDeliveryTaskProgress$a;
import nsd.u;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.merchant.live.cart.onsale.model.ProcessInfo;
import com.kuaishou.merchant.live.cart.onsale.model.RightContent;
import java.util.List;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FullDeliveryTaskProgress implements Serializable, a	// class@0019b1
{
    public List cycleProgressInfos;
    public List doneButtonUrl;
    public Long endTime;
    public String endTimePattern;
    public long guideInterval;
    public String guideTip;
    public String jumpUrl;
    public ProcessInfo processInfo;
    public Integer processStatus;
    public RightContent rightContent;
    public List taskStep;
    public List titleUrl;
    public List undoneButtonUrl;
    public static final FullDeliveryTaskProgress$a Companion;
    public static final long serialVersionUID;

    static {
       FullDeliveryTaskProgress.Companion = new FullDeliveryTaskProgress$a(null);
    }
    public void FullDeliveryTaskProgress(Long p0,String p1,String p2,ProcessInfo p3,RightContent p4,List p5,Integer p6,List p7,List p8,List p9,List p10,long p11,String p12){
       super();
       this.endTime = p0;
       this.endTimePattern = p1;
       this.jumpUrl = p2;
       this.processInfo = p3;
       this.rightContent = p4;
       this.cycleProgressInfos = p5;
       this.processStatus = p6;
       this.taskStep = p7;
       this.titleUrl = p8;
       this.doneButtonUrl = p9;
       this.undoneButtonUrl = p10;
       this.guideInterval = p11;
       this.guideTip = p12;
    }
    public static FullDeliveryTaskProgress copy$default(FullDeliveryTaskProgress p0,Long p1,String p2,String p3,ProcessInfo p4,RightContent p5,List p6,Integer p7,List p8,List p9,List p10,List p11,long p12,String p13,int p14,Object p15){
       FullDeliveryTaskProgress uFullDeliver = p0;
       int i = p14;
       FullDeliveryTaskProgress endTime = (i & 0x01)? uFullDeliver.endTime: p1;
       FullDeliveryTaskProgress endTimePatte = (i & 0x02)? uFullDeliver.endTimePattern: p2;
       FullDeliveryTaskProgress jumpUrl = (i & 0x04)? uFullDeliver.jumpUrl: p3;
       FullDeliveryTaskProgress processInfo = (i & 0x08)? uFullDeliver.processInfo: p4;
       FullDeliveryTaskProgress rightContent = (i & 0x10)? uFullDeliver.rightContent: p5;
       FullDeliveryTaskProgress cycleProgres = (i & 0x20)? uFullDeliver.cycleProgressInfos: p6;
       FullDeliveryTaskProgress processStatu = (i & 0x40)? uFullDeliver.processStatus: p7;
       FullDeliveryTaskProgress taskStep = (i & 0x0080)? uFullDeliver.taskStep: p8;
       FullDeliveryTaskProgress titleUrl = (i & 0x0100)? uFullDeliver.titleUrl: p9;
       FullDeliveryTaskProgress doneButtonUr = (i & 0x0200)? uFullDeliver.doneButtonUrl: p10;
       FullDeliveryTaskProgress undoneButton = (i & 0x0400)? uFullDeliver.undoneButtonUrl: p11;
       FullDeliveryTaskProgress guideInterva = (i & 0x0800)? uFullDeliver.guideInterval: p12;
       FullDeliveryTaskProgress guideTip = (i & 0x1000)? uFullDeliver.guideTip: p13;
       return p0.copy(endTime, endTimePatte, jumpUrl, processInfo, rightContent, cycleProgres, processStatu, taskStep, titleUrl, doneButtonUr, undoneButton, guideInterva, guideTip);
    }
    public void afterDeserialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FullDeliveryTaskProgress.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.endTimePattern)) {
          FullDeliveryTaskProgress tendTimePatt = this.endTimePattern;
          if (tendTimePatt != null) {
             objArray = u.g2(tendTimePatt, "${0}", "%s", false, 4, null);
          }
       }else {
          objArray = "";
       }
       this.endTimePattern = objArray;
       return;
    }
    public final Long component1(){
       return this.endTime;
    }
    public final List component10(){
       return this.doneButtonUrl;
    }
    public final List component11(){
       return this.undoneButtonUrl;
    }
    public final long component12(){
       return this.guideInterval;
    }
    public final String component13(){
       return this.guideTip;
    }
    public final String component2(){
       return this.endTimePattern;
    }
    public final String component3(){
       return this.jumpUrl;
    }
    public final ProcessInfo component4(){
       return this.processInfo;
    }
    public final RightContent component5(){
       return this.rightContent;
    }
    public final List component6(){
       return this.cycleProgressInfos;
    }
    public final Integer component7(){
       return this.processStatus;
    }
    public final List component8(){
       return this.taskStep;
    }
    public final List component9(){
       return this.titleUrl;
    }
    public final FullDeliveryTaskProgress copy(Long p0,String p1,String p2,ProcessInfo p3,RightContent p4,List p5,Integer p6,List p7,List p8,List p9,List p10,long p11,String p12){
       Object obj;
       if (PatchProxy.isSupport(FullDeliveryTaskProgress.class)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = Long.valueOf(p11);
          objArray[12] = p12;
          obj = PatchProxy.apply(objArray, this, FullDeliveryTaskProgress.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       FullDeliveryTaskProgress uFullDeliver = new FullDeliveryTaskProgress(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FullDeliveryTaskProgress.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FullDeliveryTaskProgress && (a.g(this.endTime, p0.endTime) && (a.g(this.endTimePattern, p0.endTimePattern) && (a.g(this.jumpUrl, p0.jumpUrl) && (a.g(this.processInfo, p0.processInfo) && (a.g(this.rightContent, p0.rightContent) && (a.g(this.cycleProgressInfos, p0.cycleProgressInfos) && (a.g(this.processStatus, p0.processStatus) && (a.g(this.taskStep, p0.taskStep) && (a.g(this.titleUrl, p0.titleUrl) && (a.g(this.doneButtonUrl, p0.doneButtonUrl) && (a.g(this.undoneButtonUrl, p0.undoneButtonUrl) && (!this.guideInterval - p0.guideInterval && a.g(this.guideTip, p0.guideTip))))))))))))))) {
          return true;
       }
       return false;
    }
    public final List getCycleProgressInfos(){
       return this.cycleProgressInfos;
    }
    public final List getDoneButtonUrl(){
       return this.doneButtonUrl;
    }
    public final Long getEndTime(){
       return this.endTime;
    }
    public final String getEndTimePattern(){
       return this.endTimePattern;
    }
    public final long getGuideInterval(){
       return this.guideInterval;
    }
    public final String getGuideTip(){
       return this.guideTip;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final ProcessInfo getProcessInfo(){
       return this.processInfo;
    }
    public final Integer getProcessStatus(){
       return this.processStatus;
    }
    public final RightContent getRightContent(){
       return this.rightContent;
    }
    public final List getTaskStep(){
       return this.taskStep;
    }
    public final List getTitleUrl(){
       return this.titleUrl;
    }
    public final List getUndoneButtonUrl(){
       return this.undoneButtonUrl;
    }
    public int hashCode(){
       FullDeliveryTaskProgress obj = PatchProxy.apply(null, this, FullDeliveryTaskProgress.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.endTime;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FullDeliveryTaskProgress tendTimePatt = this.endTimePattern;
       int i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.jumpUrl;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.processInfo;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.rightContent;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.cycleProgressInfos;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.processStatus;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.taskStep;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.titleUrl;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.doneButtonUrl;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendTimePatt = this.undoneButtonUrl;
       i2 = (tendTimePatt != null)? tendTimePatt.hashCode(): 0;
       tendTimePatt = this.guideInterval;
       i1 = (((i1 + i2) * 31) + (int)(tendTimePatt ^ (tendTimePatt >> 32))) * 31;
       tendTimePatt = this.guideTip;
       if (tendTimePatt != null) {
          i = tendTimePatt.hashCode();
       }
       return (i1 + i);
    }
    public final void setCycleProgressInfos(List p0){
       this.cycleProgressInfos = p0;
    }
    public final void setDoneButtonUrl(List p0){
       this.doneButtonUrl = p0;
    }
    public final void setEndTime(Long p0){
       this.endTime = p0;
    }
    public final void setEndTimePattern(String p0){
       this.endTimePattern = p0;
    }
    public final void setGuideInterval(long p0){
       this.guideInterval = p0;
    }
    public final void setGuideTip(String p0){
       this.guideTip = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setProcessInfo(ProcessInfo p0){
       this.processInfo = p0;
    }
    public final void setProcessStatus(Integer p0){
       this.processStatus = p0;
    }
    public final void setRightContent(RightContent p0){
       this.rightContent = p0;
    }
    public final void setTaskStep(List p0){
       this.taskStep = p0;
    }
    public final void setTitleUrl(List p0){
       this.titleUrl = p0;
    }
    public final void setUndoneButtonUrl(List p0){
       this.undoneButtonUrl = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FullDeliveryTaskProgress.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FullDeliveryTaskProgress\(endTime="+this.endTime+", endTimePattern="+this.endTimePattern+", jumpUrl="+this.jumpUrl+", processInfo="+this.processInfo+", rightContent="+this.rightContent+", cycleProgressInfos="+this.cycleProgressInfos+", processStatus="+this.processStatus+", taskStep="+this.taskStep+", titleUrl="+this.titleUrl+", doneButtonUrl="+this.doneButtonUrl+", undoneButtonUrl="+this.undoneButtonUrl+", guideInterval="+this.guideInterval+", guideTip="+this.guideTip+"\)";
    }
}

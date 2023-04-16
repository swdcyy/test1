package com.kuaishou.merchant.live.cart.onsale.model.TaskStep;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.model.TaskStep$a;
import nsd.u;
import java.lang.Integer;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TaskStep implements Serializable	// class@0019b9
{
    public List couponDoneUrl;
    public List couponDynamicUrl;
    public List couponUndoneUrl;
    public String statusDesc;
    public Integer stepIndex;
    public Integer stepStatus;
    public List surpriseUrl;
    public String tipContent;
    public String title;
    public static final TaskStep$a Companion;
    public static final long serialVersionUID;

    static {
       TaskStep.Companion = new TaskStep$a(null);
    }
    public void TaskStep(Integer p0,Integer p1,List p2,List p3,List p4,List p5,String p6,String p7,String p8){
       super();
       this.stepIndex = p0;
       this.stepStatus = p1;
       this.couponDoneUrl = p2;
       this.couponDynamicUrl = p3;
       this.couponUndoneUrl = p4;
       this.surpriseUrl = p5;
       this.tipContent = p6;
       this.title = p7;
       this.statusDesc = p8;
    }
    public static TaskStep copy$default(TaskStep p0,Integer p1,Integer p2,List p3,List p4,List p5,List p6,String p7,String p8,String p9,int p10,Object p11){
       TaskStep taskStep = p0;
       int i = p10;
       TaskStep stepIndex = (i & 0x01)? taskStep.stepIndex: p1;
       TaskStep stepStatus = (i & 0x02)? taskStep.stepStatus: p2;
       TaskStep couponDoneUr = (i & 0x04)? taskStep.couponDoneUrl: p3;
       TaskStep couponDynami = (i & 0x08)? taskStep.couponDynamicUrl: p4;
       TaskStep couponUndone = (i & 0x10)? taskStep.couponUndoneUrl: p5;
       TaskStep surpriseUrl = (i & 0x20)? taskStep.surpriseUrl: p6;
       TaskStep tipContent = (i & 0x40)? taskStep.tipContent: p7;
       TaskStep title = (i & 0x0080)? taskStep.title: p8;
       TaskStep statusDesc = (i & 0x0100)? taskStep.statusDesc: p9;
       return p0.copy(stepIndex, stepStatus, couponDoneUr, couponDynami, couponUndone, surpriseUrl, tipContent, title, statusDesc);
    }
    public final Integer component1(){
       return this.stepIndex;
    }
    public final Integer component2(){
       return this.stepStatus;
    }
    public final List component3(){
       return this.couponDoneUrl;
    }
    public final List component4(){
       return this.couponDynamicUrl;
    }
    public final List component5(){
       return this.couponUndoneUrl;
    }
    public final List component6(){
       return this.surpriseUrl;
    }
    public final String component7(){
       return this.tipContent;
    }
    public final String component8(){
       return this.title;
    }
    public final String component9(){
       return this.statusDesc;
    }
    public final TaskStep copy(Integer p0,Integer p1,List p2,List p3,List p4,List p5,String p6,String p7,String p8){
       Object obj;
       if (PatchProxy.isSupport(TaskStep.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, TaskStep.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       TaskStep taskStep = new TaskStep(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskStep.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TaskStep && (a.g(this.stepIndex, p0.stepIndex) && (a.g(this.stepStatus, p0.stepStatus) && (a.g(this.couponDoneUrl, p0.couponDoneUrl) && (a.g(this.couponDynamicUrl, p0.couponDynamicUrl) && (a.g(this.couponUndoneUrl, p0.couponUndoneUrl) && (a.g(this.surpriseUrl, p0.surpriseUrl) && (a.g(this.tipContent, p0.tipContent) && (a.g(this.title, p0.title) && a.g(this.statusDesc, p0.statusDesc))))))))))) {
          return true;
       }
       return false;
    }
    public final List getCouponDoneUrl(){
       return this.couponDoneUrl;
    }
    public final List getCouponDynamicUrl(){
       return this.couponDynamicUrl;
    }
    public final List getCouponUndoneUrl(){
       return this.couponUndoneUrl;
    }
    public final String getStatusDesc(){
       return this.statusDesc;
    }
    public final Integer getStepIndex(){
       return this.stepIndex;
    }
    public final Integer getStepStatus(){
       return this.stepStatus;
    }
    public final List getSurpriseUrl(){
       return this.surpriseUrl;
    }
    public final String getTipContent(){
       return this.tipContent;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       TaskStep obj = PatchProxy.apply(null, this, TaskStep.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.stepIndex;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TaskStep tstepStatus = this.stepStatus;
       int i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.couponDoneUrl;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.couponDynamicUrl;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.couponUndoneUrl;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.surpriseUrl;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.tipContent;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.title;
       i2 = (tstepStatus != null)? tstepStatus.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstepStatus = this.statusDesc;
       if (tstepStatus != null) {
          i = tstepStatus.hashCode();
       }
       return (i1 + i);
    }
    public final void setCouponDoneUrl(List p0){
       this.couponDoneUrl = p0;
    }
    public final void setCouponDynamicUrl(List p0){
       this.couponDynamicUrl = p0;
    }
    public final void setCouponUndoneUrl(List p0){
       this.couponUndoneUrl = p0;
    }
    public final void setStatusDesc(String p0){
       this.statusDesc = p0;
    }
    public final void setStepIndex(Integer p0){
       this.stepIndex = p0;
    }
    public final void setStepStatus(Integer p0){
       this.stepStatus = p0;
    }
    public final void setSurpriseUrl(List p0){
       this.surpriseUrl = p0;
    }
    public final void setTipContent(String p0){
       this.tipContent = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TaskStep.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskStep\(stepIndex="+this.stepIndex+", stepStatus="+this.stepStatus+", couponDoneUrl="+this.couponDoneUrl+", couponDynamicUrl="+this.couponDynamicUrl+", couponUndoneUrl="+this.couponUndoneUrl+", surpriseUrl="+this.surpriseUrl+", tipContent="+this.tipContent+", title="+this.title+", statusDesc="+this.statusDesc+"\)";
    }
}

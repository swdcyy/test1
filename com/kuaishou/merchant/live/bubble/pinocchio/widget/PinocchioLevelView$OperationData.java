package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$OperationData;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PinocchioLevelView$OperationData implements Serializable	// class@0018ee
{
    public final long feedbackDisplayMills;
    public final List surveyChoiceList;
    public final String surveyId;
    public String userSelectedContent;

    public void PinocchioLevelView$OperationData(String p0,long p1,List p2,String p3){
       super();
       this.surveyId = p0;
       this.feedbackDisplayMills = p1;
       this.surveyChoiceList = p2;
       this.userSelectedContent = p3;
    }
    public void PinocchioLevelView$OperationData(String p0,long p1,List p2,String p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static PinocchioLevelView$OperationData copy$default(PinocchioLevelView$OperationData p0,String p1,long p2,List p3,String p4,int p5,Object p6){
       PinocchioLevelView$OperationData surveyId;
       PinocchioLevelView$OperationData operationDat;
       PinocchioLevelView$OperationData surveyChoice;
       PinocchioLevelView$OperationData userSelected;
       if (p5 & 0x01) {
          surveyId = p0.surveyId;
       }
       if (p5 & 0x02) {
          operationDat = p0.feedbackDisplayMills;
       }
       PinocchioLevelView$OperationData operationDat1 = operationDat;
       if (p5 & 0x04) {
          surveyChoice = p0.surveyChoiceList;
       }
       p6 = surveyChoice;
       if (p5 & 0x08) {
          userSelected = p0.userSelectedContent;
       }
       return p0.copy(surveyId, operationDat1, p6, userSelected);
    }
    public final String component1(){
       return this.surveyId;
    }
    public final long component2(){
       return this.feedbackDisplayMills;
    }
    public final List component3(){
       return this.surveyChoiceList;
    }
    public final String component4(){
       return this.userSelectedContent;
    }
    public final PinocchioLevelView$OperationData copy(String p0,long p1,List p2,String p3){
       Object obj;
       if (PatchProxy.isSupport(PinocchioLevelView$OperationData.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), p2, p3, this, PinocchioLevelView$OperationData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PinocchioLevelView$OperationData operationDat = new PinocchioLevelView$OperationData(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PinocchioLevelView$OperationData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PinocchioLevelView$OperationData && (a.g(this.surveyId, p0.surveyId) && (!this.feedbackDisplayMills - p0.feedbackDisplayMills && (a.g(this.surveyChoiceList, p0.surveyChoiceList) && a.g(this.userSelectedContent, p0.userSelectedContent)))))) {
          return true;
       }
       return false;
    }
    public final long getFeedbackDisplayMills(){
       return this.feedbackDisplayMills;
    }
    public final List getSurveyChoiceList(){
       return this.surveyChoiceList;
    }
    public final String getSurveyId(){
       return this.surveyId;
    }
    public final String getUserSelectedContent(){
       return this.userSelectedContent;
    }
    public int hashCode(){
       PinocchioLevelView$OperationData obj = PatchProxy.apply(null, this, PinocchioLevelView$OperationData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.surveyId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       PinocchioLevelView$OperationData tOperationDa = this.feedbackDisplayMills;
       i1 = ((i1 * 31) + (int)(tOperationDa ^ (tOperationDa >> 32))) * 31;
       tOperationDa = this.surveyChoiceList;
       int i2 = (tOperationDa != null)? tOperationDa.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tOperationDa = this.userSelectedContent;
       if (tOperationDa != null) {
          i = tOperationDa.hashCode();
       }
       return (i1 + i);
    }
    public final void setUserSelectedContent(String p0){
       this.userSelectedContent = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$OperationData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OperationData\(surveyId="+this.surveyId+", feedbackDisplayMills="+this.feedbackDisplayMills+", surveyChoiceList="+this.surveyChoiceList+", userSelectedContent="+this.userSelectedContent+"\)";
    }
}

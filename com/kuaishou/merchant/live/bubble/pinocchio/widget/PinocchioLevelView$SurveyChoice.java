package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$SurveyChoice;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PinocchioLevelView$SurveyChoice implements Serializable	// class@0018ef
{
    public final String choiceFeedbackButtonName;
    public final String choiceFeedbackContent;
    public final String choiceFeedbackTitle;
    public final int choiceId;
    public final String choiceImgUrl;
    public final String choiceName;
    public final List surveyChoiceTagList;

    public void PinocchioLevelView$SurveyChoice(int p0,String p1,String p2,String p3,String p4,String p5,List p6){
       super();
       this.choiceId = p0;
       this.choiceName = p1;
       this.choiceImgUrl = p2;
       this.choiceFeedbackTitle = p3;
       this.choiceFeedbackContent = p4;
       this.choiceFeedbackButtonName = p5;
       this.surveyChoiceTagList = p6;
    }
    public void PinocchioLevelView$SurveyChoice(int p0,String p1,String p2,String p3,String p4,String p5,List p6,int p7,u p8){
       String str = (p7 & 0x02)? "": p1;
       String str1 = (p7 & 0x04)? "": p2;
       String str2 = (p7 & 0x08)? "": p3;
       String str3 = (p7 & 0x10)? "": p4;
       String str4 = (p7 & 0x20)? "": p5;
       super(p0, str, str1, str2, str3, str4, p6);
       return;
    }
    public static PinocchioLevelView$SurveyChoice copy$default(PinocchioLevelView$SurveyChoice p0,int p1,String p2,String p3,String p4,String p5,String p6,List p7,int p8,Object p9){
       PinocchioLevelView$SurveyChoice choiceId;
       PinocchioLevelView$SurveyChoice choiceName;
       PinocchioLevelView$SurveyChoice choiceImgUrl;
       PinocchioLevelView$SurveyChoice choiceFeedba;
       PinocchioLevelView$SurveyChoice choiceFeedba1;
       PinocchioLevelView$SurveyChoice choiceFeedba2;
       PinocchioLevelView$SurveyChoice surveyChoice4;
       if (p8 & 0x01) {
          choiceId = p0.choiceId;
       }
       if (p8 & 0x02) {
          choiceName = p0.choiceName;
       }
       p9 = choiceName;
       if (p8 & 0x04) {
          choiceImgUrl = p0.choiceImgUrl;
       }
       PinocchioLevelView$SurveyChoice surveyChoice = choiceImgUrl;
       if (p8 & 0x08) {
          choiceFeedba = p0.choiceFeedbackTitle;
       }
       PinocchioLevelView$SurveyChoice surveyChoice1 = choiceFeedba;
       if (p8 & 0x10) {
          choiceFeedba1 = p0.choiceFeedbackContent;
       }
       PinocchioLevelView$SurveyChoice surveyChoice2 = choiceFeedba1;
       if (p8 & 0x20) {
          choiceFeedba2 = p0.choiceFeedbackButtonName;
       }
       PinocchioLevelView$SurveyChoice surveyChoice3 = choiceFeedba2;
       if (p8 & 0x40) {
          surveyChoice4 = p0.surveyChoiceTagList;
       }
       return p0.copy(choiceId, p9, surveyChoice, surveyChoice1, surveyChoice2, surveyChoice3, surveyChoice4);
    }
    public final int component1(){
       return this.choiceId;
    }
    public final String component2(){
       return this.choiceName;
    }
    public final String component3(){
       return this.choiceImgUrl;
    }
    public final String component4(){
       return this.choiceFeedbackTitle;
    }
    public final String component5(){
       return this.choiceFeedbackContent;
    }
    public final String component6(){
       return this.choiceFeedbackButtonName;
    }
    public final List component7(){
       return this.surveyChoiceTagList;
    }
    public final PinocchioLevelView$SurveyChoice copy(int p0,String p1,String p2,String p3,String p4,String p5,List p6){
       Object obj;
       if (PatchProxy.isSupport(PinocchioLevelView$SurveyChoice.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, PinocchioLevelView$SurveyChoice.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       PinocchioLevelView$SurveyChoice surveyChoice = new PinocchioLevelView$SurveyChoice(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PinocchioLevelView$SurveyChoice.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PinocchioLevelView$SurveyChoice && (this.choiceId == p0.choiceId && (a.g(this.choiceName, p0.choiceName) && (a.g(this.choiceImgUrl, p0.choiceImgUrl) && (a.g(this.choiceFeedbackTitle, p0.choiceFeedbackTitle) && (a.g(this.choiceFeedbackContent, p0.choiceFeedbackContent) && (a.g(this.choiceFeedbackButtonName, p0.choiceFeedbackButtonName) && a.g(this.surveyChoiceTagList, p0.surveyChoiceTagList))))))))) {
          return true;
       }
       return false;
    }
    public final String getChoiceFeedbackButtonName(){
       return this.choiceFeedbackButtonName;
    }
    public final String getChoiceFeedbackContent(){
       return this.choiceFeedbackContent;
    }
    public final String getChoiceFeedbackTitle(){
       return this.choiceFeedbackTitle;
    }
    public final int getChoiceId(){
       return this.choiceId;
    }
    public final String getChoiceImgUrl(){
       return this.choiceImgUrl;
    }
    public final String getChoiceName(){
       return this.choiceName;
    }
    public final List getSurveyChoiceTagList(){
       return this.surveyChoiceTagList;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$SurveyChoice.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.choiceId * 31;
       PinocchioLevelView$SurveyChoice tchoiceName = this.choiceName;
       int i1 = 0;
       int i2 = (tchoiceName != null)? tchoiceName.hashCode(): 0;
       i = (i + i2) * 31;
       tchoiceName = this.choiceImgUrl;
       i2 = (tchoiceName != null)? tchoiceName.hashCode(): 0;
       i = (i + i2) * 31;
       tchoiceName = this.choiceFeedbackTitle;
       i2 = (tchoiceName != null)? tchoiceName.hashCode(): 0;
       i = (i + i2) * 31;
       tchoiceName = this.choiceFeedbackContent;
       i2 = (tchoiceName != null)? tchoiceName.hashCode(): 0;
       i = (i + i2) * 31;
       tchoiceName = this.choiceFeedbackButtonName;
       i2 = (tchoiceName != null)? tchoiceName.hashCode(): 0;
       i = (i + i2) * 31;
       tchoiceName = this.surveyChoiceTagList;
       if (tchoiceName != null) {
          i1 = tchoiceName.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$SurveyChoice.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SurveyChoice\(choiceId="+this.choiceId+", choiceName="+this.choiceName+", choiceImgUrl="+this.choiceImgUrl+", choiceFeedbackTitle="+this.choiceFeedbackTitle+", choiceFeedbackContent="+this.choiceFeedbackContent+", choiceFeedbackButtonName="+this.choiceFeedbackButtonName+", surveyChoiceTagList="+this.surveyChoiceTagList+"\)";
    }
}

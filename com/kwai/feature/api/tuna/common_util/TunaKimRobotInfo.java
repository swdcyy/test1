package com.kwai.feature.api.tuna.common_util.TunaKimRobotInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TunaKimRobotInfo implements Serializable	// class@0011cc
{
    public final String contentMessage;
    public final Throwable contentThrowable;
    public final String feedbackFT;
    public final String feedbackUser;

    public void TunaKimRobotInfo(String p0,String p1,String p2,Throwable p3){
       a.p(p0, "feedbackUser");
       a.p(p1, "feedbackFT");
       super();
       this.feedbackUser = p0;
       this.feedbackFT = p1;
       this.contentMessage = p2;
       this.contentThrowable = p3;
    }
    public void TunaKimRobotInfo(String p0,String p1,String p2,Throwable p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static TunaKimRobotInfo copy$default(TunaKimRobotInfo p0,String p1,String p2,String p3,Throwable p4,int p5,Object p6){
       TunaKimRobotInfo tunaKimRobot;
       TunaKimRobotInfo tunaKimRobot1;
       TunaKimRobotInfo contentMessa;
       TunaKimRobotInfo contentThrow;
       if (p5 & 0x01) {
          tunaKimRobot = p0.feedbackUser;
       }
       if (p5 & 0x02) {
          tunaKimRobot1 = p0.feedbackFT;
       }
       if (p5 & 0x04) {
          contentMessa = p0.contentMessage;
       }
       if (p5 & 0x08) {
          contentThrow = p0.contentThrowable;
       }
       return p0.copy(tunaKimRobot, tunaKimRobot1, contentMessa, contentThrow);
    }
    public final String component1(){
       return this.feedbackUser;
    }
    public final String component2(){
       return this.feedbackFT;
    }
    public final String component3(){
       return this.contentMessage;
    }
    public final Throwable component4(){
       return this.contentThrowable;
    }
    public final TunaKimRobotInfo copy(String p0,String p1,String p2,Throwable p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TunaKimRobotInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feedbackUser");
       a.p(p1, "feedbackFT");
       return new TunaKimRobotInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaKimRobotInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TunaKimRobotInfo && (a.g(this.feedbackUser, p0.feedbackUser) && (a.g(this.feedbackFT, p0.feedbackFT) && (a.g(this.contentMessage, p0.contentMessage) && a.g(this.contentThrowable, p0.contentThrowable)))))) {
          return true;
       }
       return false;
    }
    public final String getContentMessage(){
       return this.contentMessage;
    }
    public final Throwable getContentThrowable(){
       return this.contentThrowable;
    }
    public final String getFeedbackFT(){
       return this.feedbackFT;
    }
    public final String getFeedbackUser(){
       return this.feedbackUser;
    }
    public int hashCode(){
       TunaKimRobotInfo obj = PatchProxy.apply(null, this, TunaKimRobotInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.feedbackUser;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TunaKimRobotInfo tTunaKimRobo = this.feedbackFT;
       int i2 = (tTunaKimRobo != null)? tTunaKimRobo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tTunaKimRobo = this.contentMessage;
       i2 = (tTunaKimRobo != null)? tTunaKimRobo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tTunaKimRobo = this.contentThrowable;
       if (tTunaKimRobo != null) {
          i = tTunaKimRobo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TunaKimRobotInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TunaKimRobotInfo\(feedbackUser="+this.feedbackUser+", feedbackFT="+this.feedbackFT+", contentMessage="+this.contentMessage+", contentThrowable="+this.contentThrowable+"\)";
    }
}
